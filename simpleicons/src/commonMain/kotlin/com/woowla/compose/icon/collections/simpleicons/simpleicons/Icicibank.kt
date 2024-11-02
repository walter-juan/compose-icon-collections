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

public val Simpleicons.Icicibank: ImageVector
    get() {
        if (_icicibank != null) {
            return _icicibank!!
        }
        _icicibank = Builder(name = "Icicibank", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.926f, 2.096f)
                curveTo(19.279f, -1.648f, 12.698f, -0.243f, 7.214f, 5.242f)
                curveToRelative(-5.484f, 5.475f, -7.786f, 12.962f, -5.14f, 16.706f)
                curveToRelative(0.873f, 1.239f, 2.184f, 1.902f, 3.739f, 2.052f)
                curveToRelative(1.052f, 0.008f, 1.913f, -1.185f, 2.616f, -2.777f)
                curveToRelative(0.725f, -1.668f, 1.169f, -3.218f, 1.514f, -4.659f)
                curveToRelative(0.508f, -2.293f, 0.544f, -3.934f, 0.29f, -4.279f)
                curveToRelative(-0.435f, -0.58f, -1.432f, -0.435f, -2.556f, 0.218f)
                curveToRelative(-0.544f, 0.299f, -1.26f, 0.1f, -0.408f, -0.934f)
                curveToRelative(0.861f, -1.043f, 4.26f, -3.563f, 5.493f, -3.952f)
                curveToRelative(1.342f, -0.39f, 2.873f, 0.136f, 2.357f, 1.623f)
                curveToRelative(-0.371f, 1.085f, -5.047f, 13.486f, -1.596f, 12.272f)
                curveToRelative(1.105f, -0.747f, 2.205f, -1.65f, 3.264f, -2.709f)
                curveToRelative(5.484f, -5.475f, 7.786f, -12.962f, 5.14f, -16.706f)
                close()
                moveTo(16.56f, 5.305f)
                curveToRelative(-1.097f, 1.097f, -2.52f, 1.487f, -3.136f, 0.852f)
                curveToRelative(-0.662f, -0.635f, -0.272f, -2.058f, 0.825f, -3.173f)
                curveToRelative(1.106f, -1.115f, 2.529f, -1.459f, 3.145f, -0.834f)
                curveToRelative(0.635f, 0.644f, 0.245f, 2.049f, -0.834f, 3.155f)
                close()
            }
        }
        .build()
        return _icicibank!!
    }

private var _icicibank: ImageVector? = null
