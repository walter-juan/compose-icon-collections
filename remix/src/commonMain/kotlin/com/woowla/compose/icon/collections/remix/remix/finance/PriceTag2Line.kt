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

public val FinanceGroup.PriceTag2Line: ImageVector
    get() {
        if (_priceTag2Line != null) {
            return _priceTag2Line!!
        }
        _priceTag2Line = Builder(name = "PriceTag2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.005f, 7.0f)
                lineTo(11.45f, 1.37f)
                curveTo(11.786f, 1.146f, 12.224f, 1.146f, 12.56f, 1.37f)
                lineTo(21.005f, 7.0f)
                verticalLineTo(21.0f)
                curveTo(21.005f, 21.552f, 20.557f, 22.0f, 20.005f, 22.0f)
                horizontalLineTo(4.005f)
                curveTo(3.453f, 22.0f, 3.005f, 21.552f, 3.005f, 21.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(5.005f, 8.07f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.005f)
                verticalLineTo(8.07f)
                lineTo(12.005f, 3.403f)
                lineTo(5.005f, 8.07f)
                close()
                moveTo(8.005f, 16.0f)
                horizontalLineTo(16.005f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.005f)
                verticalLineTo(16.0f)
                close()
                moveTo(8.005f, 13.0f)
                horizontalLineTo(16.005f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.005f)
                verticalLineTo(13.0f)
                close()
                moveTo(12.005f, 11.0f)
                curveTo(10.9f, 11.0f, 10.005f, 10.104f, 10.005f, 9.0f)
                curveTo(10.005f, 7.895f, 10.9f, 7.0f, 12.005f, 7.0f)
                curveTo(13.109f, 7.0f, 14.005f, 7.895f, 14.005f, 9.0f)
                curveTo(14.005f, 10.104f, 13.109f, 11.0f, 12.005f, 11.0f)
                close()
            }
        }
        .build()
        return _priceTag2Line!!
    }

private var _priceTag2Line: ImageVector? = null
