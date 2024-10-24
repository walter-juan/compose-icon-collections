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

public val MediaGroup.Mic2AiFill: ImageVector
    get() {
        if (_mic2AiFill != null) {
            return _mic2AiFill!!
        }
        _mic2AiFill = Builder(name = "Mic2AiFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.734f, 4.387f)
                curveTo(16.063f, 2.417f, 14.197f, 1.0f, 12.0f, 1.0f)
                curveTo(9.239f, 1.0f, 7.0f, 3.239f, 7.0f, 6.0f)
                verticalLineTo(12.0f)
                curveTo(7.0f, 14.761f, 9.239f, 17.0f, 12.0f, 17.0f)
                curveTo(14.762f, 17.0f, 17.0f, 14.761f, 17.0f, 12.0f)
                verticalLineTo(6.0f)
                curveTo(17.0f, 5.948f, 16.999f, 5.897f, 16.998f, 5.846f)
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
                moveTo(4.154f, 13.569f)
                lineTo(2.192f, 13.962f)
                curveTo(3.104f, 18.545f, 7.149f, 22.0f, 12.0f, 22.0f)
                curveTo(16.852f, 22.0f, 20.896f, 18.545f, 21.808f, 13.962f)
                lineTo(19.846f, 13.569f)
                curveTo(19.117f, 17.236f, 15.881f, 20.0f, 12.0f, 20.0f)
                curveTo(8.119f, 20.0f, 4.883f, 17.236f, 4.154f, 13.569f)
                close()
            }
        }
        .build()
        return _mic2AiFill!!
    }

private var _mic2AiFill: ImageVector? = null
