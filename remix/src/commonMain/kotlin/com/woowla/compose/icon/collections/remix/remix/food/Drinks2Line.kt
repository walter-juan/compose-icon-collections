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

public val FoodGroup.Drinks2Line: ImageVector
    get() {
        if (_drinks2Line != null) {
            return _drinks2Line!!
        }
        _drinks2Line = Builder(name = "Drinks2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                horizontalLineTo(7.323f)
                lineTo(8.523f, 5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.118f)
                lineTo(5.945f, 21.059f)
                curveTo(5.976f, 21.587f, 6.413f, 22.0f, 6.943f, 22.0f)
                horizontalLineTo(17.057f)
                curveTo(17.587f, 22.0f, 18.024f, 21.587f, 18.055f, 21.059f)
                lineTo(18.882f, 7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.677f)
                lineTo(8.677f, 0.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(7.299f, 10.025f)
                lineTo(7.121f, 7.0f)
                horizontalLineTo(16.879f)
                lineTo(16.587f, 11.967f)
                curveTo(14.28f, 11.853f, 13.423f, 11.492f, 12.371f, 11.071f)
                curveTo(11.279f, 10.635f, 9.971f, 10.135f, 7.299f, 10.025f)
                close()
                moveTo(7.417f, 12.033f)
                curveTo(9.721f, 12.147f, 10.589f, 12.513f, 11.64f, 12.933f)
                curveTo(12.7f, 13.357f, 13.956f, 13.837f, 16.469f, 13.964f)
                lineTo(16.114f, 20.0f)
                horizontalLineTo(7.886f)
                lineTo(7.417f, 12.033f)
                close()
            }
        }
        .build()
        return _drinks2Line!!
    }

private var _drinks2Line: ImageVector? = null
