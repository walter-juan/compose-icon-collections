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

public val BrandsGroup.SquareDeskpro: ImageVector
    get() {
        if (_squareDeskpro != null) {
            return _squareDeskpro!!
        }
        _squareDeskpro = Builder(name = "SquareDeskpro", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(408.8f, 32.0f)
                curveTo(430.4f, 32.0f, 448.0f, 49.6f, 448.0f, 71.2f)
                lineToRelative(0.0f, 369.6f)
                curveToRelative(0.0f, 21.6f, -17.6f, 39.2f, -39.2f, 39.2f)
                lineTo(39.2f, 480.0f)
                curveTo(17.6f, 480.0f, 0.0f, 462.4f, 0.0f, 440.8f)
                lineTo(0.0f, 71.2f)
                curveTo(0.0f, 49.6f, 17.6f, 32.0f, 39.2f, 32.0f)
                lineToRelative(369.6f, 0.0f)
                close()
                moveTo(110.9f, 274.1f)
                lineToRelative(0.0f, 114.4f)
                lineToRelative(89.1f, -0.1f)
                curveToRelative(20.6f, 0.0f, 39.4f, -3.2f, 56.3f, -9.5f)
                reflectiveCurveToRelative(31.3f, -15.4f, 43.2f, -27.0f)
                curveToRelative(12.2f, -11.9f, 21.6f, -26.0f, 28.2f, -42.1f)
                curveToRelative(4.6f, -11.1f, 7.7f, -23.0f, 9.2f, -35.7f)
                lineToRelative(-43.8f, 0.0f)
                curveToRelative(-1.1f, 6.4f, -2.8f, 12.4f, -5.1f, 18.2f)
                curveToRelative(-4.2f, 10.9f, -10.3f, 20.3f, -18.2f, 28.2f)
                curveToRelative(-7.9f, 7.7f, -17.4f, 13.7f, -28.6f, 17.9f)
                curveToRelative(-11.1f, 4.3f, -23.5f, 6.4f, -37.3f, 6.4f)
                lineToRelative(-50.0f, 0.0f)
                lineToRelative(0.0f, -70.6f)
                lineToRelative(-43.0f, 0.1f)
                close()
                moveTo(110.9f, 122.7f)
                lineToRelative(0.0f, 114.4f)
                lineToRelative(43.0f, -0.1f)
                lineToRelative(0.0f, -70.7f)
                lineToRelative(50.0f, 0.0f)
                curveToRelative(13.7f, 0.0f, 26.2f, 2.1f, 37.3f, 6.4f)
                curveToRelative(11.1f, 4.3f, 20.6f, 10.3f, 28.6f, 18.3f)
                curveToRelative(7.9f, 7.7f, 14.0f, 17.1f, 18.2f, 28.2f)
                curveToRelative(2.3f, 5.6f, 4.0f, 11.5f, 5.1f, 17.8f)
                lineToRelative(43.9f, 0.1f)
                curveToRelative(-1.4f, -12.6f, -4.4f, -24.4f, -8.9f, -35.3f)
                curveToRelative(-6.6f, -16.4f, -16.0f, -30.5f, -28.1f, -42.2f)
                curveToRelative(-12.1f, -11.9f, -26.7f, -21.1f, -43.6f, -27.5f)
                curveToRelative(-16.9f, -6.4f, -35.7f, -9.5f, -56.3f, -9.5f)
                lineToRelative(-89.0f, 0.1f)
                close()
            }
        }
        .build()
        return _squareDeskpro!!
    }

private var _squareDeskpro: ImageVector? = null
