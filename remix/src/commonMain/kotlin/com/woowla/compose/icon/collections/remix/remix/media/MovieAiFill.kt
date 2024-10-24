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

public val MediaGroup.MovieAiFill: ImageVector
    get() {
        if (_movieAiFill != null) {
            return _movieAiFill!!
        }
        _movieAiFill = Builder(name = "MovieAiFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.713f, 8.128f)
                lineTo(20.467f, 8.694f)
                curveTo(20.286f, 9.108f, 19.714f, 9.108f, 19.533f, 8.694f)
                lineTo(19.287f, 8.128f)
                curveTo(18.847f, 7.119f, 18.056f, 6.316f, 17.068f, 5.877f)
                lineTo(16.308f, 5.539f)
                curveTo(15.897f, 5.357f, 15.897f, 4.759f, 16.308f, 4.576f)
                lineTo(17.025f, 4.257f)
                curveTo(18.038f, 3.807f, 18.844f, 2.974f, 19.276f, 1.931f)
                lineTo(19.529f, 1.32f)
                curveTo(19.706f, 0.893f, 20.294f, 0.893f, 20.471f, 1.32f)
                lineTo(20.724f, 1.931f)
                curveTo(21.156f, 2.974f, 21.962f, 3.807f, 22.975f, 4.257f)
                lineTo(23.692f, 4.576f)
                curveTo(24.103f, 4.759f, 24.103f, 5.357f, 23.692f, 5.539f)
                lineTo(22.932f, 5.877f)
                curveTo(21.944f, 6.316f, 21.153f, 7.119f, 20.713f, 8.128f)
                close()
                moveTo(20.0f, 11.0f)
                curveTo(20.701f, 11.0f, 21.374f, 10.88f, 22.0f, 10.659f)
                verticalLineTo(20.007f)
                curveTo(22.0f, 20.555f, 21.545f, 21.0f, 21.008f, 21.0f)
                horizontalLineTo(2.992f)
                curveTo(2.444f, 21.0f, 2.0f, 20.555f, 2.0f, 20.007f)
                verticalLineTo(3.993f)
                curveTo(2.0f, 3.445f, 2.455f, 3.0f, 2.992f, 3.0f)
                horizontalLineTo(14.341f)
                curveTo(14.12f, 3.626f, 14.0f, 4.299f, 14.0f, 5.0f)
                curveTo(14.0f, 8.314f, 16.686f, 11.0f, 20.0f, 11.0f)
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
        return _movieAiFill!!
    }

private var _movieAiFill: ImageVector? = null
