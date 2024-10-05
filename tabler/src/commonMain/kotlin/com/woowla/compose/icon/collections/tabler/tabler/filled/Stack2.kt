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

public val FilledGroup.Stack2: ImageVector
    get() {
        if (_stack2 != null) {
            return _stack2!!
        }
        _stack2 = Builder(name = "Stack2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.894f, 15.553f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.447f, 1.341f)
                lineToRelative(-8.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.894f, 0.0f)
                lineToRelative(-8.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.894f, -1.788f)
                lineToRelative(7.553f, 3.774f)
                lineToRelative(7.554f, -3.775f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.341f, 0.447f)
                moveToRelative(0.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.447f, 1.341f)
                lineToRelative(-8.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.894f, 0.0f)
                lineToRelative(-8.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.894f, -1.788f)
                lineToRelative(7.552f, 3.775f)
                lineToRelative(7.554f, -3.775f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.341f, 0.447f)
                moveToRelative(-8.887f, -8.552f)
                quadToRelative(0.056f, 0.0f, 0.111f, 0.007f)
                lineToRelative(0.111f, 0.02f)
                lineToRelative(0.086f, 0.024f)
                lineToRelative(0.012f, 0.006f)
                lineToRelative(0.012f, 0.002f)
                lineToRelative(0.029f, 0.014f)
                lineToRelative(0.05f, 0.019f)
                lineToRelative(0.016f, 0.009f)
                lineToRelative(0.012f, 0.005f)
                lineToRelative(8.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.788f)
                lineToRelative(-8.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.894f, 0.0f)
                lineToRelative(-8.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.788f)
                lineToRelative(8.0f, -4.0f)
                lineToRelative(0.011f, -0.005f)
                lineToRelative(0.018f, -0.01f)
                lineToRelative(0.078f, -0.032f)
                lineToRelative(0.011f, -0.002f)
                lineToRelative(0.013f, -0.006f)
                lineToRelative(0.086f, -0.024f)
                lineToRelative(0.11f, -0.02f)
                lineToRelative(0.056f, -0.005f)
                close()
            }
        }
        .build()
        return _stack2!!
    }

private var _stack2: ImageVector? = null