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

public val Simpleicons.Kagi: ImageVector
    get() {
        if (_kagi != null) {
            return _kagi!!
        }
        _kagi = Builder(name = "Kagi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.483f, 18.392f)
                horizontalLineToRelative(-5.109f)
                curveToRelative(-1.383f, 0.0f, -1.623f, -1.508f, -1.383f, -2.111f)
                curveToRelative(0.12f, -0.301f, 0.421f, -0.724f, 0.661f, -1.025f)
                curveToRelative(0.962f, 0.543f, 2.104f, 0.844f, 3.306f, 0.844f)
                curveToRelative(3.847f, 0.0f, 6.913f, -3.136f, 6.913f, -6.935f)
                curveToRelative(0.0f, -2.05f, -0.902f, -3.859f, -2.284f, -5.186f)
                lineToRelative(0.181f, -0.181f)
                curveToRelative(0.361f, -0.362f, 0.902f, -0.603f, 1.443f, -0.543f)
                lineToRelative(0.841f, 0.06f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-1.442f)
                curveToRelative(-1.683f, 0.0f, -3.066f, 1.025f, -3.667f, 2.472f)
                curveToRelative(-0.601f, -0.181f, -1.262f, -0.302f, -1.923f, -0.302f)
                curveToRelative(-3.847f, 0.0f, -6.913f, 3.136f, -6.913f, 6.935f)
                curveToRelative(0.0f, 1.508f, 0.481f, 2.955f, 1.322f, 4.101f)
                curveToRelative(-0.12f, 0.121f, -0.301f, 0.241f, -0.421f, 0.301f)
                lineToRelative(-0.18f, 0.181f)
                curveToRelative(-1.383f, 1.327f, -2.044f, 3.015f, -1.683f, 4.945f)
                curveToRelative(0.181f, 1.025f, 1.082f, 2.111f, 1.984f, 2.713f)
                curveToRelative(0.601f, 0.422f, 1.382f, 0.603f, 2.164f, 0.603f)
                lineToRelative(5.771f, -0.241f)
                curveToRelative(0.661f, 0.0f, 1.262f, 0.301f, 1.623f, 0.905f)
                lineTo(16.406f, 24.0f)
                lineToRelative(3.546f, -1.206f)
                lineToRelative(-0.601f, -1.327f)
                curveToRelative(-0.902f, -1.869f, -2.765f, -3.075f, -4.869f, -3.075f)
                moveTo(12.019f, 5.849f)
                curveToRelative(1.803f, 0.0f, 3.306f, 1.508f, 3.306f, 3.316f)
                reflectiveCurveToRelative(-1.503f, 3.317f, -3.306f, 3.317f)
                reflectiveCurveToRelative(-3.306f, -1.508f, -3.306f, -3.317f)
                curveToRelative(0.0f, -1.869f, 1.443f, -3.317f, 3.306f, -3.317f)
            }
        }
        .build()
        return _kagi!!
    }

private var _kagi: ImageVector? = null
