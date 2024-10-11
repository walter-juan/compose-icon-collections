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

public val FinanceGroup.ShoppingCart2Fill: ImageVector
    get() {
        if (_shoppingCart2Fill != null) {
            return _shoppingCart2Fill!!
        }
        _shoppingCart2Fill = Builder(name = "ShoppingCart2Fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.004f, 6.417f)
                lineTo(0.762f, 3.174f)
                lineTo(2.176f, 1.76f)
                lineTo(5.419f, 5.003f)
                horizontalLineTo(20.66f)
                curveTo(21.213f, 5.003f, 21.66f, 5.45f, 21.66f, 6.003f)
                curveTo(21.66f, 6.1f, 21.646f, 6.197f, 21.618f, 6.29f)
                lineTo(19.218f, 14.29f)
                curveTo(19.091f, 14.713f, 18.702f, 15.003f, 18.26f, 15.003f)
                horizontalLineTo(6.004f)
                verticalLineTo(17.003f)
                horizontalLineTo(17.004f)
                verticalLineTo(19.003f)
                horizontalLineTo(5.004f)
                curveTo(4.452f, 19.003f, 4.004f, 18.555f, 4.004f, 18.003f)
                verticalLineTo(6.417f)
                close()
                moveTo(5.504f, 23.003f)
                curveTo(4.676f, 23.003f, 4.004f, 22.331f, 4.004f, 21.503f)
                curveTo(4.004f, 20.674f, 4.676f, 20.003f, 5.504f, 20.003f)
                curveTo(6.333f, 20.003f, 7.004f, 20.674f, 7.004f, 21.503f)
                curveTo(7.004f, 22.331f, 6.333f, 23.003f, 5.504f, 23.003f)
                close()
                moveTo(17.504f, 23.003f)
                curveTo(16.676f, 23.003f, 16.004f, 22.331f, 16.004f, 21.503f)
                curveTo(16.004f, 20.674f, 16.676f, 20.003f, 17.504f, 20.003f)
                curveTo(18.333f, 20.003f, 19.004f, 20.674f, 19.004f, 21.503f)
                curveTo(19.004f, 22.331f, 18.333f, 23.003f, 17.504f, 23.003f)
                close()
            }
        }
        .build()
        return _shoppingCart2Fill!!
    }

private var _shoppingCart2Fill: ImageVector? = null
