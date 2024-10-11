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

public val WeatherGroup.ThunderstormsLine: ImageVector
    get() {
        if (_thunderstormsLine != null) {
            return _thunderstormsLine!!
        }
        _thunderstormsLine = Builder(name = "ThunderstormsLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.5f)
                curveTo(19.433f, 16.0f, 21.0f, 14.433f, 21.0f, 12.5f)
                curveTo(21.0f, 10.567f, 19.433f, 9.0f, 17.5f, 9.0f)
                curveTo(16.521f, 9.0f, 15.635f, 9.402f, 15.0f, 10.051f)
                curveTo(15.0f, 10.034f, 15.0f, 10.017f, 15.0f, 10.0f)
                curveTo(15.0f, 6.686f, 12.314f, 4.0f, 9.0f, 4.0f)
                curveTo(5.686f, 4.0f, 3.0f, 6.686f, 3.0f, 10.0f)
                curveTo(3.0f, 12.612f, 4.67f, 14.835f, 7.0f, 15.659f)
                verticalLineTo(17.748f)
                curveTo(3.55f, 16.86f, 1.0f, 13.728f, 1.0f, 10.0f)
                curveTo(1.0f, 5.582f, 4.582f, 2.0f, 9.0f, 2.0f)
                curveTo(12.395f, 2.0f, 15.296f, 4.115f, 16.458f, 7.099f)
                curveTo(16.795f, 7.034f, 17.144f, 7.0f, 17.5f, 7.0f)
                curveTo(20.538f, 7.0f, 23.0f, 9.462f, 23.0f, 12.5f)
                curveTo(23.0f, 15.538f, 20.538f, 18.0f, 17.5f, 18.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(13.0f, 16.005f)
                horizontalLineTo(16.0f)
                lineTo(11.0f, 22.505f)
                verticalLineTo(18.005f)
                horizontalLineTo(8.0f)
                lineTo(13.0f, 11.5f)
                verticalLineTo(16.005f)
                close()
            }
        }
        .build()
        return _thunderstormsLine!!
    }

private var _thunderstormsLine: ImageVector? = null
