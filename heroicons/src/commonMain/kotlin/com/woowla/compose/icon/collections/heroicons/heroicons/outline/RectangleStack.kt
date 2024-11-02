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

public val OutlineGroup.RectangleStack: ImageVector
    get() {
        if (_rectangleStack != null) {
            return _rectangleStack!!
        }
        _rectangleStack = Builder(name = "RectangleStack", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 6.878f)
                verticalLineTo(6.0f)
                curveTo(6.0f, 4.757f, 7.007f, 3.75f, 8.25f, 3.75f)
                horizontalLineTo(15.75f)
                curveTo(16.993f, 3.75f, 18.0f, 4.757f, 18.0f, 6.0f)
                verticalLineTo(6.878f)
                moveTo(6.0f, 6.878f)
                curveTo(6.235f, 6.795f, 6.487f, 6.75f, 6.75f, 6.75f)
                horizontalLineTo(17.25f)
                curveTo(17.513f, 6.75f, 17.765f, 6.795f, 18.0f, 6.878f)
                moveTo(6.0f, 6.878f)
                curveTo(5.126f, 7.187f, 4.5f, 8.02f, 4.5f, 9.0f)
                verticalLineTo(9.878f)
                moveTo(18.0f, 6.878f)
                curveTo(18.874f, 7.187f, 19.5f, 8.02f, 19.5f, 9.0f)
                verticalLineTo(9.878f)
                moveTo(19.5f, 9.878f)
                curveTo(19.265f, 9.795f, 19.013f, 9.75f, 18.75f, 9.75f)
                horizontalLineTo(5.25f)
                curveTo(4.987f, 9.75f, 4.735f, 9.795f, 4.5f, 9.878f)
                moveTo(19.5f, 9.878f)
                curveTo(20.374f, 10.187f, 21.0f, 11.02f, 21.0f, 12.0f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 19.243f, 19.993f, 20.25f, 18.75f, 20.25f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 20.25f, 3.0f, 19.243f, 3.0f, 18.0f)
                verticalLineTo(12.0f)
                curveTo(3.0f, 11.02f, 3.626f, 10.187f, 4.5f, 9.878f)
            }
        }
        .build()
        return _rectangleStack!!
    }

private var _rectangleStack: ImageVector? = null
