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

public val DocumentGroup.FileImageLine: ImageVector
    get() {
        if (_fileImageLine != null) {
            return _fileImageLine!!
        }
        _fileImageLine = Builder(name = "FileImageLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 8.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(3.0f, 2.992f)
                curveTo(3.0f, 2.444f, 3.447f, 2.0f, 3.999f, 2.0f)
                horizontalLineTo(16.0f)
                lineTo(21.0f, 7.0f)
                lineTo(21.0f, 20.993f)
                curveTo(21.0f, 21.549f, 20.555f, 22.0f, 20.007f, 22.0f)
                horizontalLineTo(3.993f)
                curveTo(3.445f, 22.0f, 3.0f, 21.545f, 3.0f, 21.008f)
                verticalLineTo(2.992f)
                close()
                moveTo(11.0f, 9.5f)
                curveTo(11.0f, 10.328f, 10.328f, 11.0f, 9.5f, 11.0f)
                curveTo(8.672f, 11.0f, 8.0f, 10.328f, 8.0f, 9.5f)
                curveTo(8.0f, 8.672f, 8.672f, 8.0f, 9.5f, 8.0f)
                curveTo(10.328f, 8.0f, 11.0f, 8.672f, 11.0f, 9.5f)
                close()
                moveTo(17.5f, 17.0f)
                lineTo(13.5f, 10.0f)
                lineTo(8.0f, 17.0f)
                horizontalLineTo(17.5f)
                close()
            }
        }
        .build()
        return _fileImageLine!!
    }

private var _fileImageLine: ImageVector? = null