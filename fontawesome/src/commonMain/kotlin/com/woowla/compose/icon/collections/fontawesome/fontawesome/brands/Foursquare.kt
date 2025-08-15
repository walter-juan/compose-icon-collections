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

public val BrandsGroup.Foursquare: ImageVector
    get() {
        if (_foursquare != null) {
            return _foursquare!!
        }
        _foursquare = Builder(name = "Foursquare", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(331.1f, 3.0f)
                lineTo(57.9f, 3.0f)
                curveTo(20.4f, 3.0f, 8.0f, 31.3f, 8.0f, 49.1f)
                lineTo(8.0f, 482.9f)
                curveToRelative(0.0f, 20.3f, 12.1f, 27.7f, 18.2f, 30.1f)
                curveToRelative(6.2f, 2.5f, 22.8f, 4.6f, 32.9f, -7.1f)
                curveToRelative(128.9f, -149.4f, 131.1f, -151.9f, 131.1f, -151.9f)
                curveToRelative(3.1f, -3.4f, 3.4f, -3.1f, 6.8f, -3.1f)
                lineToRelative(83.4f, 0.0f)
                curveToRelative(35.1f, 0.0f, 40.6f, -25.2f, 44.3f, -39.7f)
                lineToRelative(48.6f, -243.0f)
                curveTo(381.8f, 25.8f, 371.1f, 3.0f, 331.1f, 3.0f)
                close()
                moveTo(314.8f, 76.8f)
                lineToRelative(-11.4f, 59.7f)
                curveToRelative(-1.2f, 6.5f, -9.5f, 13.2f, -16.9f, 13.2f)
                lineToRelative(-106.4f, 0.0f)
                curveToRelative(-12.0f, 0.0f, -20.6f, 8.3f, -20.6f, 20.3f)
                lineToRelative(0.0f, 13.0f)
                curveToRelative(0.0f, 12.0f, 8.6f, 20.6f, 20.6f, 20.6f)
                lineToRelative(90.4f, 0.0f)
                curveToRelative(8.3f, 0.0f, 16.6f, 9.2f, 14.8f, 18.2f)
                curveToRelative(-1.8f, 8.9f, -10.5f, 53.8f, -11.4f, 58.8f)
                curveToRelative(-0.9f, 4.9f, -6.8f, 13.5f, -16.9f, 13.5f)
                lineToRelative(-73.5f, 0.0f)
                curveToRelative(-13.5f, 0.0f, -17.2f, 1.8f, -26.5f, 12.6f)
                curveToRelative(0.0f, 0.0f, -8.9f, 11.4f, -89.5f, 108.3f)
                curveToRelative(-0.9f, 0.9f, -1.8f, 0.6f, -1.8f, -0.3f)
                lineToRelative(0.0f, -338.8f)
                curveToRelative(0.0f, -7.7f, 6.8f, -16.6f, 16.6f, -16.6f)
                lineToRelative(219.0f, 0.0f)
                curveToRelative(8.2f, 0.0f, 15.6f, 7.7f, 13.5f, 17.5f)
                close()
            }
        }
        .build()
        return _foursquare!!
    }

private var _foursquare: ImageVector? = null
