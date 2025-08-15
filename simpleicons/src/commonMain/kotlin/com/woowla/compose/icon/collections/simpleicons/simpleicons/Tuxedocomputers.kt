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

public val Simpleicons.Tuxedocomputers: ImageVector
    get() {
        if (_tuxedocomputers != null) {
            return _tuxedocomputers!!
        }
        _tuxedocomputers = Builder(name = "Tuxedocomputers", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.958f, 11.13f)
                lineToRelative(4.597f, 7.444f)
                horizontalLineToRelative(-3.509f)
                lineToRelative(-2.94f, -4.921f)
                lineToRelative(-4.333f, 6.365f)
                lineTo(24.0f, 19.968f)
                curveToRelative(-0.074f, 0.725f, -0.144f, 1.45f, -0.215f, 2.174f)
                curveToRelative(-12.391f, 0.052f, -7.537f, 0.105f, -19.928f, 0.105f)
                lineToRelative(7.192f, -10.223f)
                lineToRelative(-4.06f, -6.666f)
                horizontalLineToRelative(3.497f)
                lineToRelative(2.386f, 4.096f)
                lineToRelative(3.49f, -5.515f)
                curveTo(5.202f, 3.887f, 11.17f, 3.987f, 0.0f, 3.963f)
                lineTo(0.223f, 1.8f)
                curveToRelative(12.392f, -0.015f, 7.498f, -0.046f, 19.889f, -0.046f)
                close()
            }
        }
        .build()
        return _tuxedocomputers!!
    }

private var _tuxedocomputers: ImageVector? = null
