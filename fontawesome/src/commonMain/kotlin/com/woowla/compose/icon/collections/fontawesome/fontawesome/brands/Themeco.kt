package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Themeco: ImageVector
    get() {
        if (_themeco != null) {
            return _themeco!!
        }
        _themeco = Builder(name = "Themeco", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(202.9f, 8.4f)
                curveToRelative(9.9f, -5.7f, 26.0f, -5.8f, 36.0f, -0.2f)
                lineTo(430.0f, 115.9f)
                curveToRelative(10.0f, 5.6f, 18.0f, 19.4f, 18.0f, 30.9f)
                lineTo(448.0f, 364.0f)
                curveToRelative(0.0f, 11.4f, -8.1f, 25.3f, -18.0f, 31.0f)
                lineTo(238.8f, 503.7f)
                curveToRelative(-9.9f, 5.7f, -26.0f, 5.6f, -35.8f, -0.2f)
                lineTo(17.9f, 395.1f)
                curveTo(8.0f, 389.3f, 0.0f, 375.4f, 0.0f, 364.0f)
                lineTo(0.0f, 146.7f)
                curveToRelative(0.0f, -11.4f, 8.0f, -25.4f, 17.9f, -31.1f)
                lineTo(202.9f, 8.4f)
                close()
                moveTo(125.5f, 208.3f)
                curveToRelative(-15.9f, 0.0f, -31.9f, 0.1f, -47.8f, 0.1f)
                lineToRelative(0.0f, 101.4f)
                lineToRelative(19.1f, 0.0f)
                lineToRelative(0.0f, -29.8f)
                lineToRelative(28.7f, 0.0f)
                curveToRelative(49.7f, 0.0f, 49.6f, -71.7f, 0.0f, -71.7f)
                close()
                moveTo(265.6f, 308.6f)
                lineToRelative(-30.7f, -34.6f)
                curveToRelative(37.0f, -7.5f, 34.8f, -65.2f, -10.9f, -65.5f)
                curveToRelative(-16.1f, 0.0f, -32.2f, -0.1f, -48.3f, -0.1f)
                lineToRelative(0.0f, 101.6f)
                lineToRelative(19.1f, 0.0f)
                lineToRelative(0.0f, -33.9f)
                lineToRelative(18.4f, 0.0f)
                lineToRelative(29.6f, 33.9f)
                lineToRelative(22.8f, 0.0f)
                lineToRelative(0.0f, -1.3f)
                close()
                moveTo(224.0f, 226.3f)
                curveToRelative(23.3f, 0.0f, 23.3f, 32.5f, 0.0f, 32.5f)
                lineToRelative(-29.1f, 0.0f)
                lineToRelative(0.0f, -32.5f)
                lineToRelative(29.1f, 0.0f)
                close()
                moveTo(128.4f, 224.7f)
                curveToRelative(21.2f, 0.0f, 21.1f, 38.9f, 0.0f, 38.9f)
                lineToRelative(-32.3f, 0.0f)
                lineToRelative(0.0f, -38.8f)
                lineToRelative(32.3f, 0.0f)
                close()
                moveTo(321.0f, 206.5f)
                curveToRelative(-68.5f, 0.0f, -71.0f, 105.8f, 0.0f, 105.8f)
                curveToRelative(69.5f, 0.0f, 69.4f, -105.8f, 0.0f, -105.8f)
                close()
                moveTo(321.0f, 223.9f)
                curveToRelative(44.1f, 0.0f, 44.8f, 70.9f, 0.0f, 70.9f)
                reflectiveCurveToRelative(-44.4f, -70.9f, 0.0f, -70.9f)
                close()
            }
        }
        .build()
        return _themeco!!
    }

private var _themeco: ImageVector? = null
