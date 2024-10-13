package com.woowla.compose.icon.collections.devicons.devicons.matlab

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.MatlabGroup

public val MatlabGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(123.96f, 91.9f)
                curveToRelative(-7.25f, -18.3f, -13.26f, -37.06f, -20.18f, -55.48f)
                curveToRelative(-3.05f, -7.84f, -6.05f, -15.75f, -10.22f, -23.08f)
                curveToRelative(-1.66f, -2.63f, -3.24f, -5.53f, -5.95f, -7.22f)
                arcToRelative(4.01f, 4.01f, 0.0f, false, false, -2.22f, -0.61f)
                curveToRelative(-1.27f, 0.03f, -2.54f, 0.59f, -3.5f, 1.41f)
                curveToRelative(-3.64f, 2.89f, -5.8f, 7.08f, -8.23f, 10.95f)
                curveToRelative(-4.28f, 7.17f, -8.79f, 14.69f, -15.94f, 19.35f)
                curveToRelative(-3.36f, 2.37f, -7.76f, 2.63f, -11.0f, 5.17f)
                curveToRelative(-4.43f, 3.34f, -7.44f, 8.08f, -11.07f, 12.18f)
                curveToRelative(-0.83f, 0.99f, -2.11f, 1.38f, -3.23f, 1.92f)
                curveTo(21.58f, 60.93f, 10.74f, 65.34f, 0.0f, 69.98f)
                curveToRelative(9.09f, 7.03f, 18.78f, 13.29f, 28.05f, 20.08f)
                curveToRelative(2.54f, -0.5f, 5.1f, -1.55f, 7.72f, -1.08f)
                curveToRelative(4.16f, 1.3f, 6.6f, 5.28f, 8.5f, 8.93f)
                curveToRelative(3.88f, 7.94f, 6.68f, 16.32f, 9.81f, 24.57f)
                curveToRelative(5.25f, -0.38f, 9.97f, -3.08f, 14.03f, -6.26f)
                curveToRelative(7.81f, -6.32f, 13.76f, -14.5f, 20.31f, -22.05f)
                curveToRelative(3.14f, -3.3f, 6.34f, -7.23f, 11.05f, -8.15f)
                curveToRelative(4.76f, -1.15f, 9.86f, 0.56f, 13.4f, 3.84f)
                curveToRelative(4.96f, 4.43f, 9.34f, 9.55f, 15.14f, 12.94f)
                curveToRelative(-0.78f, -3.84f, -2.64f, -7.28f, -4.03f, -10.9f)
                close()
                moveTo(42.96f, 79.01f)
                curveToRelative(-4.57f, 2.7f, -9.43f, 4.93f, -14.18f, 7.29f)
                curveToRelative(-7.46f, -5.0f, -14.72f, -10.29f, -22.05f, -15.47f)
                curveToRelative(9.88f, -4.33f, 19.91f, -8.35f, 29.92f, -12.39f)
                curveToRelative(4.75f, 3.7f, 9.64f, 7.22f, 14.38f, 10.93f)
                curveToRelative(-2.23f, 3.56f, -4.91f, 6.87f, -8.07f, 9.64f)
                close()
                moveTo(53.13f, 66.6f)
                curveTo(48.41f, 63.06f, 43.64f, 59.61f, 39.0f, 55.98f)
                curveToRelative(2.98f, -4.05f, 6.24f, -7.98f, 10.14f, -11.17f)
                curveToRelative(2.59f, -1.66f, 5.74f, -2.12f, 8.43f, -3.61f)
                curveToRelative(6.37f, -3.18f, 10.71f, -9.01f, 14.86f, -14.58f)
                curveToRelative(-5.32f, 13.81f, -10.99f, 27.66f, -19.3f, 39.99f)
                close()
                moveTo(53.13f, 66.6f)
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
