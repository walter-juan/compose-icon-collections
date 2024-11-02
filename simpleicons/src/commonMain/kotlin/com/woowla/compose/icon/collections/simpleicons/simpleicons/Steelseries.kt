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

public val Simpleicons.Steelseries: ImageVector
    get() {
        if (_steelseries != null) {
            return _steelseries!!
        }
        _steelseries = Builder(name = "Steelseries", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.08f, 0.0f)
                curveToRelative(-1.002f, 0.0f, -1.813f, 0.809f, -1.813f, 1.809f)
                verticalLineToRelative(2.572f)
                curveToRelative(-4.019f, 0.744f, -7.195f, 3.912f, -7.939f, 7.92f)
                lineTo(1.813f, 12.301f)
                curveToRelative(-1.001f, 0.0f, -1.813f, 0.807f, -1.813f, 1.807f)
                curveToRelative(0.0f, 0.998f, 0.812f, 1.809f, 1.813f, 1.809f)
                horizontalLineToRelative(2.516f)
                curveTo(5.181f, 20.509f, 9.229f, 24.0f, 14.08f, 24.0f)
                curveTo(19.549f, 24.0f, 24.0f, 19.561f, 24.0f, 14.107f)
                curveToRelative(0.0f, -4.837f, -3.501f, -8.875f, -8.107f, -9.727f)
                lineTo(15.893f, 1.809f)
                curveTo(15.893f, 0.809f, 15.081f, 0.0f, 14.08f, 0.0f)
                close()
                moveTo(4.693f, 3.176f)
                curveToRelative(-1.004f, 0.0f, -1.816f, 0.81f, -1.816f, 1.811f)
                curveToRelative(0.0f, 1.0f, 0.813f, 1.813f, 1.816f, 1.813f)
                curveToRelative(1.001f, 0.0f, 1.816f, -0.813f, 1.816f, -1.813f)
                curveToRelative(0.0f, -1.001f, -0.815f, -1.811f, -1.816f, -1.811f)
                close()
                moveTo(14.08f, 7.832f)
                curveToRelative(3.468f, 0.0f, 6.293f, 2.814f, 6.293f, 6.275f)
                curveToRelative(0.0f, 3.46f, -2.825f, 6.277f, -6.293f, 6.277f)
                curveToRelative(-3.469f, 0.0f, -6.293f, -2.817f, -6.293f, -6.277f)
                curveToRelative(0.0f, -3.461f, 2.824f, -6.275f, 6.293f, -6.275f)
                close()
                moveTo(14.063f, 10.236f)
                curveToRelative(-2.146f, 0.0f, -3.893f, 1.74f, -3.893f, 3.881f)
                reflectiveCurveTo(11.916f, 18.0f, 14.063f, 18.0f)
                curveToRelative(2.146f, 0.0f, 3.893f, -1.742f, 3.893f, -3.883f)
                curveToRelative(0.0f, -2.141f, -1.746f, -3.881f, -3.893f, -3.881f)
                close()
                moveTo(14.063f, 12.953f)
                curveToRelative(0.646f, 0.0f, 1.168f, 0.52f, 1.168f, 1.164f)
                curveToRelative(0.0f, 0.643f, -0.522f, 1.168f, -1.168f, 1.168f)
                curveToRelative(-0.644f, 0.0f, -1.17f, -0.525f, -1.17f, -1.168f)
                curveToRelative(0.0f, -0.644f, 0.526f, -1.164f, 1.17f, -1.164f)
                close()
            }
        }
        .build()
        return _steelseries!!
    }

private var _steelseries: ImageVector? = null
