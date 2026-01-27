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

public val DesignGroup.PencilAiFill: ImageVector
    get() {
        if (_pencilAiFill != null) {
            return _pencilAiFill!!
        }
        _pencilAiFill = Builder(name = "PencilAiFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.143f, 11.097f)
                lineTo(7.242f, 20.996f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.754f)
                lineTo(12.899f, 6.854f)
                lineTo(17.143f, 11.097f)
                close()
                moveTo(16.436f, 3.318f)
                curveTo(16.826f, 2.928f, 17.459f, 2.928f, 17.85f, 3.318f)
                lineTo(20.678f, 6.147f)
                curveTo(21.068f, 6.538f, 21.068f, 7.171f, 20.678f, 7.562f)
                lineTo(18.557f, 9.683f)
                lineTo(14.314f, 5.44f)
                lineTo(16.436f, 3.318f)
                close()
                moveTo(4.529f, 1.319f)
                curveTo(4.706f, 0.894f, 5.294f, 0.894f, 5.471f, 1.319f)
                lineTo(5.724f, 1.931f)
                curveTo(6.156f, 2.973f, 6.962f, 3.806f, 7.975f, 4.257f)
                lineTo(8.692f, 4.576f)
                curveTo(9.103f, 4.759f, 9.103f, 5.356f, 8.692f, 5.539f)
                lineTo(7.933f, 5.877f)
                curveTo(6.945f, 6.316f, 6.153f, 7.119f, 5.714f, 8.128f)
                lineTo(5.467f, 8.693f)
                curveTo(5.286f, 9.107f, 4.714f, 9.107f, 4.533f, 8.693f)
                lineTo(4.286f, 8.128f)
                curveTo(3.847f, 7.119f, 3.055f, 6.316f, 2.067f, 5.877f)
                lineTo(1.308f, 5.539f)
                curveTo(0.897f, 5.356f, 0.897f, 4.759f, 1.308f, 4.576f)
                lineTo(2.025f, 4.257f)
                curveTo(3.038f, 3.806f, 3.844f, 2.973f, 4.276f, 1.931f)
                lineTo(4.529f, 1.319f)
                close()
            }
        }
        .build()
        return _pencilAiFill!!
    }

private var _pencilAiFill: ImageVector? = null
