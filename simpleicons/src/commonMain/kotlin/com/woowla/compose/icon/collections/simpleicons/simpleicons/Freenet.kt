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

public val Simpleicons.Freenet: ImageVector
    get() {
        if (_freenet != null) {
            return _freenet!!
        }
        _freenet = Builder(name = "Freenet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.327f, 6.184f)
                curveToRelative(-0.771f, -0.17f, -1.577f, -0.48f, -4.266f, -1.884f)
                curveTo(1.48f, 2.467f, 0.692f, 2.33f, 0.23f, 3.084f)
                curveToRelative(-0.617f, 0.993f, -0.051f, 3.512f, 2.415f, 8.103f)
                curveToRelative(1.594f, 3.015f, 4.112f, 6.904f, 4.574f, 7.418f)
                curveToRelative(0.103f, 0.102f, 0.223f, 0.137f, 0.326f, 0.068f)
                curveToRelative(0.103f, -0.068f, 0.154f, -0.154f, 0.069f, -0.308f)
                curveToRelative(-0.377f, -0.703f, -1.68f, -3.41f, -2.279f, -4.814f)
                curveToRelative(-1.405f, -3.392f, -1.73f, -4.54f, -1.25f, -4.797f)
                curveToRelative(0.136f, -0.068f, 0.308f, -0.017f, 0.702f, 0.206f)
                curveToRelative(1.353f, 0.72f, 4.334f, 3.015f, 4.865f, 4.625f)
                curveToRelative(0.223f, 0.703f, 0.343f, 1.508f, 0.394f, 4.386f)
                curveToRelative(0.069f, 3.786f, 0.343f, 4.488f, 1.268f, 4.488f)
                curveToRelative(1.233f, 0.0f, 3.289f, -1.713f, 6.356f, -5.996f)
                curveToRelative(2.021f, -2.81f, 4.385f, -6.767f, 4.625f, -7.4f)
                curveToRelative(0.069f, -0.138f, 0.0f, -0.24f, -0.086f, -0.309f)
                curveToRelative(-0.102f, -0.068f, -0.222f, -0.051f, -0.308f, 0.086f)
                curveToRelative(-0.463f, 0.65f, -2.33f, 3.066f, -3.358f, 4.248f)
                curveToRelative(-2.45f, 2.81f, -3.34f, 3.632f, -3.837f, 3.375f)
                curveToRelative(-0.137f, -0.068f, -0.171f, -0.24f, -0.171f, -0.65f)
                curveToRelative(0.0f, -1.474f, 0.633f, -5.02f, 1.867f, -6.22f)
                curveToRelative(0.531f, -0.53f, 1.25f, -1.027f, 3.906f, -2.5f)
                curveToRelative(3.512f, -1.954f, 4.009f, -2.519f, 3.546f, -3.29f)
                curveToRelative(-0.617f, -0.993f, -3.22f, -1.799f, -8.771f, -2.124f)
                curveToRelative(-3.615f, -0.223f, -8.497f, -0.137f, -9.2f, -0.017f)
                curveToRelative(-0.154f, 0.017f, -0.222f, 0.103f, -0.24f, 0.222f)
                curveToRelative(0.0f, 0.103f, 0.069f, 0.206f, 0.24f, 0.206f)
                curveToRelative(0.84f, 0.051f, 4.026f, 0.343f, 5.636f, 0.565f)
                curveToRelative(3.855f, 0.549f, 5.088f, 0.874f, 5.088f, 1.405f)
                curveToRelative(0.0f, 0.137f, -0.137f, 0.257f, -0.53f, 0.463f)
                curveToRelative(-1.388f, 0.788f, -5.02f, 2.038f, -6.75f, 1.661f)
            }
        }
        .build()
        return _freenet!!
    }

private var _freenet: ImageVector? = null
