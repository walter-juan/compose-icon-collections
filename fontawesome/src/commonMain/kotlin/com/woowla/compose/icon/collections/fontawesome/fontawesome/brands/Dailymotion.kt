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

public val BrandsGroup.Dailymotion: ImageVector
    get() {
        if (_dailymotion != null) {
            return _dailymotion!!
        }
        _dailymotion = Builder(name = "Dailymotion", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(298.9f, 267.0f)
                curveToRelative(-7.4f, -4.2f, -15.8f, -6.3f, -24.4f, -6.2f)
                curveToRelative(-13.2f, 0.0f, -24.4f, 4.4f, -33.4f, 13.3f)
                reflectiveCurveToRelative(-13.6f, 20.0f, -13.6f, 33.4f)
                curveToRelative(0.0f, 14.1f, 4.4f, 25.6f, 13.3f, 34.6f)
                reflectiveCurveToRelative(20.0f, 13.4f, 33.4f, 13.4f)
                curveToRelative(13.7f, 0.0f, 25.0f, -4.6f, 34.1f, -13.8f)
                reflectiveCurveTo(322.0f, 321.1f, 322.0f, 307.5f)
                curveToRelative(0.0f, -8.2f, -2.1f, -16.3f, -6.1f, -23.5f)
                curveToRelative(-4.0f, -7.1f, -9.8f, -13.0f, -17.0f, -17.0f)
                close()
                moveTo(0.0f, 32.0f)
                lineToRelative(0.0f, 448.0f)
                lineToRelative(448.0f, 0.0f)
                lineToRelative(0.0f, -448.0f)
                lineToRelative(-448.0f, 0.0f)
                close()
                moveTo(374.7f, 405.3f)
                lineToRelative(-53.1f, 0.0f)
                lineToRelative(0.0f, -23.9f)
                lineToRelative(-0.7f, 0.0f)
                curveToRelative(-10.5f, 17.5f, -29.1f, 26.2f, -55.8f, 26.2f)
                curveToRelative(-18.4f, 0.0f, -34.7f, -4.4f, -48.9f, -13.1f)
                curveToRelative(-14.1f, -8.6f, -25.5f, -21.0f, -32.9f, -35.8f)
                curveToRelative(-7.7f, -15.1f, -11.6f, -32.1f, -11.6f, -50.9f)
                curveToRelative(0.0f, -18.4f, 3.9f, -35.1f, 11.8f, -50.2f)
                curveToRelative(7.5f, -14.7f, 18.9f, -27.1f, 32.9f, -35.8f)
                curveToRelative(14.1f, -8.7f, 30.0f, -13.1f, 47.7f, -13.1f)
                curveToRelative(10.2f, -0.1f, 20.2f, 1.6f, 29.7f, 5.2f)
                curveToRelative(8.9f, 3.5f, 17.2f, 9.1f, 25.0f, 17.0f)
                lineToRelative(0.0f, -77.9f)
                lineToRelative(55.8f, -12.1f)
                lineToRelative(0.0f, 264.4f)
                close()
            }
        }
        .build()
        return _dailymotion!!
    }

private var _dailymotion: ImageVector? = null
