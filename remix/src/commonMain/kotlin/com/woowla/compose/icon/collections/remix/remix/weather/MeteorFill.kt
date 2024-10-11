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

public val WeatherGroup.MeteorFill: ImageVector
    get() {
        if (_meteorFill != null) {
            return _meteorFill!!
        }
        _meteorFill = Builder(name = "MeteorFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(12.0f, 8.0f)
                curveTo(9.239f, 8.0f, 7.0f, 10.239f, 7.0f, 13.0f)
                curveTo(7.0f, 15.761f, 9.239f, 18.0f, 12.0f, 18.0f)
                curveTo(14.761f, 18.0f, 17.0f, 15.761f, 17.0f, 13.0f)
                curveTo(17.0f, 10.239f, 14.761f, 8.0f, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _meteorFill!!
    }

private var _meteorFill: ImageVector? = null
