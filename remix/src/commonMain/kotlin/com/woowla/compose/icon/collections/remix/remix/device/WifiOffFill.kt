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

public val DeviceGroup.WifiOffFill: ImageVector
    get() {
        if (_wifiOffFill != null) {
            return _wifiOffFill!!
        }
        _wifiOffFill = Builder(name = "WifiOffFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                curveTo(12.714f, 18.0f, 13.37f, 18.25f, 13.886f, 18.666f)
                lineTo(12.0f, 21.0f)
                lineTo(10.115f, 18.666f)
                curveTo(10.63f, 18.25f, 11.286f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(2.808f, 1.393f)
                lineTo(20.485f, 19.071f)
                lineTo(19.071f, 20.485f)
                lineTo(15.389f, 16.804f)
                lineTo(15.142f, 17.111f)
                curveTo(14.284f, 16.416f, 13.191f, 16.0f, 12.0f, 16.0f)
                curveTo(10.81f, 16.0f, 9.717f, 16.416f, 8.859f, 17.11f)
                lineTo(6.974f, 14.776f)
                curveTo(8.25f, 13.744f, 9.849f, 13.097f, 11.596f, 13.01f)
                lineTo(9.823f, 11.238f)
                curveTo(8.293f, 11.577f, 6.894f, 12.268f, 5.717f, 13.22f)
                lineTo(3.831f, 10.887f)
                curveTo(4.899f, 10.023f, 6.108f, 9.324f, 7.416f, 8.831f)
                lineTo(5.885f, 7.299f)
                curveTo(4.691f, 7.833f, 3.579f, 8.518f, 2.575f, 9.33f)
                lineTo(0.689f, 6.997f)
                curveTo(1.604f, 6.257f, 2.592f, 5.606f, 3.641f, 5.055f)
                lineTo(1.393f, 2.808f)
                lineTo(2.808f, 1.393f)
                close()
                moveTo(16.084f, 11.869f)
                lineTo(12.217f, 8.002f)
                lineTo(12.0f, 8.0f)
                curveTo(15.095f, 8.0f, 17.937f, 9.081f, 20.169f, 10.887f)
                lineTo(18.284f, 13.22f)
                curveTo(17.616f, 12.681f, 16.878f, 12.225f, 16.084f, 11.869f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(16.285f, 3.0f, 20.22f, 4.497f, 23.311f, 6.997f)
                lineTo(21.425f, 9.33f)
                curveTo(18.85f, 7.247f, 15.571f, 6.0f, 12.0f, 6.0f)
                curveTo(11.428f, 6.0f, 10.864f, 6.032f, 10.309f, 6.094f)
                lineTo(7.725f, 3.511f)
                curveTo(9.095f, 3.177f, 10.527f, 3.0f, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _wifiOffFill!!
    }

private var _wifiOffFill: ImageVector? = null
