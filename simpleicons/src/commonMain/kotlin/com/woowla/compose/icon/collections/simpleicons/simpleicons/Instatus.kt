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

public val Simpleicons.Instatus: ImageVector
    get() {
        if (_instatus != null) {
            return _instatus!!
        }
        _instatus = Builder(name = "Instatus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.994f, 21.028f)
                curveToRelative(3.584f, -1.91f, 5.471f, -5.759f, 5.056f, -9.564f)
                curveToRelative(-1.321f, 1.085f, -2.624f, 2.32f, -3.871f, 3.691f)
                curveToRelative(-2.066f, 2.269f, -3.748f, 4.656f, -4.995f, 6.982f)
                curveToRelative(1.295f, -0.097f, 2.591f, -0.459f, 3.81f, -1.109f)
                close()
                moveTo(3.6f, 18.465f)
                curveToRelative(-1.341f, 1.819f, -2.377f, 4.499f, -1.303f, 5.307f)
                curveToRelative(1.515f, 1.139f, 8.404f, -2.013f, 13.908f, -8.805f)
                curveToRelative(5.504f, -6.792f, 7.326f, -13.796f, 4.879f, -14.873f)
                curveToRelative(-1.128f, -0.496f, -3.486f, 1.083f, -4.839f, 2.394f)
                lineToRelative(0.584f, 0.314f)
                curveToRelative(1.332f, -0.853f, 3.553f, -1.734f, 1.5f, 1.976f)
                curveToRelative(-0.01f, 0.018f, -0.02f, 0.035f, -0.029f, 0.053f)
                curveToRelative(-2.907f, -2.207f, -6.947f, -2.662f, -10.379f, -0.833f)
                curveToRelative(-4.703f, 2.506f, -6.483f, 8.35f, -3.977f, 13.052f)
                curveToRelative(0.59f, 1.107f, 1.364f, 2.052f, 2.266f, 2.817f)
                curveToRelative(-3.559f, 2.749f, -2.691f, 0.36f, -2.193f, -0.816f)
                close()
            }
        }
        .build()
        return _instatus!!
    }

private var _instatus: ImageVector? = null
