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

public val DocumentGroup.FileExcelFill: ImageVector
    get() {
        if (_fileExcelFill != null) {
            return _fileExcelFill!!
        }
        _fileExcelFill = Builder(name = "FileExcelFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                lineTo(21.0f, 7.0f)
                verticalLineTo(21.008f)
                curveTo(21.0f, 21.556f, 20.555f, 22.0f, 20.007f, 22.0f)
                horizontalLineTo(3.993f)
                curveTo(3.445f, 22.0f, 3.0f, 21.545f, 3.0f, 21.008f)
                verticalLineTo(2.992f)
                curveTo(3.0f, 2.444f, 3.445f, 2.0f, 3.993f, 2.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(13.2f, 12.0f)
                lineTo(16.0f, 8.0f)
                horizontalLineTo(13.6f)
                lineTo(12.0f, 10.286f)
                lineTo(10.4f, 8.0f)
                horizontalLineTo(8.0f)
                lineTo(10.8f, 12.0f)
                lineTo(8.0f, 16.0f)
                horizontalLineTo(10.4f)
                lineTo(12.0f, 13.714f)
                lineTo(13.6f, 16.0f)
                horizontalLineTo(16.0f)
                lineTo(13.2f, 12.0f)
                close()
            }
        }
        .build()
        return _fileExcelFill!!
    }

private var _fileExcelFill: ImageVector? = null
