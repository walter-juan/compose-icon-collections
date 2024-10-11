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

public val DeviceGroup.UsbFill: ImageVector
    get() {
        if (_usbFill != null) {
            return _usbFill!!
        }
        _usbFill = Builder(name = "UsbFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                lineTo(15.0f, 6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.381f)
                lineTo(16.0f, 11.882f)
                lineTo(15.999f, 11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.999f)
                lineTo(18.0f, 13.118f)
                lineTo(13.0f, 15.618f)
                lineTo(13.001f, 17.171f)
                curveTo(14.166f, 17.583f, 15.0f, 18.694f, 15.0f, 20.0f)
                curveTo(15.0f, 21.657f, 13.657f, 23.0f, 12.0f, 23.0f)
                curveTo(10.343f, 23.0f, 9.0f, 21.657f, 9.0f, 20.0f)
                curveTo(9.0f, 18.813f, 9.689f, 17.787f, 10.689f, 17.301f)
                lineTo(6.0f, 14.0f)
                lineTo(5.999f, 11.732f)
                curveTo(5.402f, 11.386f, 5.0f, 10.74f, 5.0f, 10.0f)
                curveTo(5.0f, 8.895f, 5.895f, 8.0f, 7.0f, 8.0f)
                curveTo(8.105f, 8.0f, 9.0f, 8.895f, 9.0f, 10.0f)
                curveTo(9.0f, 10.74f, 8.598f, 11.387f, 8.0f, 11.732f)
                lineTo(8.0f, 13.0f)
                lineTo(11.0f, 15.086f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                lineTo(12.0f, 1.0f)
                close()
            }
        }
        .build()
        return _usbFill!!
    }

private var _usbFill: ImageVector? = null
