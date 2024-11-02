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

public val Simpleicons.Orange: ImageVector
    get() {
        if (_orange != null) {
            return _orange!!
        }
        _orange = Builder(name = "Orange", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(3.43f, 20.572f)
                horizontalLineToRelative(17.143f)
                verticalLineToRelative(-3.429f)
                lineTo(3.43f, 17.143f)
                verticalLineToRelative(3.429f)
                close()
            }
        }
        .build()
        return _orange!!
    }

private var _orange: ImageVector? = null
