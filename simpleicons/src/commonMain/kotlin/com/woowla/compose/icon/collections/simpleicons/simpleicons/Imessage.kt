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

public val Simpleicons.Imessage: ImageVector
    get() {
        if (_imessage != null) {
            return _imessage!!
        }
        _imessage = Builder(name = "Imessage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.285f, 0.0f)
                arcTo(5.273f, 5.273f, 0.0f, false, false, 0.0f, 5.285f)
                verticalLineToRelative(13.43f)
                arcTo(5.273f, 5.273f, 0.0f, false, false, 5.285f, 24.0f)
                horizontalLineToRelative(13.43f)
                arcTo(5.273f, 5.273f, 0.0f, false, false, 24.0f, 18.715f)
                verticalLineTo(5.285f)
                arcTo(5.273f, 5.273f, 0.0f, false, false, 18.715f, 0.0f)
                close()
                moveTo(12.0f, 4.154f)
                arcToRelative(8.809f, 7.337f, 0.0f, false, true, 8.809f, 7.338f)
                arcTo(8.809f, 7.337f, 0.0f, false, true, 12.0f, 18.828f)
                arcToRelative(8.809f, 7.337f, 0.0f, false, true, -2.492f, -0.303f)
                arcTo(8.656f, 7.337f, 0.0f, false, true, 5.93f, 19.93f)
                arcToRelative(9.929f, 7.337f, 0.0f, false, false, 1.54f, -2.155f)
                arcToRelative(8.809f, 7.337f, 0.0f, false, true, -4.279f, -6.283f)
                arcTo(8.809f, 7.337f, 0.0f, false, true, 12.0f, 4.154f)
            }
        }
        .build()
        return _imessage!!
    }

private var _imessage: ImageVector? = null
