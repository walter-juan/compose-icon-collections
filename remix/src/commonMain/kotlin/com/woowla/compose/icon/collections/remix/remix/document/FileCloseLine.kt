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

public val DocumentGroup.FileCloseLine: ImageVector
    get() {
        if (_fileCloseLine != null) {
            return _fileCloseLine!!
        }
        _fileCloseLine = Builder(name = "FileCloseLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                lineTo(16.0f, 2.0f)
                horizontalLineTo(3.999f)
                curveTo(3.447f, 2.0f, 3.0f, 2.444f, 3.0f, 2.992f)
                verticalLineTo(21.008f)
                curveTo(3.0f, 21.545f, 3.445f, 22.0f, 3.993f, 22.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(21.536f, 21.121f)
                lineTo(19.414f, 19.0f)
                lineTo(21.536f, 16.879f)
                lineTo(20.121f, 15.464f)
                lineTo(18.0f, 17.586f)
                lineTo(15.879f, 15.464f)
                lineTo(14.465f, 16.879f)
                lineTo(16.586f, 19.0f)
                lineTo(14.465f, 21.121f)
                lineTo(15.879f, 22.535f)
                lineTo(18.0f, 20.414f)
                lineTo(20.121f, 22.535f)
                lineTo(21.536f, 21.121f)
                close()
            }
        }
        .build()
        return _fileCloseLine!!
    }

private var _fileCloseLine: ImageVector? = null
