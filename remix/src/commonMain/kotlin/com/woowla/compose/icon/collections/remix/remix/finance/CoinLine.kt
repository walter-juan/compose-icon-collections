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

public val FinanceGroup.CoinLine: ImageVector
    get() {
        if (_coinLine != null) {
            return _coinLine!!
        }
        _coinLine = Builder(name = "CoinLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.005f, 4.003f)
                curveTo(18.08f, 4.003f, 23.005f, 6.689f, 23.005f, 10.003f)
                verticalLineTo(14.003f)
                curveTo(23.005f, 17.316f, 18.08f, 20.003f, 12.005f, 20.003f)
                curveTo(6.038f, 20.003f, 1.181f, 17.412f, 1.01f, 14.18f)
                lineTo(1.005f, 14.003f)
                verticalLineTo(10.003f)
                curveTo(1.005f, 6.689f, 5.93f, 4.003f, 12.005f, 4.003f)
                close()
                moveTo(12.005f, 16.003f)
                curveTo(8.284f, 16.003f, 4.995f, 14.995f, 3.005f, 13.453f)
                lineTo(3.005f, 14.003f)
                curveTo(3.005f, 15.885f, 6.888f, 18.003f, 12.005f, 18.003f)
                curveTo(17.016f, 18.003f, 20.843f, 15.972f, 21.0f, 14.121f)
                lineTo(21.005f, 14.003f)
                lineTo(21.006f, 13.452f)
                curveTo(19.015f, 14.995f, 15.726f, 16.003f, 12.005f, 16.003f)
                close()
                moveTo(12.005f, 6.003f)
                curveTo(6.888f, 6.003f, 3.005f, 8.121f, 3.005f, 10.003f)
                curveTo(3.005f, 11.885f, 6.888f, 14.003f, 12.005f, 14.003f)
                curveTo(17.122f, 14.003f, 21.005f, 11.885f, 21.005f, 10.003f)
                curveTo(21.005f, 8.121f, 17.122f, 6.003f, 12.005f, 6.003f)
                close()
            }
        }
        .build()
        return _coinLine!!
    }

private var _coinLine: ImageVector? = null
