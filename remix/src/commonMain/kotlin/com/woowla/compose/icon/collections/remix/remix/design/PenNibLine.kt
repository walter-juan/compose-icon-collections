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

public val DesignGroup.PenNibLine: ImageVector
    get() {
        if (_penNibLine != null) {
            return _penNibLine!!
        }
        _penNibLine = Builder(name = "PenNibLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.596f, 1.037f)
                lineTo(22.943f, 7.383f)
                curveTo(23.138f, 7.578f, 23.138f, 7.895f, 22.943f, 8.09f)
                curveTo(22.868f, 8.165f, 22.771f, 8.214f, 22.667f, 8.231f)
                lineTo(21.192f, 8.461f)
                lineTo(15.536f, 2.804f)
                lineTo(15.748f, 1.319f)
                curveTo(15.787f, 1.046f, 16.04f, 0.856f, 16.313f, 0.895f)
                curveTo(16.42f, 0.91f, 16.52f, 0.96f, 16.596f, 1.037f)
                close()
                moveTo(4.595f, 20.148f)
                curveTo(8.317f, 16.816f, 12.59f, 15.82f, 17.238f, 14.627f)
                lineTo(17.684f, 10.61f)
                lineTo(13.387f, 6.312f)
                lineTo(9.369f, 6.759f)
                curveTo(8.177f, 11.407f, 7.18f, 15.679f, 3.849f, 19.402f)
                lineTo(2.454f, 18.007f)
                curveTo(5.283f, 14.707f, 6.343f, 11.054f, 7.757f, 4.926f)
                lineTo(14.121f, 4.218f)
                lineTo(19.778f, 9.875f)
                lineTo(19.071f, 16.239f)
                curveTo(12.943f, 17.653f, 9.289f, 18.714f, 5.99f, 21.543f)
                lineTo(4.595f, 20.148f)
                close()
                moveTo(9.879f, 14.118f)
                curveTo(9.098f, 13.337f, 9.098f, 12.071f, 9.879f, 11.29f)
                curveTo(10.66f, 10.509f, 11.926f, 10.509f, 12.707f, 11.29f)
                curveTo(13.488f, 12.071f, 13.488f, 13.337f, 12.707f, 14.118f)
                curveTo(11.926f, 14.899f, 10.66f, 14.899f, 9.879f, 14.118f)
                close()
            }
        }
        .build()
        return _penNibLine!!
    }

private var _penNibLine: ImageVector? = null
