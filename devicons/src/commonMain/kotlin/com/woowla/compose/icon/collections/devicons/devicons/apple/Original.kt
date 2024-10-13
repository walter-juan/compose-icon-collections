package com.woowla.compose.icon.collections.devicons.devicons.apple

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.AppleGroup

public val AppleGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(97.9f, 67.89f)
                curveToRelative(0.17f, 18.8f, 16.49f, 25.06f, 16.67f, 25.14f)
                curveToRelative(-0.14f, 0.44f, -2.61f, 8.92f, -8.6f, 17.67f)
                curveToRelative(-5.18f, 7.57f, -10.55f, 15.11f, -19.02f, 15.27f)
                curveToRelative(-8.32f, 0.15f, -10.99f, -4.93f, -20.5f, -4.93f)
                curveToRelative(-9.51f, 0.0f, -12.48f, 4.78f, -20.35f, 5.09f)
                curveToRelative(-8.17f, 0.31f, -14.4f, -8.19f, -19.62f, -15.72f)
                curveTo(15.82f, 94.96f, 7.67f, 66.8f, 18.62f, 47.79f)
                curveToRelative(5.44f, -9.44f, 15.16f, -15.42f, 25.71f, -15.57f)
                curveToRelative(8.02f, -0.15f, 15.6f, 5.4f, 20.5f, 5.4f)
                curveToRelative(4.9f, 0.0f, 14.11f, -6.68f, 23.78f, -5.7f)
                curveToRelative(4.05f, 0.17f, 15.42f, 1.64f, 22.72f, 12.32f)
                curveToRelative(-0.59f, 0.37f, -13.57f, 7.92f, -13.43f, 23.64f)
                moveTo(82.27f, 21.72f)
                curveToRelative(4.34f, -5.25f, 7.26f, -12.56f, 6.46f, -19.84f)
                curveToRelative(-6.25f, 0.25f, -13.82f, 4.17f, -18.3f, 9.42f)
                curveToRelative(-4.02f, 4.65f, -7.54f, 12.09f, -6.59f, 19.22f)
                curveToRelative(6.97f, 0.54f, 14.09f, -3.54f, 18.43f, -8.8f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
