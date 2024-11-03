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

public val Twbs.ToggleOff: ImageVector
    get() {
        if (_toggleOff != null) {
            return _toggleOff!!
        }
        _toggleOff = Builder(name = "ToggleOff", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(8.0f, 12.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 2.0f, -4.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -2.0f, -4.0f)
                close()
                moveTo(5.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                moveTo(0.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.0f, -10.0f)
                lineTo(5.0f, 3.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, 5.0f)
            }
        }
        .build()
        return _toggleOff!!
    }

private var _toggleOff: ImageVector? = null
