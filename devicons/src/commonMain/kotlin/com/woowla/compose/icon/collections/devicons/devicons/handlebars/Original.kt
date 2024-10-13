package com.woowla.compose.icon.collections.devicons.devicons.handlebars

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.HandlebarsGroup

public val HandlebarsGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(49.44f, 48.23f)
                arcToRelative(18.44f, 18.44f, 0.0f, false, false, -3.04f, 0.03f)
                curveToRelative(-12.69f, 1.0f, -17.73f, 7.57f, -20.83f, 10.34f)
                curveToRelative(-3.09f, 2.77f, -8.82f, 9.39f, -12.67f, 8.19f)
                curveToRelative(-3.85f, -1.2f, -4.93f, -5.84f, -3.56f, -7.31f)
                curveToRelative(1.36f, -1.48f, 2.43f, -1.21f, 3.26f, 0.0f)
                arcToRelative(6.39f, 6.39f, 0.0f, false, true, 0.79f, 3.18f)
                arcToRelative(7.31f, 7.31f, 0.0f, false, false, 2.37f, -3.57f)
                curveToRelative(0.47f, -2.05f, 0.37f, -4.03f, -2.37f, -5.43f)
                curveToRelative(-6.93f, -3.5f, -11.41f, 2.74f, -12.11f, 4.21f)
                curveTo(0.59f, 59.35f, -0.5f, 61.65f, 0.26f, 66.94f)
                curveToRelative(0.76f, 5.29f, 3.27f, 10.14f, 11.27f, 12.02f)
                arcToRelative(33.69f, 33.69f, 0.0f, false, false, 22.54f, -2.63f)
                curveToRelative(7.01f, -3.34f, 20.18f, -9.22f, 23.5f, -9.81f)
                arcToRelative(28.84f, 28.84f, 0.0f, false, true, 6.44f, -0.82f)
                arcToRelative(28.84f, 28.84f, 0.0f, false, true, 6.44f, 0.82f)
                curveToRelative(3.32f, 0.59f, 16.49f, 6.47f, 23.5f, 9.81f)
                arcToRelative(33.69f, 33.69f, 0.0f, false, false, 22.53f, 2.63f)
                curveToRelative(8.0f, -1.87f, 10.51f, -6.73f, 11.27f, -12.02f)
                curveToRelative(0.76f, -5.29f, -0.33f, -7.58f, -1.02f, -9.06f)
                curveToRelative(-0.7f, -1.48f, -5.17f, -7.72f, -12.1f, -4.21f)
                curveToRelative(-2.73f, 1.39f, -2.84f, 3.38f, -2.37f, 5.43f)
                arcToRelative(7.31f, 7.31f, 0.0f, false, false, 2.37f, 3.57f)
                arcToRelative(6.39f, 6.39f, 0.0f, false, true, 0.8f, -3.25f)
                curveToRelative(0.83f, -1.21f, 1.89f, -1.47f, 3.26f, 0.0f)
                curveToRelative(1.36f, 1.47f, 0.29f, 6.17f, -3.56f, 7.36f)
                curveToRelative(-3.85f, 1.2f, -9.58f, -5.43f, -12.67f, -8.19f)
                curveToRelative(-3.09f, -2.77f, -8.14f, -9.3f, -20.84f, -10.33f)
                arcToRelative(18.44f, 18.44f, 0.0f, false, false, -17.6f, 9.07f)
                arcToRelative(18.44f, 18.44f, 0.0f, false, false, -14.56f, -9.1f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
