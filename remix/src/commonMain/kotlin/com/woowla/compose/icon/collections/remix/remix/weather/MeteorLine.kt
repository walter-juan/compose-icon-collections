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

public val WeatherGroup.MeteorLine: ImageVector
    get() {
        if (_meteorLine != null) {
            return _meteorLine!!
        }
        _meteorLine = Builder(name = "MeteorLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 1.0f)
                verticalLineTo(13.0f)
                curveTo(21.0f, 17.971f, 16.971f, 22.0f, 12.0f, 22.0f)
                curveTo(7.029f, 22.0f, 3.0f, 17.971f, 3.0f, 13.0f)
                curveTo(3.0f, 9.721f, 4.754f, 6.851f, 7.375f, 5.278f)
                lineTo(14.0f, 1.453f)
                verticalLineTo(4.223f)
                lineTo(21.0f, 1.0f)
                close()
                moveTo(19.0f, 4.122f)
                lineTo(12.0f, 7.346f)
                verticalLineTo(4.916f)
                lineTo(8.597f, 6.881f)
                curveTo(6.472f, 8.066f, 5.101f, 10.267f, 5.005f, 12.726f)
                lineTo(5.0f, 13.0f)
                curveTo(5.0f, 16.866f, 8.134f, 20.0f, 12.0f, 20.0f)
                curveTo(15.785f, 20.0f, 18.869f, 16.995f, 18.996f, 13.241f)
                lineTo(19.0f, 13.0f)
                verticalLineTo(4.122f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(14.761f, 8.0f, 17.0f, 10.239f, 17.0f, 13.0f)
                curveTo(17.0f, 15.761f, 14.761f, 18.0f, 12.0f, 18.0f)
                curveTo(9.239f, 18.0f, 7.0f, 15.761f, 7.0f, 13.0f)
                curveTo(7.0f, 10.239f, 9.239f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(10.343f, 10.0f, 9.0f, 11.343f, 9.0f, 13.0f)
                curveTo(9.0f, 14.657f, 10.343f, 16.0f, 12.0f, 16.0f)
                curveTo(13.657f, 16.0f, 15.0f, 14.657f, 15.0f, 13.0f)
                curveTo(15.0f, 11.343f, 13.657f, 10.0f, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return _meteorLine!!
    }

private var _meteorLine: ImageVector? = null
