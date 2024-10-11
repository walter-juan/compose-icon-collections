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

public val SystemGroup.EyeCloseFill: ImageVector
    get() {
        if (_eyeCloseFill != null) {
            return _eyeCloseFill!!
        }
        _eyeCloseFill = Builder(name = "EyeCloseFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.13f, 15.842f)
                lineTo(9.343f, 18.782f)
                lineTo(7.411f, 18.264f)
                lineTo(8.198f, 15.326f)
                curveTo(7.009f, 14.888f, 5.917f, 14.25f, 4.961f, 13.454f)
                lineTo(2.808f, 15.607f)
                lineTo(1.394f, 14.193f)
                lineTo(3.547f, 12.039f)
                curveTo(2.356f, 10.611f, 1.52f, 8.875f, 1.176f, 6.968f)
                lineTo(2.076f, 6.805f)
                curveTo(4.869f, 8.816f, 8.296f, 10.0f, 12.0f, 10.0f)
                curveTo(15.704f, 10.0f, 19.132f, 8.816f, 21.924f, 6.805f)
                lineTo(22.825f, 6.968f)
                curveTo(22.48f, 8.875f, 21.645f, 10.611f, 20.454f, 12.039f)
                lineTo(22.607f, 14.193f)
                lineTo(21.193f, 15.607f)
                lineTo(19.039f, 13.454f)
                curveTo(18.084f, 14.25f, 16.991f, 14.888f, 15.802f, 15.326f)
                lineTo(16.59f, 18.264f)
                lineTo(14.658f, 18.782f)
                lineTo(13.87f, 15.842f)
                curveTo(13.262f, 15.946f, 12.638f, 16.0f, 12.0f, 16.0f)
                curveTo(11.363f, 16.0f, 10.738f, 15.946f, 10.13f, 15.842f)
                close()
            }
        }
        .build()
        return _eyeCloseFill!!
    }

private var _eyeCloseFill: ImageVector? = null
