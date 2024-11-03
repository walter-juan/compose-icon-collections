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

public val Twbs.CaretLeft: ImageVector
    get() {
        if (_caretLeft != null) {
            return _caretLeft!!
        }
        _caretLeft = Builder(name = "CaretLeft", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 12.796f)
                lineTo(10.0f, 3.204f)
                lineTo(4.519f, 8.0f)
                close()
                moveTo(9.341f, 13.549f)
                lineTo(3.861f, 8.753f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.506f)
                lineToRelative(5.48f, -4.796f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 3.204f)
                verticalLineToRelative(9.592f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.659f, 0.753f)
            }
        }
        .build()
        return _caretLeft!!
    }

private var _caretLeft: ImageVector? = null
