package com.woowla.compose.icon.collections.tabler.tabler.filled

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
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.FilePower: ImageVector
    get() {
        if (_filePower != null) {
            return _filePower!!
        }
        _filePower = Builder(name = "FilePower", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.876f, 0.876f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(4.0f)
                lineToRelative(0.005f, 0.15f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.838f, 1.844f)
                lineToRelative(0.157f, 0.006f)
                horizontalLineToRelative(4.0f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.876f, 0.876f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.824f, 2.995f)
                lineToRelative(-0.176f, 0.005f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.995f, -2.824f)
                lineToRelative(-0.005f, -0.176f)
                verticalLineToRelative(-14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.824f, -2.995f)
                lineToRelative(0.176f, -0.005f)
                close()
                moveTo(12.555f, 11.168f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.387f, 0.277f)
                lineToRelative(-2.0f, 3.0f)
                lineToRelative(-0.057f, 0.097f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.889f, 1.458f)
                horizontalLineToRelative(2.13f)
                lineToRelative(-0.962f, 1.445f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.664f, 1.11f)
                lineToRelative(2.0f, -3.0f)
                lineToRelative(0.057f, -0.097f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.889f, -1.458f)
                horizontalLineToRelative(-2.132f)
                lineToRelative(0.964f, -1.445f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.277f, -1.387f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 7.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(-0.001f, -4.001f)
                close()
            }
        }
        .build()
        return _filePower!!
    }

private var _filePower: ImageVector? = null
