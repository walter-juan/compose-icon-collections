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

public val FilledGroup.Book: ImageVector
    get() {
        if (_book != null) {
            return _book!!
        }
        _book = Builder(name = "Book", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 5.134f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.493f, 0.748f)
                lineToRelative(0.007f, 0.118f)
                verticalLineToRelative(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.5f, 0.866f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.5f, -0.266f)
                verticalLineToRelative(-15.174f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 8.5f, 0.708f)
                moveToRelative(-10.5f, -0.707f)
                lineToRelative(0.001f, 15.174f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.234f, 0.117f)
                lineToRelative(-0.327f, 0.18f)
                lineToRelative(-0.103f, 0.044f)
                lineToRelative(-0.049f, 0.016f)
                lineToRelative(-0.11f, 0.026f)
                lineToRelative(-0.061f, 0.01f)
                lineToRelative(-0.117f, 0.006f)
                horizontalLineToRelative(-0.042f)
                lineToRelative(-0.11f, -0.012f)
                lineToRelative(-0.077f, -0.014f)
                lineToRelative(-0.108f, -0.032f)
                lineToRelative(-0.126f, -0.056f)
                lineToRelative(-0.095f, -0.056f)
                lineToRelative(-0.089f, -0.067f)
                lineToRelative(-0.06f, -0.056f)
                lineToRelative(-0.073f, -0.082f)
                lineToRelative(-0.064f, -0.089f)
                lineToRelative(-0.022f, -0.036f)
                lineToRelative(-0.032f, -0.06f)
                lineToRelative(-0.044f, -0.103f)
                lineToRelative(-0.016f, -0.049f)
                lineToRelative(-0.026f, -0.11f)
                lineToRelative(-0.01f, -0.061f)
                lineToRelative(-0.004f, -0.049f)
                lineToRelative(-0.002f, -13.068f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.5f, -0.866f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 8.5f, -0.707f)
            }
        }
        .build()
        return _book!!
    }

private var _book: ImageVector? = null
