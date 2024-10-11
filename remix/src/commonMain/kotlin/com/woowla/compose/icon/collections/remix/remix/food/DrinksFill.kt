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

public val FoodGroup.DrinksFill: ImageVector
    get() {
        if (_drinksFill != null) {
            return _drinksFill!!
        }
        _drinksFill = Builder(name = "DrinksFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                horizontalLineTo(6.205f)
                curveTo(5.609f, 2.0f, 5.096f, 2.421f, 4.979f, 3.005f)
                lineTo(4.18f, 7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.109f)
                horizontalLineTo(19.891f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.82f)
                lineTo(19.021f, 3.005f)
                curveTo(18.904f, 2.421f, 18.391f, 2.0f, 17.795f, 2.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(19.66f, 11.0f)
                horizontalLineTo(4.34f)
                lineTo(5.481f, 20.893f)
                curveTo(5.554f, 21.524f, 6.088f, 22.0f, 6.723f, 22.0f)
                horizontalLineTo(17.277f)
                curveTo(17.912f, 22.0f, 18.446f, 21.524f, 18.519f, 20.893f)
                lineTo(19.66f, 11.0f)
                close()
            }
        }
        .build()
        return _drinksFill!!
    }

private var _drinksFill: ImageVector? = null
