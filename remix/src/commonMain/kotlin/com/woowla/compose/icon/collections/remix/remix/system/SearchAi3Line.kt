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

public val SystemGroup.SearchAi3Line: ImageVector
    get() {
        if (_searchAi3Line != null) {
            return _searchAi3Line!!
        }
        _searchAi3Line = Builder(name = "SearchAi3Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                curveTo(15.968f, 2.0f, 20.0f, 6.032f, 20.0f, 11.0f)
                curveTo(20.0f, 13.124f, 19.263f, 15.077f, 18.031f, 16.617f)
                lineTo(22.313f, 20.899f)
                lineTo(20.899f, 22.314f)
                lineTo(16.617f, 18.031f)
                curveTo(15.077f, 19.263f, 13.124f, 20.0f, 11.0f, 20.0f)
                curveTo(6.032f, 20.0f, 2.0f, 15.968f, 2.0f, 11.0f)
                curveTo(2.0f, 6.032f, 6.032f, 2.0f, 11.0f, 2.0f)
                close()
                moveTo(11.0f, 4.0f)
                curveTo(7.133f, 4.0f, 4.0f, 7.132f, 4.0f, 11.0f)
                curveTo(4.0f, 14.867f, 7.133f, 18.0f, 11.0f, 18.0f)
                curveTo(12.896f, 18.0f, 14.615f, 17.248f, 15.875f, 16.025f)
                lineTo(16.024f, 15.875f)
                curveTo(17.247f, 14.615f, 18.0f, 12.895f, 18.0f, 11.0f)
                curveTo(18.0f, 7.132f, 14.867f, 4.0f, 11.0f, 4.0f)
                close()
                moveTo(10.529f, 7.319f)
                curveTo(10.706f, 6.893f, 11.294f, 6.893f, 11.471f, 7.319f)
                lineTo(11.724f, 7.93f)
                curveTo(12.156f, 8.973f, 12.962f, 9.806f, 13.975f, 10.257f)
                lineTo(14.692f, 10.576f)
                curveTo(15.103f, 10.759f, 15.103f, 11.356f, 14.692f, 11.539f)
                lineTo(13.933f, 11.877f)
                curveTo(12.945f, 12.316f, 12.153f, 13.119f, 11.714f, 14.128f)
                lineTo(11.467f, 14.693f)
                curveTo(11.286f, 15.107f, 10.714f, 15.107f, 10.533f, 14.693f)
                lineTo(10.287f, 14.128f)
                curveTo(9.848f, 13.119f, 9.055f, 12.316f, 8.067f, 11.877f)
                lineTo(7.308f, 11.539f)
                curveTo(6.897f, 11.356f, 6.897f, 10.759f, 7.308f, 10.576f)
                lineTo(8.025f, 10.257f)
                curveTo(9.038f, 9.806f, 9.844f, 8.973f, 10.276f, 7.93f)
                lineTo(10.529f, 7.319f)
                close()
            }
        }
        .build()
        return _searchAi3Line!!
    }

private var _searchAi3Line: ImageVector? = null
