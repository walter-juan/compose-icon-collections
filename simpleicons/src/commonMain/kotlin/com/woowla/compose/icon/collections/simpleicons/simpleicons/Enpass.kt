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

public val Simpleicons.Enpass: ImageVector
    get() {
        if (_enpass != null) {
            return _enpass!!
        }
        _enpass = Builder(name = "Enpass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.023f, 1.337f)
                curveToRelative(2.691f, 0.0f, 5.383f, -0.008f, 8.075f, 0.004f)
                arcToRelative(3.843f, 3.843f, 0.0f, false, true, 2.964f, 1.308f)
                arcTo(3.722f, 3.722f, 0.0f, false, true, 24.0f, 4.947f)
                arcToRelative(9.663f, 9.663f, 0.0f, false, true, -0.278f, 2.319f)
                curveToRelative(-0.357f, 2.054f, -0.729f, 4.104f, -1.094f, 6.155f)
                curveToRelative(-0.315f, 1.766f, -0.616f, 3.536f, -0.947f, 5.301f)
                curveToRelative(-0.464f, 2.038f, -2.129f, 3.584f, -4.195f, 3.898f)
                arcToRelative(6.326f, 6.326f, 0.0f, false, true, -0.743f, 0.044f)
                curveToRelative(-3.146f, 0.003f, -6.292f, 0.003f, -9.438f, 0.0f)
                curveToRelative(-2.454f, -0.005f, -4.551f, -1.767f, -4.978f, -4.183f)
                arcTo(3553.061f, 3553.061f, 0.0f, false, false, 0.421f, 7.909f)
                curveTo(0.295f, 7.212f, 0.156f, 6.518f, 0.057f, 5.815f)
                curveToRelative(-0.358f, -2.05f, 1.002f, -4.006f, 3.048f, -4.385f)
                arcToRelative(5.003f, 5.003f, 0.0f, false, true, 0.971f, -0.089f)
                curveToRelative(2.649f, -0.007f, 5.298f, -0.009f, 7.947f, -0.005f)
                close()
                moveTo(9.887f, 18.022f)
                curveToRelative(-0.03f, 0.686f, 0.534f, 1.251f, 1.22f, 1.22f)
                horizontalLineToRelative(1.747f)
                curveToRelative(0.737f, 0.071f, 1.355f, -0.548f, 1.283f, -1.285f)
                curveToRelative(0.0f, -1.378f, 0.0f, -2.756f, -0.007f, -4.133f)
                arcToRelative(0.385f, 0.385f, 0.0f, false, true, 0.218f, -0.385f)
                curveToRelative(1.702f, -1.008f, 2.525f, -3.025f, 2.016f, -4.936f)
                curveToRelative(-0.66f, -2.377f, -3.103f, -3.786f, -5.491f, -3.166f)
                arcToRelative(4.21f, 4.21f, 0.0f, false, false, -3.034f, 2.5f)
                curveToRelative(-0.795f, 2.088f, -0.004f, 4.447f, 1.888f, 5.635f)
                arcToRelative(0.289f, 0.289f, 0.0f, false, true, 0.164f, 0.287f)
                curveToRelative(-0.007f, 1.48f, -0.005f, 2.706f, -0.005f, 4.262f)
                close()
            }
        }
        .build()
        return _enpass!!
    }

private var _enpass: ImageVector? = null
