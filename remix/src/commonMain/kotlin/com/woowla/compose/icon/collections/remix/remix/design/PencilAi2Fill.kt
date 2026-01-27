package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.PencilAi2Fill: ImageVector
    get() {
        if (_pencilAi2Fill != null) {
            return _pencilAi2Fill!!
        }
        _pencilAi2Fill = Builder(name = "PencilAi2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.529f, 15.319f)
                curveTo(18.706f, 14.893f, 19.294f, 14.893f, 19.471f, 15.319f)
                lineTo(19.724f, 15.931f)
                curveTo(20.156f, 16.973f, 20.962f, 17.806f, 21.975f, 18.257f)
                lineTo(22.691f, 18.576f)
                curveTo(23.102f, 18.759f, 23.102f, 19.356f, 22.691f, 19.539f)
                lineTo(21.933f, 19.877f)
                curveTo(20.945f, 20.316f, 20.153f, 21.119f, 19.714f, 22.128f)
                lineTo(19.467f, 22.693f)
                curveTo(19.286f, 23.108f, 18.714f, 23.108f, 18.533f, 22.693f)
                lineTo(18.286f, 22.128f)
                curveTo(17.847f, 21.119f, 17.055f, 20.316f, 16.067f, 19.877f)
                lineTo(15.308f, 19.539f)
                curveTo(14.897f, 19.356f, 14.897f, 18.759f, 15.308f, 18.576f)
                lineTo(16.025f, 18.257f)
                curveTo(17.038f, 17.806f, 17.844f, 16.973f, 18.276f, 15.931f)
                lineTo(18.529f, 15.319f)
                close()
                moveTo(17.143f, 11.097f)
                lineTo(7.242f, 20.996f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.754f)
                lineTo(12.899f, 6.855f)
                lineTo(17.143f, 11.097f)
                close()
                moveTo(16.435f, 3.318f)
                curveTo(16.825f, 2.928f, 17.459f, 2.928f, 17.85f, 3.318f)
                lineTo(20.678f, 6.147f)
                curveTo(21.068f, 6.538f, 21.068f, 7.171f, 20.678f, 7.562f)
                lineTo(18.557f, 9.683f)
                lineTo(14.314f, 5.44f)
                lineTo(16.435f, 3.318f)
                close()
            }
        }
        .build()
        return _pencilAi2Fill!!
    }

private var _pencilAi2Fill: ImageVector? = null
