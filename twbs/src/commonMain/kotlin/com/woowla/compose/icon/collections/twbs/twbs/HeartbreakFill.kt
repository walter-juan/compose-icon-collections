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

public val Twbs.HeartbreakFill: ImageVector
    get() {
        if (_heartbreakFill != null) {
            return _heartbreakFill!!
        }
        _heartbreakFill = Builder(name = "HeartbreakFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.931f, 0.586f)
                lineTo(7.0f, 3.0f)
                lineToRelative(1.5f, 4.0f)
                lineToRelative(-2.0f, 3.0f)
                lineTo(8.0f, 15.0f)
                curveTo(22.534f, 5.396f, 13.757f, -2.21f, 8.931f, 0.586f)
                moveTo(7.358f, 0.77f)
                lineTo(5.5f, 3.0f)
                lineTo(7.0f, 7.0f)
                lineToRelative(-1.5f, 3.0f)
                lineToRelative(1.815f, 4.537f)
                curveTo(-6.533f, 4.96f, 2.685f, -2.467f, 7.358f, 0.77f)
            }
        }
        .build()
        return _heartbreakFill!!
    }

private var _heartbreakFill: ImageVector? = null
