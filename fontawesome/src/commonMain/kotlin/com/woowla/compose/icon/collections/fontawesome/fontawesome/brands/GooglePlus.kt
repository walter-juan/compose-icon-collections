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

public val BrandsGroup.GooglePlus: ImageVector
    get() {
        if (_googlePlus != null) {
            return _googlePlus!!
        }
        _googlePlus = Builder(name = "GooglePlus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, false, 0.0f, 496.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, false, 0.0f, -496.0f)
                close()
                moveTo(185.3f, 380.0f)
                curveToRelative(-32.9f, 0.0f, -64.4f, -13.1f, -87.7f, -36.3f)
                reflectiveCurveToRelative(-36.3f, -54.8f, -36.3f, -87.7f)
                reflectiveCurveToRelative(13.1f, -64.4f, 36.3f, -87.7f)
                reflectiveCurveToRelative(54.8f, -36.3f, 87.7f, -36.3f)
                curveToRelative(31.3f, 0.0f, 60.1f, 11.0f, 83.0f, 32.3f)
                lineToRelative(-33.6f, 32.6f)
                curveToRelative(-13.2f, -12.9f, -31.3f, -19.1f, -49.4f, -19.1f)
                curveToRelative(-42.9f, 0.0f, -77.2f, 35.5f, -77.2f, 78.1f)
                reflectiveCurveTo(142.3f, 334.0f, 185.3f, 334.0f)
                curveToRelative(32.6f, 0.0f, 64.9f, -19.1f, 70.1f, -53.3f)
                lineToRelative(-70.1f, 0.0f)
                lineToRelative(0.0f, -42.6f)
                lineToRelative(116.9f, 0.0f)
                curveToRelative(1.3f, 6.8f, 1.9f, 13.8f, 1.9f, 20.7f)
                curveToRelative(0.0f, 70.8f, -47.5f, 121.2f, -118.8f, 121.2f)
                close()
                moveTo(415.5f, 273.8f)
                lineToRelative(0.0f, 35.5f)
                lineToRelative(-35.5f, 0.0f)
                lineToRelative(0.0f, -35.5f)
                lineToRelative(-35.5f, 0.0f)
                lineToRelative(0.0f, -35.5f)
                lineToRelative(35.5f, 0.0f)
                lineToRelative(0.0f, -35.5f)
                lineToRelative(35.5f, 0.0f)
                lineToRelative(0.0f, 35.5f)
                lineToRelative(35.2f, 0.0f)
                lineToRelative(0.0f, 35.5f)
                lineToRelative(-35.2f, 0.0f)
                close()
            }
        }
        .build()
        return _googlePlus!!
    }

private var _googlePlus: ImageVector? = null
