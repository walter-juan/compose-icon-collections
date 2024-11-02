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

public val OutlineGroup.ArrowUpOnSquare: ImageVector
    get() {
        if (_arrowUpOnSquare != null) {
            return _arrowUpOnSquare!!
        }
        _arrowUpOnSquare = Builder(name = "ArrowUpOnSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 8.25f)
                horizontalLineTo(7.5f)
                curveTo(6.257f, 8.25f, 5.25f, 9.257f, 5.25f, 10.5f)
                verticalLineTo(19.5f)
                curveTo(5.25f, 20.743f, 6.257f, 21.75f, 7.5f, 21.75f)
                horizontalLineTo(16.5f)
                curveTo(17.743f, 21.75f, 18.75f, 20.743f, 18.75f, 19.5f)
                verticalLineTo(10.5f)
                curveTo(18.75f, 9.257f, 17.743f, 8.25f, 16.5f, 8.25f)
                horizontalLineTo(15.0f)
                moveTo(15.0f, 5.25f)
                lineTo(12.0f, 2.25f)
                moveTo(12.0f, 2.25f)
                lineTo(9.0f, 5.25f)
                moveTo(12.0f, 2.25f)
                lineTo(12.0f, 15.0f)
            }
        }
        .build()
        return _arrowUpOnSquare!!
    }

private var _arrowUpOnSquare: ImageVector? = null
