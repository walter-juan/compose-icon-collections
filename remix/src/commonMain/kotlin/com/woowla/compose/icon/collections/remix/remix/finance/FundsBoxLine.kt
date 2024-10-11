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

public val FinanceGroup.FundsBoxLine: ImageVector
    get() {
        if (_fundsBoxLine != null) {
            return _fundsBoxLine!!
        }
        _fundsBoxLine = Builder(name = "FundsBoxLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.005f, 5.003f)
                verticalLineTo(19.003f)
                horizontalLineTo(20.005f)
                verticalLineTo(5.003f)
                horizontalLineTo(4.005f)
                close()
                moveTo(3.005f, 3.003f)
                horizontalLineTo(21.005f)
                curveTo(21.557f, 3.003f, 22.005f, 3.451f, 22.005f, 4.003f)
                verticalLineTo(20.003f)
                curveTo(22.005f, 20.555f, 21.557f, 21.003f, 21.005f, 21.003f)
                horizontalLineTo(3.005f)
                curveTo(2.453f, 21.003f, 2.005f, 20.555f, 2.005f, 20.003f)
                verticalLineTo(4.003f)
                curveTo(2.005f, 3.451f, 2.453f, 3.003f, 3.005f, 3.003f)
                close()
                moveTo(14.798f, 9.796f)
                lineTo(13.005f, 8.003f)
                horizontalLineTo(18.005f)
                verticalLineTo(13.003f)
                lineTo(16.212f, 11.21f)
                lineTo(12.348f, 15.074f)
                lineTo(10.227f, 12.953f)
                lineTo(7.398f, 15.781f)
                lineTo(5.984f, 14.367f)
                lineTo(10.227f, 10.124f)
                lineTo(12.348f, 12.245f)
                lineTo(14.798f, 9.796f)
                close()
            }
        }
        .build()
        return _fundsBoxLine!!
    }

private var _fundsBoxLine: ImageVector? = null