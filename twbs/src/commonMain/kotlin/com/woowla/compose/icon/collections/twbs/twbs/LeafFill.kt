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

public val Twbs.LeafFill: ImageVector
    get() {
        if (_leafFill != null) {
            return _leafFill!!
        }
        _leafFill = Builder(name = "LeafFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.4f, 1.7f)
                curveToRelative(0.217f, 0.289f, 0.65f, 0.84f, 1.725f, 1.274f)
                curveToRelative(1.093f, 0.44f, 2.885f, 0.774f, 5.834f, 0.528f)
                curveToRelative(2.02f, -0.168f, 3.431f, 0.51f, 4.326f, 1.556f)
                curveTo(14.161f, 6.082f, 14.5f, 7.41f, 14.5f, 8.5f)
                quadToRelative(0.0f, 0.344f, -0.027f, 0.734f)
                curveTo(13.387f, 8.252f, 11.877f, 7.76f, 10.39f, 7.5f)
                curveToRelative(-2.016f, -0.288f, -4.188f, -0.445f, -5.59f, -2.045f)
                curveToRelative(-0.142f, -0.162f, -0.402f, -0.102f, -0.379f, 0.112f)
                curveToRelative(0.108f, 0.985f, 1.104f, 1.82f, 1.844f, 2.308f)
                curveToRelative(2.37f, 1.566f, 5.772f, -0.118f, 7.6f, 3.071f)
                curveToRelative(0.505f, 0.8f, 1.374f, 2.7f, 1.75f, 4.292f)
                curveToRelative(0.07f, 0.298f, -0.066f, 0.611f, -0.354f, 0.715f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, -0.161f, 0.042f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.08f, -0.794f)
                curveToRelative(-0.13f, -0.97f, -0.396f, -1.913f, -0.868f, -2.77f)
                curveTo(12.173f, 13.386f, 10.565f, 14.0f, 8.0f, 14.0f)
                curveToRelative(-1.854f, 0.0f, -3.32f, -0.544f, -4.45f, -1.435f)
                curveToRelative(-1.124f, -0.887f, -1.889f, -2.095f, -2.39f, -3.383f)
                curveToRelative(-1.0f, -2.562f, -1.0f, -5.536f, -0.65f, -7.28f)
                lineTo(0.73f, 0.806f)
                close()
            }
        }
        .build()
        return _leafFill!!
    }

private var _leafFill: ImageVector? = null
