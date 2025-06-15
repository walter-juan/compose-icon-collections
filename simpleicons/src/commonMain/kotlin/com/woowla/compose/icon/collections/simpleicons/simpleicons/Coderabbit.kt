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

public val Simpleicons.Coderabbit: ImageVector
    get() {
        if (_coderabbit != null) {
            return _coderabbit!!
        }
        _coderabbit = Builder(name = "Coderabbit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.991f, 13.049f)
                curveTo(23.748f, 6.864f, 18.747f, 1.82f, 12.567f, 1.535f)
                curveTo(5.678f, 1.223f, 0.0f, 6.711f, 0.0f, 13.525f)
                curveToRelative(0.0f, 2.601f, 0.825f, 5.007f, 2.231f, 6.968f)
                curveToRelative(0.809f, 1.131f, 2.072f, 1.845f, 3.442f, 1.961f)
                curveToRelative(-2.014f, -2.284f, -0.301f, -4.192f, -0.301f, -4.192f)
                curveToRelative(-0.798f, 0.386f, -1.126f, 1.686f, -1.126f, 1.686f)
                curveToRelative(-1.512f, -0.93f, -1.163f, -2.041f, -1.163f, -2.041f)
                curveToRelative(0.095f, -0.233f, 0.312f, -0.872f, 1.475f, -0.64f)
                curveToRelative(2.252f, -7.417f, 9.67f, -3.553f, 9.67f, -3.553f)
                curveToRelative(-0.116f, -0.233f, -0.502f, -1.554f, -0.502f, -1.554f)
                curveToRelative(-4.816f, -0.698f, -6.444f, -4.113f, -6.444f, -4.113f)
                curveToRelative(4.467f, -1.359f, 7.185f, 2.331f, 7.185f, 2.331f)
                curveToRelative(-1.242f, -3.029f, -4.229f, -1.824f, -5.007f, -6.793f)
                curveToRelative(5.186f, 0.862f, 5.937f, 4.927f, 6.043f, 5.805f)
                curveToRelative(0.074f, -0.169f, 0.486f, -0.396f, 2.189f, -0.296f)
                curveToRelative(2.638f, 0.153f, 4.737f, 2.834f, 4.737f, 2.834f)
                curveToRelative(0.0f, 5.435f, -6.64f, 4.124f, -6.64f, 8.231f)
                curveToRelative(0.0f, 0.962f, 1.047f, 0.904f, 1.396f, 1.369f)
                curveToRelative(0.285f, 0.381f, 0.164f, 0.804f, 0.106f, 0.941f)
                horizontalLineToRelative(0.629f)
                curveToRelative(1.491f, 0.0f, 2.908f, -0.687f, 3.785f, -1.893f)
                curveToRelative(1.528f, -2.099f, 2.395f, -4.71f, 2.289f, -7.534f)
                close()
                moveTo(15.596f, 22.476f)
                curveToRelative(-1.153f, -0.381f, -2.268f, -2.982f, -3.653f, -2.982f)
                curveToRelative(1.94f, 1.168f, 1.116f, 2.717f, 0.957f, 2.982f)
                horizontalLineToRelative(2.701f)
                close()
            }
        }
        .build()
        return _coderabbit!!
    }

private var _coderabbit: ImageVector? = null
