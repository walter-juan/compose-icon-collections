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

public val BusinessGroup.CalendarCloseFill: ImageVector
    get() {
        if (_calendarCloseFill != null) {
            return _calendarCloseFill!!
        }
        _calendarCloseFill = Builder(name = "CalendarCloseFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 3.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 3.0f, 2.0f, 3.448f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.552f, 2.448f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 21.0f, 22.0f, 20.552f, 22.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 3.448f, 21.552f, 3.0f, 21.0f, 3.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(4.0f, 8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(9.879f, 9.964f)
                lineTo(12.0f, 12.086f)
                lineTo(14.121f, 9.964f)
                lineTo(15.535f, 11.378f)
                lineTo(13.414f, 13.5f)
                lineTo(15.535f, 15.621f)
                lineTo(14.121f, 17.035f)
                lineTo(12.0f, 14.914f)
                lineTo(9.878f, 17.035f)
                lineTo(8.464f, 15.621f)
                lineTo(10.586f, 13.5f)
                lineTo(8.464f, 11.378f)
                lineTo(9.879f, 9.964f)
                close()
            }
        }
        .build()
        return _calendarCloseFill!!
    }

private var _calendarCloseFill: ImageVector? = null
