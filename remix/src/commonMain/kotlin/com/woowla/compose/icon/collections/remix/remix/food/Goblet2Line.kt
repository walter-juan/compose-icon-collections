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

public val FoodGroup.Goblet2Line: ImageVector
    get() {
        if (_goblet2Line != null) {
            return _goblet2Line!!
        }
        _goblet2Line = Builder(name = "Goblet2Line", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(6.99f, 10.141f)
                lineTo(7.868f, 4.0f)
                horizontalLineTo(16.133f)
                lineTo(17.01f, 10.141f)
                curveTo(17.208f, 11.527f, 16.689f, 12.711f, 15.751f, 13.578f)
                curveTo(14.797f, 14.462f, 13.418f, 15.0f, 12.0f, 15.0f)
                curveTo(10.583f, 15.0f, 9.204f, 14.462f, 8.249f, 13.578f)
                curveTo(7.312f, 12.711f, 6.792f, 11.527f, 6.99f, 10.141f)
                close()
            }
        }
        .build()
        return _goblet2Line!!
    }

private var _goblet2Line: ImageVector? = null
