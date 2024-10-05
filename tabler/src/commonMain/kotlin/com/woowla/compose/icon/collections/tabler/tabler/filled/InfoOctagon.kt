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

public val FilledGroup.InfoOctagon: ImageVector
    get() {
        if (_infoOctagon != null) {
            return _infoOctagon!!
        }
        _infoOctagon = Builder(name = "InfoOctagon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.897f, 1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.664f, 1.016f)
                lineToRelative(0.165f, 0.156f)
                lineToRelative(4.1f, 4.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.168f, 2.605f)
                lineToRelative(0.006f, 0.227f)
                verticalLineToRelative(5.794f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.016f, 2.664f)
                lineToRelative(-0.156f, 0.165f)
                lineToRelative(-4.1f, 4.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.603f, 1.168f)
                lineToRelative(-0.227f, 0.006f)
                horizontalLineToRelative(-5.795f)
                arcToRelative(3.999f, 3.999f, 0.0f, false, true, -2.664f, -1.017f)
                lineToRelative(-0.165f, -0.156f)
                lineToRelative(-4.1f, -4.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.168f, -2.604f)
                lineToRelative(-0.006f, -0.227f)
                verticalLineToRelative(-5.794f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.016f, -2.664f)
                lineToRelative(0.156f, -0.165f)
                lineToRelative(4.1f, -4.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.605f, -1.168f)
                lineToRelative(0.227f, -0.006f)
                horizontalLineToRelative(5.793f)
                close()
                moveTo(12.0f, 11.0f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.986f)
                lineToRelative(0.117f, 0.007f)
                verticalLineToRelative(3.0f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.876f, 0.876f)
                lineToRelative(0.117f, 0.007f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.876f, -0.876f)
                lineToRelative(0.007f, -0.117f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.764f, -0.857f)
                lineToRelative(-0.112f, -0.02f)
                lineToRelative(-0.117f, -0.006f)
                verticalLineToRelative(-3.0f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.876f, -0.876f)
                lineToRelative(-0.117f, -0.007f)
                close()
                moveTo(12.01f, 8.0f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.986f)
                lineToRelative(0.117f, 0.007f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.986f)
                lineToRelative(-0.117f, -0.007f)
                close()
            }
        }
        .build()
        return _infoOctagon!!
    }

private var _infoOctagon: ImageVector? = null
