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

public val DocumentGroup.FileMarkedFill: ImageVector
    get() {
        if (_fileMarkedFill != null) {
            return _fileMarkedFill!!
        }
        _fileMarkedFill = Builder(name = "FileMarkedFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.992f)
                verticalLineTo(21.008f)
                curveTo(21.0f, 21.545f, 20.555f, 22.0f, 20.007f, 22.0f)
                horizontalLineTo(3.993f)
                curveTo(3.445f, 22.0f, 3.0f, 21.556f, 3.0f, 21.008f)
                verticalLineTo(2.992f)
                curveTo(3.0f, 2.455f, 3.445f, 2.0f, 3.993f, 2.0f)
                horizontalLineTo(20.007f)
                curveTo(20.555f, 2.0f, 21.0f, 2.444f, 21.0f, 2.992f)
                close()
                moveTo(7.0f, 4.0f)
                verticalLineTo(13.0f)
                lineTo(10.5f, 11.0f)
                lineTo(14.0f, 13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _fileMarkedFill!!
    }

private var _fileMarkedFill: ImageVector? = null
