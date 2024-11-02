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

public val Simpleicons.Shopee: ImageVector
    get() {
        if (_shopee != null) {
            return _shopee!!
        }
        _shopee = Builder(name = "Shopee", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.941f, 17.963f)
                curveToRelative(0.229f, -1.879f, -0.981f, -3.077f, -4.176f, -4.097f)
                curveToRelative(-1.548f, -0.528f, -2.277f, -1.22f, -2.26f, -2.172f)
                curveToRelative(0.065f, -1.056f, 1.048f, -1.825f, 2.352f, -1.85f)
                arcToRelative(5.29f, 5.29f, 0.0f, false, true, 2.884f, 0.89f)
                curveToRelative(0.116f, 0.072f, 0.197f, 0.06f, 0.263f, -0.039f)
                curveToRelative(0.09f, -0.145f, 0.315f, -0.494f, 0.39f, -0.62f)
                curveToRelative(0.051f, -0.081f, 0.061f, -0.187f, -0.068f, -0.281f)
                curveToRelative(-0.185f, -0.137f, -0.704f, -0.415f, -0.983f, -0.532f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, false, -2.512f, -0.514f)
                curveToRelative(-1.909f, 0.008f, -3.413f, 1.215f, -3.539f, 2.826f)
                curveToRelative(-0.082f, 1.163f, 0.494f, 2.108f, 1.73f, 2.828f)
                curveToRelative(0.262f, 0.152f, 1.68f, 0.716f, 2.244f, 0.892f)
                curveToRelative(1.774f, 0.552f, 2.695f, 1.542f, 2.478f, 2.697f)
                curveToRelative(-0.197f, 1.047f, -1.299f, 1.724f, -2.818f, 1.744f)
                curveToRelative(-1.204f, -0.046f, -2.288f, -0.537f, -3.128f, -1.19f)
                lineToRelative(-0.141f, -0.11f)
                curveToRelative(-0.104f, -0.08f, -0.218f, -0.075f, -0.287f, 0.03f)
                curveToRelative(-0.05f, 0.077f, -0.376f, 0.547f, -0.458f, 0.67f)
                curveToRelative(-0.077f, 0.108f, -0.035f, 0.168f, 0.045f, 0.234f)
                curveToRelative(0.35f, 0.293f, 0.817f, 0.613f, 1.134f, 0.775f)
                arcToRelative(6.71f, 6.71f, 0.0f, false, false, 2.829f, 0.727f)
                arcToRelative(4.905f, 4.905f, 0.0f, false, false, 2.076f, -0.354f)
                curveToRelative(1.095f, -0.465f, 1.803f, -1.394f, 1.945f, -2.554f)
                close()
                moveTo(11.999f, 1.401f)
                curveToRelative(-2.068f, 0.0f, -3.754f, 1.95f, -3.833f, 4.39f)
                horizontalLineToRelative(7.666f)
                curveToRelative(-0.08f, -2.44f, -1.765f, -4.39f, -3.833f, -4.39f)
                close()
                moveTo(19.85f, 23.999f)
                lineTo(19.77f, 24.0f)
                lineTo(3.986f, 23.998f)
                curveToRelative(-1.074f, -0.04f, -1.863f, -0.91f, -1.971f, -1.991f)
                lineToRelative(-0.01f, -0.195f)
                lineTo(1.298f, 6.286f)
                arcToRelative(0.459f, 0.459f, 0.0f, false, true, 0.45f, -0.494f)
                horizontalLineToRelative(4.975f)
                curveTo(6.845f, 2.568f, 9.161f, 0.0f, 12.0f, 0.0f)
                curveToRelative(2.839f, 0.0f, 5.154f, 2.569f, 5.276f, 5.79f)
                horizontalLineToRelative(4.968f)
                arcToRelative(0.459f, 0.459f, 0.0f, false, true, 0.458f, 0.483f)
                lineToRelative(-0.773f, 15.588f)
                lineToRelative(-0.007f, 0.131f)
                curveToRelative(-0.094f, 1.094f, -0.979f, 1.977f, -2.071f, 2.006f)
                close()
            }
        }
        .build()
        return _shopee!!
    }

private var _shopee: ImageVector? = null
