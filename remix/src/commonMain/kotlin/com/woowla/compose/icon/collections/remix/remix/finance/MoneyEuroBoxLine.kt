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

public val FinanceGroup.MoneyEuroBoxLine: ImageVector
    get() {
        if (_moneyEuroBoxLine != null) {
            return _moneyEuroBoxLine!!
        }
        _moneyEuroBoxLine = Builder(name = "MoneyEuroBoxLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(10.055f, 11.003f)
                horizontalLineTo(15.005f)
                verticalLineTo(13.003f)
                horizontalLineTo(10.055f)
                curveTo(10.286f, 14.144f, 11.295f, 15.003f, 12.505f, 15.003f)
                curveTo(13.12f, 15.003f, 13.683f, 14.781f, 14.119f, 14.412f)
                lineTo(15.82f, 15.546f)
                curveTo(14.997f, 16.441f, 13.817f, 17.003f, 12.505f, 17.003f)
                curveTo(10.189f, 17.003f, 8.281f, 15.253f, 8.032f, 13.003f)
                horizontalLineTo(7.005f)
                verticalLineTo(11.003f)
                horizontalLineTo(8.032f)
                curveTo(8.281f, 8.753f, 10.189f, 7.003f, 12.505f, 7.003f)
                curveTo(13.817f, 7.003f, 14.997f, 7.564f, 15.82f, 8.46f)
                lineTo(14.119f, 9.594f)
                curveTo(13.683f, 9.225f, 13.12f, 9.003f, 12.505f, 9.003f)
                curveTo(11.295f, 9.003f, 10.286f, 9.862f, 10.055f, 11.003f)
                close()
            }
        }
        .build()
        return _moneyEuroBoxLine!!
    }

private var _moneyEuroBoxLine: ImageVector? = null
