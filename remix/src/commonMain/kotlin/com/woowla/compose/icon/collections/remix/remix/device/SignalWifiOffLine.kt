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

public val DeviceGroup.SignalWifiOffLine: ImageVector
    get() {
        if (_signalWifiOffLine != null) {
            return _signalWifiOffLine!!
        }
        _signalWifiOffLine = Builder(name = "SignalWifiOffLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.808f, 1.393f)
                lineTo(20.486f, 19.071f)
                lineTo(19.072f, 20.485f)
                lineTo(15.389f, 16.803f)
                lineTo(12.0f, 21.0f)
                lineTo(0.69f, 6.997f)
                curveTo(1.604f, 6.257f, 2.592f, 5.606f, 3.641f, 5.055f)
                lineTo(1.394f, 2.808f)
                lineTo(2.808f, 1.393f)
                close()
                moveTo(3.58f, 7.392f)
                lineTo(12.0f, 17.817f)
                lineTo(13.967f, 15.38f)
                lineTo(5.132f, 6.544f)
                curveTo(4.6f, 6.798f, 4.082f, 7.08f, 3.58f, 7.392f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(16.285f, 3.0f, 20.22f, 4.497f, 23.31f, 6.996f)
                lineTo(17.904f, 13.689f)
                lineTo(16.482f, 12.267f)
                lineTo(20.42f, 7.391f)
                curveTo(17.923f, 5.842f, 15.028f, 5.0f, 12.0f, 5.0f)
                curveTo(11.128f, 5.0f, 10.266f, 5.07f, 9.421f, 5.207f)
                lineTo(7.725f, 3.511f)
                curveTo(9.095f, 3.177f, 10.527f, 3.0f, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _signalWifiOffLine!!
    }

private var _signalWifiOffLine: ImageVector? = null
