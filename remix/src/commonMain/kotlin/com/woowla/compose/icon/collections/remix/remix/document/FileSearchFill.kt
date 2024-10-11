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

public val DocumentGroup.FileSearchFill: ImageVector
    get() {
        if (_fileSearchFill != null) {
            return _fileSearchFill!!
        }
        _fileSearchFill = Builder(name = "FileSearchFill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(13.529f, 14.446f)
                lineTo(15.74f, 16.657f)
                lineTo(17.154f, 15.243f)
                lineTo(14.943f, 13.032f)
                curveTo(15.849f, 11.498f, 15.643f, 9.49f, 14.325f, 8.172f)
                curveTo(12.763f, 6.609f, 10.231f, 6.609f, 8.668f, 8.172f)
                curveTo(7.106f, 9.734f, 7.106f, 12.266f, 8.668f, 13.828f)
                curveTo(9.986f, 15.146f, 11.995f, 15.352f, 13.529f, 14.446f)
                close()
                moveTo(12.911f, 12.414f)
                curveTo(12.13f, 13.195f, 10.864f, 13.195f, 10.083f, 12.414f)
                curveTo(9.302f, 11.633f, 9.302f, 10.367f, 10.083f, 9.586f)
                curveTo(10.864f, 8.805f, 12.13f, 8.805f, 12.911f, 9.586f)
                curveTo(13.692f, 10.367f, 13.692f, 11.633f, 12.911f, 12.414f)
                close()
            }
        }
        .build()
        return _fileSearchFill!!
    }

private var _fileSearchFill: ImageVector? = null
