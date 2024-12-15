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

public val Simpleicons.Mojeek: ImageVector
    get() {
        if (_mojeek != null) {
            return _mojeek!!
        }
        _mojeek = Builder(name = "Mojeek", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.141f, 16.488f)
                curveToRelative(-0.53f, 0.0f, -0.824f, -0.353f, -0.824f, -1.147f)
                curveToRelative(0.0f, -0.795f, 0.49f, -4.182f, 0.68f, -5.736f)
                curveToRelative(0.35f, -2.885f, -1.313f, -4.976f, -3.725f, -4.976f)
                curveToRelative(-1.912f, 0.0f, -3.37f, 0.756f, -4.514f, 1.973f)
                curveToRelative(-0.776f, -1.173f, -1.648f, -1.973f, -3.343f, -1.973f)
                curveToRelative(-1.652f, 0.0f, -2.676f, 0.605f, -3.684f, 1.574f)
                curveTo(6.189f, 5.138f, 5.222f, 4.63f, 3.777f, 4.63f)
                curveTo(2.578f, 4.629f, 0.967f, 5.23f, 0.0f, 5.825f)
                lineToRelative(1.077f, 2.44f)
                curveToRelative(0.734f, -0.409f, 1.336f, -0.718f, 1.853f, -0.718f)
                curveToRelative(0.566f, 0.0f, 0.902f, 0.408f, 0.808f, 1.262f)
                curveToRelative(-0.09f, 0.824f, -1.09f, 10.268f, -1.09f, 10.268f)
                horizontalLineTo(5.9f)
                reflectiveCurveToRelative(0.638f, -6.061f, 0.863f, -7.885f)
                curveToRelative(0.264f, -2.137f, 1.299f, -3.49f, 2.774f, -3.49f)
                curveToRelative(1.294f, 0.0f, 1.735f, 1.018f, 1.642f, 2.21f)
                curveToRelative(-0.08f, 1.037f, -1.025f, 9.165f, -1.025f, 9.165f)
                horizontalLineToRelative(3.27f)
                reflectiveCurveToRelative(0.72f, -6.738f, 0.946f, -8.408f)
                curveToRelative(0.293f, -2.17f, 1.692f, -2.967f, 2.57f, -2.967f)
                curveToRelative(1.443f, 0.0f, 1.882f, 1.18f, 1.747f, 2.299f)
                curveToRelative(-0.11f, 0.91f, -0.5f, 4.118f, -0.62f, 5.782f)
                curveToRelative(-0.147f, 2.058f, 0.824f, 3.589f, 2.663f, 3.589f)
                curveToRelative(1.206f, 0.0f, 2.412f, -0.344f, 3.27f, -0.835f)
                lineToRelative(-0.703f, -2.413f)
                curveToRelative(-0.41f, 0.177f, -0.797f, 0.364f, -1.155f, 0.364f)
            }
        }
        .build()
        return _mojeek!!
    }

private var _mojeek: ImageVector? = null
