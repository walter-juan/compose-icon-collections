package com.woowla.compose.icon.collections.devicons.devicons.php

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.radialGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.PhpGroup

public val PhpGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = radialGradient(0.0f to Color(0xFFAEB2D5), 0.3f to Color(0xFFAEB2D5), 0.75f
                    to Color(0xFF484C89), 1.0f to Color(0xFF484C89), center = Offset(38.43f,42.17f),
                    radius = 84.04f), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 64.0f)
                curveToRelative(0.0f, 18.59f, 28.65f, 33.67f, 64.0f, 33.67f)
                curveToRelative(35.35f, 0.0f, 64.0f, -15.07f, 64.0f, -33.67f)
                curveToRelative(0.0f, -18.59f, -28.66f, -33.67f, -64.0f, -33.67f)
                curveTo(28.65f, 30.33f, 0.0f, 45.41f, 0.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF777bb3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 95.17f)
                curveToRelative(33.97f, 0.0f, 61.5f, -13.95f, 61.5f, -31.17f)
                curveToRelative(0.0f, -17.21f, -27.53f, -31.17f, -61.5f, -31.17f)
                reflectiveCurveTo(2.5f, 46.79f, 2.5f, 64.0f)
                curveToRelative(0.0f, 17.21f, 27.53f, 31.17f, 61.5f, 31.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(34.77f, 67.86f)
                curveToRelative(2.79f, 0.0f, 4.88f, -0.51f, 6.2f, -1.53f)
                curveToRelative(1.31f, -1.01f, 2.21f, -2.75f, 2.68f, -5.18f)
                curveToRelative(0.44f, -2.27f, 0.27f, -3.85f, -0.5f, -4.71f)
                curveToRelative(-0.79f, -0.87f, -2.49f, -1.32f, -5.07f, -1.32f)
                horizontalLineToRelative(-4.46f)
                lineToRelative(-2.47f, 12.73f)
                close()
                moveTo(20.17f, 83.55f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, -0.68f, -0.83f)
                lineToRelative(6.56f, -33.74f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, 0.68f, -0.56f)
                horizontalLineToRelative(14.13f)
                curveToRelative(4.44f, 0.0f, 7.75f, 1.21f, 9.83f, 3.59f)
                curveToRelative(2.09f, 2.39f, 2.73f, 5.73f, 1.92f, 9.94f)
                curveToRelative(-0.33f, 1.71f, -0.9f, 3.3f, -1.7f, 4.72f)
                arcToRelative(15.82f, 15.82f, 0.0f, false, true, -3.13f, 3.92f)
                curveToRelative(-1.53f, 1.43f, -3.26f, 2.47f, -5.15f, 3.08f)
                curveToRelative(-1.85f, 0.6f, -4.23f, 0.91f, -7.07f, 0.91f)
                horizontalLineToRelative(-5.72f)
                lineToRelative(-1.63f, 8.41f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, -0.68f, 0.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(34.19f, 55.83f)
                horizontalLineToRelative(3.89f)
                curveToRelative(3.11f, 0.0f, 4.19f, 0.68f, 4.55f, 1.09f)
                curveToRelative(0.61f, 0.67f, 0.72f, 2.1f, 0.33f, 4.11f)
                curveToRelative(-0.44f, 2.26f, -1.25f, 3.86f, -2.42f, 4.76f)
                curveToRelative(-1.19f, 0.92f, -3.14f, 1.39f, -5.77f, 1.39f)
                horizontalLineToRelative(-2.79f)
                lineToRelative(2.2f, -11.34f)
                close()
                moveTo(40.86f, 47.73f)
                lineTo(26.73f, 47.73f)
                arcToRelative(1.39f, 1.39f, 0.0f, false, false, -1.36f, 1.12f)
                lineTo(18.81f, 82.59f)
                arcToRelative(1.39f, 1.39f, 0.0f, false, false, 1.36f, 1.65f)
                horizontalLineToRelative(7.35f)
                arcToRelative(1.39f, 1.39f, 0.0f, false, false, 1.36f, -1.12f)
                lineToRelative(1.52f, -7.85f)
                horizontalLineToRelative(5.15f)
                curveToRelative(2.91f, 0.0f, 5.36f, -0.32f, 7.29f, -0.94f)
                curveToRelative(1.98f, -0.64f, 3.8f, -1.73f, 5.41f, -3.24f)
                arcToRelative(16.52f, 16.52f, 0.0f, false, false, 3.26f, -4.09f)
                curveToRelative(0.83f, -1.49f, 1.43f, -3.15f, 1.77f, -4.93f)
                curveToRelative(0.86f, -4.42f, 0.16f, -7.96f, -2.08f, -10.52f)
                curveToRelative(-2.22f, -2.54f, -5.7f, -3.82f, -10.35f, -3.82f)
                close()
                moveTo(30.3f, 68.56f)
                horizontalLineToRelative(4.47f)
                curveToRelative(2.96f, 0.0f, 5.17f, -0.56f, 6.62f, -1.67f)
                curveToRelative(1.45f, -1.12f, 2.43f, -2.98f, 2.94f, -5.59f)
                curveToRelative(0.49f, -2.51f, 0.26f, -4.28f, -0.67f, -5.31f)
                curveToRelative(-0.93f, -1.03f, -2.79f, -1.55f, -5.58f, -1.55f)
                horizontalLineToRelative(-5.04f)
                lineToRelative(-2.74f, 14.12f)
                moveToRelative(10.56f, -19.44f)
                curveToRelative(4.25f, 0.0f, 7.35f, 1.12f, 9.3f, 3.35f)
                curveToRelative(1.95f, 2.23f, 2.54f, 5.35f, 1.76f, 9.35f)
                curveToRelative(-0.32f, 1.65f, -0.86f, 3.15f, -1.63f, 4.52f)
                curveToRelative(-0.76f, 1.37f, -1.76f, 2.61f, -2.99f, 3.75f)
                curveToRelative(-1.47f, 1.37f, -3.1f, 2.35f, -4.89f, 2.93f)
                curveToRelative(-1.79f, 0.58f, -4.08f, 0.88f, -6.86f, 0.88f)
                horizontalLineToRelative(-6.3f)
                lineToRelative(-1.74f, 8.97f)
                horizontalLineToRelative(-7.35f)
                lineToRelative(6.56f, -33.74f)
                horizontalLineToRelative(14.13f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(69.46f, 74.58f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, -0.68f, -0.83f)
                lineToRelative(2.9f, -14.93f)
                curveToRelative(0.28f, -1.42f, 0.21f, -2.44f, -0.19f, -2.87f)
                curveToRelative(-0.25f, -0.26f, -0.98f, -0.7f, -3.15f, -0.7f)
                horizontalLineToRelative(-5.26f)
                lineToRelative(-3.65f, 18.77f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, -0.68f, 0.56f)
                horizontalLineToRelative(-7.29f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, -0.68f, -0.83f)
                lineToRelative(6.56f, -33.74f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, 0.68f, -0.56f)
                horizontalLineToRelative(7.29f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, 0.68f, 0.83f)
                lineTo(64.41f, 48.42f)
                horizontalLineToRelative(5.65f)
                curveToRelative(4.31f, 0.0f, 7.23f, 0.76f, 8.93f, 2.32f)
                curveToRelative(1.73f, 1.59f, 2.28f, 4.14f, 1.61f, 7.57f)
                lineToRelative(-3.05f, 15.7f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, -0.68f, 0.56f)
                horizontalLineToRelative(-7.41f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(65.31f, 38.76f)
                horizontalLineToRelative(-7.29f)
                arcToRelative(1.39f, 1.39f, 0.0f, false, false, -1.36f, 1.12f)
                lineToRelative(-6.56f, 33.74f)
                arcToRelative(1.39f, 1.39f, 0.0f, false, false, 1.36f, 1.65f)
                horizontalLineToRelative(7.29f)
                arcToRelative(1.39f, 1.39f, 0.0f, false, false, 1.36f, -1.12f)
                lineToRelative(3.54f, -18.2f)
                horizontalLineToRelative(4.68f)
                curveToRelative(2.17f, 0.0f, 2.62f, 0.46f, 2.64f, 0.48f)
                curveToRelative(0.13f, 0.14f, 0.31f, 0.8f, 0.02f, 2.26f)
                lineToRelative(-2.9f, 14.93f)
                arcToRelative(1.39f, 1.39f, 0.0f, false, false, 1.36f, 1.65f)
                horizontalLineToRelative(7.41f)
                arcToRelative(1.39f, 1.39f, 0.0f, false, false, 1.36f, -1.12f)
                lineToRelative(3.05f, -15.7f)
                curveToRelative(0.71f, -3.69f, 0.1f, -6.45f, -1.82f, -8.22f)
                curveToRelative(-1.84f, -1.69f, -4.91f, -2.51f, -9.4f, -2.51f)
                horizontalLineToRelative(-4.81f)
                lineToRelative(1.42f, -7.32f)
                arcToRelative(1.39f, 1.39f, 0.0f, false, false, -1.36f, -1.65f)
                close()
                moveTo(65.31f, 40.15f)
                lineTo(63.57f, 49.11f)
                horizontalLineToRelative(6.5f)
                curveToRelative(4.09f, 0.0f, 6.91f, 0.71f, 8.46f, 2.14f)
                curveToRelative(1.55f, 1.43f, 2.02f, 3.73f, 1.4f, 6.93f)
                lineToRelative(-3.05f, 15.7f)
                horizontalLineToRelative(-7.41f)
                lineToRelative(2.9f, -14.93f)
                curveToRelative(0.33f, -1.7f, 0.21f, -2.86f, -0.37f, -3.47f)
                curveToRelative(-0.57f, -0.62f, -1.79f, -0.93f, -3.66f, -0.93f)
                horizontalLineToRelative(-5.83f)
                lineToRelative(-3.76f, 19.33f)
                lineTo(51.46f, 73.88f)
                lineToRelative(6.56f, -33.74f)
                horizontalLineToRelative(7.29f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.14f, 67.86f)
                curveToRelative(2.79f, 0.0f, 4.88f, -0.51f, 6.2f, -1.53f)
                curveToRelative(1.3f, -1.01f, 2.21f, -2.75f, 2.68f, -5.18f)
                curveToRelative(0.44f, -2.27f, 0.27f, -3.85f, -0.5f, -4.71f)
                curveToRelative(-0.79f, -0.87f, -2.49f, -1.32f, -5.07f, -1.32f)
                horizontalLineToRelative(-4.46f)
                lineToRelative(-2.47f, 12.73f)
                close()
                moveTo(77.54f, 83.55f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, -0.68f, -0.83f)
                lineToRelative(6.56f, -33.74f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, 0.68f, -0.56f)
                horizontalLineTo(98.23f)
                curveToRelative(4.44f, 0.0f, 7.75f, 1.21f, 9.83f, 3.59f)
                curveToRelative(2.09f, 2.39f, 2.73f, 5.73f, 1.92f, 9.94f)
                arcToRelative(15.88f, 15.88f, 0.0f, false, true, -1.7f, 4.72f)
                arcToRelative(15.84f, 15.84f, 0.0f, false, true, -3.13f, 3.92f)
                curveToRelative(-1.53f, 1.43f, -3.27f, 2.47f, -5.15f, 3.08f)
                curveToRelative(-1.85f, 0.6f, -4.23f, 0.91f, -7.07f, 0.91f)
                horizontalLineToRelative(-5.72f)
                lineToRelative(-1.63f, 8.41f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, -0.68f, 0.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(91.56f, 55.83f)
                horizontalLineToRelative(3.89f)
                curveToRelative(3.11f, 0.0f, 4.19f, 0.68f, 4.55f, 1.09f)
                curveToRelative(0.61f, 0.67f, 0.72f, 2.1f, 0.33f, 4.11f)
                curveToRelative(-0.44f, 2.26f, -1.25f, 3.86f, -2.42f, 4.76f)
                curveToRelative(-1.2f, 0.92f, -3.14f, 1.39f, -5.77f, 1.39f)
                horizontalLineToRelative(-2.79f)
                lineToRelative(2.2f, -11.34f)
                close()
                moveTo(98.23f, 47.73f)
                lineTo(84.1f, 47.73f)
                arcToRelative(1.39f, 1.39f, 0.0f, false, false, -1.36f, 1.12f)
                lineToRelative(-6.56f, 33.74f)
                arcToRelative(1.39f, 1.39f, 0.0f, false, false, 1.36f, 1.65f)
                horizontalLineToRelative(7.35f)
                arcToRelative(1.39f, 1.39f, 0.0f, false, false, 1.36f, -1.12f)
                lineToRelative(1.52f, -7.85f)
                horizontalLineToRelative(5.15f)
                curveToRelative(2.91f, 0.0f, 5.36f, -0.32f, 7.29f, -0.94f)
                curveToRelative(1.98f, -0.64f, 3.8f, -1.73f, 5.41f, -3.24f)
                arcToRelative(16.52f, 16.52f, 0.0f, false, false, 3.26f, -4.09f)
                curveToRelative(0.83f, -1.49f, 1.43f, -3.15f, 1.77f, -4.93f)
                curveToRelative(0.86f, -4.42f, 0.16f, -7.96f, -2.08f, -10.52f)
                curveToRelative(-2.22f, -2.54f, -5.7f, -3.82f, -10.35f, -3.82f)
                close()
                moveTo(87.67f, 68.56f)
                horizontalLineToRelative(4.47f)
                curveToRelative(2.96f, 0.0f, 5.17f, -0.56f, 6.62f, -1.67f)
                curveToRelative(1.45f, -1.12f, 2.43f, -2.98f, 2.94f, -5.59f)
                curveToRelative(0.49f, -2.51f, 0.27f, -4.28f, -0.67f, -5.31f)
                curveToRelative(-0.93f, -1.03f, -2.79f, -1.55f, -5.58f, -1.55f)
                horizontalLineToRelative(-5.03f)
                close()
                moveTo(98.23f, 49.11f)
                curveToRelative(4.25f, 0.0f, 7.35f, 1.12f, 9.3f, 3.35f)
                curveToRelative(1.95f, 2.23f, 2.54f, 5.35f, 1.76f, 9.35f)
                curveToRelative(-0.32f, 1.65f, -0.86f, 3.15f, -1.62f, 4.52f)
                curveToRelative(-0.76f, 1.37f, -1.76f, 2.61f, -2.99f, 3.75f)
                curveToRelative(-1.47f, 1.37f, -3.1f, 2.35f, -4.89f, 2.93f)
                curveToRelative(-1.79f, 0.58f, -4.08f, 0.88f, -6.86f, 0.88f)
                horizontalLineToRelative(-6.3f)
                lineToRelative(-1.75f, 8.97f)
                horizontalLineToRelative(-7.35f)
                lineToRelative(6.56f, -33.74f)
                horizontalLineToRelative(14.13f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
