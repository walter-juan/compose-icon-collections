package com.woowla.compose.icon.collections.devicons.devicons.ecto

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.EctoGroup

public val EctoGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF77bf43)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.9f, 0.01f)
                curveToRelative(-4.66f, 0.09f, -9.5f, 0.78f, -14.45f, 2.21f)
                curveToRelative(-4.66f, 1.35f, -13.49f, 5.69f, -20.19f, 12.73f)
                curveToRelative(-6.71f, 7.04f, -14.82f, 19.01f, -17.26f, 34.1f)
                curveToRelative(-2.42f, 15.08f, -2.09f, 30.75f, 5.11f, 46.41f)
                curveToRelative(7.2f, 15.67f, 17.76f, 23.96f, 27.73f, 28.82f)
                curveToRelative(9.98f, 4.86f, 23.54f, 4.19f, 30.33f, 2.26f)
                curveToRelative(6.79f, -1.93f, 10.14f, -4.19f, 13.48f, -6.54f)
                curveToRelative(3.35f, -2.34f, 3.27f, -4.44f, 2.76f, -5.45f)
                curveToRelative(-0.51f, -1.0f, -1.59f, -1.59f, -4.27f, -1.26f)
                curveToRelative(-2.68f, 0.34f, -5.12f, 0.67f, -8.05f, 0.51f)
                curveToRelative(-2.93f, -0.16f, -11.4f, -2.18f, -18.01f, -8.63f)
                curveToRelative(-6.62f, -6.44f, -12.06f, -17.42f, -13.32f, -26.47f)
                curveToRelative(-1.26f, -9.05f, -1.34f, -24.97f, 4.61f, -33.18f)
                curveToRelative(5.95f, -8.21f, 12.32f, -8.29f, 16.08f, -8.13f)
                curveToRelative(3.78f, 0.17f, 11.81f, 2.6f, 13.99f, 10.14f)
                curveToRelative(2.18f, 7.54f, 1.51f, 12.5f, -1.42f, 16.52f)
                curveToRelative(-2.93f, 4.01f, -7.2f, 5.18f, -10.89f, 6.86f)
                curveToRelative(-3.68f, 1.67f, -9.55f, 4.53f, -11.14f, 9.97f)
                curveToRelative(-1.59f, 5.45f, -1.18f, 11.98f, 4.44f, 16.84f)
                curveToRelative(5.62f, 4.86f, 11.98f, 5.53f, 16.67f, 5.02f)
                curveToRelative(4.69f, -0.51f, 9.31f, -2.68f, 14.58f, -6.95f)
                curveToRelative(5.28f, -4.27f, 15.5f, -15.16f, 18.85f, -27.99f)
                curveToRelative(3.35f, -12.82f, 2.43f, -30.75f, -5.95f, -45.33f)
                lineToRelative(-0.01f, -0.01f)
                curveTo(101.78f, 10.65f, 85.08f, -0.36f, 64.9f, 0.01f)
                close()
                moveTo(106.8f, 104.33f)
                curveToRelative(-0.67f, -0.01f, -1.29f, 0.13f, -1.73f, 0.44f)
                curveToRelative(0.0f, 0.0f, -5.53f, 3.35f, -4.27f, 6.62f)
                curveToRelative(1.26f, 3.27f, 3.35f, 2.93f, 5.36f, 2.85f)
                curveToRelative(2.01f, -0.08f, 4.11f, -2.09f, 4.86f, -3.44f)
                curveToRelative(0.75f, -1.34f, 0.51f, -3.52f, -0.92f, -5.02f)
                curveToRelative(-0.89f, -0.94f, -2.17f, -1.42f, -3.29f, -1.45f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
