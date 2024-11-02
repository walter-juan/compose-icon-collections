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

public val Simpleicons.Nextdotjs: ImageVector
    get() {
        if (_nextdotjs != null) {
            return _nextdotjs!!
        }
        _nextdotjs = Builder(name = "Nextdotjs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.665f, 21.978f)
                curveTo(16.758f, 23.255f, 14.465f, 24.0f, 12.0f, 24.0f)
                curveTo(5.377f, 24.0f, 0.0f, 18.623f, 0.0f, 12.0f)
                reflectiveCurveTo(5.377f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.377f, 12.0f, 12.0f)
                curveToRelative(0.0f, 3.583f, -1.574f, 6.801f, -4.067f, 9.001f)
                lineTo(9.219f, 7.2f)
                lineTo(7.2f, 7.2f)
                verticalLineToRelative(9.596f)
                horizontalLineToRelative(1.615f)
                lineTo(8.815f, 9.251f)
                lineToRelative(9.85f, 12.727f)
                close()
                moveTo(15.333f, 13.445f)
                lineTo(16.933f, 15.506f)
                lineTo(16.933f, 7.2f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(6.245f)
                close()
            }
        }
        .build()
        return _nextdotjs!!
    }

private var _nextdotjs: ImageVector? = null
