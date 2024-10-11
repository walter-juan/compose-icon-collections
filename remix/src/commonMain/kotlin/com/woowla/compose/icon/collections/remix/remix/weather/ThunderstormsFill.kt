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

public val WeatherGroup.ThunderstormsFill: ImageVector
    get() {
        if (_thunderstormsFill != null) {
            return _thunderstormsFill!!
        }
        _thunderstormsFill = Builder(name = "ThunderstormsFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.989f, 18.0f)
                lineTo(18.204f, 16.419f)
                curveTo(18.406f, 16.157f, 18.515f, 15.836f, 18.515f, 15.505f)
                curveTo(18.515f, 14.676f, 17.844f, 14.005f, 17.015f, 14.005f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.029f)
                curveTo(15.0f, 9.563f, 14.783f, 9.124f, 14.414f, 8.84f)
                curveTo(13.757f, 8.335f, 12.816f, 8.458f, 12.311f, 9.115f)
                lineTo(5.945f, 17.396f)
                curveTo(3.042f, 16.196f, 1.0f, 13.337f, 1.0f, 10.0f)
                curveTo(1.0f, 5.582f, 4.582f, 2.0f, 9.0f, 2.0f)
                curveTo(12.395f, 2.0f, 15.296f, 4.115f, 16.458f, 7.099f)
                curveTo(16.795f, 7.034f, 17.144f, 7.0f, 17.5f, 7.0f)
                curveTo(20.538f, 7.0f, 23.0f, 9.462f, 23.0f, 12.5f)
                curveTo(23.0f, 15.538f, 20.538f, 18.0f, 17.5f, 18.0f)
                horizontalLineTo(16.989f)
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
        return _thunderstormsFill!!
    }

private var _thunderstormsFill: ImageVector? = null
