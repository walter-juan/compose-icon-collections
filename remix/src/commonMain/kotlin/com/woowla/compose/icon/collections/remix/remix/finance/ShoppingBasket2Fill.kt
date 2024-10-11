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

public val FinanceGroup.ShoppingBasket2Fill: ImageVector
    get() {
        if (_shoppingBasket2Fill != null) {
            return _shoppingBasket2Fill!!
        }
        _shoppingBasket2Fill = Builder(name = "ShoppingBasket2Fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.371f, 3.44f)
                lineTo(18.582f, 9.002f)
                lineTo(22.005f, 9.002f)
                verticalLineTo(11.002f)
                lineTo(20.838f, 11.002f)
                lineTo(20.081f, 20.085f)
                curveTo(20.038f, 20.604f, 19.605f, 21.002f, 19.085f, 21.002f)
                horizontalLineTo(4.925f)
                curveTo(4.405f, 21.002f, 3.972f, 20.604f, 3.928f, 20.085f)
                lineTo(3.171f, 11.002f)
                lineTo(2.005f, 11.002f)
                verticalLineTo(9.002f)
                lineTo(5.427f, 9.002f)
                lineTo(8.639f, 3.44f)
                lineTo(10.371f, 4.44f)
                lineTo(7.737f, 9.002f)
                horizontalLineTo(16.272f)
                lineTo(13.639f, 4.44f)
                lineTo(15.371f, 3.44f)
                close()
                moveTo(13.005f, 13.002f)
                horizontalLineTo(11.005f)
                verticalLineTo(17.002f)
                horizontalLineTo(13.005f)
                verticalLineTo(13.002f)
                close()
                moveTo(9.005f, 13.002f)
                horizontalLineTo(7.005f)
                verticalLineTo(17.002f)
                horizontalLineTo(9.005f)
                verticalLineTo(13.002f)
                close()
                moveTo(17.005f, 13.002f)
                horizontalLineTo(15.005f)
                verticalLineTo(17.002f)
                horizontalLineTo(17.005f)
                verticalLineTo(13.002f)
                close()
            }
        }
        .build()
        return _shoppingBasket2Fill!!
    }

private var _shoppingBasket2Fill: ImageVector? = null
