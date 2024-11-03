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

public val Twbs.CaretLeftFill: ImageVector
    get() {
        if (_caretLeftFill != null) {
            return _caretLeftFill!!
        }
        _caretLeftFill = Builder(name = "CaretLeftFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.86f, 8.753f)
                lineToRelative(5.482f, 4.796f)
                curveToRelative(0.646f, 0.566f, 1.658f, 0.106f, 1.658f, -0.753f)
                verticalLineTo(3.204f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.659f, -0.753f)
                lineToRelative(-5.48f, 4.796f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.506f)
                close()
            }
        }
        .build()
        return _caretLeftFill!!
    }

private var _caretLeftFill: ImageVector? = null
