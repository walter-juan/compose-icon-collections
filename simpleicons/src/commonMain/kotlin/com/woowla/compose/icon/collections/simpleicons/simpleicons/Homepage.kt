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

public val Simpleicons.Homepage: ImageVector
    get() {
        if (_homepage != null) {
            return _homepage!!
        }
        _homepage = Builder(name = "Homepage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.992f, 0.034f)
                curveTo(1.217f, 0.166f, 0.602f, 0.841f, 0.416f, 1.769f)
                curveTo(0.388f, 1.901f, 0.36f, 21.858f, 0.388f, 23.895f)
                curveToRelative(0.0f, 0.181f, 0.0f, 0.181f, 0.923f, -0.593f)
                curveToRelative(0.497f, -0.416f, 1.328f, -1.128f, 1.801f, -1.516f)
                curveToRelative(0.34f, -0.28f, 0.626f, -0.543f, 0.637f, -0.576f)
                curveToRelative(0.011f, -0.039f, 0.022f, -1.148f, 0.017f, -2.466f)
                lineTo(3.76f, 16.35f)
                horizontalLineToRelative(1.516f)
                curveToRelative(0.829f, 0.0f, 1.52f, 0.022f, 1.537f, 0.044f)
                curveToRelative(0.017f, 0.021f, 0.028f, 0.538f, 0.022f, 1.142f)
                curveToRelative(0.0f, 0.61f, 0.011f, 1.104f, 0.022f, 1.104f)
                curveToRelative(0.017f, 0.0f, 0.643f, -0.522f, 0.725f, -0.604f)
                curveToRelative(0.017f, -0.017f, 0.401f, -0.335f, 0.851f, -0.714f)
                curveToRelative(0.923f, -0.77f, 0.917f, -0.764f, 1.373f, -1.148f)
                curveToRelative(0.28f, -0.236f, 0.34f, -0.264f, 0.412f, -0.203f)
                curveToRelative(0.072f, 0.066f, 2.878f, 2.421f, 3.592f, 3.02f)
                arcToRelative(1239.37f, 1239.37f, 0.0f, false, true, 3.932f, 3.306f)
                curveToRelative(0.003f, 0.003f, 2.02f, 1.74f, 2.076f, 1.702f)
                curveToRelative(0.021f, -0.01f, 0.038f, -3.333f, 0.038f, -7.38f)
                curveToRelative(-0.006f, -6.574f, 0.005f, -7.365f, 0.082f, -7.381f)
                curveToRelative(0.044f, -0.011f, 0.895f, -0.017f, 1.884f, -0.017f)
                horizontalLineToRelative(1.801f)
                lineToRelative(-0.022f, -3.761f)
                curveToRelative(-0.005f, -2.07f, -0.033f, -3.817f, -0.05f, -3.877f)
                curveToRelative(-0.142f, -0.495f, -0.51f, -1.022f, -0.883f, -1.28f)
                curveToRelative(-0.473f, -0.318f, 0.164f, -0.302f, -10.566f, -0.302f)
                curveToRelative(-5.442f, -0.005f, -9.99f, 0.011f, -10.11f, 0.033f)
                close()
            }
        }
        .build()
        return _homepage!!
    }

private var _homepage: ImageVector? = null
