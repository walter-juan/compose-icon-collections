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

public val DocumentGroup.FolderCloseFill: ImageVector
    get() {
        if (_folderCloseFill != null) {
            return _folderCloseFill!!
        }
        _folderCloseFill = Builder(name = "FolderCloseFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 12.0f)
                curveTo(20.093f, 12.0f, 21.118f, 12.292f, 22.0f, 12.803f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 5.448f, 21.552f, 5.0f, 21.0f, 5.0f)
                horizontalLineTo(12.414f)
                lineTo(10.414f, 3.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 3.0f, 2.0f, 3.448f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.552f, 2.448f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(13.803f)
                curveTo(13.292f, 20.118f, 13.0f, 19.093f, 13.0f, 18.0f)
                curveTo(13.0f, 14.686f, 15.686f, 12.0f, 19.0f, 12.0f)
                close()
                moveTo(20.414f, 18.0f)
                lineTo(22.536f, 20.121f)
                lineTo(21.121f, 21.535f)
                lineTo(19.0f, 19.414f)
                lineTo(16.879f, 21.535f)
                lineTo(15.465f, 20.121f)
                lineTo(17.586f, 18.0f)
                lineTo(15.465f, 15.879f)
                lineTo(16.879f, 14.464f)
                lineTo(19.0f, 16.586f)
                lineTo(21.121f, 14.464f)
                lineTo(22.536f, 15.879f)
                lineTo(20.414f, 18.0f)
                close()
            }
        }
        .build()
        return _folderCloseFill!!
    }

private var _folderCloseFill: ImageVector? = null
