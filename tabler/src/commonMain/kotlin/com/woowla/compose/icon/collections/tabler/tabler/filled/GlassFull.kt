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

public val FilledGroup.GlassFull: ImageVector
    get() {
        if (_glassFull != null) {
            return _glassFull!!
        }
        _glassFull = Builder(name = "GlassFull", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.004f, 10.229f)
                lineToRelative(-0.003f, -0.186f)
                lineToRelative(0.001f, -0.113f)
                lineToRelative(0.008f, -0.071f)
                lineToRelative(1.0f, -7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.877f, -0.853f)
                lineToRelative(0.113f, -0.006f)
                horizontalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.968f, 0.747f)
                lineToRelative(0.022f, 0.112f)
                lineToRelative(1.006f, 7.05f)
                lineToRelative(0.004f, 0.091f)
                curveToRelative(0.0f, 3.226f, -2.56f, 5.564f, -6.0f, 5.945f)
                verticalLineToRelative(4.055f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.117f, -1.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.055f)
                curveToRelative(-3.358f, -0.371f, -5.878f, -2.609f, -5.996f, -5.716f)
                close()
                moveTo(16.133f, 4.0f)
                horizontalLineToRelative(-8.267f)
                lineToRelative(-0.607f, 4.258f)
                arcToRelative(6.001f, 6.001f, 0.0f, false, true, 5.125f, 0.787f)
                lineToRelative(0.216f, 0.155f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.32f, 0.31f)
                lineToRelative(-0.787f, -5.51f)
                close()
            }
        }
        .build()
        return _glassFull!!
    }

private var _glassFull: ImageVector? = null
