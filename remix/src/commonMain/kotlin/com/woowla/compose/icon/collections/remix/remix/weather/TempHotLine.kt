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

public val WeatherGroup.TempHotLine: ImageVector
    get() {
        if (_tempHotLine != null) {
            return _tempHotLine!!
        }
        _tempHotLine = Builder(name = "TempHotLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                curveTo(8.0f, 2.791f, 9.791f, 1.0f, 12.0f, 1.0f)
                curveTo(14.209f, 1.0f, 16.0f, 2.791f, 16.0f, 5.0f)
                verticalLineTo(10.255f)
                curveTo(17.813f, 11.52f, 19.0f, 13.621f, 19.0f, 16.0f)
                curveTo(19.0f, 19.866f, 15.866f, 23.0f, 12.0f, 23.0f)
                curveTo(8.134f, 23.0f, 5.0f, 19.866f, 5.0f, 16.0f)
                curveTo(5.0f, 13.621f, 6.187f, 11.52f, 8.0f, 10.255f)
                verticalLineTo(5.0f)
                close()
                moveTo(9.144f, 11.895f)
                curveTo(7.809f, 12.826f, 7.0f, 14.343f, 7.0f, 16.0f)
                curveTo(7.0f, 18.761f, 9.239f, 21.0f, 12.0f, 21.0f)
                curveTo(14.761f, 21.0f, 17.0f, 18.761f, 17.0f, 16.0f)
                curveTo(17.0f, 14.343f, 16.191f, 12.826f, 14.856f, 11.895f)
                lineTo(14.0f, 11.298f)
                verticalLineTo(5.0f)
                curveTo(14.0f, 3.895f, 13.105f, 3.0f, 12.0f, 3.0f)
                curveTo(10.895f, 3.0f, 10.0f, 3.895f, 10.0f, 5.0f)
                verticalLineTo(11.298f)
                lineTo(9.144f, 11.895f)
                close()
                moveTo(11.0f, 12.126f)
                verticalLineTo(5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.126f)
                curveTo(14.725f, 12.57f, 16.0f, 14.136f, 16.0f, 16.0f)
                curveTo(16.0f, 18.209f, 14.209f, 20.0f, 12.0f, 20.0f)
                curveTo(9.791f, 20.0f, 8.0f, 18.209f, 8.0f, 16.0f)
                curveTo(8.0f, 14.136f, 9.275f, 12.57f, 11.0f, 12.126f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(13.105f, 18.0f, 14.0f, 17.105f, 14.0f, 16.0f)
                curveTo(14.0f, 14.895f, 13.105f, 14.0f, 12.0f, 14.0f)
                curveTo(10.895f, 14.0f, 10.0f, 14.895f, 10.0f, 16.0f)
                curveTo(10.0f, 17.105f, 10.895f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _tempHotLine!!
    }

private var _tempHotLine: ImageVector? = null
