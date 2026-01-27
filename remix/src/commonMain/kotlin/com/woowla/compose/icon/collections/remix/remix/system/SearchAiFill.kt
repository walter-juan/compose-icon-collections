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

public val SystemGroup.SearchAiFill: ImageVector
    get() {
        if (_searchAiFill != null) {
            return _searchAiFill!!
        }
        _searchAiFill = Builder(name = "SearchAiFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                curveTo(11.264f, 2.0f, 11.525f, 2.014f, 11.783f, 2.036f)
                curveTo(11.285f, 2.91f, 11.0f, 3.922f, 11.0f, 5.0f)
                curveTo(11.0f, 8.314f, 13.686f, 11.0f, 17.0f, 11.0f)
                curveTo(18.078f, 11.0f, 19.088f, 10.713f, 19.963f, 10.216f)
                curveTo(19.985f, 10.474f, 20.0f, 10.736f, 20.0f, 11.0f)
                curveTo(20.0f, 13.124f, 19.263f, 15.077f, 18.031f, 16.617f)
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
                curveTo(18.156f, 2.973f, 18.962f, 3.806f, 19.975f, 4.257f)
                lineTo(20.692f, 4.576f)
                curveTo(21.103f, 4.759f, 21.103f, 5.356f, 20.692f, 5.539f)
                lineTo(19.933f, 5.877f)
                curveTo(18.945f, 6.316f, 18.153f, 7.119f, 17.714f, 8.128f)
                lineTo(17.467f, 8.693f)
                curveTo(17.286f, 9.107f, 16.714f, 9.107f, 16.533f, 8.693f)
                lineTo(16.287f, 8.128f)
                curveTo(15.848f, 7.119f, 15.055f, 6.316f, 14.067f, 5.877f)
                lineTo(13.308f, 5.539f)
                curveTo(12.897f, 5.356f, 12.898f, 4.759f, 13.308f, 4.576f)
                lineTo(14.025f, 4.257f)
                curveTo(15.038f, 3.806f, 15.844f, 2.973f, 16.276f, 1.93f)
                lineTo(16.529f, 1.319f)
                close()
            }
        }
        .build()
        return _searchAiFill!!
    }

private var _searchAiFill: ImageVector? = null
