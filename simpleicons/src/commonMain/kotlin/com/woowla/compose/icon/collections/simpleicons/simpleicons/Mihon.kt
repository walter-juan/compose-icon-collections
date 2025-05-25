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

public val Simpleicons.Mihon: ImageVector
    get() {
        if (_mihon != null) {
            return _mihon!!
        }
        _mihon = Builder(name = "Mihon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.292f, 5.102f)
                lineTo(3.117f, 1.055f)
                curveToRelative(0.527f, 0.101f, 1.156f, 0.126f, 2.588f, 0.126f)
                curveToRelative(1.734f, 0.0f, 4.02f, -0.101f, 5.202f, -0.251f)
                curveToRelative(0.503f, -0.05f, 0.704f, -0.126f, 1.03f, -0.302f)
                lineToRelative(2.715f, 2.312f)
                curveToRelative(-0.251f, 0.352f, -0.326f, 0.503f, -0.603f, 1.207f)
                curveToRelative(-0.225f, 0.553f, -1.257f, 3.744f, -1.659f, 5.102f)
                curveToRelative(1.86f, 0.376f, 2.89f, 0.654f, 4.297f, 1.231f)
                curveToRelative(0.177f, -1.231f, 0.201f, -1.884f, 0.201f, -4.122f)
                curveToRelative(0.0f, -0.577f, -0.024f, -0.905f, -0.101f, -1.432f)
                lineToRelative(4.373f, 0.151f)
                curveToRelative(-0.126f, 0.603f, -0.151f, 0.855f, -0.177f, 1.834f)
                curveToRelative(-0.101f, 2.363f, -0.201f, 3.493f, -0.452f, 5.202f)
                curveToRelative(1.735f, 0.881f, 1.735f, 0.881f, 2.614f, 1.357f)
                curveToRelative(0.452f, 0.251f, 0.553f, 0.302f, 0.855f, 0.402f)
                lineToRelative(-1.458f, 4.699f)
                curveToRelative(-0.704f, -0.627f, -1.683f, -1.307f, -3.117f, -2.111f)
                curveToRelative(-1.255f, 2.99f, -3.342f, 5.178f, -6.508f, 6.911f)
                curveToRelative(-1.056f, -1.408f, -1.86f, -2.262f, -3.143f, -3.266f)
                curveToRelative(1.86f, -0.881f, 2.715f, -1.433f, 3.696f, -2.363f)
                curveToRelative(0.955f, -0.931f, 1.583f, -1.836f, 2.186f, -3.191f)
                curveToRelative(-1.609f, -0.73f, -2.638f, -1.056f, -4.424f, -1.434f)
                curveToRelative(-1.03f, 3.066f, -1.858f, 5.027f, -2.588f, 6.208f)
                curveToRelative(-0.979f, 1.583f, -2.313f, 2.413f, -3.845f, 2.413f)
                curveToRelative(-1.181f, 0.0f, -2.387f, -0.529f, -3.268f, -1.432f)
                curveTo(0.527f, 19.275f, 0.0f, 17.844f, 0.0f, 16.185f)
                curveToRelative(0.0f, -2.463f, 1.181f, -4.599f, 3.242f, -5.932f)
                curveToRelative(1.333f, -0.853f, 2.739f, -1.231f, 4.977f, -1.356f)
                curveToRelative(0.452f, -1.484f, 0.829f, -2.765f, 1.181f, -4.197f)
                curveToRelative(-1.106f, 0.101f, -2.487f, 0.175f, -4.172f, 0.251f)
                curveToRelative(-0.903f, 0.024f, -1.205f, 0.05f, -1.935f, 0.151f)
                close()
                moveTo(7.112f, 12.742f)
                curveToRelative(-1.182f, 0.201f, -1.886f, 0.577f, -2.513f, 1.382f)
                curveToRelative(-0.477f, 0.553f, -0.704f, 1.207f, -0.704f, 1.91f)
                curveToRelative(0.0f, 0.778f, 0.378f, 1.357f, 0.855f, 1.357f)
                curveToRelative(0.577f, 0.0f, 1.231f, -1.307f, 2.363f, -4.649f)
                close()
            }
        }
        .build()
        return _mihon!!
    }

private var _mihon: ImageVector? = null
