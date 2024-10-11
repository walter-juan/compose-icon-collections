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

public val FinanceGroup.ShoppingBagLine: ImageVector
    get() {
        if (_shoppingBagLine != null) {
            return _shoppingBagLine!!
        }
        _shoppingBagLine = Builder(name = "ShoppingBagLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.005f, 8.0f)
                verticalLineTo(6.0f)
                curveTo(7.005f, 3.238f, 9.243f, 1.0f, 12.005f, 1.0f)
                curveTo(14.766f, 1.0f, 17.005f, 3.238f, 17.005f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.005f)
                curveTo(20.557f, 8.0f, 21.005f, 8.447f, 21.005f, 9.0f)
                verticalLineTo(21.0f)
                curveTo(21.005f, 21.552f, 20.557f, 22.0f, 20.005f, 22.0f)
                horizontalLineTo(4.005f)
                curveTo(3.453f, 22.0f, 3.005f, 21.552f, 3.005f, 21.0f)
                verticalLineTo(9.0f)
                curveTo(3.005f, 8.447f, 3.453f, 8.0f, 4.005f, 8.0f)
                horizontalLineTo(7.005f)
                close()
                moveTo(7.005f, 10.0f)
                horizontalLineTo(5.005f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.005f)
                verticalLineTo(10.0f)
                horizontalLineTo(17.005f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.005f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.005f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.005f)
                verticalLineTo(10.0f)
                close()
                moveTo(9.005f, 8.0f)
                horizontalLineTo(15.005f)
                verticalLineTo(6.0f)
                curveTo(15.005f, 4.343f, 13.662f, 3.0f, 12.005f, 3.0f)
                curveTo(10.348f, 3.0f, 9.005f, 4.343f, 9.005f, 6.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _shoppingBagLine!!
    }

private var _shoppingBagLine: ImageVector? = null
