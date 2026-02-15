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

public val BrandsGroup.Deskpro: ImageVector
    get() {
        if (_deskpro != null) {
            return _deskpro!!
        }
        _deskpro = Builder(name = "Deskpro", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(122.0f, 406.2f)
                lineToRelative(84.0f, 0.0f)
                curveToRelative(23.1f, 0.0f, 43.9f, -3.5f, 62.6f, -10.7f)
                curveToRelative(18.7f, -7.1f, 34.7f, -17.1f, 48.0f, -30.1f)
                curveToRelative(13.3f, -13.4f, 23.6f, -29.2f, 30.7f, -47.5f)
                curveToRelative(3.9f, -9.6f, 6.8f, -19.8f, 8.6f, -30.6f)
                lineToRelative(73.7f, 0.0f)
                curveToRelative(-2.5f, 21.3f, -7.7f, 41.3f, -15.5f, 60.0f)
                curveToRelative(-11.1f, 27.2f, -26.9f, 50.8f, -47.3f, 70.9f)
                curveToRelative(-20.0f, 19.6f, -44.2f, 34.8f, -72.6f, 45.4f)
                reflectiveCurveToRelative(-60.0f, 16.0f, -94.7f, 16.0f)
                lineToRelative(-149.8f, 0.2f)
                lineToRelative(0.0f, -192.4f)
                lineToRelative(72.3f, -0.2f)
                lineToRelative(0.0f, 118.8f)
                close()
                moveTo(199.4f, 32.0f)
                curveToRelative(34.7f, 0.0f, 66.2f, 5.4f, 94.7f, 16.0f)
                curveToRelative(28.5f, 10.7f, 52.9f, 26.1f, 73.3f, 46.2f)
                curveToRelative(20.4f, 19.6f, 36.2f, 43.2f, 47.3f, 70.9f)
                curveToRelative(7.5f, 18.3f, 12.4f, 38.1f, 14.9f, 59.3f)
                lineToRelative(-73.7f, -0.1f)
                curveToRelative(-1.9f, -10.5f, -4.7f, -20.5f, -8.6f, -29.9f)
                curveToRelative(-7.1f, -18.7f, -17.3f, -34.5f, -30.7f, -47.5f)
                curveToRelative(-13.3f, -13.4f, -29.3f, -23.6f, -48.0f, -30.8f)
                curveToRelative(-18.6f, -7.1f, -39.5f, -10.7f, -62.7f, -10.7f)
                lineToRelative(-84.0f, 0.0f)
                lineToRelative(0.0f, 118.8f)
                lineToRelative(-72.2f, 0.2f)
                lineToRelative(0.0f, -192.3f)
                lineToRelative(149.7f, -0.1f)
                close()
            }
        }
        .build()
        return _deskpro!!
    }

private var _deskpro: ImageVector? = null
