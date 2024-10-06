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

public val FilledGroup.Apple: ImageVector
    get() {
        if (_apple != null) {
            return _apple!!
        }
        _apple = Builder(name = "Apple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                curveToRelative(-0.693f, 0.0f, -1.33f, 0.694f, -1.691f, 1.552f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, true, 1.982f, -0.544f)
                lineToRelative(0.265f, -0.008f)
                curveToRelative(2.982f, 0.0f, 5.444f, 3.053f, 5.444f, 6.32f)
                curveToRelative(0.0f, 3.547f, -0.606f, 5.862f, -2.423f, 8.578f)
                curveToRelative(-1.692f, 2.251f, -4.092f, 2.753f, -6.41f, 1.234f)
                arcToRelative(0.31f, 0.31f, 0.0f, false, false, -0.317f, -0.01f)
                curveToRelative(-2.335f, 1.528f, -4.735f, 1.027f, -6.46f, -1.27f)
                curveToRelative(-1.783f, -2.668f, -2.39f, -4.984f, -2.39f, -8.532f)
                lineToRelative(0.004f, -0.222f)
                curveToRelative(0.108f, -3.181f, 2.526f, -6.098f, 5.44f, -6.098f)
                curveToRelative(0.94f, 0.0f, 1.852f, 0.291f, 2.688f, 0.792f)
                curveToRelative(0.419f, -1.95f, 1.818f, -3.792f, 3.868f, -3.792f)
                moveToRelative(-7.034f, 6.154f)
                curveToRelative(-1.36f, 0.858f, -1.966f, 2.06f, -1.966f, 3.846f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                curveToRelative(0.0f, -1.125f, 0.28f, -1.678f, 1.034f, -2.154f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.068f, -1.692f)
            }
        }
        .build()
        return _apple!!
    }

private var _apple: ImageVector? = null
