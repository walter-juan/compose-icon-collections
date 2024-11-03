package com.woowla.compose.icon.collections.sample

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.AllIcons
import com.woowla.compose.icon.collections.twbs.Twbs
import compose_icon_collections.sample.composeapp.generated.resources.Res
import compose_icon_collections.sample.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        val scrollableState = rememberLazyStaggeredGridState()
        val icons = remember {
            Twbs.AllIcons.sortedBy { it.name }
        }
        Icons(state = scrollableState, icons = icons)
    }
}

@Composable
fun Icons(state: LazyStaggeredGridState, icons: List<ImageVector>) {
    LazyVerticalStaggeredGrid(
        state = state,
        columns = StaggeredGridCells.Fixed(3),
        modifier = Modifier.padding(10.dp).fillMaxSize(),
    )  {
        item(span = StaggeredGridItemSpan.FullLine) {
            Column {
                Image(
                    painterResource(Res.drawable.compose_multiplatform),
                    contentDescription = null,
                    modifier = Modifier.size(50.dp)
                )
                Text("Compose Multiplatform open source icons packs (${getPlatformName()})", modifier = Modifier.wrapContentWidth())
                Spacer(modifier = Modifier.height(25.dp))
            }
        }
        items(icons) { icon ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(5.dp)
            ) {
                Icon(imageVector = icon, contentDescription = null, modifier = Modifier.size(25.dp))
                Spacer(modifier = Modifier.width(15.dp))
                Text(icon.name)
            }
        }
    }
}