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

public val Simpleicons.Cinnamon: ImageVector
    get() {
        if (_cinnamon != null) {
            return _cinnamon!!
        }
        _cinnamon = Builder(name = "Cinnamon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.628f, 5.373f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.628f, 0.0f, 12.0f, -5.372f, 12.0f, -12.0f)
                curveToRelative(0.0f, -6.627f, -5.372f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(12.0f, 2.045f)
                curveToRelative(5.498f, 0.0f, 9.955f, 4.457f, 9.955f, 9.955f)
                curveToRelative(0.0f, 0.844f, -0.116f, 1.66f, -0.314f, 2.443f)
                lineToRelative(-4.735f, -5.26f)
                lineToRelative(-6.054f, 6.887f)
                lineToRelative(2.921f, -5.844f)
                lineToRelative(-1.46f, -2.609f)
                lineToRelative(-8.604f, 9.889f)
                arcTo(9.908f, 9.908f, 0.0f, false, true, 2.045f, 12.0f)
                curveToRelative(0.0f, -5.498f, 4.457f, -9.955f, 9.955f, -9.955f)
                close()
            }
        }
        .build()
        return _cinnamon!!
    }

private var _cinnamon: ImageVector? = null
