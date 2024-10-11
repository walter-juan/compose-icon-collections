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

public val DocumentGroup.FolderShield2Line: ImageVector
    get() {
        if (_folderShield2Line != null) {
            return _folderShield2Line!!
        }
        _folderShield2Line = Builder(name = "FolderShield2Line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.586f)
                lineTo(9.586f, 5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.447f)
                curveTo(11.809f, 19.792f, 12.379f, 20.485f, 13.111f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(10.414f)
                lineTo(12.414f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 5.0f, 22.0f, 5.448f, 22.0f, 6.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(16.949f)
                curveTo(22.0f, 17.94f, 21.499f, 18.865f, 20.664f, 19.414f)
                lineTo(17.5f, 21.498f)
                lineTo(14.336f, 19.414f)
                curveTo(13.501f, 18.865f, 13.0f, 17.94f, 13.0f, 16.949f)
                verticalLineTo(11.0f)
                close()
                moveTo(15.0f, 16.949f)
                curveTo(15.0f, 17.265f, 15.162f, 17.563f, 15.436f, 17.744f)
                lineTo(17.5f, 19.103f)
                lineTo(19.564f, 17.744f)
                curveTo(19.838f, 17.563f, 20.0f, 17.265f, 20.0f, 16.949f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.949f)
                close()
            }
        }
        .build()
        return _folderShield2Line!!
    }

private var _folderShield2Line: ImageVector? = null
