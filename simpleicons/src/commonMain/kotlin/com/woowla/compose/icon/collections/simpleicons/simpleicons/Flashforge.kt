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

public val Simpleicons.Flashforge: ImageVector
    get() {
        if (_flashforge != null) {
            return _flashforge!!
        }
        _flashforge = Builder(name = "Flashforge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.025f, 12.0f)
                lineToRelative(11.98f, -12.0f)
                lineToRelative(11.97f, 12.0f)
                lineToRelative(-11.97f, 12.0f)
                close()
                moveTo(14.569f, 14.672f)
                lineTo(11.995f, 17.256f)
                verticalLineToRelative(5.916f)
                lineTo(23.177f, 11.97f)
                lineTo(11.995f, 0.76f)
                verticalLineToRelative(5.136f)
                lineTo(9.402f, 8.53f)
                verticalLineToRelative(6.123f)
                lineToRelative(5.157f, -5.196f)
                close()
            }
        }
        .build()
        return _flashforge!!
    }

private var _flashforge: ImageVector? = null
