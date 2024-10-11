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

public val LogosGroup.SpectrumFill: ImageVector
    get() {
        if (_spectrumFill != null) {
            return _spectrumFill!!
        }
        _spectrumFill = Builder(name = "SpectrumFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2f, 2.006f)
                curveTo(21.241f, 2.093f, 22.001f, 3.25f, 22.001f, 12.0f)
                lineTo(21.995f, 13.199f)
                curveTo(21.908f, 21.241f, 20.751f, 22.0f, 12.001f, 22.0f)
                lineTo(10.802f, 21.994f)
                curveTo(3.143f, 21.911f, 2.089f, 20.858f, 2.007f, 13.199f)
                lineTo(2.001f, 11.691f)
                lineTo(2.007f, 10.801f)
                curveTo(2.092f, 2.951f, 3.196f, 2.04f, 11.389f, 2.001f)
                lineTo(13.2f, 2.006f)
                close()
                moveTo(8.251f, 7.0f)
                horizontalLineTo(7.667f)
                curveTo(7.333f, 7.0f, 7.056f, 7.247f, 7.008f, 7.568f)
                lineTo(7.001f, 7.667f)
                verticalLineTo(11.333f)
                curveTo(7.001f, 11.668f, 7.247f, 11.945f, 7.569f, 11.993f)
                lineTo(7.667f, 12.0f)
                horizontalLineTo(8.251f)
                curveTo(10.255f, 12.0f, 11.892f, 13.573f, 11.995f, 15.551f)
                lineTo(12.001f, 15.75f)
                verticalLineTo(16.333f)
                curveTo(12.001f, 16.668f, 12.247f, 16.945f, 12.569f, 16.993f)
                lineTo(12.667f, 17.0f)
                horizontalLineTo(16.334f)
                curveTo(16.669f, 17.0f, 16.946f, 16.753f, 16.993f, 16.432f)
                lineTo(17.001f, 16.333f)
                verticalLineTo(15.75f)
                curveTo(17.001f, 11.004f, 13.222f, 7.14f, 8.509f, 7.004f)
                lineTo(8.251f, 7.0f)
                close()
            }
        }
        .build()
        return _spectrumFill!!
    }

private var _spectrumFill: ImageVector? = null
