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

public val Simpleicons.Theplanetarysociety: ImageVector
    get() {
        if (_theplanetarysociety != null) {
            return _theplanetarysociety!!
        }
        _theplanetarysociety = Builder(name = "Theplanetarysociety", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.545f, 1.81f)
                arcTo(12.428f, 12.428f, 0.0f, false, false, 0.0f, 2.35f)
                arcToRelative(10.409f, 10.409f, 0.0f, false, true, 1.838f, -0.146f)
                curveToRelative(5.602f, 0.048f, 10.114f, 4.543f, 10.16f, 10.075f)
                curveToRelative(-2.263f, 1.066f, -4.976f, 2.147f, -7.986f, 3.158f)
                curveToRelative(-1.258f, 0.423f, -2.956f, 1.053f, -3.751f, 1.482f)
                arcToRelative(2.073f, 2.073f, 0.0f, false, true, -0.04f, 0.035f)
                lineToRelative(0.257f, -0.065f)
                curveToRelative(1.338f, -0.338f, 2.714f, -0.703f, 4.112f, -1.116f)
                arcToRelative(106.969f, 106.969f, 0.0f, false, false, 7.364f, -2.455f)
                curveToRelative(-0.404f, 4.299f, -3.506f, 7.81f, -7.599f, 8.872f)
                curveToRelative(5.472f, -0.627f, 9.837f, -4.8f, 10.155f, -9.883f)
                curveToRelative(6.236f, -2.597f, 9.957f, -5.18f, 9.443f, -6.805f)
                curveToRelative(-0.454f, -1.435f, -5.038f, -1.7f, -11.657f, -0.554f)
                curveToRelative(0.229f, 0.226f, 0.492f, 0.512f, 0.757f, 0.826f)
                curveToRelative(3.3f, -0.31f, 5.532f, -0.007f, 5.83f, 0.934f)
                curveToRelative(0.335f, 1.06f, -1.348f, 2.612f, -4.382f, 4.296f)
                curveToRelative(-0.395f, -5.198f, -5.1f, -9.236f, -10.956f, -9.194f)
                close()
            }
        }
        .build()
        return _theplanetarysociety!!
    }

private var _theplanetarysociety: ImageVector? = null
