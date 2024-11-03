package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Telegram: ImageVector
    get() {
        if (_telegram != null) {
            return _telegram!!
        }
        _telegram = Builder(name = "Telegram", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveTo(8.287f, 5.906f)
                quadToRelative(-1.168f, 0.486f, -4.666f, 2.01f)
                quadToRelative(-0.567f, 0.225f, -0.595f, 0.442f)
                curveToRelative(-0.03f, 0.243f, 0.275f, 0.339f, 0.69f, 0.47f)
                lineToRelative(0.175f, 0.055f)
                curveToRelative(0.408f, 0.133f, 0.958f, 0.288f, 1.243f, 0.294f)
                quadToRelative(0.39f, 0.01f, 0.868f, -0.32f)
                quadToRelative(3.269f, -2.206f, 3.374f, -2.23f)
                curveToRelative(0.05f, -0.012f, 0.12f, -0.026f, 0.166f, 0.016f)
                reflectiveCurveToRelative(0.042f, 0.12f, 0.037f, 0.141f)
                curveToRelative(-0.03f, 0.129f, -1.227f, 1.241f, -1.846f, 1.817f)
                curveToRelative(-0.193f, 0.18f, -0.33f, 0.307f, -0.358f, 0.336f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.188f, 0.186f)
                curveToRelative(-0.38f, 0.366f, -0.664f, 0.64f, 0.015f, 1.088f)
                curveToRelative(0.327f, 0.216f, 0.589f, 0.393f, 0.85f, 0.571f)
                curveToRelative(0.284f, 0.194f, 0.568f, 0.387f, 0.936f, 0.629f)
                quadToRelative(0.14f, 0.092f, 0.27f, 0.187f)
                curveToRelative(0.331f, 0.236f, 0.63f, 0.448f, 0.997f, 0.414f)
                curveToRelative(0.214f, -0.02f, 0.435f, -0.22f, 0.547f, -0.82f)
                curveToRelative(0.265f, -1.417f, 0.786f, -4.486f, 0.906f, -5.751f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, false, -0.013f, -0.315f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, false, -0.114f, -0.217f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, false, -0.31f, -0.093f)
                curveToRelative(-0.3f, 0.005f, -0.763f, 0.166f, -2.984f, 1.09f)
            }
        }
        .build()
        return _telegram!!
    }

private var _telegram: ImageVector? = null
