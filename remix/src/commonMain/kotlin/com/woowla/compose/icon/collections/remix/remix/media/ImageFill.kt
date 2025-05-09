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

public val MediaGroup.ImageFill: ImageVector
    get() {
        if (_imageFill != null) {
            return _imageFill!!
        }
        _imageFill = Builder(name = "ImageFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                lineTo(13.292f, 9.706f)
                curveTo(13.683f, 9.316f, 14.316f, 9.316f, 14.707f, 9.706f)
                lineTo(20.0f, 15.01f)
                verticalLineTo(5.0f)
                close()
                moveTo(2.0f, 3.993f)
                curveTo(2.0f, 3.445f, 2.455f, 3.0f, 2.992f, 3.0f)
                horizontalLineTo(21.008f)
                curveTo(21.556f, 3.0f, 22.0f, 3.445f, 22.0f, 3.993f)
                verticalLineTo(20.007f)
                curveTo(22.0f, 20.555f, 21.545f, 21.0f, 21.008f, 21.0f)
                horizontalLineTo(2.992f)
                curveTo(2.444f, 21.0f, 2.0f, 20.555f, 2.0f, 20.007f)
                verticalLineTo(3.993f)
                close()
                moveTo(8.0f, 11.0f)
                curveTo(6.895f, 11.0f, 6.0f, 10.105f, 6.0f, 9.0f)
                curveTo(6.0f, 7.895f, 6.895f, 7.0f, 8.0f, 7.0f)
                curveTo(9.105f, 7.0f, 10.0f, 7.895f, 10.0f, 9.0f)
                curveTo(10.0f, 10.105f, 9.105f, 11.0f, 8.0f, 11.0f)
                close()
            }
        }
        .build()
        return _imageFill!!
    }

private var _imageFill: ImageVector? = null
