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

public val LogosGroup.FirefoxLine: ImageVector
    get() {
        if (_firefoxLine != null) {
            return _firefoxLine!!
        }
        _firefoxLine = Builder(name = "FirefoxLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 2.0f)
                curveTo(17.524f, 2.0f, 22.001f, 6.477f, 22.001f, 12.0f)
                curveTo(22.001f, 17.523f, 17.524f, 22.0f, 12.001f, 22.0f)
                curveTo(6.478f, 22.0f, 2.001f, 17.523f, 2.001f, 12.0f)
                curveTo(2.001f, 10.536f, 2.315f, 9.146f, 2.88f, 7.894f)
                curveTo(3.347f, 6.955f, 4.114f, 6.02f, 4.731f, 5.7f)
                curveTo(4.078f, 6.983f, 3.758f, 8.241f, 3.69f, 9.083f)
                curveTo(4.145f, 7.583f, 5.006f, 6.326f, 6.211f, 5.439f)
                curveTo(8.277f, 3.92f, 11.059f, 3.852f, 12.167f, 4.82f)
                curveTo(10.111f, 5.526f, 7.871f, 8.367f, 8.364f, 11.695f)
                curveTo(8.444f, 12.245f, 8.609f, 12.778f, 8.853f, 13.277f)
                curveTo(8.469f, 12.266f, 8.435f, 10.844f, 9.055f, 9.919f)
                curveTo(9.747f, 8.889f, 10.733f, 8.671f, 11.261f, 8.783f)
                curveTo(11.053f, 8.739f, 10.593f, 9.619f, 10.525f, 9.774f)
                curveTo(10.352f, 10.168f, 10.266f, 10.594f, 10.274f, 11.024f)
                curveTo(10.289f, 11.922f, 10.659f, 12.778f, 11.304f, 13.403f)
                curveTo(13.226f, 15.275f, 16.327f, 14.539f, 17.715f, 12.402f)
                curveTo(18.669f, 10.931f, 18.785f, 8.434f, 17.561f, 6.45f)
                curveTo(17.255f, 5.967f, 16.891f, 5.523f, 16.477f, 5.129f)
                curveTo(14.626f, 3.364f, 11.998f, 2.561f, 9.495f, 2.925f)
                curveTo(8.389f, 3.102f, 7.448f, 3.421f, 6.671f, 3.881f)
                curveTo(7.756f, 2.798f, 9.912f, 2.0f, 12.001f, 2.0f)
                close()
                moveTo(6.876f, 7.705f)
                curveTo(4.623f, 8.486f, 3.375f, 10.875f, 4.297f, 14.165f)
                curveTo(5.22f, 17.455f, 8.194f, 19.887f, 11.752f, 19.996f)
                lineTo(12.001f, 20.0f)
                curveTo(16.253f, 20.0f, 19.729f, 16.684f, 19.986f, 12.497f)
                lineTo(19.995f, 12.284f)
                curveTo(19.865f, 12.633f, 19.712f, 12.958f, 19.532f, 13.265f)
                lineTo(19.392f, 13.491f)
                curveTo(17.288f, 16.73f, 12.711f, 17.566f, 9.912f, 14.839f)
                curveTo(9.527f, 14.466f, 9.204f, 14.042f, 8.95f, 13.582f)
                lineTo(8.844f, 13.381f)
                curveTo(7.108f, 12.994f, 6.26f, 12.055f, 6.301f, 10.564f)
                curveTo(6.328f, 9.573f, 6.532f, 8.605f, 6.876f, 7.705f)
                close()
            }
        }
        .build()
        return _firefoxLine!!
    }

private var _firefoxLine: ImageVector? = null
