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

public val Twbs.CurrencyPound: ImageVector
    get() {
        if (_currencyPound != null) {
            return _currencyPound!!
        }
        _currencyPound = Builder(name = "CurrencyPound", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 8.585f)
                horizontalLineToRelative(1.969f)
                curveToRelative(0.115f, 0.465f, 0.186f, 0.939f, 0.186f, 1.43f)
                curveToRelative(0.0f, 1.385f, -0.736f, 2.496f, -2.075f, 2.771f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(-1.24f)
                horizontalLineTo(6.492f)
                verticalLineToRelative(-0.129f)
                curveToRelative(0.825f, -0.525f, 1.135f, -1.446f, 1.135f, -2.694f)
                curveToRelative(0.0f, -0.465f, -0.07f, -0.913f, -0.168f, -1.352f)
                horizontalLineToRelative(3.29f)
                verticalLineToRelative(-0.972f)
                horizontalLineTo(7.22f)
                curveToRelative(-0.186f, -0.723f, -0.372f, -1.455f, -0.372f, -2.247f)
                curveToRelative(0.0f, -1.274f, 1.047f, -2.066f, 2.58f, -2.066f)
                arcToRelative(5.3f, 5.3f, 0.0f, false, true, 2.103f, 0.465f)
                verticalLineTo(2.456f)
                arcTo(5.6f, 5.6f, 0.0f, false, false, 9.348f, 2.0f)
                curveTo(6.865f, 2.0f, 5.322f, 3.291f, 5.322f, 5.366f)
                curveToRelative(0.0f, 0.775f, 0.195f, 1.515f, 0.399f, 2.247f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _currencyPound!!
    }

private var _currencyPound: ImageVector? = null
