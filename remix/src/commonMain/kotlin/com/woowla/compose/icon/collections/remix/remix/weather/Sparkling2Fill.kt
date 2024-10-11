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

public val WeatherGroup.Sparkling2Fill: ImageVector
    get() {
        if (_sparkling2Fill != null) {
            return _sparkling2Fill!!
        }
        _sparkling2Fill = Builder(name = "Sparkling2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.001f, 1.208f)
                lineTo(18.319f, 3.681f)
                lineTo(20.792f, 5.0f)
                lineTo(18.319f, 6.319f)
                lineTo(17.001f, 8.792f)
                lineTo(15.682f, 6.319f)
                lineTo(13.209f, 5.0f)
                lineTo(15.682f, 3.681f)
                lineTo(17.001f, 1.208f)
                close()
                moveTo(8.001f, 4.333f)
                lineTo(10.667f, 9.333f)
                lineTo(15.667f, 12.0f)
                lineTo(10.667f, 14.667f)
                lineTo(8.001f, 19.667f)
                lineTo(5.334f, 14.667f)
                lineTo(0.334f, 12.0f)
                lineTo(5.334f, 9.333f)
                lineTo(8.001f, 4.333f)
                close()
                moveTo(19.667f, 16.333f)
                lineTo(18.001f, 13.208f)
                lineTo(16.334f, 16.333f)
                lineTo(13.209f, 18.0f)
                lineTo(16.334f, 19.667f)
                lineTo(18.001f, 22.792f)
                lineTo(19.667f, 19.667f)
                lineTo(22.792f, 18.0f)
                lineTo(19.667f, 16.333f)
                close()
            }
        }
        .build()
        return _sparkling2Fill!!
    }

private var _sparkling2Fill: ImageVector? = null
