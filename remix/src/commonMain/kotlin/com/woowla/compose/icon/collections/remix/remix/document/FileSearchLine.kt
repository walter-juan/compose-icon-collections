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

public val DocumentGroup.FileSearchLine: ImageVector
    get() {
        if (_fileSearchLine != null) {
            return _fileSearchLine!!
        }
        _fileSearchLine = Builder(name = "FileSearchLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
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
                moveTo(13.529f, 14.446f)
                curveTo(11.995f, 15.352f, 9.986f, 15.146f, 8.668f, 13.828f)
                curveTo(7.106f, 12.266f, 7.106f, 9.734f, 8.668f, 8.172f)
                curveTo(10.231f, 6.609f, 12.763f, 6.609f, 14.325f, 8.172f)
                curveTo(15.643f, 9.49f, 15.849f, 11.498f, 14.943f, 13.032f)
                lineTo(17.154f, 15.243f)
                lineTo(15.74f, 16.657f)
                lineTo(13.529f, 14.446f)
                close()
                moveTo(12.911f, 12.414f)
                curveTo(13.692f, 11.633f, 13.692f, 10.367f, 12.911f, 9.586f)
                curveTo(12.13f, 8.805f, 10.864f, 8.805f, 10.083f, 9.586f)
                curveTo(9.302f, 10.367f, 9.302f, 11.633f, 10.083f, 12.414f)
                curveTo(10.864f, 13.195f, 12.13f, 13.195f, 12.911f, 12.414f)
                close()
            }
        }
        .build()
        return _fileSearchLine!!
    }

private var _fileSearchLine: ImageVector? = null
