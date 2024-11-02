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

public val Simpleicons.Backblaze: ImageVector
    get() {
        if (_backblaze != null) {
            return _backblaze!!
        }
        _backblaze = Builder(name = "Backblaze", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.311f, 0.0f)
                curveToRelative(0.653f, 1.35f, 1.567f, 4.081f, -1.389f, 7.174f)
                curveToRelative(-1.81f, 1.88f, -3.078f, 3.849f, -2.35f, 6.064f)
                curveToRelative(0.364f, 1.104f, 1.186f, 2.508f, 2.887f, 2.785f)
                curveToRelative(0.611f, 0.101f, 1.342f, -0.001f, 1.74f, -0.141f)
                curveToRelative(2.454f, -0.854f, 2.098f, -3.414f, 1.555f, -5.047f)
                curveToRelative(-0.07f, -0.213f, -0.191f, -0.733f, -0.236f, -0.924f)
                curveToRelative(-0.373f, -1.602f, 0.776f, -2.656f, 1.129f, -3.805f)
                curveToRelative(0.028f, -0.093f, 0.053f, -0.182f, 0.07f, -0.271f)
                curveToRelative(0.042f, -0.21f, 0.067f, -0.423f, 0.078f, -0.639f)
                curveToRelative(0.0f, -1.826f, -0.988f, -2.63f, -1.775f, -3.6f)
                curveTo(10.179f, 0.564f, 9.311f, 0.0f, 9.311f, 0.0f)
                close()
                moveTo(15.586f, 6.018f)
                reflectiveCurveToRelative(-0.709f, 0.337f, -1.219f, 0.883f)
                curveToRelative(-0.445f, 0.482f, -0.863f, 0.879f, -1.295f, 1.859f)
                curveToRelative(-0.028f, 0.14f, -0.052f, 0.286f, -0.074f, 0.438f)
                curveToRelative(-0.233f, 1.642f, 1.147f, 3.145f, 0.719f, 5.189f)
                curveToRelative(-0.112f, 0.535f, -0.355f, 0.712f, -0.781f, 1.637f)
                curveToRelative(-0.51f, 1.107f, -0.383f, 2.588f, 0.359f, 3.529f)
                curveToRelative(0.672f, 0.849f, 1.879f, 1.232f, 3.053f, 0.949f)
                curveToRelative(2.106f, -0.504f, 3.065f, -2.282f, 2.897f, -4.285f)
                curveToRelative(-0.132f, -1.58f, -0.815f, -2.754f, -2.754f, -4.961f)
                curveToRelative(-0.961f, -1.092f, -1.607f, -2.409f, -1.562f, -3.406f)
                curveToRelative(0.137f, -1.207f, 0.658f, -1.832f, 0.658f, -1.832f)
                close()
                moveTo(4.893f, 15.194f)
                curveToRelative(-0.022f, 0.014f, -0.044f, 0.061f, -0.059f, 0.16f)
                arcToRelative(0.047f, 0.047f, 0.0f, false, true, -0.006f, 0.02f)
                verticalLineToRelative(0.01f)
                curveToRelative(-0.115f, 0.541f, -0.165f, 1.823f, 0.115f, 2.969f)
                curveToRelative(0.353f, 1.443f, 1.418f, 3.902f, 4.412f, 5.129f)
                curveToRelative(2.518f, 1.034f, 5.718f, 0.541f, 7.85f, -1.627f)
                curveToRelative(0.529f, -0.544f, 0.408f, -0.49f, -0.488f, -0.201f)
                verticalLineToRelative(-0.002f)
                curveToRelative(-1.112f, 0.356f, -3.518f, 0.546f, -4.768f, -1.0f)
                curveToRelative(-1.524f, -1.885f, -0.43f, -3.363f, -1.357f, -3.15f)
                curveToRelative(-3.616f, 0.835f, -5.267f, -1.466f, -5.547f, -2.102f)
                curveToRelative(-0.002f, -0.002f, -0.086f, -0.249f, -0.152f, -0.205f)
                close()
            }
        }
        .build()
        return _backblaze!!
    }

private var _backblaze: ImageVector? = null
