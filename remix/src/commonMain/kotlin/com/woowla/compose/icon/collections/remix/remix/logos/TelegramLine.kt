package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.TelegramLine: ImageVector
    get() {
        if (_telegramLine != null) {
            return _telegramLine!!
        }
        _telegramLine = Builder(name = "TelegramLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 16.418f, 16.418f, 20.0f, 12.0f, 20.0f)
                curveTo(7.582f, 20.0f, 4.0f, 16.418f, 4.0f, 12.0f)
                curveTo(4.0f, 7.582f, 7.582f, 4.0f, 12.0f, 4.0f)
                curveTo(16.418f, 4.0f, 20.0f, 7.582f, 20.0f, 12.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                curveTo(22.0f, 6.477f, 17.523f, 2.0f, 12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                curveTo(2.0f, 17.523f, 6.477f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(12.358f, 9.382f)
                curveTo(11.386f, 9.787f, 9.442f, 10.624f, 6.527f, 11.894f)
                curveTo(6.053f, 12.083f, 5.805f, 12.267f, 5.783f, 12.447f)
                curveTo(5.745f, 12.751f, 6.126f, 12.871f, 6.645f, 13.034f)
                curveTo(6.715f, 13.057f, 6.788f, 13.08f, 6.863f, 13.104f)
                curveTo(7.374f, 13.27f, 8.061f, 13.464f, 8.418f, 13.472f)
                curveTo(8.742f, 13.479f, 9.103f, 13.345f, 9.502f, 13.071f)
                curveTo(12.226f, 11.233f, 13.632f, 10.303f, 13.72f, 10.283f)
                curveTo(13.783f, 10.269f, 13.869f, 10.251f, 13.927f, 10.303f)
                curveTo(13.986f, 10.355f, 13.98f, 10.454f, 13.974f, 10.48f)
                curveTo(13.936f, 10.641f, 12.44f, 12.032f, 11.666f, 12.752f)
                curveTo(11.435f, 12.966f, 11.21f, 13.185f, 10.983f, 13.404f)
                curveTo(10.509f, 13.861f, 10.153f, 14.204f, 11.003f, 14.764f)
                curveTo(11.864f, 15.332f, 12.732f, 15.898f, 13.572f, 16.497f)
                curveTo(13.987f, 16.792f, 14.359f, 17.058f, 14.819f, 17.016f)
                curveTo(15.086f, 16.991f, 15.362f, 16.74f, 15.502f, 15.99f)
                curveTo(15.833f, 14.219f, 16.485f, 10.382f, 16.635f, 8.801f)
                curveTo(16.648f, 8.662f, 16.632f, 8.485f, 16.618f, 8.407f)
                curveTo(16.605f, 8.329f, 16.577f, 8.218f, 16.476f, 8.136f)
                curveTo(16.356f, 8.039f, 16.171f, 8.019f, 16.089f, 8.02f)
                curveTo(15.712f, 8.027f, 15.135f, 8.227f, 12.358f, 9.382f)
                close()
            }
        }
        .build()
        return _telegramLine!!
    }

private var _telegramLine: ImageVector? = null
