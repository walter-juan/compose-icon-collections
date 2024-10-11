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

public val FinanceGroup.ShoppingBag3Line: ImageVector
    get() {
        if (_shoppingBag3Line != null) {
            return _shoppingBag3Line!!
        }
        _shoppingBag3Line = Builder(name = "ShoppingBag3Line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.505f, 2.0f)
                horizontalLineTo(17.505f)
                curveTo(17.82f, 2.0f, 18.116f, 2.148f, 18.305f, 2.4f)
                lineTo(21.005f, 6.0f)
                verticalLineTo(21.0f)
                curveTo(21.005f, 21.552f, 20.557f, 22.0f, 20.005f, 22.0f)
                horizontalLineTo(4.005f)
                curveTo(3.453f, 22.0f, 3.005f, 21.552f, 3.005f, 21.0f)
                verticalLineTo(6.0f)
                lineTo(5.705f, 2.4f)
                curveTo(5.894f, 2.148f, 6.19f, 2.0f, 6.505f, 2.0f)
                close()
                moveTo(19.005f, 8.0f)
                horizontalLineTo(5.005f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.005f)
                verticalLineTo(8.0f)
                close()
                moveTo(18.505f, 6.0f)
                lineTo(17.005f, 4.0f)
                horizontalLineTo(7.005f)
                lineTo(5.505f, 6.0f)
                horizontalLineTo(18.505f)
                close()
                moveTo(9.005f, 10.0f)
                verticalLineTo(12.0f)
                curveTo(9.005f, 13.657f, 10.348f, 15.0f, 12.005f, 15.0f)
                curveTo(13.662f, 15.0f, 15.005f, 13.657f, 15.005f, 12.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(17.005f)
                verticalLineTo(12.0f)
                curveTo(17.005f, 14.761f, 14.766f, 17.0f, 12.005f, 17.0f)
                curveTo(9.243f, 17.0f, 7.005f, 14.761f, 7.005f, 12.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.005f)
                close()
            }
        }
        .build()
        return _shoppingBag3Line!!
    }

private var _shoppingBag3Line: ImageVector? = null
