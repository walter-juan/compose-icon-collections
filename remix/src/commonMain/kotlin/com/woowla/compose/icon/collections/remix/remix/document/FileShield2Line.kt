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

public val DocumentGroup.FileShield2Line: ImageVector
    get() {
        if (_fileShield2Line != null) {
            return _fileShield2Line!!
        }
        _fileShield2Line = Builder(name = "FileShield2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.056f)
                curveTo(11.384f, 20.417f, 11.78f, 20.785f, 12.236f, 21.085f)
                lineTo(13.626f, 22.0f)
                horizontalLineTo(3.993f)
                curveTo(3.445f, 22.0f, 3.0f, 21.556f, 3.0f, 21.008f)
                verticalLineTo(2.992f)
                curveTo(3.0f, 2.455f, 3.449f, 2.0f, 4.002f, 2.0f)
                horizontalLineTo(14.997f)
                lineTo(21.0f, 8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(12.0f, 11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(16.949f)
                curveTo(21.0f, 17.94f, 20.499f, 18.865f, 19.664f, 19.414f)
                lineTo(16.5f, 21.498f)
                lineTo(13.336f, 19.414f)
                curveTo(12.501f, 18.865f, 12.0f, 17.94f, 12.0f, 16.949f)
                verticalLineTo(11.0f)
                close()
                moveTo(14.0f, 16.949f)
                curveTo(14.0f, 17.265f, 14.162f, 17.563f, 14.436f, 17.744f)
                lineTo(16.5f, 19.103f)
                lineTo(18.564f, 17.744f)
                curveTo(18.838f, 17.563f, 19.0f, 17.265f, 19.0f, 16.949f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(16.949f)
                close()
            }
        }
        .build()
        return _fileShield2Line!!
    }

private var _fileShield2Line: ImageVector? = null
