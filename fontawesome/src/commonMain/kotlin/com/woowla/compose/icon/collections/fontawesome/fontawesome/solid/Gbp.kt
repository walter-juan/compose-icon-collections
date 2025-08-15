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

public val SolidGroup.Gbp: ImageVector
    get() {
        if (_gbp != null) {
            return _gbp!!
        }
        _gbp = Builder(name = "Gbp", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(91.3f, 288.0f)
                lineToRelative(-34.8f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                lineToRelative(21.4f, 0.0f)
                curveTo(37.3f, 147.3f, 105.1f, 42.0f, 207.6f, 42.0f)
                lineToRelative(8.2f, 0.0f)
                curveToRelative(33.6f, 0.0f, 66.2f, 11.3f, 92.5f, 32.2f)
                lineToRelative(16.1f, 12.7f)
                curveToRelative(13.9f, 11.0f, 16.2f, 31.1f, 5.2f, 45.0f)
                reflectiveCurveToRelative(-31.1f, 16.2f, -45.0f, 5.2f)
                lineToRelative(-16.1f, -12.7f)
                curveToRelative(-15.0f, -11.9f, -33.6f, -18.4f, -52.8f, -18.4f)
                lineToRelative(-8.2f, 0.0f)
                curveToRelative(-57.3f, 0.0f, -94.7f, 59.9f, -69.7f, 111.4f)
                curveToRelative(3.6f, 7.4f, 6.6f, 14.9f, 9.1f, 22.6f)
                lineToRelative(149.5f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-141.2f, 0.0f)
                curveToRelative(1.0f, 35.3f, -8.7f, 70.6f, -28.9f, 100.9f)
                lineToRelative(-18.1f, 27.1f)
                lineToRelative(212.2f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-272.0f, 0.0f)
                curveToRelative(-11.8f, 0.0f, -22.6f, -6.5f, -28.2f, -16.9f)
                reflectiveCurveToRelative(-5.0f, -23.0f, 1.6f, -32.9f)
                lineToRelative(51.2f, -76.8f)
                curveToRelative(13.1f, -19.6f, 19.2f, -42.6f, 18.2f, -65.4f)
                close()
            }
        }
        .build()
        return _gbp!!
    }

private var _gbp: ImageVector? = null
