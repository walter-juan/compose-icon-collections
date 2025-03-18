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

public val Simpleicons.Umbrel: ImageVector
    get() {
        if (_umbrel != null) {
            return _umbrel!!
        }
        _umbrel = Builder(name = "Umbrel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.853f, 8.302f)
                curveToRelative(2.628f, -0.05f, 4.698f, 0.656f, 6.303f, 2.05f)
                curveToRelative(1.166f, 1.01f, 2.14f, 2.43f, 2.895f, 4.305f)
                arcToRelative(7.584f, 7.584f, 0.0f, false, false, -1.818f, -0.21f)
                curveToRelative(-1.345f, 0.0f, -2.552f, 0.31f, -3.558f, 0.987f)
                curveToRelative(-1.127f, -0.687f, -2.339f, -1.049f, -3.623f, -1.049f)
                curveToRelative(-1.313f, 0.0f, -2.573f, 0.378f, -3.77f, 1.087f)
                curveToRelative(-1.154f, -0.726f, -2.456f, -1.087f, -3.875f, -1.087f)
                curveToRelative(-0.513f, 0.0f, -1.003f, 0.048f, -1.466f, 0.147f)
                curveToRelative(0.678f, -1.724f, 1.575f, -3.054f, 2.664f, -4.028f)
                curveToRelative(1.557f, -1.393f, 3.607f, -2.15f, 6.248f, -2.202f)
                close()
                moveTo(1.842f, 17.616f)
                curveToRelative(0.04f, -0.037f, 0.078f, -0.076f, 0.112f, -0.119f)
                curveToRelative(0.48f, -0.557f, 1.233f, -0.91f, 2.453f, -0.91f)
                curveToRelative(1.151f, 0.0f, 2.139f, 0.32f, 3.002f, 0.952f)
                lineToRelative(0.035f, 0.025f)
                curveToRelative(0.469f, 0.35f, 1.108f, 0.364f, 1.592f, 0.036f)
                curveToRelative(1.032f, -0.698f, 2.032f, -1.014f, 3.017f, -1.014f)
                curveToRelative(0.967f, 0.0f, 1.906f, 0.304f, 2.836f, 0.965f)
                lineToRelative(0.02f, 0.014f)
                arcToRelative(1.376f, 1.376f, 0.0f, false, false, 1.699f, -0.078f)
                curveToRelative(0.614f, -0.53f, 1.455f, -0.84f, 2.625f, -0.84f)
                curveToRelative(1.232f, 0.0f, 2.186f, 0.344f, 2.94f, 0.98f)
                arcToRelative(1.092f, 1.092f, 0.0f, false, false, 0.435f, 0.235f)
                arcToRelative(1.095f, 1.095f, 0.0f, false, false, 0.806f, -0.087f)
                arcToRelative(1.103f, 1.103f, 0.0f, false, false, 0.547f, -1.267f)
                curveToRelative(-0.873f, -3.383f, -2.3f, -6.03f, -4.363f, -7.82f)
                curveToRelative(-2.084f, -1.808f, -4.712f, -2.646f, -7.787f, -2.588f)
                curveToRelative(-3.063f, 0.06f, -5.653f, 0.955f, -7.673f, 2.762f)
                curveToRelative(-2.003f, 1.793f, -3.344f, 4.39f, -4.104f, 7.67f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, 1.807f, 1.083f)
                close()
            }
        }
        .build()
        return _umbrel!!
    }

private var _umbrel: ImageVector? = null
