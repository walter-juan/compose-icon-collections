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

public val FinanceGroup.MoneyDollarBoxLine: ImageVector
    get() {
        if (_moneyDollarBoxLine != null) {
            return _moneyDollarBoxLine!!
        }
        _moneyDollarBoxLine = Builder(name = "MoneyDollarBoxLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.005f, 3.003f)
                horizontalLineTo(21.005f)
                curveTo(21.557f, 3.003f, 22.005f, 3.45f, 22.005f, 4.003f)
                verticalLineTo(20.003f)
                curveTo(22.005f, 20.555f, 21.557f, 21.003f, 21.005f, 21.003f)
                horizontalLineTo(3.005f)
                curveTo(2.453f, 21.003f, 2.005f, 20.555f, 2.005f, 20.003f)
                verticalLineTo(4.003f)
                curveTo(2.005f, 3.45f, 2.453f, 3.003f, 3.005f, 3.003f)
                close()
                moveTo(4.005f, 5.003f)
                verticalLineTo(19.003f)
                horizontalLineTo(20.005f)
                verticalLineTo(5.003f)
                horizontalLineTo(4.005f)
                close()
                moveTo(8.505f, 14.003f)
                horizontalLineTo(14.005f)
                curveTo(14.281f, 14.003f, 14.505f, 13.779f, 14.505f, 13.503f)
                curveTo(14.505f, 13.227f, 14.281f, 13.003f, 14.005f, 13.003f)
                horizontalLineTo(10.005f)
                curveTo(8.624f, 13.003f, 7.505f, 11.884f, 7.505f, 10.503f)
                curveTo(7.505f, 9.122f, 8.624f, 8.003f, 10.005f, 8.003f)
                horizontalLineTo(11.005f)
                verticalLineTo(6.003f)
                horizontalLineTo(13.005f)
                verticalLineTo(8.003f)
                horizontalLineTo(15.505f)
                verticalLineTo(10.003f)
                horizontalLineTo(10.005f)
                curveTo(9.729f, 10.003f, 9.505f, 10.227f, 9.505f, 10.503f)
                curveTo(9.505f, 10.779f, 9.729f, 11.003f, 10.005f, 11.003f)
                horizontalLineTo(14.005f)
                curveTo(15.386f, 11.003f, 16.505f, 12.122f, 16.505f, 13.503f)
                curveTo(16.505f, 14.884f, 15.386f, 16.003f, 14.005f, 16.003f)
                horizontalLineTo(13.005f)
                verticalLineTo(18.003f)
                horizontalLineTo(11.005f)
                verticalLineTo(16.003f)
                horizontalLineTo(8.505f)
                verticalLineTo(14.003f)
                close()
            }
        }
        .build()
        return _moneyDollarBoxLine!!
    }

private var _moneyDollarBoxLine: ImageVector? = null
