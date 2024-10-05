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

public val FilledGroup.ClockHour10: ImageVector
    get() {
        if (_clockHour10 != null) {
            return _clockHour10!!
        }
        _clockHour10 = Builder(name = "ClockHour10", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -15.0f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.995f, -8.336f)
                moveToRelative(-5.401f, 9.576f)
                lineToRelative(0.052f, 0.021f)
                lineToRelative(0.08f, 0.026f)
                lineToRelative(0.08f, 0.019f)
                lineToRelative(0.072f, 0.011f)
                lineToRelative(0.117f, 0.007f)
                lineToRelative(0.076f, -0.003f)
                lineToRelative(0.135f, -0.02f)
                lineToRelative(0.082f, -0.02f)
                lineToRelative(0.103f, -0.039f)
                lineToRelative(0.073f, -0.035f)
                lineToRelative(0.078f, -0.046f)
                lineToRelative(0.06f, -0.042f)
                lineToRelative(0.08f, -0.069f)
                lineToRelative(0.083f, -0.088f)
                lineToRelative(0.062f, -0.083f)
                lineToRelative(0.053f, -0.09f)
                lineToRelative(0.031f, -0.064f)
                lineToRelative(0.032f, -0.081f)
                lineToRelative(0.03f, -0.109f)
                lineToRelative(0.015f, -0.094f)
                lineToRelative(0.007f, -0.117f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(3.131f)
                lineToRelative(-1.445f, -0.963f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.317f, 0.184f)
                lineToRelative(-0.07f, 0.093f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.277f, 1.387f)
                lineToRelative(3.038f, 2.024f)
                close()
            }
        }
        .build()
        return _clockHour10!!
    }

private var _clockHour10: ImageVector? = null
