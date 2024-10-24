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

public val MediaGroup.MicAiFill: ImageVector
    get() {
        if (_micAiFill != null) {
            return _micAiFill!!
        }
        _micAiFill = Builder(name = "MicAiFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.734f, 4.387f)
                curveTo(16.063f, 2.417f, 14.197f, 1.0f, 12.0f, 1.0f)
                curveTo(9.238f, 1.0f, 7.0f, 3.239f, 7.0f, 6.0f)
                verticalLineTo(10.0f)
                curveTo(7.0f, 12.761f, 9.238f, 15.0f, 12.0f, 15.0f)
                curveTo(14.761f, 15.0f, 17.0f, 12.761f, 17.0f, 10.0f)
                verticalLineTo(6.0f)
                curveTo(17.0f, 5.948f, 16.999f, 5.897f, 16.997f, 5.846f)
                lineTo(17.068f, 5.877f)
                curveTo(18.056f, 6.316f, 18.847f, 7.119f, 19.287f, 8.128f)
                lineTo(19.533f, 8.694f)
                curveTo(19.714f, 9.108f, 20.286f, 9.108f, 20.467f, 8.694f)
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
                lineTo(16.734f, 4.387f)
                close()
                moveTo(5.071f, 11.0f)
                horizontalLineTo(3.055f)
                curveTo(3.516f, 15.172f, 6.828f, 18.484f, 11.0f, 18.945f)
                verticalLineTo(23.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.945f)
                curveTo(17.171f, 18.484f, 20.484f, 15.172f, 20.945f, 11.0f)
                horizontalLineTo(18.929f)
                curveTo(18.444f, 14.392f, 15.526f, 17.0f, 12.0f, 17.0f)
                curveTo(8.473f, 17.0f, 5.556f, 14.392f, 5.071f, 11.0f)
                close()
            }
        }
        .build()
        return _micAiFill!!
    }

private var _micAiFill: ImageVector? = null
