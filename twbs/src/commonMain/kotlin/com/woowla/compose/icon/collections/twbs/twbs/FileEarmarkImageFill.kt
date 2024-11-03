package com.woowla.compose.icon.collections.twbs.twbs

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
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.FileEarmarkImageFill: ImageVector
    get() {
        if (_fileEarmarkImageFill != null) {
            return _fileEarmarkImageFill!!
        }
        _fileEarmarkImageFill = Builder(name = "FileEarmarkImageFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 0.0f)
                horizontalLineToRelative(5.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 0.293f)
                lineTo(13.707f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.293f, 0.707f)
                verticalLineToRelative(5.586f)
                lineToRelative(-2.73f, -2.73f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.52f, 0.127f)
                lineToRelative(-1.889f, 2.644f)
                lineToRelative(-1.769f, -1.062f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.222f, 0.15f)
                lineTo(2.0f, 12.292f)
                lineTo(2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                moveToRelative(5.5f, 1.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(8.002f, 5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.564f, 8.27f)
                lineTo(14.0f, 11.708f)
                verticalLineTo(14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-0.293f)
                lineToRelative(3.578f, -3.577f)
                lineToRelative(2.56f, 1.536f)
                lineToRelative(2.426f, -3.395f)
                close()
            }
        }
        .build()
        return _fileEarmarkImageFill!!
    }

private var _fileEarmarkImageFill: ImageVector? = null
