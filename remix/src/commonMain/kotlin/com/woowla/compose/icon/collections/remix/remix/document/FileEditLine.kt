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

public val DocumentGroup.FileEditLine: ImageVector
    get() {
        if (_fileEditLine != null) {
            return _fileEditLine!!
        }
        _fileEditLine = Builder(name = "FileEditLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.757f)
                lineTo(19.0f, 8.757f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.243f)
                lineTo(21.0f, 15.243f)
                verticalLineTo(21.008f)
                curveTo(21.0f, 21.556f, 20.555f, 22.0f, 20.007f, 22.0f)
                horizontalLineTo(3.993f)
                curveTo(3.445f, 22.0f, 3.0f, 21.55f, 3.0f, 20.993f)
                verticalLineTo(8.0f)
                lineTo(9.003f, 2.0f)
                horizontalLineTo(19.998f)
                curveTo(20.551f, 2.0f, 21.0f, 2.455f, 21.0f, 2.992f)
                verticalLineTo(6.757f)
                close()
                moveTo(21.778f, 8.808f)
                lineTo(23.192f, 10.222f)
                lineTo(15.414f, 18.0f)
                lineTo(13.998f, 17.998f)
                lineTo(14.0f, 16.586f)
                lineTo(21.778f, 8.808f)
                close()
            }
        }
        .build()
        return _fileEditLine!!
    }

private var _fileEditLine: ImageVector? = null
