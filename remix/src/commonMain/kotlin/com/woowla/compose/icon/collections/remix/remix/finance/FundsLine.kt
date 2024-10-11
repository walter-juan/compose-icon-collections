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

public val FinanceGroup.FundsLine: ImageVector
    get() {
        if (_fundsLine != null) {
            return _fundsLine!!
        }
        _fundsLine = Builder(name = "FundsLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.411f, 14.526f)
                lineTo(7.812f, 11.124f)
                lineTo(10.641f, 13.953f)
                lineTo(13.798f, 10.796f)
                lineTo(12.005f, 9.003f)
                horizontalLineTo(17.005f)
                verticalLineTo(14.003f)
                lineTo(15.212f, 12.21f)
                lineTo(10.641f, 16.781f)
                lineTo(7.812f, 13.953f)
                lineTo(5.338f, 16.427f)
                curveTo(6.772f, 18.582f, 9.222f, 20.003f, 12.005f, 20.003f)
                curveTo(16.423f, 20.003f, 20.005f, 16.421f, 20.005f, 12.003f)
                curveTo(20.005f, 7.585f, 16.423f, 4.003f, 12.005f, 4.003f)
                curveTo(7.587f, 4.003f, 4.005f, 7.585f, 4.005f, 12.003f)
                curveTo(4.005f, 12.884f, 4.147f, 13.733f, 4.411f, 14.526f)
                close()
                moveTo(2.873f, 16.084f)
                lineTo(2.863f, 16.074f)
                lineTo(2.867f, 16.07f)
                curveTo(2.313f, 14.827f, 2.005f, 13.451f, 2.005f, 12.003f)
                curveTo(2.005f, 6.48f, 6.482f, 2.003f, 12.005f, 2.003f)
                curveTo(17.528f, 2.003f, 22.005f, 6.48f, 22.005f, 12.003f)
                curveTo(22.005f, 17.526f, 17.528f, 22.003f, 12.005f, 22.003f)
                curveTo(7.936f, 22.003f, 4.434f, 19.572f, 2.873f, 16.084f)
                close()
            }
        }
        .build()
        return _fundsLine!!
    }

private var _fundsLine: ImageVector? = null
