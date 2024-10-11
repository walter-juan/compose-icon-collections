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

public val DeviceGroup.WifiLine: ImageVector
    get() {
        if (_wifiLine != null) {
            return _wifiLine!!
        }
        _wifiLine = Builder(name = "WifiLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.689f, 6.997f)
                curveTo(3.78f, 4.497f, 7.715f, 3.0f, 12.0f, 3.0f)
                curveTo(16.285f, 3.0f, 20.219f, 4.497f, 23.31f, 6.997f)
                lineTo(22.054f, 8.553f)
                curveTo(19.306f, 6.331f, 15.809f, 5.0f, 12.0f, 5.0f)
                curveTo(8.191f, 5.0f, 4.694f, 6.331f, 1.946f, 8.553f)
                lineTo(0.689f, 6.997f)
                close()
                moveTo(3.831f, 10.886f)
                curveTo(6.063f, 9.081f, 8.905f, 8.0f, 12.0f, 8.0f)
                curveTo(15.094f, 8.0f, 17.936f, 9.081f, 20.169f, 10.886f)
                lineTo(18.912f, 12.442f)
                curveTo(17.023f, 10.915f, 14.618f, 10.0f, 12.0f, 10.0f)
                curveTo(9.382f, 10.0f, 6.977f, 10.915f, 5.088f, 12.442f)
                lineTo(3.831f, 10.886f)
                close()
                moveTo(6.973f, 14.776f)
                curveTo(8.347f, 13.665f, 10.096f, 13.0f, 12.0f, 13.0f)
                curveTo(13.904f, 13.0f, 15.653f, 13.665f, 17.027f, 14.776f)
                lineTo(15.77f, 16.332f)
                curveTo(14.74f, 15.499f, 13.428f, 15.0f, 12.0f, 15.0f)
                curveTo(10.572f, 15.0f, 9.26f, 15.499f, 8.23f, 16.332f)
                lineTo(6.973f, 14.776f)
                close()
                moveTo(10.115f, 18.666f)
                curveTo(10.63f, 18.25f, 11.286f, 18.0f, 12.0f, 18.0f)
                curveTo(12.714f, 18.0f, 13.37f, 18.25f, 13.885f, 18.666f)
                lineTo(12.0f, 21.0f)
                lineTo(10.115f, 18.666f)
                close()
            }
        }
        .build()
        return _wifiLine!!
    }

private var _wifiLine: ImageVector? = null
