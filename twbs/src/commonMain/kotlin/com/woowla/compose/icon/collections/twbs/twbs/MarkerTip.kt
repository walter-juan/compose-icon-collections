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

public val Twbs.MarkerTip: ImageVector
    get() {
        if (_markerTip != null) {
            return _markerTip!!
        }
        _markerTip = Builder(name = "MarkerTip", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveToRelative(-4.5f, 6.064f)
                lineToRelative(-1.281f, -4.696f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 9.736f, 9.0f)
                horizontalLineTo(6.264f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.483f, 0.368f)
                lineToRelative(-1.28f, 4.696f)
                arcTo(6.97f, 6.97f, 0.0f, false, false, 8.0f, 15.0f)
                curveToRelative(1.275f, 0.0f, 2.47f, -0.34f, 3.5f, -0.936f)
                moveToRelative(0.873f, -0.598f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, -8.746f, 0.0f)
                lineToRelative(1.19f, -4.36f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.31f, -1.1f)
                lineToRelative(1.155f, -3.851f)
                curveToRelative(0.213f, -0.713f, 1.223f, -0.713f, 1.436f, 0.0f)
                lineToRelative(1.156f, 3.851f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.31f, 1.1f)
                close()
            }
        }
        .build()
        return _markerTip!!
    }

private var _markerTip: ImageVector? = null
