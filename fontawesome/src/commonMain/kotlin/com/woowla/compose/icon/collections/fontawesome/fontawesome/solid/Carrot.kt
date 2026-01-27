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

public val SolidGroup.Carrot: ImageVector
    get() {
        if (_carrot != null) {
            return _carrot!!
        }
        _carrot = Builder(name = "Carrot", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(453.1f, -36.7f)
                lineTo(440.9f, -24.6f)
                curveToRelative(-31.2f, 31.2f, -31.2f, 81.9f, 0.0f, 113.1f)
                curveToRelative(15.6f, 15.6f, 31.2f, 31.2f, 46.9f, 46.9f)
                curveToRelative(31.2f, 31.2f, 81.9f, 31.2f, 113.1f, 0.0f)
                lineToRelative(12.1f, -12.1f)
                curveToRelative(6.2f, -6.2f, 6.2f, -16.4f, 0.0f, -22.6f)
                lineTo(600.9f, 88.6f)
                curveToRelative(-31.2f, -31.2f, -81.9f, -31.2f, -113.1f, 0.0f)
                curveToRelative(31.2f, -31.2f, 31.2f, -81.9f, 0.0f, -113.1f)
                lineTo(475.7f, -36.7f)
                curveToRelative(-6.2f, -6.2f, -16.4f, -6.2f, -22.6f, 0.0f)
                close()
                moveTo(331.6f, 96.0f)
                curveToRelative(-45.2f, 0.0f, -87.1f, 20.4f, -115.0f, 54.3f)
                lineTo(273.3f, 207.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(-24.6f, 9.4f, -33.9f, 0.0f)
                lineTo(191.6f, 193.2f)
                lineTo(67.2f, 466.8f)
                curveToRelative(-5.5f, 12.1f, -2.9f, 26.4f, 6.5f, 35.9f)
                reflectiveCurveToRelative(23.7f, 12.0f, 35.9f, 6.5f)
                lineToRelative(141.6f, -64.4f)
                lineToRelative(-43.8f, -43.8f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(56.5f, 56.5f)
                lineToRelative(95.3f, -43.3f)
                curveToRelative(53.1f, -24.1f, 87.2f, -77.1f, 87.2f, -135.5f)
                curveToRelative(0.0f, -82.2f, -66.6f, -148.8f, -148.8f, -148.8f)
                close()
            }
        }
        .build()
        return _carrot!!
    }

private var _carrot: ImageVector? = null
