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
                moveTo(251.7f, 127.6f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(10.5f, 10.5f, 24.7f, 16.4f, 39.6f, 16.4f)
                lineTo(448.0f, 144.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                lineToRelative(0.0f, 32.0f)
                lineTo(48.0f, 192.0f)
                lineToRelative(0.0f, -96.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                lineToRelative(133.5f, 0.0f)
                curveToRelative(4.2f, 0.0f, 8.3f, 1.7f, 11.3f, 4.7f)
                lineToRelative(33.9f, -33.9f)
                lineTo(208.8f, 84.7f)
                lineToRelative(42.9f, 42.9f)
                close()
                moveTo(48.0f, 240.0f)
                lineToRelative(416.0f, 0.0f)
                lineToRelative(0.0f, 176.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(64.0f, 432.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineToRelative(0.0f, -176.0f)
                close()
                moveTo(285.7f, 93.7f)
                lineTo(242.7f, 50.7f)
                curveToRelative(-12.0f, -12.0f, -28.3f, -18.7f, -45.3f, -18.7f)
                lineTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(384.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -256.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(291.3f, 96.0f)
                curveToRelative(-2.1f, 0.0f, -4.2f, -0.8f, -5.7f, -2.3f)
                close()
            }
        }
        .build()
        return _folderClosed!!
    }

private var _folderClosed: ImageVector? = null
