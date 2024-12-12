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

public val Simpleicons.Number1And1: ImageVector
    get() {
        if (_number1And1 != null) {
            return _number1And1!!
        }
        _number1And1 = Builder(name = "Number1And1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(11.717f, 5.792f)
                curveToRelative(1.564f, 0.0f, 2.671f, 1.04f, 2.671f, 2.468f)
                curveToRelative(0.0f, 1.044f, -0.428f, 1.819f, -1.746f, 2.915f)
                lineToRelative(1.952f, 2.648f)
                curveToRelative(0.163f, -0.147f, 0.303f, -1.046f, 0.274f, -1.777f)
                curveToRelative(-0.003f, -0.087f, -0.022f, -0.341f, -0.04f, -0.62f)
                horizontalLineToRelative(1.814f)
                curveToRelative(0.0f, 0.244f, 0.024f, 0.595f, 0.024f, 0.683f)
                curveToRelative(0.0f, 1.426f, -0.224f, 2.327f, -0.909f, 3.198f)
                lineTo(17.2f, 17.22f)
                horizontalLineToRelative(-2.232f)
                lineToRelative(-0.503f, -0.678f)
                curveToRelative(-0.823f, 0.659f, -1.546f, 0.905f, -2.713f, 0.898f)
                curveToRelative(-2.284f, -0.013f, -3.857f, -1.173f, -4.005f, -3.239f)
                curveToRelative(-0.089f, -1.235f, 0.737f, -2.506f, 2.32f, -3.42f)
                curveTo(9.049f, 9.477f, 8.84f, 9.025f, 8.84f, 8.207f)
                curveToRelative(0.0f, -1.392f, 1.191f, -2.415f, 2.878f, -2.415f)
                close()
                moveTo(2.293f, 5.926f)
                horizontalLineToRelative(4.064f)
                verticalLineToRelative(11.296f)
                lineTo(4.1f, 17.222f)
                lineTo(4.1f, 7.735f)
                lineTo(2.293f, 7.735f)
                close()
                moveTo(16.743f, 5.926f)
                horizontalLineToRelative(4.065f)
                verticalLineToRelative(11.296f)
                lineTo(18.55f, 17.222f)
                lineTo(18.55f, 7.735f)
                horizontalLineToRelative(-1.807f)
                close()
                moveTo(11.707f, 7.416f)
                curveToRelative(-0.545f, 0.0f, -0.931f, 0.358f, -0.931f, 0.845f)
                curveToRelative(0.0f, 0.47f, 0.14f, 0.726f, 0.79f, 1.562f)
                curveToRelative(0.772f, -0.557f, 1.058f, -1.075f, 1.058f, -1.58f)
                curveToRelative(0.0f, -0.504f, -0.354f, -0.828f, -0.917f, -0.828f)
                close()
                moveTo(11.19f, 12.227f)
                curveToRelative(-1.002f, 0.663f, -1.404f, 1.31f, -1.386f, 1.919f)
                curveToRelative(0.03f, 0.928f, 0.806f, 1.522f, 1.948f, 1.522f)
                curveToRelative(0.703f, 0.0f, 1.174f, -0.257f, 1.579f, -0.594f)
                close()
            }
        }
        .build()
        return _number1And1!!
    }

private var _number1And1: ImageVector? = null
