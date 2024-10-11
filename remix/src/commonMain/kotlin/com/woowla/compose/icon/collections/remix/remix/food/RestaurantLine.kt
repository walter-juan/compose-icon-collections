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

public val FoodGroup.RestaurantLine: ImageVector
    get() {
        if (_restaurantLine != null) {
            return _restaurantLine!!
        }
        _restaurantLine = Builder(name = "RestaurantLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                curveTo(15.0f, 4.686f, 17.686f, 2.0f, 21.0f, 2.0f)
                close()
                moveTo(19.0f, 4.53f)
                curveTo(18.17f, 5.0f, 17.0f, 6.17f, 17.0f, 8.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.53f)
                close()
                moveTo(9.0f, 13.9f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.9f)
                curveTo(4.718f, 13.437f, 3.0f, 11.419f, 3.0f, 9.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                curveTo(13.0f, 11.419f, 11.282f, 13.437f, 9.0f, 13.9f)
                close()
            }
        }
        .build()
        return _restaurantLine!!
    }

private var _restaurantLine: ImageVector? = null
