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

public val FinanceGroup.CurrencyLine: ImageVector
    get() {
        if (_currencyLine != null) {
            return _currencyLine!!
        }
        _currencyLine = Builder(name = "CurrencyLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.005f, 16.003f)
                horizontalLineTo(19.005f)
                verticalLineTo(4.003f)
                horizontalLineTo(9.005f)
                verticalLineTo(6.003f)
                horizontalLineTo(17.005f)
                verticalLineTo(16.003f)
                close()
                moveTo(17.005f, 18.003f)
                verticalLineTo(21.002f)
                curveTo(17.005f, 21.555f, 16.555f, 22.003f, 15.998f, 22.003f)
                horizontalLineTo(4.012f)
                curveTo(3.455f, 22.003f, 3.005f, 21.558f, 3.005f, 21.002f)
                lineTo(3.007f, 7.004f)
                curveTo(3.008f, 6.451f, 3.458f, 6.003f, 4.014f, 6.003f)
                horizontalLineTo(7.005f)
                verticalLineTo(3.003f)
                curveTo(7.005f, 2.45f, 7.452f, 2.003f, 8.005f, 2.003f)
                horizontalLineTo(20.005f)
                curveTo(20.557f, 2.003f, 21.005f, 2.45f, 21.005f, 3.003f)
                verticalLineTo(17.003f)
                curveTo(21.005f, 17.555f, 20.557f, 18.003f, 20.005f, 18.003f)
                horizontalLineTo(17.005f)
                close()
                moveTo(5.007f, 8.003f)
                lineTo(5.005f, 20.003f)
                horizontalLineTo(15.005f)
                verticalLineTo(8.003f)
                horizontalLineTo(5.007f)
                close()
                moveTo(7.005f, 16.003f)
                horizontalLineTo(11.505f)
                curveTo(11.781f, 16.003f, 12.005f, 15.779f, 12.005f, 15.503f)
                curveTo(12.005f, 15.227f, 11.781f, 15.003f, 11.505f, 15.003f)
                horizontalLineTo(8.505f)
                curveTo(7.124f, 15.003f, 6.005f, 13.884f, 6.005f, 12.503f)
                curveTo(6.005f, 11.122f, 7.124f, 10.003f, 8.505f, 10.003f)
                horizontalLineTo(9.005f)
                verticalLineTo(9.003f)
                horizontalLineTo(11.005f)
                verticalLineTo(10.003f)
                horizontalLineTo(13.005f)
                verticalLineTo(12.003f)
                horizontalLineTo(8.505f)
                curveTo(8.229f, 12.003f, 8.005f, 12.227f, 8.005f, 12.503f)
                curveTo(8.005f, 12.779f, 8.229f, 13.003f, 8.505f, 13.003f)
                horizontalLineTo(11.505f)
                curveTo(12.885f, 13.003f, 14.005f, 14.122f, 14.005f, 15.503f)
                curveTo(14.005f, 16.883f, 12.885f, 18.003f, 11.505f, 18.003f)
                horizontalLineTo(11.005f)
                verticalLineTo(19.003f)
                horizontalLineTo(9.005f)
                verticalLineTo(18.003f)
                horizontalLineTo(7.005f)
                verticalLineTo(16.003f)
                close()
            }
        }
        .build()
        return _currencyLine!!
    }

private var _currencyLine: ImageVector? = null
