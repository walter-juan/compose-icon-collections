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

public val DocumentGroup.FileCodeLine: ImageVector
    get() {
        if (_fileCodeLine != null) {
            return _fileCodeLine!!
        }
        _fileCodeLine = Builder(name = "FileCodeLine", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(17.657f, 12.0f)
                lineTo(14.121f, 15.535f)
                lineTo(12.707f, 14.121f)
                lineTo(14.828f, 12.0f)
                lineTo(12.707f, 9.879f)
                lineTo(14.121f, 8.464f)
                lineTo(17.657f, 12.0f)
                close()
                moveTo(6.343f, 12.0f)
                lineTo(9.879f, 8.464f)
                lineTo(11.293f, 9.879f)
                lineTo(9.172f, 12.0f)
                lineTo(11.293f, 14.121f)
                lineTo(9.879f, 15.535f)
                lineTo(6.343f, 12.0f)
                close()
            }
        }
        .build()
        return _fileCodeLine!!
    }

private var _fileCodeLine: ImageVector? = null
