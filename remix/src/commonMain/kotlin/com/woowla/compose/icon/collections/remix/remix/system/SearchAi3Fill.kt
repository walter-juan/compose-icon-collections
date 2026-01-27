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

public val SystemGroup.SearchAi3Fill: ImageVector
    get() {
        if (_searchAi3Fill != null) {
            return _searchAi3Fill!!
        }
        _searchAi3Fill = Builder(name = "SearchAi3Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                curveTo(15.968f, 2.0f, 20.0f, 6.032f, 20.0f, 11.0f)
                curveTo(20.0f, 13.124f, 19.263f, 15.077f, 18.031f, 16.617f)
                lineTo(22.313f, 20.899f)
                lineTo(20.899f, 22.313f)
                lineTo(16.617f, 18.031f)
                curveTo(15.077f, 19.263f, 13.124f, 20.0f, 11.0f, 20.0f)
                curveTo(6.032f, 20.0f, 2.0f, 15.968f, 2.0f, 11.0f)
                curveTo(2.0f, 6.032f, 6.032f, 2.0f, 11.0f, 2.0f)
                close()
                moveTo(11.471f, 7.318f)
                curveTo(11.294f, 6.893f, 10.706f, 6.893f, 10.529f, 7.318f)
                lineTo(10.276f, 7.93f)
                curveTo(9.844f, 8.972f, 9.038f, 9.805f, 8.025f, 10.256f)
                lineTo(7.308f, 10.575f)
                curveTo(6.897f, 10.758f, 6.897f, 11.355f, 7.308f, 11.538f)
                lineTo(8.067f, 11.876f)
                curveTo(9.055f, 12.315f, 9.848f, 13.118f, 10.287f, 14.127f)
                lineTo(10.533f, 14.692f)
                curveTo(10.714f, 15.106f, 11.286f, 15.106f, 11.467f, 14.692f)
                lineTo(11.714f, 14.127f)
                curveTo(12.153f, 13.118f, 12.945f, 12.315f, 13.933f, 11.876f)
                lineTo(14.692f, 11.538f)
                curveTo(15.103f, 11.355f, 15.103f, 10.758f, 14.692f, 10.575f)
                lineTo(13.975f, 10.256f)
                curveTo(12.962f, 9.805f, 12.156f, 8.972f, 11.724f, 7.93f)
                lineTo(11.471f, 7.318f)
                close()
            }
        }
        .build()
        return _searchAi3Fill!!
    }

private var _searchAi3Fill: ImageVector? = null
