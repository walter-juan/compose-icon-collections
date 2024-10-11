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

public val DeviceGroup.PhoneFill: ImageVector
    get() {
        if (_phoneFill != null) {
            return _phoneFill!!
        }
        _phoneFill = Builder(name = "PhoneFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 16.42f)
                verticalLineTo(19.956f)
                curveTo(21.0f, 20.481f, 20.594f, 20.917f, 20.07f, 20.954f)
                curveTo(19.633f, 20.985f, 19.276f, 21.0f, 19.0f, 21.0f)
                curveTo(10.163f, 21.0f, 3.0f, 13.837f, 3.0f, 5.0f)
                curveTo(3.0f, 4.724f, 3.015f, 4.367f, 3.046f, 3.93f)
                curveTo(3.083f, 3.406f, 3.519f, 3.0f, 4.044f, 3.0f)
                horizontalLineTo(7.58f)
                curveTo(7.837f, 3.0f, 8.052f, 3.194f, 8.078f, 3.45f)
                curveTo(8.101f, 3.679f, 8.122f, 3.863f, 8.142f, 4.002f)
                curveTo(8.344f, 5.415f, 8.758f, 6.759f, 9.349f, 8.003f)
                curveTo(9.444f, 8.203f, 9.382f, 8.442f, 9.202f, 8.57f)
                lineTo(7.044f, 10.112f)
                curveTo(8.358f, 13.181f, 10.819f, 15.642f, 13.888f, 16.956f)
                lineTo(15.427f, 14.802f)
                curveTo(15.557f, 14.62f, 15.799f, 14.557f, 16.001f, 14.653f)
                curveTo(17.245f, 15.244f, 18.589f, 15.657f, 20.002f, 15.858f)
                curveTo(20.14f, 15.878f, 20.323f, 15.899f, 20.55f, 15.922f)
                curveTo(20.806f, 15.948f, 21.0f, 16.163f, 21.0f, 16.42f)
                close()
            }
        }
        .build()
        return _phoneFill!!
    }

private var _phoneFill: ImageVector? = null
