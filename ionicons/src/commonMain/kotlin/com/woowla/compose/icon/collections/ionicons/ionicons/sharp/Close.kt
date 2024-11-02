package com.woowla.compose.icon.collections.ionicons.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.SharpGroup

public val SharpGroup.Close: ImageVector
    get() {
        if (_close != null) {
            return _close!!
        }
        _close = Builder(name = "Close", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 145.49f)
                lineToRelative(-33.49f, -33.49f)
                lineToRelative(-110.51f, 110.51f)
                lineToRelative(-110.51f, -110.51f)
                lineToRelative(-33.49f, 33.49f)
                lineToRelative(110.51f, 110.51f)
                lineToRelative(-110.51f, 110.51f)
                lineToRelative(33.49f, 33.49f)
                lineToRelative(110.51f, -110.51f)
                lineToRelative(110.51f, 110.51f)
                lineToRelative(33.49f, -33.49f)
                lineToRelative(-110.51f, -110.51f)
                lineToRelative(110.51f, -110.51f)
                close()
            }
        }
        .build()
        return _close!!
    }

private var _close: ImageVector? = null
