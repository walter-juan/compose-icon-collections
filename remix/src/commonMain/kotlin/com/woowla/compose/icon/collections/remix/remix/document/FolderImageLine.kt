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

public val DocumentGroup.FolderImageLine: ImageVector
    get() {
        if (_folderImageLine != null) {
            return _folderImageLine!!
        }
        _folderImageLine = Builder(name = "FolderImageLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.586f)
                lineTo(9.586f, 5.0f)
                horizontalLineTo(4.0f)
                close()
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
                moveTo(10.0f, 10.5f)
                curveTo(10.0f, 11.328f, 9.328f, 12.0f, 8.5f, 12.0f)
                curveTo(7.672f, 12.0f, 7.0f, 11.328f, 7.0f, 10.5f)
                curveTo(7.0f, 9.672f, 7.672f, 9.0f, 8.5f, 9.0f)
                curveTo(9.328f, 9.0f, 10.0f, 9.672f, 10.0f, 10.5f)
                close()
                moveTo(18.0f, 17.0f)
                lineTo(14.0f, 11.0f)
                lineTo(7.0f, 17.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _folderImageLine!!
    }

private var _folderImageLine: ImageVector? = null
