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

public val Simpleicons.Mingww64: ImageVector
    get() {
        if (_mingww64 != null) {
            return _mingww64!!
        }
        _mingww64 = Builder(name = "Mingww64", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(-0.0f, 9.396f)
                lineToRelative(4.187f, -4.187f)
                lineToRelative(4.187f, 4.187f)
                lineToRelative(-4.187f, 4.187f)
                close()
                moveTo(-0.0f, 19.813f)
                lineTo(4.187f, 15.626f)
                lineTo(8.374f, 19.813f)
                lineTo(4.187f, 24.0f)
                close()
                moveTo(5.208f, 14.604f)
                lineTo(9.395f, 10.417f)
                lineTo(13.582f, 14.604f)
                lineTo(9.395f, 18.791f)
                close()
                moveTo(5.208f, 4.187f)
                lineTo(9.395f, 0.0f)
                lineTo(13.582f, 4.187f)
                lineTo(9.395f, 8.374f)
                close()
                moveTo(10.417f, 9.395f)
                lineTo(14.604f, 5.208f)
                lineTo(18.791f, 9.396f)
                lineTo(14.604f, 13.582f)
                close()
                moveTo(15.625f, 4.187f)
                lineTo(19.812f, 0.0f)
                lineToRelative(4.187f, 4.187f)
                lineToRelative(-4.187f, 4.187f)
                close()
                moveTo(10.417f, 19.813f)
                lineTo(14.604f, 15.626f)
                lineTo(18.791f, 19.813f)
                lineTo(14.604f, 24.0f)
                close()
                moveTo(15.626f, 14.604f)
                lineTo(19.813f, 10.417f)
                lineTo(24.0f, 14.604f)
                lineTo(19.813f, 18.792f)
                close()
            }
        }
        .build()
        return _mingww64!!
    }

private var _mingww64: ImageVector? = null
