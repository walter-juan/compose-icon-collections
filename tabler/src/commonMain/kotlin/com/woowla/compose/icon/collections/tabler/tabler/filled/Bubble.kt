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

public val FilledGroup.Bubble: ImageVector
    get() {
        if (_bubble != null) {
            return _bubble!!
        }
        _bubble = Builder(name = "Bubble", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.4f, 2.0f)
                arcToRelative(6.33f, 6.33f, 0.0f, false, true, 5.491f, 3.176f)
                lineToRelative(0.09f, 0.162f)
                lineToRelative(0.126f, 0.027f)
                arcToRelative(6.335f, 6.335f, 0.0f, false, true, 4.889f, 5.934f)
                lineToRelative(0.004f, 0.234f)
                arcToRelative(6.333f, 6.333f, 0.0f, false, true, -6.333f, 6.334f)
                lineToRelative(-0.035f, -0.002f)
                lineToRelative(-0.035f, 0.05f)
                arcToRelative(5.26f, 5.26f, 0.0f, false, true, -3.958f, 2.08f)
                lineToRelative(-0.239f, 0.005f)
                quadToRelative(-0.722f, 0.0f, -1.404f, -0.19f)
                lineToRelative(-0.047f, -0.014f)
                lineToRelative(-3.434f, 2.061f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.509f, -0.743f)
                lineToRelative(-0.006f, -0.114f)
                verticalLineToRelative(-2.434f)
                lineToRelative(-0.121f, -0.06f)
                arcToRelative(3.67f, 3.67f, 0.0f, false, true, -1.94f, -3.042f)
                lineToRelative(-0.006f, -0.197f)
                quadToRelative(0.0f, -0.365f, 0.07f, -0.717f)
                lineToRelative(0.013f, -0.058f)
                lineToRelative(-0.113f, -0.09f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -2.098f, -4.218f)
                lineToRelative(-0.005f, -0.25f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 5.8f, -5.8f)
                lineToRelative(0.058f, 0.001f)
                lineToRelative(0.15f, -0.163f)
                arcToRelative(6.32f, 6.32f, 0.0f, false, true, 4.328f, -1.967f)
                close()
            }
        }
        .build()
        return _bubble!!
    }

private var _bubble: ImageVector? = null
