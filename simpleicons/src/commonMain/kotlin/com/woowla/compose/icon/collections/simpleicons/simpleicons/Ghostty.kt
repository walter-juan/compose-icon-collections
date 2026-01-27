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

public val Simpleicons.Ghostty: ImageVector
    get() {
        if (_ghostty != null) {
            return _ghostty!!
        }
        _ghostty = Builder(name = "Ghostty", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(6.7f, 0.0f, 2.4f, 4.3f, 2.4f, 9.6f)
                verticalLineToRelative(11.146f)
                curveToRelative(0.0f, 1.772f, 1.45f, 3.267f, 3.222f, 3.254f)
                arcToRelative(3.18f, 3.18f, 0.0f, false, false, 1.955f, -0.686f)
                arcToRelative(1.96f, 1.96f, 0.0f, false, true, 2.444f, 0.0f)
                arcToRelative(3.18f, 3.18f, 0.0f, false, false, 1.976f, 0.686f)
                curveToRelative(0.75f, 0.0f, 1.436f, -0.257f, 1.98f, -0.686f)
                curveToRelative(0.715f, -0.563f, 1.71f, -0.587f, 2.419f, -0.018f)
                curveToRelative(0.59f, 0.476f, 1.355f, 0.743f, 2.182f, 0.699f)
                curveToRelative(1.705f, -0.094f, 3.022f, -1.537f, 3.022f, -3.244f)
                verticalLineTo(9.601f)
                curveTo(21.6f, 4.3f, 17.302f, 0.0f, 12.0f, 0.0f)
                moveTo(6.069f, 6.562f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.46f, 0.131f)
                lineToRelative(3.578f, 2.065f)
                verticalLineToRelative(0.002f)
                arcToRelative(0.974f, 0.974f, 0.0f, false, true, 0.0f, 1.687f)
                lineTo(6.53f, 12.512f)
                arcToRelative(0.975f, 0.975f, 0.0f, false, true, -0.976f, -1.687f)
                lineTo(7.67f, 9.602f)
                lineTo(5.553f, 8.38f)
                arcToRelative(0.975f, 0.975f, 0.0f, false, true, 0.515f, -1.818f)
                moveToRelative(7.438f, 2.063f)
                horizontalLineToRelative(4.7f)
                arcToRelative(0.975f, 0.975f, 0.0f, true, true, 0.0f, 1.95f)
                horizontalLineToRelative(-4.7f)
                arcToRelative(0.975f, 0.975f, 0.0f, false, true, 0.0f, -1.95f)
            }
        }
        .build()
        return _ghostty!!
    }

private var _ghostty: ImageVector? = null
