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

public val Simpleicons.Atlasos: ImageVector
    get() {
        if (_atlasos != null) {
            return _atlasos!!
        }
        _atlasos = Builder(name = "Atlasos", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 1.608f)
                lineToRelative(12.0f, 20.785f)
                horizontalLineTo(0.0f)
                lineToRelative(2.537f, -4.394f)
                horizontalLineToRelative(13.852f)
                lineTo(12.0f, 10.396f)
                lineToRelative(-1.844f, 3.193f)
                horizontalLineTo(5.082f)
                close()
            }
        }
        .build()
        return _atlasos!!
    }

private var _atlasos: ImageVector? = null
