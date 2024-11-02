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

public val OutlineGroup.Ticket: ImageVector
    get() {
        if (_ticket != null) {
            return _ticket!!
        }
        _ticket = Builder(name = "Ticket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 6.0f)
                verticalLineTo(6.75f)
                moveTo(16.5f, 9.75f)
                verticalLineTo(10.5f)
                moveTo(16.5f, 13.5f)
                verticalLineTo(14.25f)
                moveTo(16.5f, 17.25f)
                verticalLineTo(18.0f)
                moveTo(7.5f, 12.75f)
                horizontalLineTo(12.75f)
                moveTo(7.5f, 15.0f)
                horizontalLineTo(10.5f)
                moveTo(3.375f, 5.25f)
                curveTo(2.754f, 5.25f, 2.25f, 5.754f, 2.25f, 6.375f)
                verticalLineTo(9.401f)
                curveTo(3.147f, 9.92f, 3.75f, 10.89f, 3.75f, 12.0f)
                curveTo(3.75f, 13.11f, 3.147f, 14.08f, 2.25f, 14.599f)
                verticalLineTo(17.625f)
                curveTo(2.25f, 18.246f, 2.754f, 18.75f, 3.375f, 18.75f)
                horizontalLineTo(20.625f)
                curveTo(21.246f, 18.75f, 21.75f, 18.246f, 21.75f, 17.625f)
                verticalLineTo(14.599f)
                curveTo(20.853f, 14.08f, 20.25f, 13.11f, 20.25f, 12.0f)
                curveTo(20.25f, 10.89f, 20.853f, 9.92f, 21.75f, 9.401f)
                verticalLineTo(6.375f)
                curveTo(21.75f, 5.754f, 21.246f, 5.25f, 20.625f, 5.25f)
                horizontalLineTo(3.375f)
                close()
            }
        }
        .build()
        return _ticket!!
    }

private var _ticket: ImageVector? = null
