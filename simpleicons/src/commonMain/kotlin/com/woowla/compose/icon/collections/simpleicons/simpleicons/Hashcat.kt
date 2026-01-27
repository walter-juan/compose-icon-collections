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

public val Simpleicons.Hashcat: ImageVector
    get() {
        if (_hashcat != null) {
            return _hashcat!!
        }
        _hashcat = Builder(name = "Hashcat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.977f, 0.0f)
                curveToRelative(-0.77f, 0.003f, -1.534f, 0.136f, -2.01f, 0.4f)
                curveTo(9.07f, 0.875f, 7.935f, 0.98f, 6.51f, 0.663f)
                lineTo(5.453f, 0.453f)
                lineToRelative(0.818f, 0.765f)
                curveToRelative(0.977f, 0.924f, 1.664f, 2.428f, 1.664f, 3.67f)
                curveToRelative(0.0f, 1.029f, 1.161f, 2.507f, 2.375f, 3.009f)
                curveToRelative(0.792f, 0.316f, 0.819f, 0.396f, 0.66f, 1.557f)
                curveToRelative(-0.791f, 5.887f, -1.504f, 8.422f, -2.771f, 9.873f)
                curveToRelative(-1.083f, 1.268f, -1.32f, 1.875f, -1.32f, 3.326f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(10.295f)
                verticalLineToRelative(-1.347f)
                curveToRelative(0.0f, -1.425f, -0.237f, -2.032f, -1.267f, -3.273f)
                curveToRelative(-1.293f, -1.557f, -2.217f, -4.752f, -2.64f, -9.16f)
                curveToRelative(-0.211f, -2.006f, -0.185f, -2.086f, 0.396f, -2.218f)
                curveToRelative(0.924f, -0.237f, 2.402f, -2.059f, 2.587f, -3.194f)
                curveToRelative(0.106f, -0.554f, 0.238f, -1.346f, 0.317f, -1.742f)
                curveToRelative(0.053f, -0.423f, 0.554f, -1.162f, 1.056f, -1.663f)
                lineToRelative(0.924f, -0.925f)
                lineToRelative(-1.03f, 0.185f)
                curveToRelative(-1.372f, 0.29f, -2.587f, 0.185f, -3.51f, -0.29f)
                curveToRelative(-0.49f, -0.25f, -1.261f, -0.376f, -2.03f, -0.373f)
                moveTo(9.039f, 5.257f)
                horizontalLineToRelative(0.004f)
                curveToRelative(0.238f, 0.0f, 2.06f, 1.082f, 2.06f, 1.214f)
                curveToRelative(0.0f, 0.317f, -0.872f, 0.026f, -1.505f, -0.554f)
                curveToRelative(-0.39f, -0.338f, -0.652f, -0.65f, -0.56f, -0.66f)
                moveToRelative(5.976f, 0.058f)
                curveToRelative(0.097f, -0.003f, -0.097f, 0.195f, -0.56f, 0.602f)
                curveToRelative(-0.396f, 0.37f, -0.924f, 0.66f, -1.161f, 0.66f)
                curveToRelative(-0.528f, 0.0f, -0.37f, -0.159f, 0.765f, -0.792f)
                curveToRelative(0.557f, -0.31f, 0.87f, -0.468f, 0.956f, -0.47f)
            }
        }
        .build()
        return _hashcat!!
    }

private var _hashcat: ImageVector? = null
