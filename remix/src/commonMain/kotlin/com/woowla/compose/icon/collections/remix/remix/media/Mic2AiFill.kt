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
                moveTo(20.467f, 7.694f)
                lineTo(20.713f, 7.128f)
                curveTo(21.153f, 6.119f, 21.944f, 5.316f, 22.932f, 4.877f)
                lineTo(23.692f, 4.539f)
                curveTo(24.103f, 4.357f, 24.103f, 3.759f, 23.692f, 3.576f)
                lineTo(22.975f, 3.257f)
                curveTo(21.962f, 2.807f, 21.156f, 1.974f, 20.724f, 0.931f)
                lineTo(20.471f, 0.32f)
                curveTo(20.294f, -0.107f, 19.706f, -0.107f, 19.529f, 0.32f)
                lineTo(19.276f, 0.931f)
                curveTo(18.844f, 1.974f, 18.038f, 2.807f, 17.025f, 3.257f)
                lineTo(16.308f, 3.576f)
                curveTo(15.897f, 3.759f, 15.897f, 4.357f, 16.308f, 4.539f)
                lineTo(17.068f, 4.877f)
                curveTo(18.056f, 5.316f, 18.847f, 6.119f, 19.287f, 7.128f)
                lineTo(19.533f, 7.694f)
                curveTo(19.714f, 8.108f, 20.286f, 8.108f, 20.467f, 7.694f)
                close()
                moveTo(14.387f, 5.339f)
                curveTo(14.661f, 5.773f, 15.036f, 6.093f, 15.511f, 6.3f)
                lineTo(16.076f, 6.547f)
                curveTo(16.457f, 6.713f, 16.765f, 6.945f, 17.0f, 7.245f)
                verticalLineTo(12.0f)
                curveTo(17.0f, 14.761f, 14.762f, 17.0f, 12.0f, 17.0f)
                curveTo(9.239f, 17.0f, 7.0f, 14.761f, 7.0f, 12.0f)
                verticalLineTo(6.0f)
                curveTo(7.0f, 3.239f, 9.239f, 1.0f, 12.0f, 1.0f)
                curveTo(13.124f, 1.0f, 14.161f, 1.371f, 14.997f, 1.997f)
                curveTo(14.756f, 2.177f, 14.553f, 2.398f, 14.387f, 2.661f)
                curveTo(14.129f, 3.069f, 14.0f, 3.516f, 14.0f, 4.0f)
                curveTo(14.0f, 4.484f, 14.129f, 4.931f, 14.387f, 5.339f)
                close()
                moveTo(2.192f, 13.962f)
                lineTo(4.154f, 13.569f)
                curveTo(4.883f, 17.236f, 8.119f, 20.0f, 12.0f, 20.0f)
                curveTo(15.881f, 20.0f, 19.117f, 17.236f, 19.846f, 13.569f)
                lineTo(21.808f, 13.962f)
                curveTo(20.896f, 18.545f, 16.852f, 22.0f, 12.0f, 22.0f)
                curveTo(7.149f, 22.0f, 3.104f, 18.545f, 2.192f, 13.962f)
                close()
            }
        }
        .build()
        return _mic2AiFill!!
    }

private var _mic2AiFill: ImageVector? = null
