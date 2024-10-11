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

public val DocumentGroup.FilePdf2Line: ImageVector
    get() {
        if (_filePdf2Line != null) {
            return _filePdf2Line!!
        }
        _filePdf2Line = Builder(name = "FilePdf2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(3.999f, 2.0f)
                curveTo(3.447f, 2.0f, 3.0f, 2.444f, 3.0f, 2.992f)
                verticalLineTo(21.008f)
                curveTo(3.0f, 21.545f, 3.445f, 22.0f, 3.993f, 22.0f)
                horizontalLineTo(20.007f)
                curveTo(20.555f, 22.0f, 21.0f, 21.549f, 21.0f, 20.993f)
                lineTo(21.0f, 7.0f)
                lineTo(16.0f, 2.0f)
                horizontalLineTo(3.999f)
                close()
                moveTo(10.5f, 7.5f)
                curveTo(10.5f, 9.077f, 10.044f, 10.937f, 9.275f, 12.653f)
                curveTo(8.503f, 14.376f, 7.461f, 15.85f, 6.375f, 16.719f)
                lineTo(7.555f, 18.332f)
                curveTo(10.482f, 16.38f, 13.723f, 15.042f, 16.858f, 15.49f)
                lineTo(17.316f, 13.551f)
                curveTo(14.644f, 12.66f, 12.5f, 9.99f, 12.5f, 7.5f)
                horizontalLineTo(10.5f)
                close()
                moveTo(11.1f, 13.472f)
                curveTo(11.367f, 12.875f, 11.604f, 12.256f, 11.804f, 11.628f)
                curveTo(12.275f, 12.353f, 12.855f, 13.018f, 13.51f, 13.595f)
                curveTo(12.528f, 13.771f, 11.566f, 14.06f, 10.635f, 14.428f)
                curveTo(10.8f, 14.114f, 10.955f, 13.795f, 11.1f, 13.472f)
                close()
            }
        }
        .build()
        return _filePdf2Line!!
    }

private var _filePdf2Line: ImageVector? = null
