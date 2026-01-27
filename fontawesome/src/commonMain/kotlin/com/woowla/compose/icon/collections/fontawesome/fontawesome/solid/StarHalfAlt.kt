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

public val SolidGroup.StarHalfAlt: ImageVector
    get() {
        if (_starHalfAlt != null) {
            return _starHalfAlt!!
        }
        _starHalfAlt = Builder(name = "StarHalfAlt", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.1f, 353.6f)
                curveToRelative(10.0f, 0.0f, 19.9f, 2.3f, 29.0f, 7.0f)
                lineToRelative(74.4f, 37.9f)
                lineToRelative(-13.0f, -82.5f)
                curveToRelative(-3.2f, -20.2f, 3.5f, -40.7f, 17.9f, -55.2f)
                lineToRelative(59.0f, -59.1f)
                lineToRelative(-82.5f, -13.1f)
                curveToRelative(-20.2f, -3.2f, -37.7f, -15.9f, -47.0f, -34.1f)
                lineToRelative(-38.0f, -74.4f)
                lineToRelative(0.0f, 273.6f)
                close()
                moveTo(457.4f, 489.0f)
                curveToRelative(-7.3f, 5.3f, -17.0f, 6.1f, -25.0f, 2.0f)
                lineTo(288.1f, 417.6f)
                lineTo(143.8f, 491.0f)
                curveToRelative(-8.0f, 4.1f, -17.7f, 3.3f, -25.0f, -2.0f)
                reflectiveCurveToRelative(-11.0f, -14.2f, -9.6f, -23.2f)
                lineTo(134.4f, 305.9f)
                lineTo(20.0f, 191.4f)
                curveToRelative(-6.4f, -6.4f, -8.6f, -15.8f, -5.8f, -24.4f)
                reflectiveCurveToRelative(10.1f, -14.9f, 19.1f, -16.3f)
                lineToRelative(159.9f, -25.4f)
                lineToRelative(73.6f, -144.2f)
                curveToRelative(4.1f, -8.0f, 12.4f, -13.1f, 21.4f, -13.1f)
                reflectiveCurveToRelative(17.3f, 5.1f, 21.4f, 13.1f)
                lineTo(383.0f, 125.3f)
                lineTo(542.9f, 150.7f)
                curveToRelative(8.9f, 1.4f, 16.3f, 7.7f, 19.1f, 16.3f)
                reflectiveCurveToRelative(0.5f, 18.0f, -5.8f, 24.4f)
                lineTo(441.7f, 305.9f)
                lineTo(467.0f, 465.8f)
                curveToRelative(1.4f, 8.9f, -2.3f, 17.9f, -9.6f, 23.2f)
                close()
            }
        }
        .build()
        return _starHalfAlt!!
    }

private var _starHalfAlt: ImageVector? = null
