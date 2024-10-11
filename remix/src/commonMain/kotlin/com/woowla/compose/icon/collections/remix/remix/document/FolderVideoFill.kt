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

public val DocumentGroup.FolderVideoFill: ImageVector
    get() {
        if (_folderVideoFill != null) {
            return _folderVideoFill!!
        }
        _folderVideoFill = Builder(name = "FolderVideoFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.0f)
                horizontalLineTo(12.414f)
                lineTo(10.414f, 3.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 3.0f, 2.0f, 3.448f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.552f, 2.448f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 21.0f, 22.0f, 20.552f, 22.0f, 20.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 5.448f, 21.552f, 5.0f, 21.0f, 5.0f)
                close()
                moveTo(15.001f, 12.667f)
                curveTo(15.185f, 12.79f, 15.234f, 13.038f, 15.112f, 13.222f)
                curveTo(15.082f, 13.266f, 15.045f, 13.303f, 15.001f, 13.333f)
                lineTo(10.122f, 16.585f)
                curveTo(9.938f, 16.708f, 9.69f, 16.658f, 9.567f, 16.474f)
                curveTo(9.523f, 16.409f, 9.5f, 16.331f, 9.5f, 16.252f)
                verticalLineTo(9.747f)
                curveTo(9.5f, 9.526f, 9.679f, 9.347f, 9.9f, 9.347f)
                curveTo(9.979f, 9.347f, 10.056f, 9.371f, 10.122f, 9.414f)
                lineTo(15.001f, 12.667f)
                close()
            }
        }
        .build()
        return _folderVideoFill!!
    }

private var _folderVideoFill: ImageVector? = null
