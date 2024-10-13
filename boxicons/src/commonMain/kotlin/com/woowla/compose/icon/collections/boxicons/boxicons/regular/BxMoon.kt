package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxMoon: ImageVector
    get() {
        if (_bxMoon != null) {
            return _bxMoon!!
        }
        _bxMoon = Builder(name = "BxMoon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.742f, 13.045f)
                arcToRelative(8.088f, 8.088f, 0.0f, false, true, -2.077f, 0.271f)
                curveToRelative(-2.135f, 0.0f, -4.14f, -0.83f, -5.646f, -2.336f)
                arcToRelative(8.025f, 8.025f, 0.0f, false, true, -2.064f, -7.723f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.73f, 2.034f)
                arcToRelative(10.014f, 10.014f, 0.0f, false, false, -4.489f, 2.582f)
                curveToRelative(-3.898f, 3.898f, -3.898f, 10.243f, 0.0f, 14.143f)
                arcToRelative(9.937f, 9.937f, 0.0f, false, false, 7.072f, 2.93f)
                arcToRelative(9.93f, 9.93f, 0.0f, false, false, 7.07f, -2.929f)
                arcToRelative(10.007f, 10.007f, 0.0f, false, false, 2.583f, -4.491f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, -1.224f, -1.224f)
                close()
                moveTo(17.97f, 17.346f)
                arcToRelative(7.947f, 7.947f, 0.0f, false, true, -5.656f, 2.343f)
                arcToRelative(7.953f, 7.953f, 0.0f, false, true, -5.658f, -2.344f)
                curveToRelative(-3.118f, -3.119f, -3.118f, -8.195f, 0.0f, -11.314f)
                arcToRelative(7.923f, 7.923f, 0.0f, false, true, 2.06f, -1.483f)
                arcToRelative(10.027f, 10.027f, 0.0f, false, false, 2.89f, 7.848f)
                arcToRelative(9.972f, 9.972f, 0.0f, false, false, 7.848f, 2.891f)
                arcToRelative(8.036f, 8.036f, 0.0f, false, true, -1.484f, 2.059f)
                close()
            }
        }
        .build()
        return _bxMoon!!
    }

private var _bxMoon: ImageVector? = null
