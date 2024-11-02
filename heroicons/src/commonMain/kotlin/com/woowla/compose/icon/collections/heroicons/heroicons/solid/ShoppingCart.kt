package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) {
            return _shoppingCart!!
        }
        _shoppingCart = Builder(name = "ShoppingCart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.25f, 2.25f)
                curveTo(1.836f, 2.25f, 1.5f, 2.586f, 1.5f, 3.0f)
                curveTo(1.5f, 3.414f, 1.836f, 3.75f, 2.25f, 3.75f)
                horizontalLineTo(3.636f)
                curveTo(3.806f, 3.75f, 3.954f, 3.864f, 3.998f, 4.028f)
                lineTo(6.556f, 13.62f)
                curveTo(4.942f, 14.038f, 3.75f, 15.505f, 3.75f, 17.25f)
                curveTo(3.75f, 17.664f, 4.086f, 18.0f, 4.5f, 18.0f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 18.0f, 21.0f, 17.664f, 21.0f, 17.25f)
                curveTo(21.0f, 16.836f, 20.664f, 16.5f, 20.25f, 16.5f)
                horizontalLineTo(5.378f)
                curveTo(5.687f, 15.626f, 6.52f, 15.0f, 7.5f, 15.0f)
                horizontalLineTo(18.718f)
                curveTo(19.005f, 15.0f, 19.267f, 14.836f, 19.392f, 14.578f)
                curveTo(20.528f, 12.249f, 21.518f, 9.836f, 22.353f, 7.351f)
                curveTo(22.419f, 7.154f, 22.4f, 6.937f, 22.301f, 6.754f)
                curveTo(22.201f, 6.571f, 22.029f, 6.437f, 21.827f, 6.386f)
                curveTo(17.006f, 5.154f, 11.954f, 4.5f, 6.75f, 4.5f)
                curveTo(6.392f, 4.5f, 6.035f, 4.503f, 5.679f, 4.509f)
                lineTo(5.447f, 3.642f)
                curveTo(5.228f, 2.821f, 4.485f, 2.25f, 3.636f, 2.25f)
                horizontalLineTo(2.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 20.25f)
                curveTo(3.75f, 19.422f, 4.422f, 18.75f, 5.25f, 18.75f)
                curveTo(6.078f, 18.75f, 6.75f, 19.422f, 6.75f, 20.25f)
                curveTo(6.75f, 21.078f, 6.078f, 21.75f, 5.25f, 21.75f)
                curveTo(4.422f, 21.75f, 3.75f, 21.078f, 3.75f, 20.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 20.25f)
                curveTo(16.5f, 19.422f, 17.172f, 18.75f, 18.0f, 18.75f)
                curveTo(18.828f, 18.75f, 19.5f, 19.422f, 19.5f, 20.25f)
                curveTo(19.5f, 21.078f, 18.828f, 21.75f, 18.0f, 21.75f)
                curveTo(17.172f, 21.75f, 16.5f, 21.078f, 16.5f, 20.25f)
                close()
            }
        }
        .build()
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
