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

public val Twbs.Number6CircleFill: ImageVector
    get() {
        if (_number6CircleFill != null) {
            return _number6CircleFill!!
        }
        _number6CircleFill = Builder(name = "Number6CircleFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveTo(8.21f, 3.855f)
                curveToRelative(-1.868f, 0.0f, -3.116f, 1.395f, -3.116f, 4.407f)
                curveToRelative(0.0f, 1.183f, 0.228f, 2.039f, 0.597f, 2.642f)
                curveToRelative(0.569f, 0.926f, 1.477f, 1.254f, 2.409f, 1.254f)
                curveToRelative(1.629f, 0.0f, 2.847f, -1.013f, 2.847f, -2.783f)
                curveToRelative(0.0f, -1.676f, -1.254f, -2.555f, -2.508f, -2.555f)
                curveToRelative(-1.125f, 0.0f, -1.752f, 0.61f, -1.98f, 1.155f)
                horizontalLineToRelative(-0.082f)
                curveToRelative(-0.012f, -1.946f, 0.727f, -3.036f, 1.805f, -3.036f)
                curveToRelative(0.802f, 0.0f, 1.213f, 0.457f, 1.312f, 0.815f)
                horizontalLineToRelative(1.29f)
                curveToRelative(-0.06f, -0.908f, -0.962f, -1.899f, -2.573f, -1.899f)
                close()
                moveTo(8.111f, 7.863f)
                curveToRelative(-0.92f, 0.0f, -1.564f, 0.65f, -1.564f, 1.576f)
                curveToRelative(0.0f, 1.032f, 0.703f, 1.635f, 1.558f, 1.635f)
                curveToRelative(0.868f, 0.0f, 1.553f, -0.533f, 1.553f, -1.629f)
                curveToRelative(0.0f, -1.06f, -0.744f, -1.582f, -1.547f, -1.582f)
            }
        }
        .build()
        return _number6CircleFill!!
    }

private var _number6CircleFill: ImageVector? = null
