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

public val OutlineGroup.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) {
            return _shoppingCart!!
        }
        _shoppingCart = Builder(name = "ShoppingCart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.25f, 3.0f)
                horizontalLineTo(3.636f)
                curveTo(4.145f, 3.0f, 4.591f, 3.343f, 4.723f, 3.835f)
                lineTo(5.106f, 5.272f)
                moveTo(7.5f, 14.25f)
                curveTo(5.843f, 14.25f, 4.5f, 15.593f, 4.5f, 17.25f)
                horizontalLineTo(20.25f)
                moveTo(7.5f, 14.25f)
                horizontalLineTo(18.718f)
                curveTo(19.839f, 11.949f, 20.818f, 9.566f, 21.642f, 7.113f)
                curveTo(16.88f, 5.896f, 11.891f, 5.25f, 6.75f, 5.25f)
                curveTo(6.2f, 5.25f, 5.652f, 5.257f, 5.106f, 5.272f)
                moveTo(7.5f, 14.25f)
                lineTo(5.106f, 5.272f)
                moveTo(6.0f, 20.25f)
                curveTo(6.0f, 20.664f, 5.664f, 21.0f, 5.25f, 21.0f)
                curveTo(4.836f, 21.0f, 4.5f, 20.664f, 4.5f, 20.25f)
                curveTo(4.5f, 19.836f, 4.836f, 19.5f, 5.25f, 19.5f)
                curveTo(5.664f, 19.5f, 6.0f, 19.836f, 6.0f, 20.25f)
                close()
                moveTo(18.75f, 20.25f)
                curveTo(18.75f, 20.664f, 18.414f, 21.0f, 18.0f, 21.0f)
                curveTo(17.586f, 21.0f, 17.25f, 20.664f, 17.25f, 20.25f)
                curveTo(17.25f, 19.836f, 17.586f, 19.5f, 18.0f, 19.5f)
                curveTo(18.414f, 19.5f, 18.75f, 19.836f, 18.75f, 20.25f)
                close()
            }
        }
        .build()
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
