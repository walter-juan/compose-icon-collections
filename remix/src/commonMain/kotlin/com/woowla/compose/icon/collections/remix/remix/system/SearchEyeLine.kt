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

public val SystemGroup.SearchEyeLine: ImageVector
    get() {
        if (_searchEyeLine != null) {
            return _searchEyeLine!!
        }
        _searchEyeLine = Builder(name = "SearchEyeLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.031f, 16.617f)
                lineTo(22.314f, 20.899f)
                lineTo(20.899f, 22.314f)
                lineTo(16.617f, 18.031f)
                curveTo(15.077f, 19.263f, 13.124f, 20.0f, 11.0f, 20.0f)
                curveTo(6.032f, 20.0f, 2.0f, 15.968f, 2.0f, 11.0f)
                curveTo(2.0f, 6.032f, 6.032f, 2.0f, 11.0f, 2.0f)
                curveTo(15.968f, 2.0f, 20.0f, 6.032f, 20.0f, 11.0f)
                curveTo(20.0f, 13.124f, 19.263f, 15.077f, 18.031f, 16.617f)
                close()
                moveTo(16.025f, 15.875f)
                curveTo(17.247f, 14.615f, 18.0f, 12.896f, 18.0f, 11.0f)
                curveTo(18.0f, 7.133f, 14.868f, 4.0f, 11.0f, 4.0f)
                curveTo(7.133f, 4.0f, 4.0f, 7.133f, 4.0f, 11.0f)
                curveTo(4.0f, 14.868f, 7.133f, 18.0f, 11.0f, 18.0f)
                curveTo(12.896f, 18.0f, 14.615f, 17.247f, 15.875f, 16.025f)
                lineTo(16.025f, 15.875f)
                close()
                moveTo(12.178f, 7.176f)
                curveTo(11.483f, 7.49f, 11.0f, 8.188f, 11.0f, 9.0f)
                curveTo(11.0f, 10.105f, 11.895f, 11.0f, 13.0f, 11.0f)
                curveTo(13.811f, 11.0f, 14.51f, 10.517f, 14.824f, 9.822f)
                curveTo(14.938f, 10.194f, 15.0f, 10.59f, 15.0f, 11.0f)
                curveTo(15.0f, 13.209f, 13.209f, 15.0f, 11.0f, 15.0f)
                curveTo(8.791f, 15.0f, 7.0f, 13.209f, 7.0f, 11.0f)
                curveTo(7.0f, 8.791f, 8.791f, 7.0f, 11.0f, 7.0f)
                curveTo(11.41f, 7.0f, 11.806f, 7.062f, 12.178f, 7.176f)
                close()
            }
        }
        .build()
        return _searchEyeLine!!
    }

private var _searchEyeLine: ImageVector? = null
