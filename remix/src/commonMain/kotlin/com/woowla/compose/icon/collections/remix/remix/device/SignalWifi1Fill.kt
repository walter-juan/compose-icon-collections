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

public val DeviceGroup.SignalWifi1Fill: ImageVector
    get() {
        if (_signalWifi1Fill != null) {
            return _signalWifi1Fill!!
        }
        _signalWifi1Fill = Builder(name = "SignalWifi1Fill", defaultWidth = 24.0.dp, defaultHeight =
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
                lineTo(8.689f, 13.715f)
                curveTo(9.698f, 13.256f, 10.819f, 13.0f, 12.0f, 13.0f)
                curveTo(13.182f, 13.0f, 14.303f, 13.256f, 15.312f, 13.715f)
                lineTo(20.42f, 7.391f)
                curveTo(17.923f, 5.842f, 15.028f, 5.0f, 12.0f, 5.0f)
                close()
            }
        }
        .build()
        return _signalWifi1Fill!!
    }

private var _signalWifi1Fill: ImageVector? = null
