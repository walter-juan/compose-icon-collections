package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.AttachmentFill: ImageVector
    get() {
        if (_attachmentFill != null) {
            return _attachmentFill!!
        }
        _attachmentFill = Builder(name = "AttachmentFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.997f, 2.992f)
                lineTo(21.0f, 21.008f)
                curveTo(21.0f, 21.545f, 20.555f, 22.0f, 20.007f, 22.0f)
                horizontalLineTo(3.993f)
                curveTo(3.445f, 22.0f, 3.0f, 21.556f, 3.0f, 21.008f)
                verticalLineTo(2.992f)
                curveTo(3.0f, 2.455f, 3.445f, 2.0f, 3.993f, 2.0f)
                horizontalLineTo(20.004f)
                curveTo(20.552f, 2.0f, 20.997f, 2.444f, 20.997f, 2.992f)
                close()
                moveTo(9.0f, 13.0f)
                verticalLineTo(9.0f)
                curveTo(9.0f, 8.448f, 9.448f, 8.0f, 10.0f, 8.0f)
                curveTo(10.552f, 8.0f, 11.0f, 8.448f, 11.0f, 9.0f)
                verticalLineTo(13.0f)
                curveTo(11.0f, 13.552f, 11.448f, 14.0f, 12.0f, 14.0f)
                curveTo(12.552f, 14.0f, 13.0f, 13.552f, 13.0f, 13.0f)
                verticalLineTo(9.0f)
                curveTo(13.0f, 7.343f, 11.657f, 6.0f, 10.0f, 6.0f)
                curveTo(8.343f, 6.0f, 7.0f, 7.343f, 7.0f, 9.0f)
                verticalLineTo(13.0f)
                curveTo(7.0f, 15.761f, 9.239f, 18.0f, 12.0f, 18.0f)
                curveTo(14.761f, 18.0f, 17.0f, 15.761f, 17.0f, 13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                curveTo(15.0f, 14.657f, 13.657f, 16.0f, 12.0f, 16.0f)
                curveTo(10.343f, 16.0f, 9.0f, 14.657f, 9.0f, 13.0f)
                close()
            }
        }
        .build()
        return _attachmentFill!!
    }

private var _attachmentFill: ImageVector? = null
