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

public val WeatherGroup.FlashlightLine: ImageVector
    get() {
        if (_flashlightLine != null) {
            return _flashlightLine!!
        }
        _flashlightLine = Builder(name = "FlashlightLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 9.0f)
                horizontalLineTo(21.0f)
                lineTo(11.0f, 24.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.0f)
                lineTo(13.0f, 0.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(11.0f, 11.0f)
                verticalLineTo(7.221f)
                lineTo(7.532f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.394f)
                lineTo(17.263f, 11.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _flashlightLine!!
    }

private var _flashlightLine: ImageVector? = null
