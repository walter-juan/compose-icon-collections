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

public val Twbs.CaretRight: ImageVector
    get() {
        if (_caretRight != null) {
            return _caretRight!!
        }
        _caretRight = Builder(name = "CaretRight", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 12.796f)
                lineTo(6.0f, 3.204f)
                lineTo(11.481f, 8.0f)
                close()
                moveTo(6.659f, 13.549f)
                lineTo(12.139f, 8.753f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.506f)
                lineTo(6.66f, 2.451f)
                curveTo(6.011f, 1.885f, 5.0f, 2.345f, 5.0f, 3.204f)
                verticalLineToRelative(9.592f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.659f, 0.753f)
            }
        }
        .build()
        return _caretRight!!
    }

private var _caretRight: ImageVector? = null
