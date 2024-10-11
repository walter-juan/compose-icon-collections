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

public val WeatherGroup.FireFill: ImageVector
    get() {
        if (_fireFill != null) {
            return _fireFill!!
        }
        _fireFill = Builder(name = "FireFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 23.0f)
                curveTo(7.858f, 23.0f, 4.5f, 19.642f, 4.5f, 15.5f)
                curveTo(4.5f, 13.346f, 5.408f, 11.405f, 6.862f, 10.037f)
                curveTo(8.204f, 8.774f, 11.5f, 6.5f, 11.0f, 1.5f)
                curveTo(17.0f, 5.5f, 20.0f, 9.5f, 14.0f, 15.5f)
                curveTo(15.0f, 15.5f, 16.5f, 15.5f, 19.0f, 13.03f)
                curveTo(19.27f, 13.803f, 19.5f, 14.634f, 19.5f, 15.5f)
                curveTo(19.5f, 19.642f, 16.142f, 23.0f, 12.0f, 23.0f)
                close()
            }
        }
        .build()
        return _fireFill!!
    }

private var _fireFill: ImageVector? = null
