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

public val OutlineGroup.CalendarDays: ImageVector
    get() {
        if (_calendarDays != null) {
            return _calendarDays!!
        }
        _calendarDays = Builder(name = "CalendarDays", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.75f, 3.0f)
                verticalLineTo(5.25f)
                moveTo(17.25f, 3.0f)
                verticalLineTo(5.25f)
                moveTo(3.0f, 18.75f)
                verticalLineTo(7.5f)
                curveTo(3.0f, 6.257f, 4.007f, 5.25f, 5.25f, 5.25f)
                horizontalLineTo(18.75f)
                curveTo(19.993f, 5.25f, 21.0f, 6.257f, 21.0f, 7.5f)
                verticalLineTo(18.75f)
                moveTo(3.0f, 18.75f)
                curveTo(3.0f, 19.993f, 4.007f, 21.0f, 5.25f, 21.0f)
                horizontalLineTo(18.75f)
                curveTo(19.993f, 21.0f, 21.0f, 19.993f, 21.0f, 18.75f)
                moveTo(3.0f, 18.75f)
                verticalLineTo(11.25f)
                curveTo(3.0f, 10.007f, 4.007f, 9.0f, 5.25f, 9.0f)
                horizontalLineTo(18.75f)
                curveTo(19.993f, 9.0f, 21.0f, 10.007f, 21.0f, 11.25f)
                verticalLineTo(18.75f)
                moveTo(12.0f, 12.75f)
                horizontalLineTo(12.007f)
                verticalLineTo(12.757f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.75f)
                close()
                moveTo(12.0f, 15.0f)
                horizontalLineTo(12.007f)
                verticalLineTo(15.007f)
                horizontalLineTo(12.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(12.0f, 17.25f)
                horizontalLineTo(12.007f)
                verticalLineTo(17.257f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.25f)
                close()
                moveTo(9.75f, 15.0f)
                horizontalLineTo(9.757f)
                verticalLineTo(15.007f)
                horizontalLineTo(9.75f)
                verticalLineTo(15.0f)
                close()
                moveTo(9.75f, 17.25f)
                horizontalLineTo(9.757f)
                verticalLineTo(17.257f)
                horizontalLineTo(9.75f)
                verticalLineTo(17.25f)
                close()
                moveTo(7.5f, 15.0f)
                horizontalLineTo(7.508f)
                verticalLineTo(15.007f)
                horizontalLineTo(7.5f)
                verticalLineTo(15.0f)
                close()
                moveTo(7.5f, 17.25f)
                horizontalLineTo(7.508f)
                verticalLineTo(17.257f)
                horizontalLineTo(7.5f)
                verticalLineTo(17.25f)
                close()
                moveTo(14.25f, 12.75f)
                horizontalLineTo(14.257f)
                verticalLineTo(12.757f)
                horizontalLineTo(14.25f)
                verticalLineTo(12.75f)
                close()
                moveTo(14.25f, 15.0f)
                horizontalLineTo(14.257f)
                verticalLineTo(15.007f)
                horizontalLineTo(14.25f)
                verticalLineTo(15.0f)
                close()
                moveTo(14.25f, 17.25f)
                horizontalLineTo(14.257f)
                verticalLineTo(17.257f)
                horizontalLineTo(14.25f)
                verticalLineTo(17.25f)
                close()
                moveTo(16.5f, 12.75f)
                horizontalLineTo(16.507f)
                verticalLineTo(12.757f)
                horizontalLineTo(16.5f)
                verticalLineTo(12.75f)
                close()
                moveTo(16.5f, 15.0f)
                horizontalLineTo(16.507f)
                verticalLineTo(15.007f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _calendarDays!!
    }

private var _calendarDays: ImageVector? = null
