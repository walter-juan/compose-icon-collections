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

public val Simpleicons.Root: ImageVector
    get() {
        if (_root != null) {
            return _root!!
        }
        _root = Builder(name = "Root", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.57f, 4.758f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.097f, 0.0f)
                quadToRelative(-2.521f, 0.045f, -5.047f, 0.097f)
                curveToRelative(-0.973f, 0.016f, -1.946f, 0.04f, -2.914f, 0.051f)
                curveToRelative(-0.168f, 0.004f, -0.246f, 0.032f, -0.274f, 0.223f)
                curveToRelative(-0.367f, 2.309f, -0.746f, 4.617f, -1.12f, 6.922f)
                curveToRelative(-0.403f, 2.496f, -0.81f, 4.988f, -1.212f, 7.484f)
                lineToRelative(-0.36f, 2.215f)
                curveToRelative(-0.089f, -0.059f, -0.105f, -0.145f, -0.14f, -0.219f)
                quadToRelative(-1.667f, -3.444f, -3.32f, -6.894f)
                curveToRelative(-0.082f, -0.172f, -0.145f, -0.203f, -0.328f, -0.117f)
                arcToRelative(702.0f, 702.0f, 0.0f, false, true, -5.516f, 2.515f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.11f, 0.063f)
                curveTo(3.052f, 21.176f, 7.196f, 24.0f, 12.0f, 24.0f)
                curveToRelative(6.625f, 0.0f, 12.0f, -5.371f, 12.0f, -12.0f)
                curveToRelative(0.0f, -2.719f, -0.906f, -5.227f, -2.434f, -7.242f)
                close()
                moveTo(21.191f, 4.285f)
                arcTo(11.98f, 11.98f, 0.0f, false, false, 12.0f, 0.0f)
                curveTo(5.371f, 0.0f, 0.0f, 5.371f, 0.0f, 12.0f)
                curveToRelative(0.0f, 1.621f, 0.324f, 3.168f, 0.906f, 4.582f)
                quadToRelative(0.046f, -0.014f, 0.11f, -0.05f)
                curveToRelative(2.129f, -1.223f, 4.265f, -2.434f, 6.394f, -3.657f)
                curveToRelative(0.192f, -0.113f, 0.262f, -0.086f, 0.356f, 0.113f)
                curveToRelative(0.691f, 1.489f, 1.398f, 2.969f, 2.101f, 4.453f)
                curveToRelative(0.028f, 0.055f, 0.035f, 0.125f, 0.121f, 0.164f)
                quadToRelative(0.142f, -0.812f, 0.278f, -1.613f)
                quadToRelative(0.701f, -4.106f, 1.398f, -8.219f)
                curveToRelative(0.195f, -1.16f, 0.399f, -2.316f, 0.59f, -3.476f)
                curveToRelative(0.023f, -0.14f, 0.074f, -0.188f, 0.215f, -0.184f)
                quadToRelative(2.069f, 0.047f, 4.144f, 0.086f)
                quadToRelative(2.203f, 0.046f, 4.407f, 0.086f)
            }
        }
        .build()
        return _root!!
    }

private var _root: ImageVector? = null
