package com.woowla.compose.icon.collections.devicons.devicons.vala

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
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
import com.woowla.compose.icon.collections.devicons.devicons.ValaGroup

public val ValaGroup.OriginalWordmark: ImageVector
    get() {
        if (_originalWordmark != null) {
            return _originalWordmark!!
        }
        _originalWordmark = Builder(name = "OriginalWordmark", defaultWidth = 128.0.dp,
                defaultHeight = 128.0.dp, viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFFA56DE2), 1.0f to Color(0xFF7239B3), start =
                    Offset(-0.0f,0.0f), end = Offset(-0.0f,127.01f)), stroke = null, strokeLineWidth
                    = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, -0.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(-128.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF8B58C9), 1.0f to Color(0xFF743FB3), start =
                    Offset(54.56f,37.57f), end = Offset(54.37f,90.6f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(23.91f, 37.44f)
                verticalLineToRelative(0.0f)
                curveToRelative(-11.59f, 2.98f, -21.56f, 6.07f, -23.26f, 17.25f)
                curveToRelative(-0.28f, 1.9f, -0.19f, 3.78f, 0.46f, 5.59f)
                curveToRelative(0.73f, 1.87f, 2.36f, 2.96f, 4.88f, 3.29f)
                curveToRelative(0.99f, 0.13f, 4.61f, 0.81f, 4.53f, -0.8f)
                curveToRelative(-0.09f, -0.54f, -0.42f, -1.14f, -0.69f, -1.76f)
                curveToRelative(-0.42f, -0.92f, -0.39f, -1.91f, -0.38f, -2.84f)
                curveToRelative(0.14f, -3.25f, 1.0f, -5.99f, 2.56f, -8.24f)
                curveToRelative(1.23f, -1.75f, 2.81f, -3.17f, 4.72f, -4.27f)
                lineToRelative(1.02f, 43.08f)
                curveToRelative(0.0f, 0.63f, 0.42f, 0.97f, 1.24f, 0.97f)
                horizontalLineToRelative(9.67f)
                curveToRelative(0.7f, 0.0f, 0.97f, -0.24f, 1.2f, -0.86f)
                curveToRelative(6.21f, -16.56f, 12.32f, -33.17f, 18.55f, -49.72f)
                curveToRelative(0.08f, -0.84f, -0.78f, -1.16f, -1.4f, -1.37f)
                horizontalLineToRelative(-4.54f)
                curveToRelative(-0.8f, -0.03f, -1.27f, 0.44f, -1.43f, 0.91f)
                lineToRelative(-11.18f, 32.51f)
                lineToRelative(-0.7f, -31.03f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-1.29f, -0.59f)
                horizontalLineToRelative(-1.29f)
                curveToRelative(-0.86f, -0.09f, -1.75f, -0.13f, -2.65f, -0.13f)
                close()
                moveTo(93.68f, 40.99f)
                lineTo(83.88f, 42.31f)
                curveToRelative(-0.63f, 0.17f, -0.94f, 0.48f, -1.24f, 0.89f)
                lineToRelative(-0.0f, -0.01f)
                lineToRelative(-7.02f, 32.89f)
                curveToRelative(-0.01f, 0.03f, -0.01f, 0.06f, -0.02f, 0.09f)
                curveToRelative(-0.81f, 2.69f, -1.85f, 4.49f, -3.13f, 5.42f)
                curveToRelative(-0.67f, 0.42f, -1.26f, 0.51f, -1.67f, 0.1f)
                curveToRelative(-0.51f, -0.47f, -0.78f, -1.2f, -0.78f, -2.21f)
                curveToRelative(0.0f, -0.19f, 0.03f, -0.38f, 0.04f, -0.57f)
                lineToRelative(4.91f, -23.6f)
                curveToRelative(0.13f, -0.47f, -0.74f, -0.94f, -1.19f, -1.06f)
                horizontalLineToRelative(-9.54f)
                curveToRelative(-0.63f, 0.17f, -0.94f, 0.48f, -1.24f, 0.89f)
                curveToRelative(-0.25f, -0.12f, -0.52f, -0.23f, -0.83f, -0.31f)
                curveToRelative(-0.85f, -0.6f, -2.18f, -0.9f, -4.01f, -0.9f)
                curveToRelative(-2.4f, 0.0f, -4.56f, 0.56f, -6.5f, 1.64f)
                curveToRelative(-1.44f, 0.62f, -2.76f, 1.5f, -3.97f, 2.66f)
                curveToRelative(-2.57f, 2.48f, -4.54f, 5.62f, -5.92f, 9.41f)
                curveToRelative(-0.63f, 1.73f, -1.09f, 3.46f, -1.39f, 5.21f)
                curveToRelative(-0.44f, 3.9f, -1.01f, 8.34f, 0.18f, 11.85f)
                curveToRelative(0.19f, 0.53f, 0.44f, 1.01f, 0.73f, 1.47f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(2.6f, 4.51f, 10.3f, 6.5f, 16.58f, 1.3f)
                curveToRelative(0.4f, -0.31f, 0.77f, -0.65f, 1.12f, -1.02f)
                curveToRelative(1.03f, 2.93f, 3.71f, 4.05f, 6.36f, 4.1f)
                curveToRelative(2.02f, -0.06f, 4.16f, -0.42f, 5.85f, -1.04f)
                curveToRelative(1.64f, -0.61f, 3.34f, -1.56f, 4.56f, -2.85f)
                curveToRelative(0.08f, 0.18f, 0.16f, 0.35f, 0.26f, 0.51f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.01f)
                curveToRelative(0.32f, 0.54f, 0.66f, 0.95f, 1.06f, 1.33f)
                curveToRelative(3.13f, 2.94f, 9.63f, 2.61f, 14.44f, -0.59f)
                curveToRelative(0.82f, -0.52f, 1.58f, -1.12f, 2.2f, -1.79f)
                curveToRelative(0.95f, 1.51f, 2.12f, 2.45f, 3.51f, 3.22f)
                curveToRelative(3.29f, 1.71f, 7.92f, 1.79f, 12.12f, -1.09f)
                curveToRelative(0.81f, -0.52f, 1.58f, -1.14f, 2.23f, -1.85f)
                curveToRelative(0.53f, 1.14f, 1.21f, 2.09f, 2.01f, 2.76f)
                curveToRelative(1.98f, 1.48f, 4.81f, 1.64f, 7.09f, 1.09f)
                curveToRelative(1.29f, -0.3f, 2.48f, -0.91f, 3.34f, -1.77f)
                curveToRelative(0.65f, -0.73f, 1.43f, -2.34f, 2.36f, -4.82f)
                lineToRelative(-0.95f, -2.61f)
                verticalLineToRelative(-0.0f)
                curveToRelative(-0.39f, 0.19f, -0.87f, 0.29f, -1.46f, 0.29f)
                curveToRelative(-0.31f, 0.0f, -0.58f, -0.03f, -0.83f, -0.07f)
                curveToRelative(-0.39f, -0.38f, -0.59f, -0.9f, -0.59f, -1.6f)
                curveToRelative(0.0f, -0.24f, 0.01f, -0.48f, 0.03f, -0.72f)
                lineToRelative(4.92f, -23.65f)
                lineToRelative(-0.0f, 0.0f)
                curveToRelative(0.13f, -0.47f, -0.74f, -0.94f, -1.19f, -1.06f)
                horizontalLineToRelative(-9.54f)
                verticalLineToRelative(-0.0f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.63f, 0.17f, -0.94f, 0.48f, -1.24f, 0.89f)
                curveToRelative(-0.25f, -0.12f, -0.52f, -0.23f, -0.83f, -0.31f)
                curveToRelative(-0.85f, -0.6f, -2.18f, -0.9f, -4.01f, -0.9f)
                curveToRelative(-2.4f, 0.0f, -4.56f, 0.56f, -6.49f, 1.64f)
                curveToRelative(-1.44f, 0.62f, -2.77f, 1.5f, -3.98f, 2.67f)
                curveToRelative(-2.57f, 2.48f, -4.54f, 5.62f, -5.92f, 9.41f)
                curveToRelative(-0.63f, 1.73f, -1.09f, 3.46f, -1.39f, 5.21f)
                curveToRelative(-0.33f, 1.95f, -0.39f, 3.66f, -0.5f, 5.41f)
                curveToRelative(-0.41f, 0.74f, -0.9f, 1.4f, -1.49f, 1.99f)
                curveToRelative(-0.34f, 0.35f, -0.69f, 0.63f, -1.05f, 0.87f)
                curveToRelative(-0.44f, 0.14f, -0.89f, 0.22f, -1.35f, 0.22f)
                curveToRelative(-0.3f, 0.0f, -0.56f, -0.03f, -0.81f, -0.07f)
                curveToRelative(-0.38f, -0.37f, -0.58f, -0.89f, -0.58f, -1.57f)
                curveToRelative(0.0f, -0.34f, 0.02f, -0.69f, 0.06f, -1.03f)
                lineToRelative(7.7f, -36.63f)
                curveToRelative(0.12f, -0.47f, -0.75f, -0.94f, -1.19f, -1.06f)
                close()
                moveTo(59.91f, 60.92f)
                curveToRelative(0.94f, 0.09f, 1.15f, 0.72f, 1.53f, 1.5f)
                lineToRelative(-2.9f, 13.66f)
                curveToRelative(-0.41f, 1.81f, -1.15f, 3.24f, -2.23f, 4.3f)
                curveToRelative(-0.29f, 0.28f, -0.59f, 0.51f, -0.89f, 0.72f)
                curveToRelative(-0.96f, 0.56f, -1.3f, 0.82f, -2.0f, 0.13f)
                curveToRelative(-0.82f, -0.78f, -1.23f, -2.15f, -1.23f, -4.11f)
                curveToRelative(0.0f, -1.01f, 0.05f, -1.97f, 0.16f, -2.88f)
                curveToRelative(0.04f, -0.36f, 0.1f, -0.7f, 0.15f, -1.05f)
                curveToRelative(0.89f, -4.45f, 2.48f, -7.98f, 4.77f, -10.58f)
                curveToRelative(0.83f, -0.81f, 1.98f, -1.58f, 2.64f, -1.69f)
                close()
                moveTo(112.44f, 60.92f)
                curveToRelative(0.36f, 0.0f, 0.71f, 0.17f, 1.02f, 0.57f)
                curveToRelative(0.03f, 0.04f, 0.07f, 0.08f, 0.09f, 0.13f)
                curveToRelative(0.18f, 0.29f, 0.32f, 0.56f, 0.42f, 0.81f)
                lineToRelative(-2.9f, 13.66f)
                curveToRelative(-0.41f, 1.81f, -1.15f, 3.24f, -2.23f, 4.3f)
                curveToRelative(-0.29f, 0.28f, -0.59f, 0.51f, -0.89f, 0.72f)
                curveToRelative(-0.82f, 0.41f, -1.33f, 0.64f, -2.0f, 0.13f)
                curveToRelative(-0.82f, -0.78f, -1.23f, -2.15f, -1.23f, -4.11f)
                curveToRelative(0.0f, -1.01f, 0.05f, -1.97f, 0.16f, -2.88f)
                curveToRelative(0.04f, -0.36f, 0.1f, -0.7f, 0.15f, -1.05f)
                curveToRelative(0.89f, -4.45f, 2.48f, -7.98f, 4.77f, -10.58f)
                curveToRelative(0.01f, -0.01f, 0.02f, -0.02f, 0.03f, -0.03f)
                curveToRelative(0.67f, -0.64f, 1.67f, -1.67f, 2.61f, -1.66f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF7548B2), 1.0f to Color(0xFF6639A4), start =
                    Offset(27.85f,37.57f), end = Offset(27.85f,89.32f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(25.2f, 38.73f)
                verticalLineToRelative(0.0f)
                curveToRelative(-5.5f, 0.0f, -10.76f, 1.77f, -15.78f, 5.3f)
                curveToRelative(-2.2f, 1.6f, -4.0f, 3.43f, -5.4f, 5.5f)
                curveToRelative(-1.38f, 2.05f, -2.07f, 4.18f, -2.07f, 6.4f)
                curveToRelative(0.0f, 1.21f, 0.15f, 2.22f, 0.45f, 3.04f)
                curveToRelative(0.88f, 2.26f, 3.09f, 3.4f, 6.63f, 3.4f)
                curveToRelative(0.0f, -0.13f, -0.05f, -0.28f, -0.16f, -0.45f)
                curveToRelative(-0.5f, -0.91f, -0.74f, -2.25f, -0.74f, -4.04f)
                curveToRelative(0.0f, -3.69f, 0.86f, -6.77f, 2.59f, -9.25f)
                curveToRelative(1.75f, -2.48f, 4.17f, -4.3f, 7.28f, -5.47f)
                lineToRelative(1.07f, 45.25f)
                horizontalLineToRelative(9.54f)
                lineToRelative(18.4f, -49.36f)
                horizontalLineToRelative(-4.63f)
                lineToRelative(-13.94f, 40.56f)
                lineToRelative(-0.58f, -40.75f)
                curveToRelative(-0.86f, -0.09f, -1.75f, -0.13f, -2.65f, -0.13f)
                close()
                moveTo(93.68f, 42.28f)
                lineTo(83.88f, 43.61f)
                lineTo(76.8f, 76.79f)
                curveToRelative(-0.01f, 0.03f, -0.01f, 0.06f, -0.02f, 0.09f)
                curveToRelative(-1.23f, 4.1f, -3.01f, 6.15f, -5.34f, 6.15f)
                curveToRelative(-1.81f, 0.0f, -2.72f, -0.95f, -2.72f, -2.85f)
                curveToRelative(0.0f, -0.67f, 0.1f, -1.38f, 0.29f, -2.13f)
                lineToRelative(4.75f, -22.51f)
                horizontalLineToRelative(-9.54f)
                lineToRelative(-0.71f, 3.52f)
                verticalLineToRelative(-0.49f)
                curveToRelative(0.0f, -0.97f, -0.42f, -1.77f, -1.26f, -2.39f)
                curveToRelative(-0.84f, -0.65f, -2.21f, -0.97f, -4.11f, -0.97f)
                curveToRelative(-3.62f, 0.0f, -6.72f, 1.24f, -9.28f, 3.72f)
                curveToRelative(-2.57f, 2.48f, -4.54f, 5.62f, -5.92f, 9.41f)
                curveToRelative(-0.63f, 1.73f, -1.09f, 3.46f, -1.39f, 5.21f)
                curveToRelative(-0.3f, 1.73f, -0.45f, 3.46f, -0.45f, 5.21f)
                curveToRelative(0.0f, 1.73f, 0.25f, 3.27f, 0.74f, 4.62f)
                curveToRelative(1.38f, 3.77f, 3.99f, 5.66f, 7.83f, 5.66f)
                curveToRelative(3.86f, 0.0f, 7.24f, -2.03f, 10.12f, -6.08f)
                curveToRelative(0.43f, 4.05f, 2.6f, 6.08f, 6.5f, 6.08f)
                curveToRelative(4.15f, 0.0f, 7.53f, -1.91f, 10.15f, -5.74f)
                curveToRelative(0.28f, 1.68f, 0.9f, 2.97f, 1.87f, 3.86f)
                curveToRelative(1.38f, 1.25f, 2.94f, 1.88f, 4.69f, 1.88f)
                curveToRelative(4.69f, 0.0f, 8.43f, -2.02f, 11.23f, -6.07f)
                curveToRelative(0.04f, 0.14f, 0.09f, 0.28f, 0.14f, 0.41f)
                curveToRelative(1.38f, 3.77f, 4.03f, 5.66f, 7.96f, 5.66f)
                curveToRelative(3.92f, 0.0f, 7.26f, -2.05f, 9.99f, -6.15f)
                curveToRelative(0.26f, 1.96f, 0.95f, 3.48f, 2.07f, 4.56f)
                curveToRelative(1.12f, 1.06f, 2.55f, 1.58f, 4.3f, 1.58f)
                curveToRelative(1.77f, 0.0f, 3.23f, -0.63f, 4.37f, -1.88f)
                curveToRelative(0.65f, -0.73f, 1.43f, -2.34f, 2.36f, -4.82f)
                curveToRelative(-0.39f, 0.19f, -0.87f, 0.29f, -1.46f, 0.29f)
                curveToRelative(-1.81f, 0.0f, -2.72f, -0.75f, -2.72f, -2.26f)
                curveToRelative(0.0f, -0.8f, 0.1f, -1.58f, 0.29f, -2.33f)
                lineToRelative(4.75f, -22.51f)
                horizontalLineToRelative(-9.54f)
                lineToRelative(-0.71f, 3.53f)
                verticalLineToRelative(-0.49f)
                curveToRelative(0.0f, -0.97f, -0.42f, -1.77f, -1.26f, -2.39f)
                curveToRelative(-0.84f, -0.65f, -2.21f, -0.97f, -4.11f, -0.97f)
                curveToRelative(-3.62f, 0.0f, -6.72f, 1.24f, -9.28f, 3.72f)
                curveToRelative(-2.57f, 2.48f, -4.54f, 5.62f, -5.92f, 9.41f)
                curveToRelative(-0.63f, 1.73f, -1.09f, 3.46f, -1.39f, 5.21f)
                curveToRelative(-0.3f, 1.73f, -0.45f, 3.46f, -0.45f, 5.21f)
                curveToRelative(0.0f, 0.04f, 0.0f, 0.09f, 0.0f, 0.13f)
                curveToRelative(-0.42f, 0.77f, -0.93f, 1.46f, -1.53f, 2.07f)
                curveToRelative(-1.1f, 1.12f, -2.29f, 1.68f, -3.59f, 1.68f)
                curveToRelative(-1.79f, 0.0f, -2.69f, -0.74f, -2.69f, -2.23f)
                curveToRelative(0.0f, -0.78f, 0.08f, -1.56f, 0.26f, -2.36f)
                close()
                moveTo(59.92f, 59.33f)
                curveToRelative(1.23f, 0.0f, 2.03f, 0.32f, 2.39f, 0.97f)
                curveToRelative(0.39f, 0.63f, 0.58f, 1.14f, 0.58f, 1.55f)
                lineToRelative(-3.17f, 14.94f)
                curveToRelative(-0.41f, 1.81f, -1.15f, 3.24f, -2.23f, 4.3f)
                curveToRelative(-1.08f, 1.03f, -2.27f, 1.55f, -3.59f, 1.55f)
                curveToRelative(-0.71f, 0.0f, -1.3f, -0.24f, -1.78f, -0.71f)
                curveToRelative(-0.82f, -0.78f, -1.23f, -2.15f, -1.23f, -4.11f)
                curveToRelative(0.0f, -1.01f, 0.05f, -1.97f, 0.16f, -2.88f)
                curveToRelative(0.71f, -5.93f, 2.47f, -10.48f, 5.27f, -13.65f)
                curveToRelative(1.16f, -1.32f, 2.36f, -1.97f, 3.59f, -1.97f)
                close()
                moveTo(112.45f, 59.33f)
                curveToRelative(1.23f, 0.0f, 2.03f, 0.32f, 2.39f, 0.97f)
                curveToRelative(0.39f, 0.63f, 0.58f, 1.14f, 0.58f, 1.55f)
                lineToRelative(-3.17f, 14.94f)
                curveToRelative(-0.41f, 1.81f, -1.15f, 3.24f, -2.23f, 4.3f)
                curveToRelative(-1.08f, 1.03f, -2.27f, 1.55f, -3.59f, 1.55f)
                curveToRelative(-0.71f, 0.0f, -1.3f, -0.24f, -1.78f, -0.71f)
                curveToRelative(-0.82f, -0.78f, -1.23f, -2.15f, -1.23f, -4.11f)
                curveToRelative(0.0f, -1.01f, 0.05f, -1.97f, 0.16f, -2.88f)
                curveToRelative(0.71f, -5.93f, 2.47f, -10.48f, 5.27f, -13.65f)
                curveToRelative(1.16f, -1.32f, 2.36f, -1.97f, 3.59f, -1.97f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(25.2f, 37.44f)
                verticalLineToRelative(0.0f)
                curveToRelative(-5.5f, 0.0f, -10.76f, 1.77f, -15.78f, 5.3f)
                curveToRelative(-2.2f, 1.6f, -4.0f, 3.43f, -5.4f, 5.5f)
                curveToRelative(-1.38f, 2.05f, -2.07f, 4.18f, -2.07f, 6.4f)
                curveToRelative(0.0f, 1.21f, 0.15f, 2.22f, 0.45f, 3.04f)
                curveToRelative(0.88f, 2.26f, 3.09f, 3.4f, 6.63f, 3.4f)
                curveToRelative(0.0f, -0.13f, -0.05f, -0.28f, -0.16f, -0.45f)
                curveToRelative(-0.5f, -0.91f, -0.74f, -2.25f, -0.74f, -4.04f)
                curveToRelative(0.0f, -3.69f, 0.86f, -6.77f, 2.59f, -9.25f)
                curveToRelative(1.75f, -2.48f, 4.17f, -4.3f, 7.28f, -5.47f)
                lineToRelative(1.07f, 45.25f)
                horizontalLineToRelative(9.54f)
                lineToRelative(18.4f, -49.36f)
                horizontalLineToRelative(-4.63f)
                lineToRelative(-13.94f, 40.56f)
                lineToRelative(-0.58f, -40.75f)
                curveToRelative(-0.86f, -0.09f, -1.75f, -0.13f, -2.65f, -0.13f)
                close()
                moveTo(93.68f, 40.99f)
                lineTo(83.88f, 42.31f)
                lineTo(76.8f, 75.5f)
                curveToRelative(-0.01f, 0.03f, -0.01f, 0.06f, -0.02f, 0.09f)
                curveToRelative(-1.23f, 4.1f, -3.01f, 6.15f, -5.34f, 6.15f)
                curveToRelative(-1.81f, 0.0f, -2.72f, -0.95f, -2.72f, -2.85f)
                curveToRelative(0.0f, -0.67f, 0.1f, -1.38f, 0.29f, -2.13f)
                lineToRelative(4.75f, -22.51f)
                horizontalLineToRelative(-9.54f)
                lineToRelative(-0.71f, 3.52f)
                verticalLineToRelative(-0.49f)
                curveToRelative(0.0f, -0.97f, -0.42f, -1.77f, -1.26f, -2.39f)
                curveToRelative(-0.84f, -0.65f, -2.21f, -0.97f, -4.11f, -0.97f)
                curveToRelative(-3.62f, 0.0f, -6.72f, 1.24f, -9.28f, 3.72f)
                curveToRelative(-2.57f, 2.48f, -4.54f, 5.62f, -5.92f, 9.41f)
                curveToRelative(-0.63f, 1.73f, -1.09f, 3.46f, -1.39f, 5.21f)
                curveToRelative(-0.3f, 1.73f, -0.45f, 3.46f, -0.45f, 5.21f)
                curveToRelative(0.0f, 1.73f, 0.25f, 3.27f, 0.74f, 4.62f)
                curveToRelative(1.38f, 3.77f, 3.99f, 5.66f, 7.83f, 5.66f)
                curveToRelative(3.86f, 0.0f, 7.24f, -2.03f, 10.12f, -6.08f)
                curveToRelative(0.43f, 4.05f, 2.6f, 6.08f, 6.5f, 6.08f)
                curveToRelative(4.15f, 0.0f, 7.53f, -1.91f, 10.15f, -5.74f)
                curveToRelative(0.28f, 1.68f, 0.9f, 2.97f, 1.87f, 3.86f)
                curveToRelative(1.38f, 1.25f, 2.94f, 1.88f, 4.69f, 1.88f)
                curveToRelative(4.69f, 0.0f, 8.43f, -2.02f, 11.23f, -6.07f)
                curveToRelative(0.04f, 0.14f, 0.09f, 0.28f, 0.14f, 0.41f)
                curveToRelative(1.38f, 3.77f, 4.03f, 5.66f, 7.96f, 5.66f)
                curveToRelative(3.92f, 0.0f, 7.26f, -2.05f, 9.99f, -6.15f)
                curveToRelative(0.26f, 1.96f, 0.95f, 3.48f, 2.07f, 4.56f)
                curveToRelative(1.12f, 1.06f, 2.55f, 1.58f, 4.3f, 1.58f)
                curveToRelative(1.77f, 0.0f, 3.23f, -0.63f, 4.37f, -1.88f)
                curveToRelative(0.65f, -0.73f, 1.43f, -2.34f, 2.36f, -4.82f)
                curveToRelative(-0.39f, 0.19f, -0.87f, 0.29f, -1.46f, 0.29f)
                curveToRelative(-1.81f, 0.0f, -2.72f, -0.75f, -2.72f, -2.26f)
                curveToRelative(0.0f, -0.8f, 0.1f, -1.58f, 0.29f, -2.33f)
                lineToRelative(4.75f, -22.51f)
                horizontalLineToRelative(-9.54f)
                lineToRelative(-0.71f, 3.53f)
                verticalLineToRelative(-0.49f)
                curveToRelative(0.0f, -0.97f, -0.42f, -1.77f, -1.26f, -2.39f)
                curveToRelative(-0.84f, -0.65f, -2.21f, -0.97f, -4.11f, -0.97f)
                curveToRelative(-3.62f, 0.0f, -6.72f, 1.24f, -9.28f, 3.72f)
                curveToRelative(-2.57f, 2.48f, -4.54f, 5.62f, -5.92f, 9.41f)
                curveToRelative(-0.63f, 1.73f, -1.09f, 3.46f, -1.39f, 5.21f)
                curveToRelative(-0.3f, 1.73f, -0.45f, 3.46f, -0.45f, 5.21f)
                curveToRelative(0.0f, 0.04f, 0.0f, 0.09f, 0.0f, 0.13f)
                curveToRelative(-0.42f, 0.77f, -0.93f, 1.46f, -1.53f, 2.07f)
                curveToRelative(-1.1f, 1.12f, -2.29f, 1.68f, -3.59f, 1.68f)
                curveToRelative(-1.79f, 0.0f, -2.69f, -0.74f, -2.69f, -2.23f)
                curveToRelative(0.0f, -0.78f, 0.08f, -1.56f, 0.26f, -2.36f)
                close()
                moveTo(59.92f, 58.03f)
                curveToRelative(1.23f, 0.0f, 2.03f, 0.32f, 2.39f, 0.97f)
                curveToRelative(0.39f, 0.63f, 0.58f, 1.14f, 0.58f, 1.55f)
                lineToRelative(-3.17f, 14.94f)
                curveToRelative(-0.41f, 1.81f, -1.15f, 3.24f, -2.23f, 4.3f)
                curveToRelative(-1.08f, 1.03f, -2.27f, 1.55f, -3.59f, 1.55f)
                curveToRelative(-0.71f, 0.0f, -1.3f, -0.24f, -1.78f, -0.71f)
                curveToRelative(-0.82f, -0.78f, -1.23f, -2.15f, -1.23f, -4.11f)
                curveToRelative(0.0f, -1.01f, 0.05f, -1.97f, 0.16f, -2.88f)
                curveToRelative(0.71f, -5.93f, 2.47f, -10.48f, 5.27f, -13.65f)
                curveToRelative(1.16f, -1.32f, 2.36f, -1.97f, 3.59f, -1.97f)
                close()
                moveTo(112.45f, 58.04f)
                curveToRelative(1.23f, 0.0f, 2.03f, 0.32f, 2.39f, 0.97f)
                curveToRelative(0.39f, 0.63f, 0.58f, 1.14f, 0.58f, 1.55f)
                lineToRelative(-3.17f, 14.94f)
                curveToRelative(-0.41f, 1.81f, -1.15f, 3.24f, -2.23f, 4.3f)
                curveToRelative(-1.08f, 1.03f, -2.27f, 1.55f, -3.59f, 1.55f)
                curveToRelative(-0.71f, 0.0f, -1.3f, -0.24f, -1.78f, -0.71f)
                curveToRelative(-0.82f, -0.78f, -1.23f, -2.15f, -1.23f, -4.11f)
                curveToRelative(0.0f, -1.01f, 0.05f, -1.97f, 0.16f, -2.88f)
                curveToRelative(0.71f, -5.93f, 2.47f, -10.48f, 5.27f, -13.65f)
                curveToRelative(1.16f, -1.32f, 2.36f, -1.97f, 3.59f, -1.97f)
                close()
            }
        }
        .build()
        return _originalWordmark!!
    }

private var _originalWordmark: ImageVector? = null
