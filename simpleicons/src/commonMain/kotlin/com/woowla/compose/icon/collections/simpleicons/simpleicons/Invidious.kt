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

public val Simpleicons.Invidious: ImageVector
    get() {
        if (_invidious != null) {
            return _invidious!!
        }
        _invidious = Builder(name = "Invidious", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 0.742f)
                arcTo(11.257f, 11.257f, 0.0f, false, true, 23.258f, 12.0f)
                arcTo(11.257f, 11.257f, 0.0f, false, true, 12.0f, 23.258f)
                arcTo(11.257f, 11.257f, 0.0f, false, true, 0.742f, 12.0f)
                arcTo(11.257f, 11.257f, 0.0f, false, true, 12.0f, 0.742f)
                close()
                moveTo(11.34f, 5.117f)
                arcToRelative(0.776f, 0.776f, 0.0f, false, false, -0.777f, 0.778f)
                arcToRelative(0.776f, 0.776f, 0.0f, false, false, 0.777f, 0.775f)
                arcToRelative(0.776f, 0.776f, 0.0f, false, false, 0.775f, -0.775f)
                arcToRelative(0.776f, 0.776f, 0.0f, false, false, -0.775f, -0.778f)
                close()
                moveTo(11.375f, 7.383f)
                lineTo(10.852f, 9.236f)
                lineTo(8.102f, 18.527f)
                horizontalLineToRelative(-0.713f)
                verticalLineToRelative(0.373f)
                horizontalLineToRelative(1.974f)
                verticalLineToRelative(-0.373f)
                horizontalLineToRelative(-0.875f)
                lineToRelative(2.606f, -8.806f)
                lineToRelative(4.6f, 9.174f)
                horizontalLineToRelative(1.429f)
                lineTo(11.375f, 7.383f)
                close()
            }
        }
        .build()
        return _invidious!!
    }

private var _invidious: ImageVector? = null
