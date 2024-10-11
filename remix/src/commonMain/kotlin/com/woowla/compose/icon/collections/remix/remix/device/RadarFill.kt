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

public val DeviceGroup.RadarFill: ImageVector
    get() {
        if (_radarFill != null) {
            return _radarFill!!
        }
        _radarFill = Builder(name = "RadarFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.368f, 4.398f)
                lineTo(10.884f, 10.433f)
                lineTo(12.616f, 11.433f)
                lineTo(16.101f, 5.398f)
                curveTo(20.27f, 8.17f, 22.406f, 12.477f, 20.66f, 15.5f)
                curveTo(18.8f, 18.722f, 13.472f, 18.855f, 8.75f, 16.129f)
                curveTo(4.029f, 13.403f, 1.48f, 8.722f, 3.34f, 5.5f)
                curveTo(5.085f, 2.477f, 9.883f, 2.173f, 14.368f, 4.398f)
                close()
                moveTo(15.884f, 1.773f)
                lineTo(17.616f, 2.773f)
                lineTo(16.116f, 5.371f)
                lineTo(14.384f, 4.371f)
                lineTo(15.884f, 1.773f)
                close()
                moveTo(6.732f, 20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.018f)
                curveTo(4.94f, 22.001f, 4.862f, 21.994f, 4.785f, 21.977f)
                curveTo(4.77f, 21.973f, 4.756f, 21.97f, 4.741f, 21.966f)
                curveTo(4.659f, 21.944f, 4.578f, 21.911f, 4.5f, 21.866f)
                curveTo(4.471f, 21.849f, 4.443f, 21.831f, 4.416f, 21.812f)
                curveTo(4.302f, 21.729f, 4.205f, 21.623f, 4.134f, 21.5f)
                curveTo(4.063f, 21.377f, 4.019f, 21.24f, 4.005f, 21.1f)
                curveTo(4.004f, 21.092f, 4.004f, 21.085f, 4.003f, 21.078f)
                curveTo(3.988f, 20.883f, 4.029f, 20.682f, 4.134f, 20.5f)
                lineTo(6.384f, 16.603f)
                lineTo(8.116f, 17.603f)
                lineTo(6.732f, 20.0f)
                close()
            }
        }
        .build()
        return _radarFill!!
    }

private var _radarFill: ImageVector? = null
