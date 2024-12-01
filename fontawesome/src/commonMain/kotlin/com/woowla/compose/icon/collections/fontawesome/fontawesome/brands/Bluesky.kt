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

public val BrandsGroup.Bluesky: ImageVector
    get() {
        if (_bluesky != null) {
            return _bluesky!!
        }
        _bluesky = Builder(name = "Bluesky", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(111.8f, 62.2f)
                curveTo(170.2f, 105.9f, 233.0f, 194.7f, 256.0f, 242.4f)
                curveToRelative(23.0f, -47.6f, 85.8f, -136.4f, 144.2f, -180.2f)
                curveToRelative(42.1f, -31.6f, 110.3f, -56.0f, 110.3f, 21.8f)
                curveToRelative(0.0f, 15.5f, -8.9f, 130.5f, -14.1f, 149.2f)
                curveTo(478.2f, 298.0f, 412.0f, 314.6f, 353.1f, 304.5f)
                curveToRelative(102.9f, 17.5f, 129.1f, 75.5f, 72.5f, 133.5f)
                curveToRelative(-107.4f, 110.2f, -154.3f, -27.6f, -166.3f, -62.9f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-1.7f, -4.9f, -2.6f, -7.8f, -3.3f, -7.8f)
                reflectiveCurveToRelative(-1.6f, 3.0f, -3.3f, 7.8f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-12.0f, 35.3f, -59.0f, 173.1f, -166.3f, 62.9f)
                curveToRelative(-56.5f, -58.0f, -30.4f, -116.0f, 72.5f, -133.5f)
                curveTo(100.0f, 314.6f, 33.8f, 298.0f, 15.7f, 233.1f)
                curveTo(10.4f, 214.4f, 1.5f, 99.4f, 1.5f, 83.9f)
                curveToRelative(0.0f, -77.8f, 68.2f, -53.4f, 110.3f, -21.8f)
                close()
            }
        }
        .build()
        return _bluesky!!
    }

private var _bluesky: ImageVector? = null
