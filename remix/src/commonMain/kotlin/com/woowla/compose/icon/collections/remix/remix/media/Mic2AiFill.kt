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
                moveTo(14.387f, 6.339f)
                curveTo(14.661f, 6.773f, 15.036f, 7.093f, 15.511f, 7.3f)
                lineTo(16.076f, 7.547f)
                curveTo(16.457f, 7.713f, 16.765f, 7.945f, 17.0f, 8.245f)
                verticalLineTo(12.0f)
                curveTo(17.0f, 14.761f, 14.762f, 17.0f, 12.0f, 17.0f)
                curveTo(9.239f, 17.0f, 7.0f, 14.761f, 7.0f, 12.0f)
                verticalLineTo(6.0f)
                curveTo(7.0f, 3.239f, 9.239f, 1.0f, 12.0f, 1.0f)
                curveTo(13.46f, 1.0f, 14.773f, 1.625f, 15.687f, 2.623f)
                lineTo(15.511f, 2.7f)
                curveTo(15.036f, 2.907f, 14.661f, 3.227f, 14.387f, 3.661f)
                curveTo(14.129f, 4.069f, 14.0f, 4.516f, 14.0f, 5.0f)
                curveTo(14.0f, 5.484f, 14.129f, 5.931f, 14.387f, 6.339f)
                close()
                moveTo(2.192f, 13.962f)
                lineTo(4.154f, 13.569f)
                curveTo(4.883f, 17.236f, 8.119f, 20.0f, 12.0f, 20.0f)
                curveTo(15.881f, 20.0f, 19.117f, 17.236f, 19.846f, 13.569f)
                lineTo(21.808f, 13.962f)
                curveTo(20.896f, 18.545f, 16.852f, 22.0f, 12.0f, 22.0f)
                curveTo(7.149f, 22.0f, 3.104f, 18.545f, 2.192f, 13.962f)
                close()
                moveTo(19.467f, 8.694f)
                lineTo(19.713f, 8.128f)
                curveTo(20.153f, 7.119f, 20.944f, 6.316f, 21.932f, 5.877f)
                lineTo(22.692f, 5.539f)
                curveTo(23.103f, 5.357f, 23.103f, 4.759f, 22.692f, 4.576f)
                lineTo(21.975f, 4.257f)
                curveTo(20.962f, 3.807f, 20.156f, 2.974f, 19.724f, 1.931f)
                lineTo(19.471f, 1.32f)
                curveTo(19.294f, 0.893f, 18.706f, 0.893f, 18.529f, 1.32f)
                lineTo(18.276f, 1.931f)
                curveTo(17.844f, 2.974f, 17.038f, 3.807f, 16.025f, 4.257f)
                lineTo(15.308f, 4.576f)
                curveTo(14.897f, 4.759f, 14.897f, 5.357f, 15.308f, 5.539f)
                lineTo(16.068f, 5.877f)
                curveTo(17.056f, 6.316f, 17.847f, 7.119f, 18.287f, 8.128f)
                lineTo(18.533f, 8.694f)
                curveTo(18.714f, 9.108f, 19.286f, 9.108f, 19.467f, 8.694f)
                close()
            }
        }
        .build()
        return _mic2AiFill!!
    }

private var _mic2AiFill: ImageVector? = null
