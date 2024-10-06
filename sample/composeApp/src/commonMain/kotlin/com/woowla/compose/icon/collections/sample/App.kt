package com.woowla.compose.icon.collections.sample

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.ChipDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.FilterChip
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.filled.Done
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.AllIcons
import com.woowla.compose.icon.collections.octicons.Octicons
import com.woowla.compose.icon.collections.tabler.Tabler
import com.woowla.compose.icon.collections.tabler.tabler.AllIcons
import com.woowla.compose.icon.collections.tabler.tabler.Filled
import com.woowla.compose.icon.collections.tabler.tabler.Outline
import com.woowla.compose.icons.sample.IconPack
import compose_icon_collections.sample.composeapp.generated.resources.Res
import compose_icon_collections.sample.composeapp.generated.resources.compose_multiplatform
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(
    content: @Composable BoxScope.(listState: LazyListState) -> Unit = {}
) {
    MaterialTheme {
        val listState = rememberLazyListState()

        val searchText = remember { mutableStateOf("") }
        val selectedIconPack = remember { mutableStateOf(IconPack.Octicons) }
        val allIcons = remember { mutableListOf<ImageVector>().apply { addAll(Octicons.AllIcons) } }
        val allIconsSize =  remember { mutableStateOf(0) }
        val filteredIcons = remember { mutableStateListOf<ImageVector>().apply { addAll(Octicons.AllIcons) } }
        val filteredIconsSize =  remember { mutableStateOf(0) }

        LaunchedEffect("${selectedIconPack.value.name}-${searchText.value}") {
            withContext(Dispatchers.Default) {
                allIcons.clear()
                allIcons.addAll(
                    when(selectedIconPack.value) {
                        IconPack.Octicons -> Octicons.AllIcons
                        IconPack.TablerFilled -> Tabler.Filled.AllIcons
                        IconPack.TablerOutline -> Tabler.Outline.AllIcons
                    }
                )
                allIconsSize.value = allIcons.count()
                filteredIcons.clear()
                filteredIcons.addAll(
                    allIcons
                        .filter {
                            if (searchText.value.isNotBlank()) {
                                it.name.lowercase().contains(searchText.value.lowercase())
                            } else {
                                true
                            }
                        }
                        .sortedBy { icon ->
                            icon.name
                        }
                )
                filteredIconsSize.value = filteredIcons.size
            }
        }

        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Icons(
                selectedIconPack = selectedIconPack.value,
                searchText = searchText.value,
                filteredIcons = filteredIcons,
                filteredIconsSize = filteredIconsSize.value,
                allIconsSize = allIconsSize.value,
                onSelectIconPack = { selectedIconPack.value = it },
                onSearchTextChanged = { searchText.value = it },
                listState = listState,
            )
            content(listState)
        }
    }
}


@Composable
fun Icons(
    selectedIconPack: IconPack,
    searchText: String,
    filteredIcons: List<ImageVector>,
    filteredIconsSize: Int,
    allIconsSize: Int,
    onSelectIconPack: (IconPack) -> Unit,
    onSearchTextChanged: (String) -> Unit,
    listState: LazyListState = rememberLazyListState(),
) {
    LazyColumn(
        state = listState,
        modifier = Modifier
            .widthIn(max = 800.dp)
            .padding(25.dp)
    ) {
        item {
            Header()
            Spacer(modifier = Modifier.height(20.dp))
        }
        item {
            IconPacks(
                selectedIconPack = selectedIconPack,
                onSelectIconPack = onSelectIconPack,
            )
            Spacer(modifier = Modifier.height(20.dp))
        }
        item {
            Search(
                selectedIconPack = selectedIconPack,
                searchText = searchText,
                filteredIconsSize = filteredIconsSize,
                allIconsSize = allIconsSize,
                onSearchTextChanged = onSearchTextChanged,
            )
            Spacer(modifier = Modifier.height(20.dp))
        }
        items(filteredIcons.chunked(2)) { icons ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Min)
            ) {
                icons.forEach { icon ->
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .border(1.dp, Color.Black)
                            .padding(4.dp)
                            .fillMaxHeight()
                            .weight(1F)
                    ) {
                        Icon(imageVector = icon, contentDescription = null)
                        Spacer(modifier = Modifier.width(4.dp))
                        Text("${selectedIconPack.packName}.${icon.name}")
                    }
                }
            }

        }
    }
}

@Composable
fun Header() {
    Column(Modifier.fillMaxWidth()) {
        Image(
            painterResource(Res.drawable.compose_multiplatform),
            contentDescription = null,
            modifier = Modifier.size(50.dp)
        )
        Text("Compose Multiplatform open source icons packs (${getPlatformName()})", modifier = Modifier.wrapContentWidth())
    }
}

@Composable
fun IconPacks(selectedIconPack: IconPack, onSelectIconPack: (IconPack) -> Unit) {
    Row(modifier = Modifier.fillMaxWidth()) {
        IconPack.entries.forEach { iconPack ->
            IconPackFilterChip(
                text = iconPack.name,
                selected = selectedIconPack == iconPack,
                iconPack = iconPack,
                onSelect = onSelectIconPack
            )
            Spacer(modifier = Modifier.width(5.dp))
        }
    }
}

@Composable
fun Search(
    selectedIconPack: IconPack,
    searchText: String,
    filteredIconsSize: Int,
    allIconsSize: Int,
    onSearchTextChanged: (String) -> Unit,
) {
    TextField(
        value = searchText,
        onValueChange = onSearchTextChanged,
        label = { Text("Search") },
    )
    Spacer(modifier = Modifier.height(20.dp))
    Text("${selectedIconPack.name} icon pack, showing $filteredIconsSize from a total of $allIconsSize")
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun IconPackFilterChip(
    text: String,
    selected: Boolean,
    iconPack: IconPack,
    onSelect: (IconPack) -> Unit,
) {
    FilterChip(
        selected = selected,
        onClick = { onSelect(iconPack) },
        leadingIcon =
        if (selected) {
            {
                Icon(
                    imageVector = androidx.compose.material.icons.Icons.Filled.Done,
                    contentDescription = null,
                    modifier = Modifier.size(ChipDefaults.LeadingIconSize)
                )
            }
        } else {
            null
        }
    ) {
        Text(text)
    }
}
