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

public val DocumentGroup.FileShieldLine: ImageVector
    get() {
        if (_fileShieldLine != null) {
            return _fileShieldLine!!
        }
        _fileShieldLine = Builder(name = "FileShieldLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 8.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.62f)
                curveTo(16.0f, 14.464f, 15.554f, 15.253f, 14.813f, 15.722f)
                lineTo(12.0f, 17.498f)
                lineTo(9.187f, 15.722f)
                curveTo(8.446f, 15.253f, 8.0f, 14.464f, 8.0f, 13.62f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(21.0f, 8.0f)
                verticalLineTo(20.993f)
                curveTo(21.0f, 21.55f, 20.555f, 22.0f, 20.007f, 22.0f)
                horizontalLineTo(3.993f)
                curveTo(3.445f, 22.0f, 3.0f, 21.556f, 3.0f, 21.008f)
                verticalLineTo(2.992f)
                curveTo(3.0f, 2.455f, 3.449f, 2.0f, 4.002f, 2.0f)
                horizontalLineTo(14.997f)
                lineTo(21.0f, 8.0f)
                close()
                moveTo(10.0f, 13.62f)
                curveTo(10.0f, 13.77f, 10.087f, 13.924f, 10.255f, 14.031f)
                lineTo(12.0f, 15.132f)
                lineTo(13.745f, 14.031f)
                curveTo(13.913f, 13.924f, 14.0f, 13.77f, 14.0f, 13.62f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.62f)
                close()
            }
        }
        .build()
        return _fileShieldLine!!
    }

private var _fileShieldLine: ImageVector? = null
