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

public val FilledGroup.FileRss: ImageVector
    get() {
        if (_fileRss != null) {
            return _fileRss!!
        }
        _fileRss = Builder(name = "FileRss", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(9.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.995f, 1.85f)
                lineToRelative(0.005f, 0.15f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                moveToRelative(0.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -7.0f, -7.0f)
                moveToRelative(0.01f, 6.0f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.117f, 1.993f)
                lineToRelative(0.127f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(5.989f, -13.001f)
                lineToRelative(4.001f, 4.001f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _fileRss!!
    }

private var _fileRss: ImageVector? = null
