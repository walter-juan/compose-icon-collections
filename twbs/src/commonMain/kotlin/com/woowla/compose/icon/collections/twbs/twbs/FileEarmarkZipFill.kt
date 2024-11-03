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

public val Twbs.FileEarmarkZipFill: ImageVector
    get() {
        if (_fileEarmarkZipFill != null) {
            return _fileEarmarkZipFill!!
        }
        _fileEarmarkZipFill = Builder(name = "FileEarmarkZipFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 9.438f)
                verticalLineTo(8.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.938f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.03f, 0.243f)
                lineToRelative(0.4f, 1.598f)
                lineToRelative(-0.93f, 0.62f)
                lineToRelative(-0.93f, -0.62f)
                lineToRelative(0.4f, -1.598f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.03f, -0.243f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.293f, 0.0f)
                lineTo(4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(14.0f, 4.707f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.707f, 4.0f)
                lineTo(10.0f, 0.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.293f, 0.0f)
                moveTo(9.5f, 3.5f)
                verticalLineToRelative(-2.0f)
                lineToRelative(3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                moveToRelative(-4.0f, -0.5f)
                lineTo(5.5f, 2.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(4.5f, 1.0f)
                lineTo(6.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.5f, 7.0f)
                lineTo(5.5f, 6.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(4.5f, 5.0f)
                horizontalLineToRelative(1.0f)
                lineTo(5.5f, 4.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(4.5f, 3.0f)
                close()
                moveTo(5.5f, 7.5f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(0.938f)
                lineToRelative(0.4f, 1.599f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.416f, 1.074f)
                lineToRelative(-0.93f, 0.62f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.109f, 0.0f)
                lineToRelative(-0.93f, -0.62f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.415f, -1.074f)
                lineToRelative(0.4f, -1.599f)
                lineTo(4.5f, 8.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
            }
        }
        .build()
        return _fileEarmarkZipFill!!
    }

private var _fileEarmarkZipFill: ImageVector? = null
