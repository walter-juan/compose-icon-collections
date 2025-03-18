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

public val Simpleicons.Devbox: ImageVector
    get() {
        if (_devbox != null) {
            return _devbox!!
        }
        _devbox = Builder(name = "Devbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.546f, 7.573f)
                lineToRelative(-1.531f, -1.57f)
                curveToRelative(-0.488f, 0.437f, -0.965f, 0.865f, -1.442f, 1.292f)
                lineToRelative(-0.959f, 0.86f)
                curveToRelative(1.308f, 1.345f, 2.589f, 2.662f, 3.876f, 3.987f)
                lineToRelative(-2.426f, 2.496f)
                lineToRelative(-1.451f, 1.492f)
                curveToRelative(0.55f, 0.499f, 1.092f, 0.99f, 1.64f, 1.486f)
                lineToRelative(0.765f, 0.693f)
                lineToRelative(2.209f, -2.277f)
                curveToRelative(1.259f, -1.298f, 2.514f, -2.592f, 3.774f, -3.891f)
                verticalLineToRelative(-0.001f)
                arcToRelative(20797.59f, 20797.59f, 0.0f, false, true, -4.454f, -4.567f)
                close()
                moveTo(2.992f, 9.072f)
                arcTo(16808.14f, 16808.14f, 0.0f, false, true, 0.0f, 12.141f)
                curveToRelative(2.011f, 2.073f, 3.993f, 4.115f, 5.984f, 6.167f)
                lineToRelative(0.511f, -0.463f)
                curveToRelative(0.638f, -0.579f, 1.262f, -1.144f, 1.892f, -1.715f)
                lineToRelative(-1.447f, -1.489f)
                curveToRelative(-0.813f, -0.837f, -1.621f, -1.668f, -2.431f, -2.501f)
                curveToRelative(1.046f, -1.075f, 2.075f, -2.132f, 3.109f, -3.196f)
                lineToRelative(0.767f, -0.789f)
                curveToRelative(-0.434f, -0.389f, -0.861f, -0.772f, -1.288f, -1.155f)
                lineToRelative(-1.114f, -0.998f)
                verticalLineToRelative(0.001f)
                curveToRelative(-1.0f, 1.025f, -1.996f, 2.047f, -2.992f, 3.069f)
                close()
                moveTo(15.577f, 3.034f)
                curveToRelative(-1.317f, 6.199f, -2.628f, 12.369f, -3.945f, 18.566f)
                lineToRelative(-0.196f, -0.039f)
                arcToRelative(2911.432f, 2911.432f, 0.0f, false, false, -3.028f, -0.596f)
                curveToRelative(0.853f, -4.012f, 1.703f, -8.013f, 2.555f, -12.02f)
                lineTo(12.353f, 2.4f)
                close()
            }
        }
        .build()
        return _devbox!!
    }

private var _devbox: ImageVector? = null
