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

public val SolidGroup.Rotate: ImageVector
    get() {
        if (_rotate != null) {
            return _rotate!!
        }
        _rotate = Builder(name = "Rotate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(142.9f, 142.9f)
                curveToRelative(-17.5f, 17.5f, -30.1f, 38.0f, -37.8f, 59.8f)
                curveToRelative(-5.9f, 16.7f, -24.2f, 25.4f, -40.8f, 19.5f)
                reflectiveCurveToRelative(-25.4f, -24.2f, -19.5f, -40.8f)
                curveTo(55.6f, 150.7f, 73.2f, 122.0f, 97.6f, 97.6f)
                curveToRelative(87.2f, -87.2f, 228.3f, -87.5f, 315.8f, -1.0f)
                lineTo(455.0f, 55.0f)
                curveToRelative(6.9f, -6.9f, 17.2f, -8.9f, 26.2f, -5.2f)
                reflectiveCurveToRelative(14.8f, 12.5f, 14.8f, 22.2f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-8.4f, 0.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                lineTo(344.0f, 224.0f)
                curveToRelative(-9.7f, 0.0f, -18.5f, -5.8f, -22.2f, -14.8f)
                reflectiveCurveToRelative(-1.7f, -19.3f, 5.2f, -26.2f)
                lineToRelative(41.1f, -41.1f)
                curveToRelative(-62.6f, -61.5f, -163.1f, -61.2f, -225.3f, 1.0f)
                close()
                moveTo(16.0f, 312.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                lineToRelative(7.6f, 0.0f)
                lineToRelative(0.7f, 0.0f)
                lineTo(168.0f, 288.0f)
                curveToRelative(9.7f, 0.0f, 18.5f, 5.8f, 22.2f, 14.8f)
                reflectiveCurveToRelative(1.7f, 19.3f, -5.2f, 26.2f)
                lineToRelative(-41.1f, 41.1f)
                curveToRelative(62.6f, 61.5f, 163.1f, 61.2f, 225.3f, -1.0f)
                curveToRelative(17.5f, -17.5f, 30.1f, -38.0f, 37.8f, -59.8f)
                curveToRelative(5.9f, -16.7f, 24.2f, -25.4f, 40.8f, -19.5f)
                reflectiveCurveToRelative(25.4f, 24.2f, 19.5f, 40.8f)
                curveToRelative(-10.8f, 30.6f, -28.4f, 59.3f, -52.9f, 83.8f)
                curveToRelative(-87.2f, 87.2f, -228.3f, 87.5f, -315.8f, 1.0f)
                lineTo(57.0f, 457.0f)
                curveToRelative(-6.9f, 6.9f, -17.2f, 8.9f, -26.2f, 5.2f)
                reflectiveCurveTo(16.0f, 449.7f, 16.0f, 440.0f)
                lineToRelative(0.0f, -119.6f)
                lineToRelative(0.0f, -0.7f)
                lineToRelative(0.0f, -7.6f)
                close()
            }
        }
        .build()
        return _rotate!!
    }

private var _rotate: ImageVector? = null
