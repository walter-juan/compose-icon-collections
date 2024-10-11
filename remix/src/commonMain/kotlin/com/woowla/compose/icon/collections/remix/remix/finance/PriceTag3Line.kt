package com.woowla.compose.icon.collections.remix.remix.finance

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.FinanceGroup

public val FinanceGroup.PriceTag3Line: ImageVector
    get() {
        if (_priceTag3Line != null) {
            return _priceTag3Line!!
        }
        _priceTag3Line = Builder(name = "PriceTag3Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.904f, 2.1f)
                lineTo(20.804f, 3.514f)
                lineTo(22.218f, 13.414f)
                lineTo(13.026f, 22.606f)
                curveTo(12.635f, 22.997f, 12.002f, 22.997f, 11.611f, 22.606f)
                lineTo(1.712f, 12.707f)
                curveTo(1.321f, 12.316f, 1.321f, 11.683f, 1.712f, 11.293f)
                lineTo(10.904f, 2.1f)
                close()
                moveTo(11.611f, 4.222f)
                lineTo(3.833f, 12.0f)
                lineTo(12.318f, 20.485f)
                lineTo(20.097f, 12.707f)
                lineTo(19.036f, 5.282f)
                lineTo(11.611f, 4.222f)
                close()
                moveTo(13.733f, 10.585f)
                curveTo(12.952f, 9.804f, 12.952f, 8.538f, 13.733f, 7.757f)
                curveTo(14.514f, 6.976f, 15.78f, 6.976f, 16.561f, 7.757f)
                curveTo(17.342f, 8.538f, 17.342f, 9.804f, 16.561f, 10.585f)
                curveTo(15.78f, 11.367f, 14.514f, 11.367f, 13.733f, 10.585f)
                close()
            }
        }
        .build()
        return _priceTag3Line!!
    }

private var _priceTag3Line: ImageVector? = null
