package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.MapPin2Fill: ImageVector
    get() {
        if (_mapPin2Fill != null) {
            return _mapPin2Fill!!
        }
        _mapPin2Fill = Builder(name = "MapPin2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.364f, 17.364f)
                lineTo(12.0f, 23.728f)
                lineTo(5.636f, 17.364f)
                curveTo(2.121f, 13.849f, 2.121f, 8.151f, 5.636f, 4.636f)
                curveTo(9.151f, 1.121f, 14.849f, 1.121f, 18.364f, 4.636f)
                curveTo(21.879f, 8.151f, 21.879f, 13.849f, 18.364f, 17.364f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(13.105f, 13.0f, 14.0f, 12.105f, 14.0f, 11.0f)
                curveTo(14.0f, 9.895f, 13.105f, 9.0f, 12.0f, 9.0f)
                curveTo(10.895f, 9.0f, 10.0f, 9.895f, 10.0f, 11.0f)
                curveTo(10.0f, 12.105f, 10.895f, 13.0f, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _mapPin2Fill!!
    }

private var _mapPin2Fill: ImageVector? = null
