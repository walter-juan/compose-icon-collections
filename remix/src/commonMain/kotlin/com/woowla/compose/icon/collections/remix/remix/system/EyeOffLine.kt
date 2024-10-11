package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.EyeOffLine: ImageVector
    get() {
        if (_eyeOffLine != null) {
            return _eyeOffLine!!
        }
        _eyeOffLine = Builder(name = "EyeOffLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.883f, 19.297f)
                curveTo(16.181f, 20.375f, 14.164f, 21.0f, 12.0f, 21.0f)
                curveTo(6.608f, 21.0f, 2.122f, 17.12f, 1.182f, 12.0f)
                curveTo(1.618f, 9.623f, 2.819f, 7.513f, 4.52f, 5.935f)
                lineTo(1.394f, 2.808f)
                lineTo(2.808f, 1.394f)
                lineTo(22.607f, 21.192f)
                lineTo(21.193f, 22.607f)
                lineTo(17.883f, 19.297f)
                close()
                moveTo(5.936f, 7.35f)
                curveTo(4.607f, 8.56f, 3.638f, 10.167f, 3.223f, 12.0f)
                curveTo(4.14f, 16.052f, 7.765f, 19.0f, 12.0f, 19.0f)
                curveTo(13.6f, 19.0f, 15.112f, 18.58f, 16.424f, 17.838f)
                lineTo(14.396f, 15.81f)
                curveTo(13.702f, 16.247f, 12.881f, 16.5f, 12.0f, 16.5f)
                curveTo(9.515f, 16.5f, 7.5f, 14.485f, 7.5f, 12.0f)
                curveTo(7.5f, 11.12f, 7.753f, 10.298f, 8.19f, 9.604f)
                lineTo(5.936f, 7.35f)
                close()
                moveTo(12.914f, 14.328f)
                lineTo(9.672f, 11.087f)
                curveTo(9.561f, 11.37f, 9.5f, 11.678f, 9.5f, 12.0f)
                curveTo(9.5f, 13.381f, 10.62f, 14.5f, 12.0f, 14.5f)
                curveTo(12.323f, 14.5f, 12.631f, 14.439f, 12.914f, 14.328f)
                close()
                moveTo(20.807f, 16.593f)
                lineTo(19.376f, 15.162f)
                curveTo(20.032f, 14.227f, 20.515f, 13.159f, 20.778f, 12.0f)
                curveTo(19.86f, 7.948f, 16.236f, 5.0f, 12.0f, 5.0f)
                curveTo(11.154f, 5.0f, 10.333f, 5.118f, 9.552f, 5.338f)
                lineTo(7.974f, 3.76f)
                curveTo(9.221f, 3.27f, 10.579f, 3.0f, 12.0f, 3.0f)
                curveTo(17.392f, 3.0f, 21.878f, 6.88f, 22.819f, 12.0f)
                curveTo(22.507f, 13.7f, 21.804f, 15.263f, 20.807f, 16.593f)
                close()
                moveTo(11.723f, 7.509f)
                curveTo(11.815f, 7.503f, 11.907f, 7.5f, 12.0f, 7.5f)
                curveTo(14.486f, 7.5f, 16.5f, 9.515f, 16.5f, 12.0f)
                curveTo(16.5f, 12.093f, 16.497f, 12.186f, 16.492f, 12.278f)
                lineTo(11.723f, 7.509f)
                close()
            }
        }
        .build()
        return _eyeOffLine!!
    }

private var _eyeOffLine: ImageVector? = null
