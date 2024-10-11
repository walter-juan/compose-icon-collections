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

public val DesignGroup.ColorFilterLine: ImageVector
    get() {
        if (_colorFilterLine != null) {
            return _colorFilterLine!!
        }
        _colorFilterLine = Builder(name = "ColorFilterLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(14.209f, 3.0f, 16.0f, 4.791f, 16.0f, 7.0f)
                curveTo(16.0f, 7.544f, 15.892f, 8.062f, 15.696f, 8.533f)
                curveTo(14.055f, 8.709f, 12.504f, 9.558f, 11.48f, 10.967f)
                curveTo(10.221f, 10.803f, 9.145f, 10.054f, 8.534f, 8.999f)
                curveTo(8.195f, 8.411f, 8.0f, 7.73f, 8.0f, 7.0f)
                curveTo(8.0f, 4.791f, 9.791f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(17.764f, 8.672f)
                curveTo(17.917f, 8.141f, 18.0f, 7.58f, 18.0f, 7.0f)
                curveTo(18.0f, 3.686f, 15.314f, 1.0f, 12.0f, 1.0f)
                curveTo(8.686f, 1.0f, 6.0f, 3.686f, 6.0f, 7.0f)
                curveTo(6.0f, 7.58f, 6.082f, 8.141f, 6.236f, 8.672f)
                curveTo(5.699f, 8.805f, 5.172f, 9.014f, 4.67f, 9.304f)
                curveTo(1.8f, 10.961f, 0.817f, 14.63f, 2.474f, 17.5f)
                curveTo(4.131f, 20.37f, 7.8f, 21.353f, 10.67f, 19.696f)
                curveTo(11.172f, 19.406f, 11.617f, 19.054f, 12.0f, 18.655f)
                curveTo(12.383f, 19.054f, 12.828f, 19.406f, 13.33f, 19.696f)
                curveTo(16.2f, 21.353f, 19.869f, 20.37f, 21.526f, 17.5f)
                curveTo(23.183f, 14.63f, 22.2f, 10.961f, 19.33f, 9.304f)
                curveTo(18.828f, 9.014f, 18.301f, 8.805f, 17.764f, 8.672f)
                close()
                moveTo(13.154f, 16.934f)
                curveTo(13.823f, 15.425f, 13.863f, 13.657f, 13.155f, 12.067f)
                curveTo(13.926f, 11.058f, 15.113f, 10.5f, 16.332f, 10.499f)
                curveTo(17.01f, 10.499f, 17.698f, 10.671f, 18.33f, 11.036f)
                curveTo(20.243f, 12.14f, 20.899f, 14.587f, 19.794f, 16.5f)
                curveTo(18.69f, 18.413f, 16.243f, 19.069f, 14.33f, 17.964f)
                curveTo(13.859f, 17.692f, 13.465f, 17.34f, 13.154f, 16.934f)
                close()
                moveTo(11.365f, 12.967f)
                curveTo(11.853f, 14.139f, 11.743f, 15.446f, 11.134f, 16.502f)
                curveTo(10.795f, 17.09f, 10.302f, 17.599f, 9.67f, 17.964f)
                curveTo(7.757f, 19.069f, 5.31f, 18.413f, 4.206f, 16.5f)
                curveTo(3.101f, 14.587f, 3.757f, 12.141f, 5.67f, 11.036f)
                curveTo(6.141f, 10.764f, 6.644f, 10.599f, 7.15f, 10.533f)
                curveTo(8.123f, 11.866f, 9.634f, 12.785f, 11.365f, 12.967f)
                close()
            }
        }
        .build()
        return _colorFilterLine!!
    }

private var _colorFilterLine: ImageVector? = null
