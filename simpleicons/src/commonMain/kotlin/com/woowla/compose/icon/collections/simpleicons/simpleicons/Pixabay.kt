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

public val Simpleicons.Pixabay: ImageVector
    get() {
        if (_pixabay != null) {
            return _pixabay!!
        }
        _pixabay = Builder(name = "Pixabay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(24.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(12.193f, 5.5f)
                horizontalLineToRelative(2.499f)
                lineToRelative(1.967f, 2.872f)
                lineTo(18.854f, 5.5f)
                horizontalLineToRelative(2.482f)
                lineToRelative(-3.579f, 4.592f)
                lineToRelative(3.91f, 4.813f)
                horizontalLineToRelative(-2.638f)
                lineToRelative(-2.395f, -3.064f)
                lineToRelative(-2.15f, 3.064f)
                horizontalLineToRelative(-2.579f)
                lineToRelative(3.579f, -4.813f)
                close()
                moveTo(7.148f, 5.504f)
                curveToRelative(1.32f, 0.033f, 2.42f, 0.49f, 3.3f, 1.371f)
                curveToRelative(0.879f, 0.881f, 1.335f, 1.986f, 1.37f, 3.317f)
                curveToRelative(-0.035f, 1.331f, -0.491f, 2.441f, -1.37f, 3.328f)
                curveToRelative(-0.88f, 0.887f, -1.98f, 1.346f, -3.3f, 1.38f)
                lineTo(4.346f, 14.9f)
                verticalLineToRelative(3.768f)
                lineTo(2.5f, 18.668f)
                verticalLineToRelative(-8.476f)
                curveToRelative(0.032f, -1.33f, 0.486f, -2.436f, 1.359f, -3.317f)
                curveToRelative(0.873f, -0.88f, 1.97f, -1.338f, 3.29f, -1.37f)
                close()
                moveTo(7.148f, 7.368f)
                curveToRelative(-0.797f, 0.02f, -1.46f, 0.294f, -1.985f, 0.823f)
                curveToRelative(-0.525f, 0.53f, -0.797f, 1.196f, -0.817f, 2.0f)
                verticalLineToRelative(2.847f)
                horizontalLineToRelative(2.802f)
                curveToRelative(0.808f, -0.019f, 1.476f, -0.294f, 2.003f, -0.826f)
                curveToRelative(0.528f, -0.532f, 0.8f, -1.206f, 0.82f, -2.02f)
                curveToRelative(-0.02f, -0.805f, -0.292f, -1.47f, -0.82f, -2.0f)
                curveToRelative(-0.527f, -0.53f, -1.195f, -0.805f, -2.003f, -0.824f)
                close()
            }
        }
        .build()
        return _pixabay!!
    }

private var _pixabay: ImageVector? = null
