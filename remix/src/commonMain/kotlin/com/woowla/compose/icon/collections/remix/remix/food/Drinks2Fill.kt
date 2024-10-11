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

public val FoodGroup.Drinks2Fill: ImageVector
    get() {
        if (_drinks2Fill != null) {
            return _drinks2Fill!!
        }
        _drinks2Fill = Builder(name = "Drinks2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.323f, 2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(8.677f)
                lineTo(10.677f, 5.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.882f)
                lineTo(18.055f, 21.059f)
                curveTo(18.024f, 21.587f, 17.587f, 22.0f, 17.057f, 22.0f)
                horizontalLineTo(6.943f)
                curveTo(6.413f, 22.0f, 5.976f, 21.587f, 5.945f, 21.059f)
                lineTo(5.118f, 7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.523f)
                lineTo(7.323f, 2.0f)
                close()
                moveTo(7.121f, 7.0f)
                lineTo(7.299f, 10.025f)
                curveTo(9.971f, 10.135f, 11.268f, 10.63f, 12.36f, 11.067f)
                curveTo(13.411f, 11.488f, 14.28f, 11.853f, 16.587f, 11.968f)
                lineTo(16.879f, 7.0f)
                horizontalLineTo(7.121f)
                close()
            }
        }
        .build()
        return _drinks2Fill!!
    }

private var _drinks2Fill: ImageVector? = null
