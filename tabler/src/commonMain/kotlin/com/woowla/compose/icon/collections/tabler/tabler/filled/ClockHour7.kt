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

public val FilledGroup.ClockHour7: ImageVector
    get() {
        if (_clockHour7 != null) {
            return _clockHour7!!
        }
        _clockHour7 = Builder(name = "ClockHour7", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -15.0f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.995f, -8.336f)
                moveToRelative(-4.007f, 8.777f)
                lineToRelative(0.007f, -0.117f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(4.696f)
                lineToRelative(-1.832f, 2.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.184f, 1.316f)
                lineToRelative(0.093f, 0.07f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.387f, -0.277f)
                lineToRelative(2.024f, -3.038f)
                lineToRelative(0.06f, -0.116f)
                lineToRelative(0.032f, -0.081f)
                lineToRelative(0.03f, -0.109f)
                close()
            }
        }
        .build()
        return _clockHour7!!
    }

private var _clockHour7: ImageVector? = null
