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

public val FilledGroup.ChartPie3: ImageVector
    get() {
        if (_chartPie3 != null) {
            return _chartPie3!!
        }
        _chartPie3 = Builder(name = "ChartPie3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 20.66f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -11.328f, -0.917f)
                lineToRelative(6.742f, -6.743f)
                horizontalLineToRelative(9.536f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -4.95f, 7.66f)
                moveToRelative(-6.0f, -18.61f)
                verticalLineToRelative(9.534f)
                lineToRelative(-6.743f, 6.744f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -2.257f, -6.328f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 8.995f, -9.626f)
                moveToRelative(6.0f, 1.29f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 4.95f, 7.66f)
                horizontalLineToRelative(-8.95f)
                verticalLineToRelative(-8.95f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 4.0f, 1.29f)
            }
        }
        .build()
        return _chartPie3!!
    }

private var _chartPie3: ImageVector? = null
