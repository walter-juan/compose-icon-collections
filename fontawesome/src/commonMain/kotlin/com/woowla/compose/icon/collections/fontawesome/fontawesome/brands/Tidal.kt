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

public val BrandsGroup.Tidal: ImageVector
    get() {
        if (_tidal != null) {
            return _tidal!!
        }
        _tidal = Builder(name = "Tidal", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(107.2f, 48.0f)
                lineToRelative(-1.3f, 0.0f)
                curveToRelative(-32.3f, 33.1f, -65.4f, 65.5f, -98.0f, 98.5f)
                curveToRelative(-2.6f, 2.8f, -6.1f, 5.1f, -7.9f, 8.6f)
                curveToRelative(35.6f, 35.4f, 71.0f, 71.0f, 106.6f, 106.4f)
                curveToRelative(35.4f, -35.3f, 70.7f, -70.8f, 106.1f, -106.1f)
                lineToRelative(0.0f, -1.3f)
                lineToRelative(-73.2f, -73.2f)
                curveTo(128.8f, 69.8f, 117.3f, 59.6f, 107.2f, 48.0f)
                close()
                moveTo(320.7f, 48.0f)
                lineToRelative(-1.3f, 0.0f)
                curveToRelative(-34.9f, 36.1f, -71.5f, 71.0f, -106.3f, 107.2f)
                curveToRelative(35.9f, 35.1f, 71.0f, 71.0f, 106.7f, 106.3f)
                curveToRelative(34.3f, -34.1f, 68.4f, -68.4f, 102.6f, -102.4f)
                curveToRelative(1.5f, -1.5f, 3.3f, -2.8f, 4.1f, -4.8f)
                curveToRelative(-34.6f, -33.8f, -68.4f, -68.2f, -102.6f, -102.1f)
                curveToRelative(-1.3f, -1.3f, -2.3f, -2.6f, -3.3f, -4.1f)
                close()
                moveTo(534.2f, 48.0f)
                lineToRelative(-1.3f, 0.0f)
                curveToRelative(-17.2f, 18.0f, -35.1f, 35.3f, -52.6f, 53.0f)
                curveToRelative(-17.9f, 17.7f, -35.4f, 35.7f, -53.5f, 53.3f)
                curveToRelative(0.8f, 2.3f, 3.0f, 3.6f, 4.6f, 5.5f)
                lineTo(533.3f, 261.5f)
                curveToRelative(36.1f, -34.9f, 70.8f, -71.2f, 106.7f, -106.1f)
                curveToRelative(-0.5f, -2.2f, -2.6f, -3.5f, -4.0f, -5.0f)
                lineTo(555.8f, 70.2f)
                curveToRelative(-7.1f, -7.4f, -14.9f, -14.2f, -21.5f, -22.2f)
                close()
                moveTo(319.6f, 261.7f)
                curveToRelative(-34.9f, 35.1f, -70.0f, 70.0f, -104.9f, 104.9f)
                curveToRelative(-0.3f, 0.7f, -0.7f, 1.7f, -1.0f, 2.3f)
                curveToRelative(24.0f, 23.7f, 47.7f, 47.5f, 71.5f, 71.3f)
                curveToRelative(11.8f, 11.3f, 22.8f, 23.5f, 34.9f, 34.4f)
                curveToRelative(8.4f, -7.4f, 16.4f, -16.4f, 24.7f, -24.3f)
                curveToRelative(25.5f, -25.3f, 51.0f, -51.0f, 76.5f, -76.3f)
                curveToRelative(1.8f, -2.2f, 4.3f, -3.6f, 5.5f, -6.3f)
                curveToRelative(-35.4f, -34.9f, -70.5f, -70.2f, -105.6f, -105.4f)
                lineToRelative(-1.5f, -0.7f)
                close()
            }
        }
        .build()
        return _tidal!!
    }

private var _tidal: ImageVector? = null
