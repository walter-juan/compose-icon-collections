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

public val Twbs.CurrencyYen: ImageVector
    get() {
        if (_currencyYen != null) {
            return _currencyYen!!
        }
        _currencyYen = Builder(name = "CurrencyYen", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.75f, 14.0f)
                verticalLineToRelative(-2.629f)
                horizontalLineToRelative(2.446f)
                verticalLineToRelative(-0.967f)
                horizontalLineTo(8.75f)
                verticalLineToRelative(-1.31f)
                horizontalLineToRelative(2.445f)
                verticalLineToRelative(-0.967f)
                horizontalLineTo(9.128f)
                lineTo(12.5f, 2.0f)
                horizontalLineToRelative(-1.699f)
                lineTo(8.047f, 7.327f)
                horizontalLineToRelative(-0.086f)
                lineTo(5.207f, 2.0f)
                horizontalLineTo(3.5f)
                lineToRelative(3.363f, 6.127f)
                horizontalLineTo(4.778f)
                verticalLineToRelative(0.968f)
                horizontalLineTo(7.25f)
                verticalLineToRelative(1.31f)
                horizontalLineTo(4.78f)
                verticalLineToRelative(0.966f)
                horizontalLineToRelative(2.47f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(1.502f)
                close()
            }
        }
        .build()
        return _currencyYen!!
    }

private var _currencyYen: ImageVector? = null
