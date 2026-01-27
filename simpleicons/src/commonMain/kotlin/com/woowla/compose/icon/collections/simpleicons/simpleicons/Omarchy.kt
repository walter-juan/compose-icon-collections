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

public val Simpleicons.Omarchy: ImageVector
    get() {
        if (_omarchy != null) {
            return _omarchy!!
        }
        _omarchy = Builder(name = "Omarchy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(12.8f)
                verticalLineToRelative(-3.2f)
                horizontalLineToRelative(8.0f)
                lineTo(20.8f, 3.2f)
                horizontalLineToRelative(-3.2f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(14.4f)
                lineTo(4.8f, 19.2f)
                lineTo(4.8f, 4.8f)
                horizontalLineToRelative(8.0f)
                lineTo(12.8f, 1.6f)
                horizontalLineToRelative(9.6f)
                verticalLineToRelative(20.8f)
                horizontalLineToRelative(-8.0f)
                lineTo(14.4f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(1.6f, 1.6f)
                horizontalLineToRelative(9.6f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(8.0f)
                lineTo(1.6f, 11.2f)
                close()
                moveTo(1.6f, 12.8f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.6f)
                lineTo(1.6f, 22.4f)
                close()
            }
        }
        .build()
        return _omarchy!!
    }

private var _omarchy: ImageVector? = null
