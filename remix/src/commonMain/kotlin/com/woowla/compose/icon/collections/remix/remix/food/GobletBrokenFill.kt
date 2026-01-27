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

public val FoodGroup.GobletBrokenFill: ImageVector
    get() {
        if (_gobletBrokenFill != null) {
            return _gobletBrokenFill!!
        }
        _gobletBrokenFill = Builder(name = "GobletBrokenFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.923f, 2.0f)
                lineTo(10.835f, 5.616f)
                lineTo(13.434f, 7.116f)
                lineTo(11.684f, 10.147f)
                lineTo(13.415f, 11.147f)
                lineTo(16.166f, 6.384f)
                lineTo(13.567f, 4.884f)
                lineTo(15.232f, 2.0f)
                horizontalLineTo(17.868f)
                lineTo(18.99f, 9.859f)
                curveTo(19.292f, 11.973f, 18.469f, 13.789f, 17.11f, 15.047f)
                curveTo(16.005f, 16.069f, 14.542f, 16.732f, 13.0f, 16.934f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.934f)
                curveTo(9.459f, 16.732f, 7.996f, 16.069f, 6.891f, 15.047f)
                curveTo(5.532f, 13.789f, 4.708f, 11.973f, 5.011f, 9.859f)
                lineTo(6.133f, 2.0f)
                horizontalLineTo(12.923f)
                close()
            }
        }
        .build()
        return _gobletBrokenFill!!
    }

private var _gobletBrokenFill: ImageVector? = null
