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

public val Simpleicons.Alltrails: ImageVector
    get() {
        if (_alltrails != null) {
            return _alltrails!!
        }
        _alltrails = Builder(name = "Alltrails", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.441f, 8.451f)
                curveToRelative(-0.653f, -1.247f, -1.158f, -1.841f, -1.813f, -1.841f)
                curveToRelative(-0.731f, 0.0f, -1.053f, 0.387f, -1.494f, 1.079f)
                curveToRelative(-0.357f, 0.464f, -0.7f, 1.1f, -1.273f, 1.036f)
                curveToRelative(-0.604f, -0.063f, -0.954f, -1.491f, -1.41f, -2.686f)
                curveToRelative(-0.625f, -1.63f, -0.985f, -3.322f, -2.024f, -3.322f)
                curveToRelative(-0.593f, 0.0f, -1.111f, 0.54f, -1.915f, 1.747f)
                lineToRelative(-8.301f, 12.73f)
                curveToRelative(-0.954f, 1.593f, -1.753f, 2.704f, -0.742f, 3.748f)
                curveToRelative(1.187f, 1.142f, 3.975f, -0.857f, 5.883f, -2.063f)
                curveToRelative(1.908f, -1.205f, 3.859f, -2.38f, 6.615f, -2.316f)
                curveToRelative(3.71f, 0.085f, 5.512f, 3.808f, 7.76f, 4.516f)
                curveToRelative(1.526f, 0.487f, 2.926f, -0.074f, 3.223f, -1.65f)
                curveToRelative(0.174f, -0.866f, -0.129f, -1.707f, -0.547f, -2.604f)
                close()
                moveTo(19.187f, 15.918f)
                curveToRelative(-0.753f, 0.56f, -1.803f, -0.339f, -2.481f, -0.72f)
                curveToRelative(-0.72f, -0.401f, -1.94f, -1.364f, -4.124f, -1.332f)
                curveToRelative(-1.78f, 0.021f, -2.745f, 0.687f, -3.805f, 1.407f)
                curveToRelative(-2.3f, 1.565f, -4.379f, 3.384f, -4.972f, 2.443f)
                curveToRelative(-0.382f, -0.603f, 0.646f, -1.809f, 3.063f, -5.574f)
                curveToRelative(1.718f, -2.676f, 2.927f, -4.813f, 3.785f, -4.813f)
                curveToRelative(0.948f, 0.0f, 1.0f, 0.93f, 1.145f, 1.883f)
                curveToRelative(0.272f, 1.518f, 1.014f, 2.308f, 1.978f, 2.433f)
                curveToRelative(1.08f, 0.146f, 2.014f, -0.76f, 2.756f, -0.751f)
                curveToRelative(0.693f, 0.014f, 1.15f, 1.018f, 1.722f, 2.065f)
                curveToRelative(0.725f, 1.301f, 1.482f, 2.546f, 0.933f, 2.959f)
                close()
            }
        }
        .build()
        return _alltrails!!
    }

private var _alltrails: ImageVector? = null
