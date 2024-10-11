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

public val DesignGroup.PenNibFill: ImageVector
    get() {
        if (_penNibFill != null) {
            return _penNibFill!!
        }
        _penNibFill = Builder(name = "PenNibFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.929f, 21.482f)
                lineTo(10.775f, 15.636f)
                curveTo(11.442f, 15.814f, 12.184f, 15.641f, 12.707f, 15.118f)
                curveTo(13.488f, 14.337f, 13.488f, 13.071f, 12.707f, 12.29f)
                curveTo(11.926f, 11.509f, 10.66f, 11.509f, 9.879f, 12.29f)
                curveTo(9.355f, 12.813f, 9.183f, 13.554f, 9.361f, 14.222f)
                lineTo(3.515f, 20.068f)
                lineTo(2.454f, 19.007f)
                curveTo(5.283f, 15.707f, 6.343f, 12.054f, 7.757f, 5.926f)
                lineTo(14.121f, 5.218f)
                lineTo(19.778f, 10.875f)
                lineTo(19.071f, 17.239f)
                curveTo(12.943f, 18.653f, 9.289f, 19.714f, 5.99f, 22.543f)
                lineTo(4.929f, 21.482f)
                close()
                moveTo(16.596f, 2.037f)
                lineTo(22.943f, 8.383f)
                curveTo(23.138f, 8.578f, 23.138f, 8.895f, 22.943f, 9.09f)
                curveTo(22.868f, 9.165f, 22.771f, 9.214f, 22.667f, 9.231f)
                lineTo(21.192f, 9.461f)
                lineTo(15.536f, 3.804f)
                lineTo(15.748f, 2.319f)
                curveTo(15.787f, 2.046f, 16.04f, 1.856f, 16.313f, 1.895f)
                curveTo(16.42f, 1.91f, 16.52f, 1.96f, 16.596f, 2.037f)
                close()
            }
        }
        .build()
        return _penNibFill!!
    }

private var _penNibFill: ImageVector? = null
