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

public val Simpleicons.Binance: ImageVector
    get() {
        if (_binance != null) {
            return _binance!!
        }
        _binance = Builder(name = "Binance", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.624f, 13.92f)
                lineToRelative(2.717f, 2.715f)
                lineToRelative(-7.353f, 7.353f)
                lineToRelative(-7.353f, -7.352f)
                lineToRelative(2.717f, -2.716f)
                lineToRelative(4.635f, 4.66f)
                lineToRelative(4.636f, -4.66f)
                close()
                moveTo(21.261f, 9.284f)
                lineTo(24.0f, 12.0f)
                lineToRelative(-2.715f, 2.716f)
                lineTo(18.568f, 12.0f)
                lineToRelative(2.692f, -2.716f)
                close()
                moveTo(11.989f, 9.285f)
                lineToRelative(2.716f, 2.691f)
                lineToRelative(-2.716f, 2.717f)
                verticalLineToRelative(-0.001f)
                lineTo(9.272f, 12.0f)
                lineToRelative(2.716f, -2.715f)
                close()
                moveTo(2.716f, 9.284f)
                lineTo(5.409f, 12.0f)
                lineToRelative(-2.691f, 2.692f)
                lineTo(0.0f, 12.0f)
                lineToRelative(2.716f, -2.716f)
                close()
                moveTo(11.988f, 0.012f)
                lineToRelative(7.353f, 7.329f)
                lineToRelative(-2.717f, 2.715f)
                lineToRelative(-4.636f, -4.636f)
                lineToRelative(-4.635f, 4.66f)
                lineToRelative(-2.717f, -2.715f)
                lineToRelative(7.353f, -7.353f)
                close()
            }
        }
        .build()
        return _binance!!
    }

private var _binance: ImageVector? = null
