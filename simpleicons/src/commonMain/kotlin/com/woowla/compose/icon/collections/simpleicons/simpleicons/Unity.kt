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

public val Simpleicons.Unity: ImageVector
    get() {
        if (_unity != null) {
            return _unity!!
        }
        _unity = Builder(name = "Unity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.929f, 4.294f)
                lineToRelative(3.8f, 2.193f)
                curveToRelative(0.137f, 0.077f, 0.141f, 0.29f, 0.0f, 0.368f)
                lineToRelative(-4.515f, 2.608f)
                arcToRelative(0.419f, 0.419f, 0.0f, false, true, -0.425f, 0.0f)
                lineTo(7.274f, 6.854f)
                curveToRelative(-0.139f, -0.075f, -0.141f, -0.293f, 0.0f, -0.368f)
                lineToRelative(3.797f, -2.193f)
                verticalLineTo(0.0f)
                lineTo(1.376f, 5.598f)
                verticalLineTo(16.793f)
                lineToRelative(3.718f, -2.146f)
                verticalLineToRelative(-4.386f)
                curveToRelative(-0.002f, -0.156f, 0.181f, -0.268f, 0.318f, -0.184f)
                lineToRelative(4.515f, 2.608f)
                arcToRelative(0.425f, 0.425f, 0.0f, false, true, 0.214f, 0.368f)
                verticalLineToRelative(5.213f)
                curveToRelative(0.002f, 0.156f, -0.181f, 0.268f, -0.318f, 0.184f)
                lineToRelative(-3.8f, -2.193f)
                lineToRelative(-3.718f, 2.146f)
                lineTo(12.0f, 24.0f)
                lineToRelative(9.695f, -5.598f)
                lineToRelative(-3.718f, -2.146f)
                lineToRelative(-3.8f, 2.193f)
                curveToRelative(-0.134f, 0.082f, -0.323f, -0.025f, -0.318f, -0.184f)
                verticalLineTo(13.053f)
                curveToRelative(0.0f, -0.156f, 0.087f, -0.296f, 0.214f, -0.368f)
                lineToRelative(4.515f, -2.608f)
                curveToRelative(0.134f, -0.082f, 0.323f, 0.022f, 0.318f, 0.184f)
                verticalLineToRelative(4.386f)
                lineToRelative(3.718f, 2.146f)
                verticalLineTo(5.598f)
                lineTo(12.929f, 0.0f)
                close()
            }
        }
        .build()
        return _unity!!
    }

private var _unity: ImageVector? = null
