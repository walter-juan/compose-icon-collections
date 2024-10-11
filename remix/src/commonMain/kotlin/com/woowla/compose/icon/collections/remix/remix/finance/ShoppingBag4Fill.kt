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

public val FinanceGroup.ShoppingBag4Fill: ImageVector
    get() {
        if (_shoppingBag4Fill != null) {
            return _shoppingBag4Fill!!
        }
        _shoppingBag4Fill = Builder(name = "ShoppingBag4Fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 6.0f)
                curveTo(9.0f, 4.343f, 10.343f, 3.0f, 12.0f, 3.0f)
                curveTo(13.657f, 3.0f, 15.0f, 4.343f, 15.0f, 6.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(7.0f, 6.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 6.0f, 3.0f, 6.448f, 3.0f, 7.0f)
                verticalLineTo(21.0f)
                curveTo(3.0f, 21.552f, 3.448f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 22.0f, 21.0f, 21.552f, 21.0f, 21.0f)
                verticalLineTo(7.0f)
                curveTo(21.0f, 6.448f, 20.552f, 6.0f, 20.0f, 6.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 3.239f, 14.761f, 1.0f, 12.0f, 1.0f)
                curveTo(9.239f, 1.0f, 7.0f, 3.239f, 7.0f, 6.0f)
                close()
                moveTo(9.0f, 10.0f)
                curveTo(9.0f, 11.657f, 10.343f, 13.0f, 12.0f, 13.0f)
                curveTo(13.657f, 13.0f, 15.0f, 11.657f, 15.0f, 10.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 12.761f, 14.761f, 15.0f, 12.0f, 15.0f)
                curveTo(9.239f, 15.0f, 7.0f, 12.761f, 7.0f, 10.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _shoppingBag4Fill!!
    }

private var _shoppingBag4Fill: ImageVector? = null
