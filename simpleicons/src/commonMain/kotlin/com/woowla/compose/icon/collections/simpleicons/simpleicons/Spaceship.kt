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

public val Simpleicons.Spaceship: ImageVector
    get() {
        if (_spaceship != null) {
            return _spaceship!!
        }
        _spaceship = Builder(name = "Spaceship", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.253f)
                curveToRelative(1.044f, 0.0f, 1.956f, 0.569f, 2.441f, 1.413f)
                lineToRelative(4.588f, 7.931f)
                lineToRelative(4.45f, 7.692f)
                curveToRelative(0.047f, 0.074f, 0.211f, 0.359f, 0.27f, 0.494f)
                curveToRelative(0.222f, 0.468f, 0.25f, 0.947f, 0.251f, 1.16f)
                curveToRelative(0.0f, 1.55f, -1.259f, 2.806f, -2.812f, 2.806f)
                curveToRelative(-0.295f, 0.0f, -0.579f, -0.045f, -0.846f, -0.129f)
                lineToRelative(-7.901f, -2.606f)
                arcToRelative(1.406f, 1.406f, 0.0f, false, false, -0.441f, -0.071f)
                arcToRelative(1.413f, 1.413f, 0.0f, false, false, -0.442f, 0.071f)
                lineTo(3.658f, 22.618f)
                lineToRelative(-0.162f, 0.046f)
                arcToRelative(2.84f, 2.84f, 0.0f, false, true, -0.684f, 0.083f)
                curveToRelative(-1.553f, 0.0f, -2.812f, -1.256f, -2.812f, -2.806f)
                curveToRelative(0.002f, -0.243f, 0.023f, -0.553f, 0.168f, -0.958f)
                curveToRelative(0.029f, -0.091f, 0.074f, -0.176f, 0.112f, -0.264f)
                curveToRelative(0.071f, -0.149f, 0.161f, -0.287f, 0.241f, -0.431f)
                lineToRelative(4.449f, -7.692f)
                lineToRelative(4.588f, -7.931f)
                curveToRelative(0.485f, -0.844f, 1.397f, -1.413f, 2.442f, -1.413f)
                close()
            }
        }
        .build()
        return _spaceship!!
    }

private var _spaceship: ImageVector? = null
