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

public val FinanceGroup.BtcLine: ImageVector
    get() {
        if (_btcLine != null) {
            return _btcLine!!
        }
        _btcLine = Builder(name = "BtcLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                close()
                moveTo(16.705f, 10.564f)
                curveTo(16.532f, 11.617f, 15.981f, 12.131f, 15.235f, 12.313f)
                curveTo(16.227f, 12.868f, 16.705f, 13.711f, 16.194f, 15.19f)
                curveTo(15.559f, 17.044f, 14.137f, 17.212f, 12.253f, 16.853f)
                lineTo(11.768f, 18.81f)
                lineTo(10.674f, 18.539f)
                lineTo(11.159f, 16.582f)
                curveTo(10.861f, 16.502f, 10.557f, 16.444f, 10.26f, 16.359f)
                lineTo(9.775f, 18.316f)
                lineTo(8.683f, 18.045f)
                lineTo(9.168f, 16.088f)
                lineTo(6.992f, 15.496f)
                lineTo(7.533f, 14.112f)
                curveTo(7.533f, 14.112f, 8.354f, 14.338f, 8.341f, 14.324f)
                curveTo(8.646f, 14.398f, 8.795f, 14.185f, 8.856f, 14.036f)
                lineTo(9.632f, 10.899f)
                lineTo(10.198f, 8.669f)
                curveTo(10.222f, 8.428f, 10.146f, 8.112f, 9.701f, 7.992f)
                curveTo(9.732f, 7.975f, 8.9f, 7.794f, 8.9f, 7.794f)
                lineTo(9.224f, 6.482f)
                lineTo(11.467f, 7.038f)
                lineTo(11.942f, 5.121f)
                lineTo(13.071f, 5.401f)
                lineTo(12.597f, 7.318f)
                curveTo(12.888f, 7.382f, 13.171f, 7.459f, 13.462f, 7.533f)
                lineTo(13.937f, 5.616f)
                lineTo(15.037f, 5.888f)
                lineTo(14.549f, 7.855f)
                curveTo(15.936f, 8.364f, 16.934f, 9.118f, 16.705f, 10.564f)
                close()
                moveTo(11.606f, 10.954f)
                curveTo(12.263f, 11.152f, 14.211f, 11.737f, 14.539f, 10.434f)
                curveTo(14.845f, 9.195f, 13.157f, 8.816f, 12.373f, 8.64f)
                curveTo(12.28f, 8.62f, 12.2f, 8.602f, 12.138f, 8.585f)
                lineTo(11.551f, 10.938f)
                lineTo(11.606f, 10.954f)
                close()
                moveTo(10.592f, 14.774f)
                lineTo(10.687f, 14.802f)
                curveTo(11.496f, 15.043f, 13.793f, 15.726f, 14.104f, 14.433f)
                curveTo(14.425f, 13.187f, 12.361f, 12.702f, 11.436f, 12.484f)
                curveTo(11.335f, 12.461f, 11.247f, 12.44f, 11.178f, 12.422f)
                lineTo(10.592f, 14.774f)
                close()
            }
        }
        .build()
        return _btcLine!!
    }

private var _btcLine: ImageVector? = null
