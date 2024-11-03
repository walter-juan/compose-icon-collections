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

public val Twbs.CursorFill: ImageVector
    get() {
        if (_cursorFill != null) {
            return _cursorFill!!
        }
        _cursorFill = Builder(name = "CursorFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.082f, 2.182f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.103f, 0.557f)
                lineTo(8.528f, 15.467f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.917f, -0.007f)
                lineTo(5.57f, 10.694f)
                lineTo(0.803f, 8.652f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.006f, -0.916f)
                lineToRelative(12.728f, -5.657f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.556f, 0.103f)
                close()
            }
        }
        .build()
        return _cursorFill!!
    }

private var _cursorFill: ImageVector? = null
