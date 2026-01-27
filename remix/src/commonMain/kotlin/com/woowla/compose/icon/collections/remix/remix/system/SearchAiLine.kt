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

public val SystemGroup.SearchAiLine: ImageVector
    get() {
        if (_searchAiLine != null) {
            return _searchAiLine!!
        }
        _searchAiLine = Builder(name = "SearchAiLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                curveTo(11.264f, 2.0f, 11.525f, 2.013f, 11.783f, 2.036f)
                curveTo(11.442f, 2.634f, 11.202f, 3.297f, 11.084f, 4.002f)
                curveTo(11.056f, 4.001f, 11.028f, 4.0f, 11.0f, 4.0f)
                curveTo(7.133f, 4.0f, 4.0f, 7.132f, 4.0f, 11.0f)
                curveTo(4.0f, 14.867f, 7.133f, 18.0f, 11.0f, 18.0f)
                curveTo(12.896f, 18.0f, 14.615f, 17.247f, 15.875f, 16.024f)
                lineTo(16.024f, 15.875f)
                curveTo(17.247f, 14.615f, 18.0f, 12.895f, 18.0f, 11.0f)
                curveTo(18.0f, 10.971f, 17.997f, 10.943f, 17.997f, 10.915f)
                curveTo(18.702f, 10.797f, 19.364f, 10.556f, 19.963f, 10.215f)
                curveTo(19.985f, 10.474f, 20.0f, 10.736f, 20.0f, 11.0f)
                curveTo(20.0f, 13.123f, 19.263f, 15.077f, 18.031f, 16.617f)
                lineTo(22.313f, 20.899f)
                lineTo(20.899f, 22.313f)
                lineTo(16.617f, 18.031f)
                curveTo(15.077f, 19.263f, 13.124f, 20.0f, 11.0f, 20.0f)
                curveTo(6.032f, 20.0f, 2.0f, 15.968f, 2.0f, 11.0f)
                curveTo(2.0f, 6.032f, 6.032f, 2.0f, 11.0f, 2.0f)
                close()
                moveTo(16.529f, 1.319f)
                curveTo(16.706f, 0.893f, 17.294f, 0.893f, 17.471f, 1.319f)
                lineTo(17.724f, 1.93f)
                curveTo(18.156f, 2.973f, 18.962f, 3.806f, 19.975f, 4.256f)
                lineTo(20.692f, 4.576f)
                curveTo(21.103f, 4.759f, 21.103f, 5.356f, 20.692f, 5.539f)
                lineTo(19.933f, 5.877f)
                curveTo(18.945f, 6.316f, 18.153f, 7.119f, 17.714f, 8.128f)
                lineTo(17.467f, 8.693f)
                curveTo(17.286f, 9.107f, 16.714f, 9.107f, 16.533f, 8.693f)
                lineTo(16.287f, 8.128f)
                curveTo(15.848f, 7.119f, 15.055f, 6.316f, 14.067f, 5.877f)
                lineTo(13.308f, 5.539f)
                curveTo(12.897f, 5.356f, 12.897f, 4.759f, 13.308f, 4.576f)
                lineTo(14.025f, 4.256f)
                curveTo(15.038f, 3.806f, 15.844f, 2.973f, 16.276f, 1.93f)
                lineTo(16.529f, 1.319f)
                close()
            }
        }
        .build()
        return _searchAiLine!!
    }

private var _searchAiLine: ImageVector? = null
