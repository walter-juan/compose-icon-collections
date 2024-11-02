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

public val Simpleicons.Inkdrop: ImageVector
    get() {
        if (_inkdrop != null) {
            return _inkdrop!!
        }
        _inkdrop = Builder(name = "Inkdrop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.854f, 1.812f)
                curveTo(9.423f, 0.834f, 10.471f, 0.143f, 11.607f, 0.02f)
                curveToRelative(0.939f, -0.102f, 1.914f, 0.18f, 2.656f, 0.77f)
                arcToRelative(3.665f, 3.665f, 0.0f, false, true, 0.873f, 1.008f)
                curveToRelative(2.165f, 3.721f, 4.314f, 7.451f, 6.471f, 11.177f)
                curveToRelative(0.342f, 0.594f, 0.501f, 1.282f, 0.475f, 1.962f)
                curveToRelative(-0.022f, 0.579f, -0.176f, 1.153f, -0.463f, 1.659f)
                curveToRelative(-1.067f, 1.862f, -2.142f, 3.72f, -3.213f, 5.58f)
                curveToRelative(-0.637f, 1.102f, -1.868f, 1.813f, -3.134f, 1.821f)
                curveToRelative(-2.169f, 0.004f, -4.339f, 0.0f, -6.508f, 0.0f)
                curveToRelative(-1.268f, -0.003f, -2.497f, -0.711f, -3.137f, -1.8f)
                curveToRelative(-1.082f, -1.859f, -2.156f, -3.723f, -3.234f, -5.585f)
                curveToRelative(-0.636f, -1.104f, -0.636f, -2.527f, -0.008f, -3.628f)
                curveToRelative(2.148f, -3.728f, 4.312f, -7.448f, 6.468f, -11.172f)
                close()
                moveTo(4.625f, 14.149f)
                arcToRelative(1.192f, 1.192f, 0.0f, false, false, 0.0f, 1.183f)
                curveToRelative(1.074f, 1.864f, 2.085f, 3.628f, 3.174f, 5.483f)
                arcToRelative(1.188f, 1.188f, 0.0f, false, false, 1.019f, 0.585f)
                curveToRelative(2.169f, 0.005f, 4.219f, 0.014f, 6.389f, 0.0f)
                arcToRelative(1.187f, 1.187f, 0.0f, false, false, 1.018f, -0.591f)
                curveToRelative(1.075f, -1.858f, 2.095f, -3.611f, 3.154f, -5.478f)
                arcToRelative(1.188f, 1.188f, 0.0f, false, false, -0.004f, -1.176f)
                curveToRelative(-2.15f, -3.73f, -4.172f, -7.26f, -6.352f, -10.972f)
                curveToRelative(-0.23f, -0.387f, -0.666f, -0.617f, -1.118f, -0.581f)
                arcToRelative(1.186f, 1.186f, 0.0f, false, false, -0.932f, 0.585f)
                arcToRelative(2974.983f, 2974.983f, 0.0f, false, false, -6.347f, 10.963f)
                close()
                moveTo(13.091f, 18.213f)
                arcToRelative(1.26f, 1.26f, 0.0f, false, true, -2.182f, 0.0f)
                lineTo(8.745f, 14.465f)
                arcToRelative(1.26f, 1.26f, 0.0f, false, true, 1.091f, -1.89f)
                horizontalLineToRelative(4.328f)
                arcToRelative(1.26f, 1.26f, 0.0f, false, true, 1.091f, 1.89f)
                lineToRelative(-2.164f, 3.748f)
                close()
            }
        }
        .build()
        return _inkdrop!!
    }

private var _inkdrop: ImageVector? = null
