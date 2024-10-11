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

public val DeviceGroup.WirelessChargingFill: ImageVector
    get() {
        if (_wirelessChargingFill != null) {
            return _wirelessChargingFill!!
        }
        _wirelessChargingFill = Builder(name = "WirelessChargingFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.929f, 4.929f)
                lineTo(5.343f, 6.343f)
                curveTo(3.895f, 7.791f, 3.0f, 9.791f, 3.0f, 12.0f)
                curveTo(3.0f, 14.209f, 3.895f, 16.209f, 5.343f, 17.657f)
                lineTo(3.929f, 19.071f)
                curveTo(2.119f, 17.261f, 1.0f, 14.762f, 1.0f, 12.0f)
                curveTo(1.0f, 9.238f, 2.119f, 6.738f, 3.929f, 4.929f)
                close()
                moveTo(20.071f, 4.929f)
                curveTo(21.881f, 6.738f, 23.0f, 9.238f, 23.0f, 12.0f)
                curveTo(23.0f, 14.762f, 21.881f, 17.261f, 20.071f, 19.071f)
                lineTo(18.657f, 17.657f)
                curveTo(20.105f, 16.209f, 21.0f, 14.209f, 21.0f, 12.0f)
                curveTo(21.0f, 9.791f, 20.105f, 7.792f, 18.658f, 6.344f)
                lineTo(20.071f, 4.929f)
                close()
                moveTo(13.0f, 5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                lineTo(11.0f, 19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                lineTo(13.0f, 5.0f)
                close()
                moveTo(6.757f, 7.757f)
                lineTo(8.172f, 9.172f)
                curveTo(7.448f, 9.895f, 7.0f, 10.895f, 7.0f, 12.0f)
                curveTo(7.0f, 13.104f, 7.448f, 14.104f, 8.172f, 14.828f)
                lineTo(6.757f, 16.243f)
                curveTo(5.672f, 15.157f, 5.0f, 13.657f, 5.0f, 12.0f)
                curveTo(5.0f, 10.343f, 5.672f, 8.843f, 6.757f, 7.757f)
                close()
                moveTo(17.244f, 7.758f)
                curveTo(18.329f, 8.844f, 19.0f, 10.344f, 19.0f, 12.0f)
                curveTo(19.0f, 13.657f, 18.328f, 15.157f, 17.243f, 16.243f)
                lineTo(15.828f, 14.828f)
                curveTo(16.552f, 14.104f, 17.0f, 13.104f, 17.0f, 12.0f)
                curveTo(17.0f, 10.896f, 16.553f, 9.896f, 15.829f, 9.173f)
                lineTo(17.244f, 7.758f)
                close()
            }
        }
        .build()
        return _wirelessChargingFill!!
    }

private var _wirelessChargingFill: ImageVector? = null
