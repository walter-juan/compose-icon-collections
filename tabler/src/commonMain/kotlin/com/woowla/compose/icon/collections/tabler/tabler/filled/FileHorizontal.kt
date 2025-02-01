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

public val FilledGroup.FileHorizontal: ImageVector
    get() {
        if (_fileHorizontal != null) {
            return _fileHorizontal!!
        }
        _fileHorizontal = Builder(name = "FileHorizontal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.876f, -0.876f)
                lineToRelative(-0.117f, -0.007f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(-0.15f, -0.005f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.844f, -1.838f)
                lineToRelative(-0.006f, -0.157f)
                verticalLineToRelative(-4.0f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.876f, -0.876f)
                lineToRelative(-0.117f, -0.007f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.995f, 2.824f)
                lineToRelative(-0.005f, 0.176f)
                verticalLineToRelative(10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.824f, 2.995f)
                lineToRelative(0.176f, 0.005f)
                horizontalLineToRelative(14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.995f, -2.824f)
                lineToRelative(0.005f, -0.176f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 5.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(4.001f, 0.001f)
                close()
            }
        }
        .build()
        return _fileHorizontal!!
    }

private var _fileHorizontal: ImageVector? = null
