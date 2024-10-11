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

public val DocumentGroup.FileCheckFill: ImageVector
    get() {
        if (_fileCheckFill != null) {
            return _fileCheckFill!!
        }
        _fileCheckFill = Builder(name = "FileCheckFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                lineTo(16.0f, 2.0f)
                horizontalLineTo(3.999f)
                curveTo(3.447f, 2.0f, 3.0f, 2.444f, 3.0f, 2.992f)
                verticalLineTo(21.008f)
                curveTo(3.0f, 21.545f, 3.445f, 22.0f, 3.993f, 22.0f)
                horizontalLineTo(12.341f)
                curveTo(12.12f, 21.374f, 12.0f, 20.701f, 12.0f, 20.0f)
                curveTo(12.0f, 16.686f, 14.686f, 14.0f, 18.0f, 14.0f)
                curveTo(19.093f, 14.0f, 20.117f, 14.292f, 21.0f, 14.803f)
                lineTo(21.0f, 7.0f)
                close()
                moveTo(14.465f, 19.465f)
                lineTo(18.0f, 23.0f)
                lineTo(22.95f, 18.051f)
                lineTo(21.536f, 16.636f)
                lineTo(18.0f, 20.172f)
                lineTo(15.879f, 18.051f)
                lineTo(14.465f, 19.465f)
                close()
            }
        }
        .build()
        return _fileCheckFill!!
    }

private var _fileCheckFill: ImageVector? = null
