package com.woowla.compose.icon.collections.devicons.devicons.socketio

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.SocketioGroup

public val SocketioGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF010101)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(63.95f, 0.0f)
                curveTo(28.7f, 0.0f, 0.0f, 28.7f, 0.0f, 63.95f)
                reflectiveCurveToRelative(28.69f, 63.95f, 63.95f, 63.95f)
                reflectiveCurveToRelative(63.95f, -28.69f, 63.95f, -63.95f)
                reflectiveCurveTo(99.21f, 0.0f, 63.95f, 0.0f)
                close()
                moveTo(63.95f, 10.68f)
                curveToRelative(29.48f, 0.0f, 53.27f, 23.79f, 53.27f, 53.27f)
                curveToRelative(0.0f, 29.49f, -23.79f, 53.27f, -53.27f, 53.27f)
                curveToRelative(-29.48f, 0.0f, -53.27f, -23.79f, -53.27f, -53.27f)
                curveToRelative(0.0f, -29.48f, 23.79f, -53.27f, 53.27f, -53.27f)
                close()
            }
            path(fill = SolidColor(Color(0xFF010101)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(48.39f, 60.72f)
                curveToRelative(14.0f, -11.44f, 27.7f, -23.28f, 42.01f, -34.38f)
                curveToRelative(-7.51f, 11.53f, -15.22f, 22.91f, -22.73f, 34.44f)
                curveToRelative(-6.44f, 0.03f, -12.88f, 0.03f, -19.28f, -0.06f)
                close()
                moveTo(60.23f, 67.09f)
                curveToRelative(6.47f, 0.0f, 12.9f, 0.0f, 19.34f, 0.09f)
                curveToRelative(-14.1f, 11.38f, -27.73f, 23.31f, -42.07f, 34.38f)
                curveToRelative(7.51f, -11.53f, 15.22f, -22.94f, 22.73f, -34.48f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
