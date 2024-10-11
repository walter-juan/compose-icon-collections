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

public val LogosGroup.OpenSourceLine: ImageVector
    get() {
        if (_openSourceLine != null) {
            return _openSourceLine!!
        }
        _openSourceLine = Builder(name = "OpenSourceLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 2.0f)
                curveTo(17.524f, 2.0f, 22.001f, 6.477f, 22.001f, 12.0f)
                curveTo(22.001f, 16.4f, 19.16f, 20.135f, 15.212f, 21.473f)
                lineTo(14.986f, 21.547f)
                lineTo(12.082f, 13.997f)
                curveTo(13.151f, 13.95f, 14.001f, 13.054f, 14.001f, 12.0f)
                curveTo(14.001f, 10.895f, 13.106f, 10.0f, 12.001f, 10.0f)
                curveTo(10.896f, 10.0f, 10.001f, 10.895f, 10.001f, 12.0f)
                curveTo(10.001f, 13.077f, 10.852f, 13.955f, 11.918f, 13.998f)
                lineTo(9.015f, 21.547f)
                lineTo(8.79f, 21.473f)
                curveTo(4.842f, 20.135f, 2.001f, 16.4f, 2.001f, 12.0f)
                curveTo(2.001f, 6.477f, 6.478f, 2.0f, 12.001f, 2.0f)
                close()
                moveTo(12.001f, 4.0f)
                curveTo(7.583f, 4.0f, 4.001f, 7.582f, 4.001f, 12.0f)
                curveTo(4.001f, 14.92f, 5.565f, 17.475f, 7.902f, 18.872f)
                lineTo(9.381f, 15.023f)
                curveTo(8.536f, 14.29f, 8.001f, 13.207f, 8.001f, 12.0f)
                curveTo(8.001f, 9.791f, 9.792f, 8.0f, 12.001f, 8.0f)
                curveTo(14.21f, 8.0f, 16.001f, 9.791f, 16.001f, 12.0f)
                curveTo(16.001f, 13.208f, 15.466f, 14.29f, 14.62f, 15.023f)
                curveTo(15.186f, 16.497f, 15.68f, 17.78f, 16.1f, 18.873f)
                curveTo(18.436f, 17.475f, 20.001f, 14.92f, 20.001f, 12.0f)
                curveTo(20.001f, 7.582f, 16.419f, 4.0f, 12.001f, 4.0f)
                close()
            }
        }
        .build()
        return _openSourceLine!!
    }

private var _openSourceLine: ImageVector? = null
