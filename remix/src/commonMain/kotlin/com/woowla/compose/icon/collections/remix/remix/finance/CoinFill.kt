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

public val FinanceGroup.CoinFill: ImageVector
    get() {
        if (_coinFill != null) {
            return _coinFill!!
        }
        _coinFill = Builder(name = "CoinFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.005f, 12.003f)
                verticalLineTo(14.003f)
                curveTo(23.005f, 17.316f, 18.08f, 20.003f, 12.005f, 20.003f)
                curveTo(6.038f, 20.003f, 1.181f, 17.412f, 1.01f, 14.18f)
                lineTo(1.005f, 14.003f)
                verticalLineTo(12.003f)
                curveTo(1.005f, 15.316f, 5.93f, 18.003f, 12.005f, 18.003f)
                curveTo(18.08f, 18.003f, 23.005f, 15.316f, 23.005f, 12.003f)
                close()
                moveTo(12.005f, 4.003f)
                curveTo(18.08f, 4.003f, 23.005f, 6.689f, 23.005f, 10.003f)
                curveTo(23.005f, 13.316f, 18.08f, 16.003f, 12.005f, 16.003f)
                curveTo(5.93f, 16.003f, 1.005f, 13.316f, 1.005f, 10.003f)
                curveTo(1.005f, 6.689f, 5.93f, 4.003f, 12.005f, 4.003f)
                close()
            }
        }
        .build()
        return _coinFill!!
    }

private var _coinFill: ImageVector? = null
