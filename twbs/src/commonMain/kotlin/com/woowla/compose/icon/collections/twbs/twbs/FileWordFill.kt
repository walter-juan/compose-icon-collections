package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.FileWordFill: ImageVector
    get() {
        if (_fileWordFill != null) {
            return _fileWordFill!!
        }
        _fileWordFill = Builder(name = "FileWordFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                horizontalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                moveTo(5.485f, 4.879f)
                lineToRelative(1.036f, 4.144f)
                lineToRelative(0.997f, -3.655f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.964f, 0.0f)
                lineToRelative(0.997f, 3.655f)
                lineToRelative(1.036f, -4.144f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.97f, 0.242f)
                lineToRelative(-1.5f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.967f, 0.01f)
                lineTo(8.0f, 7.402f)
                lineToRelative(-1.018f, 3.73f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.967f, -0.01f)
                lineToRelative(-1.5f, -6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.97f, -0.242f)
                close()
            }
        }
        .build()
        return _fileWordFill!!
    }

private var _fileWordFill: ImageVector? = null
