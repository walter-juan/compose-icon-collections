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

public val Simpleicons.Rime: ImageVector
    get() {
        if (_rime != null) {
            return _rime!!
        }
        _rime = Builder(name = "Rime", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.733f, 0.0f)
                lineTo(2.267f, 0.0f)
                curveTo(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.267f)
                verticalLineToRelative(19.466f)
                curveTo(0.0f, 23.0f, 1.0f, 24.0f, 2.267f, 24.0f)
                horizontalLineToRelative(19.466f)
                curveTo(23.0f, 24.0f, 24.0f, 23.0f, 24.0f, 21.733f)
                lineTo(24.0f, 2.267f)
                curveTo(24.0f, 1.0f, 22.933f, 0.0f, 21.733f, 0.0f)
                close()
                moveTo(20.133f, 20.667f)
                lineTo(19.8f, 20.667f)
                curveToRelative(-0.6f, 0.0f, -5.933f, -0.134f, -7.733f, -0.134f)
                curveToRelative(-1.934f, 0.0f, -7.867f, 0.134f, -7.934f, 0.134f)
                lineTo(3.8f, 20.667f)
                verticalLineToRelative(-1.134f)
                lineTo(3.733f, 18.4f)
                horizontalLineToRelative(0.334f)
                curveToRelative(0.066f, 0.0f, 4.2f, -0.2f, 6.733f, -0.267f)
                verticalLineToRelative(-2.466f)
                curveToRelative(-2.733f, -0.134f, -4.667f, -0.867f, -5.933f, -2.134f)
                curveToRelative(-1.934f, -2.0f, -1.8f, -4.866f, -1.734f, -7.933f)
                verticalLineToRelative(-0.867f)
                lineToRelative(2.4f, 0.067f)
                verticalLineToRelative(0.933f)
                curveToRelative(-0.066f, 2.6f, -0.2f, 4.867f, 1.067f, 6.134f)
                curveToRelative(0.8f, 0.8f, 2.133f, 1.266f, 4.2f, 1.4f)
                lineTo(10.8f, 3.533f)
                horizontalLineToRelative(2.4f)
                lineTo(13.2f, 13.2f)
                curveToRelative(2.0f, -0.133f, 3.4f, -0.6f, 4.2f, -1.4f)
                curveToRelative(1.2f, -1.267f, 1.133f, -3.533f, 1.067f, -6.133f)
                verticalLineToRelative(-0.934f)
                lineToRelative(2.4f, -0.066f)
                verticalLineToRelative(0.866f)
                curveToRelative(0.133f, 3.067f, 0.2f, 5.934f, -1.734f, 7.934f)
                curveToRelative(-1.266f, 1.266f, -3.2f, 2.0f, -5.933f, 2.133f)
                verticalLineToRelative(2.467f)
                curveToRelative(2.467f, 0.066f, 6.667f, 0.266f, 6.733f, 0.266f)
                horizontalLineToRelative(0.334f)
                lineToRelative(-0.067f, 1.134f)
                close()
            }
        }
        .build()
        return _rime!!
    }

private var _rime: ImageVector? = null
