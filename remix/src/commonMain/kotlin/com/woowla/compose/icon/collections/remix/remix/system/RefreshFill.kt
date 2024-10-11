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

public val SystemGroup.RefreshFill: ImageVector
    get() {
        if (_refreshFill != null) {
            return _refreshFill!!
        }
        _refreshFill = Builder(name = "RefreshFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(16.82f, 17.076f)
                curveTo(18.163f, 15.801f, 19.0f, 13.998f, 19.0f, 12.0f)
                curveTo(19.0f, 8.134f, 15.866f, 5.0f, 12.0f, 5.0f)
                curveTo(10.939f, 5.0f, 9.933f, 5.236f, 9.032f, 5.658f)
                lineTo(10.007f, 7.413f)
                curveTo(10.618f, 7.147f, 11.292f, 7.0f, 12.0f, 7.0f)
                curveTo(14.761f, 7.0f, 17.0f, 9.239f, 17.0f, 12.0f)
                horizontalLineTo(14.0f)
                lineTo(16.82f, 17.076f)
                close()
                moveTo(14.968f, 18.342f)
                lineTo(13.993f, 16.587f)
                curveTo(13.382f, 16.853f, 12.708f, 17.0f, 12.0f, 17.0f)
                curveTo(9.239f, 17.0f, 7.0f, 14.761f, 7.0f, 12.0f)
                horizontalLineTo(10.0f)
                lineTo(7.18f, 6.924f)
                curveTo(5.837f, 8.199f, 5.0f, 10.002f, 5.0f, 12.0f)
                curveTo(5.0f, 15.866f, 8.134f, 19.0f, 12.0f, 19.0f)
                curveTo(13.061f, 19.0f, 14.067f, 18.764f, 14.968f, 18.342f)
                close()
            }
        }
        .build()
        return _refreshFill!!
    }

private var _refreshFill: ImageVector? = null
