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

public val FinanceGroup.StockFill: ImageVector
    get() {
        if (_stockFill != null) {
            return _stockFill!!
        }
        _stockFill = Builder(name = "StockFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.005f, 5.003f)
                horizontalLineTo(11.005f)
                verticalLineTo(14.003f)
                horizontalLineTo(8.005f)
                verticalLineTo(17.003f)
                horizontalLineTo(6.005f)
                verticalLineTo(14.003f)
                horizontalLineTo(3.005f)
                verticalLineTo(5.003f)
                horizontalLineTo(6.005f)
                verticalLineTo(2.003f)
                horizontalLineTo(8.005f)
                verticalLineTo(5.003f)
                close()
                moveTo(18.005f, 10.003f)
                horizontalLineTo(21.005f)
                verticalLineTo(19.003f)
                horizontalLineTo(18.005f)
                verticalLineTo(22.003f)
                horizontalLineTo(16.005f)
                verticalLineTo(19.003f)
                horizontalLineTo(13.005f)
                verticalLineTo(10.003f)
                horizontalLineTo(16.005f)
                verticalLineTo(7.003f)
                horizontalLineTo(18.005f)
                verticalLineTo(10.003f)
                close()
            }
        }
        .build()
        return _stockFill!!
    }

private var _stockFill: ImageVector? = null
