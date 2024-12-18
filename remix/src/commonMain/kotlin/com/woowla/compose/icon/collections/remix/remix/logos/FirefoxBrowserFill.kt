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

public val LogosGroup.FirefoxBrowserFill: ImageVector
    get() {
        if (_firefoxBrowserFill != null) {
            return _firefoxBrowserFill!!
        }
        _firefoxBrowserFill = Builder(name = "FirefoxBrowserFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.283f, 8.26f)
                curveTo(20.847f, 7.213f, 19.966f, 6.082f, 19.273f, 5.725f)
                curveTo(19.752f, 6.664f, 20.166f, 7.728f, 20.289f, 8.782f)
                curveTo(19.157f, 5.959f, 17.236f, 4.82f, 15.668f, 2.342f)
                curveTo(15.472f, 2.032f, 15.243f, 1.614f, 15.123f, 1.329f)
                curveTo(12.895f, 2.634f, 11.972f, 4.918f, 11.735f, 6.371f)
                curveTo(11.047f, 6.41f, 10.372f, 6.582f, 9.75f, 6.878f)
                curveTo(9.636f, 6.934f, 9.579f, 7.077f, 9.623f, 7.196f)
                curveTo(9.671f, 7.334f, 9.831f, 7.403f, 9.964f, 7.343f)
                curveTo(10.599f, 7.043f, 11.298f, 6.886f, 11.999f, 6.879f)
                curveTo(13.804f, 6.866f, 15.517f, 7.87f, 16.415f, 9.437f)
                curveTo(15.88f, 9.062f, 14.922f, 8.691f, 14.0f, 8.851f)
                curveTo(17.603f, 10.652f, 16.635f, 16.855f, 11.643f, 16.621f)
                curveTo(9.629f, 16.538f, 7.698f, 14.971f, 7.517f, 12.89f)
                curveTo(7.517f, 12.89f, 7.979f, 11.168f, 10.828f, 11.168f)
                curveTo(11.136f, 11.168f, 12.016f, 10.308f, 12.032f, 10.059f)
                curveTo(12.028f, 9.978f, 10.285f, 9.284f, 9.606f, 8.615f)
                curveTo(9.304f, 8.317f, 9.012f, 7.997f, 8.658f, 7.759f)
                curveTo(8.429f, 6.96f, 8.42f, 6.115f, 8.63f, 5.311f)
                curveTo(7.601f, 5.78f, 6.796f, 6.52f, 6.214f, 7.174f)
                curveTo(5.817f, 6.671f, 5.845f, 5.012f, 5.867f, 4.666f)
                curveTo(4.994f, 5.131f, 4.225f, 5.94f, 3.619f, 6.803f)
                curveTo(2.59f, 8.261f, 1.997f, 10.174f, 1.997f, 11.984f)
                curveTo(1.997f, 17.516f, 6.468f, 22.0f, 12.0f, 22.0f)
                curveTo(16.955f, 22.0f, 21.081f, 18.403f, 21.887f, 13.679f)
                curveTo(22.128f, 11.857f, 21.993f, 9.97f, 21.283f, 8.26f)
                close()
            }
        }
        .build()
        return _firefoxBrowserFill!!
    }

private var _firefoxBrowserFill: ImageVector? = null
