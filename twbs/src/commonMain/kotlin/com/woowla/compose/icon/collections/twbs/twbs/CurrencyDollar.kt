package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.CurrencyDollar: ImageVector
    get() {
        if (_currencyDollar != null) {
            return _currencyDollar!!
        }
        _currencyDollar = Builder(name = "CurrencyDollar", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 10.781f)
                curveToRelative(0.148f, 1.667f, 1.513f, 2.85f, 3.591f, 3.003f)
                lineTo(7.591f, 15.0f)
                horizontalLineToRelative(1.043f)
                verticalLineToRelative(-1.216f)
                curveToRelative(2.27f, -0.179f, 3.678f, -1.438f, 3.678f, -3.3f)
                curveToRelative(0.0f, -1.59f, -0.947f, -2.51f, -2.956f, -3.028f)
                lineToRelative(-0.722f, -0.187f)
                lineTo(8.634f, 3.467f)
                curveToRelative(1.122f, 0.11f, 1.879f, 0.714f, 2.07f, 1.616f)
                horizontalLineToRelative(1.47f)
                curveToRelative(-0.166f, -1.6f, -1.54f, -2.748f, -3.54f, -2.875f)
                lineTo(8.634f, 1.0f)
                lineTo(7.591f, 1.0f)
                verticalLineToRelative(1.233f)
                curveToRelative(-1.939f, 0.23f, -3.27f, 1.472f, -3.27f, 3.156f)
                curveToRelative(0.0f, 1.454f, 0.966f, 2.483f, 2.661f, 2.917f)
                lineToRelative(0.61f, 0.162f)
                verticalLineToRelative(4.031f)
                curveToRelative(-1.149f, -0.17f, -1.94f, -0.8f, -2.131f, -1.718f)
                close()
                moveTo(7.391f, 6.945f)
                curveToRelative(-1.043f, -0.263f, -1.6f, -0.825f, -1.6f, -1.616f)
                curveToRelative(0.0f, -0.944f, 0.704f, -1.641f, 1.8f, -1.828f)
                verticalLineToRelative(3.495f)
                lineToRelative(-0.2f, -0.05f)
                close()
                moveTo(8.982f, 8.817f)
                curveToRelative(1.287f, 0.323f, 1.852f, 0.859f, 1.852f, 1.769f)
                curveToRelative(0.0f, 1.097f, -0.826f, 1.828f, -2.2f, 1.939f)
                lineTo(8.634f, 8.73f)
                close()
            }
        }
        .build()
        return _currencyDollar!!
    }

private var _currencyDollar: ImageVector? = null
