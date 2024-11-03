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

public val Twbs.FileEarmarkDiffFill: ImageVector
    get() {
        if (_fileEarmarkDiffFill != null) {
            return _fileEarmarkDiffFill!!
        }
        _fileEarmarkDiffFill = Builder(name = "FileEarmarkDiffFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.293f, 0.0f)
                horizontalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(4.707f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.707f, 4.0f)
                lineTo(10.0f, 0.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.293f, 0.0f)
                moveTo(9.5f, 3.5f)
                verticalLineToRelative(-2.0f)
                lineToRelative(3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                moveTo(8.0f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(6.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 6.0f)
                moveToRelative(-2.5f, 6.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 12.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineTo(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
            }
        }
        .build()
        return _fileEarmarkDiffFill!!
    }

private var _fileEarmarkDiffFill: ImageVector? = null
