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

public val SystemGroup.Settings4Fill: ImageVector
    get() {
        if (_settings4Fill != null) {
            return _settings4Fill!!
        }
        _settings4Fill = Builder(name = "Settings4Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.334f, 4.545f)
                curveTo(6.349f, 3.636f, 7.551f, 2.932f, 8.876f, 2.497f)
                curveTo(9.609f, 3.413f, 10.736f, 3.999f, 12.0f, 3.999f)
                curveTo(13.264f, 3.999f, 14.391f, 3.413f, 15.125f, 2.497f)
                curveTo(16.449f, 2.932f, 17.651f, 3.636f, 18.666f, 4.545f)
                curveTo(18.24f, 5.637f, 18.297f, 6.905f, 18.928f, 7.999f)
                curveTo(19.56f, 9.094f, 20.631f, 9.777f, 21.791f, 9.954f)
                curveTo(21.928f, 10.614f, 22.0f, 11.298f, 22.0f, 11.999f)
                curveTo(22.0f, 12.7f, 21.928f, 13.384f, 21.791f, 14.045f)
                curveTo(20.631f, 14.222f, 19.56f, 14.905f, 18.928f, 15.999f)
                curveTo(18.297f, 17.093f, 18.24f, 18.362f, 18.666f, 19.454f)
                curveTo(17.651f, 20.362f, 16.449f, 21.066f, 15.125f, 21.501f)
                curveTo(14.391f, 20.586f, 13.264f, 19.999f, 12.0f, 19.999f)
                curveTo(10.736f, 19.999f, 9.609f, 20.586f, 8.876f, 21.501f)
                curveTo(7.551f, 21.066f, 6.349f, 20.362f, 5.334f, 19.454f)
                curveTo(5.76f, 18.362f, 5.703f, 17.093f, 5.072f, 15.999f)
                curveTo(4.44f, 14.905f, 3.369f, 14.222f, 2.209f, 14.045f)
                curveTo(2.072f, 13.384f, 2.0f, 12.7f, 2.0f, 11.999f)
                curveTo(2.0f, 11.298f, 2.072f, 10.614f, 2.209f, 9.954f)
                curveTo(3.369f, 9.777f, 4.44f, 9.094f, 5.072f, 7.999f)
                curveTo(5.703f, 6.905f, 5.76f, 5.637f, 5.334f, 4.545f)
                close()
                moveTo(13.5f, 14.597f)
                curveTo(14.935f, 13.769f, 15.427f, 11.934f, 14.598f, 10.499f)
                curveTo(13.77f, 9.064f, 11.935f, 8.573f, 10.5f, 9.401f)
                curveTo(9.065f, 10.23f, 8.573f, 12.064f, 9.402f, 13.499f)
                curveTo(10.23f, 14.934f, 12.065f, 15.426f, 13.5f, 14.597f)
                close()
            }
        }
        .build()
        return _settings4Fill!!
    }

private var _settings4Fill: ImageVector? = null
