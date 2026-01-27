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

public val BrandsGroup.Rev: ImageVector
    get() {
        if (_rev != null) {
            return _rev!!
        }
        _rev = Builder(name = "Rev", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(158.7f, 274.9f)
                arcToRelative(65.6f, 65.6f, 0.0f, true, true, 131.2f, 0.0f)
                arcToRelative(65.6f, 65.6f, 0.0f, true, true, -131.2f, 0.0f)
                close()
                moveTo(429.4f, 269.8f)
                lineToRelative(-0.1f, 0.0f)
                curveToRelative(-0.7f, -29.3f, -7.7f, -58.2f, -20.5f, -84.6f)
                reflectiveCurveToRelative(-31.2f, -49.7f, -53.8f, -68.4f)
                lineTo(309.6f, 143.0f)
                curveToRelative(22.0f, 14.2f, 40.1f, 33.8f, 52.7f, 56.8f)
                reflectiveCurveToRelative(19.1f, 48.8f, 19.1f, 75.1f)
                curveToRelative(0.0f, 86.6f, -70.5f, 157.1f, -157.1f, 157.1f)
                reflectiveCurveTo(67.2f, 361.5f, 67.2f, 274.9f)
                curveToRelative(0.0f, -81.9f, 63.0f, -149.3f, 143.0f, -156.4f)
                lineToRelative(0.0f, 39.1f)
                lineToRelative(108.8f, -62.8f)
                lineToRelative(-108.8f, -62.8f)
                lineToRelative(0.0f, 38.3f)
                curveToRelative(-106.7f, 7.2f, -191.0f, 96.0f, -191.0f, 204.6f)
                curveToRelative(0.0f, 111.6f, 89.1f, 202.3f, 200.1f, 205.0f)
                lineToRelative(0.0f, 0.1f)
                lineToRelative(210.2f, 0.0f)
                lineToRelative(0.0f, -210.2f)
                close()
            }
        }
        .build()
        return _rev!!
    }

private var _rev: ImageVector? = null
