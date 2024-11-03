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

public val Twbs.FolderFill: ImageVector
    get() {
        if (_folderFill != null) {
            return _folderFill!!
        }
        _folderFill = Builder(name = "FolderFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.828f, 3.0f)
                horizontalLineToRelative(3.982f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.992f, 2.181f)
                lineToRelative(-0.637f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.174f, 14.0f)
                horizontalLineTo(2.825f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.991f, -1.819f)
                lineToRelative(-0.637f, -7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.342f, -1.31f)
                lineTo(0.5f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(3.672f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.414f, 0.586f)
                lineToRelative(0.828f, 0.828f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.828f, 3.0f)
                moveToRelative(-8.322f, 0.12f)
                quadToRelative(0.322f, -0.119f, 0.684f, -0.12f)
                horizontalLineToRelative(5.396f)
                lineToRelative(-0.707f, -0.707f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.172f, 2.0f)
                horizontalLineTo(2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 0.981f)
                close()
            }
        }
        .build()
        return _folderFill!!
    }

private var _folderFill: ImageVector? = null
