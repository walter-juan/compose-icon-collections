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

public val Simpleicons.Maze: ImageVector
    get() {
        if (_maze != null) {
            return _maze!!
        }
        _maze = Builder(name = "Maze", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.126f, 16.547f)
                curveToRelative(-1.501f, -1.488f, -1.501f, -3.901f, 0.0f, -5.389f)
                lineToRelative(4.078f, -4.042f)
                curveToRelative(1.269f, -1.258f, 3.205f, -1.452f, 4.68f, -0.584f)
                curveToRelative(0.456f, 0.269f, 0.452f, 0.885f, 0.077f, 1.257f)
                curveToRelative(-0.375f, 0.372f, -0.988f, 0.34f, -1.497f, 0.192f)
                curveToRelative(-0.652f, -0.189f, -1.386f, -0.029f, -1.901f, 0.481f)
                lineToRelative(-4.078f, 4.042f)
                arcToRelative(1.893f, 1.893f, 0.0f, false, false, 0.0f, 2.694f)
                curveToRelative(0.751f, 0.744f, 1.968f, 0.744f, 2.718f, 0.0f)
                lineToRelative(8.156f, -8.084f)
                curveToRelative(1.501f, -1.488f, 3.935f, -1.488f, 5.437f, 0.0f)
                lineToRelative(4.078f, 4.042f)
                curveToRelative(1.501f, 1.488f, 1.501f, 3.901f, 0.0f, 5.389f)
                curveToRelative(-1.501f, 1.488f, -3.936f, 1.488f, -5.437f, 0.0f)
                lineToRelative(-1.359f, -1.347f)
                lineToRelative(-1.699f, 1.684f)
                curveToRelative(-1.269f, 1.258f, -3.205f, 1.453f, -4.68f, 0.584f)
                curveToRelative(-0.456f, -0.269f, -0.452f, -0.885f, -0.077f, -1.257f)
                curveToRelative(0.375f, -0.372f, 0.988f, -0.34f, 1.497f, -0.192f)
                curveToRelative(0.652f, 0.189f, 1.386f, 0.029f, 1.901f, -0.481f)
                lineToRelative(1.748f, -1.732f)
                curveToRelative(0.724f, -0.717f, 1.898f, -0.717f, 2.621f, 0.0f)
                lineToRelative(1.408f, 1.395f)
                curveToRelative(0.751f, 0.744f, 1.968f, 0.744f, 2.719f, 0.0f)
                arcToRelative(1.894f, 1.894f, 0.0f, false, false, 0.0f, -2.694f)
                lineToRelative(-4.078f, -4.042f)
                curveToRelative(-0.751f, -0.744f, -1.968f, -0.744f, -2.718f, 0.0f)
                lineTo(6.563f, 16.547f)
                curveToRelative(-1.501f, 1.488f, -3.936f, 1.488f, -5.437f, 0.0f)
            }
        }
        .build()
        return _maze!!
    }

private var _maze: ImageVector? = null
