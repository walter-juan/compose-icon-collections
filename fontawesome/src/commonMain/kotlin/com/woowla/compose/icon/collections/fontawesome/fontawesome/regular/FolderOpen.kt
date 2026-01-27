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

public val RegularGroup.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = Builder(name = "FolderOpen", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(97.5f, 400.0f)
                lineToRelative(50.0f, -160.0f)
                lineToRelative(379.4f, 0.0f)
                lineToRelative(-50.0f, 160.0f)
                lineToRelative(-379.4f, 0.0f)
                close()
                moveTo(288.2f, 448.0f)
                lineTo(477.0f, 448.0f)
                curveToRelative(21.0f, 0.0f, 39.6f, -13.6f, 45.8f, -33.7f)
                lineToRelative(50.0f, -160.0f)
                curveToRelative(9.7f, -30.9f, -13.4f, -62.3f, -45.8f, -62.3f)
                lineToRelative(-379.4f, 0.0f)
                curveToRelative(-21.0f, 0.0f, -39.6f, 13.6f, -45.8f, 33.7f)
                lineTo(80.2f, 294.4f)
                lineTo(80.2f, 96.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                lineToRelative(138.7f, 0.0f)
                curveToRelative(3.5f, 0.0f, 6.8f, 1.1f, 9.6f, 3.2f)
                lineTo(282.9f, 112.0f)
                curveToRelative(13.8f, 10.4f, 30.7f, 16.0f, 48.0f, 16.0f)
                lineToRelative(117.3f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(330.9f, 80.0f)
                curveToRelative(-6.9f, 0.0f, -13.7f, -2.2f, -19.2f, -6.4f)
                lineTo(273.3f, 44.8f)
                curveTo(262.2f, 36.5f, 248.8f, 32.0f, 234.9f, 32.0f)
                lineTo(96.2f, 32.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                lineToRelative(0.0f, 288.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(192.0f, 0.0f)
                close()
            }
        }
        .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
