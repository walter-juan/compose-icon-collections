package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlDiscordAlt: ImageVector
    get() {
        if (_bxlDiscordAlt != null) {
            return _bxlDiscordAlt!!
        }
        _bxlDiscordAlt = Builder(name = "BxlDiscordAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.82f, 4.26f)
                arcToRelative(10.14f, 10.14f, 0.0f, false, false, -0.53f, 1.1f)
                arcToRelative(14.66f, 14.66f, 0.0f, false, false, -4.58f, 0.0f)
                arcToRelative(10.14f, 10.14f, 0.0f, false, false, -0.53f, -1.1f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -4.13f, 1.3f)
                arcToRelative(17.33f, 17.33f, 0.0f, false, false, -3.0f, 11.59f)
                arcToRelative(16.6f, 16.6f, 0.0f, false, false, 5.07f, 2.59f)
                arcTo(12.89f, 12.89f, 0.0f, false, false, 8.23f, 18.0f)
                arcToRelative(9.65f, 9.65f, 0.0f, false, true, -1.71f, -0.83f)
                arcToRelative(3.39f, 3.39f, 0.0f, false, false, 0.42f, -0.33f)
                arcToRelative(11.66f, 11.66f, 0.0f, false, false, 10.12f, 0.0f)
                quadToRelative(0.21f, 0.18f, 0.42f, 0.33f)
                arcToRelative(10.84f, 10.84f, 0.0f, false, true, -1.71f, 0.84f)
                arcToRelative(12.41f, 12.41f, 0.0f, false, false, 1.08f, 1.78f)
                arcToRelative(16.44f, 16.44f, 0.0f, false, false, 5.06f, -2.59f)
                arcToRelative(17.22f, 17.22f, 0.0f, false, false, -3.0f, -11.59f)
                arcToRelative(16.09f, 16.09f, 0.0f, false, false, -4.09f, -1.35f)
                close()
                moveTo(8.68f, 14.81f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, true, -1.8f, -2.0f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, true, 1.8f, -2.0f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, true, 1.8f, 2.0f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, true, -1.8f, 2.0f)
                close()
                moveTo(15.32f, 14.81f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, true, -1.8f, -2.0f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, true, 1.8f, -2.0f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, true, 1.8f, 2.0f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, true, -1.8f, 2.0f)
                close()
            }
        }
        .build()
        return _bxlDiscordAlt!!
    }

private var _bxlDiscordAlt: ImageVector? = null
