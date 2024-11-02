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

public val OutlineGroup.CurrencyPound: ImageVector
    get() {
        if (_currencyPound != null) {
            return _currencyPound!!
        }
        _currencyPound = Builder(name = "CurrencyPound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.121f, 7.629f)
                curveTo(12.95f, 6.457f, 11.05f, 6.457f, 9.879f, 7.629f)
                curveTo(9.374f, 8.133f, 9.087f, 8.773f, 9.017f, 9.431f)
                curveTo(8.994f, 9.643f, 9.015f, 9.856f, 9.045f, 10.067f)
                lineTo(9.551f, 13.608f)
                curveTo(9.681f, 14.515f, 9.531f, 15.439f, 9.121f, 16.257f)
                lineTo(9.0f, 16.5f)
                lineTo(10.538f, 15.987f)
                curveTo(11.0f, 15.833f, 11.5f, 15.833f, 11.962f, 15.987f)
                lineTo(12.616f, 16.205f)
                curveTo(13.182f, 16.394f, 13.8f, 16.35f, 14.334f, 16.083f)
                lineTo(15.0f, 15.75f)
                moveTo(8.25f, 12.0f)
                horizontalLineTo(12.0f)
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 16.971f, 16.971f, 21.0f, 12.0f, 21.0f)
                curveTo(7.029f, 21.0f, 3.0f, 16.971f, 3.0f, 12.0f)
                curveTo(3.0f, 7.029f, 7.029f, 3.0f, 12.0f, 3.0f)
                curveTo(16.971f, 3.0f, 21.0f, 7.029f, 21.0f, 12.0f)
                close()
            }
        }
        .build()
        return _currencyPound!!
    }

private var _currencyPound: ImageVector? = null
