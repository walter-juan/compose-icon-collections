package com.woowla.compose.icon.collections.remix.remix.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.WeatherGroup

public val WeatherGroup.Haze2Fill: ImageVector
    get() {
        if (_haze2Fill != null) {
            return _haze2Fill!!
        }
        _haze2Fill = Builder(name = "Haze2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                curveTo(12.828f, 19.0f, 13.5f, 19.672f, 13.5f, 20.5f)
                curveTo(13.5f, 21.328f, 12.828f, 22.0f, 12.0f, 22.0f)
                curveTo(11.172f, 22.0f, 10.5f, 21.328f, 10.5f, 20.5f)
                curveTo(10.5f, 19.672f, 11.172f, 19.0f, 12.0f, 19.0f)
                close()
                moveTo(19.5f, 19.0f)
                curveTo(20.328f, 19.0f, 21.0f, 19.672f, 21.0f, 20.5f)
                curveTo(21.0f, 21.328f, 20.328f, 22.0f, 19.5f, 22.0f)
                curveTo(18.672f, 22.0f, 18.0f, 21.328f, 18.0f, 20.5f)
                curveTo(18.0f, 19.672f, 18.672f, 19.0f, 19.5f, 19.0f)
                close()
                moveTo(4.5f, 19.0f)
                curveTo(5.328f, 19.0f, 6.0f, 19.672f, 6.0f, 20.5f)
                curveTo(6.0f, 21.328f, 5.328f, 22.0f, 4.5f, 22.0f)
                curveTo(3.672f, 22.0f, 3.0f, 21.328f, 3.0f, 20.5f)
                curveTo(3.0f, 19.672f, 3.672f, 19.0f, 4.5f, 19.0f)
                close()
                moveTo(17.0f, 7.0f)
                curveTo(19.761f, 7.0f, 22.0f, 9.239f, 22.0f, 12.0f)
                curveTo(22.0f, 14.761f, 19.761f, 17.0f, 17.0f, 17.0f)
                curveTo(15.156f, 17.0f, 13.49f, 15.96f, 12.0f, 13.878f)
                curveTo(10.51f, 15.96f, 8.844f, 17.0f, 7.0f, 17.0f)
                curveTo(4.239f, 17.0f, 2.0f, 14.761f, 2.0f, 12.0f)
                curveTo(2.0f, 9.239f, 4.239f, 7.0f, 7.0f, 7.0f)
                curveTo(8.844f, 7.0f, 10.51f, 8.041f, 12.0f, 10.122f)
                curveTo(13.49f, 8.041f, 15.156f, 7.0f, 17.0f, 7.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(12.828f, 2.0f, 13.5f, 2.672f, 13.5f, 3.5f)
                curveTo(13.5f, 4.328f, 12.828f, 5.0f, 12.0f, 5.0f)
                curveTo(11.172f, 5.0f, 10.5f, 4.328f, 10.5f, 3.5f)
                curveTo(10.5f, 2.672f, 11.172f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(4.5f, 2.0f)
                curveTo(5.328f, 2.0f, 6.0f, 2.672f, 6.0f, 3.5f)
                curveTo(6.0f, 4.328f, 5.328f, 5.0f, 4.5f, 5.0f)
                curveTo(3.672f, 5.0f, 3.0f, 4.328f, 3.0f, 3.5f)
                curveTo(3.0f, 2.672f, 3.672f, 2.0f, 4.5f, 2.0f)
                close()
                moveTo(19.5f, 2.0f)
                curveTo(20.328f, 2.0f, 21.0f, 2.672f, 21.0f, 3.5f)
                curveTo(21.0f, 4.328f, 20.328f, 5.0f, 19.5f, 5.0f)
                curveTo(18.672f, 5.0f, 18.0f, 4.328f, 18.0f, 3.5f)
                curveTo(18.0f, 2.672f, 18.672f, 2.0f, 19.5f, 2.0f)
                close()
            }
        }
        .build()
        return _haze2Fill!!
    }

private var _haze2Fill: ImageVector? = null
