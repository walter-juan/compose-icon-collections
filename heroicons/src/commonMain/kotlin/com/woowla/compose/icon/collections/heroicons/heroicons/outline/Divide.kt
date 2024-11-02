package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.Divide: ImageVector
    get() {
        if (_divide != null) {
            return _divide!!
        }
        _divide = Builder(name = "Divide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.499f, 11.998f)
                horizontalLineTo(19.499f)
                moveTo(11.999f, 5.248f)
                horizontalLineTo(12.007f)
                verticalLineTo(5.256f)
                horizontalLineTo(11.999f)
                verticalLineTo(5.248f)
                close()
                moveTo(12.374f, 5.248f)
                curveTo(12.374f, 5.455f, 12.206f, 5.623f, 11.999f, 5.623f)
                curveTo(11.792f, 5.623f, 11.624f, 5.455f, 11.624f, 5.248f)
                curveTo(11.624f, 5.041f, 11.792f, 4.873f, 11.999f, 4.873f)
                curveTo(12.206f, 4.873f, 12.374f, 5.041f, 12.374f, 5.248f)
                close()
                moveTo(12.0f, 18.751f)
                horizontalLineTo(12.007f)
                verticalLineTo(18.758f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.751f)
                close()
                moveTo(12.375f, 18.751f)
                curveTo(12.375f, 18.958f, 12.207f, 19.126f, 12.0f, 19.126f)
                curveTo(11.793f, 19.126f, 11.625f, 18.958f, 11.625f, 18.751f)
                curveTo(11.625f, 18.544f, 11.793f, 18.376f, 12.0f, 18.376f)
                curveTo(12.207f, 18.376f, 12.375f, 18.544f, 12.375f, 18.751f)
                close()
            }
        }
        .build()
        return _divide!!
    }

private var _divide: ImageVector? = null
