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

public val Simpleicons.Jsr: ImageVector
    get() {
        if (_jsr != null) {
            return _jsr!!
        }
        _jsr = Builder(name = "Jsr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.692f, 5.538f)
                verticalLineToRelative(3.693f)
                lineTo(0.0f, 9.231f)
                verticalLineToRelative(7.384f)
                horizontalLineToRelative(7.385f)
                verticalLineToRelative(1.847f)
                horizontalLineToRelative(12.923f)
                verticalLineToRelative(-3.693f)
                lineTo(24.0f, 14.769f)
                lineTo(24.0f, 7.385f)
                horizontalLineToRelative(-7.385f)
                lineTo(16.615f, 5.538f)
                close()
                moveTo(5.538f, 7.385f)
                horizontalLineToRelative(1.847f)
                verticalLineToRelative(7.384f)
                lineTo(1.846f, 14.769f)
                verticalLineToRelative(-3.692f)
                horizontalLineToRelative(1.846f)
                verticalLineToRelative(1.846f)
                horizontalLineToRelative(1.846f)
                close()
                moveTo(9.231f, 7.385f)
                horizontalLineToRelative(5.538f)
                lineTo(14.769f, 9.23f)
                horizontalLineToRelative(-3.692f)
                verticalLineToRelative(1.846f)
                horizontalLineToRelative(3.692f)
                verticalLineToRelative(5.538f)
                lineTo(9.231f, 16.614f)
                lineTo(9.231f, 14.77f)
                horizontalLineToRelative(3.692f)
                verticalLineToRelative(-1.846f)
                lineTo(9.231f, 12.924f)
                close()
                moveTo(16.615f, 9.231f)
                horizontalLineToRelative(5.539f)
                verticalLineToRelative(3.692f)
                horizontalLineToRelative(-1.846f)
                verticalLineToRelative(-1.846f)
                horizontalLineToRelative(-1.846f)
                verticalLineToRelative(5.538f)
                horizontalLineToRelative(-1.847f)
                close()
            }
        }
        .build()
        return _jsr!!
    }

private var _jsr: ImageVector? = null
