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

public val Twbs.Spotify: ImageVector
    get() {
        if (_spotify != null) {
            return _spotify!!
        }
        _spotify = Builder(name = "Spotify", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 0.0f)
                moveToRelative(3.669f, 11.538f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.686f, 0.165f)
                curveToRelative(-1.879f, -1.147f, -4.243f, -1.407f, -7.028f, -0.77f)
                arcToRelative(0.499f, 0.499f, 0.0f, false, true, -0.222f, -0.973f)
                curveToRelative(3.048f, -0.696f, 5.662f, -0.397f, 7.77f, 0.892f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.166f, 0.686f)
                moveToRelative(0.979f, -2.178f)
                arcToRelative(0.624f, 0.624f, 0.0f, false, true, -0.858f, 0.205f)
                curveToRelative(-2.15f, -1.321f, -5.428f, -1.704f, -7.972f, -0.932f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, true, -0.362f, -1.194f)
                curveToRelative(2.905f, -0.881f, 6.517f, -0.454f, 8.986f, 1.063f)
                arcToRelative(0.624f, 0.624f, 0.0f, false, true, 0.206f, 0.858f)
                moveToRelative(0.084f, -2.268f)
                curveTo(10.154f, 5.56f, 5.9f, 5.419f, 3.438f, 6.166f)
                arcToRelative(0.748f, 0.748f, 0.0f, true, true, -0.434f, -1.432f)
                curveToRelative(2.825f, -0.857f, 7.523f, -0.692f, 10.492f, 1.07f)
                arcToRelative(0.747f, 0.747f, 0.0f, true, true, -0.764f, 1.288f)
            }
        }
        .build()
        return _spotify!!
    }

private var _spotify: ImageVector? = null
