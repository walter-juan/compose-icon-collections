package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.MarkGithub24: ImageVector
    get() {
        if (_markGithub24 != null) {
            return _markGithub24!!
        }
        _markGithub24 = Builder(name = "MarkGithub24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveTo(5.923f, 1.0f, 1.0f, 5.923f, 1.0f, 12.0f)
                curveTo(1.0f, 16.868f, 4.149f, 20.979f, 8.521f, 22.436f)
                curveTo(9.071f, 22.532f, 9.278f, 22.202f, 9.278f, 21.914f)
                curveTo(9.278f, 21.653f, 9.264f, 20.786f, 9.264f, 19.865f)
                curveTo(6.5f, 20.374f, 5.785f, 19.191f, 5.565f, 18.573f)
                curveTo(5.441f, 18.256f, 4.905f, 17.28f, 4.438f, 17.019f)
                curveTo(4.052f, 16.813f, 3.503f, 16.304f, 4.424f, 16.29f)
                curveTo(5.29f, 16.276f, 5.909f, 17.087f, 6.115f, 17.417f)
                curveTo(7.105f, 19.081f, 8.686f, 18.614f, 9.319f, 18.325f)
                curveTo(9.415f, 17.61f, 9.704f, 17.129f, 10.02f, 16.854f)
                curveTo(7.573f, 16.579f, 5.015f, 15.63f, 5.015f, 11.422f)
                curveTo(5.015f, 10.226f, 5.441f, 9.236f, 6.142f, 8.466f)
                curveTo(6.032f, 8.191f, 5.648f, 7.064f, 6.253f, 5.551f)
                curveTo(6.253f, 5.551f, 7.174f, 5.262f, 9.278f, 6.679f)
                curveTo(10.158f, 6.431f, 11.092f, 6.307f, 12.028f, 6.307f)
                curveTo(12.962f, 6.307f, 13.898f, 6.431f, 14.778f, 6.679f)
                curveTo(16.881f, 5.249f, 17.802f, 5.551f, 17.802f, 5.551f)
                curveTo(18.407f, 7.064f, 18.022f, 8.191f, 17.913f, 8.466f)
                curveTo(18.614f, 9.236f, 19.04f, 10.212f, 19.04f, 11.422f)
                curveTo(19.04f, 15.644f, 16.469f, 16.579f, 14.021f, 16.854f)
                curveTo(14.42f, 17.198f, 14.764f, 17.858f, 14.764f, 18.889f)
                curveTo(14.764f, 20.36f, 14.75f, 21.542f, 14.75f, 21.914f)
                curveTo(14.75f, 22.202f, 14.956f, 22.546f, 15.506f, 22.436f)
                curveTo(19.851f, 20.979f, 23.0f, 16.854f, 23.0f, 12.0f)
                curveTo(23.0f, 5.923f, 18.077f, 1.0f, 12.0f, 1.0f)
                close()
            }
        }
        .build()
        return _markGithub24!!
    }

private var _markGithub24: ImageVector? = null
