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

public val WeatherGroup.TyphoonLine: ImageVector
    get() {
        if (_typhoonLine != null) {
            return _typhoonLine!!
        }
        _typhoonLine = Builder(name = "TyphoonLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.654f, 1.7f)
                lineTo(14.872f, 4.233f)
                curveTo(16.147f, 4.623f, 17.345f, 5.281f, 18.361f, 6.206f)
                curveTo(21.874f, 9.406f, 21.874f, 14.594f, 18.361f, 17.794f)
                curveTo(15.77f, 20.154f, 11.764f, 21.656f, 6.346f, 22.3f)
                lineTo(9.128f, 19.767f)
                curveTo(7.853f, 19.377f, 6.655f, 18.719f, 5.639f, 17.794f)
                curveTo(2.126f, 14.594f, 2.105f, 9.425f, 5.639f, 6.206f)
                curveTo(8.23f, 3.846f, 12.236f, 2.344f, 17.654f, 1.7f)
                close()
                moveTo(12.0f, 6.0f)
                curveTo(8.134f, 6.0f, 5.0f, 8.686f, 5.0f, 12.0f)
                curveTo(5.0f, 15.314f, 8.134f, 18.0f, 12.0f, 18.0f)
                curveTo(15.866f, 18.0f, 19.0f, 15.314f, 19.0f, 12.0f)
                curveTo(19.0f, 8.686f, 15.866f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(12.0f, 8.3f)
                curveTo(14.209f, 8.3f, 16.0f, 9.957f, 16.0f, 12.0f)
                curveTo(16.0f, 14.043f, 14.209f, 15.7f, 12.0f, 15.7f)
                curveTo(9.791f, 15.7f, 8.0f, 14.043f, 8.0f, 12.0f)
                curveTo(8.0f, 9.957f, 9.791f, 8.3f, 12.0f, 8.3f)
                close()
                moveTo(12.0f, 10.3f)
                curveTo(10.862f, 10.3f, 10.0f, 11.097f, 10.0f, 12.0f)
                curveTo(10.0f, 12.903f, 10.862f, 13.7f, 12.0f, 13.7f)
                curveTo(13.138f, 13.7f, 14.0f, 12.903f, 14.0f, 12.0f)
                curveTo(14.0f, 11.097f, 13.138f, 10.3f, 12.0f, 10.3f)
                close()
            }
        }
        .build()
        return _typhoonLine!!
    }

private var _typhoonLine: ImageVector? = null
