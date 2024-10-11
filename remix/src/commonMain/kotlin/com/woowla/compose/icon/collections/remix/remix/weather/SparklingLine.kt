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

public val WeatherGroup.SparklingLine: ImageVector
    get() {
        if (_sparklingLine != null) {
            return _sparklingLine!!
        }
        _sparklingLine = Builder(name = "SparklingLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.438f)
                curveTo(15.346f, 4.438f, 16.438f, 3.346f, 16.438f, 2.0f)
                horizontalLineTo(17.563f)
                curveTo(17.563f, 3.346f, 18.654f, 4.438f, 20.0f, 4.438f)
                verticalLineTo(5.563f)
                curveTo(18.654f, 5.563f, 17.563f, 6.654f, 17.563f, 8.0f)
                horizontalLineTo(16.438f)
                curveTo(16.438f, 6.654f, 15.346f, 5.563f, 14.0f, 5.563f)
                verticalLineTo(4.438f)
                close()
                moveTo(1.0f, 11.0f)
                curveTo(4.314f, 11.0f, 7.0f, 8.314f, 7.0f, 5.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 8.314f, 11.686f, 11.0f, 15.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(11.686f, 13.0f, 9.0f, 15.686f, 9.0f, 19.0f)
                horizontalLineTo(7.0f)
                curveTo(7.0f, 15.686f, 4.314f, 13.0f, 1.0f, 13.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(4.876f, 12.0f)
                curveTo(6.187f, 12.728f, 7.272f, 13.813f, 8.0f, 15.124f)
                curveTo(8.728f, 13.813f, 9.813f, 12.728f, 11.124f, 12.0f)
                curveTo(9.813f, 11.272f, 8.728f, 10.187f, 8.0f, 8.876f)
                curveTo(7.272f, 10.187f, 6.187f, 11.272f, 4.876f, 12.0f)
                close()
                moveTo(17.25f, 14.0f)
                curveTo(17.25f, 15.795f, 15.795f, 17.25f, 14.0f, 17.25f)
                verticalLineTo(18.75f)
                curveTo(15.795f, 18.75f, 17.25f, 20.205f, 17.25f, 22.0f)
                horizontalLineTo(18.75f)
                curveTo(18.75f, 20.205f, 20.205f, 18.75f, 22.0f, 18.75f)
                verticalLineTo(17.25f)
                curveTo(20.205f, 17.25f, 18.75f, 15.795f, 18.75f, 14.0f)
                horizontalLineTo(17.25f)
                close()
            }
        }
        .build()
        return _sparklingLine!!
    }

private var _sparklingLine: ImageVector? = null
