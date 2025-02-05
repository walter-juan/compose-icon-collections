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

public val FinanceGroup.SwapBoxFill: ImageVector
    get() {
        if (_swapBoxFill != null) {
            return _swapBoxFill!!
        }
        _swapBoxFill = Builder(name = "SwapBoxFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(15.005f, 7.003f)
                verticalLineTo(9.003f)
                horizontalLineTo(11.005f)
                verticalLineTo(11.003f)
                horizontalLineTo(15.005f)
                verticalLineTo(13.003f)
                lineTo(18.505f, 10.003f)
                lineTo(15.005f, 7.003f)
                close()
                moveTo(9.005f, 17.003f)
                verticalLineTo(15.003f)
                horizontalLineTo(13.005f)
                verticalLineTo(13.003f)
                horizontalLineTo(9.005f)
                verticalLineTo(11.003f)
                lineTo(5.505f, 14.003f)
                lineTo(9.005f, 17.003f)
                close()
            }
        }
        .build()
        return _swapBoxFill!!
    }

private var _swapBoxFill: ImageVector? = null
