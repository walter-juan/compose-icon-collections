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

public val FinanceGroup.MoneyDollarCircleFill: ImageVector
    get() {
        if (_moneyDollarCircleFill != null) {
            return _moneyDollarCircleFill!!
        }
        _moneyDollarCircleFill = Builder(name = "MoneyDollarCircleFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.005f, 22.003f)
                curveTo(6.482f, 22.003f, 2.005f, 17.526f, 2.005f, 12.003f)
                curveTo(2.005f, 6.48f, 6.482f, 2.003f, 12.005f, 2.003f)
                curveTo(17.528f, 2.003f, 22.005f, 6.48f, 22.005f, 12.003f)
                curveTo(22.005f, 17.526f, 17.528f, 22.003f, 12.005f, 22.003f)
                close()
                moveTo(8.505f, 14.003f)
                verticalLineTo(16.003f)
                horizontalLineTo(11.005f)
                verticalLineTo(18.003f)
                horizontalLineTo(13.005f)
                verticalLineTo(16.003f)
                horizontalLineTo(14.005f)
                curveTo(15.386f, 16.003f, 16.505f, 14.884f, 16.505f, 13.503f)
                curveTo(16.505f, 12.122f, 15.386f, 11.003f, 14.005f, 11.003f)
                horizontalLineTo(10.005f)
                curveTo(9.729f, 11.003f, 9.505f, 10.779f, 9.505f, 10.503f)
                curveTo(9.505f, 10.227f, 9.729f, 10.003f, 10.005f, 10.003f)
                horizontalLineTo(15.505f)
                verticalLineTo(8.003f)
                horizontalLineTo(13.005f)
                verticalLineTo(6.003f)
                horizontalLineTo(11.005f)
                verticalLineTo(8.003f)
                horizontalLineTo(10.005f)
                curveTo(8.624f, 8.003f, 7.505f, 9.122f, 7.505f, 10.503f)
                curveTo(7.505f, 11.884f, 8.624f, 13.003f, 10.005f, 13.003f)
                horizontalLineTo(14.005f)
                curveTo(14.281f, 13.003f, 14.505f, 13.227f, 14.505f, 13.503f)
                curveTo(14.505f, 13.779f, 14.281f, 14.003f, 14.005f, 14.003f)
                horizontalLineTo(8.505f)
                close()
            }
        }
        .build()
        return _moneyDollarCircleFill!!
    }

private var _moneyDollarCircleFill: ImageVector? = null
