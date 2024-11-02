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

public val Simpleicons.Removedotbg: ImageVector
    get() {
        if (_removedotbg != null) {
            return _removedotbg!!
        }
        _removedotbg = Builder(name = "Removedotbg", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.729f, 13.55f)
                lineToRelative(-1.903f, -0.995f)
                lineToRelative(-9.134f, 4.776f)
                arcToRelative(1.497f, 1.497f, 0.0f, false, true, -1.383f, 0.002f)
                lineToRelative(-9.137f, -4.778f)
                lineToRelative(-1.903f, 0.995f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.888f)
                lineToRelative(11.499f, 6.011f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, false, 0.462f, 0.0f)
                lineToRelative(11.499f, -6.011f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.888f)
                close()
                moveTo(0.269f, 10.447f)
                lineToRelative(11.499f, 6.013f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, false, 0.462f, 0.0f)
                lineToRelative(11.499f, -6.013f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.887f)
                lineToRelative(-11.5f, -6.012f)
                arcToRelative(0.505f, 0.505f, 0.0f, false, false, -0.462f, 0.0f)
                lineTo(0.268f, 9.559f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.001f, 0.887f)
                close()
            }
        }
        .build()
        return _removedotbg!!
    }

private var _removedotbg: ImageVector? = null
