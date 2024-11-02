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

public val Simpleicons.Eight: ImageVector
    get() {
        if (_eight != null) {
            return _eight!!
        }
        _eight = Builder(name = "Eight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.908f, 6.092f)
                arcToRelative(5.908f, 5.908f, 0.0f, true, false, 0.0f, 11.816f)
                arcToRelative(5.908f, 5.908f, 0.0f, false, false, 0.0f, -11.816f)
                close()
                moveTo(15.138f, 6.092f)
                verticalLineToRelative(2.955f)
                horizontalLineToRelative(5.909f)
                lineTo(21.047f, 6.092f)
                horizontalLineToRelative(-5.908f)
                close()
                moveTo(21.047f, 9.047f)
                verticalLineToRelative(5.906f)
                lineTo(24.0f, 14.953f)
                lineTo(24.0f, 9.047f)
                horizontalLineToRelative(-2.953f)
                close()
                moveTo(21.047f, 14.953f)
                horizontalLineToRelative(-5.908f)
                verticalLineToRelative(2.955f)
                horizontalLineToRelative(5.908f)
                verticalLineToRelative(-2.955f)
                close()
                moveTo(15.139f, 14.953f)
                lineTo(15.139f, 9.047f)
                horizontalLineToRelative(-2.953f)
                verticalLineToRelative(5.906f)
                horizontalLineToRelative(2.953f)
                close()
                moveTo(5.909f, 9.047f)
                arcTo(2.956f, 2.956f, 0.0f, false, true, 8.86f, 12.0f)
                arcToRelative(2.956f, 2.956f, 0.0f, false, true, -2.953f, 2.953f)
                arcTo(2.958f, 2.958f, 0.0f, false, true, 2.953f, 12.0f)
                arcToRelative(2.958f, 2.958f, 0.0f, false, true, 2.955f, -2.953f)
                close()
            }
        }
        .build()
        return _eight!!
    }

private var _eight: ImageVector? = null
