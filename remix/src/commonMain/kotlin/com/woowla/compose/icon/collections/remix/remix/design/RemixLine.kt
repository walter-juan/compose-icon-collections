package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.RemixLine: ImageVector
    get() {
        if (_remixLine != null) {
            return _remixLine!!
        }
        _remixLine = Builder(name = "RemixLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.512f, 2.0f, 21.982f, 6.46f, 21.999f, 11.968f)
                curveTo(21.999f, 11.975f, 21.999f, 11.981f, 21.999f, 11.988f)
                curveTo(21.999f, 11.992f, 22.0f, 11.996f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(10.075f, 4.0f, 8.309f, 4.68f, 6.929f, 5.813f)
                curveTo(7.584f, 5.61f, 8.28f, 5.5f, 9.0f, 5.5f)
                curveTo(12.866f, 5.5f, 16.0f, 8.634f, 16.0f, 12.5f)
                curveTo(16.0f, 13.052f, 15.552f, 13.5f, 15.0f, 13.5f)
                curveTo(14.448f, 13.5f, 14.0f, 13.052f, 14.0f, 12.5f)
                curveTo(14.0f, 9.739f, 11.761f, 7.5f, 9.0f, 7.5f)
                curveTo(6.389f, 7.5f, 4.231f, 9.501f, 4.001f, 12.043f)
                curveTo(4.024f, 16.441f, 7.596f, 20.0f, 12.0f, 20.0f)
                curveTo(13.925f, 20.0f, 15.69f, 19.319f, 17.07f, 18.187f)
                curveTo(16.415f, 18.389f, 15.72f, 18.5f, 15.0f, 18.5f)
                curveTo(11.134f, 18.5f, 8.0f, 15.366f, 8.0f, 11.5f)
                curveTo(8.0f, 10.948f, 8.448f, 10.5f, 9.0f, 10.5f)
                curveTo(9.552f, 10.5f, 10.0f, 10.948f, 10.0f, 11.5f)
                curveTo(10.0f, 14.261f, 12.239f, 16.5f, 15.0f, 16.5f)
                curveTo(17.612f, 16.5f, 19.768f, 14.499f, 19.998f, 11.956f)
                curveTo(19.974f, 7.558f, 16.404f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _remixLine!!
    }

private var _remixLine: ImageVector? = null
