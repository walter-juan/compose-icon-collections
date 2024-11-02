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

public val OutlineGroup.CurrencyEuro: ImageVector
    get() {
        if (_currencyEuro != null) {
            return _currencyEuro!!
        }
        _currencyEuro = Builder(name = "CurrencyEuro", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.25f, 7.756f)
                curveTo(12.667f, 7.198f, 10.834f, 7.552f, 9.568f, 8.818f)
                curveTo(7.811f, 10.575f, 7.811f, 13.425f, 9.568f, 15.182f)
                curveTo(10.834f, 16.448f, 12.667f, 16.802f, 14.25f, 16.244f)
                moveTo(7.5f, 10.5f)
                horizontalLineTo(12.75f)
                moveTo(7.5f, 13.5f)
                horizontalLineTo(12.75f)
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 16.971f, 16.971f, 21.0f, 12.0f, 21.0f)
                curveTo(7.029f, 21.0f, 3.0f, 16.971f, 3.0f, 12.0f)
                curveTo(3.0f, 7.029f, 7.029f, 3.0f, 12.0f, 3.0f)
                curveTo(16.971f, 3.0f, 21.0f, 7.029f, 21.0f, 12.0f)
                close()
            }
        }
        .build()
        return _currencyEuro!!
    }

private var _currencyEuro: ImageVector? = null
