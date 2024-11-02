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

public val Simpleicons.Cssdesignawards: ImageVector
    get() {
        if (_cssdesignawards != null) {
            return _cssdesignawards!!
        }
        _cssdesignawards = Builder(name = "Cssdesignawards", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.46f, 0.93f)
                lineToRelative(-7.46f, 7.38f)
                lineToRelative(3.73f, 3.73f)
                lineToRelative(3.74f, 3.65f)
                lineToRelative(3.73f, 3.65f)
                lineToRelative(3.74f, -3.65f)
                lineToRelative(-7.47f, -7.38f)
                lineToRelative(7.47f, -7.4f)
                close()
                moveTo(12.79f, 4.66f)
                lineTo(9.12f, 8.31f)
                lineTo(16.51f, 15.69f)
                lineTo(9.05f, 23.09f)
                horizontalLineToRelative(7.46f)
                lineToRelative(3.76f, -3.66f)
                lineToRelative(3.73f, -3.73f)
                lineToRelative(-3.73f, -3.65f)
                lineToRelative(-3.74f, -3.73f)
                close()
            }
        }
        .build()
        return _cssdesignawards!!
    }

private var _cssdesignawards: ImageVector? = null
