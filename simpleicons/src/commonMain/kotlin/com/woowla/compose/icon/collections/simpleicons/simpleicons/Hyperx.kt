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

public val Simpleicons.Hyperx: ImageVector
    get() {
        if (_hyperx != null) {
            return _hyperx!!
        }
        _hyperx = Builder(name = "Hyperx", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.428f, 5.234f)
                curveToRelative(-0.036f, -0.005f, -0.055f, 0.05f, -0.055f, 0.05f)
                curveToRelative(-0.935f, 2.297f, -2.446f, 4.096f, -4.25f, 5.503f)
                curveToRelative(-2.157f, -1.445f, -4.476f, -2.16f, -6.477f, -2.5f)
                lineToRelative(0.508f, -1.695f)
                lineTo(10.56f, 6.592f)
                lineToRelative(-0.445f, 1.496f)
                curveToRelative(-2.12f, -0.194f, -3.61f, 0.004f, -3.664f, 0.008f)
                curveToRelative(-0.085f, 0.007f, -0.108f, 0.027f, -0.106f, 0.056f)
                curveToRelative(0.004f, 0.042f, 0.084f, 0.043f, 0.084f, 0.043f)
                curveToRelative(4.228f, 0.324f, 7.684f, 1.789f, 10.367f, 3.528f)
                curveTo(9.926f, 16.098f, 0.15f, 15.826f, 0.15f, 15.826f)
                curveToRelative(-0.123f, -0.002f, -0.149f, 0.019f, -0.15f, 0.065f)
                curveToRelative(-0.004f, 0.07f, 0.113f, 0.07f, 0.113f, 0.07f)
                curveToRelative(12.395f, 1.527f, 17.776f, -2.796f, 18.238f, -3.143f)
                curveToRelative(3.685f, 2.82f, 5.513f, 5.867f, 5.513f, 5.867f)
                curveToRelative(0.034f, 0.05f, 0.069f, 0.092f, 0.105f, 0.079f)
                curveToRelative(0.056f, -0.02f, 0.02f, -0.106f, 0.02f, -0.106f)
                curveToRelative(-1.062f, -3.053f, -2.666f, -5.243f, -4.475f, -6.808f)
                curveToRelative(2.846f, -2.757f, 2.926f, -6.242f, 2.945f, -6.499f)
                curveToRelative(0.01f, -0.113f, -0.01f, -0.115f, -0.03f, -0.117f)
                close()
                moveTo(4.939f, 6.592f)
                lineToRelative(-1.313f, 4.384f)
                horizontalLineToRelative(1.582f)
                lineToRelative(1.314f, -4.384f)
                close()
                moveTo(6.329f, 8.615f)
                lineTo(6.107f, 9.363f)
                horizontalLineToRelative(3.625f)
                curveToRelative(-0.09f, 0.297f, -0.483f, 1.613f, -0.483f, 1.613f)
                horizontalLineToRelative(1.594f)
                lineToRelative(0.422f, -1.414f)
                arcToRelative(21.95f, 21.949f, 0.0f, false, false, -4.936f, -0.947f)
                close()
            }
        }
        .build()
        return _hyperx!!
    }

private var _hyperx: ImageVector? = null
