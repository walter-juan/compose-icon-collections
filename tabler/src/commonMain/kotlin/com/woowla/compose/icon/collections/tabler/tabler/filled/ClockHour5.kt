package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.ClockHour5: ImageVector
    get() {
        if (_clockHour5 != null) {
            return _clockHour5!!
        }
        _clockHour5 = Builder(name = "ClockHour5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -15.0f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.995f, -8.336f)
                moveToRelative(-6.0f, 3.66f)
                verticalLineToRelative(5.022f)
                lineToRelative(0.003f, 0.054f)
                lineToRelative(0.02f, 0.135f)
                lineToRelative(0.005f, 0.025f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.056f, 0.165f)
                lineToRelative(0.04f, 0.082f)
                lineToRelative(0.04f, 0.065f)
                lineToRelative(2.004f, 3.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.664f, -1.11f)
                lineToRelative(-1.832f, -2.748f)
                verticalLineToRelative(-4.697f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.883f, -0.993f)
                lineToRelative(-0.117f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
            }
        }
        .build()
        return _clockHour5!!
    }

private var _clockHour5: ImageVector? = null
