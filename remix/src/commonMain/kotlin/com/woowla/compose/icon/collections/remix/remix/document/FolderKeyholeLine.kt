package com.woowla.compose.icon.collections.remix.remix.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DocumentGroup

public val DocumentGroup.FolderKeyholeLine: ImageVector
    get() {
        if (_folderKeyholeLine != null) {
            return _folderKeyholeLine!!
        }
        _folderKeyholeLine = Builder(name = "FolderKeyholeLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.414f, 3.0f)
                lineTo(12.414f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 5.0f, 22.0f, 5.448f, 22.0f, 6.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(10.414f)
                close()
                moveTo(9.586f, 5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.586f)
                lineTo(9.586f, 5.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(13.105f, 9.0f, 14.0f, 9.895f, 14.0f, 11.0f)
                curveTo(14.0f, 11.74f, 13.598f, 12.386f, 13.001f, 12.732f)
                lineTo(13.0f, 17.0f)
                horizontalLineTo(11.0f)
                lineTo(11.0f, 12.732f)
                curveTo(10.402f, 12.387f, 10.0f, 11.74f, 10.0f, 11.0f)
                curveTo(10.0f, 9.895f, 10.895f, 9.0f, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _folderKeyholeLine!!
    }

private var _folderKeyholeLine: ImageVector? = null
