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

public val Simpleicons.Libretranslate: ImageVector
    get() {
        if (_libretranslate != null) {
            return _libretranslate!!
        }
        _libretranslate = Builder(name = "Libretranslate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.783f, 0.0f)
                quadToRelative(-1.716f, 4.666f, -8.892f, 7.991f)
                lineToRelative(1.362f, 1.523f)
                quadToRelative(5.395f, -2.638f, 7.819f, -5.996f)
                quadToRelative(2.478f, 3.186f, 8.195f, 6.125f)
                lineTo(23.544f, 8.066f)
                quadToRelative(-6.103f, -2.928f, -8.42f, -6.242f)
                quadToRelative(0.118f, -0.182f, 0.483f, -1.255f)
                close()
                moveTo(9.547f, 7.991f)
                quadToRelative(-0.322f, 3.507f, -1.448f, 5.803f)
                quadToRelative(-1.115f, 2.295f, -3.668f, 4.569f)
                lineToRelative(1.426f, 1.276f)
                quadToRelative(2.843f, -2.606f, 4.194f, -5.556f)
                quadToRelative(1.18f, 1.03f, 2.413f, 2.649f)
                lineToRelative(1.459f, -1.309f)
                quadToRelative(-1.148f, -1.459f, -3.229f, -3.25f)
                quadToRelative(0.547f, -2.027f, 0.761f, -3.979f)
                close()
                moveTo(16.647f, 7.991f)
                quadToRelative(-0.172f, 4.151f, -1.416f, 6.393f)
                quadToRelative(-1.244f, 2.242f, -3.733f, 3.893f)
                lineToRelative(1.405f, 1.298f)
                quadToRelative(3.572f, -2.606f, 4.709f, -5.824f)
                quadToRelative(1.727f, 3.464f, 4.87f, 5.867f)
                lineToRelative(1.405f, -1.341f)
                quadToRelative(-1.781f, -1.319f, -3.014f, -2.789f)
                quadToRelative(-1.223f, -1.48f, -1.866f, -3.046f)
                quadToRelative(-0.633f, -1.577f, -0.633f, -2.145f)
                lineToRelative(0.075f, -0.751f)
                quadToRelative(0.086f, -0.837f, 0.086f, -1.394f)
                close()
                moveTo(0.113f, 8.802f)
                lineTo(0.113f, 24.0f)
                horizontalLineToRelative(9.444f)
                verticalLineToRelative(-1.709f)
                lineTo(2.052f, 22.291f)
                lineTo(2.052f, 8.802f)
                close()
            }
        }
        .build()
        return _libretranslate!!
    }

private var _libretranslate: ImageVector? = null
