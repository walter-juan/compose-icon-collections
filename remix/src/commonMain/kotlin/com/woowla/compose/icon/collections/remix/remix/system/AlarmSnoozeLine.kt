package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.AlarmSnoozeLine: ImageVector
    get() {
        if (_alarmSnoozeLine != null) {
            return _alarmSnoozeLine!!
        }
        _alarmSnoozeLine = Builder(name = "AlarmSnoozeLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 13.0f)
                curveTo(3.0f, 17.971f, 7.03f, 22.0f, 12.0f, 22.0f)
                curveTo(16.971f, 22.0f, 21.0f, 17.971f, 21.0f, 13.0f)
                curveTo(21.0f, 8.03f, 16.971f, 4.0f, 12.0f, 4.0f)
                curveTo(7.03f, 4.0f, 3.0f, 8.03f, 3.0f, 13.0f)
                close()
                moveTo(19.0f, 13.0f)
                curveTo(19.0f, 16.866f, 15.866f, 20.0f, 12.0f, 20.0f)
                curveTo(8.134f, 20.0f, 5.0f, 16.866f, 5.0f, 13.0f)
                curveTo(5.0f, 9.134f, 8.134f, 6.0f, 12.0f, 6.0f)
                curveTo(15.866f, 6.0f, 19.0f, 9.134f, 19.0f, 13.0f)
                close()
                moveTo(5.283f, 2.747f)
                lineTo(1.747f, 6.283f)
                lineTo(3.161f, 7.697f)
                lineTo(6.697f, 4.161f)
                lineTo(5.283f, 2.747f)
                close()
                moveTo(22.253f, 6.283f)
                lineTo(18.718f, 2.747f)
                lineTo(17.303f, 4.161f)
                lineTo(20.839f, 7.697f)
                lineTo(22.253f, 6.283f)
                close()
                moveTo(9.0f, 11.0f)
                horizontalLineTo(12.586f)
                lineTo(9.0f, 14.586f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.414f)
                lineTo(15.0f, 11.414f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _alarmSnoozeLine!!
    }

private var _alarmSnoozeLine: ImageVector? = null
