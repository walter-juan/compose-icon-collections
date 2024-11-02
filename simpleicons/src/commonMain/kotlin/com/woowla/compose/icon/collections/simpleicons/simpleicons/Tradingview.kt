package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Tradingview: ImageVector
    get() {
        if (_tradingview != null) {
            return _tradingview!!
        }
        _tradingview = Builder(name = "Tradingview", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.865f, 8.279f)
                curveToRelative(0.0f, 1.354f, -1.098f, 2.452f, -2.452f, 2.452f)
                curveToRelative(-1.354f, 0.0f, -2.452f, -1.098f, -2.452f, -2.452f)
                curveToRelative(0.0f, -1.354f, 1.098f, -2.452f, 2.452f, -2.452f)
                curveToRelative(1.354f, 0.0f, 2.452f, 1.098f, 2.452f, 2.452f)
                close()
                moveTo(9.75f, 6.0f)
                lineTo(0.0f, 6.0f)
                verticalLineToRelative(4.904f)
                horizontalLineToRelative(4.846f)
                verticalLineToRelative(7.269f)
                lineTo(9.75f, 18.173f)
                close()
                moveTo(18.346f, 6.0f)
                lineTo(24.0f, 6.0f)
                lineToRelative(-5.106f, 12.173f)
                horizontalLineToRelative(-5.654f)
                close()
            }
        }
        .build()
        return _tradingview!!
    }

private var _tradingview: ImageVector? = null
