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

public val WeatherGroup.ShiningFill: ImageVector
    get() {
        if (_shiningFill != null) {
            return _shiningFill!!
        }
        _shiningFill = Builder(name = "ShiningFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 11.0f)
                curveTo(6.523f, 11.0f, 11.0f, 6.523f, 11.0f, 1.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 6.523f, 17.477f, 11.0f, 23.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(17.477f, 13.0f, 13.0f, 17.477f, 13.0f, 23.0f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 17.477f, 6.523f, 13.0f, 1.0f, 13.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _shiningFill!!
    }

private var _shiningFill: ImageVector? = null
