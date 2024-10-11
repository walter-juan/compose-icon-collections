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

public val MapGroup.MapPinUserFill: ImageVector
    get() {
        if (_mapPinUserFill != null) {
            return _mapPinUserFill!!
        }
        _mapPinUserFill = Builder(name = "MapPinUserFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.084f, 15.812f)
                curveTo(19.683f, 13.069f, 19.638f, 8.738f, 16.95f, 6.05f)
                curveTo(14.216f, 3.317f, 9.784f, 3.317f, 7.05f, 6.05f)
                curveTo(4.362f, 8.738f, 4.317f, 13.069f, 6.916f, 15.812f)
                curveTo(7.978f, 14.123f, 9.858f, 13.0f, 12.0f, 13.0f)
                curveTo(14.142f, 13.0f, 16.022f, 14.123f, 17.084f, 15.812f)
                close()
                moveTo(12.0f, 23.728f)
                lineTo(5.636f, 17.364f)
                curveTo(2.121f, 13.849f, 2.121f, 8.151f, 5.636f, 4.636f)
                curveTo(9.151f, 1.121f, 14.849f, 1.121f, 18.364f, 4.636f)
                curveTo(21.879f, 8.151f, 21.879f, 13.849f, 18.364f, 17.364f)
                lineTo(12.0f, 23.728f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(10.343f, 12.0f, 9.0f, 10.657f, 9.0f, 9.0f)
                curveTo(9.0f, 7.343f, 10.343f, 6.0f, 12.0f, 6.0f)
                curveTo(13.657f, 6.0f, 15.0f, 7.343f, 15.0f, 9.0f)
                curveTo(15.0f, 10.657f, 13.657f, 12.0f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _mapPinUserFill!!
    }

private var _mapPinUserFill: ImageVector? = null
