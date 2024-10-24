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

public val DesignGroup.QuillPenAiFill: ImageVector
    get() {
        if (_quillPenAiFill != null) {
            return _quillPenAiFill!!
        }
        _quillPenAiFill = Builder(name = "QuillPenAiFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.713f, 7.128f)
                lineTo(4.467f, 7.694f)
                curveTo(4.286f, 8.108f, 3.714f, 8.108f, 3.533f, 7.694f)
                lineTo(3.287f, 7.128f)
                curveTo(2.847f, 6.119f, 2.055f, 5.316f, 1.068f, 4.877f)
                lineTo(0.308f, 4.539f)
                curveTo(-0.103f, 4.357f, -0.103f, 3.759f, 0.308f, 3.576f)
                lineTo(1.025f, 3.257f)
                curveTo(2.038f, 2.807f, 2.844f, 1.974f, 3.276f, 0.931f)
                lineTo(3.529f, 0.32f)
                curveTo(3.706f, -0.107f, 4.294f, -0.107f, 4.471f, 0.32f)
                lineTo(4.724f, 0.931f)
                curveTo(5.156f, 1.974f, 5.962f, 2.807f, 6.975f, 3.257f)
                lineTo(7.692f, 3.576f)
                curveTo(8.103f, 3.759f, 8.103f, 4.357f, 7.692f, 4.539f)
                lineTo(6.932f, 4.877f)
                curveTo(5.945f, 5.316f, 5.153f, 6.119f, 4.713f, 7.128f)
                close()
                moveTo(3.064f, 21.613f)
                curveTo(4.089f, 15.422f, 6.311f, 1.997f, 21.0f, 1.997f)
                curveTo(19.504f, 4.997f, 18.5f, 6.497f, 17.5f, 7.497f)
                lineTo(16.5f, 8.497f)
                lineTo(18.0f, 9.497f)
                curveTo(17.0f, 12.497f, 14.0f, 15.997f, 10.0f, 16.497f)
                curveTo(7.331f, 16.83f, 5.664f, 18.663f, 4.998f, 21.997f)
                horizontalLineTo(3.0f)
                curveTo(3.021f, 21.872f, 3.042f, 21.744f, 3.064f, 21.613f)
                close()
            }
        }
        .build()
        return _quillPenAiFill!!
    }

private var _quillPenAiFill: ImageVector? = null
