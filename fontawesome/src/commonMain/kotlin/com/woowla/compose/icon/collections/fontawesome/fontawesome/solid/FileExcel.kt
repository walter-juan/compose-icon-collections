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

public val SolidGroup.FileExcel: ImageVector
    get() {
        if (_fileExcel != null) {
            return _fileExcel!!
        }
        _fileExcel = Builder(name = "FileExcel", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 64.0f)
                curveTo(0.0f, 28.7f, 28.7f, 0.0f, 64.0f, 0.0f)
                lineTo(213.5f, 0.0f)
                curveToRelative(17.0f, 0.0f, 33.3f, 6.7f, 45.3f, 18.7f)
                lineTo(365.3f, 125.3f)
                curveToRelative(12.0f, 12.0f, 18.7f, 28.3f, 18.7f, 45.3f)
                lineTo(384.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 64.0f)
                close()
                moveTo(208.0f, 58.5f)
                lineToRelative(0.0f, 93.5f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                lineTo(325.5f, 176.0f)
                lineTo(208.0f, 58.5f)
                close()
                moveTo(164.0f, 266.7f)
                curveToRelative(-7.4f, -11.0f, -22.3f, -14.0f, -33.3f, -6.7f)
                reflectiveCurveToRelative(-14.0f, 22.3f, -6.7f, 33.3f)
                lineTo(163.2f, 352.0f)
                lineTo(124.0f, 410.7f)
                curveToRelative(-7.4f, 11.0f, -4.4f, 25.9f, 6.7f, 33.3f)
                reflectiveCurveToRelative(25.9f, 4.4f, 33.3f, -6.7f)
                lineToRelative(28.0f, -42.0f)
                lineToRelative(28.0f, 42.0f)
                curveToRelative(7.4f, 11.0f, 22.3f, 14.0f, 33.3f, 6.7f)
                reflectiveCurveToRelative(14.0f, -22.3f, 6.7f, -33.3f)
                lineTo(220.8f, 352.0f)
                lineTo(260.0f, 293.3f)
                curveToRelative(7.4f, -11.0f, 4.4f, -25.9f, -6.7f, -33.3f)
                reflectiveCurveToRelative(-25.9f, -4.4f, -33.3f, 6.7f)
                lineToRelative(-28.0f, 42.0f)
                lineToRelative(-28.0f, -42.0f)
                close()
            }
        }
        .build()
        return _fileExcel!!
    }

private var _fileExcel: ImageVector? = null
