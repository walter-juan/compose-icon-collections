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

public val OutlineGroup.CircleStack: ImageVector
    get() {
        if (_circleStack != null) {
            return _circleStack!!
        }
        _circleStack = Builder(name = "CircleStack", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.25f, 6.375f)
                curveTo(20.25f, 8.653f, 16.556f, 10.5f, 12.0f, 10.5f)
                curveTo(7.444f, 10.5f, 3.75f, 8.653f, 3.75f, 6.375f)
                moveTo(20.25f, 6.375f)
                curveTo(20.25f, 4.097f, 16.556f, 2.25f, 12.0f, 2.25f)
                curveTo(7.444f, 2.25f, 3.75f, 4.097f, 3.75f, 6.375f)
                moveTo(20.25f, 6.375f)
                verticalLineTo(17.625f)
                curveTo(20.25f, 19.903f, 16.556f, 21.75f, 12.0f, 21.75f)
                curveTo(7.444f, 21.75f, 3.75f, 19.903f, 3.75f, 17.625f)
                verticalLineTo(6.375f)
                moveTo(20.25f, 6.375f)
                verticalLineTo(10.125f)
                moveTo(3.75f, 6.375f)
                verticalLineTo(10.125f)
                moveTo(20.25f, 10.125f)
                verticalLineTo(13.875f)
                curveTo(20.25f, 16.153f, 16.556f, 18.0f, 12.0f, 18.0f)
                curveTo(7.444f, 18.0f, 3.75f, 16.153f, 3.75f, 13.875f)
                verticalLineTo(10.125f)
                moveTo(20.25f, 10.125f)
                curveTo(20.25f, 12.403f, 16.556f, 14.25f, 12.0f, 14.25f)
                curveTo(7.444f, 14.25f, 3.75f, 12.403f, 3.75f, 10.125f)
            }
        }
        .build()
        return _circleStack!!
    }

private var _circleStack: ImageVector? = null
