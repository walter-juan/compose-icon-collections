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

public val FilledGroup.ClockHour11: ImageVector
    get() {
        if (_clockHour11 != null) {
            return _clockHour11!!
        }
        _clockHour11 = Builder(name = "ClockHour11", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -15.0f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.995f, -8.336f)
                moveToRelative(-4.952f, 9.659f)
                lineToRelative(0.069f, -0.006f)
                lineToRelative(0.096f, -0.016f)
                lineToRelative(0.089f, -0.023f)
                lineToRelative(0.099f, -0.038f)
                lineToRelative(0.082f, -0.04f)
                lineToRelative(0.113f, -0.073f)
                lineToRelative(0.073f, -0.06f)
                lineToRelative(0.074f, -0.074f)
                lineToRelative(0.075f, -0.094f)
                lineToRelative(0.052f, -0.08f)
                lineToRelative(0.035f, -0.07f)
                lineToRelative(0.051f, -0.132f)
                lineToRelative(0.031f, -0.135f)
                lineToRelative(0.01f, -0.082f)
                lineToRelative(0.003f, -0.076f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(1.697f)
                lineToRelative(-0.168f, -0.252f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.286f, -0.336f)
                lineToRelative(-0.1f, 0.059f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.278f, 1.387f)
                lineToRelative(2.018f, 3.027f)
                lineToRelative(0.07f, 0.087f)
                lineToRelative(0.075f, 0.074f)
                lineToRelative(0.094f, 0.075f)
                lineToRelative(0.08f, 0.052f)
                lineToRelative(0.07f, 0.035f)
                lineToRelative(0.132f, 0.051f)
                lineToRelative(0.135f, 0.031f)
                lineToRelative(0.082f, 0.01f)
                close()
            }
        }
        .build()
        return _clockHour11!!
    }

private var _clockHour11: ImageVector? = null
