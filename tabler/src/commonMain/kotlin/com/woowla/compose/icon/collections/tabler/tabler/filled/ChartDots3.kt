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

public val FilledGroup.ChartDots3: ImageVector
    get() {
        if (_chartDots3 != null) {
            return _chartDots3!!
        }
        _chartDots3 = Builder(name = "ChartDots3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -3.843f, 5.114f)
                lineToRelative(-6.295f, 0.786f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.094f, 0.257f)
                lineToRelative(6.446f, 4.431f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -0.695f, 4.099f)
                lineToRelative(-3.527f, 1.058f)
                quadToRelative(0.008f, 0.127f, 0.008f, 0.255f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
                lineToRelative(0.005f, -0.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.366f, -1.954f)
                lineToRelative(3.64f, -1.094f)
                lineToRelative(0.01f, -0.102f)
                quadToRelative(0.023f, -0.204f, 0.074f, -0.4f)
                lineToRelative(-6.688f, -4.6f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -4.407f, -2.65f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 5.784f, -0.931f)
                lineToRelative(6.312f, -0.79f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.899f, -3.103f)
            }
        }
        .build()
        return _chartDots3!!
    }

private var _chartDots3: ImageVector? = null
