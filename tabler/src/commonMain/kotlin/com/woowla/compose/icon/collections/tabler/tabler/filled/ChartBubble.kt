package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.ChartBubble: ImageVector
    get() {
        if (_chartBubble != null) {
            return _chartBubble!!
        }
        _chartBubble = Builder(name = "ChartBubble", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -3.995f, 4.2f)
                lineToRelative(-0.005f, -0.2f)
                lineToRelative(0.005f, -0.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.995f, -3.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 16.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -2.995f, 3.176f)
                lineToRelative(-0.005f, -0.176f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.995f, -2.824f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 2.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -5.496f, 5.721f)
                lineToRelative(-0.004f, -0.221f)
                lineToRelative(0.004f, -0.221f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 5.496f, -5.279f)
                close()
            }
        }
        .build()
        return _chartBubble!!
    }

private var _chartBubble: ImageVector? = null
