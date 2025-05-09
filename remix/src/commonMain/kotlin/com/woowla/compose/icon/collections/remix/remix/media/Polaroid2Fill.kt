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

public val MediaGroup.Polaroid2Fill: ImageVector
    get() {
        if (_polaroid2Fill != null) {
            return _polaroid2Fill!!
        }
        _polaroid2Fill = Builder(name = "Polaroid2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.993f)
                curveTo(3.0f, 3.445f, 3.445f, 3.0f, 3.993f, 3.0f)
                horizontalLineTo(20.007f)
                curveTo(20.555f, 3.0f, 21.0f, 3.445f, 21.0f, 3.993f)
                verticalLineTo(20.007f)
                curveTo(21.0f, 20.555f, 20.555f, 21.0f, 20.007f, 21.0f)
                horizontalLineTo(3.993f)
                curveTo(3.445f, 21.0f, 3.0f, 20.555f, 3.0f, 20.007f)
                verticalLineTo(3.993f)
                close()
                moveTo(6.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(5.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(10.895f, 12.0f, 10.0f, 11.105f, 10.0f, 10.0f)
                curveTo(10.0f, 8.895f, 10.895f, 8.0f, 12.0f, 8.0f)
                curveTo(13.105f, 8.0f, 14.0f, 8.895f, 14.0f, 10.0f)
                curveTo(14.0f, 11.105f, 13.105f, 12.0f, 12.0f, 12.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(14.209f, 14.0f, 16.0f, 12.209f, 16.0f, 10.0f)
                curveTo(16.0f, 7.791f, 14.209f, 6.0f, 12.0f, 6.0f)
                curveTo(9.791f, 6.0f, 8.0f, 7.791f, 8.0f, 10.0f)
                curveTo(8.0f, 12.209f, 9.791f, 14.0f, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return _polaroid2Fill!!
    }

private var _polaroid2Fill: ImageVector? = null
