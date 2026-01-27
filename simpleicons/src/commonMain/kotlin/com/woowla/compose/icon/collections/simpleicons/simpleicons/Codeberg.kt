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

public val Simpleicons.Codeberg: ImageVector
    get() {
        if (_codeberg != null) {
            return _codeberg!!
        }
        _codeberg = Builder(name = "Codeberg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.999f, 0.747f)
                arcTo(11.974f, 11.974f, 0.0f, false, false, 0.0f, 12.75f)
                curveToRelative(0.0f, 2.254f, 0.635f, 4.465f, 1.833f, 6.376f)
                lineTo(11.837f, 6.19f)
                curveToRelative(0.072f, -0.092f, 0.251f, -0.092f, 0.323f, 0.0f)
                lineToRelative(4.178f, 5.402f)
                horizontalLineToRelative(-2.992f)
                lineToRelative(0.065f, 0.239f)
                horizontalLineToRelative(3.113f)
                lineToRelative(0.882f, 1.138f)
                horizontalLineToRelative(-3.674f)
                lineToRelative(0.103f, 0.374f)
                horizontalLineToRelative(3.86f)
                lineToRelative(0.777f, 1.003f)
                horizontalLineToRelative(-4.358f)
                lineToRelative(0.135f, 0.483f)
                horizontalLineToRelative(4.593f)
                lineToRelative(0.695f, 0.894f)
                horizontalLineToRelative(-5.038f)
                lineToRelative(0.165f, 0.589f)
                horizontalLineToRelative(5.326f)
                lineToRelative(0.609f, 0.785f)
                horizontalLineToRelative(-5.717f)
                lineToRelative(0.182f, 0.65f)
                horizontalLineToRelative(6.038f)
                lineToRelative(0.562f, 0.727f)
                horizontalLineToRelative(-6.397f)
                lineToRelative(0.183f, 0.65f)
                horizontalLineToRelative(6.717f)
                arcTo(12.003f, 12.003f, 0.0f, false, false, 24.0f, 12.75f)
                arcTo(11.977f, 11.977f, 0.0f, false, false, 11.999f, 0.747f)
                close()
                moveTo(15.653f, 19.851f)
                lineTo(15.835f, 20.501f)
                horizontalLineToRelative(5.326f)
                curveToRelative(0.173f, -0.204f, 0.353f, -0.433f, 0.513f, -0.65f)
                close()
                moveTo(16.038f, 21.228f)
                lineTo(16.218f, 21.878f)
                horizontalLineToRelative(3.563f)
                curveToRelative(0.233f, -0.198f, 0.485f, -0.428f, 0.712f, -0.65f)
                close()
                moveTo(16.421f, 22.605f)
                lineTo(16.603f, 23.253f)
                horizontalLineToRelative(1.203f)
                curveToRelative(0.356f, -0.204f, 0.685f, -0.412f, 1.042f, -0.648f)
                close()
                close()
            }
        }
        .build()
        return _codeberg!!
    }

private var _codeberg: ImageVector? = null
