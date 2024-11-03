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

public val Twbs.FileExcelFill: ImageVector
    get() {
        if (_fileExcelFill != null) {
            return _fileExcelFill!!
        }
        _fileExcelFill = Builder(name = "FileExcelFill", defaultWidth = 16.0.dp, defaultHeight =
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
                moveTo(5.884f, 4.68f)
                lineTo(8.0f, 7.219f)
                lineToRelative(2.116f, -2.54f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.768f, 0.641f)
                lineTo(8.651f, 8.0f)
                lineToRelative(2.233f, 2.68f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.768f, 0.64f)
                lineTo(8.0f, 8.781f)
                lineToRelative(-2.116f, 2.54f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.768f, -0.641f)
                lineTo(7.349f, 8.0f)
                lineTo(5.116f, 5.32f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.768f, -0.64f)
            }
        }
        .build()
        return _fileExcelFill!!
    }

private var _fileExcelFill: ImageVector? = null
