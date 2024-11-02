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

public val Simpleicons.Stencil: ImageVector
    get() {
        if (_stencil != null) {
            return _stencil!!
        }
        _stencil = Builder(name = "Stencil", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.85f, 15.66f)
                horizontalLineToRelative(9.25f)
                lineToRelative(-5.0f, 5.34f)
                horizontalLineTo(3.9f)
                close()
                moveTo(24.0f, 9.328f)
                horizontalLineTo(4.997f)
                lineTo(0.0f, 14.672f)
                horizontalLineToRelative(19.003f)
                close()
                moveTo(10.884f, 3.0f)
                horizontalLineTo(20.1f)
                lineToRelative(-4.977f, 5.34f)
                horizontalLineTo(5.9f)
                close()
            }
        }
        .build()
        return _stencil!!
    }

private var _stencil: ImageVector? = null
