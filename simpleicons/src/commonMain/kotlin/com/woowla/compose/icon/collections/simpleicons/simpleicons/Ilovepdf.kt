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

public val Simpleicons.Ilovepdf: ImageVector
    get() {
        if (_ilovepdf != null) {
            return _ilovepdf!!
        }
        _ilovepdf = Builder(name = "Ilovepdf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.374f, 2.094f)
                curveToRelative(-1.347f, 0.65f, -2.356f, 1.744f, -3.094f, 2.985f)
                curveTo(11.095f, 3.087f, 9.21f, 1.47f, 6.356f, 1.47f)
                curveTo(3.501f, 1.47f, 0.0f, 3.894f, 0.0f, 7.987f)
                curveToRelative(0.0f, 4.145f, 3.458f, 6.109f, 5.171f, 7.218f)
                curveToRelative(1.831f, 1.185f, 4.955f, 3.339f, 7.11f, 7.325f)
                curveToRelative(2.154f, -3.986f, 5.278f, -6.14f, 7.109f, -7.325f)
                curveToRelative(1.287f, -0.834f, 3.56f, -2.151f, 4.61f, -4.514f)
                close()
                moveTo(15.27f, 10.926f)
                lineTo(15.27f, 3.138f)
                lineToRelative(7.788f, 7.788f)
                lineTo(15.27f, 10.926f)
                close()
            }
        }
        .build()
        return _ilovepdf!!
    }

private var _ilovepdf: ImageVector? = null
