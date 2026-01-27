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

public val BrandsGroup.Nimblr: ImageVector
    get() {
        if (_nimblr != null) {
            return _nimblr!!
        }
        _nimblr = Builder(name = "Nimblr", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.6f, 353.3f)
                arcToRelative(27.0f, 27.0f, 0.0f, true, true, 0.0f, -54.0f)
                arcToRelative(27.0f, 27.0f, 0.0f, true, true, 0.0f, 54.0f)
                close()
                moveTo(167.2f, 326.3f)
                arcToRelative(27.1f, 27.1f, 0.0f, true, true, -54.3f, 0.0f)
                arcToRelative(27.1f, 27.1f, 0.0f, true, true, 54.3f, 0.0f)
                close()
                moveTo(191.8f, 159.0f)
                curveTo(157.0f, 159.0f, 89.4f, 178.8f, 59.2f, 227.0f)
                lineTo(14.0f, 0.0f)
                lineTo(14.0f, 335.5f)
                curveTo(14.0f, 433.1f, 93.6f, 512.0f, 191.8f, 512.0f)
                reflectiveCurveTo(369.5f, 433.0f, 369.5f, 335.5f)
                reflectiveCurveTo(290.1f, 159.0f, 191.8f, 159.0f)
                close()
                moveTo(191.8f, 467.1f)
                curveToRelative(-73.3f, 0.0f, -132.5f, -58.9f, -132.5f, -131.6f)
                reflectiveCurveToRelative(59.2f, -131.6f, 132.5f, -131.6f)
                reflectiveCurveToRelative(132.5f, 58.9f, 132.5f, 131.5f)
                reflectiveCurveToRelative(-59.3f, 131.6f, -132.5f, 131.6f)
                lineToRelative(0.0f, 0.1f)
                close()
            }
        }
        .build()
        return _nimblr!!
    }

private var _nimblr: ImageVector? = null
