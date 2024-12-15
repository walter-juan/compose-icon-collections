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

public val Simpleicons.Replicate: ImageVector
    get() {
        if (_replicate != null) {
            return _replicate!!
        }
        _replicate = Builder(name = "Replicate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.262f)
                verticalLineToRelative(2.712f)
                horizontalLineToRelative(-9.518f)
                lineTo(14.482f, 24.0f)
                horizontalLineToRelative(-3.034f)
                lineTo(11.448f, 10.262f)
                close()
                moveTo(24.0f, 5.131f)
                verticalLineToRelative(2.717f)
                lineTo(8.755f, 7.848f)
                lineTo(8.755f, 24.0f)
                lineTo(5.722f, 24.0f)
                lineTo(5.722f, 5.131f)
                close()
                moveTo(24.0f, 0.0f)
                verticalLineToRelative(2.717f)
                lineTo(3.034f, 2.717f)
                lineTo(3.034f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 0.0f)
                close()
            }
        }
        .build()
        return _replicate!!
    }

private var _replicate: ImageVector? = null
