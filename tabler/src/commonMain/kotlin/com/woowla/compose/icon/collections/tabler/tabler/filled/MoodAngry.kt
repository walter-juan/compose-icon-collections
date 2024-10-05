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

public val FilledGroup.MoodAngry: ImageVector
    get() {
        if (_moodAngry != null) {
            return _moodAngry!!
        }
        _moodAngry = Builder(name = "MoodAngry", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 0.0f, -20.0f)
                moveToRelative(0.0f, 12.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -3.214f, 1.35f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.428f, 1.4f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 3.572f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.428f, -1.4f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -3.214f, -1.35f)
                moveToRelative(-3.553f, -5.895f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.894f, 1.788f)
                lineToRelative(2.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.894f, -1.788f)
                close()
                moveTo(16.894f, 8.552f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.341f, -0.447f)
                lineToRelative(-2.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.894f, 1.788f)
                lineToRelative(2.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.447f, -1.341f)
            }
        }
        .build()
        return _moodAngry!!
    }

private var _moodAngry: ImageVector? = null
