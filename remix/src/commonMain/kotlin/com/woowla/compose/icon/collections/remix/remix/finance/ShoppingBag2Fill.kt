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

public val FinanceGroup.ShoppingBag2Fill: ImageVector
    get() {
        if (_shoppingBag2Fill != null) {
            return _shoppingBag2Fill!!
        }
        _shoppingBag2Fill = Builder(name = "ShoppingBag2Fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.005f, 22.0f)
                horizontalLineTo(4.005f)
                curveTo(3.453f, 22.0f, 3.005f, 21.552f, 3.005f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(3.005f, 2.448f, 3.453f, 2.0f, 4.005f, 2.0f)
                horizontalLineTo(20.005f)
                curveTo(20.557f, 2.0f, 21.005f, 2.448f, 21.005f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(21.005f, 21.552f, 20.557f, 22.0f, 20.005f, 22.0f)
                close()
                moveTo(9.005f, 6.0f)
                horizontalLineTo(7.005f)
                verticalLineTo(8.0f)
                curveTo(7.005f, 10.761f, 9.243f, 13.0f, 12.005f, 13.0f)
                curveTo(14.766f, 13.0f, 17.005f, 10.761f, 17.005f, 8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.005f)
                verticalLineTo(8.0f)
                curveTo(15.005f, 9.657f, 13.662f, 11.0f, 12.005f, 11.0f)
                curveTo(10.348f, 11.0f, 9.005f, 9.657f, 9.005f, 8.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _shoppingBag2Fill!!
    }

private var _shoppingBag2Fill: ImageVector? = null
