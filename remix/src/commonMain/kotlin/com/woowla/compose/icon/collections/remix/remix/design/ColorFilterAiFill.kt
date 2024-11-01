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
        _colorFilterAiFill = Builder(name = "ColorFilterAiFill", defaultWidth = 25.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 25.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.511f, 7.3f)
                curveTo(15.896f, 7.468f, 16.281f, 7.635f, 16.663f, 7.806f)
                curveTo(16.635f, 7.881f, 16.604f, 7.955f, 16.572f, 8.027f)
                curveTo(14.576f, 8.208f, 12.686f, 9.24f, 11.47f, 10.972f)
                curveTo(8.958f, 10.708f, 7.0f, 8.583f, 7.0f, 6.0f)
                curveTo(7.0f, 3.239f, 9.238f, 1.0f, 12.0f, 1.0f)
                curveTo(13.459f, 1.0f, 14.773f, 1.625f, 15.687f, 2.623f)
                curveTo(14.705f, 3.051f, 14.0f, 3.896f, 14.0f, 5.0f)
                curveTo(14.0f, 5.994f, 14.601f, 6.904f, 15.511f, 7.3f)
                close()
                moveTo(13.154f, 17.946f)
                curveTo(13.996f, 16.128f, 14.047f, 13.974f, 13.155f, 12.055f)
                curveTo(14.64f, 10.012f, 17.459f, 9.379f, 19.696f, 10.67f)
                curveTo(22.087f, 12.051f, 22.906f, 15.109f, 21.526f, 17.5f)
                curveTo(20.145f, 19.892f, 17.087f, 20.711f, 14.696f, 19.33f)
                curveTo(14.071f, 18.969f, 13.553f, 18.494f, 13.154f, 17.946f)
                close()
                moveTo(6.273f, 10.027f)
                curveTo(7.427f, 11.665f, 9.267f, 12.786f, 11.375f, 12.973f)
                curveTo(12.402f, 15.281f, 11.54f, 18.039f, 9.304f, 19.33f)
                curveTo(6.912f, 20.711f, 3.854f, 19.891f, 2.473f, 17.5f)
                curveTo(1.093f, 15.108f, 1.912f, 12.05f, 4.304f, 10.67f)
                curveTo(4.929f, 10.309f, 5.599f, 10.098f, 6.273f, 10.027f)
                close()
                moveTo(16.876f, 5.713f)
                lineTo(16.311f, 5.467f)
                curveTo(15.896f, 5.286f, 15.896f, 4.714f, 16.311f, 4.533f)
                lineTo(16.876f, 4.287f)
                curveTo(17.885f, 3.847f, 18.688f, 3.055f, 19.127f, 2.068f)
                lineTo(19.465f, 1.308f)
                curveTo(19.648f, 0.897f, 20.246f, 0.897f, 20.428f, 1.308f)
                lineTo(20.747f, 2.025f)
                curveTo(21.198f, 3.038f, 22.031f, 3.844f, 23.074f, 4.276f)
                lineTo(23.685f, 4.529f)
                curveTo(24.111f, 4.706f, 24.111f, 5.294f, 23.685f, 5.471f)
                lineTo(23.074f, 5.724f)
                curveTo(22.031f, 6.156f, 21.198f, 6.962f, 20.747f, 7.975f)
                lineTo(20.428f, 8.692f)
                curveTo(20.246f, 9.103f, 19.648f, 9.103f, 19.465f, 8.692f)
                lineTo(19.127f, 7.932f)
                curveTo(18.688f, 6.945f, 17.885f, 6.153f, 16.876f, 5.713f)
                close()
            }
        }
        .build()
        return _colorFilterAiFill!!
    }

private var _colorFilterAiFill: ImageVector? = null
