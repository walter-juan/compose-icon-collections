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

public val DeviceGroup.GpsLine: ImageVector
    get() {
        if (_gpsLine != null) {
            return _gpsLine!!
        }
        _gpsLine = Builder(name = "GpsLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.132f, 20.737f)
                curveTo(4.07f, 19.028f, 2.0f, 15.755f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 15.755f, 19.93f, 19.028f, 16.868f, 20.737f)
                lineTo(15.972f, 18.946f)
                curveTo(18.379f, 17.566f, 20.0f, 14.972f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 14.972f, 5.621f, 17.566f, 8.028f, 18.946f)
                lineTo(7.132f, 20.737f)
                close()
                moveTo(8.924f, 17.153f)
                curveTo(7.173f, 16.105f, 6.0f, 14.189f, 6.0f, 12.0f)
                curveTo(6.0f, 8.686f, 8.686f, 6.0f, 12.0f, 6.0f)
                curveTo(15.314f, 6.0f, 18.0f, 8.686f, 18.0f, 12.0f)
                curveTo(18.0f, 14.189f, 16.827f, 16.105f, 15.076f, 17.153f)
                lineTo(14.177f, 15.356f)
                curveTo(15.274f, 14.643f, 16.0f, 13.406f, 16.0f, 12.0f)
                curveTo(16.0f, 9.791f, 14.209f, 8.0f, 12.0f, 8.0f)
                curveTo(9.791f, 8.0f, 8.0f, 9.791f, 8.0f, 12.0f)
                curveTo(8.0f, 13.406f, 8.726f, 14.643f, 9.823f, 15.356f)
                lineTo(8.924f, 17.153f)
                close()
                moveTo(12.0f, 16.0f)
                lineTo(15.0f, 22.0f)
                horizontalLineTo(9.0f)
                lineTo(12.0f, 16.0f)
                close()
            }
        }
        .build()
        return _gpsLine!!
    }

private var _gpsLine: ImageVector? = null
