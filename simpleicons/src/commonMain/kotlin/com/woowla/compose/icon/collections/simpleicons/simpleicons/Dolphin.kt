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

public val Simpleicons.Dolphin: ImageVector
    get() {
        if (_dolphin != null) {
            return _dolphin!!
        }
        _dolphin = Builder(name = "Dolphin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.195f, 5.308f)
                arcToRelative(6.61f, 6.61f, 0.0f, false, false, -0.804f, 0.026f)
                curveToRelative(-1.223f, 0.108f, -1.834f, 0.504f, -2.135f, 0.691f)
                curveToRelative(-0.135f, 0.083f, -0.344f, 0.1f, -0.518f, 0.062f)
                curveToRelative(-3.518f, -1.08f, -6.743f, -0.62f, -8.363f, -0.142f)
                curveToRelative(-3.228f, 0.951f, -3.893f, 2.885f, -4.098f, 3.978f)
                curveToRelative(-0.07f, 0.295f, -0.093f, 0.532f, -0.13f, 0.67f)
                curveToRelative(-0.115f, 0.443f, -1.565f, 1.225f, -1.029f, 1.78f)
                curveToRelative(0.517f, 0.534f, 1.423f, 0.478f, 2.08f, 0.216f)
                curveToRelative(1.494f, -0.592f, 2.652f, -0.809f, 4.599f, -0.882f)
                horizontalLineToRelative(0.021f)
                curveToRelative(0.181f, -0.003f, 0.338f, -0.034f, 0.475f, 0.091f)
                curveToRelative(0.16f, 0.149f, 0.708f, 1.308f, 1.927f, 2.16f)
                curveToRelative(1.363f, 0.953f, 2.772f, 0.913f, 2.86f, 0.768f)
                verticalLineToRelative(-0.002f)
                horizontalLineToRelative(0.002f)
                lineToRelative(0.002f, -0.002f)
                verticalLineToRelative(-0.002f)
                curveToRelative(0.036f, -0.12f, -0.315f, -0.2f, -1.063f, -1.13f)
                curveToRelative(-0.646f, -0.804f, -0.592f, -1.645f, 0.036f, -1.49f)
                arcToRelative(0.591f, 0.591f, 0.0f, false, false, 0.04f, 0.007f)
                curveToRelative(3.447f, 0.901f, 5.748f, 2.922f, 5.868f, 2.947f)
                verticalLineToRelative(0.002f)
                horizontalLineToRelative(0.002f)
                lineToRelative(0.002f, -0.002f)
                lineToRelative(0.002f, -0.002f)
                verticalLineToRelative(-0.008f)
                curveToRelative(0.166f, -0.229f, -0.958f, -2.957f, -3.871f, -4.586f)
                curveToRelative(-3.297f, -1.843f, -6.389f, -0.971f, -7.061f, -0.693f)
                curveToRelative(-0.162f, -0.272f, 0.967f, -1.383f, 3.377f, -1.476f)
                curveToRelative(5.4f, -0.209f, 8.744f, 2.753f, 10.578f, 4.56f)
                curveToRelative(2.25f, 2.217f, 3.923f, 5.853f, 3.973f, 5.846f)
                lineToRelative(0.002f, -0.002f)
                horizontalLineToRelative(0.002f)
                verticalLineToRelative(-0.004f)
                horizontalLineToRelative(0.004f)
                curveToRelative(0.12f, -0.125f, -0.2f, -2.393f, -0.885f, -4.045f)
                curveToRelative(-0.881f, -2.126f, -1.966f, -3.69f, -3.525f, -5.148f)
                arcToRelative(15.572f, 15.572f, 0.0f, false, false, -2.153f, -1.69f)
                curveToRelative(-0.114f, -0.079f, -0.254f, -0.183f, -0.337f, -0.328f)
                curveToRelative(0.434f, -1.003f, 2.046f, -1.04f, 2.213f, -1.13f)
                lineToRelative(0.007f, -0.005f)
                lineToRelative(0.002f, -0.002f)
                verticalLineToRelative(-0.002f)
                lineToRelative(0.002f, -0.004f)
                curveToRelative(0.085f, -0.183f, -0.424f, -0.966f, -2.107f, -1.023f)
                close()
            }
        }
        .build()
        return _dolphin!!
    }

private var _dolphin: ImageVector? = null
