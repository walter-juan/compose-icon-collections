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

public val SystemGroup.TimerLine: ImageVector
    get() {
        if (_timerLine != null) {
            return _timerLine!!
        }
        _timerLine = Builder(name = "TimerLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.618f, 5.968f)
                lineTo(19.071f, 4.515f)
                lineTo(20.485f, 5.929f)
                lineTo(19.032f, 7.382f)
                curveTo(20.264f, 8.922f, 21.0f, 10.875f, 21.0f, 13.0f)
                curveTo(21.0f, 17.971f, 16.971f, 22.0f, 12.0f, 22.0f)
                curveTo(7.029f, 22.0f, 3.0f, 17.971f, 3.0f, 13.0f)
                curveTo(3.0f, 8.029f, 7.029f, 4.0f, 12.0f, 4.0f)
                curveTo(14.125f, 4.0f, 16.078f, 4.736f, 17.618f, 5.968f)
                close()
                moveTo(12.0f, 20.0f)
                curveTo(15.866f, 20.0f, 19.0f, 16.866f, 19.0f, 13.0f)
                curveTo(19.0f, 9.134f, 15.866f, 6.0f, 12.0f, 6.0f)
                curveTo(8.134f, 6.0f, 5.0f, 9.134f, 5.0f, 13.0f)
                curveTo(5.0f, 16.866f, 8.134f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(11.0f, 8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(8.0f, 1.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(1.0f)
                close()
            }
        }
        .build()
        return _timerLine!!
    }

private var _timerLine: ImageVector? = null
