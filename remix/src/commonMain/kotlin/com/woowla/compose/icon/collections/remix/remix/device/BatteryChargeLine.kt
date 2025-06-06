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

public val DeviceGroup.BatteryChargeLine: ImageVector
    get() {
        if (_batteryChargeLine != null) {
            return _batteryChargeLine!!
        }
        _batteryChargeLine = Builder(name = "BatteryChargeLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 19.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 19.0f, 2.0f, 18.552f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 5.448f, 2.448f, 5.0f, 3.0f, 5.0f)
                horizontalLineTo(9.625f)
                lineTo(8.458f, 7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(12.375f, 19.0f)
                lineTo(13.542f, 17.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                curveTo(19.552f, 5.0f, 20.0f, 5.448f, 20.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(20.0f, 18.552f, 19.552f, 19.0f, 19.0f, 19.0f)
                horizontalLineTo(12.375f)
                close()
                moveTo(21.0f, 9.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(12.0f, 11.0f)
                horizontalLineTo(15.0f)
                lineTo(10.0f, 19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                lineTo(12.0f, 5.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _batteryChargeLine!!
    }

private var _batteryChargeLine: ImageVector? = null
