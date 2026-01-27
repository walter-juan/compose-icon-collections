package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = Builder(name = "FolderOpen", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.0f, 225.6f)
                lineTo(32.4f, 296.2f)
                lineTo(32.4f, 96.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineToRelative(138.7f, 0.0f)
                curveToRelative(13.8f, 0.0f, 27.3f, 4.5f, 38.4f, 12.8f)
                lineToRelative(38.4f, 28.8f)
                curveToRelative(5.5f, 4.2f, 12.3f, 6.4f, 19.2f, 6.4f)
                lineToRelative(117.3f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 16.0f)
                lineToRelative(-365.4f, 0.0f)
                curveToRelative(-41.3f, 0.0f, -78.0f, 26.4f, -91.1f, 65.6f)
                close()
                moveTo(477.8f, 448.0f)
                lineTo(99.0f, 448.0f)
                curveToRelative(-32.8f, 0.0f, -55.9f, -32.1f, -45.5f, -63.2f)
                lineToRelative(48.0f, -144.0f)
                curveTo(108.0f, 221.2f, 126.4f, 208.0f, 147.0f, 208.0f)
                lineToRelative(378.8f, 0.0f)
                curveToRelative(32.8f, 0.0f, 55.9f, 32.1f, 45.5f, 63.2f)
                lineToRelative(-48.0f, 144.0f)
                curveToRelative(-6.5f, 19.6f, -24.9f, 32.8f, -45.5f, 32.8f)
                close()
            }
        }
        .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
