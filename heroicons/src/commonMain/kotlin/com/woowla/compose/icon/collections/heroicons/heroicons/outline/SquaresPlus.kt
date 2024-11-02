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

public val OutlineGroup.SquaresPlus: ImageVector
    get() {
        if (_squaresPlus != null) {
            return _squaresPlus!!
        }
        _squaresPlus = Builder(name = "SquaresPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 16.875f)
                horizontalLineTo(16.875f)
                moveTo(16.875f, 16.875f)
                horizontalLineTo(20.25f)
                moveTo(16.875f, 16.875f)
                verticalLineTo(13.5f)
                moveTo(16.875f, 16.875f)
                verticalLineTo(20.25f)
                moveTo(6.0f, 10.5f)
                horizontalLineTo(8.25f)
                curveTo(9.493f, 10.5f, 10.5f, 9.493f, 10.5f, 8.25f)
                verticalLineTo(6.0f)
                curveTo(10.5f, 4.757f, 9.493f, 3.75f, 8.25f, 3.75f)
                horizontalLineTo(6.0f)
                curveTo(4.757f, 3.75f, 3.75f, 4.757f, 3.75f, 6.0f)
                verticalLineTo(8.25f)
                curveTo(3.75f, 9.493f, 4.757f, 10.5f, 6.0f, 10.5f)
                close()
                moveTo(6.0f, 20.25f)
                horizontalLineTo(8.25f)
                curveTo(9.493f, 20.25f, 10.5f, 19.243f, 10.5f, 18.0f)
                verticalLineTo(15.75f)
                curveTo(10.5f, 14.507f, 9.493f, 13.5f, 8.25f, 13.5f)
                horizontalLineTo(6.0f)
                curveTo(4.757f, 13.5f, 3.75f, 14.507f, 3.75f, 15.75f)
                verticalLineTo(18.0f)
                curveTo(3.75f, 19.243f, 4.757f, 20.25f, 6.0f, 20.25f)
                close()
                moveTo(15.75f, 10.5f)
                horizontalLineTo(18.0f)
                curveTo(19.243f, 10.5f, 20.25f, 9.493f, 20.25f, 8.25f)
                verticalLineTo(6.0f)
                curveTo(20.25f, 4.757f, 19.243f, 3.75f, 18.0f, 3.75f)
                horizontalLineTo(15.75f)
                curveTo(14.507f, 3.75f, 13.5f, 4.757f, 13.5f, 6.0f)
                verticalLineTo(8.25f)
                curveTo(13.5f, 9.493f, 14.507f, 10.5f, 15.75f, 10.5f)
                close()
            }
        }
        .build()
        return _squaresPlus!!
    }

private var _squaresPlus: ImageVector? = null
