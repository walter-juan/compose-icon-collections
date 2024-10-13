package com.woowla.compose.icon.collections.devicons.devicons.prometheus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.PrometheusGroup

public val PrometheusGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFe75225)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.13f, 0.51f)
                curveTo(99.23f, 0.52f, 128.04f, 29.13f, 128.0f, 63.95f)
                curveToRelative(-0.05f, 35.34f, -28.74f, 63.56f, -64.61f, 63.54f)
                curveTo(28.33f, 127.47f, -0.03f, 98.82f, 0.0f, 63.43f)
                curveTo(0.02f, 28.83f, 28.9f, 0.5f, 64.13f, 0.51f)
                close()
                moveTo(44.72f, 22.79f)
                curveToRelative(0.8f, 3.96f, 0.03f, 7.66f, -1.17f, 11.29f)
                curveToRelative(-0.82f, 2.52f, -1.96f, 4.94f, -2.64f, 7.49f)
                curveToRelative(-1.12f, 4.2f, -2.39f, 8.43f, -2.86f, 12.73f)
                curveToRelative(-0.67f, 6.18f, 1.76f, 11.63f, 5.91f, 17.04f)
                lineTo(24.86f, 67.32f)
                curveToRelative(0.03f, 0.6f, 0.0f, 0.83f, 0.06f, 1.02f)
                curveToRelative(1.81f, 5.32f, 5.0f, 9.8f, 8.57f, 14.03f)
                curveToRelative(0.38f, 0.45f, 1.24f, 0.67f, 1.88f, 0.67f)
                curveToRelative(19.05f, 0.04f, 38.1f, 0.03f, 57.15f, 0.01f)
                curveToRelative(0.59f, 0.0f, 1.38f, -0.11f, 1.74f, -0.49f)
                curveToRelative(4.08f, -4.29f, 7.2f, -9.19f, 9.16f, -15.34f)
                lineToRelative(-20.23f, 3.96f)
                curveToRelative(1.34f, -2.62f, 2.86f, -4.92f, 3.73f, -7.44f)
                curveToRelative(2.99f, -8.64f, 1.75f, -17.0f, -2.55f, -24.88f)
                curveToRelative(-3.45f, -6.32f, -6.63f, -12.62f, -4.91f, -20.24f)
                curveToRelative(-3.64f, 3.6f, -5.04f, 8.18f, -5.93f, 12.9f)
                curveToRelative(-0.87f, 4.65f, -1.39f, 9.36f, -2.07f, 14.08f)
                curveToRelative(-0.1f, -0.14f, -0.22f, -0.25f, -0.24f, -0.37f)
                arcToRelative(13.96f, 13.96f, 0.0f, false, true, -0.18f, -1.49f)
                curveToRelative(-0.41f, -7.73f, -1.92f, -15.17f, -5.11f, -22.28f)
                curveToRelative(-1.87f, -4.18f, -3.94f, -8.46f, -2.01f, -13.46f)
                curveToRelative(-1.31f, 0.69f, -2.49f, 1.38f, -3.34f, 2.36f)
                curveToRelative(-2.53f, 2.92f, -3.57f, 6.43f, -3.84f, 10.27f)
                curveToRelative(-0.23f, 3.28f, -0.55f, 6.58f, -1.16f, 9.81f)
                curveToRelative(-0.64f, 3.39f, -1.65f, 6.71f, -3.93f, 9.83f)
                curveToRelative(-0.92f, -6.66f, -1.02f, -13.24f, -6.96f, -17.47f)
                close()
                moveTo(93.84f, 88.88f)
                lineTo(34.09f, 88.88f)
                verticalLineToRelative(10.38f)
                horizontalLineToRelative(59.75f)
                close()
                moveTo(45.94f, 104.63f)
                curveToRelative(-0.05f, 8.64f, 8.75f, 15.08f, 19.63f, 14.61f)
                curveToRelative(9.02f, -0.39f, 17.0f, -7.48f, 16.32f, -14.61f)
                close()
                moveTo(45.94f, 104.63f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
