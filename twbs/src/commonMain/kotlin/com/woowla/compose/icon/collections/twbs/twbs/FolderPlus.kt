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

public val Twbs.FolderPlus: ImageVector
    get() {
        if (_folderPlus != null) {
            return _folderPlus!!
        }
        _folderPlus = Builder(name = "FolderPlus", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.5f, 3.0f)
                lineToRelative(0.04f, 0.87f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.342f, 1.311f)
                lineToRelative(0.637f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.826f, 14.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(2.826f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.995f, -0.91f)
                lineToRelative(-0.637f, -7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.19f, 4.0f)
                horizontalLineToRelative(11.62f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.996f, 1.09f)
                lineTo(14.54f, 8.0f)
                horizontalLineToRelative(1.005f)
                lineToRelative(0.256f, -2.819f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.81f, 3.0f)
                horizontalLineTo(9.828f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.414f, -0.586f)
                lineToRelative(-0.828f, -0.828f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.172f, 1.0f)
                horizontalLineTo(2.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                moveToRelative(5.672f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.707f, 0.293f)
                lineTo(7.586f, 3.0f)
                horizontalLineTo(2.19f)
                quadToRelative(-0.362f, 0.002f, -0.683f, 0.12f)
                lineTo(1.5f, 2.98f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -0.98f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
            }
        }
        .build()
        return _folderPlus!!
    }

private var _folderPlus: ImageVector? = null
