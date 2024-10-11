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

public val DesignGroup.ColorFilterFill: ImageVector
    get() {
        if (_colorFilterFill != null) {
            return _colorFilterFill!!
        }
        _colorFilterFill = Builder(name = "ColorFilterFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.572f, 8.027f)
                curveTo(16.847f, 7.408f, 17.0f, 6.722f, 17.0f, 6.0f)
                curveTo(17.0f, 3.239f, 14.761f, 1.0f, 12.0f, 1.0f)
                curveTo(9.238f, 1.0f, 7.0f, 3.239f, 7.0f, 6.0f)
                curveTo(7.0f, 8.583f, 8.958f, 10.708f, 11.47f, 10.972f)
                curveTo(12.686f, 9.24f, 14.576f, 8.208f, 16.572f, 8.027f)
                close()
                moveTo(13.154f, 17.946f)
                curveTo(13.996f, 16.128f, 14.047f, 13.974f, 13.155f, 12.055f)
                curveTo(14.64f, 10.012f, 17.459f, 9.379f, 19.696f, 10.67f)
                lineTo(19.696f, 10.67f)
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
            }
        }
        .build()
        return _colorFilterFill!!
    }

private var _colorFilterFill: ImageVector? = null
