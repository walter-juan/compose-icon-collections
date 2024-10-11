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

public val DocumentGroup.FileExcel2Line: ImageVector
    get() {
        if (_fileExcel2Line != null) {
            return _fileExcel2Line!!
        }
        _fileExcel2Line = Builder(name = "FileExcel2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.859f, 2.877f)
                lineTo(15.429f, 1.082f)
                curveTo(15.703f, 1.042f, 15.956f, 1.232f, 15.995f, 1.506f)
                curveTo(15.998f, 1.529f, 16.0f, 1.553f, 16.0f, 1.576f)
                verticalLineTo(22.424f)
                curveTo(16.0f, 22.7f, 15.776f, 22.924f, 15.5f, 22.924f)
                curveTo(15.476f, 22.924f, 15.453f, 22.922f, 15.429f, 22.918f)
                lineTo(2.859f, 21.123f)
                curveTo(2.366f, 21.052f, 2.0f, 20.63f, 2.0f, 20.133f)
                verticalLineTo(3.867f)
                curveTo(2.0f, 3.37f, 2.366f, 2.948f, 2.859f, 2.877f)
                close()
                moveTo(4.0f, 4.735f)
                verticalLineTo(19.265f)
                lineTo(14.0f, 20.694f)
                verticalLineTo(3.306f)
                lineTo(4.0f, 4.735f)
                close()
                moveTo(17.0f, 19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(10.2f, 12.0f)
                lineTo(13.0f, 16.0f)
                horizontalLineTo(10.6f)
                lineTo(9.0f, 13.714f)
                lineTo(7.4f, 16.0f)
                horizontalLineTo(5.0f)
                lineTo(7.8f, 12.0f)
                lineTo(5.0f, 8.0f)
                horizontalLineTo(7.4f)
                lineTo(9.0f, 10.286f)
                lineTo(10.6f, 8.0f)
                horizontalLineTo(13.0f)
                lineTo(10.2f, 12.0f)
                close()
            }
        }
        .build()
        return _fileExcel2Line!!
    }

private var _fileExcel2Line: ImageVector? = null
