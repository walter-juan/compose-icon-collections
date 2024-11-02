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

public val Simpleicons.Envato: ImageVector
    get() {
        if (_envato != null) {
            return _envato!!
        }
        _envato = Builder(name = "Envato", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.156f, 0.0f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, false, -1.886f, 0.8f)
                lineTo(4.0f, 11.253f)
                curveToRelative(-0.382f, 0.42f, -0.558f, 0.978f, -0.453f, 1.57f)
                curveToRelative(0.176f, 0.945f, 1.116f, 1.571f, 2.06f, 1.399f)
                lineToRelative(5.54f, -1.13f)
                curveToRelative(0.12f, -0.025f, 0.183f, 0.136f, 0.082f, 0.204f)
                lineTo(5.088f, 17.23f)
                curveToRelative(-0.769f, 0.487f, -1.119f, 1.36f, -0.875f, 2.234f)
                curveToRelative(0.244f, 1.151f, 1.398f, 1.814f, 2.516f, 1.537f)
                lineToRelative(9.183f, -2.26f)
                arcToRelative(0.11f, 0.11f, 0.0f, false, true, 0.113f, 0.176f)
                lineToRelative(-1.433f, 1.77f)
                curveToRelative(-0.383f, 0.487f, 0.244f, 1.15f, 0.77f, 0.767f)
                lineToRelative(4.716f, -3.877f)
                curveToRelative(0.84f, -0.697f, 0.281f, -2.062f, -0.803f, -1.957f)
                lineToRelative(-0.011f, -0.004f)
                lineToRelative(-6.047f, 0.65f)
                arcToRelative(0.111f, 0.111f, 0.0f, false, true, -0.08f, -0.199f)
                lineToRelative(5.918f, -4.609f)
                curveToRelative(0.382f, -0.315f, 0.628f, -0.801f, 0.523f, -1.326f)
                curveToRelative(-0.105f, -0.803f, -0.767f, -1.328f, -1.607f, -1.223f)
                lineToRelative(-6.43f, 0.942f)
                curveToRelative(-0.112f, 0.015f, -0.174f, -0.128f, -0.084f, -0.2f)
                lineToRelative(6.375f, -4.867f)
                curveToRelative(1.256f, -0.978f, 1.36f, -2.898f, 0.209f, -4.015f)
                arcTo(2.6f, 2.6f, 0.0f, false, false, 16.156f, 0.0f)
                moveTo(13.1f, 21.855f)
                arcToRelative(1.07f, 1.07f, 0.0f, false, false, -1.073f, 1.073f)
                arcTo(1.07f, 1.07f, 0.0f, false, false, 13.1f, 24.0f)
                arcToRelative(1.07f, 1.07f, 0.0f, false, false, 1.072f, -1.072f)
                arcToRelative(1.07f, 1.07f, 0.0f, false, false, -1.072f, -1.073f)
            }
        }
        .build()
        return _envato!!
    }

private var _envato: ImageVector? = null
