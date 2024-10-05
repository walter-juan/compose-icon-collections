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

public val FilledGroup.ClockHour8: ImageVector
    get() {
        if (_clockHour8 != null) {
            return _clockHour8!!
        }
        _clockHour8 = Builder(name = "ClockHour8", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -15.0f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.995f, -8.336f)
                moveToRelative(-5.0f, 2.66f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(4.464f)
                lineToRelative(-2.555f, 1.704f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.336f, 1.286f)
                lineToRelative(0.059f, 0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.387f, 0.278f)
                lineToRelative(3.027f, -2.018f)
                lineToRelative(0.087f, -0.07f)
                lineToRelative(0.074f, -0.075f)
                lineToRelative(0.075f, -0.094f)
                lineToRelative(0.052f, -0.08f)
                lineToRelative(0.035f, -0.07f)
                lineToRelative(0.051f, -0.132f)
                lineToRelative(0.031f, -0.135f)
                lineToRelative(0.01f, -0.082f)
                lineToRelative(0.003f, -0.076f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
            }
        }
        .build()
        return _clockHour8!!
    }

private var _clockHour8: ImageVector? = null
