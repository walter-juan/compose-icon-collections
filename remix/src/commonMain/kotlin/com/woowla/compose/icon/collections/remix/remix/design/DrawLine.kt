package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.DrawLine: ImageVector
    get() {
        if (_drawLine != null) {
            return _drawLine!!
        }
        _drawLine = Builder(name = "DrawLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.364f, 1.808f)
                curveTo(18.629f, 1.808f, 18.884f, 1.913f, 19.071f, 2.101f)
                lineTo(21.899f, 4.929f)
                curveTo(22.29f, 5.319f, 22.29f, 5.952f, 21.899f, 6.343f)
                lineTo(18.228f, 10.015f)
                curveTo(19.283f, 11.387f, 20.077f, 12.767f, 20.511f, 14.006f)
                curveTo(20.765f, 14.732f, 20.913f, 15.457f, 20.888f, 16.128f)
                curveTo(20.862f, 16.806f, 20.653f, 17.49f, 20.132f, 18.011f)
                curveTo(19.319f, 18.824f, 18.14f, 18.875f, 17.091f, 18.66f)
                curveTo(16.006f, 18.438f, 14.789f, 17.885f, 13.565f, 17.11f)
                lineTo(14.634f, 15.42f)
                curveTo(15.739f, 16.119f, 16.727f, 16.544f, 17.493f, 16.701f)
                curveTo(18.295f, 16.865f, 18.615f, 16.7f, 18.718f, 16.597f)
                curveTo(18.786f, 16.529f, 18.877f, 16.382f, 18.89f, 16.052f)
                curveTo(18.903f, 15.713f, 18.827f, 15.249f, 18.623f, 14.667f)
                curveTo(18.295f, 13.732f, 17.676f, 12.616f, 16.8f, 11.442f)
                lineTo(14.828f, 13.414f)
                curveTo(14.641f, 13.602f, 14.386f, 13.707f, 14.121f, 13.707f)
                horizontalLineTo(11.293f)
                curveTo(10.741f, 13.707f, 10.293f, 13.259f, 10.293f, 12.707f)
                verticalLineTo(9.879f)
                curveTo(10.293f, 9.614f, 10.399f, 9.359f, 10.586f, 9.172f)
                lineTo(12.443f, 7.313f)
                curveTo(11.236f, 6.602f, 10.012f, 6.192f, 8.91f, 6.086f)
                curveTo(7.511f, 5.952f, 6.38f, 6.305f, 5.636f, 7.05f)
                curveTo(4.774f, 7.911f, 4.432f, 9.302f, 4.774f, 11.011f)
                curveTo(5.114f, 12.711f, 6.121f, 14.605f, 7.758f, 16.242f)
                curveTo(9.516f, 18.0f, 11.565f, 19.029f, 13.353f, 19.29f)
                lineTo(13.064f, 21.269f)
                curveTo(10.785f, 20.935f, 8.355f, 19.669f, 6.343f, 17.657f)
                curveTo(4.465f, 15.78f, 3.24f, 13.542f, 2.813f, 11.403f)
                curveTo(2.387f, 9.273f, 2.74f, 7.117f, 4.222f, 5.636f)
                curveTo(5.496f, 4.361f, 7.278f, 3.92f, 9.102f, 4.095f)
                curveTo(10.68f, 4.246f, 12.342f, 4.86f, 13.897f, 5.86f)
                lineTo(17.657f, 2.101f)
                lineTo(17.731f, 2.034f)
                curveTo(17.909f, 1.888f, 18.132f, 1.808f, 18.364f, 1.808f)
                close()
                moveTo(12.293f, 10.293f)
                verticalLineTo(11.707f)
                horizontalLineTo(13.707f)
                lineTo(19.778f, 5.636f)
                lineTo(18.364f, 4.222f)
                lineTo(12.293f, 10.293f)
                close()
            }
        }
        .build()
        return _drawLine!!
    }

private var _drawLine: ImageVector? = null
