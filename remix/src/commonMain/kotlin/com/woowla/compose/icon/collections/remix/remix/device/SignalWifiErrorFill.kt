package com.woowla.compose.icon.collections.remix.remix.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DeviceGroup

public val DeviceGroup.SignalWifiErrorFill: ImageVector
    get() {
        if (_signalWifiErrorFill != null) {
            return _signalWifiErrorFill!!
        }
        _signalWifiErrorFill = Builder(name = "SignalWifiErrorFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(16.285f, 3.0f, 20.22f, 4.497f, 23.31f, 6.996f)
                lineTo(22.499f, 8.0f)
                horizontalLineTo(18.0f)
                lineTo(18.0f, 13.571f)
                lineTo(12.0f, 21.0f)
                lineTo(0.69f, 6.997f)
                curveTo(3.781f, 4.497f, 7.716f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(22.0f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(22.0f, 10.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _signalWifiErrorFill!!
    }

private var _signalWifiErrorFill: ImageVector? = null
