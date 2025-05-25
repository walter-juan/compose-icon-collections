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

public val Simpleicons.Formbricks: ImageVector
    get() {
        if (_formbricks != null) {
            return _formbricks!!
        }
        _formbricks = Builder(name = "Formbricks", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.658f, 0.0f)
                arcToRelative(5.714f, 5.714f, 0.0f, false, false, -5.715f, 5.714f)
                verticalLineToRelative(1.532f)
                horizontalLineToRelative(14.49f)
                arcToRelative(3.623f, 3.623f, 0.0f, false, false, 0.0f, -7.246f)
                close()
                moveTo(2.943f, 8.377f)
                verticalLineToRelative(7.246f)
                horizontalLineToRelative(14.49f)
                arcToRelative(3.623f, 3.623f, 0.0f, false, false, 0.0f, -7.246f)
                close()
                moveTo(2.943f, 16.754f)
                verticalLineToRelative(3.623f)
                arcToRelative(3.623f, 3.623f, 0.0f, false, false, 7.246f, 0.0f)
                verticalLineToRelative(-3.623f)
                close()
            }
        }
        .build()
        return _formbricks!!
    }

private var _formbricks: ImageVector? = null
