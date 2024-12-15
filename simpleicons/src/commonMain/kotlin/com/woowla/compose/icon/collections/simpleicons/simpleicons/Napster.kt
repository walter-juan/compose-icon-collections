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

public val Simpleicons.Napster: ImageVector
    get() {
        if (_napster != null) {
            return _napster!!
        }
        _napster = Builder(name = "Napster", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.495f, 4.543f)
                curveToRelative(-0.22f, 0.0f, -0.438f, 0.0f, -0.657f, 0.03f)
                horizontalLineToRelative(-0.031f)
                lineToRelative(-0.032f, -0.03f)
                curveTo(17.93f, 2.21f, 15.02f, 0.798f, 12.015f, 0.798f)
                curveToRelative(-3.004f, 0.0f, -5.945f, 1.412f, -7.76f, 3.775f)
                lineToRelative(-0.031f, 0.03f)
                horizontalLineToRelative(-0.031f)
                curveToRelative(-0.22f, -0.03f, -0.439f, -0.03f, -0.658f, -0.03f)
                lineTo(2.16f, 4.573f)
                verticalLineToRelative(2.394f)
                lineToRelative(-0.032f, 0.03f)
                arcTo(3.628f, 3.628f, 0.0f, false, false, 0.0f, 10.282f)
                curveToRelative(0.0f, 1.412f, 0.844f, 2.701f, 2.127f, 3.284f)
                horizontalLineToRelative(0.063f)
                verticalLineToRelative(0.062f)
                curveToRelative(0.031f, 5.278f, 4.443f, 9.575f, 9.825f, 9.575f)
                reflectiveCurveToRelative(9.794f, -4.297f, 9.825f, -9.575f)
                verticalLineToRelative(-0.062f)
                lineToRelative(0.032f, -0.03f)
                curveTo(23.155f, 12.92f, 24.0f, 11.632f, 24.0f, 10.25f)
                curveToRelative(0.0f, -1.412f, -0.845f, -2.7f, -2.128f, -3.284f)
                lineToRelative(-0.032f, -0.03f)
                lineTo(21.84f, 4.542f)
                close()
                moveTo(6.821f, 5.34f)
                arcToRelative(7.443f, 7.443f, 0.0f, false, true, 5.194f, -2.117f)
                curveToRelative(1.94f, 0.0f, 3.818f, 0.767f, 5.195f, 2.117f)
                lineToRelative(0.062f, 0.062f)
                lineToRelative(-0.094f, 0.061f)
                curveToRelative(-0.375f, 0.215f, -0.72f, 0.43f, -1.064f, 0.675f)
                lineToRelative(-0.03f, 0.031f)
                lineToRelative(-0.032f, -0.03f)
                curveToRelative(-0.908f, -0.461f, -2.347f, -0.983f, -4.005f, -0.983f)
                reflectiveCurveToRelative(-3.098f, 0.522f, -4.006f, 0.982f)
                lineToRelative(-0.03f, 0.031f)
                lineToRelative(-0.032f, -0.03f)
                arcToRelative(10.22f, 10.22f, 0.0f, false, false, -1.064f, -0.676f)
                lineToRelative(-0.188f, -0.061f)
                close()
                moveTo(19.15f, 13.535f)
                curveToRelative(0.0f, 3.866f, -3.223f, 7.027f, -7.166f, 7.027f)
                curveToRelative(-3.942f, 0.0f, -7.134f, -3.16f, -7.134f, -7.027f)
                lineTo(4.85f, 7.458f)
                lineToRelative(0.094f, 0.03f)
                curveToRelative(1.252f, 0.308f, 2.44f, 1.658f, 2.722f, 1.996f)
                curveToRelative(0.313f, -0.338f, 1.784f, -1.658f, 4.35f, -1.658f)
                curveToRelative(2.565f, 0.0f, 4.036f, 1.35f, 4.35f, 1.658f)
                curveToRelative(0.28f, -0.338f, 1.438f, -1.688f, 2.721f, -1.995f)
                lineToRelative(0.094f, -0.031f)
                verticalLineToRelative(6.077f)
                close()
            }
        }
        .build()
        return _napster!!
    }

private var _napster: ImageVector? = null
