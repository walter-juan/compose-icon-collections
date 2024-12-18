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

public val FilledGroup.ChartFunnel: ImageVector
    get() {
        if (_chartFunnel != null) {
            return _chartFunnel!!
        }
        _chartFunnel = Builder(name = "ChartFunnel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.72f, 16.0f)
                lineToRelative(-1.315f, 3.948f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.847f, 2.052f)
                horizontalLineToRelative(-3.116f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.847f, -2.052f)
                lineToRelative(-1.315f, -3.948f)
                close()
                moveTo(19.72f, 10.0f)
                lineToRelative(-1.333f, 4.0f)
                horizontalLineToRelative(-12.774f)
                lineToRelative(-1.333f, -4.0f)
                close()
                moveTo(19.614f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.896f, 2.632f)
                lineToRelative(-1.123f, 3.368f)
                horizontalLineToRelative(-16.774f)
                lineToRelative(-1.123f, -3.368f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.72f, -2.624f)
                lineToRelative(0.177f, -0.008f)
                close()
            }
        }
        .build()
        return _chartFunnel!!
    }

private var _chartFunnel: ImageVector? = null
