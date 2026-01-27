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

public val Simpleicons.Gitcode: ImageVector
    get() {
        if (_gitcode != null) {
            return _gitcode!!
        }
        _gitcode = Builder(name = "Gitcode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.585f, 4.586f)
                lineToRelative(0.486f, -0.274f)
                quadToRelative(0.032f, 0.17f, 0.06f, 0.303f)
                curveToRelative(0.032f, 0.158f, 0.06f, 0.289f, 0.072f, 0.418f)
                curveToRelative(0.103f, 1.118f, 0.665f, 1.941f, 1.462f, 2.127f)
                curveToRelative(1.165f, 0.27f, 2.264f, -0.177f, 2.856f, -1.164f)
                curveToRelative(0.711f, -1.184f, 0.403f, -2.634f, -0.808f, -3.507f)
                curveTo(16.346f, 0.061f, 12.647f, -0.609f, 8.663f, 0.56f)
                curveTo(0.072f, 3.095f, -2.867f, 13.65f, 3.23f, 20.122f)
                curveToRelative(2.608f, 2.769f, 5.92f, 3.964f, 9.68f, 3.873f)
                curveToRelative(4.817f, -0.113f, 8.285f, -2.513f, 10.5f, -6.674f)
                curveToRelative(1.57f, -2.952f, -0.137f, -6.178f, -3.405f, -6.849f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, false, -5.675f, -0.362f)
                arcToRelative(4.8f, 4.8f, 0.0f, false, false, -1.805f, 0.548f)
                curveToRelative(-0.625f, 0.325f, -0.805f, 0.998f, -0.735f, 1.666f)
                curveToRelative(0.065f, 0.608f, 0.531f, 0.972f, 1.086f, 1.064f)
                curveToRelative(1.118f, 0.175f, 2.25f, 0.277f, 3.378f, 0.37f)
                curveToRelative(0.327f, 0.027f, 0.657f, 0.03f, 0.986f, 0.033f)
                curveToRelative(0.473f, 0.005f, 0.944f, 0.01f, 1.405f, 0.086f)
                curveToRelative(1.314f, 0.217f, 1.766f, 1.284f, 1.09f, 2.425f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, true, -0.577f, 0.766f)
                arcToRelative(6.55f, 6.55f, 0.0f, false, true, -3.318f, 1.964f)
                curveToRelative(-2.333f, 0.57f, -4.669f, 0.603f, -6.99f, -0.13f)
                curveToRelative(-2.645f, -0.835f, -4.221f, -2.777f, -4.277f, -5.392f)
                arcTo(9.1f, 9.1f, 0.0f, false, true, 5.76f, 8.907f)
                curveToRelative(0.36f, -0.654f, 0.558f, -1.327f, 0.503f, -2.067f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -0.05f, -0.972f)
                lineToRelative(-0.025f, -0.565f)
                quadToRelative(0.401f, 0.084f, 0.792f, 0.212f)
                curveToRelative(1.011f, 0.406f, 2.007f, 0.592f, 3.102f, 0.294f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, 1.902f, -0.122f)
                arcToRelative(4.76f, 4.76f, 0.0f, false, false, 2.921f, -0.714f)
                curveToRelative(0.218f, -0.128f, 0.439f, -0.251f, 0.681f, -0.387f)
            }
        }
        .build()
        return _gitcode!!
    }

private var _gitcode: ImageVector? = null
