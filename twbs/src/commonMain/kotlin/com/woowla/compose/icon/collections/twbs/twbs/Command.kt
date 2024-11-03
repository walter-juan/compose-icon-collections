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

public val Twbs.Command: ImageVector
    get() {
        if (_command != null) {
            return _command!!
        }
        _command = Builder(name = "Command", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 3.5f)
                lineTo(5.0f, 5.0f)
                lineTo(3.5f, 5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                moveTo(6.0f, 5.0f)
                lineTo(6.0f, 3.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 3.5f, 6.0f)
                lineTo(5.0f, 6.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.5f, 10.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 6.0f, 12.5f)
                lineTo(6.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 2.5f, -2.5f)
                lineTo(11.0f, 10.0f)
                lineTo(11.0f, 6.0f)
                horizontalLineToRelative(1.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 10.0f, 3.5f)
                lineTo(10.0f, 5.0f)
                close()
                moveTo(10.0f, 6.0f)
                verticalLineToRelative(4.0f)
                lineTo(6.0f, 10.0f)
                lineTo(6.0f, 6.0f)
                close()
                moveTo(11.0f, 5.0f)
                lineTo(11.0f, 3.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 12.5f, 5.0f)
                close()
                moveTo(11.0f, 11.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -1.5f, 1.5f)
                close()
                moveTo(5.0f, 11.0f)
                verticalLineToRelative(1.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 3.5f, 11.0f)
                close()
            }
        }
        .build()
        return _command!!
    }

private var _command: ImageVector? = null
