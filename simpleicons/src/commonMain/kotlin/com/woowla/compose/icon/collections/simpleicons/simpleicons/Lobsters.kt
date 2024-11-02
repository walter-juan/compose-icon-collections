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

public val Simpleicons.Lobsters: ImageVector
    get() {
        if (_lobsters != null) {
            return _lobsters!!
        }
        _lobsters = Builder(name = "Lobsters", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(5.414f, 4.02f)
                horizontalLineToRelative(7.86f)
                curveToRelative(0.105f, 0.0f, 0.15f, 0.014f, 0.15f, 0.134f)
                curveToRelative(-0.015f, 0.285f, 0.0f, 0.556f, 0.0f, 0.841f)
                verticalLineToRelative(0.12f)
                curveToRelative(-0.21f, 0.015f, -0.42f, 0.0f, -0.615f, 0.03f)
                curveToRelative(-0.3f, 0.045f, -0.6f, 0.089f, -0.885f, 0.164f)
                curveToRelative(-0.525f, 0.165f, -0.793f, 0.527f, -0.853f, 1.022f)
                arcToRelative(5.09f, 5.09f, 0.0f, false, false, -0.047f, 0.674f)
                verticalLineToRelative(9.586f)
                curveToRelative(0.0f, 0.405f, 0.046f, 0.808f, 0.091f, 1.198f)
                curveToRelative(0.045f, 0.435f, 0.33f, 0.72f, 0.736f, 0.87f)
                curveToRelative(0.345f, 0.135f, 0.718f, 0.167f, 1.078f, 0.182f)
                curveToRelative(0.945f, 0.03f, 1.877f, 0.014f, 2.792f, -0.226f)
                curveToRelative(1.32f, -0.33f, 2.204f, -1.156f, 2.64f, -2.46f)
                curveToRelative(0.134f, -0.42f, 0.193f, -0.855f, 0.298f, -1.29f)
                curveToRelative(0.015f, -0.03f, 0.046f, -0.09f, 0.076f, -0.09f)
                horizontalLineToRelative(0.99f)
                curveToRelative(-0.03f, 1.8f, 0.03f, 3.599f, 0.0f, 5.399f)
                lineTo(5.25f, 20.174f)
                verticalLineToRelative(-0.944f)
                curveToRelative(0.0f, -0.165f, 0.0f, -0.149f, 0.15f, -0.164f)
                curveToRelative(0.344f, -0.03f, 0.689f, -0.045f, 1.034f, -0.105f)
                curveToRelative(0.69f, -0.12f, 1.005f, -0.467f, 1.11f, -1.172f)
                curveToRelative(0.03f, -0.21f, 0.047f, -0.434f, 0.047f, -0.644f)
                lineTo(7.591f, 7.035f)
                curveToRelative(0.0f, -0.27f, -0.032f, -0.54f, -0.062f, -0.795f)
                curveToRelative(-0.045f, -0.465f, -0.344f, -0.749f, -0.779f, -0.914f)
                curveToRelative(-0.405f, -0.15f, -0.825f, -0.166f, -1.245f, -0.196f)
                horizontalLineToRelative(-0.226f)
                verticalLineToRelative(-0.976f)
                curveToRelative(0.0f, -0.105f, 0.03f, -0.134f, 0.135f, -0.134f)
                close()
            }
        }
        .build()
        return _lobsters!!
    }

private var _lobsters: ImageVector? = null
