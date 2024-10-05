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

public val FilledGroup.ZoomQuestion: ImageVector
    get() {
        if (_zoomQuestion != null) {
            return _zoomQuestion!!
        }
        _zoomQuestion = Builder(name = "ZoomQuestion", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.072f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.32f, 11.834f)
                lineToRelative(5.387f, 5.387f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 1.414f)
                lineToRelative(-5.388f, -5.387f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.905f, -6.32f)
                lineToRelative(0.005f, -0.285f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.995f, -6.643f)
                moveToRelative(-4.0f, 8.928f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.127f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.993f, 0.117f)
                lineToRelative(0.007f, -0.127f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                moveToRelative(-1.9f, -5.123f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.433f, 1.389f)
                lineToRelative(0.088f, -0.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.379f, 0.824f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.002f, 2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -1.9f, -4.123f)
            }
        }
        .build()
        return _zoomQuestion!!
    }

private var _zoomQuestion: ImageVector? = null
