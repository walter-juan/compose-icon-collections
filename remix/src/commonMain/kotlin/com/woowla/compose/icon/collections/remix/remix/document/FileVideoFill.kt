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

public val DocumentGroup.FileVideoFill: ImageVector
    get() {
        if (_fileVideoFill != null) {
            return _fileVideoFill!!
        }
        _fileVideoFill = Builder(name = "FileVideoFill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(15.001f, 11.667f)
                lineTo(10.122f, 8.414f)
                curveTo(10.056f, 8.371f, 9.979f, 8.347f, 9.9f, 8.347f)
                curveTo(9.679f, 8.347f, 9.5f, 8.526f, 9.5f, 8.747f)
                verticalLineTo(15.252f)
                curveTo(9.5f, 15.331f, 9.523f, 15.409f, 9.567f, 15.474f)
                curveTo(9.69f, 15.658f, 9.938f, 15.708f, 10.122f, 15.585f)
                lineTo(15.001f, 12.333f)
                curveTo(15.045f, 12.303f, 15.082f, 12.266f, 15.112f, 12.222f)
                curveTo(15.234f, 12.038f, 15.185f, 11.79f, 15.001f, 11.667f)
                close()
            }
        }
        .build()
        return _fileVideoFill!!
    }

private var _fileVideoFill: ImageVector? = null
