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

public val DeviceGroup.BluetoothLine: ImageVector
    get() {
        if (_bluetoothLine != null) {
            return _bluetoothLine!!
        }
        _bluetoothLine = Builder(name = "BluetoothLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.312f, 12.0f)
                lineTo(18.655f, 16.343f)
                lineTo(12.998f, 22.0f)
                horizontalLineTo(10.998f)
                verticalLineTo(15.314f)
                lineTo(6.634f, 19.678f)
                lineTo(5.22f, 18.264f)
                lineTo(10.998f, 12.485f)
                verticalLineTo(11.515f)
                lineTo(5.22f, 5.737f)
                lineTo(6.634f, 4.322f)
                lineTo(10.998f, 8.686f)
                verticalLineTo(2.0f)
                horizontalLineTo(12.998f)
                lineTo(18.655f, 7.657f)
                lineTo(14.312f, 12.0f)
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
            }
        }
        .build()
        return _bluetoothLine!!
    }

private var _bluetoothLine: ImageVector? = null
