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

public val SolidGroup.FeatherAlt: ImageVector
    get() {
        if (_featherAlt != null) {
            return _featherAlt!!
        }
        _featherAlt = Builder(name = "FeatherAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(475.3f, 0.1f)
                curveToRelative(9.9f, -0.8f, 19.6f, 3.0f, 26.6f, 10.0f)
                reflectiveCurveToRelative(10.8f, 16.7f, 10.0f, 26.6f)
                curveToRelative(-4.0f, 49.3f, -17.4f, 126.2f, -46.3f, 199.7f)
                curveToRelative(-1.8f, 4.5f, -5.5f, 7.9f, -10.2f, 9.3f)
                lineTo(374.5f, 270.0f)
                curveToRelative(-3.9f, 1.2f, -6.5f, 4.7f, -6.5f, 8.8f)
                curveToRelative(0.0f, 5.1f, 4.1f, 9.2f, 9.2f, 9.2f)
                lineToRelative(38.6f, 0.0f)
                curveToRelative(12.0f, 0.0f, 19.7f, 12.8f, 13.5f, 23.1f)
                curveToRelative(-4.0f, 6.7f, -8.3f, 13.2f, -12.7f, 19.6f)
                curveToRelative(-2.0f, 2.9f, -5.0f, 5.0f, -8.4f, 6.1f)
                lineTo(310.5f, 366.0f)
                curveToRelative(-3.9f, 1.2f, -6.5f, 4.7f, -6.5f, 8.8f)
                curveToRelative(0.0f, 5.1f, 4.1f, 9.2f, 9.2f, 9.2f)
                lineToRelative(16.0f, 0.0f)
                curveToRelative(14.6f, 0.0f, 21.0f, 17.4f, 8.8f, 25.4f)
                curveToRelative(-68.0f, 45.0f, -137.7f, 43.3f, -182.4f, 31.3f)
                curveToRelative(-12.7f, -3.4f, -24.0f, -9.9f, -34.4f, -17.9f)
                lineTo(48.0f, 496.0f)
                curveToRelative(-8.8f, 8.8f, -23.2f, 8.8f, -32.0f, 0.0f)
                reflectiveCurveToRelative(-8.8f, -23.2f, 0.0f, -32.0f)
                lineToRelative(80.0f, -80.0f)
                lineToRelative(0.5f, 0.5f)
                curveToRelative(0.7f, -1.3f, 1.6f, -2.5f, 2.7f, -3.6f)
                lineTo(256.0f, 224.0f)
                curveToRelative(8.8f, -8.8f, 8.8f, -23.2f, 0.0f, -32.0f)
                reflectiveCurveToRelative(-23.2f, -8.8f, -32.0f, 0.0f)
                lineTo(89.7f, 326.2f)
                curveToRelative(-8.9f, 8.9f, -24.0f, 4.4f, -25.0f, -8.2f)
                curveToRelative(-4.3f, -53.2f, 9.3f, -123.1f, 72.6f, -186.4f)
                curveToRelative(91.1f, -91.1f, 254.2f, -124.7f, 337.9f, -131.5f)
                close()
            }
        }
        .build()
        return _featherAlt!!
    }

private var _featherAlt: ImageVector? = null
