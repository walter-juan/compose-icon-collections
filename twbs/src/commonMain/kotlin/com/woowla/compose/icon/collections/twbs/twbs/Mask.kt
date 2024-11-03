package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Mask: ImageVector
    get() {
        if (_mask != null) {
            return _mask!!
        }
        _mask = Builder(name = "Mask", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.225f, 1.227f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 10.5f, 8.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -4.275f, 6.773f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 0.0f, -13.546f)
                moveTo(4.187f, 0.966f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 7.627f, 14.069f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 4.186f, 0.964f)
                close()
            }
        }
        .build()
        return _mask!!
    }

private var _mask: ImageVector? = null
