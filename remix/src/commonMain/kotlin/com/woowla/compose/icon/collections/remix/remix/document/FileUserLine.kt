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

public val DocumentGroup.FileUserLine: ImageVector
    get() {
        if (_fileUserLine != null) {
            return _fileUserLine!!
        }
        _fileUserLine = Builder(name = "FileUserLine", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(12.0f, 11.5f)
                curveTo(10.619f, 11.5f, 9.5f, 10.381f, 9.5f, 9.0f)
                curveTo(9.5f, 7.619f, 10.619f, 6.5f, 12.0f, 6.5f)
                curveTo(13.381f, 6.5f, 14.5f, 7.619f, 14.5f, 9.0f)
                curveTo(14.5f, 10.381f, 13.381f, 11.5f, 12.0f, 11.5f)
                close()
                moveTo(7.527f, 17.0f)
                curveTo(7.776f, 14.75f, 9.684f, 13.0f, 12.0f, 13.0f)
                curveTo(14.316f, 13.0f, 16.224f, 14.75f, 16.472f, 17.0f)
                horizontalLineTo(7.527f)
                close()
            }
        }
        .build()
        return _fileUserLine!!
    }

private var _fileUserLine: ImageVector? = null
