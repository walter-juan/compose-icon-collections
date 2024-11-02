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

public val OutlineGroup.CurrencyBangladeshi: ImageVector
    get() {
        if (_currencyBangladeshi != null) {
            return _currencyBangladeshi!!
        }
        _currencyBangladeshi = Builder(name = "CurrencyBangladeshi", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.25f, 7.5f)
                lineTo(8.665f, 7.293f)
                curveTo(9.163f, 7.043f, 9.75f, 7.406f, 9.75f, 7.963f)
                verticalLineTo(10.5f)
                moveTo(9.75f, 10.5f)
                horizontalLineTo(15.75f)
                moveTo(9.75f, 10.5f)
                horizontalLineTo(8.25f)
                moveTo(9.75f, 10.5f)
                verticalLineTo(15.938f)
                curveTo(9.75f, 16.292f, 9.911f, 16.635f, 10.223f, 16.803f)
                curveTo(10.752f, 17.088f, 11.357f, 17.25f, 12.0f, 17.25f)
                curveTo(13.814f, 17.25f, 15.328f, 15.962f, 15.675f, 14.25f)
                curveTo(15.758f, 13.841f, 15.412f, 13.5f, 14.995f, 13.5f)
                horizontalLineTo(14.25f)
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 16.971f, 16.971f, 21.0f, 12.0f, 21.0f)
                curveTo(7.029f, 21.0f, 3.0f, 16.971f, 3.0f, 12.0f)
                curveTo(3.0f, 7.029f, 7.029f, 3.0f, 12.0f, 3.0f)
                curveTo(16.971f, 3.0f, 21.0f, 7.029f, 21.0f, 12.0f)
                close()
            }
        }
        .build()
        return _currencyBangladeshi!!
    }

private var _currencyBangladeshi: ImageVector? = null
