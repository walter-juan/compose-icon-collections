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

public val DesignGroup.Contrast2Line: ImageVector
    get() {
        if (_contrast2Line != null) {
            return _contrast2Line!!
        }
        _contrast2Line = Builder(name = "Contrast2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.997f)
                curveTo(6.477f, 21.997f, 2.0f, 17.52f, 2.0f, 11.997f)
                curveTo(2.0f, 6.474f, 6.477f, 1.997f, 12.0f, 1.997f)
                curveTo(17.523f, 1.997f, 22.0f, 6.474f, 22.0f, 11.997f)
                curveTo(22.0f, 17.52f, 17.523f, 21.997f, 12.0f, 21.997f)
                close()
                moveTo(12.0f, 19.997f)
                curveTo(16.418f, 19.997f, 20.0f, 16.415f, 20.0f, 11.997f)
                curveTo(20.0f, 7.578f, 16.418f, 3.997f, 12.0f, 3.997f)
                curveTo(7.582f, 3.997f, 4.0f, 7.578f, 4.0f, 11.997f)
                curveTo(4.0f, 16.415f, 7.582f, 19.997f, 12.0f, 19.997f)
                close()
                moveTo(7.0f, 15.316f)
                curveTo(9.08f, 15.165f, 11.117f, 14.294f, 12.707f, 12.704f)
                curveTo(14.297f, 11.114f, 15.168f, 9.077f, 15.319f, 6.997f)
                curveTo(15.645f, 7.214f, 15.955f, 7.466f, 16.243f, 7.754f)
                curveTo(18.586f, 10.097f, 18.586f, 13.896f, 16.243f, 16.239f)
                curveTo(13.899f, 18.583f, 10.101f, 18.583f, 7.757f, 16.239f)
                curveTo(7.47f, 15.952f, 7.217f, 15.642f, 7.0f, 15.316f)
                close()
            }
        }
        .build()
        return _contrast2Line!!
    }

private var _contrast2Line: ImageVector? = null
