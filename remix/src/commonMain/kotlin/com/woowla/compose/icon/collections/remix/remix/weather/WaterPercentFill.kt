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

public val WeatherGroup.WaterPercentFill: ImageVector
    get() {
        if (_waterPercentFill != null) {
            return _waterPercentFill!!
        }
        _waterPercentFill = Builder(name = "WaterPercentFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.269f)
                lineTo(5.636f, 6.633f)
                curveTo(2.121f, 10.148f, 2.121f, 15.846f, 5.636f, 19.361f)
                curveTo(9.151f, 22.876f, 14.849f, 22.876f, 18.364f, 19.361f)
                curveTo(21.879f, 15.846f, 21.879f, 10.148f, 18.364f, 6.633f)
                lineTo(12.0f, 0.269f)
                close()
                moveTo(16.243f, 10.171f)
                lineTo(9.172f, 17.243f)
                lineTo(7.757f, 15.828f)
                lineTo(14.828f, 8.757f)
                lineTo(16.243f, 10.171f)
                close()
                moveTo(8.111f, 9.111f)
                curveTo(8.697f, 8.525f, 9.646f, 8.525f, 10.232f, 9.111f)
                curveTo(10.818f, 9.697f, 10.818f, 10.646f, 10.232f, 11.232f)
                curveTo(9.646f, 11.818f, 8.697f, 11.818f, 8.111f, 11.232f)
                curveTo(7.525f, 10.646f, 7.525f, 9.697f, 8.111f, 9.111f)
                close()
                moveTo(15.889f, 16.889f)
                curveTo(15.303f, 17.475f, 14.354f, 17.475f, 13.768f, 16.889f)
                curveTo(13.182f, 16.303f, 13.182f, 15.353f, 13.768f, 14.768f)
                curveTo(14.354f, 14.182f, 15.303f, 14.182f, 15.889f, 14.768f)
                curveTo(16.475f, 15.353f, 16.475f, 16.303f, 15.889f, 16.889f)
                close()
            }
        }
        .build()
        return _waterPercentFill!!
    }

private var _waterPercentFill: ImageVector? = null
