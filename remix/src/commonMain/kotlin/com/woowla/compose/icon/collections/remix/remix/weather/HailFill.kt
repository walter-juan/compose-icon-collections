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

public val WeatherGroup.HailFill: ImageVector
    get() {
        if (_hailFill != null) {
            return _hailFill!!
        }
        _hailFill = Builder(name = "HailFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.995f, 17.794f)
                curveTo(18.888f, 15.681f, 17.14f, 14.0f, 15.0f, 14.0f)
                curveTo(14.622f, 14.0f, 14.256f, 14.052f, 13.91f, 14.15f)
                curveTo(13.52f, 12.349f, 11.918f, 11.0f, 10.0f, 11.0f)
                curveTo(7.791f, 11.0f, 6.0f, 12.791f, 6.0f, 15.0f)
                curveTo(6.0f, 16.079f, 6.428f, 17.059f, 7.122f, 17.778f)
                curveTo(3.61f, 16.934f, 1.0f, 13.772f, 1.0f, 10.0f)
                curveTo(1.0f, 5.582f, 4.582f, 2.0f, 9.0f, 2.0f)
                curveTo(12.395f, 2.0f, 15.296f, 4.115f, 16.458f, 7.099f)
                curveTo(16.795f, 7.034f, 17.144f, 7.0f, 17.5f, 7.0f)
                curveTo(20.538f, 7.0f, 23.0f, 9.462f, 23.0f, 12.5f)
                curveTo(23.0f, 15.019f, 21.306f, 17.143f, 18.995f, 17.794f)
                close()
                moveTo(10.0f, 17.0f)
                curveTo(8.895f, 17.0f, 8.0f, 16.105f, 8.0f, 15.0f)
                curveTo(8.0f, 13.895f, 8.895f, 13.0f, 10.0f, 13.0f)
                curveTo(11.105f, 13.0f, 12.0f, 13.895f, 12.0f, 15.0f)
                curveTo(12.0f, 16.105f, 11.105f, 17.0f, 10.0f, 17.0f)
                close()
                moveTo(15.0f, 20.0f)
                curveTo(13.895f, 20.0f, 13.0f, 19.105f, 13.0f, 18.0f)
                curveTo(13.0f, 16.895f, 13.895f, 16.0f, 15.0f, 16.0f)
                curveTo(16.105f, 16.0f, 17.0f, 16.895f, 17.0f, 18.0f)
                curveTo(17.0f, 19.105f, 16.105f, 20.0f, 15.0f, 20.0f)
                close()
                moveTo(10.0f, 23.0f)
                curveTo(8.895f, 23.0f, 8.0f, 22.105f, 8.0f, 21.0f)
                curveTo(8.0f, 19.895f, 8.895f, 19.0f, 10.0f, 19.0f)
                curveTo(11.105f, 19.0f, 12.0f, 19.895f, 12.0f, 21.0f)
                curveTo(12.0f, 22.105f, 11.105f, 23.0f, 10.0f, 23.0f)
                close()
            }
        }
        .build()
        return _hailFill!!
    }

private var _hailFill: ImageVector? = null
