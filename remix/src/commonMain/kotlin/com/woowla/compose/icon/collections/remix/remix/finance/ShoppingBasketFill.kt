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

public val FinanceGroup.ShoppingBasketFill: ImageVector
    get() {
        if (_shoppingBasketFill != null) {
            return _shoppingBasketFill!!
        }
        _shoppingBasketFill = Builder(name = "ShoppingBasketFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.005f, 2.0f)
                curveTo(15.319f, 2.0f, 18.005f, 4.686f, 18.005f, 8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(22.005f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.838f)
                lineTo(20.081f, 20.083f)
                curveTo(20.038f, 20.601f, 19.605f, 21.0f, 19.085f, 21.0f)
                horizontalLineTo(4.925f)
                curveTo(4.405f, 21.0f, 3.972f, 20.601f, 3.928f, 20.083f)
                lineTo(3.171f, 11.0f)
                horizontalLineTo(2.005f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.005f)
                verticalLineTo(8.0f)
                curveTo(6.005f, 4.686f, 8.691f, 2.0f, 12.005f, 2.0f)
                close()
                moveTo(13.005f, 13.0f)
                horizontalLineTo(11.005f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.005f)
                verticalLineTo(13.0f)
                close()
                moveTo(9.005f, 13.0f)
                horizontalLineTo(7.005f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.005f)
                verticalLineTo(13.0f)
                close()
                moveTo(17.005f, 13.0f)
                horizontalLineTo(15.005f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.005f)
                verticalLineTo(13.0f)
                close()
                moveTo(12.005f, 4.0f)
                curveTo(9.863f, 4.0f, 8.114f, 5.684f, 8.01f, 7.8f)
                lineTo(8.005f, 8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.005f)
                verticalLineTo(8.0f)
                curveTo(16.005f, 5.858f, 14.321f, 4.109f, 12.205f, 4.005f)
                lineTo(12.005f, 4.0f)
                close()
            }
        }
        .build()
        return _shoppingBasketFill!!
    }

private var _shoppingBasketFill: ImageVector? = null
