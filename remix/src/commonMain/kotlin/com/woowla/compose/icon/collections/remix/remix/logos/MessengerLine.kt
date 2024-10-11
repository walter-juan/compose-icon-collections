package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.MessengerLine: ImageVector
    get() {
        if (_messengerLine != null) {
            return _messengerLine!!
        }
        _messengerLine = Builder(name = "MessengerLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.765f, 19.225f)
                curveTo(8.354f, 18.965f, 9.015f, 18.916f, 9.633f, 19.086f)
                curveTo(10.403f, 19.296f, 11.198f, 19.402f, 12.001f, 19.4f)
                curveTo(16.586f, 19.4f, 20.001f, 16.114f, 20.001f, 11.7f)
                curveTo(20.001f, 7.287f, 16.586f, 4.0f, 12.001f, 4.0f)
                curveTo(7.416f, 4.0f, 4.001f, 7.287f, 4.001f, 11.7f)
                curveTo(4.001f, 13.97f, 4.897f, 15.972f, 6.467f, 17.376f)
                curveTo(7.042f, 17.885f, 7.383f, 18.608f, 7.409f, 19.382f)
                lineTo(7.765f, 19.225f)
                close()
                moveTo(12.001f, 2.0f)
                curveTo(17.635f, 2.0f, 22.001f, 6.127f, 22.001f, 11.7f)
                curveTo(22.001f, 17.274f, 17.635f, 21.4f, 12.001f, 21.4f)
                curveTo(11.023f, 21.402f, 10.05f, 21.273f, 9.106f, 21.015f)
                curveTo(8.929f, 20.967f, 8.74f, 20.981f, 8.572f, 21.055f)
                lineTo(6.587f, 21.931f)
                curveTo(6.344f, 22.039f, 6.063f, 22.018f, 5.838f, 21.876f)
                curveTo(5.612f, 21.734f, 5.473f, 21.49f, 5.464f, 21.223f)
                lineTo(5.41f, 19.444f)
                curveTo(5.403f, 19.226f, 5.305f, 19.02f, 5.141f, 18.875f)
                curveTo(3.196f, 17.135f, 2.001f, 14.616f, 2.001f, 11.7f)
                curveTo(2.001f, 6.127f, 6.367f, 2.0f, 12.001f, 2.0f)
                close()
                moveTo(5.996f, 14.536f)
                lineTo(8.933f, 9.877f)
                curveTo(9.157f, 9.522f, 9.518f, 9.277f, 9.93f, 9.201f)
                curveTo(10.342f, 9.125f, 10.767f, 9.225f, 11.102f, 9.476f)
                lineTo(13.439f, 11.226f)
                curveTo(13.653f, 11.388f, 13.948f, 11.388f, 14.161f, 11.226f)
                lineTo(17.317f, 8.832f)
                curveTo(17.738f, 8.512f, 18.288f, 9.016f, 18.006f, 9.464f)
                lineTo(15.068f, 14.123f)
                curveTo(14.845f, 14.478f, 14.484f, 14.723f, 14.072f, 14.799f)
                curveTo(13.66f, 14.875f, 13.235f, 14.775f, 12.899f, 14.524f)
                lineTo(10.563f, 12.774f)
                curveTo(10.349f, 12.612f, 10.054f, 12.612f, 9.84f, 12.774f)
                lineTo(6.685f, 15.168f)
                curveTo(6.264f, 15.488f, 5.714f, 14.984f, 5.996f, 14.536f)
                close()
            }
        }
        .build()
        return _messengerLine!!
    }

private var _messengerLine: ImageVector? = null
