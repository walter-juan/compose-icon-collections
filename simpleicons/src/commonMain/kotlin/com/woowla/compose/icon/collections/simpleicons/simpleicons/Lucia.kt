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

public val Simpleicons.Lucia: ImageVector
    get() {
        if (_lucia != null) {
            return _lucia!!
        }
        _lucia = Builder(name = "Lucia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.382f, 20.714f)
                lineTo(12.0f, 0.0f)
                lineTo(3.618f, 20.714f)
                lineTo(2.288f, 24.0f)
                horizontalLineToRelative(19.423f)
                close()
                moveTo(12.0f, 13.61f)
                lineToRelative(-5.73f, 7.058f)
                lineToRelative(1.288f, -3.184f)
                lineTo(12.0f, 6.505f)
                lineToRelative(4.442f, 10.978f)
                lineToRelative(1.289f, 3.184f)
                close()
            }
        }
        .build()
        return _lucia!!
    }

private var _lucia: ImageVector? = null
