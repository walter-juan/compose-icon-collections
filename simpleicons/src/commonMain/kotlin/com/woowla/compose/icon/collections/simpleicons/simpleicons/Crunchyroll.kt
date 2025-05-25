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

public val Simpleicons.Crunchyroll: ImageVector
    get() {
        if (_crunchyroll != null) {
            return _crunchyroll!!
        }
        _crunchyroll = Builder(name = "Crunchyroll", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.909f, 13.436f)
                curveTo(2.914f, 7.61f, 7.642f, 2.893f, 13.468f, 2.898f)
                curveToRelative(5.576f, 0.005f, 10.137f, 4.339f, 10.51f, 9.819f)
                quadToRelative(0.021f, -0.351f, 0.022f, -0.706f)
                curveTo(24.007f, 5.385f, 18.64f, 0.006f, 12.012f, 0.0f)
                reflectiveCurveTo(0.007f, 5.36f, 0.0f, 11.988f)
                reflectiveCurveTo(5.36f, 23.994f, 11.988f, 24.0f)
                quadToRelative(0.412f, 0.0f, 0.815f, -0.027f)
                curveToRelative(-5.526f, -0.338f, -9.9f, -4.928f, -9.894f, -10.538f)
                close()
                moveTo(19.193f, 13.591f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -4.095f, -4.103f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 2.712f, -3.855f)
                arcToRelative(8.95f, 8.95f, 0.0f, false, false, -4.187f, -1.037f)
                arcToRelative(9.007f, 9.007f, 0.0f, true, false, 8.997f, 9.016f)
                quadToRelative(-0.001f, -0.847f, -0.15f, -1.651f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.278f, 1.63f)
                close()
            }
        }
        .build()
        return _crunchyroll!!
    }

private var _crunchyroll: ImageVector? = null
