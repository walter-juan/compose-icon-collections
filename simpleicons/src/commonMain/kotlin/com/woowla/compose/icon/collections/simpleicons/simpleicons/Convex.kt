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

public val Simpleicons.Convex: ImageVector
    get() {
        if (_convex != null) {
            return _convex!!
        }
        _convex = Builder(name = "Convex", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.09f, 18.916f)
                curveToRelative(3.488f, -0.387f, 6.776f, -2.246f, 8.586f, -5.348f)
                curveToRelative(-0.857f, 7.673f, -9.247f, 12.522f, -16.095f, 9.545f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, true, -1.547f, -1.314f)
                curveToRelative(-1.539f, -2.417f, -2.044f, -5.492f, -1.318f, -8.282f)
                curveToRelative(2.077f, 3.584f, 6.3f, 5.78f, 10.374f, 5.399f)
                moveToRelative(-10.501f, -7.65f)
                curveToRelative(-1.414f, 3.266f, -1.475f, 7.092f, 0.258f, 10.24f)
                curveToRelative(-6.1f, -4.59f, -6.033f, -14.41f, -0.074f, -18.953f)
                arcToRelative(3.44f, 3.44f, 0.0f, false, true, 1.893f, -0.707f)
                curveToRelative(2.825f, -0.15f, 5.695f, 0.942f, 7.708f, 2.977f)
                curveToRelative(-4.09f, 0.04f, -8.073f, 2.66f, -9.785f, 6.442f)
                moveToRelative(11.757f, -5.437f)
                curveTo(14.283f, 2.951f, 11.053f, 0.992f, 7.515f, 0.933f)
                curveToRelative(6.84f, -3.105f, 15.253f, 1.929f, 16.17f, 9.37f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, -0.334f, 2.02f)
                curveToRelative(-1.278f, 2.594f, -3.647f, 4.607f, -6.416f, 5.352f)
                curveToRelative(2.029f, -3.763f, 1.778f, -8.36f, -0.589f, -11.847f)
            }
        }
        .build()
        return _convex!!
    }

private var _convex: ImageVector? = null
