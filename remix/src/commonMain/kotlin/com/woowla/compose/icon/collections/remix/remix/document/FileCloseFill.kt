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

public val DocumentGroup.FileCloseFill: ImageVector
    get() {
        if (_fileCloseFill != null) {
            return _fileCloseFill!!
        }
        _fileCloseFill = Builder(name = "FileCloseFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.0f)
                curveTo(19.093f, 13.0f, 20.117f, 13.292f, 21.0f, 13.803f)
                lineTo(21.0f, 7.0f)
                lineTo(16.0f, 2.0f)
                horizontalLineTo(3.999f)
                curveTo(3.447f, 2.0f, 3.0f, 2.444f, 3.0f, 2.992f)
                verticalLineTo(21.008f)
                curveTo(3.0f, 21.545f, 3.445f, 22.0f, 3.993f, 22.0f)
                horizontalLineTo(12.803f)
                curveTo(12.292f, 21.118f, 12.0f, 20.093f, 12.0f, 19.0f)
                curveTo(12.0f, 15.686f, 14.686f, 13.0f, 18.0f, 13.0f)
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
        return _fileCloseFill!!
    }

private var _fileCloseFill: ImageVector? = null
