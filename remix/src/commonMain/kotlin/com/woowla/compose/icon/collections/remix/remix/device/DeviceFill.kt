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

public val DeviceGroup.DeviceFill: ImageVector
    get() {
        if (_deviceFill != null) {
            return _deviceFill!!
        }
        _deviceFill = Builder(name = "DeviceFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 6.0f)
                horizontalLineTo(11.0f)
                curveTo(10.448f, 6.0f, 10.0f, 6.448f, 10.0f, 7.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 20.0f, 3.0f, 19.552f, 3.0f, 19.0f)
                verticalLineTo(3.0f)
                curveTo(3.0f, 2.448f, 3.448f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(18.552f, 2.0f, 19.0f, 2.448f, 19.0f, 3.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(13.0f, 8.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 8.0f, 22.0f, 8.448f, 22.0f, 9.0f)
                verticalLineTo(21.0f)
                curveTo(22.0f, 21.552f, 21.552f, 22.0f, 21.0f, 22.0f)
                horizontalLineTo(13.0f)
                curveTo(12.448f, 22.0f, 12.0f, 21.552f, 12.0f, 21.0f)
                verticalLineTo(9.0f)
                curveTo(12.0f, 8.448f, 12.448f, 8.0f, 13.0f, 8.0f)
                close()
            }
        }
        .build()
        return _deviceFill!!
    }

private var _deviceFill: ImageVector? = null
