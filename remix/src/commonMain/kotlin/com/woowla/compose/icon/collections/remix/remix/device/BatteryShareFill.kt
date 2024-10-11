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

public val DeviceGroup.BatteryShareFill: ImageVector
    get() {
        if (_batteryShareFill != null) {
            return _batteryShareFill!!
        }
        _batteryShareFill = Builder(name = "BatteryShareFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                curveTo(14.552f, 2.0f, 15.0f, 2.448f, 15.0f, 3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                curveTo(18.552f, 4.0f, 19.0f, 4.448f, 19.0f, 5.0f)
                verticalLineTo(11.2f)
                lineTo(15.0f, 8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.0f)
                curveTo(11.858f, 11.0f, 10.0f, 12.79f, 10.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(15.0f)
                curveTo(12.0f, 13.95f, 12.95f, 13.0f, 14.0f, 13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                lineTo(19.0f, 12.8f)
                verticalLineTo(21.0f)
                curveTo(19.0f, 21.552f, 18.552f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 22.0f, 5.0f, 21.552f, 5.0f, 21.0f)
                verticalLineTo(5.0f)
                curveTo(5.0f, 4.448f, 5.448f, 4.0f, 6.0f, 4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.0f)
                curveTo(9.0f, 2.448f, 9.448f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _batteryShareFill!!
    }

private var _batteryShareFill: ImageVector? = null
