package com.woowla.compose.icon.collections.devicons.devicons.codeigniter

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.CodeigniterGroup

public val CodeigniterGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFEE4323)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(89.71f, 48.87f)
                lineToRelative(-0.76f, -0.41f)
                curveToRelative(0.4f, 0.96f, 0.53f, 1.79f, 0.51f, 2.52f)
                arcToRelative(8.63f, 8.63f, 0.0f, false, false, 0.25f, -1.85f)
                arcToRelative(8.22f, 8.22f, 0.0f, false, true, -0.27f, 2.23f)
                lineToRelative(0.03f, -0.38f)
                arcToRelative(8.52f, 8.52f, 0.0f, false, true, -1.07f, 2.56f)
                lineToRelative(0.23f, -0.25f)
                curveToRelative(-2.88f, 4.82f, -10.74f, 5.87f, -14.61f, 0.89f)
                curveToRelative(-6.22f, -7.99f, 0.13f, -16.6f, 1.02f, -25.07f)
                curveToRelative(1.11f, -10.6f, -5.54f, -20.9f, -13.78f, -27.06f)
                curveToRelative(4.54f, 7.35f, -1.44f, 17.07f, -6.23f, 22.5f)
                curveToRelative(-4.64f, 5.27f, -10.29f, 9.67f, -15.41f, 14.45f)
                curveToRelative(-5.5f, 5.14f, -10.8f, 10.56f, -15.32f, 16.59f)
                curveToRelative(-9.05f, 12.07f, -14.59f, 27.26f, -10.52f, 42.33f)
                curveToRelative(4.07f, 15.06f, 17.11f, 24.64f, 31.83f, 28.03f)
                curveToRelative(-7.43f, -3.21f, -14.38f, -11.37f, -14.4f, -19.72f)
                curveToRelative(-0.02f, -9.11f, 5.75f, -16.83f, 12.93f, -21.91f)
                curveToRelative(-0.86f, 3.26f, -1.33f, 6.24f, 0.8f, 9.15f)
                curveToRelative(1.99f, 2.71f, 5.47f, 4.03f, 8.75f, 3.31f)
                curveToRelative(7.68f, -1.68f, 8.03f, -10.12f, 3.48f, -15.04f)
                curveToRelative(-4.5f, -4.87f, -8.85f, -10.37f, -7.14f, -17.43f)
                curveToRelative(0.86f, -3.54f, 3.03f, -6.85f, 5.79f, -9.23f)
                curveToRelative(-2.12f, 5.56f, 3.9f, 11.05f, 7.86f, 13.78f)
                curveToRelative(6.88f, 4.74f, 14.42f, 8.32f, 20.74f, 13.88f)
                curveToRelative(6.65f, 5.84f, 11.56f, 13.74f, 10.57f, 22.9f)
                curveToRelative(-1.08f, 9.93f, -8.96f, 16.83f, -17.81f, 20.32f)
                curveToRelative(18.7f, -4.13f, 38.02f, -18.64f, 38.41f, -39.38f)
                curveToRelative(0.33f, -17.06f, -11.37f, -30.19f, -25.87f, -37.7f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
