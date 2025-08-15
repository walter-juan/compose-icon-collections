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

public val BrandsGroup.StumbleuponCircle: ImageVector
    get() {
        if (_stumbleuponCircle != null) {
            return _stumbleuponCircle!!
        }
        _stumbleuponCircle = Builder(name = "StumbleuponCircle", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(264.0f, 8.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, false, 0.0f, 496.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, false, 0.0f, -496.0f)
                close()
                moveTo(264.0f, 185.5f)
                curveToRelative(-9.8f, 0.0f, -17.8f, 8.0f, -17.8f, 17.8f)
                lineToRelative(0.0f, 106.9f)
                curveToRelative(0.0f, 40.9f, -33.9f, 73.9f, -74.9f, 73.9f)
                curveToRelative(-41.4f, 0.0f, -74.9f, -33.5f, -74.9f, -74.9f)
                lineToRelative(0.0f, -46.5f)
                lineToRelative(57.3f, 0.0f)
                lineToRelative(0.0f, 45.8f)
                curveToRelative(0.0f, 10.0f, 8.0f, 17.8f, 17.8f, 17.8f)
                reflectiveCurveToRelative(17.8f, -7.9f, 17.8f, -17.8f)
                lineToRelative(0.0f, -108.4f)
                curveToRelative(0.0f, -40.0f, 34.2f, -72.1f, 74.7f, -72.1f)
                curveToRelative(40.7f, 0.0f, 74.7f, 32.3f, 74.7f, 72.6f)
                lineToRelative(0.0f, 23.7f)
                lineToRelative(-34.1f, 10.1f)
                lineToRelative(-22.9f, -10.7f)
                lineToRelative(0.0f, -20.6f)
                curveToRelative(0.1f, -9.6f, -7.9f, -17.6f, -17.7f, -17.6f)
                close()
                moveTo(431.6f, 309.1f)
                curveToRelative(0.0f, 41.4f, -33.5f, 74.9f, -74.9f, 74.9f)
                curveToRelative(-41.2f, 0.0f, -74.9f, -33.2f, -74.9f, -74.2f)
                lineToRelative(0.0f, -46.8f)
                lineToRelative(22.9f, 10.7f)
                lineToRelative(34.1f, -10.1f)
                lineToRelative(0.0f, 47.1f)
                curveToRelative(0.0f, 9.8f, 8.0f, 17.6f, 17.8f, 17.6f)
                reflectiveCurveToRelative(17.8f, -7.9f, 17.8f, -17.6f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(57.3f, 0.0f)
                curveToRelative(-0.1f, 45.9f, -0.1f, 46.4f, -0.1f, 46.4f)
                close()
            }
        }
        .build()
        return _stumbleuponCircle!!
    }

private var _stumbleuponCircle: ImageVector? = null
