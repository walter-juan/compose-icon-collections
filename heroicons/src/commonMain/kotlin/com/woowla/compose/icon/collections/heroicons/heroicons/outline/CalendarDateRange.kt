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

public val OutlineGroup.CalendarDateRange: ImageVector
    get() {
        if (_calendarDateRange != null) {
            return _calendarDateRange!!
        }
        _calendarDateRange = Builder(name = "CalendarDateRange", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.749f, 2.994f)
                verticalLineTo(5.245f)
                moveTo(17.249f, 2.993f)
                verticalLineTo(5.243f)
                moveTo(2.998f, 18.743f)
                verticalLineTo(7.492f)
                curveTo(2.998f, 6.249f, 4.005f, 5.242f, 5.248f, 5.242f)
                horizontalLineTo(18.747f)
                curveTo(19.99f, 5.242f, 20.998f, 6.249f, 20.998f, 7.492f)
                verticalLineTo(18.743f)
                moveTo(2.998f, 18.743f)
                curveTo(2.998f, 19.986f, 4.005f, 20.993f, 5.248f, 20.993f)
                horizontalLineTo(18.747f)
                curveTo(19.99f, 20.993f, 20.998f, 19.986f, 20.998f, 18.743f)
                moveTo(2.998f, 18.743f)
                verticalLineTo(11.243f)
                curveTo(2.998f, 10.0f, 4.005f, 8.993f, 5.248f, 8.993f)
                horizontalLineTo(18.747f)
                curveTo(19.99f, 8.993f, 20.998f, 10.0f, 20.998f, 11.243f)
                verticalLineTo(18.743f)
                moveTo(14.248f, 12.743f)
                horizontalLineTo(16.497f)
                moveTo(7.498f, 14.993f)
                horizontalLineTo(11.998f)
                moveTo(12.0f, 12.743f)
                horizontalLineTo(12.005f)
                verticalLineTo(12.749f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.743f)
                close()
                moveTo(11.999f, 17.244f)
                horizontalLineTo(12.005f)
                verticalLineTo(17.249f)
                horizontalLineTo(11.999f)
                verticalLineTo(17.244f)
                close()
                moveTo(9.749f, 17.244f)
                horizontalLineTo(9.754f)
                verticalLineTo(17.25f)
                horizontalLineTo(9.749f)
                verticalLineTo(17.244f)
                close()
                moveTo(7.498f, 17.244f)
                horizontalLineTo(7.504f)
                verticalLineTo(17.249f)
                horizontalLineTo(7.498f)
                verticalLineTo(17.244f)
                close()
                moveTo(14.248f, 14.997f)
                horizontalLineTo(14.254f)
                verticalLineTo(15.002f)
                horizontalLineTo(14.248f)
                verticalLineTo(14.997f)
                close()
                moveTo(14.249f, 17.244f)
                horizontalLineTo(14.255f)
                verticalLineTo(17.25f)
                horizontalLineTo(14.249f)
                verticalLineTo(17.244f)
                close()
                moveTo(16.5f, 14.995f)
                horizontalLineTo(16.505f)
                verticalLineTo(15.001f)
                horizontalLineTo(16.5f)
                verticalLineTo(14.995f)
                close()
            }
        }
        .build()
        return _calendarDateRange!!
    }

private var _calendarDateRange: ImageVector? = null
