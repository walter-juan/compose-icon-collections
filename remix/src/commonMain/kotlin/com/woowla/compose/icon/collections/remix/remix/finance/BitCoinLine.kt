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

public val FinanceGroup.BitCoinLine: ImageVector
    get() {
        if (_bitCoinLine != null) {
            return _bitCoinLine!!
        }
        _bitCoinLine = Builder(name = "BitCoinLine", defaultWidth = 24.0.dp, defaultHeight =
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
                curveTo(20.005f, 7.585f, 16.423f, 4.003f, 12.005f, 4.003f)
                curveTo(7.587f, 4.003f, 4.005f, 7.585f, 4.005f, 12.003f)
                curveTo(4.005f, 16.421f, 7.587f, 20.003f, 12.005f, 20.003f)
                close()
                moveTo(11.005f, 16.003f)
                horizontalLineTo(8.005f)
                verticalLineTo(8.003f)
                horizontalLineTo(11.005f)
                verticalLineTo(6.003f)
                horizontalLineTo(13.005f)
                verticalLineTo(8.003f)
                horizontalLineTo(14.005f)
                curveTo(15.386f, 8.003f, 16.505f, 9.122f, 16.505f, 10.503f)
                curveTo(16.505f, 11.066f, 16.319f, 11.585f, 16.005f, 12.003f)
                curveTo(16.319f, 12.421f, 16.505f, 12.94f, 16.505f, 13.503f)
                curveTo(16.505f, 14.884f, 15.386f, 16.003f, 14.005f, 16.003f)
                horizontalLineTo(13.005f)
                verticalLineTo(18.003f)
                horizontalLineTo(11.005f)
                verticalLineTo(16.003f)
                close()
                moveTo(10.005f, 13.003f)
                verticalLineTo(14.003f)
                horizontalLineTo(14.005f)
                curveTo(14.281f, 14.003f, 14.505f, 13.779f, 14.505f, 13.503f)
                curveTo(14.505f, 13.227f, 14.281f, 13.003f, 14.005f, 13.003f)
                horizontalLineTo(10.005f)
                close()
                moveTo(10.005f, 10.003f)
                verticalLineTo(11.003f)
                horizontalLineTo(14.005f)
                curveTo(14.281f, 11.003f, 14.505f, 10.779f, 14.505f, 10.503f)
                curveTo(14.505f, 10.227f, 14.281f, 10.003f, 14.005f, 10.003f)
                horizontalLineTo(10.005f)
                close()
            }
        }
        .build()
        return _bitCoinLine!!
    }

private var _bitCoinLine: ImageVector? = null
