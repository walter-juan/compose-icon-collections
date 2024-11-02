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

public val OutlineGroup.CurrencyDollar: ImageVector
    get() {
        if (_currencyDollar != null) {
            return _currencyDollar!!
        }
        _currencyDollar = Builder(name = "CurrencyDollar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                verticalLineTo(18.0f)
                moveTo(9.0f, 15.182f)
                lineTo(9.879f, 15.841f)
                curveTo(11.05f, 16.72f, 12.95f, 16.72f, 14.121f, 15.841f)
                curveTo(15.293f, 14.962f, 15.293f, 13.538f, 14.121f, 12.659f)
                curveTo(13.535f, 12.22f, 12.768f, 12.0f, 12.0f, 12.0f)
                curveTo(11.275f, 12.0f, 10.55f, 11.78f, 9.997f, 11.341f)
                curveTo(8.891f, 10.462f, 8.891f, 9.038f, 9.997f, 8.159f)
                curveTo(11.103f, 7.28f, 12.896f, 7.28f, 14.003f, 8.159f)
                lineTo(14.417f, 8.489f)
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 16.971f, 16.971f, 21.0f, 12.0f, 21.0f)
                curveTo(7.029f, 21.0f, 3.0f, 16.971f, 3.0f, 12.0f)
                curveTo(3.0f, 7.029f, 7.029f, 3.0f, 12.0f, 3.0f)
                curveTo(16.971f, 3.0f, 21.0f, 7.029f, 21.0f, 12.0f)
                close()
            }
        }
        .build()
        return _currencyDollar!!
    }

private var _currencyDollar: ImageVector? = null
