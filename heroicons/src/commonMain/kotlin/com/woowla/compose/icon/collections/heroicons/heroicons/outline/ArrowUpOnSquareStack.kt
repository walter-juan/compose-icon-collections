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

public val OutlineGroup.ArrowUpOnSquareStack: ImageVector
    get() {
        if (_arrowUpOnSquareStack != null) {
            return _arrowUpOnSquareStack!!
        }
        _arrowUpOnSquareStack = Builder(name = "ArrowUpOnSquareStack", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 7.5f)
                horizontalLineTo(6.75f)
                curveTo(5.507f, 7.5f, 4.5f, 8.507f, 4.5f, 9.75f)
                verticalLineTo(17.25f)
                curveTo(4.5f, 18.493f, 5.507f, 19.5f, 6.75f, 19.5f)
                horizontalLineTo(14.25f)
                curveTo(15.493f, 19.5f, 16.5f, 18.493f, 16.5f, 17.25f)
                verticalLineTo(9.75f)
                curveTo(16.5f, 8.507f, 15.493f, 7.5f, 14.25f, 7.5f)
                horizontalLineTo(13.5f)
                moveTo(13.5f, 4.5f)
                lineTo(10.5f, 1.5f)
                moveTo(10.5f, 1.5f)
                lineTo(7.5f, 4.5f)
                moveTo(10.5f, 1.5f)
                lineTo(10.5f, 12.75f)
                moveTo(16.5f, 10.5f)
                horizontalLineTo(17.25f)
                curveTo(18.493f, 10.5f, 19.5f, 11.507f, 19.5f, 12.75f)
                verticalLineTo(20.25f)
                curveTo(19.5f, 21.493f, 18.493f, 22.5f, 17.25f, 22.5f)
                horizontalLineTo(9.75f)
                curveTo(8.507f, 22.5f, 7.5f, 21.493f, 7.5f, 20.25f)
                verticalLineTo(19.5f)
            }
        }
        .build()
        return _arrowUpOnSquareStack!!
    }

private var _arrowUpOnSquareStack: ImageVector? = null
