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

public val BrandsGroup.Affiliatetheme: ImageVector
    get() {
        if (_affiliatetheme != null) {
            return _affiliatetheme!!
        }
        _affiliatetheme = Builder(name = "Affiliatetheme", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(159.7f, 237.4f)
                curveTo(108.4f, 308.3f, 43.1f, 348.2f, 14.0f, 326.6f)
                curveTo(-15.2f, 304.9f, 2.8f, 230.0f, 54.2f, 159.1f)
                curveTo(105.5f, 88.2f, 170.8f, 48.3f, 199.9f, 69.9f)
                reflectiveCurveToRelative(11.1f, 96.6f, -40.2f, 167.5f)
                close()
                moveTo(510.9f, 180.1f)
                curveToRelative(-73.8f, 123.4f, -191.9f, 187.7f, -264.5f, 143.6f)
                curveToRelative(-25.0f, -15.2f, -41.3f, -41.2f, -49.0f, -73.8f)
                curveToRelative(-33.6f, 64.8f, -92.8f, 113.8f, -164.1f, 133.2f)
                curveToRelative(49.8f, 59.3f, 124.1f, 96.9f, 207.0f, 96.9f)
                curveToRelative(150.0f, 0.0f, 271.6f, -123.1f, 271.6f, -274.9f)
                curveToRelative(0.1f, -8.5f, -0.3f, -16.8f, -1.0f, -25.0f)
                close()
            }
        }
        .build()
        return _affiliatetheme!!
    }

private var _affiliatetheme: ImageVector? = null
