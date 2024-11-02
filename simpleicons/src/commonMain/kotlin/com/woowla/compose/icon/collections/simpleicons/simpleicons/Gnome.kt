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

public val Simpleicons.Gnome: ImageVector
    get() {
        if (_gnome != null) {
            return _gnome!!
        }
        _gnome = Builder(name = "Gnome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.703f, 0.0f)
                curveToRelative(-4.99f, 0.0f, -5.927f, 7.111f, -3.12f, 7.111f)
                curveToRelative(2.81f, 0.0f, 8.113f, -7.111f, 3.12f, -7.111f)
                moveTo(11.99f, 0.872f)
                quadToRelative(-0.119f, -0.001f, -0.25f, 0.016f)
                curveToRelative(-2.811f, 0.364f, -1.82f, 5.25f, -0.324f, 5.34f)
                curveToRelative(1.449f, 0.09f, 3.032f, -5.347f, 0.574f, -5.356f)
                moveTo(7.123f, 2.803f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, false, -0.488f, 0.114f)
                curveToRelative(-2.259f, 0.933f, -0.344f, 4.776f, 0.921f, 4.519f)
                curveToRelative(1.168f, -0.24f, 1.319f, -4.671f, -0.433f, -4.632f)
                close()
                moveTo(3.523f, 5.819f)
                arcToRelative(1.05f, 1.05f, 0.0f, false, false, -0.634f, 0.215f)
                curveToRelative(-1.807f, 1.248f, 0.607f, 4.269f, 1.671f, 3.799f)
                curveToRelative(0.93f, -0.41f, 0.338f, -3.967f, -1.037f, -4.014f)
                moveToRelative(10.032f, 2.309f)
                curveToRelative(-3.835f, 0.033f, -8.716f, 1.978f, -9.567f, 5.784f)
                curveTo(3.044f, 18.14f, 7.875f, 24.0f, 12.915f, 24.0f)
                curveToRelative(2.48f, 0.0f, 5.34f, -2.24f, 5.875f, -5.077f)
                curveToRelative(0.409f, -2.163f, -4.81f, -1.295f, -4.623f, 0.137f)
                curveToRelative(0.225f, 1.715f, -1.258f, 2.561f, -2.711f, 1.454f)
                curveToRelative(-4.623f, -3.52f, 7.658f, -5.276f, 6.847f, -10.086f)
                curveToRelative(-0.263f, -1.56f, -2.29f, -2.322f, -4.748f, -2.301f)
                close()
            }
        }
        .build()
        return _gnome!!
    }

private var _gnome: ImageVector? = null
