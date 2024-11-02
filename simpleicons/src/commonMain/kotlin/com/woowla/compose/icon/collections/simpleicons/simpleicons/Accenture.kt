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

public val Simpleicons.Accenture: ImageVector
    get() {
        if (_accenture != null) {
            return _accenture!!
        }
        _accenture = Builder(name = "Accenture", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.66f, 16.95f)
                lineToRelative(13.242f, -4.926f)
                lineTo(0.66f, 6.852f)
                verticalLineTo(0.0f)
                lineToRelative(22.68f, 9.132f)
                verticalLineToRelative(5.682f)
                lineTo(0.66f, 24.0f)
                close()
            }
        }
        .build()
        return _accenture!!
    }

private var _accenture: ImageVector? = null
