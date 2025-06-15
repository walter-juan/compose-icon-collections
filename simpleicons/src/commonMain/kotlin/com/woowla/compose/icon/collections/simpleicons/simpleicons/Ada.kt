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

public val Simpleicons.Ada: ImageVector
    get() {
        if (_ada != null) {
            return _ada!!
        }
        _ada = Builder(name = "Ada", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.869f, 13.45f)
                curveToRelative(0.0f, -0.428f, 0.45f, -0.585f, 1.18f, -0.663f)
                curveToRelative(0.606f, -0.068f, 1.09f, -0.169f, 1.404f, -0.371f)
                verticalLineToRelative(0.539f)
                curveToRelative(0.0f, 0.644f, -0.542f, 0.957f, -1.265f, 1.028f)
                arcToRelative(47.006f, 47.0f, 0.0f, false, false, -0.925f, -0.077f)
                curveToRelative(-0.25f, -0.095f, -0.394f, -0.256f, -0.394f, -0.457f)
                moveToRelative(-13.99f, 0.19f)
                horizontalLineToRelative(3.113f)
                lineToRelative(0.256f, 0.755f)
                arcToRelative(33.004f, 33.0f, 0.0f, false, false, -3.96f, 0.97f)
                close()
                moveTo(6.43f, 9.056f)
                lineToRelative(1.09f, 3.202f)
                lineTo(5.34f, 12.258f)
                close()
                moveTo(13.351f, 10.662f)
                curveToRelative(0.82f, 0.0f, 1.483f, 0.742f, 1.483f, 1.663f)
                curveToRelative(0.0f, 0.651f, -0.348f, 1.212f, -0.852f, 1.473f)
                arcToRelative(47.006f, 47.0f, 0.0f, false, false, -1.152f, 0.053f)
                curveToRelative(-0.562f, -0.227f, -0.961f, -0.812f, -0.961f, -1.526f)
                curveToRelative(0.0f, -0.944f, 0.663f, -1.663f, 1.483f, -1.663f)
                moveToRelative(9.484f, 3.657f)
                verticalLineToRelative(-3.072f)
                curveToRelative(0.0f, -0.461f, -0.18f, -1.978f, -2.529f, -1.978f)
                curveToRelative(-1.516f, 0.0f, -2.572f, 0.82f, -2.718f, 1.921f)
                horizontalLineToRelative(1.483f)
                curveToRelative(0.134f, -0.494f, 0.741f, -0.73f, 1.27f, -0.73f)
                curveToRelative(0.662f, 0.0f, 1.055f, 0.247f, 1.055f, 0.55f)
                curveToRelative(0.0f, 0.472f, -0.685f, 0.585f, -1.651f, 0.675f)
                curveToRelative(-1.28f, 0.112f, -2.37f, 0.449f, -2.37f, 1.752f)
                quadToRelative(0.0f, 0.194f, 0.035f, 0.367f)
                arcToRelative(51.006f, 51.0f, 0.0f, false, false, -1.092f, -0.028f)
                lineTo(16.319f, 6.844f)
                horizontalLineToRelative(-1.484f)
                verticalLineToRelative(3.123f)
                arcToRelative(2.43f, 2.43f, 0.0f, false, false, -1.707f, -0.674f)
                curveToRelative(-1.505f, 0.0f, -2.752f, 1.303f, -2.752f, 3.022f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, false, 0.474f, 1.702f)
                arcToRelative(38.005f, 38.0f, 0.0f, false, false, -1.12f, 0.14f)
                lineTo(7.376f, 7.406f)
                lineTo(5.498f, 7.406f)
                lineToRelative(-2.992f, 8.587f)
                arcTo(22.003f, 22.0f, 0.0f, false, false, 0.0f, 17.156f)
                curveToRelative(3.835f, -1.673f, 13.295f, -3.938f, 24.0f, -2.55f)
                curveToRelative(-0.051f, -0.057f, -0.466f, -0.166f, -1.164f, -0.286f)
            }
        }
        .build()
        return _ada!!
    }

private var _ada: ImageVector? = null
