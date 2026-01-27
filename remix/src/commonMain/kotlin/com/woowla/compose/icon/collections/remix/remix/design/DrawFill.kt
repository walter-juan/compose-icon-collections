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

public val DesignGroup.DrawFill: ImageVector
    get() {
        if (_drawFill != null) {
            return _drawFill!!
        }
        _drawFill = Builder(name = "DrawFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.656f, 2.101f)
                curveTo(18.047f, 1.71f, 18.681f, 1.71f, 19.071f, 2.101f)
                lineTo(21.899f, 4.929f)
                curveTo(22.29f, 5.319f, 22.29f, 5.952f, 21.899f, 6.343f)
                lineTo(18.228f, 10.014f)
                curveTo(19.088f, 11.133f, 19.771f, 12.25f, 20.226f, 13.286f)
                curveTo(20.608f, 14.153f, 20.854f, 15.012f, 20.887f, 15.798f)
                curveTo(20.92f, 16.584f, 20.738f, 17.404f, 20.132f, 18.011f)
                curveTo(19.319f, 18.824f, 18.14f, 18.875f, 17.091f, 18.66f)
                curveTo(16.006f, 18.438f, 14.788f, 17.885f, 13.563f, 17.11f)
                lineTo(14.634f, 15.42f)
                curveTo(15.739f, 16.119f, 16.726f, 16.544f, 17.492f, 16.701f)
                curveTo(18.294f, 16.866f, 18.615f, 16.7f, 18.718f, 16.597f)
                curveTo(18.795f, 16.52f, 18.907f, 16.331f, 18.889f, 15.882f)
                curveTo(18.87f, 15.431f, 18.718f, 14.825f, 18.396f, 14.093f)
                curveTo(18.039f, 13.282f, 17.499f, 12.376f, 16.801f, 11.44f)
                lineTo(14.828f, 13.414f)
                curveTo(14.641f, 13.602f, 14.386f, 13.707f, 14.121f, 13.707f)
                horizontalLineTo(11.293f)
                curveTo(10.741f, 13.707f, 10.293f, 13.259f, 10.293f, 12.707f)
                verticalLineTo(9.879f)
                curveTo(10.293f, 9.614f, 10.398f, 9.359f, 10.586f, 9.172f)
                lineTo(12.442f, 7.313f)
                curveTo(11.484f, 6.749f, 10.512f, 6.371f, 9.596f, 6.188f)
                curveTo(7.887f, 5.846f, 6.497f, 6.188f, 5.636f, 7.05f)
                curveTo(4.774f, 7.911f, 4.432f, 9.302f, 4.773f, 11.011f)
                curveTo(5.114f, 12.711f, 6.12f, 14.605f, 7.757f, 16.242f)
                curveTo(9.515f, 18.0f, 11.565f, 19.029f, 13.352f, 19.29f)
                lineTo(13.063f, 21.269f)
                curveTo(10.785f, 20.935f, 8.355f, 19.669f, 6.343f, 17.657f)
                curveTo(4.465f, 15.78f, 3.24f, 13.541f, 2.812f, 11.402f)
                curveTo(2.387f, 9.272f, 2.74f, 7.117f, 4.222f, 5.636f)
                curveTo(5.703f, 4.154f, 7.858f, 3.801f, 9.988f, 4.227f)
                curveTo(11.288f, 4.487f, 12.625f, 5.043f, 13.896f, 5.86f)
                lineTo(17.656f, 2.101f)
                close()
            }
        }
        .build()
        return _drawFill!!
    }

private var _drawFill: ImageVector? = null
