package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.StopwatchFill: ImageVector
    get() {
        if (_stopwatchFill != null) {
            return _stopwatchFill!!
        }
        _stopwatchFill = Builder(name = "StopwatchFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                lineTo(7.0f, 1.0f)
                verticalLineToRelative(1.07f)
                arcTo(7.001f, 7.001f, 0.0f, false, false, 8.0f, 16.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 5.29f, -11.584f)
                lineToRelative(0.013f, -0.012f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(0.353f, 0.354f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.707f, -0.707f)
                lineToRelative(-1.414f, -1.415f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.707f, 0.707f)
                lineToRelative(0.354f, 0.354f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-0.012f, 0.012f)
                arcTo(6.97f, 6.97f, 0.0f, false, false, 9.0f, 2.071f)
                lineTo(9.0f, 1.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
                moveTo(8.5f, 5.6f)
                lineTo(8.5f, 9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(4.5f, 9.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                lineTo(7.5f, 5.6f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
            }
        }
        .build()
        return _stopwatchFill!!
    }

private var _stopwatchFill: ImageVector? = null
