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

public val OutlineGroup.Briefcase: ImageVector
    get() {
        if (_briefcase != null) {
            return _briefcase!!
        }
        _briefcase = Builder(name = "Briefcase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.25f, 14.15f)
                verticalLineTo(18.4f)
                curveTo(20.25f, 19.494f, 19.463f, 20.436f, 18.378f, 20.58f)
                curveTo(16.292f, 20.857f, 14.162f, 21.0f, 12.0f, 21.0f)
                curveTo(9.838f, 21.0f, 7.709f, 20.857f, 5.622f, 20.58f)
                curveTo(4.537f, 20.436f, 3.75f, 19.494f, 3.75f, 18.4f)
                verticalLineTo(14.15f)
                moveTo(20.25f, 14.15f)
                curveTo(20.722f, 13.748f, 21.0f, 13.139f, 21.0f, 12.489f)
                verticalLineTo(8.706f)
                curveTo(21.0f, 7.625f, 20.232f, 6.691f, 19.163f, 6.531f)
                curveTo(18.038f, 6.362f, 16.899f, 6.233f, 15.75f, 6.144f)
                moveTo(20.25f, 14.15f)
                curveTo(20.056f, 14.315f, 19.83f, 14.445f, 19.577f, 14.529f)
                curveTo(17.195f, 15.321f, 14.648f, 15.75f, 12.0f, 15.75f)
                curveTo(9.352f, 15.75f, 6.805f, 15.321f, 4.423f, 14.529f)
                curveTo(4.17f, 14.445f, 3.944f, 14.315f, 3.75f, 14.15f)
                moveTo(3.75f, 14.15f)
                curveTo(3.278f, 13.748f, 3.0f, 13.139f, 3.0f, 12.489f)
                verticalLineTo(8.706f)
                curveTo(3.0f, 7.625f, 3.768f, 6.691f, 4.837f, 6.531f)
                curveTo(5.962f, 6.362f, 7.1f, 6.233f, 8.25f, 6.144f)
                moveTo(15.75f, 6.144f)
                verticalLineTo(5.25f)
                curveTo(15.75f, 4.007f, 14.743f, 3.0f, 13.5f, 3.0f)
                horizontalLineTo(10.5f)
                curveTo(9.257f, 3.0f, 8.25f, 4.007f, 8.25f, 5.25f)
                verticalLineTo(6.144f)
                moveTo(15.75f, 6.144f)
                curveTo(14.513f, 6.049f, 13.262f, 6.0f, 12.0f, 6.0f)
                curveTo(10.738f, 6.0f, 9.487f, 6.049f, 8.25f, 6.144f)
                moveTo(12.0f, 12.75f)
                horizontalLineTo(12.007f)
                verticalLineTo(12.757f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.75f)
                close()
            }
        }
        .build()
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
