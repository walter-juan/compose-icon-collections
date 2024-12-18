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

public val Simpleicons.Gmx: ImageVector
    get() {
        if (_gmx != null) {
            return _gmx!!
        }
        _gmx = Builder(name = "Gmx", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.904f, 11.571f)
                verticalLineToRelative(1.501f)
                lineTo(5.46f, 13.072f)
                curveToRelative(-0.075f, 0.845f, -0.712f, 1.274f, -1.539f, 1.274f)
                curveToRelative(-1.255f, 0.0f, -1.934f, -1.157f, -1.934f, -2.3f)
                curveToRelative(0.0f, -1.118f, 0.65f, -2.317f, 1.906f, -2.317f)
                curveToRelative(0.77f, 0.0f, 1.321f, 0.468f, 1.586f, 1.166f)
                lineToRelative(1.812f, -0.76f)
                curveTo(6.66f, 8.765f, 5.489f, 8.086f, 3.979f, 8.086f)
                curveTo(1.614f, 8.087f, 0.0f, 9.654f, 0.0f, 12.037f)
                curveToRelative(0.0f, 2.309f, 1.604f, 3.876f, 3.913f, 3.876f)
                curveToRelative(1.227f, 0.0f, 2.308f, -0.439f, 3.025f, -1.44f)
                curveToRelative(0.651f, -0.916f, 0.731f, -1.831f, 0.75f, -2.904f)
                close()
                moveTo(13.65f, 8.3f)
                lineToRelative(-1.586f, 3.95f)
                lineToRelative(-1.5f, -3.95f)
                lineTo(8.67f, 8.3f)
                lineToRelative(-1.255f, 7.392f)
                horizontalLineToRelative(1.91f)
                lineToRelative(0.619f, -4.257f)
                horizontalLineToRelative(0.019f)
                lineToRelative(1.695f, 4.257f)
                horizontalLineToRelative(0.765f)
                lineToRelative(1.775f, -4.257f)
                horizontalLineToRelative(0.024f)
                lineToRelative(0.538f, 4.257f)
                horizontalLineToRelative(1.92f)
                lineTo(15.562f, 8.3f)
                close()
                moveTo(21.358f, 11.773f)
                lineTo(23.444f, 8.298f)
                horizontalLineToRelative(-2.128f)
                lineToRelative(-1.11f, 1.767f)
                lineTo(19.012f, 8.3f)
                lineTo(16.68f, 8.3f)
                lineToRelative(2.459f, 3.47f)
                lineToRelative(-2.46f, 3.922f)
                horizontalLineToRelative(2.333f)
                lineToRelative(1.33f, -2.223f)
                lineToRelative(1.576f, 2.223f)
                lineTo(24.0f, 15.692f)
                lineToRelative(-2.642f, -3.92f)
            }
        }
        .build()
        return _gmx!!
    }

private var _gmx: ImageVector? = null
