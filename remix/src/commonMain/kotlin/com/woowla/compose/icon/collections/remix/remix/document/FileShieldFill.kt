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

public val DocumentGroup.FileShieldFill: ImageVector
    get() {
        if (_fileShieldFill != null) {
            return _fileShieldFill!!
        }
        _fileShieldFill = Builder(name = "FileShieldFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                verticalLineTo(20.993f)
                curveTo(21.0f, 21.551f, 20.555f, 22.0f, 20.007f, 22.0f)
                horizontalLineTo(3.993f)
                curveTo(3.445f, 22.0f, 3.0f, 21.556f, 3.0f, 21.008f)
                verticalLineTo(2.992f)
                curveTo(3.0f, 2.455f, 3.447f, 2.0f, 3.998f, 2.0f)
                horizontalLineTo(15.997f)
                lineTo(21.0f, 7.0f)
                close()
                moveTo(8.0f, 8.0f)
                verticalLineTo(13.6f)
                curveTo(8.0f, 14.45f, 8.446f, 15.243f, 9.187f, 15.714f)
                lineTo(12.0f, 17.5f)
                lineTo(14.813f, 15.714f)
                curveTo(15.554f, 15.243f, 16.0f, 14.45f, 16.0f, 13.6f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(10.0f, 10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.6f)
                curveTo(14.0f, 13.758f, 13.91f, 13.918f, 13.74f, 14.026f)
                lineTo(12.0f, 15.131f)
                lineTo(10.26f, 14.026f)
                curveTo(10.09f, 13.918f, 10.0f, 13.758f, 10.0f, 13.6f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _fileShieldFill!!
    }

private var _fileShieldFill: ImageVector? = null
