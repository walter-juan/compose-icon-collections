package com.woowla.compose.icon.collections.remix.remix.food

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.FoodGroup

public val FoodGroup.Goblet2Fill: ImageVector
    get() {
        if (_goblet2Fill != null) {
            return _goblet2Fill!!
        }
        _goblet2Fill = Builder(name = "Goblet2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.133f, 2.0f)
                lineTo(5.011f, 9.859f)
                curveTo(4.708f, 11.973f, 5.532f, 13.789f, 6.891f, 15.047f)
                curveTo(7.996f, 16.069f, 9.459f, 16.732f, 11.0f, 16.934f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.934f)
                curveTo(14.542f, 16.732f, 16.005f, 16.069f, 17.11f, 15.047f)
                curveTo(18.469f, 13.789f, 19.292f, 11.973f, 18.99f, 9.859f)
                lineTo(17.868f, 2.0f)
                horizontalLineTo(6.133f)
                close()
                moveTo(10.0f, 7.0f)
                curveTo(9.169f, 7.0f, 8.162f, 7.242f, 7.371f, 7.476f)
                lineTo(7.868f, 4.0f)
                horizontalLineTo(16.133f)
                lineTo(16.623f, 7.431f)
                curveTo(15.785f, 7.707f, 14.89f, 8.0f, 14.0f, 8.0f)
                curveTo(12.608f, 8.0f, 11.428f, 7.0f, 10.0f, 7.0f)
                close()
            }
        }
        .build()
        return _goblet2Fill!!
    }

private var _goblet2Fill: ImageVector? = null
