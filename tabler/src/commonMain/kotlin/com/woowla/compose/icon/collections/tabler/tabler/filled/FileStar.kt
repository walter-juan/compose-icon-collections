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

public val FilledGroup.FileStar: ImageVector
    get() {
        if (_fileStar != null) {
            return _fileStar!!
        }
        _fileStar = Builder(name = "FileStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(11.8f, 11.0f)
                arcToRelative(0.39f, 0.39f, 0.0f, false, false, -0.351f, 0.217f)
                lineToRelative(-1.086f, 2.193f)
                lineToRelative(-2.428f, 0.352f)
                arcToRelative(0.389f, 0.389f, 0.0f, false, false, -0.217f, 0.665f)
                lineToRelative(1.757f, 1.707f)
                lineToRelative(-0.415f, 2.411f)
                arcToRelative(0.392f, 0.392f, 0.0f, false, false, 0.568f, 0.41f)
                lineToRelative(2.172f, -1.138f)
                lineToRelative(2.172f, 1.138f)
                arcToRelative(0.39f, 0.39f, 0.0f, false, false, 0.567f, -0.411f)
                lineToRelative(-0.414f, -2.41f)
                lineToRelative(1.757f, -1.707f)
                arcToRelative(0.39f, 0.39f, 0.0f, false, false, -0.217f, -0.665f)
                lineToRelative(-2.428f, -0.352f)
                lineToRelative(-1.086f, -2.193f)
                arcToRelative(0.39f, 0.39f, 0.0f, false, false, -0.351f, -0.217f)
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
        return _fileStar!!
    }

private var _fileStar: ImageVector? = null
