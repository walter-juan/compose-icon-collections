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

public val DesignGroup.ColorFilterAiFill: ImageVector
    get() {
        if (_colorFilterAiFill != null) {
            return _colorFilterAiFill!!
        }
        _colorFilterAiFill = Builder(name = "ColorFilterAiFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 6.0f)
                curveTo(17.0f, 6.722f, 16.847f, 7.408f, 16.572f, 8.027f)
                curveTo(14.576f, 8.208f, 12.686f, 9.24f, 11.47f, 10.972f)
                curveTo(8.958f, 10.708f, 7.0f, 8.583f, 7.0f, 6.0f)
                curveTo(7.0f, 3.239f, 9.238f, 1.0f, 12.0f, 1.0f)
                curveTo(14.197f, 1.0f, 16.063f, 2.417f, 16.734f, 4.387f)
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
                lineTo(20.467f, 8.694f)
                curveTo(20.286f, 9.108f, 19.714f, 9.108f, 19.533f, 8.694f)
                lineTo(19.287f, 8.128f)
                curveTo(18.847f, 7.119f, 18.056f, 6.316f, 17.068f, 5.877f)
                lineTo(16.997f, 5.846f)
                curveTo(16.999f, 5.897f, 17.0f, 5.948f, 17.0f, 6.0f)
                close()
                moveTo(13.155f, 12.055f)
                curveTo(14.047f, 13.974f, 13.996f, 16.128f, 13.154f, 17.946f)
                curveTo(13.553f, 18.494f, 14.071f, 18.969f, 14.696f, 19.33f)
                curveTo(17.087f, 20.711f, 20.145f, 19.892f, 21.526f, 17.5f)
                curveTo(22.906f, 15.109f, 22.087f, 12.051f, 19.696f, 10.67f)
                curveTo(17.459f, 9.379f, 14.64f, 10.012f, 13.155f, 12.055f)
                close()
                moveTo(11.375f, 12.973f)
                curveTo(9.267f, 12.786f, 7.427f, 11.665f, 6.273f, 10.027f)
                curveTo(5.599f, 10.098f, 4.929f, 10.309f, 4.304f, 10.67f)
                curveTo(1.912f, 12.05f, 1.093f, 15.108f, 2.473f, 17.5f)
                curveTo(3.854f, 19.891f, 6.912f, 20.711f, 9.304f, 19.33f)
                curveTo(11.54f, 18.039f, 12.402f, 15.281f, 11.375f, 12.973f)
                close()
            }
        }
        .build()
        return _colorFilterAiFill!!
    }

private var _colorFilterAiFill: ImageVector? = null
