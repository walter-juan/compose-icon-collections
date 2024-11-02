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

public val Simpleicons.Betterstack: ImageVector
    get() {
        if (_betterstack != null) {
            return _betterstack!!
        }
        _betterstack = Builder(name = "Betterstack", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.779f, 10.748f)
                lineToRelative(-0.765f, 6.638f)
                arcToRelative(2.096f, 2.096f, 0.0f, false, false, 0.696f, 1.812f)
                lineToRelative(1.896f, 1.672f)
                curveToRelative(0.649f, 0.572f, 1.658f, 0.014f, 1.518f, -0.84f)
                lineTo(2.604f, 10.705f)
                curveToRelative(-0.172f, -1.056f, -1.702f, -1.02f, -1.825f, 0.043f)
                close()
                moveTo(13.152f, 19.462f)
                lineTo(8.63f, 6.431f)
                curveToRelative(-0.502f, -1.447f, -2.608f, -1.385f, -3.02f, 0.09f)
                lineToRelative(-1.376f, 4.923f)
                curveToRelative(-0.156f, 0.559f, -0.216f, 0.882f, 0.001f, 1.421f)
                horizontalLineToRelative(0.522f)
                lineToRelative(1.899f, 6.069f)
                curveToRelative(0.294f, 0.732f, 0.902f, 1.301f, 1.661f, 1.554f)
                lineToRelative(2.832f, 0.943f)
                curveToRelative(1.242f, 0.414f, 2.427f, -0.751f, 2.004f, -1.97f)
                close()
                moveTo(23.782f, 18.429f)
                lineTo(15.791f, 3.443f)
                curveToRelative(-0.697f, -1.307f, -2.578f, -1.273f, -3.227f, 0.059f)
                lineToRelative(-1.965f, 3.955f)
                curveToRelative(-0.237f, 0.487f, -0.127f, 0.661f, 0.07f, 0.943f)
                curveToRelative(0.159f, 0.227f, 0.526f, 0.245f, 0.676f, 0.012f)
                curveToRelative(0.147f, -0.229f, 0.488f, -0.208f, 0.606f, 0.038f)
                lineToRelative(5.138f, 10.687f)
                arcToRelative(2.735f, 2.735f, 0.0f, false, false, 2.142f, 1.602f)
                lineToRelative(2.718f, 0.348f)
                curveToRelative(1.463f, 0.192f, 2.53f, -1.354f, 1.834f, -2.658f)
                close()
            }
        }
        .build()
        return _betterstack!!
    }

private var _betterstack: ImageVector? = null
