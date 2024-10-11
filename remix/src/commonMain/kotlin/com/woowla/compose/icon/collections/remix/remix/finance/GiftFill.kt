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

public val FinanceGroup.GiftFill: ImageVector
    get() {
        if (_giftFill != null) {
            return _giftFill!!
        }
        _giftFill = Builder(name = "GiftFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.005f, 2.003f)
                curveTo(17.214f, 2.003f, 19.005f, 3.794f, 19.005f, 6.003f)
                curveTo(19.005f, 6.732f, 18.81f, 7.415f, 18.469f, 8.004f)
                lineTo(23.005f, 8.003f)
                verticalLineTo(10.003f)
                horizontalLineTo(21.005f)
                verticalLineTo(20.003f)
                curveTo(21.005f, 20.555f, 20.557f, 21.003f, 20.005f, 21.003f)
                horizontalLineTo(4.005f)
                curveTo(3.453f, 21.003f, 3.005f, 20.555f, 3.005f, 20.003f)
                verticalLineTo(10.003f)
                horizontalLineTo(1.005f)
                verticalLineTo(8.003f)
                lineTo(5.541f, 8.004f)
                curveTo(5.2f, 7.415f, 5.005f, 6.732f, 5.005f, 6.003f)
                curveTo(5.005f, 3.794f, 6.796f, 2.003f, 9.005f, 2.003f)
                curveTo(10.2f, 2.003f, 11.273f, 2.527f, 12.006f, 3.358f)
                curveTo(12.737f, 2.527f, 13.81f, 2.003f, 15.005f, 2.003f)
                close()
                moveTo(13.005f, 10.003f)
                horizontalLineTo(11.005f)
                verticalLineTo(20.003f)
                horizontalLineTo(13.005f)
                verticalLineTo(10.003f)
                close()
                moveTo(9.005f, 4.003f)
                curveTo(7.9f, 4.003f, 7.005f, 4.898f, 7.005f, 6.003f)
                curveTo(7.005f, 7.057f, 7.821f, 7.921f, 8.856f, 7.997f)
                lineTo(9.005f, 8.003f)
                horizontalLineTo(11.005f)
                verticalLineTo(6.003f)
                curveTo(11.005f, 5.001f, 10.269f, 4.172f, 9.308f, 4.026f)
                lineTo(9.154f, 4.008f)
                lineTo(9.005f, 4.003f)
                close()
                moveTo(15.005f, 4.003f)
                curveTo(13.95f, 4.003f, 13.087f, 4.819f, 13.01f, 5.854f)
                lineTo(13.005f, 6.003f)
                verticalLineTo(8.003f)
                horizontalLineTo(15.005f)
                curveTo(16.059f, 8.003f, 16.923f, 7.187f, 16.999f, 6.152f)
                lineTo(17.005f, 6.003f)
                curveTo(17.005f, 4.898f, 16.11f, 4.003f, 15.005f, 4.003f)
                close()
            }
        }
        .build()
        return _giftFill!!
    }

private var _giftFill: ImageVector? = null
