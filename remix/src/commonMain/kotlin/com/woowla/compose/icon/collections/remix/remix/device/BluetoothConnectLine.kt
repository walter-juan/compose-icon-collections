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

public val DeviceGroup.BluetoothConnectLine: ImageVector
    get() {
        if (_bluetoothConnectLine != null) {
            return _bluetoothConnectLine!!
        }
        _bluetoothConnectLine = Builder(name = "BluetoothConnectLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.311f, 12.0f)
                lineTo(18.654f, 16.343f)
                lineTo(12.998f, 22.0f)
                horizontalLineTo(10.998f)
                verticalLineTo(15.314f)
                lineTo(6.634f, 19.678f)
                lineTo(5.219f, 18.264f)
                lineTo(10.998f, 12.485f)
                verticalLineTo(11.515f)
                lineTo(5.219f, 5.737f)
                lineTo(6.634f, 4.322f)
                lineTo(10.998f, 8.686f)
                verticalLineTo(2.0f)
                horizontalLineTo(12.998f)
                lineTo(18.654f, 7.657f)
                lineTo(14.311f, 12.0f)
                close()
                moveTo(12.998f, 13.515f)
                verticalLineTo(19.172f)
                lineTo(15.826f, 16.343f)
                lineTo(12.998f, 13.515f)
                close()
                moveTo(12.998f, 10.485f)
                lineTo(15.826f, 7.657f)
                lineTo(12.998f, 4.828f)
                verticalLineTo(10.485f)
                close()
                moveTo(19.5f, 13.5f)
                curveTo(18.672f, 13.5f, 18.0f, 12.828f, 18.0f, 12.0f)
                curveTo(18.0f, 11.172f, 18.672f, 10.5f, 19.5f, 10.5f)
                curveTo(20.328f, 10.5f, 21.0f, 11.172f, 21.0f, 12.0f)
                curveTo(21.0f, 12.828f, 20.328f, 13.5f, 19.5f, 13.5f)
                close()
                moveTo(6.5f, 13.5f)
                curveTo(5.672f, 13.5f, 5.0f, 12.828f, 5.0f, 12.0f)
                curveTo(5.0f, 11.172f, 5.672f, 10.5f, 6.5f, 10.5f)
                curveTo(7.328f, 10.5f, 8.0f, 11.172f, 8.0f, 12.0f)
                curveTo(8.0f, 12.828f, 7.328f, 13.5f, 6.5f, 13.5f)
                close()
            }
        }
        .build()
        return _bluetoothConnectLine!!
    }

private var _bluetoothConnectLine: ImageVector? = null
