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

public val Twbs.SuitHeart: ImageVector
    get() {
        if (_suitHeart != null) {
            return _suitHeart!!
        }
        _suitHeart = Builder(name = "SuitHeart", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 6.236f)
                lineToRelative(-0.894f, -1.789f)
                curveToRelative(-0.222f, -0.443f, -0.607f, -1.08f, -1.152f, -1.595f)
                curveTo(5.418f, 2.345f, 4.776f, 2.0f, 4.0f, 2.0f)
                curveTo(2.324f, 2.0f, 1.0f, 3.326f, 1.0f, 4.92f)
                curveToRelative(0.0f, 1.211f, 0.554f, 2.066f, 1.868f, 3.37f)
                curveToRelative(0.337f, 0.334f, 0.721f, 0.695f, 1.146f, 1.093f)
                curveTo(5.122f, 10.423f, 6.5f, 11.717f, 8.0f, 13.447f)
                curveToRelative(1.5f, -1.73f, 2.878f, -3.024f, 3.986f, -4.064f)
                curveToRelative(0.425f, -0.398f, 0.81f, -0.76f, 1.146f, -1.093f)
                curveTo(14.446f, 6.986f, 15.0f, 6.131f, 15.0f, 4.92f)
                curveTo(15.0f, 3.326f, 13.676f, 2.0f, 12.0f, 2.0f)
                curveToRelative(-0.777f, 0.0f, -1.418f, 0.345f, -1.954f, 0.852f)
                curveToRelative(-0.545f, 0.515f, -0.93f, 1.152f, -1.152f, 1.595f)
                close()
                moveTo(8.392f, 14.528f)
                arcToRelative(0.513f, 0.513f, 0.0f, false, true, -0.784f, 0.0f)
                curveToRelative(-1.601f, -1.902f, -3.05f, -3.262f, -4.243f, -4.381f)
                curveTo(1.3f, 8.208f, 0.0f, 6.989f, 0.0f, 4.92f)
                curveTo(0.0f, 2.755f, 1.79f, 1.0f, 4.0f, 1.0f)
                curveToRelative(1.6f, 0.0f, 2.719f, 1.05f, 3.404f, 2.008f)
                curveToRelative(0.26f, 0.365f, 0.458f, 0.716f, 0.596f, 0.992f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, true, 0.596f, -0.992f)
                curveTo(9.281f, 2.049f, 10.4f, 1.0f, 12.0f, 1.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.755f, 4.0f, 3.92f)
                curveToRelative(0.0f, 2.069f, -1.3f, 3.288f, -3.365f, 5.227f)
                curveToRelative(-1.193f, 1.12f, -2.642f, 2.48f, -4.243f, 4.38f)
                close()
            }
        }
        .build()
        return _suitHeart!!
    }

private var _suitHeart: ImageVector? = null
