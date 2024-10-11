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

public val DeviceGroup.WifiOffLine: ImageVector
    get() {
        if (_wifiOffLine != null) {
            return _wifiOffLine!!
        }
        _wifiOffLine = Builder(name = "WifiOffLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                curveTo(12.714f, 18.0f, 13.37f, 18.25f, 13.886f, 18.667f)
                lineTo(12.0f, 21.0f)
                lineTo(10.115f, 18.667f)
                curveTo(10.63f, 18.25f, 11.286f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(2.808f, 1.393f)
                lineTo(20.485f, 19.071f)
                lineTo(19.071f, 20.485f)
                lineTo(13.891f, 15.304f)
                curveTo(13.297f, 15.107f, 12.661f, 15.0f, 12.0f, 15.0f)
                curveTo(10.572f, 15.0f, 9.26f, 15.499f, 8.23f, 16.332f)
                lineTo(6.974f, 14.776f)
                curveTo(8.25f, 13.744f, 9.849f, 13.097f, 11.596f, 13.01f)
                lineTo(9.0f, 10.414f)
                curveTo(7.553f, 10.823f, 6.227f, 11.522f, 5.088f, 12.443f)
                lineTo(3.831f, 10.887f)
                curveTo(4.899f, 10.023f, 6.108f, 9.324f, 7.416f, 8.831f)
                lineTo(5.132f, 6.545f)
                curveTo(3.989f, 7.089f, 2.921f, 7.765f, 1.947f, 8.552f)
                lineTo(0.689f, 6.997f)
                curveTo(1.604f, 6.257f, 2.592f, 5.606f, 3.641f, 5.055f)
                lineTo(1.393f, 2.808f)
                lineTo(2.808f, 1.393f)
                close()
                moveTo(14.5f, 10.285f)
                lineTo(12.217f, 8.002f)
                lineTo(12.0f, 8.0f)
                curveTo(15.095f, 8.0f, 17.937f, 9.081f, 20.169f, 10.887f)
                lineTo(18.912f, 12.443f)
                curveTo(17.644f, 11.417f, 16.143f, 10.667f, 14.5f, 10.285f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(16.285f, 3.0f, 20.22f, 4.497f, 23.311f, 6.997f)
                lineTo(22.053f, 8.552f)
                curveTo(19.306f, 6.331f, 15.809f, 5.0f, 12.0f, 5.0f)
                curveTo(11.122f, 5.0f, 10.26f, 5.071f, 9.421f, 5.207f)
                lineTo(7.725f, 3.511f)
                curveTo(9.095f, 3.177f, 10.527f, 3.0f, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _wifiOffLine!!
    }

private var _wifiOffLine: ImageVector? = null
