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

public val BrandsGroup.Centercode: ImageVector
    get() {
        if (_centercode != null) {
            return _centercode!!
        }
        _centercode = Builder(name = "Centercode", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.8f, 254.8f)
                arcToRelative(64.1f, 64.1f, 0.0f, true, true, 127.4f, 13.8f)
                arcToRelative(64.1f, 64.1f, 0.0f, true, true, -127.4f, -13.8f)
                close()
                moveTo(243.4f, 503.7f)
                curveTo(96.7f, 496.0f, -8.2f, 365.5f, 10.1f, 224.3f)
                curveTo(21.3f, 137.7f, 75.9f, 67.4f, 149.2f, 32.3f)
                curveTo(310.2f, -44.8f, 498.9f, 69.7f, 503.9f, 248.9f)
                curveTo(508.0f, 395.9f, 385.5f, 511.1f, 243.4f, 503.7f)
                close()
                moveTo(423.3f, 323.7f)
                curveToRelative(27.9f, -118.0f, -160.5f, -205.9f, -237.2f, -234.2f)
                curveToRelative(-57.5f, 56.3f, -69.1f, 188.6f, -33.8f, 344.4f)
                curveToRelative(68.8f, 15.8f, 169.1f, -26.4f, 271.0f, -110.2f)
                close()
            }
        }
        .build()
        return _centercode!!
    }

private var _centercode: ImageVector? = null
