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

public val Simpleicons.Nubank: ImageVector
    get() {
        if (_nubank != null) {
            return _nubank!!
        }
        _nubank = Builder(name = "Nubank", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.28f, 5.434f)
                curveToRelative(-1.181f, 0.0f, -2.185f, 0.463f, -2.943f, 1.252f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.054f, -0.002f, -0.107f, -0.002f, -0.162f, -0.002f)
                curveToRelative(-1.544f, 0.0f, -2.993f, 0.883f, -3.699f, 2.256f)
                curveToRelative(-0.309f, 0.6f, -0.423f, 1.244f, -0.459f, 1.9f)
                curveToRelative(-0.032f, 0.589f, 0.0f, 1.186f, 0.0f, 1.77f)
                verticalLineToRelative(5.652f)
                lineTo(3.184f, 18.262f)
                reflectiveCurveToRelative(0.002f, -2.784f, 0.0f, -5.178f)
                curveToRelative(-0.001f, -1.611f, -0.012f, -3.047f, 0.0f, -3.342f)
                curveToRelative(0.056f, -1.394f, 0.437f, -2.305f, 1.148f, -3.051f)
                curveToRelative(2.359f, 0.002f, 3.885f, 1.609f, 3.97f, 4.168f)
                curveToRelative(0.02f, 0.587f, 0.025f, 3.73f, 0.025f, 3.73f)
                verticalLineToRelative(3.672f)
                horizontalLineToRelative(3.168f)
                verticalLineToRelative(-4.965f)
                curveToRelative(0.0f, -1.501f, 0.013f, -2.801f, -0.092f, -3.695f)
                curveToRelative(-0.292f, -2.5f, -1.821f, -4.168f, -4.125f, -4.168f)
                close()
                moveTo(15.67f, 5.734f)
                lineToRelative(-3.166f, 0.004f)
                verticalLineToRelative(4.965f)
                curveToRelative(0.0f, 1.501f, -0.013f, 2.801f, 0.092f, 3.695f)
                curveToRelative(0.292f, 2.5f, 1.821f, 4.168f, 4.125f, 4.168f)
                curveToRelative(1.181f, 0.0f, 2.185f, -0.463f, 2.943f, -1.252f)
                curveToRelative(0.0f, -0.0f, 0.002f, 0.0f, 0.002f, 0.0f)
                curveToRelative(0.054f, 0.002f, 0.109f, 0.002f, 0.164f, 0.002f)
                curveToRelative(1.543f, 0.0f, 2.99f, -0.883f, 3.697f, -2.256f)
                curveToRelative(0.309f, -0.6f, 0.423f, -1.244f, 0.459f, -1.9f)
                curveToRelative(0.032f, -0.589f, 0.0f, -1.186f, 0.0f, -1.77f)
                lineTo(23.986f, 5.738f)
                lineTo(20.816f, 5.738f)
                reflectiveCurveToRelative(-0.002f, 2.784f, 0.0f, 5.178f)
                curveToRelative(0.002f, 1.611f, 0.012f, 3.047f, 0.0f, 3.342f)
                curveToRelative(-0.056f, 1.393f, -0.437f, 2.305f, -1.148f, 3.051f)
                curveToRelative(-2.359f, -0.002f, -3.885f, -1.609f, -3.971f, -4.168f)
                curveToRelative(-0.02f, -0.587f, -0.027f, -2.044f, -0.027f, -3.732f)
                close()
            }
        }
        .build()
        return _nubank!!
    }

private var _nubank: ImageVector? = null
