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

public val FinanceGroup.CoinsFill: ImageVector
    get() {
        if (_coinsFill != null) {
            return _coinsFill!!
        }
        _coinsFill = Builder(name = "CoinsFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.005f, 2.003f)
                curveTo(18.423f, 2.003f, 22.005f, 5.584f, 22.005f, 10.003f)
                curveTo(22.005f, 13.247f, 20.073f, 16.041f, 17.297f, 17.296f)
                curveTo(16.042f, 20.072f, 13.249f, 22.003f, 10.005f, 22.003f)
                curveTo(5.587f, 22.003f, 2.005f, 18.421f, 2.005f, 14.003f)
                curveTo(2.005f, 10.759f, 3.936f, 7.965f, 6.711f, 6.71f)
                curveTo(7.967f, 3.934f, 10.76f, 2.003f, 14.005f, 2.003f)
                close()
                moveTo(11.005f, 9.003f)
                horizontalLineTo(9.005f)
                verticalLineTo(10.003f)
                curveTo(7.624f, 10.003f, 6.505f, 11.122f, 6.505f, 12.503f)
                curveTo(6.505f, 13.828f, 7.536f, 14.913f, 8.841f, 14.997f)
                lineTo(9.005f, 15.003f)
                horizontalLineTo(11.005f)
                lineTo(11.095f, 15.011f)
                curveTo(11.328f, 15.053f, 11.505f, 15.257f, 11.505f, 15.503f)
                curveTo(11.505f, 15.748f, 11.328f, 15.952f, 11.095f, 15.995f)
                lineTo(11.005f, 16.003f)
                horizontalLineTo(7.005f)
                verticalLineTo(18.003f)
                horizontalLineTo(9.005f)
                verticalLineTo(19.003f)
                horizontalLineTo(11.005f)
                verticalLineTo(18.003f)
                curveTo(12.386f, 18.003f, 13.505f, 16.883f, 13.505f, 15.503f)
                curveTo(13.505f, 14.177f, 12.473f, 13.093f, 11.169f, 13.008f)
                lineTo(11.005f, 13.003f)
                horizontalLineTo(9.005f)
                lineTo(8.915f, 12.995f)
                curveTo(8.682f, 12.952f, 8.505f, 12.748f, 8.505f, 12.503f)
                curveTo(8.505f, 12.257f, 8.682f, 12.053f, 8.915f, 12.011f)
                lineTo(9.005f, 12.003f)
                horizontalLineTo(13.005f)
                verticalLineTo(10.003f)
                horizontalLineTo(11.005f)
                verticalLineTo(9.003f)
                close()
                moveTo(14.005f, 4.003f)
                curveTo(12.221f, 4.003f, 10.62f, 4.781f, 9.521f, 6.016f)
                curveTo(9.681f, 6.008f, 9.843f, 6.003f, 10.005f, 6.003f)
                curveTo(14.423f, 6.003f, 18.005f, 9.584f, 18.005f, 14.003f)
                curveTo(18.005f, 14.165f, 18.0f, 14.327f, 17.99f, 14.487f)
                curveTo(19.226f, 13.389f, 20.005f, 11.786f, 20.005f, 10.003f)
                curveTo(20.005f, 6.689f, 17.319f, 4.003f, 14.005f, 4.003f)
                close()
            }
        }
        .build()
        return _coinsFill!!
    }

private var _coinsFill: ImageVector? = null
