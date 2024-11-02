package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Rumahweb: ImageVector
    get() {
        if (_rumahweb != null) {
            return _rumahweb!!
        }
        _rumahweb = Builder(name = "Rumahweb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.149f)
                curveToRelative(0.028f, -0.275f, 0.148f, -0.543f, 0.36f, -0.753f)
                lineToRelative(7.182f, -7.092f)
                arcToRelative(0.972f, 0.972f, 0.0f, false, true, 0.103f, -0.091f)
                curveToRelative(0.308f, -0.265f, 1.807f, -1.473f, 3.743f, -1.553f)
                horizontalLineToRelative(0.402f)
                curveToRelative(1.126f, 0.047f, 2.374f, 0.5f, 3.61f, 1.731f)
                curveToRelative(2.534f, 2.542f, 5.076f, 5.077f, 7.615f, 7.615f)
                curveToRelative(1.14f, 1.14f, 1.198f, 2.585f, 0.642f, 3.795f)
                arcToRelative(4.043f, 4.043f, 0.0f, false, true, -0.819f, 1.173f)
                arcToRelative(3.973f, 3.973f, 0.0f, false, true, -1.188f, 0.823f)
                curveToRelative(-1.208f, 0.537f, -2.646f, 0.458f, -3.86f, -0.753f)
                lineToRelative(-0.053f, -0.056f)
                lineToRelative(-6.222f, -6.061f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, false, -1.03f, -0.207f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, -0.499f, 0.325f)
                curveToRelative(-0.15f, 0.141f, -0.272f, 0.304f, -0.352f, 0.473f)
                curveToRelative(-0.136f, 0.291f, -0.141f, 0.627f, 0.085f, 0.907f)
                lineToRelative(6.806f, 6.802f)
                curveToRelative(0.483f, 0.485f, 0.481f, 1.27f, -0.005f, 1.752f)
                arcToRelative(1.246f, 1.246f, 0.0f, false, true, -1.758f, -0.004f)
                lineToRelative(-6.889f, -6.89f)
                curveToRelative(-0.999f, -1.138f, -1.021f, -2.48f, -0.488f, -3.614f)
                arcToRelative(4.087f, 4.087f, 0.0f, false, true, 2.185f, -2.05f)
                curveToRelative(1.183f, -0.468f, 2.553f, -0.365f, 3.679f, 0.731f)
                curveToRelative(2.103f, 2.044f, 4.197f, 4.098f, 6.304f, 6.138f)
                curveToRelative(0.359f, 0.356f, 0.76f, 0.392f, 1.085f, 0.248f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, 0.76f, -0.763f)
                curveToRelative(0.154f, -0.335f, 0.148f, -0.726f, -0.146f, -1.018f)
                curveToRelative(-2.54f, -2.533f, -5.07f, -5.077f, -7.615f, -7.605f)
                curveToRelative(-1.977f, -1.973f, -4.04f, -0.345f, -4.347f, -0.082f)
                lineToRelative(-7.178f, 7.086f)
                arcToRelative(1.245f, 1.245f, 0.0f, false, true, -1.757f, -0.003f)
                arcTo(1.248f, 1.248f, 0.0f, false, true, 0.0f, 12.402f)
                verticalLineToRelative(-0.253f)
                close()
            }
        }
        .build()
        return _rumahweb!!
    }

private var _rumahweb: ImageVector? = null
