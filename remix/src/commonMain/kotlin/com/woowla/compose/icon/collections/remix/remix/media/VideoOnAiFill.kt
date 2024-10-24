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

public val MediaGroup.VideoOnAiFill: ImageVector
    get() {
        if (_videoOnAiFill != null) {
            return _videoOnAiFill!!
        }
        _videoOnAiFill = Builder(name = "VideoOnAiFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.713f, 9.128f)
                lineTo(4.467f, 9.694f)
                curveTo(4.286f, 10.108f, 3.714f, 10.108f, 3.533f, 9.694f)
                lineTo(3.287f, 9.128f)
                curveTo(2.847f, 8.119f, 2.055f, 7.316f, 1.068f, 6.877f)
                lineTo(0.308f, 6.539f)
                curveTo(-0.103f, 6.357f, -0.103f, 5.759f, 0.308f, 5.576f)
                lineTo(1.025f, 5.257f)
                curveTo(2.038f, 4.807f, 2.844f, 3.974f, 3.276f, 2.931f)
                lineTo(3.529f, 2.32f)
                curveTo(3.706f, 1.893f, 4.294f, 1.893f, 4.471f, 2.32f)
                lineTo(4.724f, 2.931f)
                curveTo(5.156f, 3.974f, 5.962f, 4.807f, 6.975f, 5.257f)
                lineTo(7.692f, 5.576f)
                curveTo(8.103f, 5.759f, 8.103f, 6.357f, 7.692f, 6.539f)
                lineTo(6.932f, 6.877f)
                curveTo(5.945f, 7.316f, 5.153f, 8.119f, 4.713f, 9.128f)
                close()
                moveTo(10.0f, 6.0f)
                curveTo(10.0f, 9.314f, 7.314f, 12.0f, 4.0f, 12.0f)
                curveTo(2.907f, 12.0f, 1.883f, 11.708f, 1.0f, 11.197f)
                verticalLineTo(19.0f)
                curveTo(1.0f, 19.552f, 1.448f, 20.0f, 2.0f, 20.0f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 20.0f, 17.0f, 19.552f, 17.0f, 19.0f)
                verticalLineTo(14.8f)
                lineTo(22.213f, 18.449f)
                curveTo(22.297f, 18.508f, 22.397f, 18.54f, 22.5f, 18.54f)
                curveTo(22.776f, 18.54f, 23.0f, 18.316f, 23.0f, 18.04f)
                verticalLineTo(5.96f)
                curveTo(23.0f, 5.858f, 22.968f, 5.758f, 22.91f, 5.674f)
                curveTo(22.751f, 5.447f, 22.44f, 5.392f, 22.213f, 5.551f)
                lineTo(17.0f, 9.2f)
                verticalLineTo(5.0f)
                curveTo(17.0f, 4.448f, 16.552f, 4.0f, 16.0f, 4.0f)
                horizontalLineTo(9.659f)
                curveTo(9.88f, 4.626f, 10.0f, 5.299f, 10.0f, 6.0f)
                close()
            }
        }
        .build()
        return _videoOnAiFill!!
    }

private var _videoOnAiFill: ImageVector? = null
