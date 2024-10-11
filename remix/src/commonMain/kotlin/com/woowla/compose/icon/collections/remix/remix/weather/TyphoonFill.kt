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

public val WeatherGroup.TyphoonFill: ImageVector
    get() {
        if (_typhoonFill != null) {
            return _typhoonFill!!
        }
        _typhoonFill = Builder(name = "TyphoonFill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(12.0f, 8.0f)
                curveTo(9.515f, 8.0f, 7.5f, 9.791f, 7.5f, 12.0f)
                curveTo(7.5f, 14.209f, 9.515f, 16.0f, 12.0f, 16.0f)
                curveTo(14.485f, 16.0f, 16.5f, 14.209f, 16.5f, 12.0f)
                curveTo(16.5f, 9.791f, 14.485f, 8.0f, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _typhoonFill!!
    }

private var _typhoonFill: ImageVector? = null
