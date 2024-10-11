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

public val LogosGroup.IeLine: ImageVector
    get() {
        if (_ieLine != null) {
            return _ieLine!!
        }
        _ieLine = Builder(name = "IeLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.16f, 10.0f)
                curveTo(17.336f, 7.67f, 15.113f, 6.0f, 12.501f, 6.0f)
                curveTo(9.888f, 6.0f, 7.666f, 7.67f, 6.842f, 10.0f)
                horizontalLineTo(18.16f)
                close()
                moveTo(6.584f, 13.0f)
                curveTo(7.06f, 15.838f, 9.528f, 18.0f, 12.501f, 18.0f)
                curveTo(14.698f, 18.0f, 16.619f, 16.819f, 17.665f, 15.057f)
                horizontalLineTo(20.968f)
                curveTo(20.961f, 15.078f, 20.953f, 15.099f, 20.945f, 15.12f)
                curveTo(19.677f, 18.553f, 16.375f, 21.0f, 12.501f, 21.0f)
                curveTo(11.108f, 21.0f, 9.79f, 20.684f, 8.613f, 20.119f)
                curveTo(5.869f, 21.61f, 3.5f, 21.919f, 2.191f, 20.611f)
                curveTo(0.847f, 19.269f, 1.563f, 15.759f, 3.504f, 12.237f)
                curveTo(4.194f, 10.984f, 5.04f, 9.73f, 6.002f, 8.572f)
                curveTo(6.362f, 8.139f, 6.737f, 7.721f, 7.128f, 7.32f)
                curveTo(6.853f, 7.375f, 5.247f, 8.171f, 3.716f, 10.035f)
                curveTo(3.774f, 9.775f, 3.843f, 9.52f, 3.922f, 9.27f)
                curveTo(5.079f, 5.634f, 8.482f, 3.0f, 12.501f, 3.0f)
                curveTo(12.731f, 3.0f, 12.959f, 3.009f, 13.184f, 3.026f)
                curveTo(16.279f, 1.623f, 19.158f, 1.299f, 20.376f, 2.515f)
                curveTo(21.501f, 3.638f, 21.438f, 5.51f, 20.501f, 7.757f)
                curveTo(20.492f, 7.778f, 20.483f, 7.8f, 20.474f, 7.821f)
                curveTo(21.13f, 9.07f, 21.501f, 10.492f, 21.501f, 12.0f)
                curveTo(21.501f, 12.338f, 21.482f, 12.672f, 21.446f, 13.0f)
                horizontalLineTo(18.418f)
                horizontalLineTo(6.584f)
                close()
                moveTo(8.006f, 19.799f)
                curveTo(6.18f, 18.744f, 4.759f, 17.067f, 4.034f, 15.057f)
                curveTo(2.873f, 17.339f, 2.574f, 19.247f, 3.565f, 20.237f)
                curveTo(4.378f, 21.049f, 6.003f, 20.861f, 8.003f, 19.801f)
                lineTo(8.006f, 19.799f)
                close()
                moveTo(20.173f, 7.292f)
                curveTo(20.178f, 7.281f, 20.183f, 7.27f, 20.188f, 7.258f)
                curveTo(20.938f, 5.636f, 21.001f, 4.264f, 20.313f, 3.452f)
                curveTo(19.444f, 2.585f, 17.773f, 2.702f, 15.791f, 3.62f)
                curveTo(17.619f, 4.339f, 19.156f, 5.639f, 20.173f, 7.292f)
                close()
            }
        }
        .build()
        return _ieLine!!
    }

private var _ieLine: ImageVector? = null
