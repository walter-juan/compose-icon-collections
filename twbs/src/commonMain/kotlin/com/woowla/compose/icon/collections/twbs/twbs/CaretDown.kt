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

public val Twbs.CaretDown: ImageVector
    get() {
        if (_caretDown != null) {
            return _caretDown!!
        }
        _caretDown = Builder(name = "CaretDown", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.204f, 5.0f)
                horizontalLineToRelative(9.592f)
                lineTo(8.0f, 10.481f)
                close()
                moveTo(2.451f, 5.659f)
                lineTo(7.247f, 11.139f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.506f, 0.0f)
                lineToRelative(4.796f, -5.48f)
                curveToRelative(0.566f, -0.647f, 0.106f, -1.659f, -0.753f, -1.659f)
                lineTo(3.204f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.753f, 1.659f)
            }
        }
        .build()
        return _caretDown!!
    }

private var _caretDown: ImageVector? = null
