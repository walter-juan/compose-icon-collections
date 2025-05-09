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

public val Simpleicons.Dovetail: ImageVector
    get() {
        if (_dovetail != null) {
            return _dovetail!!
        }
        _dovetail = Builder(name = "Dovetail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.75f, 0.0f)
                lineTo(1.5f, 3.0f)
                lineToRelative(5.25f, 3.0f)
                verticalLineToRelative(6.0f)
                lineTo(12.0f, 9.0f)
                lineTo(12.0f, 3.0f)
                close()
                moveTo(6.75f, 12.0f)
                lineTo(1.5f, 15.0f)
                lineToRelative(5.25f, 3.0f)
                verticalLineToRelative(6.0f)
                lineTo(12.0f, 21.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(17.25f, 6.0f)
                lineTo(12.0f, 8.966f)
                lineTo(17.25f, 12.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(5.25f, -3.0f)
                lineTo(22.5f, 9.0f)
                close()
            }
        }
        .build()
        return _dovetail!!
    }

private var _dovetail: ImageVector? = null
