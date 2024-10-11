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

public val DocumentGroup.FileHwpFill: ImageVector
    get() {
        if (_fileHwpFill != null) {
            return _fileHwpFill!!
        }
        _fileHwpFill = Builder(name = "FileHwpFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                lineTo(21.0f, 7.0f)
                lineTo(21.0f, 20.993f)
                curveTo(21.0f, 21.549f, 20.555f, 22.0f, 20.007f, 22.0f)
                horizontalLineTo(3.993f)
                curveTo(3.445f, 22.0f, 3.0f, 21.545f, 3.0f, 21.008f)
                verticalLineTo(2.992f)
                curveTo(3.0f, 2.444f, 3.447f, 2.0f, 3.999f, 2.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(9.333f, 14.667f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.667f)
                lineTo(9.333f, 16.666f)
                lineTo(9.333f, 14.667f)
                close()
                moveTo(12.0f, 14.333f)
                curveTo(11.448f, 14.333f, 11.0f, 14.781f, 11.0f, 15.333f)
                curveTo(11.0f, 15.886f, 11.448f, 16.333f, 12.0f, 16.333f)
                curveTo(12.552f, 16.333f, 13.0f, 15.886f, 13.0f, 15.333f)
                curveTo(13.0f, 14.781f, 12.552f, 14.333f, 12.0f, 14.333f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(10.619f, 9.0f, 9.5f, 10.119f, 9.5f, 11.5f)
                curveTo(9.5f, 12.881f, 10.619f, 14.0f, 12.0f, 14.0f)
                curveTo(13.381f, 14.0f, 14.5f, 12.881f, 14.5f, 11.5f)
                curveTo(14.5f, 10.119f, 13.381f, 9.0f, 12.0f, 9.0f)
                close()
                moveTo(12.0f, 10.333f)
                curveTo(12.644f, 10.333f, 13.167f, 10.856f, 13.167f, 11.5f)
                curveTo(13.167f, 12.144f, 12.644f, 12.667f, 12.0f, 12.667f)
                curveTo(11.356f, 12.667f, 10.833f, 12.144f, 10.833f, 11.5f)
                curveTo(10.833f, 10.856f, 11.356f, 10.333f, 12.0f, 10.333f)
                close()
                moveTo(12.667f, 6.0f)
                horizontalLineTo(11.333f)
                lineTo(11.333f, 7.333f)
                lineTo(8.0f, 7.333f)
                verticalLineTo(8.667f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.333f)
                lineTo(12.666f, 7.333f)
                lineTo(12.667f, 6.0f)
                close()
            }
        }
        .build()
        return _fileHwpFill!!
    }

private var _fileHwpFill: ImageVector? = null
