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

public val FinanceGroup.MoneyEuroCircleFill: ImageVector
    get() {
        if (_moneyEuroCircleFill != null) {
            return _moneyEuroCircleFill!!
        }
        _moneyEuroCircleFill = Builder(name = "MoneyEuroCircleFill", defaultWidth = 24.0.dp,
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
                moveTo(10.055f, 11.003f)
                curveTo(10.286f, 9.862f, 11.295f, 9.003f, 12.505f, 9.003f)
                curveTo(13.12f, 9.003f, 13.683f, 9.225f, 14.119f, 9.594f)
                lineTo(15.82f, 8.46f)
                curveTo(14.997f, 7.564f, 13.817f, 7.003f, 12.505f, 7.003f)
                curveTo(10.189f, 7.003f, 8.281f, 8.753f, 8.032f, 11.003f)
                horizontalLineTo(7.005f)
                verticalLineTo(13.003f)
                horizontalLineTo(8.032f)
                curveTo(8.281f, 15.253f, 10.189f, 17.003f, 12.505f, 17.003f)
                curveTo(13.817f, 17.003f, 14.997f, 16.441f, 15.82f, 15.546f)
                lineTo(14.119f, 14.412f)
                curveTo(13.683f, 14.781f, 13.12f, 15.003f, 12.505f, 15.003f)
                curveTo(11.295f, 15.003f, 10.286f, 14.144f, 10.055f, 13.003f)
                horizontalLineTo(15.005f)
                verticalLineTo(11.003f)
                horizontalLineTo(10.055f)
                close()
            }
        }
        .build()
        return _moneyEuroCircleFill!!
    }

private var _moneyEuroCircleFill: ImageVector? = null
