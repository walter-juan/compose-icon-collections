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

public val MediaGroup.ImageLine: ImageVector
    get() {
        if (_imageLine != null) {
            return _imageLine!!
        }
        _imageLine = Builder(name = "ImageLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.992f, 21.0f)
                curveTo(2.444f, 21.0f, 2.0f, 20.555f, 2.0f, 20.007f)
                verticalLineTo(3.993f)
                curveTo(2.0f, 3.445f, 2.455f, 3.0f, 2.992f, 3.0f)
                horizontalLineTo(21.008f)
                curveTo(21.556f, 3.0f, 22.0f, 3.445f, 22.0f, 3.993f)
                verticalLineTo(20.007f)
                curveTo(22.0f, 20.555f, 21.545f, 21.0f, 21.008f, 21.0f)
                horizontalLineTo(2.992f)
                close()
                moveTo(20.0f, 15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                lineTo(14.0f, 9.0f)
                lineTo(20.0f, 15.0f)
                close()
                moveTo(20.0f, 17.828f)
                lineTo(14.0f, 11.828f)
                lineTo(6.828f, 19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.828f)
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
        return _imageLine!!
    }

private var _imageLine: ImageVector? = null
