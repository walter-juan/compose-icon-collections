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

public val DocumentGroup.FolderUserLine: ImageVector
    get() {
        if (_folderUserLine != null) {
            return _folderUserLine!!
        }
        _folderUserLine = Builder(name = "FolderUserLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.414f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 5.0f, 22.0f, 5.448f, 22.0f, 6.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(10.414f)
                lineTo(12.414f, 5.0f)
                close()
                moveTo(4.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.586f)
                lineTo(9.586f, 5.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(8.0f, 18.0f)
                curveTo(8.0f, 15.791f, 9.791f, 14.0f, 12.0f, 14.0f)
                curveTo(14.209f, 14.0f, 16.0f, 15.791f, 16.0f, 18.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(10.619f, 13.0f, 9.5f, 11.881f, 9.5f, 10.5f)
                curveTo(9.5f, 9.119f, 10.619f, 8.0f, 12.0f, 8.0f)
                curveTo(13.381f, 8.0f, 14.5f, 9.119f, 14.5f, 10.5f)
                curveTo(14.5f, 11.881f, 13.381f, 13.0f, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _folderUserLine!!
    }

private var _folderUserLine: ImageVector? = null
