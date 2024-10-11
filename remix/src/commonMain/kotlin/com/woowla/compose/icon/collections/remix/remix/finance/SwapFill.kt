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

public val FinanceGroup.SwapFill: ImageVector
    get() {
        if (_swapFill != null) {
            return _swapFill!!
        }
        _swapFill = Builder(name = "SwapFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.005f, 22.003f)
                curveTo(6.482f, 22.003f, 2.005f, 17.526f, 2.005f, 12.003f)
                curveTo(2.005f, 6.48f, 6.482f, 2.003f, 12.005f, 2.003f)
                curveTo(17.528f, 2.003f, 22.005f, 6.48f, 22.005f, 12.003f)
                curveTo(22.005f, 17.526f, 17.528f, 22.003f, 12.005f, 22.003f)
                close()
                moveTo(7.005f, 9.003f)
                horizontalLineTo(9.005f)
                verticalLineTo(13.003f)
                horizontalLineTo(11.005f)
                verticalLineTo(9.003f)
                horizontalLineTo(13.005f)
                lineTo(10.005f, 5.503f)
                lineTo(7.005f, 9.003f)
                close()
                moveTo(17.005f, 15.003f)
                horizontalLineTo(15.005f)
                verticalLineTo(11.003f)
                horizontalLineTo(13.005f)
                verticalLineTo(15.003f)
                horizontalLineTo(11.005f)
                lineTo(14.005f, 18.503f)
                lineTo(17.005f, 15.003f)
                close()
            }
        }
        .build()
        return _swapFill!!
    }

private var _swapFill: ImageVector? = null
