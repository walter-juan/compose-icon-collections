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

public val Twbs.Screwdriver: ImageVector
    get() {
        if (_screwdriver != null) {
            return _screwdriver!!
        }
        _screwdriver = Builder(name = "Screwdriver", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.995f)
                lineTo(0.995f, 0.0f)
                lineToRelative(3.064f, 2.19f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.417f, 0.809f)
                verticalLineToRelative(0.07f)
                curveToRelative(0.0f, 0.264f, 0.105f, 0.517f, 0.291f, 0.704f)
                lineToRelative(5.677f, 5.676f)
                lineToRelative(0.909f, -0.303f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.018f, 0.24f)
                lineToRelative(3.338f, 3.339f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, true, 0.0f, 1.406f)
                lineTo(14.13f, 15.71f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, true, -1.406f, 0.0f)
                lineToRelative(-3.337f, -3.34f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.24f, -1.018f)
                lineToRelative(0.302f, -0.909f)
                lineToRelative(-5.676f, -5.677f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.704f, -0.291f)
                lineTo(3.0f, 4.475f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.81f, -0.417f)
                close()
                moveTo(11.293f, 10.59f)
                arcToRelative(0.497f, 0.497f, 0.0f, true, false, -0.703f, 0.703f)
                lineToRelative(2.984f, 2.984f)
                arcToRelative(0.497f, 0.497f, 0.0f, false, false, 0.703f, -0.703f)
                close()
            }
        }
        .build()
        return _screwdriver!!
    }

private var _screwdriver: ImageVector? = null
