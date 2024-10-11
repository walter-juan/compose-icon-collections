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

public val DocumentGroup.FolderOpenFill: ImageVector
    get() {
        if (_folderOpenFill != null) {
            return _folderOpenFill!!
        }
        _folderOpenFill = Builder(name = "FolderOpenFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 21.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(10.414f)
                lineTo(12.414f, 5.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 5.0f, 21.0f, 5.448f, 21.0f, 6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.996f)
                lineTo(6.0f, 11.0f)
                horizontalLineTo(22.5f)
                lineTo(20.189f, 20.243f)
                curveTo(20.078f, 20.688f, 19.678f, 21.0f, 19.219f, 21.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _folderOpenFill!!
    }

private var _folderOpenFill: ImageVector? = null