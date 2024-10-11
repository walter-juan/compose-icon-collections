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

public val DocumentGroup.FileEditFill: ImageVector
    get() {
        if (_fileEditFill != null) {
            return _fileEditFill!!
        }
        _fileEditFill = Builder(name = "FileEditFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 15.243f)
                verticalLineTo(21.008f)
                curveTo(21.0f, 21.556f, 20.555f, 22.0f, 20.007f, 22.0f)
                horizontalLineTo(3.993f)
                curveTo(3.445f, 22.0f, 3.0f, 21.551f, 3.0f, 20.993f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                curveTo(9.552f, 9.0f, 10.0f, 8.552f, 10.0f, 8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(20.002f)
                curveTo(20.553f, 2.0f, 21.0f, 2.455f, 21.0f, 2.992f)
                verticalLineTo(6.757f)
                lineTo(12.001f, 15.756f)
                lineTo(11.995f, 19.995f)
                lineTo(16.241f, 20.001f)
                lineTo(21.0f, 15.243f)
                close()
                moveTo(21.778f, 8.808f)
                lineTo(23.192f, 10.222f)
                lineTo(15.414f, 18.0f)
                lineTo(13.998f, 17.998f)
                lineTo(14.0f, 16.586f)
                lineTo(21.778f, 8.808f)
                close()
                moveTo(3.0f, 7.0f)
                lineTo(8.0f, 2.003f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _fileEditFill!!
    }

private var _fileEditFill: ImageVector? = null
