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

public val FinanceGroup.CopperCoinLine: ImageVector
    get() {
        if (_copperCoinLine != null) {
            return _copperCoinLine!!
        }
        _copperCoinLine = Builder(name = "CopperCoinLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.005f, 22.003f)
                curveTo(6.482f, 22.003f, 2.005f, 17.526f, 2.005f, 12.003f)
                curveTo(2.005f, 6.48f, 6.482f, 2.003f, 12.005f, 2.003f)
                curveTo(17.528f, 2.003f, 22.005f, 6.48f, 22.005f, 12.003f)
                curveTo(22.005f, 17.526f, 17.528f, 22.003f, 12.005f, 22.003f)
                close()
                moveTo(12.005f, 20.003f)
                curveTo(16.423f, 20.003f, 20.005f, 16.421f, 20.005f, 12.003f)
                curveTo(20.005f, 7.584f, 16.423f, 4.003f, 12.005f, 4.003f)
                curveTo(7.587f, 4.003f, 4.005f, 7.584f, 4.005f, 12.003f)
                curveTo(4.005f, 16.421f, 7.587f, 20.003f, 12.005f, 20.003f)
                close()
                moveTo(12.005f, 7.053f)
                lineTo(16.955f, 12.003f)
                lineTo(12.005f, 16.952f)
                lineTo(7.055f, 12.003f)
                lineTo(12.005f, 7.053f)
                close()
                moveTo(12.005f, 9.881f)
                lineTo(9.884f, 12.003f)
                lineTo(12.005f, 14.124f)
                lineTo(14.126f, 12.003f)
                lineTo(12.005f, 9.881f)
                close()
            }
        }
        .build()
        return _copperCoinLine!!
    }

private var _copperCoinLine: ImageVector? = null
