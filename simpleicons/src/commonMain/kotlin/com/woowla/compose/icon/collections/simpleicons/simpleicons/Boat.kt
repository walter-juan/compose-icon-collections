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

public val Simpleicons.Boat: ImageVector
    get() {
        if (_boat != null) {
            return _boat!!
        }
        _boat = Builder(name = "Boat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.081f, 0.0f)
                lineTo(5.833f, 17.686f)
                lineTo(17.15f, 13.93f)
                close()
                moveTo(1.881f, 18.223f)
                lineTo(4.961f, 24.0f)
                lineTo(19.14f, 24.0f)
                lineToRelative(2.98f, -5.777f)
                close()
            }
        }
        .build()
        return _boat!!
    }

private var _boat: ImageVector? = null
