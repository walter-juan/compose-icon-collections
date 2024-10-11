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

public val SystemGroup.AlarmWarningFill: ImageVector
    get() {
        if (_alarmWarningFill != null) {
            return _alarmWarningFill!!
        }
        _alarmWarningFill = Builder(name = "AlarmWarningFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 20.0f)
                verticalLineTo(14.0f)
                curveTo(4.0f, 9.582f, 7.582f, 6.0f, 12.0f, 6.0f)
                curveTo(16.418f, 6.0f, 20.0f, 9.582f, 20.0f, 14.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(6.0f, 14.0f)
                horizontalLineTo(8.0f)
                curveTo(8.0f, 11.791f, 9.791f, 10.0f, 12.0f, 10.0f)
                verticalLineTo(8.0f)
                curveTo(8.686f, 8.0f, 6.0f, 10.686f, 6.0f, 14.0f)
                close()
                moveTo(11.0f, 2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(19.778f, 4.808f)
                lineTo(21.192f, 6.222f)
                lineTo(19.071f, 8.343f)
                lineTo(17.657f, 6.929f)
                lineTo(19.778f, 4.808f)
                close()
                moveTo(2.808f, 6.222f)
                lineTo(4.222f, 4.808f)
                lineTo(6.343f, 6.929f)
                lineTo(4.929f, 8.343f)
                lineTo(2.808f, 6.222f)
                close()
            }
        }
        .build()
        return _alarmWarningFill!!
    }

private var _alarmWarningFill: ImageVector? = null
