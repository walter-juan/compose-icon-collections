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

public val DeviceGroup.Fingerprint2Fill: ImageVector
    get() {
        if (_fingerprint2Fill != null) {
            return _fingerprint2Fill!!
        }
        _fingerprint2Fill = Builder(name = "Fingerprint2Fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveTo(16.971f, 1.0f, 21.0f, 5.029f, 21.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(21.0f, 17.038f, 19.494f, 19.725f, 17.189f, 21.355f)
                curveTo(17.716f, 19.663f, 18.0f, 17.865f, 18.0f, 16.0f)
                lineTo(18.0f, 13.999f)
                horizontalLineTo(16.0f)
                lineTo(16.0f, 16.0f)
                lineTo(15.997f, 16.315f)
                curveTo(15.953f, 18.564f, 15.446f, 20.7f, 14.566f, 22.63f)
                curveTo(13.752f, 22.871f, 12.891f, 23.0f, 12.0f, 23.0f)
                curveTo(11.659f, 23.0f, 11.322f, 22.981f, 10.99f, 22.944f)
                curveTo(12.264f, 20.935f, 13.0f, 18.554f, 13.0f, 16.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                lineTo(10.996f, 16.288f)
                curveTo(10.937f, 18.589f, 10.171f, 20.714f, 8.908f, 22.455f)
                curveTo(7.946f, 22.103f, 7.06f, 21.591f, 6.283f, 20.951f)
                curveTo(7.359f, 19.589f, 8.0f, 17.869f, 8.0f, 16.0f)
                verticalLineTo(10.0f)
                lineTo(8.005f, 9.8f)
                curveTo(8.038f, 9.134f, 8.234f, 8.51f, 8.554f, 7.968f)
                lineTo(7.109f, 6.523f)
                curveTo(6.411f, 7.504f, 6.0f, 8.704f, 6.0f, 10.0f)
                verticalLineTo(16.0f)
                lineTo(5.996f, 16.225f)
                curveTo(5.951f, 17.444f, 5.543f, 18.569f, 4.875f, 19.497f)
                curveTo(3.699f, 17.976f, 3.0f, 16.07f, 3.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(3.0f, 5.029f, 7.029f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(10.704f, 4.0f, 9.504f, 4.411f, 8.524f, 5.109f)
                lineTo(9.968f, 6.554f)
                curveTo(10.564f, 6.202f, 11.258f, 6.0f, 12.0f, 6.0f)
                curveTo(14.209f, 6.0f, 16.0f, 7.791f, 16.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.0f)
                curveTo(18.0f, 6.686f, 15.314f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _fingerprint2Fill!!
    }

private var _fingerprint2Fill: ImageVector? = null
