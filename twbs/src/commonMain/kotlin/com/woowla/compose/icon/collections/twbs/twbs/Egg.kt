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

public val Twbs.Egg: ImageVector
    get() {
        if (_egg != null) {
            return _egg!!
        }
        _egg = Builder(name = "Egg", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 15.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -5.0f, -5.0f)
                curveToRelative(0.0f, -1.956f, 0.69f, -4.286f, 1.742f, -6.12f)
                curveToRelative(0.524f, -0.913f, 1.112f, -1.658f, 1.704f, -2.164f)
                curveTo(7.044f, 1.206f, 7.572f, 1.0f, 8.0f, 1.0f)
                reflectiveCurveToRelative(0.956f, 0.206f, 1.554f, 0.716f)
                curveToRelative(0.592f, 0.506f, 1.18f, 1.251f, 1.704f, 2.164f)
                curveTo(12.31f, 5.714f, 13.0f, 8.044f, 13.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -5.0f, 5.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                curveToRelative(0.0f, -4.314f, -3.0f, -10.0f, -6.0f, -10.0f)
                reflectiveCurveTo(2.0f, 5.686f, 2.0f, 10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
            }
        }
        .build()
        return _egg!!
    }

private var _egg: ImageVector? = null
