package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.ShoppingBag: ImageVector
    get() {
        if (_shoppingBag != null) {
            return _shoppingBag!!
        }
        _shoppingBag = Builder(name = "ShoppingBag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.75f, 10.5f)
                verticalLineTo(6.0f)
                curveTo(15.75f, 3.929f, 14.071f, 2.25f, 12.0f, 2.25f)
                curveTo(9.929f, 2.25f, 8.25f, 3.929f, 8.25f, 6.0f)
                verticalLineTo(10.5f)
                moveTo(19.606f, 8.507f)
                lineTo(20.869f, 20.507f)
                curveTo(20.939f, 21.171f, 20.418f, 21.75f, 19.75f, 21.75f)
                horizontalLineTo(4.25f)
                curveTo(3.582f, 21.75f, 3.061f, 21.171f, 3.131f, 20.507f)
                lineTo(4.394f, 8.507f)
                curveTo(4.454f, 7.935f, 4.937f, 7.5f, 5.513f, 7.5f)
                horizontalLineTo(18.487f)
                curveTo(19.063f, 7.5f, 19.546f, 7.935f, 19.606f, 8.507f)
                close()
                moveTo(8.625f, 10.5f)
                curveTo(8.625f, 10.707f, 8.457f, 10.875f, 8.25f, 10.875f)
                curveTo(8.043f, 10.875f, 7.875f, 10.707f, 7.875f, 10.5f)
                curveTo(7.875f, 10.293f, 8.043f, 10.125f, 8.25f, 10.125f)
                curveTo(8.457f, 10.125f, 8.625f, 10.293f, 8.625f, 10.5f)
                close()
                moveTo(16.125f, 10.5f)
                curveTo(16.125f, 10.707f, 15.957f, 10.875f, 15.75f, 10.875f)
                curveTo(15.543f, 10.875f, 15.375f, 10.707f, 15.375f, 10.5f)
                curveTo(15.375f, 10.293f, 15.543f, 10.125f, 15.75f, 10.125f)
                curveTo(15.957f, 10.125f, 16.125f, 10.293f, 16.125f, 10.5f)
                close()
            }
        }
        .build()
        return _shoppingBag!!
    }

private var _shoppingBag: ImageVector? = null
