package com.woowla.compose.icon.collections.remix.remix.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MediaGroup

public val MediaGroup.ImageAddFill: ImageVector
    get() {
        if (_imageAddFill != null) {
            return _imageAddFill!!
        }
        _imageAddFill = Builder(name = "ImageAddFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(21.008f, 3.0f)
                curveTo(21.556f, 3.0f, 22.0f, 3.445f, 22.0f, 3.993f)
                lineTo(22.001f, 13.342f)
                curveTo(21.375f, 13.12f, 20.701f, 13.0f, 20.0f, 13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                lineTo(4.001f, 19.0f)
                lineTo(13.293f, 9.707f)
                curveTo(13.653f, 9.346f, 14.22f, 9.318f, 14.612f, 9.623f)
                lineTo(14.707f, 9.708f)
                lineTo(18.252f, 13.259f)
                curveTo(15.791f, 14.007f, 14.0f, 16.294f, 14.0f, 19.0f)
                curveTo(14.0f, 19.701f, 14.12f, 20.375f, 14.342f, 21.001f)
                lineTo(2.992f, 21.0f)
                curveTo(2.444f, 21.0f, 2.0f, 20.555f, 2.0f, 20.007f)
                verticalLineTo(3.993f)
                curveTo(2.0f, 3.445f, 2.455f, 3.0f, 2.992f, 3.0f)
                horizontalLineTo(21.008f)
                close()
                moveTo(8.0f, 7.0f)
                curveTo(9.105f, 7.0f, 10.0f, 7.895f, 10.0f, 9.0f)
                curveTo(10.0f, 10.105f, 9.105f, 11.0f, 8.0f, 11.0f)
                curveTo(6.895f, 11.0f, 6.0f, 10.105f, 6.0f, 9.0f)
                curveTo(6.0f, 7.895f, 6.895f, 7.0f, 8.0f, 7.0f)
                close()
            }
        }
        .build()
        return _imageAddFill!!
    }

private var _imageAddFill: ImageVector? = null
