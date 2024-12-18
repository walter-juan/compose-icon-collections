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

public val FilledGroup.ChartPie4: ImageVector
    get() {
        if (_chartPie4 != null) {
            return _chartPie4!!
        }
        _chartPie4 = Builder(name = "ChartPie4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.844f, 13.57f)
                lineToRelative(4.843f, 7.264f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -11.015f, -1.09f)
                close()
                moveTo(18.351f, 19.724f)
                lineToRelative(-4.481f, -6.724f)
                horizontalLineToRelative(8.081f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -3.348f, 6.511f)
                close()
                moveTo(11.001f, 2.05f)
                verticalLineToRelative(9.534f)
                lineToRelative(-6.744f, 6.744f)
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
        return _chartPie4!!
    }

private var _chartPie4: ImageVector? = null
