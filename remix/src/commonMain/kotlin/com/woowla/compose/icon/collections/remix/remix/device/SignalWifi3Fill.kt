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

public val DeviceGroup.SignalWifi3Fill: ImageVector
    get() {
        if (_signalWifi3Fill != null) {
            return _signalWifi3Fill!!
        }
        _signalWifi3Fill = Builder(name = "SignalWifi3Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(16.285f, 3.0f, 20.22f, 4.497f, 23.31f, 6.996f)
                lineTo(12.0f, 21.0f)
                lineTo(0.69f, 6.997f)
                curveTo(3.781f, 4.497f, 7.716f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 5.0f)
                curveTo(8.973f, 5.0f, 6.078f, 5.842f, 3.58f, 7.392f)
                lineTo(5.484f, 9.749f)
                curveTo(7.4f, 8.637f, 9.626f, 8.0f, 12.0f, 8.0f)
                curveTo(14.375f, 8.0f, 16.601f, 8.637f, 18.517f, 9.749f)
                lineTo(20.42f, 7.391f)
                curveTo(17.923f, 5.842f, 15.028f, 5.0f, 12.0f, 5.0f)
                close()
            }
        }
        .build()
        return _signalWifi3Fill!!
    }

private var _signalWifi3Fill: ImageVector? = null
