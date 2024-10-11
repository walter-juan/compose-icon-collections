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

public val FinanceGroup.ShoppingCartFill: ImageVector
    get() {
        if (_shoppingCartFill != null) {
            return _shoppingCartFill!!
        }
        _shoppingCartFill = Builder(name = "ShoppingCartFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.005f, 9.0f)
                horizontalLineTo(19.943f)
                lineTo(20.443f, 7.0f)
                horizontalLineTo(8.005f)
                verticalLineTo(5.0f)
                horizontalLineTo(21.724f)
                curveTo(22.276f, 5.0f, 22.724f, 5.448f, 22.724f, 6.0f)
                curveTo(22.724f, 6.082f, 22.714f, 6.163f, 22.694f, 6.243f)
                lineTo(20.194f, 16.243f)
                curveTo(20.083f, 16.688f, 19.683f, 17.0f, 19.224f, 17.0f)
                horizontalLineTo(5.005f)
                curveTo(4.453f, 17.0f, 4.005f, 16.552f, 4.005f, 16.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(2.005f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.005f)
                curveTo(5.557f, 2.0f, 6.005f, 2.448f, 6.005f, 3.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(6.005f, 23.0f)
                curveTo(4.9f, 23.0f, 4.005f, 22.105f, 4.005f, 21.0f)
                curveTo(4.005f, 19.895f, 4.9f, 19.0f, 6.005f, 19.0f)
                curveTo(7.109f, 19.0f, 8.005f, 19.895f, 8.005f, 21.0f)
                curveTo(8.005f, 22.105f, 7.109f, 23.0f, 6.005f, 23.0f)
                close()
                moveTo(18.005f, 23.0f)
                curveTo(16.9f, 23.0f, 16.005f, 22.105f, 16.005f, 21.0f)
                curveTo(16.005f, 19.895f, 16.9f, 19.0f, 18.005f, 19.0f)
                curveTo(19.11f, 19.0f, 20.005f, 19.895f, 20.005f, 21.0f)
                curveTo(20.005f, 22.105f, 19.11f, 23.0f, 18.005f, 23.0f)
                close()
            }
        }
        .build()
        return _shoppingCartFill!!
    }

private var _shoppingCartFill: ImageVector? = null
