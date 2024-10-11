package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.CalendarScheduleFill: ImageVector
    get() {
        if (_calendarScheduleFill != null) {
            return _calendarScheduleFill!!
        }
        _calendarScheduleFill = Builder(name = "CalendarScheduleFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 1.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 3.0f, 2.0f, 3.448f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.552f, 2.448f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(10.755f)
                curveTo(9.657f, 19.63f, 9.0f, 17.892f, 9.0f, 16.0f)
                curveTo(9.0f, 11.582f, 12.582f, 8.0f, 17.0f, 8.0f)
                curveTo(18.892f, 8.0f, 20.63f, 8.657f, 22.0f, 9.755f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 3.448f, 21.552f, 3.0f, 21.0f, 3.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(23.0f, 16.0f)
                curveTo(23.0f, 19.314f, 20.314f, 22.0f, 17.0f, 22.0f)
                curveTo(13.686f, 22.0f, 11.0f, 19.314f, 11.0f, 16.0f)
                curveTo(11.0f, 12.686f, 13.686f, 10.0f, 17.0f, 10.0f)
                curveTo(20.314f, 10.0f, 23.0f, 12.686f, 23.0f, 16.0f)
                close()
                moveTo(16.0f, 12.0f)
                verticalLineTo(16.414f)
                lineTo(18.293f, 18.707f)
                lineTo(19.707f, 17.293f)
                lineTo(18.0f, 15.586f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _calendarScheduleFill!!
    }

private var _calendarScheduleFill: ImageVector? = null
