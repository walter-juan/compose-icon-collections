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

public val MediaGroup.MovieFill: ImageVector
    get() {
        if (_movieFill != null) {
            return _movieFill!!
        }
        _movieFill = Builder(name = "MovieFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(10.622f, 8.415f)
                curveTo(10.556f, 8.371f, 10.479f, 8.347f, 10.4f, 8.347f)
                curveTo(10.179f, 8.347f, 10.0f, 8.526f, 10.0f, 8.747f)
                verticalLineTo(15.253f)
                curveTo(10.0f, 15.332f, 10.023f, 15.409f, 10.067f, 15.474f)
                curveTo(10.19f, 15.658f, 10.438f, 15.708f, 10.622f, 15.585f)
                lineTo(15.501f, 12.333f)
                curveTo(15.545f, 12.304f, 15.582f, 12.266f, 15.612f, 12.222f)
                curveTo(15.734f, 12.038f, 15.685f, 11.79f, 15.501f, 11.667f)
                lineTo(10.622f, 8.415f)
                close()
            }
        }
        .build()
        return _movieFill!!
    }

private var _movieFill: ImageVector? = null
