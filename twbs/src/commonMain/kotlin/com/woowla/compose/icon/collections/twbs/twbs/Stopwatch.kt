package com.woowla.compose.icon.collections.twbs.twbs

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
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Stopwatch: ImageVector
    get() {
        if (_stopwatch != null) {
            return _stopwatch!!
        }
        _stopwatch = Builder(name = "Stopwatch", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 5.6f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                verticalLineToRelative(2.9f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineTo(8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 1.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 7.0f, 0.5f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                verticalLineToRelative(0.57f)
                curveToRelative(1.36f, 0.196f, 2.594f, 0.78f, 3.584f, 1.64f)
                lineToRelative(0.012f, -0.013f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(-0.354f, -0.353f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.707f, -0.708f)
                lineToRelative(1.414f, 1.415f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.707f, 0.707f)
                lineToRelative(-0.353f, -0.354f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-0.013f, 0.012f)
                arcTo(7.0f, 7.0f, 0.0f, true, true, 7.0f, 2.071f)
                verticalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                moveTo(8.0f, 3.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.001f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 8.0f, 3.0f)
            }
        }
        .build()
        return _stopwatch!!
    }

private var _stopwatch: ImageVector? = null
