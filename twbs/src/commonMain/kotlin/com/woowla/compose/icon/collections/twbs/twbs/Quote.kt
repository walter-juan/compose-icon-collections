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

public val Twbs.Quote: ImageVector
    get() {
        if (_quote != null) {
            return _quote!!
        }
        _quote = Builder(name = "Quote", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(13.0f, 8.558f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-1.388f)
                quadToRelative(0.0f, -0.527f, 0.062f, -1.054f)
                quadToRelative(0.093f, -0.558f, 0.31f, -0.992f)
                reflectiveQuadToRelative(0.559f, -0.683f)
                quadToRelative(0.34f, -0.279f, 0.868f, -0.279f)
                lineTo(12.411f, 3.0f)
                quadToRelative(-0.868f, 0.0f, -1.52f, 0.372f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, false, -1.085f, 0.992f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, false, -0.62f, 1.458f)
                arcTo(7.7f, 7.7f, 0.0f, false, false, 9.0f, 7.558f)
                lineTo(9.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                close()
                moveTo(6.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(7.0f, 8.558f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(4.612f, 7.558f)
                quadToRelative(0.0f, -0.527f, 0.062f, -1.054f)
                quadToRelative(0.094f, -0.558f, 0.31f, -0.992f)
                quadToRelative(0.217f, -0.434f, 0.559f, -0.683f)
                quadToRelative(0.34f, -0.279f, 0.868f, -0.279f)
                lineTo(6.411f, 3.0f)
                quadToRelative(-0.868f, 0.0f, -1.52f, 0.372f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, false, -1.085f, 0.992f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, false, -0.62f, 1.458f)
                arcTo(7.7f, 7.7f, 0.0f, false, false, 3.0f, 7.558f)
                lineTo(3.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _quote!!
    }

private var _quote: ImageVector? = null
