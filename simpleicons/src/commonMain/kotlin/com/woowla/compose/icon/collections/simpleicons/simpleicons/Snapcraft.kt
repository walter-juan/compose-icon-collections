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

public val Simpleicons.Snapcraft: ImageVector
    get() {
        if (_snapcraft != null) {
            return _snapcraft!!
        }
        _snapcraft = Builder(name = "Snapcraft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.17f, 11.335f)
                arcToRelative(0.106f, 0.106f, 0.0f, false, false, -0.173f, 0.022f)
                lineTo(1.754f, 23.466f)
                arcToRelative(0.105f, 0.105f, 0.0f, false, false, 0.032f, 0.133f)
                curveToRelative(0.04f, 0.029f, 0.101f, 0.027f, 0.138f, -0.012f)
                lineToRelative(8.89f, -9.11f)
                arcToRelative(0.107f, 0.107f, 0.0f, false, false, 0.005f, -0.144f)
                lineToRelative(-2.649f, -3.0f)
                close()
                moveTo(17.93f, 7.816f)
                lineTo(0.146f, 0.39f)
                curveTo(0.041f, 0.346f, -0.047f, 0.478f, 0.028f, 0.56f)
                lineToRelative(12.034f, 12.874f)
                arcToRelative(0.11f, 0.11f, 0.0f, false, false, 0.075f, 0.034f)
                arcToRelative(0.102f, 0.102f, 0.0f, false, false, 0.075f, -0.03f)
                lineTo(17.96f, 7.99f)
                arcToRelative(0.106f, 0.106f, 0.0f, false, false, -0.032f, -0.174f)
                close()
                moveTo(23.977f, 8.363f)
                lineTo(21.789f, 3.958f)
                arcToRelative(0.21f, 0.21f, 0.0f, false, false, -0.189f, -0.117f)
                horizontalLineToRelative(-8.77f)
                arcToRelative(0.212f, 0.212f, 0.0f, false, false, -0.08f, 0.408f)
                lineToRelative(10.96f, 4.405f)
                arcToRelative(0.211f, 0.211f, 0.0f, false, false, 0.268f, -0.29f)
                close()
            }
        }
        .build()
        return _snapcraft!!
    }

private var _snapcraft: ImageVector? = null
