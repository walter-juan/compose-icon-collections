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

public val LogosGroup.SkypeFill: ImageVector
    get() {
        if (_skypeFill != null) {
            return _skypeFill!!
        }
        _skypeFill = Builder(name = "SkypeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.311f, 20.4f)
                curveTo(12.884f, 20.466f, 12.446f, 20.5f, 12.001f, 20.5f)
                curveTo(7.307f, 20.5f, 3.501f, 16.694f, 3.501f, 12.0f)
                curveTo(3.501f, 11.554f, 3.535f, 11.117f, 3.601f, 10.69f)
                curveTo(3.218f, 9.961f, 3.001f, 9.131f, 3.001f, 8.25f)
                curveTo(3.001f, 5.351f, 5.351f, 3.0f, 8.251f, 3.0f)
                curveTo(9.132f, 3.0f, 9.962f, 3.217f, 10.691f, 3.6f)
                curveTo(11.118f, 3.534f, 11.556f, 3.5f, 12.001f, 3.5f)
                curveTo(16.695f, 3.5f, 20.501f, 7.306f, 20.501f, 12.0f)
                curveTo(20.501f, 12.446f, 20.467f, 12.883f, 20.401f, 13.31f)
                curveTo(20.784f, 14.039f, 21.001f, 14.869f, 21.001f, 15.75f)
                curveTo(21.001f, 18.649f, 18.65f, 21.0f, 15.751f, 21.0f)
                curveTo(14.87f, 21.0f, 14.04f, 20.783f, 13.311f, 20.4f)
                close()
                moveTo(12.053f, 17.156f)
                lineTo(12.013f, 17.156f)
                curveTo(14.885f, 17.156f, 16.316f, 15.77f, 16.316f, 13.913f)
                curveTo(16.316f, 12.715f, 15.764f, 11.442f, 13.59f, 10.955f)
                lineTo(11.607f, 10.515f)
                curveTo(10.852f, 10.343f, 9.985f, 10.115f, 9.985f, 9.4f)
                curveTo(9.985f, 8.685f, 10.604f, 8.187f, 11.709f, 8.187f)
                curveTo(13.939f, 8.187f, 13.736f, 9.715f, 14.84f, 9.715f)
                curveTo(15.416f, 9.715f, 15.933f, 9.373f, 15.933f, 8.785f)
                curveTo(15.933f, 7.415f, 13.736f, 6.385f, 11.877f, 6.385f)
                curveTo(9.856f, 6.385f, 7.704f, 7.244f, 7.704f, 9.529f)
                curveTo(7.704f, 10.627f, 8.098f, 11.799f, 10.263f, 12.342f)
                lineTo(12.953f, 13.013f)
                curveTo(13.769f, 13.215f, 13.971f, 13.672f, 13.971f, 14.085f)
                curveTo(13.971f, 14.772f, 13.287f, 15.443f, 12.053f, 15.443f)
                curveTo(9.636f, 15.443f, 9.975f, 13.585f, 8.679f, 13.585f)
                curveTo(8.098f, 13.585f, 7.676f, 13.984f, 7.676f, 14.557f)
                curveTo(7.676f, 15.671f, 9.028f, 17.156f, 12.053f, 17.156f)
                close()
            }
        }
        .build()
        return _skypeFill!!
    }

private var _skypeFill: ImageVector? = null
