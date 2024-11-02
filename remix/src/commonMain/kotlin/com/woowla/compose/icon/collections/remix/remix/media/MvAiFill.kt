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

public val MediaGroup.MvAiFill: ImageVector
    get() {
        if (_mvAiFill != null) {
            return _mvAiFill!!
        }
        _mvAiFill = Builder(name = "MvAiFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.467f, 8.694f)
                lineTo(20.713f, 8.128f)
                curveTo(21.153f, 7.119f, 21.944f, 6.316f, 22.932f, 5.877f)
                lineTo(23.692f, 5.539f)
                curveTo(24.103f, 5.357f, 24.103f, 4.759f, 23.692f, 4.576f)
                lineTo(22.975f, 4.257f)
                curveTo(21.962f, 3.807f, 21.156f, 2.974f, 20.724f, 1.931f)
                lineTo(20.471f, 1.32f)
                curveTo(20.294f, 0.893f, 19.706f, 0.893f, 19.529f, 1.32f)
                lineTo(19.276f, 1.931f)
                curveTo(18.844f, 2.974f, 18.038f, 3.807f, 17.025f, 4.257f)
                lineTo(16.308f, 4.576f)
                curveTo(15.897f, 4.759f, 15.897f, 5.357f, 16.308f, 5.539f)
                lineTo(17.068f, 5.877f)
                curveTo(18.056f, 6.316f, 18.847f, 7.119f, 19.287f, 8.128f)
                lineTo(19.533f, 8.694f)
                curveTo(19.714f, 9.108f, 20.286f, 9.108f, 20.467f, 8.694f)
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
                curveTo(14.0f, 5.341f, 14.028f, 5.675f, 14.083f, 6.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.171f)
                curveTo(11.687f, 12.06f, 11.351f, 12.0f, 11.0f, 12.0f)
                curveTo(9.343f, 12.0f, 8.0f, 13.343f, 8.0f, 15.0f)
                curveTo(8.0f, 16.657f, 9.343f, 18.0f, 11.0f, 18.0f)
                curveTo(12.657f, 18.0f, 14.0f, 16.657f, 14.0f, 15.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.803f)
                curveTo(15.84f, 9.793f, 17.779f, 11.0f, 20.0f, 11.0f)
                close()
            }
        }
        .build()
        return _mvAiFill!!
    }

private var _mvAiFill: ImageVector? = null