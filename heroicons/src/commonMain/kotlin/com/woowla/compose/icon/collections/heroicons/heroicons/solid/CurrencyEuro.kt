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

public val SolidGroup.CurrencyEuro: ImageVector
    get() {
        if (_currencyEuro != null) {
            return _currencyEuro!!
        }
        _currencyEuro = Builder(name = "CurrencyEuro", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(10.098f, 9.348f)
                curveTo(11.153f, 8.294f, 12.68f, 7.998f, 14.001f, 8.464f)
                curveTo(14.391f, 8.601f, 14.819f, 8.396f, 14.957f, 8.006f)
                curveTo(15.095f, 7.615f, 14.89f, 7.187f, 14.499f, 7.049f)
                curveTo(12.655f, 6.398f, 10.516f, 6.81f, 9.038f, 8.288f)
                curveTo(8.6f, 8.725f, 8.256f, 9.221f, 8.005f, 9.75f)
                horizontalLineTo(7.5f)
                curveTo(7.086f, 9.75f, 6.75f, 10.086f, 6.75f, 10.5f)
                curveTo(6.75f, 10.914f, 7.086f, 11.25f, 7.5f, 11.25f)
                horizontalLineTo(7.554f)
                curveTo(7.482f, 11.747f, 7.482f, 12.253f, 7.554f, 12.75f)
                horizontalLineTo(7.5f)
                curveTo(7.086f, 12.75f, 6.75f, 13.086f, 6.75f, 13.5f)
                curveTo(6.75f, 13.914f, 7.086f, 14.25f, 7.5f, 14.25f)
                horizontalLineTo(8.005f)
                curveTo(8.256f, 14.779f, 8.6f, 15.275f, 9.038f, 15.712f)
                curveTo(10.516f, 17.19f, 12.655f, 17.602f, 14.499f, 16.951f)
                curveTo(14.89f, 16.813f, 15.095f, 16.385f, 14.957f, 15.994f)
                curveTo(14.819f, 15.604f, 14.391f, 15.399f, 14.001f, 15.536f)
                curveTo(12.68f, 16.002f, 11.153f, 15.706f, 10.098f, 14.652f)
                curveTo(9.971f, 14.524f, 9.855f, 14.39f, 9.749f, 14.25f)
                horizontalLineTo(12.75f)
                curveTo(13.164f, 14.25f, 13.5f, 13.914f, 13.5f, 13.5f)
                curveTo(13.5f, 13.086f, 13.164f, 12.75f, 12.75f, 12.75f)
                horizontalLineTo(9.075f)
                curveTo(8.975f, 12.255f, 8.975f, 11.745f, 9.075f, 11.25f)
                horizontalLineTo(12.75f)
                curveTo(13.164f, 11.25f, 13.5f, 10.914f, 13.5f, 10.5f)
                curveTo(13.5f, 10.086f, 13.164f, 9.75f, 12.75f, 9.75f)
                horizontalLineTo(9.749f)
                curveTo(9.855f, 9.61f, 9.971f, 9.476f, 10.098f, 9.348f)
                close()
            }
        }
        .build()
        return _currencyEuro!!
    }

private var _currencyEuro: ImageVector? = null
