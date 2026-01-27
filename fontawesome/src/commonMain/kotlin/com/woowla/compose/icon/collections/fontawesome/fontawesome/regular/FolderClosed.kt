package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.FolderClosed: ImageVector
    get() {
        if (_folderClosed != null) {
            return _folderClosed!!
        }
        _folderClosed = Builder(name = "FolderClosed", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 400.0f)
                lineTo(64.0f, 400.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineToRelative(0.0f, -144.0f)
                lineToRelative(416.0f, 0.0f)
                lineToRelative(0.0f, 144.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                close()
                moveTo(464.0f, 192.0f)
                lineToRelative(-416.0f, 0.0f)
                lineToRelative(0.0f, -96.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                lineToRelative(138.7f, 0.0f)
                curveToRelative(3.5f, 0.0f, 6.8f, 1.1f, 9.6f, 3.2f)
                lineTo(250.7f, 112.0f)
                curveToRelative(13.8f, 10.4f, 30.7f, 16.0f, 48.0f, 16.0f)
                lineTo(448.0f, 128.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                lineToRelative(0.0f, 48.0f)
                close()
                moveTo(64.0f, 448.0f)
                lineToRelative(384.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -240.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(298.7f, 80.0f)
                curveToRelative(-6.9f, 0.0f, -13.7f, -2.2f, -19.2f, -6.4f)
                lineTo(241.1f, 44.8f)
                curveTo(230.0f, 36.5f, 216.5f, 32.0f, 202.7f, 32.0f)
                lineTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 384.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                close()
            }
        }
        .build()
        return _folderClosed!!
    }

private var _folderClosed: ImageVector? = null
