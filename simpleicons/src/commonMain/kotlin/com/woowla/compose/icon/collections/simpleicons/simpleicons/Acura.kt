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

public val Simpleicons.Acura: ImageVector
    get() {
        if (_acura != null) {
            return _acura!!
        }
        _acura = Builder(name = "Acura", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.77f, 10.908f)
                curveToRelative(-0.23f, -4.018f, -1.492f, -6.89f, -3.33f, -8.496f)
                curveTo(18.489f, 0.689f, 14.814f, 0.0f, 12.057f, 0.0f)
                curveToRelative(-2.87f, 0.0f, -6.43f, 0.689f, -8.382f, 2.412f)
                curveTo(1.839f, 4.019f, 0.46f, 7.004f, 0.23f, 10.908f)
                curveToRelative(-0.23f, 3.675f, 0.574f, 7.81f, 2.641f, 10.106f)
                curveTo(4.823f, 23.31f, 8.843f, 24.0f, 11.943f, 24.0f)
                reflectiveCurveToRelative(7.12f, -0.689f, 9.072f, -2.986f)
                curveToRelative(2.18f, -2.296f, 2.986f, -6.316f, 2.755f, -10.106f)
                moveToRelative(-12.4f, -9.761f)
                horizontalLineToRelative(1.377f)
                verticalLineToRelative(8.73f)
                horizontalLineTo(11.37f)
                close()
                moveTo(1.839f, 14.585f)
                curveToRelative(-0.116f, -1.493f, -0.575f, -6.89f, 1.607f, -9.99f)
                curveToRelative(0.919f, -1.38f, 2.182f, -2.297f, 3.56f, -2.757f)
                curveToRelative(1.838f, -0.689f, 4.134f, -0.689f, 4.134f, -0.689f)
                curveToRelative(-0.919f, 2.181f, -2.641f, 6.89f, -2.985f, 7.924f)
                curveToRelative(-0.46f, 1.263f, -0.804f, 1.952f, -1.15f, 4.248f)
                curveToRelative(-0.229f, 1.838f, -0.688f, 6.546f, -0.688f, 8.612f)
                curveToRelative(-2.641f, -1.262f, -4.133f, -3.56f, -4.478f, -7.35f)
                moveToRelative(15.847f, 7.466f)
                curveToRelative(-1.723f, 0.803f, -3.905f, 0.918f, -5.628f, 0.918f)
                curveToRelative(-1.722f, 0.0f, -3.903f, -0.23f, -5.626f, -0.918f)
                curveToRelative(0.574f, -1.607f, 3.33f, -8.269f, 4.823f, -10.91f)
                horizontalLineToRelative(1.608f)
                curveToRelative(1.493f, 2.643f, 4.248f, 9.417f, 4.823f, 10.91f)
                moveToRelative(4.592f, -7.466f)
                curveToRelative(-0.344f, 3.79f, -1.837f, 6.088f, -4.363f, 7.35f)
                curveToRelative(-0.115f, -2.066f, -0.459f, -6.774f, -0.689f, -8.612f)
                curveToRelative(-0.345f, -2.296f, -0.688f, -2.985f, -1.148f, -4.248f)
                curveToRelative(-0.345f, -1.034f, -2.182f, -5.742f, -2.986f, -7.924f)
                curveToRelative(0.0f, 0.0f, 2.181f, 0.0f, 4.134f, 0.69f)
                curveToRelative(1.378f, 0.458f, 2.642f, 1.377f, 3.56f, 2.756f)
                curveToRelative(1.952f, 3.1f, 1.607f, 8.497f, 1.493f, 9.99f)
            }
        }
        .build()
        return _acura!!
    }

private var _acura: ImageVector? = null
