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

public val FilledGroup.ClockHour4: ImageVector
    get() {
        if (_clockHour4 != null) {
            return _clockHour4!!
        }
        _clockHour4 = Builder(name = "ClockHour4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                verticalLineToRelative(5.026f)
                lineToRelative(0.009f, 0.105f)
                lineToRelative(0.02f, 0.107f)
                lineToRelative(0.04f, 0.129f)
                lineToRelative(0.048f, 0.102f)
                lineToRelative(0.046f, 0.078f)
                lineToRelative(0.042f, 0.06f)
                lineToRelative(0.069f, 0.08f)
                lineToRelative(0.088f, 0.083f)
                lineToRelative(0.083f, 0.062f)
                lineToRelative(3.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.11f, -1.664f)
                lineToRelative(-2.555f, -1.704f)
                verticalLineToRelative(-4.464f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.883f, -0.993f)
                close()
            }
        }
        .build()
        return _clockHour4!!
    }

private var _clockHour4: ImageVector? = null
