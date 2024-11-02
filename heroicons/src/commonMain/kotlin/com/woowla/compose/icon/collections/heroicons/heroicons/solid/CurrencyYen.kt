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

public val SolidGroup.CurrencyYen: ImageVector
    get() {
        if (_currencyYen != null) {
            return _currencyYen!!
        }
        _currencyYen = Builder(name = "CurrencyYen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.25f)
                curveTo(6.615f, 2.25f, 2.25f, 6.615f, 2.25f, 12.0f)
                curveTo(2.25f, 17.385f, 6.615f, 21.75f, 12.0f, 21.75f)
                curveTo(17.385f, 21.75f, 21.75f, 17.385f, 21.75f, 12.0f)
                curveTo(21.75f, 6.615f, 17.385f, 2.25f, 12.0f, 2.25f)
                close()
                moveTo(9.624f, 7.084f)
                curveTo(9.394f, 6.739f, 8.929f, 6.646f, 8.584f, 6.876f)
                curveTo(8.239f, 7.106f, 8.146f, 7.571f, 8.376f, 7.916f)
                lineTo(10.599f, 11.25f)
                horizontalLineTo(9.0f)
                curveTo(8.586f, 11.25f, 8.25f, 11.586f, 8.25f, 12.0f)
                curveTo(8.25f, 12.414f, 8.586f, 12.75f, 9.0f, 12.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(14.25f)
                horizontalLineTo(9.0f)
                curveTo(8.586f, 14.25f, 8.25f, 14.586f, 8.25f, 15.0f)
                curveTo(8.25f, 15.414f, 8.586f, 15.75f, 9.0f, 15.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(17.25f)
                curveTo(11.25f, 17.664f, 11.586f, 18.0f, 12.0f, 18.0f)
                curveTo(12.414f, 18.0f, 12.75f, 17.664f, 12.75f, 17.25f)
                verticalLineTo(15.75f)
                horizontalLineTo(15.0f)
                curveTo(15.414f, 15.75f, 15.75f, 15.414f, 15.75f, 15.0f)
                curveTo(15.75f, 14.586f, 15.414f, 14.25f, 15.0f, 14.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(12.75f)
                horizontalLineTo(15.0f)
                curveTo(15.414f, 12.75f, 15.75f, 12.414f, 15.75f, 12.0f)
                curveTo(15.75f, 11.586f, 15.414f, 11.25f, 15.0f, 11.25f)
                horizontalLineTo(13.401f)
                lineTo(15.624f, 7.916f)
                curveTo(15.854f, 7.571f, 15.761f, 7.106f, 15.416f, 6.876f)
                curveTo(15.071f, 6.646f, 14.606f, 6.739f, 14.376f, 7.084f)
                lineTo(12.0f, 10.648f)
                lineTo(9.624f, 7.084f)
                close()
            }
        }
        .build()
        return _currencyYen!!
    }

private var _currencyYen: ImageVector? = null
