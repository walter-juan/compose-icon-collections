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

public val LogosGroup.SpectrumLine: ImageVector
    get() {
        if (_spectrumLine != null) {
            return _spectrumLine!!
        }
        _spectrumLine = Builder(name = "SpectrumLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.389f, 2.001f)
                lineTo(13.2f, 2.006f)
                lineTo(14.043f, 2.02f)
                curveTo(21.205f, 2.185f, 21.982f, 3.532f, 22.0f, 11.687f)
                lineTo(21.995f, 13.199f)
                lineTo(21.981f, 14.043f)
                curveTo(21.816f, 21.204f, 20.469f, 21.981f, 12.314f, 22.0f)
                lineTo(10.802f, 21.994f)
                lineTo(9.914f, 21.979f)
                curveTo(3.06f, 21.816f, 2.086f, 20.552f, 2.007f, 13.199f)
                lineTo(2.001f, 11.691f)
                lineTo(2.007f, 10.801f)
                lineTo(2.021f, 9.936f)
                curveTo(2.186f, 2.883f, 3.507f, 2.039f, 11.389f, 2.001f)
                close()
                moveTo(14.12f, 4.009f)
                lineTo(10.883f, 4.001f)
                lineTo(9.561f, 4.011f)
                curveTo(4.072f, 4.093f, 4.017f, 4.832f, 4.002f, 11.414f)
                lineTo(4.003f, 13.589f)
                lineTo(4.013f, 14.63f)
                curveTo(4.101f, 19.611f, 4.806f, 19.972f, 10.412f, 19.998f)
                lineTo(13.867f, 19.997f)
                lineTo(14.643f, 19.987f)
                curveTo(19.751f, 19.896f, 19.989f, 19.15f, 20.0f, 13.11f)
                lineTo(19.998f, 10.368f)
                lineTo(19.986f, 9.312f)
                curveTo(19.892f, 4.516f, 19.201f, 4.063f, 14.12f, 4.009f)
                close()
                moveTo(8.251f, 7.0f)
                curveTo(13.083f, 7.0f, 17.001f, 10.918f, 17.001f, 15.75f)
                verticalLineTo(16.333f)
                curveTo(17.001f, 16.702f, 16.702f, 17.0f, 16.334f, 17.0f)
                horizontalLineTo(12.667f)
                curveTo(12.299f, 17.0f, 12.001f, 16.702f, 12.001f, 16.333f)
                verticalLineTo(15.75f)
                curveTo(12.001f, 13.679f, 10.322f, 12.0f, 8.251f, 12.0f)
                horizontalLineTo(7.667f)
                curveTo(7.299f, 12.0f, 7.001f, 11.702f, 7.001f, 11.333f)
                verticalLineTo(7.667f)
                curveTo(7.001f, 7.299f, 7.299f, 7.0f, 7.667f, 7.0f)
                horizontalLineTo(8.251f)
                close()
            }
        }
        .build()
        return _spectrumLine!!
    }

private var _spectrumLine: ImageVector? = null
