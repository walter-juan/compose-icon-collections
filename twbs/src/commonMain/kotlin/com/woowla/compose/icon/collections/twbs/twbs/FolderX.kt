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

public val Twbs.FolderX: ImageVector
    get() {
        if (_folderX != null) {
            return _folderX!!
        }
        _folderX = Builder(name = "FolderX", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.54f, 3.87f)
                lineTo(0.5f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(3.672f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.414f, 0.586f)
                lineToRelative(0.828f, 0.828f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.828f, 3.0f)
                horizontalLineToRelative(3.982f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.992f, 2.181f)
                lineTo(15.546f, 8.0f)
                lineTo(14.54f, 8.0f)
                lineToRelative(0.265f, -2.91f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.81f, 4.0f)
                lineTo(2.19f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.996f, 1.09f)
                lineToRelative(0.637f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.995f, 0.91f)
                lineTo(9.0f, 13.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.826f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.991f, -1.819f)
                lineToRelative(-0.637f, -7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.342f, -1.31f)
                close()
                moveTo(6.879f, 2.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.172f, 2.0f)
                lineTo(2.5f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 0.981f)
                lineToRelative(0.006f, 0.139f)
                quadToRelative(0.323f, -0.119f, 0.684f, -0.12f)
                horizontalLineToRelative(5.396f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.854f, 10.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.707f, 0.708f)
                lineTo(12.293f, 12.0f)
                lineToRelative(-1.146f, 1.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, 0.708f)
                lineTo(13.0f, 12.707f)
                lineToRelative(1.146f, 1.147f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, -0.708f)
                lineTo(13.707f, 12.0f)
                lineToRelative(1.147f, -1.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.707f, -0.708f)
                lineTo(13.0f, 11.293f)
                close()
            }
        }
        .build()
        return _folderX!!
    }

private var _folderX: ImageVector? = null
