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

public val FinanceGroup.ExchangeFill: ImageVector
    get() {
        if (_exchangeFill != null) {
            return _exchangeFill!!
        }
        _exchangeFill = Builder(name = "ExchangeFill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(12.005f, 9.003f)
                horizontalLineTo(8.005f)
                verticalLineTo(11.003f)
                horizontalLineTo(17.005f)
                lineTo(12.005f, 6.003f)
                verticalLineTo(9.003f)
                close()
                moveTo(7.005f, 13.003f)
                lineTo(12.005f, 18.003f)
                verticalLineTo(15.003f)
                horizontalLineTo(16.005f)
                verticalLineTo(13.003f)
                horizontalLineTo(7.005f)
                close()
            }
        }
        .build()
        return _exchangeFill!!
    }

private var _exchangeFill: ImageVector? = null
