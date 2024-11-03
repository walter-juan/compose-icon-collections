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

public val Twbs.Capsule: ImageVector
    get() {
        if (_capsule != null) {
            return _capsule!!
        }
        _capsule = Builder(name = "Capsule", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.828f, 8.9f)
                lineTo(8.9f, 1.827f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.657f, 5.657f)
                lineToRelative(-7.07f, 7.071f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 1.827f, 8.9f)
                close()
                moveTo(10.956f, 9.671f)
                lineTo(13.849f, 6.778f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -4.243f, -4.242f)
                lineTo(6.713f, 5.429f)
                close()
            }
        }
        .build()
        return _capsule!!
    }

private var _capsule: ImageVector? = null
