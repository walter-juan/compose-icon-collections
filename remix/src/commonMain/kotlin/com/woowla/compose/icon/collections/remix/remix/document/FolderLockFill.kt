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

public val DocumentGroup.FolderLockFill: ImageVector
    get() {
        if (_folderLockFill != null) {
            return _folderLockFill!!
        }
        _folderLockFill = Builder(name = "FolderLockFill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(15.0f, 13.0f)
                verticalLineTo(12.0f)
                curveTo(15.0f, 10.343f, 13.657f, 9.0f, 12.0f, 9.0f)
                curveTo(10.343f, 9.0f, 9.0f, 10.343f, 9.0f, 12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(13.0f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                curveTo(11.0f, 11.448f, 11.448f, 11.0f, 12.0f, 11.0f)
                curveTo(12.552f, 11.0f, 13.0f, 11.448f, 13.0f, 12.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _folderLockFill!!
    }

private var _folderLockFill: ImageVector? = null
