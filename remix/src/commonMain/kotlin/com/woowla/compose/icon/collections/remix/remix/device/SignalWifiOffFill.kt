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

public val DeviceGroup.SignalWifiOffFill: ImageVector
    get() {
        if (_signalWifiOffFill != null) {
            return _signalWifiOffFill!!
        }
        _signalWifiOffFill = Builder(name = "SignalWifiOffFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.808f, 1.393f)
                lineTo(20.486f, 19.071f)
                lineTo(19.072f, 20.485f)
                lineTo(15.389f, 16.802f)
                lineTo(12.0f, 21.0f)
                lineTo(0.69f, 6.997f)
                curveTo(1.604f, 6.257f, 2.592f, 5.606f, 3.641f, 5.055f)
                lineTo(1.394f, 2.808f)
                lineTo(2.808f, 1.393f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(16.285f, 3.0f, 20.22f, 4.497f, 23.31f, 6.996f)
                lineTo(17.904f, 13.689f)
                lineTo(7.725f, 3.511f)
                curveTo(9.095f, 3.177f, 10.527f, 3.0f, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _signalWifiOffFill!!
    }

private var _signalWifiOffFill: ImageVector? = null
