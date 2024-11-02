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

public val Simpleicons.Redis: ImageVector
    get() {
        if (_redis != null) {
            return _redis!!
        }
        _redis = Builder(name = "Redis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.71f, 13.145f)
                curveToRelative(-1.66f, 2.092f, -3.452f, 4.483f, -7.038f, 4.483f)
                curveToRelative(-3.203f, 0.0f, -4.397f, -2.825f, -4.48f, -5.12f)
                curveToRelative(0.701f, 1.484f, 2.073f, 2.685f, 4.214f, 2.63f)
                curveToRelative(4.117f, -0.133f, 6.94f, -3.852f, 6.94f, -7.239f)
                curveToRelative(0.0f, -4.05f, -3.022f, -6.972f, -8.268f, -6.972f)
                curveToRelative(-3.752f, 0.0f, -8.4f, 1.428f, -11.455f, 3.685f)
                curveTo(2.59f, 6.937f, 3.885f, 9.958f, 4.35f, 9.626f)
                curveToRelative(2.648f, -1.904f, 4.748f, -3.13f, 6.784f, -3.744f)
                curveTo(8.12f, 9.244f, 0.886f, 17.05f, 0.0f, 18.425f)
                curveToRelative(0.1f, 1.261f, 1.66f, 4.648f, 2.424f, 4.648f)
                curveToRelative(0.232f, 0.0f, 0.431f, -0.133f, 0.664f, -0.365f)
                arcToRelative(100.49f, 100.49f, 0.0f, false, false, 5.54f, -6.765f)
                curveToRelative(0.222f, 3.104f, 1.748f, 6.898f, 6.014f, 6.898f)
                curveToRelative(3.819f, 0.0f, 7.604f, -2.756f, 9.33f, -8.965f)
                curveToRelative(0.2f, -0.764f, -0.73f, -1.361f, -1.261f, -0.73f)
                close()
                moveTo(18.361f, 8.132f)
                curveToRelative(0.0f, 1.959f, -1.926f, 2.922f, -3.685f, 2.922f)
                curveToRelative(-0.941f, 0.0f, -1.664f, -0.247f, -2.235f, -0.568f)
                curveToRelative(1.051f, -1.592f, 2.092f, -3.225f, 3.21f, -4.973f)
                curveToRelative(1.972f, 0.334f, 2.71f, 1.43f, 2.71f, 2.619f)
                close()
            }
        }
        .build()
        return _redis!!
    }

private var _redis: ImageVector? = null
