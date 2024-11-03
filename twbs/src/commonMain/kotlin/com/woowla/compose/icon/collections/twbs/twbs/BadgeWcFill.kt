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

public val Twbs.BadgeWcFill: ImageVector
    get() {
        if (_badgeWcFill != null) {
            return _badgeWcFill!!
        }
        _badgeWcFill = Builder(name = "BadgeWcFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(2.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(11.666f, 5.89f)
                curveToRelative(0.682f, 0.0f, 1.139f, 0.47f, 1.187f, 1.107f)
                lineTo(14.0f, 6.997f)
                verticalLineToRelative(-0.11f)
                curveToRelative(-0.053f, -1.187f, -1.024f, -2.0f, -2.342f, -2.0f)
                curveToRelative(-1.604f, 0.0f, -2.518f, 1.05f, -2.518f, 2.751f)
                verticalLineToRelative(0.747f)
                curveToRelative(0.0f, 1.7f, 0.905f, 2.73f, 2.518f, 2.73f)
                curveToRelative(1.314f, 0.0f, 2.285f, -0.792f, 2.342f, -1.939f)
                verticalLineToRelative(-0.114f)
                horizontalLineToRelative(-1.147f)
                curveToRelative(-0.048f, 0.615f, -0.497f, 1.05f, -1.187f, 1.05f)
                curveToRelative(-0.839f, 0.0f, -1.318f, -0.62f, -1.318f, -1.727f)
                verticalLineToRelative(-0.742f)
                curveToRelative(0.0f, -1.112f, 0.488f, -1.754f, 1.318f, -1.754f)
                close()
                moveTo(5.478f, 6.816f)
                horizontalLineToRelative(0.044f)
                lineTo(6.542f, 11.0f)
                horizontalLineToRelative(1.006f)
                lineTo(9.0f, 5.001f)
                lineTo(7.818f, 5.001f)
                lineToRelative(-0.82f, 4.355f)
                horizontalLineToRelative(-0.056f)
                lineTo(5.97f, 5.001f)
                horizontalLineToRelative(-0.94f)
                lineToRelative(-0.972f, 4.355f)
                horizontalLineToRelative(-0.053f)
                lineToRelative(-0.827f, -4.355f)
                lineTo(2.0f, 5.001f)
                lineTo(3.452f, 11.0f)
                horizontalLineToRelative(1.005f)
                close()
            }
        }
        .build()
        return _badgeWcFill!!
    }

private var _badgeWcFill: ImageVector? = null
