package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.ShoppingBag: ImageVector
    get() {
        if (_shoppingBag != null) {
            return _shoppingBag!!
        }
        _shoppingBag = Builder(name = "ShoppingBag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.5f, 6.0f)
                verticalLineTo(6.75f)
                horizontalLineTo(5.513f)
                curveTo(4.553f, 6.75f, 3.749f, 7.474f, 3.648f, 8.429f)
                lineTo(2.385f, 20.429f)
                curveTo(2.268f, 21.536f, 3.137f, 22.5f, 4.25f, 22.5f)
                horizontalLineTo(19.75f)
                curveTo(20.864f, 22.5f, 21.732f, 21.536f, 21.615f, 20.429f)
                lineTo(20.352f, 8.429f)
                curveTo(20.251f, 7.474f, 19.447f, 6.75f, 18.487f, 6.75f)
                horizontalLineTo(16.5f)
                verticalLineTo(6.0f)
                curveTo(16.5f, 3.515f, 14.485f, 1.5f, 12.0f, 1.5f)
                curveTo(9.515f, 1.5f, 7.5f, 3.515f, 7.5f, 6.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(10.343f, 3.0f, 9.0f, 4.343f, 9.0f, 6.0f)
                verticalLineTo(6.75f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                curveTo(15.0f, 4.343f, 13.657f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(9.0f, 11.25f)
                curveTo(9.0f, 12.907f, 10.343f, 14.25f, 12.0f, 14.25f)
                curveTo(13.657f, 14.25f, 15.0f, 12.907f, 15.0f, 11.25f)
                verticalLineTo(10.5f)
                curveTo(15.0f, 10.086f, 15.336f, 9.75f, 15.75f, 9.75f)
                curveTo(16.164f, 9.75f, 16.5f, 10.086f, 16.5f, 10.5f)
                verticalLineTo(11.25f)
                curveTo(16.5f, 13.735f, 14.485f, 15.75f, 12.0f, 15.75f)
                curveTo(9.515f, 15.75f, 7.5f, 13.735f, 7.5f, 11.25f)
                verticalLineTo(10.5f)
                curveTo(7.5f, 10.086f, 7.836f, 9.75f, 8.25f, 9.75f)
                curveTo(8.664f, 9.75f, 9.0f, 10.086f, 9.0f, 10.5f)
                verticalLineTo(11.25f)
                close()
            }
        }
        .build()
        return _shoppingBag!!
    }

private var _shoppingBag: ImageVector? = null
