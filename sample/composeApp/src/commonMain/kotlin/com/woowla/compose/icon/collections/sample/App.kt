package com.woowla.compose.icon.collections.sample

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons
import com.woowla.compose.icon.collections.octicons.octicons.DesktopDownload24
import com.woowla.compose.icon.collections.octicons.octicons.GitMerge24
import com.woowla.compose.icon.collections.tabler.Tabler
import com.woowla.compose.icon.collections.tabler.tabler.Filled
import com.woowla.compose.icon.collections.tabler.tabler.Outline
import com.woowla.compose.icon.collections.tabler.tabler.filled.Bookmarks
import com.woowla.compose.icon.collections.tabler.tabler.filled.Eye
import com.woowla.compose.icon.collections.tabler.tabler.outline.Bookmarks
import com.woowla.compose.icon.collections.tabler.tabler.outline.Eye
import compose_icon_collections.sample.composeapp.generated.resources.Res
import compose_icon_collections.sample.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        val icons = listOf(
            Octicons.GitMerge24,
            Octicons.DesktopDownload24,

            Tabler.Outline.Bookmarks,
            Tabler.Outline.Eye,

            Tabler.Filled.Bookmarks,
            Tabler.Filled.Eye,
        )

        Column(
            modifier = Modifier.padding(10.dp).fillMaxSize()
        ) {
            Image(
                painterResource(Res.drawable.compose_multiplatform),
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )
            Text("Compose Multiplatform open source icons packs (${getPlatformName()})", modifier = Modifier.wrapContentWidth())
            Spacer(modifier = Modifier.height(25.dp))
            icons.forEach { icon ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(5.dp)
                ) {
                    Icon(imageVector = icon, contentDescription = null)
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(icon.name)
                }
            }
        }
    }
}