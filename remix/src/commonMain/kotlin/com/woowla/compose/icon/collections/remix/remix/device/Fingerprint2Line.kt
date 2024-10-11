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

public val DeviceGroup.Fingerprint2Line: ImageVector
    get() {
        if (_fingerprint2Line != null) {
            return _fingerprint2Line!!
        }
        _fingerprint2Line = Builder(name = "Fingerprint2Line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveTo(16.971f, 1.0f, 21.0f, 5.029f, 21.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(21.0f, 18.971f, 16.971f, 23.0f, 12.0f, 23.0f)
                curveTo(10.914f, 23.0f, 9.872f, 22.808f, 8.908f, 22.455f)
                curveTo(9.036f, 22.278f, 9.159f, 22.098f, 9.277f, 21.913f)
                lineTo(9.448f, 21.633f)
                curveTo(10.388f, 20.064f, 10.946f, 18.239f, 10.996f, 16.288f)
                lineTo(11.0f, 16.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                curveTo(13.0f, 17.772f, 12.645f, 19.462f, 12.003f, 21.001f)
                curveTo(12.795f, 21.0f, 13.56f, 20.867f, 14.272f, 20.623f)
                curveTo(14.715f, 19.262f, 14.966f, 17.815f, 14.997f, 16.314f)
                lineTo(15.0f, 16.0f)
                lineTo(15.0f, 12.999f)
                horizontalLineTo(17.0f)
                lineTo(17.0f, 16.0f)
                curveTo(17.0f, 17.088f, 16.898f, 18.153f, 16.702f, 19.185f)
                curveTo(18.058f, 17.955f, 18.93f, 16.2f, 18.996f, 14.241f)
                lineTo(19.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(19.0f, 6.134f, 15.866f, 3.0f, 12.0f, 3.0f)
                curveTo(10.428f, 3.0f, 8.976f, 3.518f, 7.808f, 4.394f)
                lineTo(6.383f, 2.968f)
                curveTo(7.922f, 1.736f, 9.875f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(7.0f, 10.0f)
                curveTo(7.0f, 7.239f, 9.239f, 5.0f, 12.0f, 5.0f)
                curveTo(14.761f, 5.0f, 17.0f, 7.239f, 17.0f, 10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                curveTo(15.0f, 8.343f, 13.657f, 7.0f, 12.0f, 7.0f)
                curveTo(10.402f, 7.0f, 9.096f, 8.249f, 9.005f, 9.824f)
                lineTo(9.0f, 10.0f)
                verticalLineTo(16.0f)
                curveTo(9.0f, 17.567f, 8.6f, 19.04f, 7.896f, 20.323f)
                lineTo(7.872f, 20.363f)
                curveTo(7.643f, 20.777f, 7.381f, 21.171f, 7.09f, 21.542f)
                curveTo(6.649f, 21.254f, 6.235f, 20.93f, 5.853f, 20.572f)
                lineTo(5.544f, 20.271f)
                curveTo(3.97f, 18.65f, 3.0f, 16.438f, 3.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(3.0f, 7.875f, 3.736f, 5.922f, 4.968f, 4.383f)
                lineTo(6.394f, 5.808f)
                curveTo(5.563f, 6.917f, 5.054f, 8.28f, 5.004f, 9.759f)
                lineTo(5.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(5.0f, 15.675f, 5.588f, 17.212f, 6.569f, 18.417f)
                curveTo(6.822f, 17.735f, 6.97f, 17.003f, 6.996f, 16.241f)
                lineTo(7.0f, 16.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _fingerprint2Line!!
    }

private var _fingerprint2Line: ImageVector? = null
