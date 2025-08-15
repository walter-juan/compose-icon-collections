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

public val BrandsGroup.Pix: ImageVector
    get() {
        if (_pix != null) {
            return _pix!!
        }
        _pix = Builder(name = "Pix", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.4f, 292.5f)
                curveToRelative(5.4f, -5.4f, 14.7f, -5.4f, 20.1f, 0.0f)
                lineToRelative(77.0f, 77.0f)
                curveToRelative(14.2f, 14.2f, 33.1f, 22.0f, 53.1f, 22.0f)
                lineToRelative(15.1f, 0.0f)
                lineToRelative(-97.1f, 97.1f)
                curveToRelative(-30.3f, 29.5f, -79.5f, 29.5f, -109.8f, 0.0f)
                lineToRelative(-97.5f, -97.4f)
                lineToRelative(9.3f, 0.0f)
                curveToRelative(20.0f, 0.0f, 38.9f, -7.8f, 53.1f, -22.0f)
                lineToRelative(76.7f, -76.7f)
                close()
                moveTo(262.5f, 218.9f)
                curveToRelative(-6.4f, 5.5f, -14.6f, 5.6f, -20.1f, 0.0f)
                lineToRelative(-76.7f, -76.7f)
                curveToRelative(-14.2f, -15.1f, -33.1f, -22.0f, -53.1f, -22.0f)
                lineToRelative(-9.3f, 0.0f)
                lineToRelative(97.4f, -97.4f)
                curveToRelative(30.4f, -30.3f, 79.6f, -30.3f, 109.9f, 0.0f)
                lineToRelative(97.2f, 97.1f)
                lineToRelative(-15.2f, 0.0f)
                curveToRelative(-20.0f, 0.0f, -38.9f, 7.8f, -53.1f, 22.0f)
                lineToRelative(-77.0f, 77.0f)
                close()
                moveTo(112.6f, 142.7f)
                curveToRelative(13.8f, 0.0f, 26.5f, 5.6f, 37.1f, 15.4f)
                lineToRelative(76.7f, 76.7f)
                curveToRelative(7.2f, 6.3f, 16.6f, 10.8f, 26.1f, 10.8f)
                curveToRelative(9.4f, 0.0f, 18.8f, -4.5f, 26.0f, -10.8f)
                lineToRelative(77.0f, -77.0f)
                curveToRelative(9.8f, -9.7f, 23.3f, -15.3f, 37.1f, -15.3f)
                lineToRelative(37.7f, 0.0f)
                lineToRelative(58.3f, 58.3f)
                curveToRelative(30.3f, 30.3f, 30.3f, 79.5f, 0.0f, 109.8f)
                lineToRelative(-58.3f, 58.3f)
                lineToRelative(-37.7f, 0.0f)
                curveToRelative(-13.8f, 0.0f, -27.3f, -5.6f, -37.1f, -15.4f)
                lineToRelative(-77.0f, -77.0f)
                curveToRelative(-13.9f, -13.9f, -38.2f, -13.9f, -52.1f, 0.1f)
                lineToRelative(-76.7f, 76.6f)
                curveToRelative(-10.6f, 9.8f, -23.3f, 15.4f, -37.1f, 15.4f)
                lineToRelative(-31.8f, 0.0f)
                lineToRelative(-58.0f, -58.0f)
                curveToRelative(-30.3f, -30.3f, -30.3f, -79.5f, 0.0f, -109.8f)
                lineToRelative(58.0f, -58.1f)
                lineToRelative(31.8f, 0.0f)
                close()
            }
        }
        .build()
        return _pix!!
    }

private var _pix: ImageVector? = null
