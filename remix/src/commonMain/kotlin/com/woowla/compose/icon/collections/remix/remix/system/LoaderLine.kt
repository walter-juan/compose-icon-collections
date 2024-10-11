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

public val SystemGroup.LoaderLine: ImageVector
    get() {
        if (_loaderLine != null) {
            return _loaderLine!!
        }
        _loaderLine = Builder(name = "LoaderLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(12.552f, 2.0f, 13.0f, 2.448f, 13.0f, 3.0f)
                verticalLineTo(6.0f)
                curveTo(13.0f, 6.552f, 12.552f, 7.0f, 12.0f, 7.0f)
                curveTo(11.447f, 7.0f, 11.0f, 6.552f, 11.0f, 6.0f)
                verticalLineTo(3.0f)
                curveTo(11.0f, 2.448f, 11.447f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveTo(12.552f, 17.0f, 13.0f, 17.448f, 13.0f, 18.0f)
                verticalLineTo(21.0f)
                curveTo(13.0f, 21.552f, 12.552f, 22.0f, 12.0f, 22.0f)
                curveTo(11.447f, 22.0f, 11.0f, 21.552f, 11.0f, 21.0f)
                verticalLineTo(18.0f)
                curveTo(11.0f, 17.448f, 11.447f, 17.0f, 12.0f, 17.0f)
                close()
                moveTo(20.66f, 7.0f)
                curveTo(20.936f, 7.478f, 20.772f, 8.09f, 20.294f, 8.366f)
                lineTo(17.696f, 9.866f)
                curveTo(17.217f, 10.142f, 16.606f, 9.978f, 16.33f, 9.5f)
                curveTo(16.053f, 9.022f, 16.217f, 8.41f, 16.696f, 8.134f)
                lineTo(19.294f, 6.634f)
                curveTo(19.772f, 6.358f, 20.384f, 6.522f, 20.66f, 7.0f)
                close()
                moveTo(7.669f, 14.5f)
                curveTo(7.945f, 14.978f, 7.782f, 15.59f, 7.303f, 15.866f)
                lineTo(4.705f, 17.366f)
                curveTo(4.227f, 17.642f, 3.615f, 17.478f, 3.339f, 17.0f)
                curveTo(3.063f, 16.522f, 3.227f, 15.91f, 3.705f, 15.634f)
                lineTo(6.303f, 14.134f)
                curveTo(6.782f, 13.858f, 7.393f, 14.022f, 7.669f, 14.5f)
                close()
                moveTo(20.66f, 17.0f)
                curveTo(20.384f, 17.478f, 19.772f, 17.642f, 19.294f, 17.366f)
                lineTo(16.696f, 15.866f)
                curveTo(16.217f, 15.59f, 16.053f, 14.978f, 16.33f, 14.5f)
                curveTo(16.606f, 14.022f, 17.217f, 13.858f, 17.696f, 14.134f)
                lineTo(20.294f, 15.634f)
                curveTo(20.772f, 15.91f, 20.936f, 16.522f, 20.66f, 17.0f)
                close()
                moveTo(7.669f, 9.5f)
                curveTo(7.393f, 9.978f, 6.782f, 10.142f, 6.303f, 9.866f)
                lineTo(3.705f, 8.366f)
                curveTo(3.227f, 8.09f, 3.063f, 7.478f, 3.339f, 7.0f)
                curveTo(3.615f, 6.522f, 4.227f, 6.358f, 4.705f, 6.634f)
                lineTo(7.303f, 8.134f)
                curveTo(7.782f, 8.41f, 7.945f, 9.022f, 7.669f, 9.5f)
                close()
            }
        }
        .build()
        return _loaderLine!!
    }

private var _loaderLine: ImageVector? = null
