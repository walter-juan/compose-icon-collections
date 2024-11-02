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

public val Simpleicons.Datastax: ImageVector
    get() {
        if (_datastax != null) {
            return _datastax!!
        }
        _datastax = Builder(name = "Datastax", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.863f, 8.818f)
                verticalLineToRelative(6.364f)
                lineToRelative(-2.181f, 1.683f)
                lineTo(0.0f, 16.865f)
                verticalLineToRelative(-9.73f)
                horizontalLineToRelative(8.682f)
                lineToRelative(2.181f, 1.683f)
                close()
                moveTo(1.683f, 15.184f)
                horizontalLineToRelative(7.498f)
                lineTo(9.181f, 8.818f)
                lineTo(1.683f, 8.818f)
                verticalLineToRelative(6.366f)
                close()
                moveTo(14.926f, 8.888f)
                verticalLineToRelative(2.26f)
                horizontalLineToRelative(6.919f)
                lineTo(24.0f, 12.793f)
                verticalLineToRelative(2.318f)
                lineToRelative(-2.155f, 1.646f)
                horizontalLineToRelative(-8.153f)
                verticalLineToRelative(-1.646f)
                horizontalLineToRelative(8.645f)
                verticalLineToRelative(-2.318f)
                horizontalLineToRelative(-6.919f)
                lineToRelative(-2.155f, -1.645f)
                verticalLineToRelative(-2.26f)
                lineToRelative(2.155f, -1.645f)
                horizontalLineToRelative(7.939f)
                verticalLineToRelative(1.645f)
                horizontalLineToRelative(-8.431f)
                close()
            }
        }
        .build()
        return _datastax!!
    }

private var _datastax: ImageVector? = null
