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

public val Simpleicons.Wine: ImageVector
    get() {
        if (_wine != null) {
            return _wine!!
        }
        _wine = Builder(name = "Wine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.045f, 0.0f)
                curveTo(8.839f, 0.03f, 5.68f, 1.06f, 4.915f, 2.34f)
                curveToRelative(0.848f, 3.193f, 2.025f, 9.576f, 4.7f, 12.09f)
                curveToRelative(0.6f, 0.565f, 1.455f, 0.785f, 2.27f, 1.768f)
                lineToRelative(0.193f, 0.324f)
                curveToRelative(0.6f, 1.676f, 1.371f, 3.814f, 0.246f, 5.104f)
                curveToRelative(-1.833f, 0.54f, -3.08f, 1.253f, -2.976f, 1.78f)
                curveToRelative(0.133f, 0.676f, 2.42f, 0.792f, 5.107f, 0.26f)
                curveToRelative(2.687f, -0.53f, 4.759f, -1.508f, 4.625f, -2.183f)
                curveToRelative(-0.11f, -0.554f, -1.672f, -0.73f, -3.715f, -0.482f)
                curveToRelative(-1.884f, -0.885f, -1.955f, -3.022f, -2.226f, -4.674f)
                lineToRelative(0.025f, -0.4f)
                curveToRelative(0.116f, -0.556f, 0.689f, -1.793f, 1.035f, -2.393f)
                curveToRelative(1.605f, -2.779f, 0.003f, -8.337f, -1.203f, -13.066f)
                curveToRelative(-0.37f, -0.338f, -1.088f, -0.479f, -1.951f, -0.467f)
                close()
                moveTo(12.877f, 3.674f)
                curveToRelative(0.208f, -0.002f, 0.44f, 0.052f, 0.705f, 0.176f)
                curveToRelative(2.759f, 8.733f, -0.429f, 11.097f, -1.217f, 11.816f)
                curveToRelative(-2.55f, -0.882f, -4.278f, -1.862f, -6.244f, -9.312f)
                curveToRelative(4.972f, 2.58f, 4.744f, -2.659f, 6.756f, -2.68f)
                close()
            }
        }
        .build()
        return _wine!!
    }

private var _wine: ImageVector? = null
