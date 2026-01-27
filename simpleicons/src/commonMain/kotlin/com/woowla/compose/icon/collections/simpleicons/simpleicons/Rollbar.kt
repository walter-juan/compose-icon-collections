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

public val Simpleicons.Rollbar: ImageVector
    get() {
        if (_rollbar != null) {
            return _rollbar!!
        }
        _rollbar = Builder(name = "Rollbar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 2.579f)
                curveToRelative(-0.002f, -0.196f, -0.115f, -0.506f, -0.484f, -0.584f)
                curveToRelative(-0.058f, -0.016f, -0.118f, -0.011f, -0.177f, -0.01f)
                curveToRelative(-0.308f, 0.028f, -4.379f, 0.416f, -8.955f, 2.457f)
                curveToRelative(-2.748f, 1.222f, -4.875f, 3.098f, -6.213f, 5.376f)
                lineToRelative(-0.345f, 0.149f)
                curveTo(2.927f, 12.154f, 0.0f, 16.405f, 0.0f, 21.338f)
                verticalLineToRelative(0.083f)
                curveToRelative(0.0f, 0.339f, 0.279f, 0.595f, 0.597f, 0.595f)
                horizontalLineToRelative(16.263f)
                curveToRelative(0.105f, 0.0f, 0.251f, -0.035f, 0.375f, -0.139f)
                lineToRelative(6.553f, -5.525f)
                arcToRelative(0.593f, 0.593f, 0.0f, false, false, 0.212f, -0.46f)
                lineTo(23.999f, 2.579f)
                close()
                moveTo(17.446f, 20.138f)
                lineTo(17.446f, 8.382f)
                lineToRelative(5.362f, -4.519f)
                verticalLineToRelative(11.756f)
                close()
                moveTo(7.368f, 16.491f)
                horizontalLineToRelative(8.885f)
                verticalLineToRelative(4.333f)
                lineTo(2.227f, 20.824f)
                close()
                moveTo(14.868f, 5.532f)
                arcToRelative(30.723f, 30.723f, 0.0f, false, true, 6.531f, -2.043f)
                lineTo(16.606f, 7.53f)
                arcToRelative(30.406f, 30.406f, 0.0f, false, false, -6.489f, 1.528f)
                curveToRelative(1.187f, -1.449f, 2.787f, -2.65f, 4.751f, -3.526f)
                close()
                moveTo(8.978f, 10.772f)
                arcToRelative(30.771f, 30.771f, 0.0f, false, true, 7.275f, -1.995f)
                verticalLineToRelative(6.521f)
                horizontalLineToRelative(-8.494f)
                arcToRelative(10.538f, 10.538f, 0.0f, false, true, 1.219f, -4.526f)
                close()
                moveTo(7.342f, 11.533f)
                arcToRelative(11.807f, 11.807f, 0.0f, false, false, -0.789f, 4.083f)
                lineToRelative(-5.289f, 4.463f)
                curveToRelative(0.4f, -3.626f, 2.553f, -6.659f, 6.077f, -8.546f)
                close()
            }
        }
        .build()
        return _rollbar!!
    }

private var _rollbar: ImageVector? = null
