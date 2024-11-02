package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.CalendarDays: ImageVector
    get() {
        if (_calendarDays != null) {
            return _calendarDays!!
        }
        _calendarDays = Builder(name = "CalendarDays", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 24.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 40.0f)
                lineTo(64.0f, 64.0f)
                curveTo(28.7f, 64.0f, 0.0f, 92.7f, 0.0f, 128.0f)
                lineToRelative(0.0f, 16.0f)
                lineToRelative(0.0f, 48.0f)
                lineTo(0.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(320.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -256.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(0.0f, -16.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineToRelative(-40.0f, 0.0f)
                lineToRelative(0.0f, -40.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 40.0f)
                lineTo(152.0f, 64.0f)
                lineToRelative(0.0f, -40.0f)
                close()
                moveTo(48.0f, 192.0f)
                lineToRelative(80.0f, 0.0f)
                lineToRelative(0.0f, 56.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, -56.0f)
                close()
                moveTo(48.0f, 296.0f)
                lineToRelative(80.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                close()
                moveTo(176.0f, 296.0f)
                lineToRelative(96.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-96.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                close()
                moveTo(320.0f, 296.0f)
                lineToRelative(80.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                close()
                moveTo(400.0f, 248.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, -56.0f)
                lineToRelative(80.0f, 0.0f)
                lineToRelative(0.0f, 56.0f)
                close()
                moveTo(400.0f, 408.0f)
                lineToRelative(0.0f, 40.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -56.0f)
                lineToRelative(80.0f, 0.0f)
                close()
                moveTo(272.0f, 408.0f)
                lineToRelative(0.0f, 56.0f)
                lineToRelative(-96.0f, 0.0f)
                lineToRelative(0.0f, -56.0f)
                lineToRelative(96.0f, 0.0f)
                close()
                moveTo(128.0f, 408.0f)
                lineToRelative(0.0f, 56.0f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineToRelative(0.0f, -40.0f)
                lineToRelative(80.0f, 0.0f)
                close()
                moveTo(272.0f, 248.0f)
                lineToRelative(-96.0f, 0.0f)
                lineToRelative(0.0f, -56.0f)
                lineToRelative(96.0f, 0.0f)
                lineToRelative(0.0f, 56.0f)
                close()
            }
        }
        .build()
        return _calendarDays!!
    }

private var _calendarDays: ImageVector? = null