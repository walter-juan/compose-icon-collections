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

public val BusinessGroup.CalendarScheduleLine: ImageVector
    get() {
        if (_calendarScheduleLine != null) {
            return _calendarScheduleLine!!
        }
        _calendarScheduleLine = Builder(name = "CalendarScheduleLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 3.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(17.0f, 12.0f)
                curveTo(14.791f, 12.0f, 13.0f, 13.791f, 13.0f, 16.0f)
                curveTo(13.0f, 18.209f, 14.791f, 20.0f, 17.0f, 20.0f)
                curveTo(19.209f, 20.0f, 21.0f, 18.209f, 21.0f, 16.0f)
                curveTo(21.0f, 13.791f, 19.209f, 12.0f, 17.0f, 12.0f)
                close()
                moveTo(11.0f, 16.0f)
                curveTo(11.0f, 12.686f, 13.686f, 10.0f, 17.0f, 10.0f)
                curveTo(20.314f, 10.0f, 23.0f, 12.686f, 23.0f, 16.0f)
                curveTo(23.0f, 19.314f, 20.314f, 22.0f, 17.0f, 22.0f)
                curveTo(13.686f, 22.0f, 11.0f, 19.314f, 11.0f, 16.0f)
                close()
                moveTo(16.0f, 13.0f)
                verticalLineTo(16.414f)
                lineTo(18.293f, 18.707f)
                lineTo(19.707f, 17.293f)
                lineTo(18.0f, 15.586f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _calendarScheduleLine!!
    }

private var _calendarScheduleLine: ImageVector? = null
