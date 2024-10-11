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

public val WeatherGroup.CloudWindyFill: ImageVector
    get() {
        if (_cloudWindyFill != null) {
            return _cloudWindyFill!!
        }
        _cloudWindyFill = Builder(name = "CloudWindyFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 19.0f)
                verticalLineTo(15.007f)
                horizontalLineTo(2.074f)
                curveTo(1.391f, 13.829f, 1.0f, 12.46f, 1.0f, 11.0f)
                curveTo(1.0f, 6.582f, 4.582f, 3.0f, 9.0f, 3.0f)
                curveTo(12.395f, 3.0f, 15.296f, 5.115f, 16.458f, 8.099f)
                curveTo(16.795f, 8.034f, 17.144f, 8.0f, 17.5f, 8.0f)
                curveTo(20.538f, 8.0f, 23.0f, 10.462f, 23.0f, 13.5f)
                curveTo(23.0f, 16.538f, 20.538f, 19.0f, 17.5f, 19.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(6.0f, 21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(21.0f)
                close()
                moveTo(2.0f, 17.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _cloudWindyFill!!
    }

private var _cloudWindyFill: ImageVector? = null
