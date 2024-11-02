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

public val Simpleicons.Rclone: ImageVector
    get() {
        if (_rclone != null) {
            return _rclone!!
        }
        _rclone = Builder(name = "Rclone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.842f, 0.626f)
                curveTo(9.365f, 0.681f, 6.975f, 1.991f, 5.646f, 4.293f)
                curveToRelative(-0.759f, 1.314f, -1.065f, 2.766f, -0.966f, 4.174f)
                arcToRelative(7.99f, 7.99f, 0.0f, false, true, 2.657f, -0.454f)
                lineToRelative(1.47f, -0.001f)
                curveToRelative(-0.009f, -0.559f, 0.124f, -1.128f, 0.424f, -1.648f)
                curveToRelative(0.883f, -1.528f, 2.837f, -2.052f, 4.365f, -1.169f)
                curveToRelative(1.528f, 0.882f, 2.052f, 2.837f, 1.169f, 4.365f)
                lineToRelative(-1.478f, 2.565f)
                lineToRelative(1.196f, 2.071f)
                lineToRelative(2.391f, -0.0f)
                lineToRelative(1.477f, -2.566f)
                curveToRelative(2.026f, -3.509f, 0.824f, -7.996f, -2.685f, -10.022f)
                curveTo(14.461f, 0.912f, 13.14f, 0.597f, 11.842f, 0.626f)
                moveToRelative(-1.545f, 8.073f)
                lineToRelative(-2.961f, 0.003f)
                curveTo(3.284f, 8.702f, 0.0f, 11.987f, 0.0f, 16.038f)
                curveToRelative(0.0f, 4.052f, 3.284f, 7.337f, 7.336f, 7.337f)
                curveToRelative(1.517f, 0.0f, 2.927f, -0.461f, 4.097f, -1.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.72f, -2.075f)
                lineToRelative(-0.737f, -1.273f)
                curveToRelative(-0.48f, 0.288f, -1.039f, 0.456f, -1.64f, 0.456f)
                curveToRelative(-1.765f, 0.0f, -3.196f, -1.431f, -3.196f, -3.196f)
                curveToRelative(0.0f, -1.765f, 1.431f, -3.195f, 3.196f, -3.195f)
                lineToRelative(2.96f, -0.002f)
                lineToRelative(1.196f, -2.071f)
                close()
                moveTo(19.884f, 9.446f)
                arcToRelative(7.99f, 7.99f, 0.0f, false, true, -0.935f, 2.528f)
                lineToRelative(-0.734f, 1.275f)
                curveToRelative(0.489f, 0.272f, 0.915f, 0.672f, 1.215f, 1.192f)
                curveToRelative(0.882f, 1.528f, 0.359f, 3.483f, -1.17f, 4.365f)
                curveToRelative(-1.528f, 0.882f, -3.483f, 0.359f, -4.365f, -1.17f)
                lineToRelative(-1.482f, -2.563f)
                horizontalLineToRelative(-2.391f)
                lineTo(8.826f, 17.144f)
                lineToRelative(1.483f, 2.563f)
                curveToRelative(2.026f, 3.509f, 6.513f, 4.711f, 10.022f, 2.685f)
                curveToRelative(3.509f, -2.026f, 4.711f, -6.512f, 2.685f, -10.022f)
                curveToRelative(-0.759f, -1.314f, -1.863f, -2.305f, -3.132f, -2.924f)
            }
        }
        .build()
        return _rclone!!
    }

private var _rclone: ImageVector? = null
