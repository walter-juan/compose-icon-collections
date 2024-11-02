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

public val SolidGroup.CurrencyBangladeshi: ImageVector
    get() {
        if (_currencyBangladeshi != null) {
            return _currencyBangladeshi!!
        }
        _currencyBangladeshi = Builder(name = "CurrencyBangladeshi", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 21.75f)
                curveTo(17.385f, 21.75f, 21.75f, 17.385f, 21.75f, 12.0f)
                curveTo(21.75f, 6.615f, 17.385f, 2.25f, 12.0f, 2.25f)
                curveTo(6.615f, 2.25f, 2.25f, 6.615f, 2.25f, 12.0f)
                curveTo(2.25f, 17.385f, 6.615f, 21.75f, 12.0f, 21.75f)
                close()
                moveTo(10.5f, 7.963f)
                curveTo(10.5f, 6.848f, 9.327f, 6.123f, 8.329f, 6.622f)
                lineTo(7.915f, 6.829f)
                curveTo(7.544f, 7.014f, 7.394f, 7.465f, 7.579f, 7.835f)
                curveTo(7.765f, 8.206f, 8.215f, 8.356f, 8.586f, 8.171f)
                lineTo(9.0f, 7.963f)
                verticalLineTo(9.75f)
                horizontalLineTo(8.25f)
                curveTo(7.836f, 9.75f, 7.5f, 10.086f, 7.5f, 10.5f)
                curveTo(7.5f, 10.914f, 7.836f, 11.25f, 8.25f, 11.25f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.938f)
                curveTo(9.0f, 16.501f, 9.26f, 17.136f, 9.867f, 17.463f)
                curveTo(10.503f, 17.806f, 11.23f, 18.0f, 12.0f, 18.0f)
                curveTo(14.178f, 18.0f, 15.993f, 16.454f, 16.41f, 14.399f)
                curveTo(16.609f, 13.422f, 15.774f, 12.75f, 14.995f, 12.75f)
                horizontalLineTo(14.25f)
                curveTo(13.836f, 12.75f, 13.5f, 13.086f, 13.5f, 13.5f)
                curveTo(13.5f, 13.914f, 13.836f, 14.25f, 14.25f, 14.25f)
                horizontalLineTo(14.906f)
                curveTo(14.573f, 15.544f, 13.398f, 16.5f, 12.0f, 16.5f)
                curveTo(11.484f, 16.5f, 11.001f, 16.371f, 10.579f, 16.143f)
                curveTo(10.567f, 16.137f, 10.551f, 16.124f, 10.534f, 16.092f)
                curveTo(10.516f, 16.057f, 10.5f, 16.004f, 10.5f, 15.938f)
                verticalLineTo(11.25f)
                horizontalLineTo(15.75f)
                curveTo(16.164f, 11.25f, 16.5f, 10.914f, 16.5f, 10.5f)
                curveTo(16.5f, 10.086f, 16.164f, 9.75f, 15.75f, 9.75f)
                horizontalLineTo(10.5f)
                verticalLineTo(7.963f)
                close()
            }
        }
        .build()
        return _currencyBangladeshi!!
    }

private var _currencyBangladeshi: ImageVector? = null
