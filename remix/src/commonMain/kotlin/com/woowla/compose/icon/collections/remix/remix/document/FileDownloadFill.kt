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

public val DocumentGroup.FileDownloadFill: ImageVector
    get() {
        if (_fileDownloadFill != null) {
            return _fileDownloadFill!!
        }
        _fileDownloadFill = Builder(name = "FileDownloadFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(13.0f, 12.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(8.0f)
                lineTo(12.0f, 16.0f)
                lineTo(16.0f, 12.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _fileDownloadFill!!
    }

private var _fileDownloadFill: ImageVector? = null
