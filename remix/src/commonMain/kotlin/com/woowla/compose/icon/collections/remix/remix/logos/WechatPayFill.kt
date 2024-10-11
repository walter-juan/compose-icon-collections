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

public val LogosGroup.WechatPayFill: ImageVector
    get() {
        if (_wechatPayFill != null) {
            return _wechatPayFill!!
        }
        _wechatPayFill = Builder(name = "WechatPayFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.271f, 14.669f)
                curveTo(8.953f, 14.831f, 8.564f, 14.712f, 8.391f, 14.4f)
                lineTo(8.348f, 14.305f)
                lineTo(6.53f, 10.307f)
                curveTo(6.523f, 10.259f, 6.523f, 10.21f, 6.53f, 10.161f)
                curveTo(6.53f, 10.073f, 6.566f, 9.989f, 6.629f, 9.928f)
                curveTo(6.692f, 9.866f, 6.777f, 9.832f, 6.865f, 9.834f)
                curveTo(6.936f, 9.833f, 7.005f, 9.856f, 7.061f, 9.9f)
                lineTo(9.242f, 11.427f)
                curveTo(9.403f, 11.535f, 9.593f, 11.593f, 9.787f, 11.594f)
                curveTo(9.904f, 11.594f, 10.02f, 11.572f, 10.129f, 11.528f)
                lineTo(20.176f, 7.028f)
                curveTo(18.091f, 4.725f, 15.11f, 3.439f, 12.005f, 3.502f)
                curveTo(6.479f, 3.502f, 2.001f, 7.232f, 2.001f, 11.87f)
                curveTo(2.067f, 14.405f, 3.356f, 16.751f, 5.462f, 18.166f)
                curveTo(5.688f, 18.333f, 5.784f, 18.624f, 5.701f, 18.893f)
                lineTo(5.251f, 20.594f)
                curveTo(5.223f, 20.671f, 5.206f, 20.752f, 5.2f, 20.834f)
                curveTo(5.198f, 20.923f, 5.232f, 21.009f, 5.296f, 21.073f)
                curveTo(5.359f, 21.136f, 5.445f, 21.17f, 5.534f, 21.168f)
                curveTo(5.601f, 21.164f, 5.666f, 21.145f, 5.723f, 21.11f)
                lineTo(7.904f, 19.845f)
                curveTo(8.064f, 19.747f, 8.247f, 19.694f, 8.435f, 19.692f)
                curveTo(8.534f, 19.692f, 8.632f, 19.707f, 8.726f, 19.736f)
                curveTo(9.788f, 20.036f, 10.886f, 20.188f, 11.99f, 20.187f)
                curveTo(17.515f, 20.187f, 22.001f, 16.457f, 22.001f, 11.855f)
                curveTo(22.011f, 10.483f, 21.63f, 9.137f, 20.903f, 7.973f)
                lineTo(9.351f, 14.625f)
                lineTo(9.271f, 14.669f)
                close()
            }
        }
        .build()
        return _wechatPayFill!!
    }

private var _wechatPayFill: ImageVector? = null
