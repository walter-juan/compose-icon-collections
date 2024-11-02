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

public val Simpleicons.Vectary: ImageVector
    get() {
        if (_vectary != null) {
            return _vectary!!
        }
        _vectary = Builder(name = "Vectary", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.18f, 2.318f)
                arcToRelative(6.62f, 6.62f, 0.0f, false, false, -0.273f, 0.012f)
                curveToRelative(-0.628f, 0.017f, -1.294f, 0.412f, -1.609f, 0.955f)
                curveToRelative(-0.342f, 0.527f, -0.395f, 1.301f, -0.127f, 1.869f)
                lineToRelative(4.272f, 9.668f)
                curveToRelative(0.239f, 0.581f, 0.845f, 1.062f, 1.465f, 1.164f)
                curveToRelative(0.614f, 0.132f, 1.355f, -0.094f, 1.791f, -0.547f)
                curveToRelative(1.038f, -1.005f, 1.847f, -2.464f, 2.142f, -4.022f)
                curveToRelative(0.296f, -1.557f, 0.079f, -3.212f, -0.52f, -4.527f)
                curveToRelative(-0.57f, -1.328f, -1.648f, -2.603f, -2.998f, -3.434f)
                curveToRelative(-1.266f, -0.779f, -2.771f, -1.168f, -4.143f, -1.139f)
                close()
                moveTo(21.037f, 2.318f)
                curveToRelative(-0.953f, 0.017f, -1.935f, 0.207f, -2.834f, 0.59f)
                curveToRelative(-1.798f, 0.765f, -3.267f, 2.3f, -3.914f, 3.861f)
                lineTo(8.172f, 20.621f)
                curveToRelative(-0.051f, 0.11f, -0.051f, 0.252f, -0.002f, 0.363f)
                curveToRelative(0.046f, 0.112f, 0.149f, 0.21f, 0.264f, 0.25f)
                curveToRelative(1.573f, 0.617f, 3.698f, 0.622f, 5.496f, -0.143f)
                curveToRelative(1.798f, -0.765f, 3.269f, -2.3f, 3.916f, -3.861f)
                lineToRelative(6.115f, -13.852f)
                curveToRelative(0.051f, -0.11f, 0.051f, -0.252f, 0.002f, -0.363f)
                curveToRelative(-0.046f, -0.112f, -0.147f, -0.21f, -0.262f, -0.25f)
                curveToRelative(-0.787f, -0.308f, -1.711f, -0.464f, -2.664f, -0.447f)
                close()
            }
        }
        .build()
        return _vectary!!
    }

private var _vectary: ImageVector? = null
