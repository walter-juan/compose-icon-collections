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

public val Twbs.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }
        _fire = Builder(name = "Fire", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                curveToRelative(3.314f, 0.0f, 6.0f, -2.0f, 6.0f, -5.5f)
                curveToRelative(0.0f, -1.5f, -0.5f, -4.0f, -2.5f, -6.0f)
                curveToRelative(0.25f, 1.5f, -1.25f, 2.0f, -1.25f, 2.0f)
                curveTo(11.0f, 4.0f, 9.0f, 0.5f, 6.0f, 0.0f)
                curveToRelative(0.357f, 2.0f, 0.5f, 4.0f, -2.0f, 6.0f)
                curveToRelative(-1.25f, 1.0f, -2.0f, 2.729f, -2.0f, 4.5f)
                curveTo(2.0f, 14.0f, 4.686f, 16.0f, 8.0f, 16.0f)
                moveToRelative(0.0f, -1.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.0f, -3.0f, -2.75f)
                curveToRelative(0.0f, -0.75f, 0.25f, -2.0f, 1.25f, -3.0f)
                curveTo(6.125f, 10.0f, 7.0f, 10.5f, 7.0f, 10.5f)
                curveToRelative(-0.375f, -1.25f, 0.5f, -3.25f, 2.0f, -3.5f)
                curveToRelative(-0.179f, 1.0f, -0.25f, 2.0f, 1.0f, 3.0f)
                curveToRelative(0.625f, 0.5f, 1.0f, 1.364f, 1.0f, 2.25f)
                curveTo(11.0f, 14.0f, 9.657f, 15.0f, 8.0f, 15.0f)
            }
        }
        .build()
        return _fire!!
    }

private var _fire: ImageVector? = null
