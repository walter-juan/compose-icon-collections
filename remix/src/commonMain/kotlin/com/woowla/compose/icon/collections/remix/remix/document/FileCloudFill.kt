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

public val DocumentGroup.FileCloudFill: ImageVector
    get() {
        if (_fileCloudFill != null) {
            return _fileCloudFill!!
        }
        _fileCloudFill = Builder(name = "FileCloudFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.997f, 2.0f)
                lineTo(21.0f, 8.0f)
                lineTo(21.001f, 12.261f)
                curveTo(20.05f, 11.472f, 18.83f, 11.0f, 17.5f, 11.0f)
                lineTo(17.279f, 11.004f)
                curveTo(14.784f, 11.103f, 12.716f, 12.863f, 12.152f, 15.209f)
                lineTo(12.136f, 15.283f)
                lineTo(12.107f, 15.302f)
                curveTo(10.822f, 16.163f, 10.0f, 17.625f, 10.0f, 19.25f)
                curveTo(10.0f, 20.273f, 10.324f, 21.223f, 10.877f, 22.001f)
                lineTo(3.993f, 22.0f)
                curveTo(3.484f, 22.0f, 3.064f, 21.617f, 3.007f, 21.124f)
                lineTo(3.0f, 21.008f)
                verticalLineTo(2.992f)
                curveTo(3.0f, 2.494f, 3.387f, 2.065f, 3.885f, 2.007f)
                lineTo(4.002f, 2.0f)
                horizontalLineTo(14.997f)
                close()
                moveTo(17.5f, 13.0f)
                curveTo(19.433f, 13.0f, 21.0f, 14.567f, 21.0f, 16.5f)
                lineTo(20.999f, 16.603f)
                curveTo(22.153f, 16.928f, 23.0f, 17.99f, 23.0f, 19.25f)
                curveTo(23.0f, 20.712f, 21.858f, 21.908f, 20.417f, 21.995f)
                lineTo(20.25f, 22.0f)
                horizontalLineTo(14.75f)
                lineTo(14.583f, 21.995f)
                curveTo(13.142f, 21.908f, 12.0f, 20.712f, 12.0f, 19.25f)
                curveTo(12.0f, 17.99f, 12.847f, 16.928f, 14.003f, 16.603f)
                lineTo(14.0f, 16.5f)
                curveTo(14.0f, 14.567f, 15.567f, 13.0f, 17.5f, 13.0f)
                close()
            }
        }
        .build()
        return _fileCloudFill!!
    }

private var _fileCloudFill: ImageVector? = null
