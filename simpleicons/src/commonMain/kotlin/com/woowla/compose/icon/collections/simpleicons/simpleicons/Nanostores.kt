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

public val Simpleicons.Nanostores: ImageVector
    get() {
        if (_nanostores != null) {
            return _nanostores!!
        }
        _nanostores = Builder(name = "Nanostores", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.708f, 24.0f)
                lineTo(0.6f, 14.822f)
                lineToRelative(7.679f, -2.995f)
                lineToRelative(11.235f, 7.867f)
                lineTo(13.708f, 24.0f)
                close()
                moveTo(10.292f, 0.0f)
                lineTo(23.4f, 9.178f)
                lineToRelative(-7.679f, 2.995f)
                lineTo(4.486f, 4.306f)
                lineTo(10.292f, 0.0f)
                close()
            }
        }
        .build()
        return _nanostores!!
    }

private var _nanostores: ImageVector? = null
