package com.woowla.compose.icon.collections.devicons.devicons.firefox

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.FirefoxGroup

public val FirefoxGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF110070)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.73f, 63.79f)
                arcToRelative(59.1f, 59.14f, 0.0f, true, false, 118.2f, 0.0f)
                arcToRelative(59.1f, 59.14f, 0.0f, true, false, -118.2f, 0.0f)
                close()
            }
            path(fill = radialGradient(0.0f to Color(0xFF67C5D5), 0.16f to Color(0xFF66C2D3), 0.28f
                    to Color(0xFF62B9CE), 0.39f to Color(0xFF5CA8C6), 0.48f to Color(0xFF5392BA),
                    0.58f to Color(0xFF4874AA), 0.67f to Color(0xFF3A5097), 0.75f to
                    Color(0xFF2A2781), 0.81f to Color(0xFF1B006D), 1.0f to Color(0xFF596AAD), center
                    = Offset(64.64f,11.85f), radius = 103.81f), stroke = null, strokeLineWidth =
                    0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.85f, 63.79f)
                arcToRelative(57.99f, 58.02f, 0.0f, true, false, 115.97f, 0.0f)
                arcToRelative(57.99f, 58.02f, 0.0f, true, false, -115.97f, 0.0f)
                close()
            }
            path(fill = radialGradient(0.0f to Color(0xFF0F80BC), 0.34f to Color(0xFF0A5F9E), 1.0f
                    to Color(0xFF00145A), center = Offset(64.63f,18.77f), radius = 52.02f), stroke =
                    null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(55.52f, 93.74f)
                curveToRelative(-0.07f, -0.31f, -0.85f, -1.23f, -1.45f, -1.43f)
                curveToRelative(-0.6f, -0.2f, -1.18f, 0.88f, -1.57f, -0.92f)
                curveToRelative(-1.26f, 0.72f, -1.8f, -0.2f, -1.8f, -0.2f)
                reflectiveCurveToRelative(-1.36f, 0.08f, -1.62f, 1.74f)
                curveToRelative(-0.65f, 0.77f, -2.31f, 3.55f, -1.42f, 0.65f)
                curveToRelative(0.89f, -2.91f, -0.94f, -0.23f, -1.11f, 1.24f)
                curveToRelative(-0.32f, 0.65f, -0.85f, 0.71f, -0.51f, -2.21f)
                curveToRelative(-1.17f, -0.4f, -1.77f, -3.12f, -1.13f, -3.17f)
                curveToRelative(-0.74f, -1.04f, -0.16f, -2.62f, 0.46f, -2.54f)
                curveToRelative(0.62f, 0.08f, 1.68f, -1.35f, 1.65f, -1.69f)
                curveToRelative(-0.03f, -0.33f, 0.48f, -0.09f, 0.45f, -2.33f)
                curveToRelative(-0.03f, -2.24f, 0.84f, -2.79f, 0.92f, -0.92f)
                curveToRelative(0.08f, 1.86f, 1.19f, -0.61f, 1.08f, -1.56f)
                curveToRelative(-0.12f, -0.94f, 0.11f, -3.08f, 0.79f, -1.82f)
                curveToRelative(-0.79f, -3.13f, -0.17f, -3.25f, 0.31f, -1.17f)
                curveToRelative(1.19f, 0.09f, 1.23f, 0.73f, 1.23f, 0.73f)
                curveToRelative(1.32f, -0.32f, 1.95f, 0.67f, 2.05f, 1.22f)
                curveToRelative(1.22f, -1.44f, 2.45f, 0.11f, 2.45f, 0.11f)
                reflectiveCurveToRelative(0.85f, -0.28f, 0.44f, 1.2f)
                curveToRelative(-0.41f, 1.47f, 1.76f, 0.68f, 1.25f, -0.38f)
                curveToRelative(1.07f, -0.54f, 2.65f, 1.1f, 3.15f, 2.22f)
                curveToRelative(0.5f, 1.12f, -0.86f, 2.71f, 0.2f, 3.1f)
                curveToRelative(1.06f, 0.38f, 0.6f, 2.23f, 0.6f, 2.23f)
                reflectiveCurveToRelative(2.22f, 1.23f, 0.68f, 2.29f)
                lineToRelative(-0.52f, 1.26f)
                reflectiveCurveToRelative(1.01f, 1.12f, 1.35f, 0.45f)
                curveToRelative(0.34f, -0.67f, 0.46f, 0.68f, 0.46f, 0.68f)
                curveToRelative(-0.13f, -0.24f, 0.25f, 1.39f, 1.63f, 1.73f)
                curveToRelative(1.39f, 0.34f, 2.27f, 2.54f, 0.73f, 2.57f)
                curveToRelative(-1.54f, 0.03f, -1.66f, -0.02f, -2.08f, 0.88f)
                curveToRelative(-0.42f, 0.89f, -2.38f, 0.93f, -3.4f, -0.23f)
                curveToRelative(-1.08f, 0.37f, -3.01f, -0.11f, -2.44f, -0.97f)
                curveToRelative(-0.93f, 0.55f, -1.82f, -0.92f, -1.09f, -1.57f)
                curveToRelative(0.73f, -0.65f, -0.41f, -1.49f, -0.79f, -0.56f)
                curveToRelative(-0.38f, 0.93f, -2.39f, 1.39f, -2.25f, -0.19f)
                curveToRelative(0.04f, -0.47f, 1.12f, -0.75f, 1.13f, -0.35f)
                curveToRelative(0.2f, 0.45f, 0.28f, -0.04f, 0.2f, -0.1f)
                close()
            }
            path(fill = radialGradient(0.0f to Color(0xFF0F80BC), 0.34f to Color(0xFF0A5F9E), 1.0f
                    to Color(0xFF00145A), center = Offset(64.63f,18.77f), radius = 52.02f), stroke =
                    null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(103.46f, 48.39f)
                curveToRelative(0.31f, 0.31f, 0.91f, 0.24f, 1.25f, 0.14f)
                curveToRelative(0.34f, -0.1f, 0.29f, -0.34f, 0.58f, -0.43f)
                curveToRelative(0.29f, -0.1f, 1.39f, 0.43f, 1.1f, 1.58f)
                curveToRelative(-0.67f, 0.09f, -0.91f, 0.91f, -0.91f, 0.91f)
                reflectiveCurveToRelative(-0.67f, 0.29f, -1.01f, 0.14f)
                curveToRelative(-0.34f, -0.14f, -0.34f, -0.1f, -0.82f, -0.05f)
                curveToRelative(-0.48f, 0.05f, -1.64f, -0.62f, -0.39f, -0.62f)
                curveToRelative(1.25f, 0.0f, -0.14f, -0.58f, -0.67f, -0.58f)
                curveToRelative(-0.53f, 0.0f, -0.1f, -0.53f, 0.53f, -0.38f)
                curveToRelative(-0.44f, -0.72f, -0.19f, -1.25f, 0.34f, -0.72f)
                close()
            }
            path(fill = radialGradient(0.0f to Color(0xFF0F80BC), 0.34f to Color(0xFF0A5F9E), 1.0f
                    to Color(0xFF00145A), center = Offset(64.62f,18.77f), radius = 52.03f), stroke =
                    null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(99.13f, 50.99f)
                curveToRelative(-0.34f, 0.33f, 0.05f, 1.34f, 0.48f, 1.29f)
                curveToRelative(0.43f, -0.05f, 1.11f, -0.24f, 1.11f, -0.24f)
                reflectiveCurveToRelative(0.34f, 0.67f, 0.0f, 0.86f)
                curveToRelative(-0.34f, 0.19f, -1.31f, 0.11f, -0.05f, 0.57f)
                curveToRelative(1.3f, 0.48f, 1.63f, 0.33f, 1.73f, 0.09f)
                curveToRelative(0.1f, -0.24f, 0.53f, -1.05f, 0.77f, -1.0f)
                curveToRelative(0.19f, -0.43f, -0.67f, -0.81f, -0.19f, -1.1f)
                curveToRelative(0.48f, -0.29f, 0.1f, -1.34f, 0.1f, -1.34f)
                reflectiveCurveToRelative(-0.68f, 0.05f, -0.96f, 0.53f)
                curveToRelative(-0.29f, 0.48f, -0.67f, -0.05f, -0.96f, -0.05f)
                arcToRelative(1.29f, 1.29f, 0.0f, false, true, -0.24f, 0.52f)
                lineToRelative(-0.19f, -0.43f)
                curveToRelative(-0.0f, 0.0f, -1.35f, -0.05f, -1.59f, 0.29f)
                close()
            }
            path(fill = radialGradient(0.0f to Color(0xFF0F80BC), 0.26f to Color(0xFF0B629B), 0.84f
                    to Color(0xFF031747), 1.0f to Color(0xFF00022F), center = Offset(65.48f,23.69f),
                    radius = 57.16f), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(90.14f, 51.78f)
                curveToRelative(-0.04f, -0.12f, 0.38f, -0.62f, 0.27f, 0.02f)
                curveToRelative(-0.26f, 0.46f, 1.05f, 0.87f, 1.42f, 0.36f)
                curveToRelative(1.24f, -1.69f, -1.17f, -2.51f, -2.21f, -1.73f)
                curveToRelative(-1.05f, 0.79f, -1.63f, -0.91f, -0.42f, -1.15f)
                curveToRelative(1.2f, -0.24f, 1.31f, -2.42f, -0.02f, -2.43f)
                curveToRelative(1.17f, -0.58f, -0.45f, -2.31f, -1.79f, -2.61f)
                curveToRelative(-0.22f, -1.86f, -2.18f, -3.05f, -3.21f, -2.37f)
                curveToRelative(-1.04f, 0.68f, -1.13f, 0.56f, -2.66f, -0.37f)
                curveToRelative(-1.52f, -0.92f, -2.26f, 1.92f, -1.13f, 3.16f)
                curveToRelative(1.13f, 1.25f, 0.31f, 3.27f, 0.35f, 2.92f)
                curveToRelative(0.0f, 0.0f, -0.42f, 0.76f, -0.4f, 1.05f)
                curveToRelative(-1.29f, 0.44f, -1.66f, -1.38f, -2.46f, -1.78f)
                curveToRelative(-0.58f, 0.76f, -1.52f, 1.17f, -1.52f, 1.17f)
                lineToRelative(0.07f, -1.55f)
                reflectiveCurveToRelative(-4.0f, -2.18f, -5.23f, -1.57f)
                curveToRelative(-1.51f, 0.47f, -1.87f, 3.97f, -0.5f, 4.49f)
                curveToRelative(1.38f, 0.52f, -1.73f, 1.81f, 1.39f, 5.09f)
                curveToRelative(3.2f, 3.37f, 4.44f, 3.47f, 5.09f, 2.92f)
                curveToRelative(0.16f, -0.14f, 0.44f, -0.34f, 0.78f, -0.58f)
                curveToRelative(0.03f, 0.13f, 0.08f, 0.25f, 0.16f, 0.37f)
                curveToRelative(0.8f, 1.2f, -1.86f, 2.15f, -2.23f, 3.88f)
                curveToRelative(-0.38f, 1.74f, -0.03f, 4.99f, 1.55f, 5.1f)
                curveToRelative(0.3f, -1.73f, 3.26f, -1.12f, 1.65f, 0.45f)
                curveToRelative(-1.64f, 1.6f, -0.49f, 1.88f, -0.49f, 1.88f)
                reflectiveCurveToRelative(0.08f, 2.99f, 2.58f, 2.04f)
                curveToRelative(-0.07f, 0.17f, -0.13f, 0.39f, -0.17f, 0.63f)
                curveToRelative(-0.7f, -0.14f, -2.41f, -0.36f, -2.83f, 0.84f)
                curveToRelative(-0.53f, 1.51f, -2.76f, -0.51f, -4.33f, 0.17f)
                curveToRelative(-1.56f, 0.67f, -3.83f, 2.88f, -3.06f, 4.43f)
                curveToRelative(1.47f, -0.7f, 2.6f, 2.45f, 0.54f, 1.8f)
                curveToRelative(-2.06f, -0.65f, -1.66f, 0.58f, -1.66f, 0.58f)
                reflectiveCurveToRelative(-2.15f, 1.69f, -0.14f, 3.49f)
                curveToRelative(-0.77f, 0.12f, -2.14f, 0.98f, -1.68f, 2.86f)
                curveToRelative(0.0f, 0.0f, -0.88f, 0.03f, -1.0f, 1.72f)
                curveToRelative(-2.88f, 0.58f, -2.7f, 1.47f, 1.63f, 0.49f)
                curveToRelative(-1.75f, 0.9f, 1.22f, 1.33f, 2.54f, 1.21f)
                curveToRelative(1.32f, -0.12f, 4.77f, 1.58f, 2.18f, 1.6f)
                curveToRelative(-2.6f, 0.02f, -1.83f, 1.29f, 1.29f, 1.35f)
                curveToRelative(3.11f, 0.06f, 2.78f, 0.79f, 3.25f, 0.75f)
                curveToRelative(0.46f, -0.03f, 2.47f, 1.55f, 2.37f, 2.43f)
                curveToRelative(-0.11f, 0.88f, 2.11f, 1.79f, 3.55f, 0.79f)
                curveToRelative(0.07f, 0.92f, 3.87f, 0.2f, 4.43f, -1.45f)
                curveToRelative(4.11f, 0.63f, 4.02f, -0.14f, 3.1f, -0.63f)
                curveToRelative(-2.06f, -0.31f, -5.84f, -3.05f, -1.74f, -1.64f)
                curveToRelative(4.08f, 1.4f, 0.15f, -1.11f, -0.93f, -2.07f)
                curveToRelative(-2.34f, -0.46f, -2.46f, -2.41f, -2.46f, -2.41f)
                reflectiveCurveToRelative(1.29f, -0.74f, 0.27f, -2.58f)
                curveToRelative(2.53f, -0.47f, 1.0f, -1.36f, 1.28f, -2.21f)
                curveToRelative(0.28f, -0.85f, 1.57f, -1.93f, 2.01f, -2.02f)
                curveToRelative(0.08f, -0.11f, 0.77f, 0.02f, 0.13f, 0.28f)
                curveToRelative(-0.55f, 0.0f, -0.16f, 1.56f, 0.5f, 1.64f)
                curveToRelative(2.23f, 0.27f, 1.58f, -2.64f, 0.27f, -3.23f)
                curveToRelative(-1.32f, -0.59f, -0.13f, -2.19f, 0.79f, -1.12f)
                curveToRelative(0.92f, 1.08f, 2.98f, -0.13f, 2.21f, -1.5f)
                curveToRelative(1.23f, 0.85f, 1.89f, -1.9f, 1.37f, -3.48f)
                curveToRelative(1.64f, -1.42f, 1.59f, -4.26f, 0.32f, -4.9f)
                curveToRelative(-0.63f, -0.31f, -0.93f, -0.51f, -1.08f, -0.9f)
                curveToRelative(0.75f, -0.36f, 1.75f, -0.62f, 2.15f, -0.27f)
                curveToRelative(0.64f, 0.58f, 2.41f, -1.01f, 2.3f, -2.87f)
                curveToRelative(0.75f, 0.41f, 1.94f, -3.38f, 0.93f, -4.71f)
                curveToRelative(2.32f, -3.24f, 1.69f, -3.53f, 0.92f, -2.99f)
                curveToRelative(-1.17f, 1.62f, -4.99f, 3.55f, -2.03f, 0.69f)
                curveToRelative(2.88f, -2.78f, -0.77f, -0.67f, -1.99f, -0.22f)
                curveToRelative(-1.44f, 1.8f, -2.96f, 0.93f, -2.96f, 0.93f)
                reflectiveCurveToRelative(0.06f, -1.47f, -1.79f, -1.5f)
                curveToRelative(0.86f, -2.36f, -0.52f, -1.51f, -1.01f, -2.15f)
                curveToRelative(-0.48f, -0.65f, -0.66f, -2.22f, -0.51f, -2.63f)
                close()
            }
            path(fill = radialGradient(0.0f to Color(0xFF0F80BC), 0.34f to Color(0xFF0A5F9E), 1.0f
                    to Color(0xFF00145A), center = Offset(64.63f,18.77f), radius = 52.03f), stroke =
                    null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(60.1f, 28.1f)
                curveToRelative(-0.36f, 0.94f, 1.17f, 2.46f, 1.94f, 1.97f)
                curveToRelative(0.77f, -0.5f, 1.88f, -1.48f, 1.88f, -1.48f)
                reflectiveCurveToRelative(1.17f, 0.94f, 0.7f, 1.61f)
                curveToRelative(-0.48f, 0.67f, -2.38f, 1.42f, 0.37f, 1.12f)
                curveToRelative(2.82f, -0.31f, 3.33f, -0.89f, 3.32f, -1.43f)
                curveToRelative(-0.01f, -0.54f, 0.14f, -2.46f, 0.63f, -2.59f)
                curveToRelative(0.01f, -0.99f, -1.92f, -0.89f, -1.25f, -1.88f)
                curveToRelative(0.67f, -0.98f, -0.9f, -2.6f, -0.9f, -2.6f)
                reflectiveCurveToRelative(-1.22f, 0.72f, -1.38f, 1.88f)
                curveToRelative(-0.15f, 1.16f, -1.3f, 0.54f, -1.84f, 0.8f)
                curveToRelative(0.14f, 0.58f, -0.03f, 1.21f, -0.03f, 1.21f)
                lineToRelative(-0.71f, -0.63f)
                reflectiveCurveToRelative(-2.56f, 1.16f, -2.74f, 2.01f)
                close()
            }
            path(fill = radialGradient(0.0f to Color(0xFF0F80BC), 0.34f to Color(0xFF0A5F9E), 1.0f
                    to Color(0xFF00145A), center = Offset(64.63f,18.77f), radius = 52.03f), stroke =
                    null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(64.68f, 77.33f)
                curveToRelative(-0.34f, 0.33f, 0.05f, 1.34f, 0.48f, 1.29f)
                curveToRelative(0.43f, -0.05f, 1.11f, -0.24f, 1.11f, -0.24f)
                reflectiveCurveToRelative(0.34f, 0.67f, 0.0f, 0.86f)
                curveToRelative(-0.34f, 0.19f, -1.31f, 0.11f, -0.05f, 0.57f)
                curveToRelative(1.3f, 0.48f, 1.63f, 0.34f, 1.73f, 0.1f)
                curveToRelative(0.1f, -0.24f, 0.53f, -1.05f, 0.77f, -1.01f)
                curveToRelative(0.19f, -0.43f, -0.67f, -0.81f, -0.19f, -1.1f)
                curveToRelative(0.48f, -0.29f, 0.1f, -1.34f, 0.1f, -1.34f)
                reflectiveCurveToRelative(-0.67f, 0.05f, -0.96f, 0.53f)
                curveToRelative(-0.29f, 0.48f, -0.67f, -0.05f, -0.96f, -0.05f)
                arcToRelative(1.31f, 1.31f, 0.0f, false, true, -0.24f, 0.53f)
                lineToRelative(-0.19f, -0.43f)
                curveToRelative(-0.0f, 0.0f, -1.35f, -0.05f, -1.59f, 0.29f)
                close()
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFF0F80BC), 0.34f to Color(0xFF0A5F9E),
                        1.0f to Color(0xFF00145A), start = Offset(76.4f,21.18f), end =
                        Offset(93.19f,22.61f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
                        = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(65.13f, 5.65f)
                    curveToRelative(-0.91f, 0.2f, 0.61f, 3.49f, 0.61f, 3.49f)
                    reflectiveCurveToRelative(-0.05f, 2.21f, 0.32f, 2.32f)
                    curveToRelative(0.37f, 0.11f, 2.84f, 0.73f, 4.13f, 2.34f)
                    curveToRelative(1.3f, 1.61f, 0.62f, 2.45f, -0.46f, 1.99f)
                    curveToRelative(-1.08f, -0.46f, -0.79f, 0.96f, -0.79f, 0.96f)
                    reflectiveCurveToRelative(3.26f, 1.06f, 0.8f, 0.99f)
                    curveToRelative(-2.47f, -0.06f, 1.66f, 1.74f, 1.39f, 1.92f)
                    curveToRelative(-0.27f, 0.19f, -0.43f, 1.23f, -0.43f, 1.23f)
                    reflectiveCurveToRelative(-2.17f, 0.18f, -0.33f, 0.95f)
                    curveToRelative(6.24f, 2.63f, -0.67f, 1.92f, -0.67f, 1.92f)
                    lineToRelative(-0.88f, 1.08f)
                    lineToRelative(1.74f, 2.19f)
                    lineToRelative(1.34f, 0.96f)
                    reflectiveCurveToRelative(2.82f, -0.94f, 3.7f, -1.09f)
                    curveToRelative(0.88f, -0.14f, 3.1f, -1.81f, 3.1f, -1.81f)
                    reflectiveCurveToRelative(0.67f, 0.48f, 0.17f, -0.5f)
                    curveToRelative(-0.5f, -0.97f, 1.83f, -0.54f, 2.41f, 0.19f)
                    lineToRelative(4.12f, 1.86f)
                    arcToRelative(0.78f, 0.78f, 0.0f, false, false, 0.29f, 0.37f)
                    curveToRelative(0.8f, 0.56f, -0.73f, 1.53f, -0.57f, 2.55f)
                    curveToRelative(0.16f, 1.01f, 1.09f, 2.69f, 2.11f, 2.52f)
                    curveToRelative(-0.18f, -0.96f, 1.84f, -1.08f, 1.14f, -0.0f)
                    curveToRelative(-0.7f, 1.07f, 0.08f, 1.05f, 0.08f, 1.05f)
                    reflectiveCurveToRelative(0.65f, 1.51f, 2.03f, 0.67f)
                    curveToRelative(-0.05f, 0.46f, 0.23f, 1.39f, 1.41f, 1.45f)
                    curveToRelative(0.0f, 0.0f, -0.13f, 0.5f, 0.85f, 0.86f)
                    curveToRelative(-0.13f, 1.73f, 0.42f, 1.78f, 0.56f, -0.84f)
                    curveToRelative(0.24f, 1.15f, 0.99f, -0.47f, 1.14f, -1.25f)
                    curveToRelative(0.15f, -0.78f, 1.75f, -2.49f, 1.32f, -0.98f)
                    curveToRelative(-0.43f, 1.5f, 4.72f, 2.05f, 5.29f, 0.26f)
                    curveToRelative(0.57f, -1.81f, 2.63f, -2.75f, 2.69f, -3.03f)
                    curveToRelative(0.06f, -0.28f, -4.56f, -0.71f, -4.05f, -0.49f)
                    curveToRelative(0.51f, 0.22f, 1.46f, -0.94f, 1.11f, -1.98f)
                    curveToRelative(0.57f, 0.12f, 0.83f, -2.29f, -0.08f, -2.91f)
                    curveToRelative(1.14f, -2.4f, 0.65f, -2.47f, 0.18f, -1.99f)
                    curveToRelative(-0.57f, 1.2f, -2.91f, 3.01f, -1.32f, 0.78f)
                    curveToRelative(1.6f, -2.25f, -0.65f, -0.28f, -1.43f, 0.21f)
                    curveToRelative(-0.69f, 1.33f, -1.89f, 1.08f, -1.89f, 1.08f)
                    reflectiveCurveToRelative(-0.22f, -0.91f, -1.51f, -0.6f)
                    curveToRelative(0.15f, -1.61f, -0.65f, -0.83f, -1.12f, -1.15f)
                    curveToRelative(-0.28f, -0.19f, -0.56f, -0.63f, -0.72f, -1.0f)
                    curveToRelative(1.11f, 0.45f, 2.6f, 0.93f, 2.35f, 0.1f)
                    curveToRelative(-0.17f, -0.54f, 2.1f, 0.64f, 2.18f, 0.39f)
                    lineToRelative(2.84f, -0.39f)
                    lineToRelative(2.76f, -1.74f)
                    curveTo(85.38f, 4.81f, 65.13f, 5.65f, 65.13f, 5.65f)
                    close()
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFF0F80BC), 0.34f to Color(0xFF0A5F9E),
                        1.0f to Color(0xFF00145A), start = Offset(38.67f,23.72f), end =
                        Offset(29.39f,37.35f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
                        = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(38.93f, 10.72f)
                    curveToRelative(-10.53f, 4.73f, -18.48f, 14.47f, -18.48f, 14.47f)
                    reflectiveCurveToRelative(0.93f, 2.14f, 1.26f, 1.98f)
                    curveToRelative(0.33f, -0.16f, -2.35f, 5.61f, -0.38f, 5.93f)
                    curveToRelative(1.98f, 0.32f, 7.67f, -3.56f, 6.61f, -3.21f)
                    curveToRelative(-1.05f, 0.35f, 0.59f, -2.11f, 0.59f, -2.11f)
                    reflectiveCurveToRelative(2.96f, -1.31f, 1.21f, 0.2f)
                    curveToRelative(-1.74f, 1.5f, 2.31f, 0.19f, 2.25f, 0.49f)
                    curveToRelative(-0.06f, 0.31f, 0.52f, 1.14f, 0.52f, 1.14f)
                    reflectiveCurveToRelative(-1.39f, 1.49f, 0.4f, 0.89f)
                    curveToRelative(6.15f, -2.07f, 0.81f, 1.77f, 0.81f, 1.77f)
                    lineToRelative(0.1f, 1.31f)
                    lineToRelative(2.66f, 0.46f)
                    lineToRelative(1.57f, -0.15f)
                    reflectiveCurveToRelative(1.38f, -2.43f, 1.91f, -3.09f)
                    curveToRelative(0.53f, -0.66f, 1.02f, -3.27f, 1.02f, -3.27f)
                    reflectiveCurveToRelative(0.8f, -0.08f, -0.21f, -0.47f)
                    curveToRelative(-1.01f, -0.38f, 0.97f, -1.58f, 1.88f, -1.43f)
                    lineToRelative(4.28f, -1.33f)
                    arcToRelative(0.81f, 0.81f, 0.0f, false, false, 0.47f, 0.08f)
                    curveToRelative(0.98f, -0.11f, 0.49f, 1.6f, 1.29f, 2.24f)
                    curveToRelative(0.79f, 0.64f, 2.62f, 1.26f, 3.27f, 0.47f)
                    curveToRelative(-0.78f, -0.59f, 0.67f, -2.0f, 0.86f, -0.75f)
                    curveToRelative(0.19f, 1.25f, 0.76f, 0.72f, 0.76f, 0.72f)
                    reflectiveCurveToRelative(1.54f, -2.64f, 2.03f, -4.16f)
                    curveToRelative(0.27f, 0.38f, 2.78f, -3.3f, 2.02f, -5.05f)
                    curveToRelative(-0.77f, -1.77f, 0.48f, -3.44f, 0.34f, -3.7f)
                    curveToRelative(-0.14f, -0.25f, -0.89f, 0.53f, -0.34f, 0.34f)
                    curveToRelative(0.56f, -0.19f, -1.58f, 0.77f, -1.87f, -2.05f)
                    curveToRelative(-0.29f, -2.88f, -0.7f, 0.24f, -0.98f, 1.16f)
                    curveToRelative(0.38f, 1.5f, 4.27f, -6.07f, 4.27f, -6.07f)
                    lineToRelative(5.02f, -2.05f)
                    curveToRelative(0.0f, 0.0f, -11.43f, -0.95f, -25.15f, 5.2f)
                    close()
                }
                path(fill = linearGradient(0.01f to Color(0x00000000), 0.65f to Color(0x33C4E0E3),
                        0.82f to Color(0xFFC4E0E3), 0.85f to Color(0xFFCDE5E8), 0.94f to
                        Color(0xFFE8F4F7), 1.0f to Color(0xFFF2FAFC), start = Offset(62.73f,39.06f),
                        end = Offset(62.73f,16.5f)), stroke = null, fillAlpha = 0.5f, strokeAlpha =
                        0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(32.03f, 27.83f)
                    arcToRelative(30.7f, 19.89f, 0.0f, true, false, 61.41f, 0.0f)
                    arcToRelative(30.7f, 19.89f, 0.0f, true, false, -61.41f, 0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDF731B), 0.55f to Color(0xFFDF731B),
                        0.7f to Color(0xFFEC8811), 0.86f to Color(0xFFF4950B), 1.0f to
                        Color(0xFFF79A09), start = Offset(64.55f,60.73f), end =
                        Offset(78.49f,52.55f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
                        = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(125.16f, 47.56f)
                    lineToRelative(-1.42f, 9.11f)
                    reflectiveCurveToRelative(-2.03f, -16.87f, -4.52f, -23.18f)
                    curveToRelative(-3.82f, -9.67f, -5.51f, -9.59f, -5.52f, -9.57f)
                    curveToRelative(2.55f, 6.49f, 2.09f, 9.98f, 2.09f, 9.98f)
                    reflectiveCurveToRelative(-4.53f, -12.34f, -16.5f, -16.26f)
                    curveToRelative(-14.18f, -4.65f, -21.4f, -2.97f, -21.34f, -2.9f)
                    curveToRelative(0.05f, 0.06f, 14.65f, 2.55f, 17.24f, 6.11f)
                    curveToRelative(0.0f, 0.0f, -6.2f, 0.0f, -12.37f, 1.78f)
                    curveToRelative(-0.28f, 0.08f, 22.7f, 2.87f, 27.4f, 25.84f)
                    curveToRelative(0.0f, 0.0f, -2.52f, -5.26f, -5.64f, -6.15f)
                    curveToRelative(2.05f, 6.23f, 1.52f, 18.06f, -0.43f, 23.94f)
                    curveToRelative(-0.25f, 0.76f, -0.51f, -3.27f, -4.35f, -5.0f)
                    curveToRelative(1.23f, 8.82f, -0.07f, 22.82f, -6.2f, 26.67f)
                    curveToRelative(-0.48f, 0.3f, 3.84f, -13.81f, 0.87f, -8.36f)
                    curveToRelative(-17.73f, 27.18f, -38.8f, 11.0f, -47.35f, 5.23f)
                    curveToRelative(6.86f, 1.68f, 14.15f, 0.47f, 18.37f, -2.41f)
                    curveToRelative(4.26f, -2.91f, 6.78f, -5.04f, 9.04f, -4.54f)
                    curveToRelative(2.26f, 0.51f, 3.77f, -1.76f, 2.01f, -3.78f)
                    curveToRelative(-1.76f, -2.02f, -6.03f, -4.79f, -11.8f, -3.28f)
                    curveToRelative(-4.07f, 1.07f, -9.12f, 5.57f, -16.83f, 1.01f)
                    curveToRelative(-6.57f, -3.89f, -6.53f, -7.06f, -6.53f, -9.07f)
                    curveToRelative(0.0f, -2.02f, 1.79f, -5.08f, 5.06f, -4.58f)
                    curveToRelative(2.92f, 0.45f, 1.38f, -1.26f, 4.53f, 0.0f)
                    curveToRelative(0.86f, 0.34f, -0.09f, -4.11f, -1.3f, -6.97f)
                    curveToRelative(2.35f, -4.9f, 9.96f, -6.36f, 10.53f, -6.79f)
                    curveToRelative(1.03f, -0.78f, 0.46f, -1.17f, 0.81f, -2.34f)
                    curveToRelative(0.33f, -1.09f, 0.54f, -4.05f, -7.99f, -3.23f)
                    curveToRelative(-3.92f, 0.38f, -6.42f, -4.71f, -7.24f, -5.94f)
                    curveToRelative(0.26f, -1.57f, 0.69f, -3.01f, 1.27f, -4.32f)
                    curveToRelative(0.58f, -1.2f, 1.22f, -2.3f, 1.86f, -3.13f)
                    lineToRelative(0.53f, -0.7f)
                    curveToRelative(1.27f, -1.48f, 2.83f, -2.75f, 4.7f, -3.8f)
                    curveToRelative(0.98f, -0.55f, -10.93f, -0.04f, -16.28f, 6.95f)
                    curveToRelative(-1.44f, 0.19f, -3.41f, -0.23f, -5.61f, -0.23f)
                    curveToRelative(-2.76f, 0.0f, -4.93f, 0.3f, -6.94f, 0.81f)
                    curveToRelative(-0.32f, 0.08f, -0.84f, 0.04f, -1.48f, -0.11f)
                    curveToRelative(-1.77f, -1.83f, -6.77f, -6.23f, -7.0f, -12.21f)
                    curveToRelative(0.0f, 0.0f, -7.27f, 5.59f, -6.18f, 20.83f)
                    curveToRelative(-0.1f, 8.43f, -2.58f, 6.02f, -3.86f, 10.59f)
                    curveToRelative(-0.6f, 2.17f, 0.89f, 3.8f, 0.89f, 3.86f)
                    curveToRelative(-0.0f, 0.03f, 1.79f, -1.94f, 1.79f, -1.94f)
                    reflectiveCurveToRelative(-11.28f, 19.54f, 3.29f, 44.48f)
                    curveToRelative(12.55f, 21.5f, 33.62f, 31.01f, 55.48f, 29.16f)
                    arcToRelative(67.81f, 67.81f, 0.0f, false, false, 11.52f, -1.75f)
                    curveToRelative(50.94f, -12.31f, 45.4f, -73.81f, 45.4f, -73.81f)
                    close()
                }
                path(fill = linearGradient(0.01f to Color(0xFF941403), 0.9f to Color(0xFFE85C0A),
                        start = Offset(42.0f,41.47f), end = Offset(52.82f,42.39f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(45.62f, 32.15f)
                    reflectiveCurveToRelative(2.2f, 6.01f, 7.14f, 6.0f)
                    curveToRelative(9.42f, -0.04f, 9.61f, 0.09f, 9.67f, 1.24f)
                    curveToRelative(0.19f, 3.49f, -1.53f, 4.63f, -2.19f, 5.13f)
                    curveToRelative(-0.66f, 0.49f, -9.63f, 5.69f, -9.96f, 7.18f)
                    curveToRelative(-0.33f, 1.49f, -10.35f, -14.14f, -10.35f, -14.14f)
                    lineToRelative(5.69f, -5.4f)
                    close()
                }
                path(fill = linearGradient(0.01f to Color(0xFF941403), 0.14f to Color(0xFFA32104),
                        0.5f to Color(0xFFC84107), 0.79f to Color(0xFFDF5509), 0.97f to
                        Color(0xFFE85C0A), start = Offset(24.68f,38.47f), end =
                        Offset(63.72f,43.35f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
                        = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(50.63f, 38.63f)
                    reflectiveCurveToRelative(3.06f, 3.91f, 0.75f, 5.47f)
                    curveToRelative(-2.83f, 1.91f, 4.0f, 2.33f, 6.47f, 0.94f)
                    curveToRelative(2.47f, -1.39f, 3.99f, -3.43f, 4.08f, -3.73f)
                    curveToRelative(0.09f, -0.3f, 0.9f, -3.04f, -4.26f, -2.09f)
                    curveToRelative(-3.26f, 0.6f, -4.46f, 0.74f, -7.03f, -0.59f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFF2C8A9), 1.0f to Color(0xFFFFFFCC),
                        start = Offset(48.87f,48.79f), end = Offset(51.98f,47.42f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(60.24f, 44.51f)
                    curveToRelative(0.5f, -0.38f, 1.61f, -1.13f, 2.03f, -3.0f)
                    curveToRelative(-0.31f, 0.13f, -0.34f, -0.23f, -0.7f, -0.08f)
                    curveToRelative(-6.93f, 7.23f, -7.19f, 2.19f, -10.97f, 3.21f)
                    curveToRelative(-3.45f, 0.94f, -4.22f, 2.24f, -4.37f, 2.34f)
                    lineToRelative(0.16f, 0.22f)
                    curveToRelative(0.99f, 0.5f, 1.94f, 2.11f, 2.66f, 3.55f)
                    curveToRelative(0.7f, 0.83f, 1.17f, 1.24f, 1.24f, 0.94f)
                    curveToRelative(0.33f, -1.49f, 9.3f, -6.68f, 9.96f, -7.18f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFB30000), 1.0f to Color(0xFFDF731B),
                        start = Offset(38.94f,86.91f), end = Offset(91.31f,89.06f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(8.48f, 50.25f)
                    curveTo(7.06f, 53.22f, -2.01f, 68.56f, 12.8f, 94.08f)
                    curveToRelative(14.49f, 24.99f, 39.58f, 33.14f, 65.19f, 27.6f)
                    curveToRelative(7.31f, -1.58f, 15.74f, -7.3f, 21.11f, -11.5f)
                    curveToRelative(-3.45f, -8.71f, -1.41f, -8.38f, -3.26f, -7.23f)
                    curveToRelative(-20.63f, 12.77f, -37.03f, 0.17f, -49.73f, -1.44f)
                    curveTo(-0.58f, 95.59f, 8.64f, 50.16f, 8.64f, 50.16f)
                    lineToRelative(-0.16f, 0.09f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF941403), 1.0f to Color(0xFFDF731B),
                        start = Offset(51.4f,78.78f), end = Offset(78.71f,88.53f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(47.36f, 85.26f)
                    curveToRelative(4.4f, 1.32f, 14.01f, 0.18f, 18.13f, -2.89f)
                    curveToRelative(2.78f, -2.07f, 4.88f, -3.62f, 6.64f, -4.28f)
                    curveToRelative(-3.12f, -2.12f, -3.17f, 0.88f, -9.73f, 2.4f)
                    curveToRelative(-13.67f, 3.17f, -20.31f, -3.68f, -20.31f, -3.68f)
                    curveToRelative(0.97f, 5.42f, 4.35f, 8.06f, 5.88f, 9.0f)
                    curveToRelative(-0.4f, -0.36f, -0.62f, -0.57f, -0.61f, -0.56f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFB30000), 1.0f to Color(0xFFDE5C01),
                        start = Offset(6.76f,90.16f), end = Offset(33.35f,91.46f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(32.53f, 110.03f)
                    reflectiveCurveTo(21.15f, 97.18f, 17.97f, 82.79f)
                    curveToRelative(-4.68f, -4.43f, -8.01f, -8.17f, -10.22f, -10.87f)
                    curveToRelative(1.27f, 10.24f, 6.49f, 26.13f, 24.78f, 38.1f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(16.94f,79.99f), end = Offset(25.98f,126.26f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(23.04f, 98.36f)
                    reflectiveCurveToRelative(-7.86f, -11.18f, -4.91f, -20.68f)
                    curveToRelative(2.65f, -8.54f, -0.56f, -3.46f, -2.43f, -1.63f)
                    curveToRelative(-1.89f, 1.84f, -2.86f, -5.44f, -2.81f, -6.28f)
                    lineToRelative(-0.0f, -0.03f)
                    curveToRelative(-0.12f, -0.03f, -3.74f, 17.46f, 10.15f, 28.62f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(13.4f,65.22f), end = Offset(11.14f,115.32f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(11.4f, 88.61f)
                    reflectiveCurveToRelative(-1.79f, -22.7f, 3.87f, -25.91f)
                    curveToRelative(8.99f, -5.09f, 0.75f, -3.9f, -1.86f, -2.49f)
                    curveToRelative(-2.63f, 1.43f, -2.39f, -7.97f, -2.02f, -8.86f)
                    curveToRelative(0.37f, -0.88f, -9.28f, 8.88f, 0.0f, 37.26f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFA40000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(50.73f, 21.82f)
                    reflectiveCurveToRelative(-7.12f, 7.23f, -7.06f, 7.26f)
                    curveToRelative(0.05f, 0.03f, 0.2f, 9.28f, 0.44f, 11.9f)
                    curveToRelative(0.85f, 1.01f, 3.51f, 7.56f, 1.48f, 6.1f)
                    curveToRelative(-2.08f, -1.48f, -0.58f, -1.52f, -0.4f, -0.76f)
                    verticalLineToRelative(0.04f)
                    curveToRelative(-0.14f, 0.06f, -5.16f, -10.88f, 5.55f, -24.53f)
                    close()
                }
                path(fill = linearGradient(0.01f to Color(0xFF941403), 0.47f to Color(0xFFE85C0A),
                        1.0f to Color(0xFFF9BD5F), start = Offset(18.61f,35.37f), end =
                        Offset(13.17f,21.43f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
                        = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(16.88f, 16.25f)
                    reflectiveCurveToRelative(-7.56f, 5.8f, -6.12f, 21.72f)
                    curveToRelative(5.86f, -5.26f, 14.13f, -9.19f, 14.13f, -9.19f)
                    curveToRelative(-1.39f, -0.88f, -7.76f, -5.97f, -8.02f, -12.53f)
                    close()
                }
                path(fill = linearGradient(0.2f to Color(0xFFDE7210), 0.84f to Color(0xFFF9BD5F),
                        1.0f to Color(0xFFFFFCCF), start = Offset(41.87f,38.57f), end =
                        Offset(54.91f,21.43f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
                        = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(35.52f, 33.66f)
                    lineTo(46.88f, 47.78f)
                    curveToRelative(-3.28f, -13.88f, -0.76f, -22.2f, 7.31f, -26.74f)
                    curveToRelative(1.19f, -0.67f, -16.86f, 0.24f, -18.67f, 12.61f)
                    close()
                }
                path(fill = linearGradient(0.02f to Color(0xFF941403), 0.5f to Color(0xFFE35100),
                        1.0f to Color(0xFFDF731B), start = Offset(34.98f,61.96f), end =
                        Offset(48.19f,88.4f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
                        = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(27.51f, 68.56f)
                    curveToRelative(1.94f, -12.21f, 18.93f, -10.41f, 18.93f, -10.41f)
                    curveToRelative(-0.76f, 0.56f, -3.67f, 0.9f, -4.5f, 3.23f)
                    curveToRelative(-2.75f, 7.69f, -0.13f, 24.48f, 17.01f, 31.53f)
                    curveToRelative(1.81f, 0.75f, -34.3f, -6.3f, -31.44f, -24.34f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFEEA272), 0.19f to Color(0xFFEFA777),
                        0.41f to Color(0xFFF2B585), 0.64f to Color(0xFFF6CD9C), 0.89f to
                        Color(0xFFFCEEBB), 1.0f to Color(0xFFFFFFCC), start = Offset(54.94f,45.75f),
                        end = Offset(58.24f,48.75f)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(62.17f, 41.84f)
                    curveToRelative(-0.08f, -0.01f, -0.16f, -0.01f, -0.19f, 0.04f)
                    curveToRelative(-0.21f, 0.28f, -1.02f, 1.23f, -2.94f, 2.8f)
                    curveToRelative(-3.57f, 2.9f, -5.07f, 2.17f, -7.73f, 2.76f)
                    curveToRelative(-1.21f, 0.27f, -2.36f, 1.08f, -3.13f, 1.73f)
                    curveToRelative(0.31f, 0.51f, 0.61f, 1.05f, 0.87f, 1.58f)
                    curveToRelative(0.7f, 0.83f, 1.17f, 1.24f, 1.24f, 0.94f)
                    curveToRelative(0.33f, -1.49f, 9.3f, -6.69f, 9.96f, -7.18f)
                    curveToRelative(0.47f, -0.35f, 1.46f, -1.05f, 1.94f, -2.67f)
                    close()
                }
                path(fill = linearGradient(0.2f to Color(0xFFDF731B), 0.84f to Color(0xFFF9BD5F),
                        1.0f to Color(0xFFFFFCCF), start = Offset(35.69f,52.82f), end =
                        Offset(50.85f,68.29f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
                        = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(51.22f, 60.29f)
                    curveToRelative(0.1f, -2.58f, -0.08f, -8.85f, -2.76f, -11.56f)
                    curveToRelative(-2.05f, -2.08f, -2.53f, -4.46f, -2.81f, -7.17f)
                    curveTo(23.38f, 49.88f, 20.2f, 60.75f, 22.42f, 60.4f)
                    curveToRelative(17.82f, -2.83f, 22.82f, -3.17f, 28.8f, -0.11f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(13.9f,45.47f), end = Offset(-0.54f,100.44f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(3.73f, 75.54f)
                    reflectiveCurveToRelative(1.55f, -20.11f, 11.61f, -27.47f)
                    curveToRelative(7.9f, -5.78f, 1.76f, -3.68f, -1.29f, -3.44f)
                    curveToRelative(-3.22f, 0.25f, -4.93f, 2.21f, -4.31f, 1.49f)
                    lineToRelative(0.03f, -0.05f)
                    curveToRelative(-0.11f, -0.12f, -7.55f, 6.13f, -6.05f, 29.48f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF2C06E),
                        start = Offset(15.38f,40.67f), end = Offset(-0.67f,78.91f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(2.67f, 60.09f)
                    reflectiveCurveToRelative(5.39f, -17.13f, 16.3f, -16.98f)
                    curveToRelative(7.23f, 0.1f, 1.5f, -6.11f, -0.69f, -7.05f)
                    curveToRelative(-2.28f, -0.98f, -2.83f, -0.94f, -3.36f, -0.47f)
                    curveToRelative(-0.8f, 0.71f, -7.97f, 0.44f, -12.24f, 24.5f)
                    close()
                }
                path(fill = linearGradient(0.01f to Color(0xFFFFFAEE), 0.28f to Color(0xFFF5F89B),
                        0.31f to Color(0xFFF3ED91), 0.47f to Color(0xFFECC267), 0.62f to
                        Color(0xFFE6A046), 0.76f to Color(0xFFE2872E), 0.89f to Color(0xFFE07820),
                        1.0f to Color(0xFFDF731B), start = Offset(80.94f,72.23f), end =
                        Offset(60.52f,76.12f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
                        = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(76.21f, 76.85f)
                    curveToRelative(0.82f, -0.8f, 0.25f, -3.89f, -4.9f, -5.76f)
                    curveToRelative(-4.68f, -1.7f, -11.97f, 2.62f, -14.14f, 3.47f)
                    curveToRelative(0.0f, 0.0f, 8.27f, -1.55f, 11.36f, -1.03f)
                    curveToRelative(4.2f, 0.7f, 5.68f, 5.28f, 7.68f, 3.32f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF2C06E),
                        start = Offset(15.39f,44.54f), end = Offset(9.4f,91.66f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(10.63f, 71.21f)
                    reflectiveCurveToRelative(-0.89f, -16.84f, 6.65f, -24.03f)
                    curveToRelative(5.92f, -5.65f, 1.07f, -3.24f, -1.44f, -2.71f)
                    curveToRelative(-2.64f, 0.56f, -3.85f, 2.37f, -3.41f, 1.7f)
                    lineToRelative(0.02f, -0.05f)
                    curveToRelative(-0.1f, -0.09f, -5.59f, 5.89f, -1.82f, 25.08f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF2C06E),
                        start = Offset(16.36f,40.71f), end = Offset(-0.84f,84.98f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(4.82f, 65.86f)
                    reflectiveCurveToRelative(3.19f, -16.56f, 12.24f, -21.71f)
                    curveToRelative(7.11f, -4.05f, 1.82f, -2.89f, -0.74f, -2.98f)
                    curveToRelative(-2.7f, -0.09f, -4.31f, 1.37f, -3.72f, 0.83f)
                    lineToRelative(0.03f, -0.04f)
                    curveToRelative(-0.07f, -0.12f, -6.85f, 4.37f, -7.81f, 23.9f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF2C072),
                        start = Offset(15.46f,62.29f), end = Offset(16.37f,86.12f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(15.57f, 72.65f)
                    reflectiveCurveToRelative(-1.74f, -10.03f, 2.01f, -14.97f)
                    curveToRelative(3.0f, -3.94f, 0.37f, -2.01f, -1.03f, -1.45f)
                    curveToRelative(-1.45f, 0.59f, -2.0f, 1.76f, -1.8f, 1.33f)
                    curveToRelative(0.19f, -0.42f, -6.46f, 4.74f, 0.82f, 15.09f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF2C072),
                        start = Offset(17.45f,52.82f), end = Offset(18.36f,76.65f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(17.56f, 63.19f)
                    reflectiveCurveToRelative(-1.74f, -10.03f, 2.01f, -14.98f)
                    curveToRelative(3.0f, -3.94f, 0.37f, -2.01f, -1.03f, -1.45f)
                    curveToRelative(-1.45f, 0.59f, -2.0f, 1.76f, -1.8f, 1.34f)
                    curveToRelative(0.19f, -0.42f, -6.46f, 4.74f, 0.82f, 15.09f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFEED8A5),
                        start = Offset(12.6f,42.36f), end = Offset(6.81f,53.17f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(7.03f, 49.47f)
                    reflectiveCurveToRelative(4.07f, -8.34f, 9.48f, -9.98f)
                    curveToRelative(4.32f, -1.31f, 1.34f, -1.29f, 0.01f, -1.62f)
                    curveToRelative(-1.39f, -0.34f, -2.42f, 0.23f, -2.05f, 0.02f)
                    curveToRelative(0.37f, -0.21f, -7.3f, 0.05f, -7.45f, 11.58f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFEED8A5),
                        start = Offset(12.01f,48.97f), end = Offset(6.23f,59.77f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(6.45f, 56.08f)
                    reflectiveCurveToRelative(4.07f, -8.34f, 9.48f, -9.98f)
                    curveToRelative(4.32f, -1.31f, 1.34f, -1.29f, 0.01f, -1.62f)
                    curveToRelative(-1.39f, -0.34f, -2.42f, 0.23f, -2.05f, 0.02f)
                    curveToRelative(0.37f, -0.21f, -7.3f, 0.05f, -7.45f, 11.58f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF2C072),
                        start = Offset(18.57f,44.38f), end = Offset(12.98f,58.27f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(9.4f, 54.26f)
                    reflectiveCurveToRelative(7.18f, -14.72f, 16.73f, -17.61f)
                    curveToRelative(7.62f, -2.31f, 2.37f, -2.28f, 0.02f, -2.85f)
                    curveToRelative(-2.45f, -0.59f, -4.27f, 0.41f, -3.61f, 0.04f)
                    curveToRelative(0.65f, -0.36f, -12.88f, 0.09f, -13.14f, 20.42f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF2C072),
                        start = Offset(20.7f,37.62f), end = Offset(7.47f,57.46f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(14.31f, 46.33f)
                    reflectiveCurveToRelative(4.47f, -9.15f, 10.4f, -10.95f)
                    curveToRelative(4.74f, -1.44f, 1.48f, -1.42f, 0.01f, -1.77f)
                    curveToRelative(-1.53f, -0.37f, -2.66f, 0.26f, -2.24f, 0.02f)
                    curveToRelative(0.4f, -0.23f, -8.01f, 0.05f, -8.17f, 12.7f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF2C072),
                        start = Offset(21.59f,41.63f), end = Offset(9.53f,59.71f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(15.77f, 49.56f)
                    reflectiveCurveToRelative(4.07f, -8.34f, 9.48f, -9.98f)
                    curveToRelative(4.32f, -1.31f, 1.35f, -1.29f, 0.01f, -1.62f)
                    curveToRelative(-1.39f, -0.34f, -2.42f, 0.23f, -2.05f, 0.02f)
                    curveToRelative(0.37f, -0.21f, -7.3f, 0.05f, -7.45f, 11.58f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF8B8B89), 1.0f to Color(0xFF120500),
                        start = Offset(60.38f,38.81f), end = Offset(61.33f,40.51f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(62.43f, 39.38f)
                    curveToRelative(-0.05f, -0.87f, -0.18f, -1.15f, -4.34f, -1.23f)
                    curveToRelative(0.48f, 0.22f, 1.3f, 0.65f, 2.21f, 1.39f)
                    curveToRelative(1.2f, 0.98f, 1.39f, 2.07f, 1.51f, 3.2f)
                    curveToRelative(0.4f, -0.77f, 0.7f, -1.83f, 0.62f, -3.37f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(22.8f,33.03f), end = Offset(22.8f,27.8f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(37.98f, 27.76f)
                    lineToRelative(-3.61f, 5.81f)
                    reflectiveCurveToRelative(-14.44f, -2.27f, -26.68f, 9.58f)
                    curveToRelative(-1.01f, 0.98f, 8.01f, -20.94f, 30.29f, -15.39f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(23.12f,38.9f), end = Offset(34.55f,26.57f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(25.02f, 38.16f)
                    reflectiveCurveToRelative(3.85f, -7.14f, 8.84f, -9.3f)
                    curveToRelative(-2.58f, 0.08f, -8.37f, 2.1f, -8.84f, 9.3f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFEED8A5),
                        start = Offset(15.78f,38.02f), end = Offset(9.99f,48.83f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(10.21f, 45.13f)
                    reflectiveCurveToRelative(4.07f, -8.34f, 9.48f, -9.98f)
                    curveToRelative(4.32f, -1.31f, 1.34f, -1.29f, 0.01f, -1.62f)
                    curveToRelative(-1.39f, -0.34f, -2.42f, 0.23f, -2.05f, 0.02f)
                    curveToRelative(0.37f, -0.2f, -7.3f, 0.05f, -7.45f, 11.58f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(16.47f,39.39f), end = Offset(28.4f,28.08f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(18.74f, 39.26f)
                    reflectiveCurveToRelative(4.2f, -6.72f, 9.2f, -8.51f)
                    curveToRelative(-2.52f, -0.08f, -8.29f, 1.52f, -9.2f, 8.51f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(13.57f,26.27f), end = Offset(26.2f,29.18f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(25.94f, 27.77f)
                    reflectiveCurveToRelative(-3.17f, 1.38f, -8.75f, -0.94f)
                    lineToRelative(4.98f, 2.5f)
                    lineToRelative(3.77f, -1.57f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(7.29f,27.67f), end = Offset(25.41f,30.15f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(24.41f, 28.66f)
                    reflectiveCurveToRelative(-4.22f, 1.63f, -12.35f, -0.8f)
                    lineToRelative(6.95f, 2.77f)
                    curveToRelative(0.86f, -0.8f, 5.4f, -1.97f, 5.4f, -1.97f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(16.12f,25.85f), end = Offset(27.73f,28.52f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(27.49f, 27.32f)
                    reflectiveCurveToRelative(-2.8f, 0.85f, -7.98f, -1.15f)
                    lineToRelative(4.98f, 2.5f)
                    curveToRelative(0.53f, -0.46f, 3.0f, -1.35f, 3.0f, -1.35f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(15.47f,31.48f), end = Offset(4.83f,30.39f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(18.75f, 30.54f)
                    reflectiveCurveToRelative(-2.08f, 1.73f, -7.41f, 1.8f)
                    lineToRelative(4.61f, 0.15f)
                    lineToRelative(2.8f, -1.95f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(10.99f,40.12f), end = Offset(27.42f,24.54f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(13.69f, 39.38f)
                    reflectiveCurveTo(20.81f, 30.1f, 26.68f, 28.0f)
                    curveToRelative(-2.95f, -0.1f, -11.93f, 3.17f, -12.99f, 11.38f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDE5C01), 0.74f to Color(0xFFFEFD00),
                        0.78f to Color(0xFFFEFE26), 0.84f to Color(0xFFFFFE54), 0.89f to
                        Color(0xFFFFFF76), 0.93f to Color(0xFFFFFF8B), 0.96f to Color(0xFFFFFF92),
                        start = Offset(88.31f,121.55f), end = Offset(117.13f,77.1f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(124.04f, 55.21f)
                    reflectiveCurveToRelative(0.77f, 17.22f, -23.15f, 41.14f)
                    curveToRelative(-2.66f, 2.66f, -17.09f, 16.18f, -16.58f, 20.24f)
                    curveToRelative(0.18f, 1.43f, 37.87f, -5.78f, 39.74f, -61.38f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFF79A09), 0.74f to Color(0xFFFEFD00),
                        0.78f to Color(0xFFFEFE26), 0.84f to Color(0xFFFFFE54), 0.89f to
                        Color(0xFFFFFF76), 0.93f to Color(0xFFFFFF8B), 0.96f to Color(0xFFFFFF92),
                        start = Offset(105.07f,27.3f), end = Offset(86.2f,19.01f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(77.66f, 14.7f)
                    curveToRelative(28.81f, 2.21f, 34.39f, 22.93f, 34.39f, 21.66f)
                    curveToRelative(0.07f, -20.14f, -27.33f, -21.67f, -34.39f, -21.66f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDE5C01), 0.74f to Color(0xFFFEFD00),
                        0.78f to Color(0xFFFEFE26), 0.84f to Color(0xFFFFFE54), 0.89f to
                        Color(0xFFFFFF76), 0.93f to Color(0xFFFFFF8B), 0.96f to Color(0xFFFFFF92),
                        start = Offset(117.75f,46.21f), end = Offset(91.33f,21.69f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(86.44f, 22.58f)
                    reflectiveCurveToRelative(19.97f, 4.08f, 25.61f, 25.25f)
                    curveToRelative(0.75f, 2.8f, -2.41f, -17.2f, -1.43f, -15.3f)
                    curveToRelative(0.97f, 1.91f, -8.04f, -9.32f, -24.17f, -9.95f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFF79A09), 0.74f to Color(0xFFFEFD00),
                        0.78f to Color(0xFFFEFE26), 0.84f to Color(0xFFFFFE54), 0.89f to
                        Color(0xFFFFFF76), 0.93f to Color(0xFFFFFF8B), 0.96f to Color(0xFFFFFF92),
                        start = Offset(109.9f,44.79f), end = Offset(98.51f,33.66f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(94.42f, 22.06f)
                    reflectiveCurveToRelative(18.04f, 3.76f, 18.22f, 32.38f)
                    curveToRelative(0.13f, 20.26f, 3.13f, 7.61f, 6.11f, 3.05f)
                    curveToRelative(2.57f, -3.93f, 0.81f, -8.73f, 0.75f, -8.71f)
                    curveToRelative(-0.01f, 0.0f, -1.3f, -3.73f, -0.43f, -2.15f)
                    curveToRelative(0.04f, 0.07f, -1.21f, -1.03f, -1.2f, -1.03f)
                    curveToRelative(0.2f, -0.03f, -0.69f, -20.57f, -23.44f, -23.54f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFF79A09), 0.74f to Color(0xFFFEFD00),
                        0.78f to Color(0xFFFEFE26), 0.84f to Color(0xFFFFFE54), 0.89f to
                        Color(0xFFFFFF76), 0.93f to Color(0xFFFFFF8B), 0.96f to Color(0xFFFFFF92),
                        start = Offset(113.32f,60.26f), end = Offset(119.54f,38.85f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(114.73f, 25.94f)
                    reflectiveCurveToRelative(6.48f, 16.88f, -0.39f, 25.27f)
                    curveToRelative(-2.24f, 2.74f, -2.49f, 16.77f, 0.25f, 15.48f)
                    curveToRelative(2.74f, -1.29f, 2.15f, 7.45f, 1.79f, 8.45f)
                    lineToRelative(-0.01f, 0.03f)
                    curveToRelative(0.18f, 0.11f, 13.54f, -21.57f, -1.64f, -49.23f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFF79A09), 0.74f to Color(0xFFFEFD00),
                        0.78f to Color(0xFFFEFE26), 0.84f to Color(0xFFFFFE54), 0.89f to
                        Color(0xFFFFFF76), 0.93f to Color(0xFFFFFF8B), 0.96f to Color(0xFFFFFF92),
                        start = Offset(108.87f,65.27f), end = Offset(107.97f,49.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(105.73f, 43.71f)
                    reflectiveCurveToRelative(4.08f, 11.94f, -0.19f, 20.48f)
                    lineToRelative(3.23f, 7.22f)
                    curveToRelative(2.37f, -5.82f, 5.39f, -18.13f, -3.04f, -27.69f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFF79A09), 0.74f to Color(0xFFFEFD00),
                        0.78f to Color(0xFFFEFE26), 0.84f to Color(0xFFFFFE54), 0.89f to
                        Color(0xFFFFFF76), 0.93f to Color(0xFFFFFF8B), 0.96f to Color(0xFFFFFF92),
                        start = Offset(105.26f,79.27f), end = Offset(114.88f,56.43f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(112.9f, 42.29f)
                    reflectiveCurveToRelative(2.82f, 18.95f, -7.36f, 36.06f)
                    curveToRelative(0.16f, 3.96f, -0.54f, 7.54f, -1.49f, 10.49f)
                    curveToRelative(0.44f, 0.58f, 1.04f, 0.98f, 1.82f, 1.05f)
                    curveToRelative(-0.34f, 0.32f, -0.69f, 0.62f, -1.02f, 0.9f)
                    curveToRelative(-0.61f, 0.27f, -1.24f, 0.56f, -1.84f, 0.85f)
                    lineToRelative(-0.39f, 0.88f)
                    arcToRelative(32.26f, 32.26f, 0.0f, false, false, 2.23f, -1.72f)
                    curveToRelative(2.08f, -0.92f, 3.95f, -1.63f, 3.95f, -1.64f)
                    lineToRelative(-1.3f, 0.48f)
                    curveToRelative(-0.62f, 0.22f, -1.16f, 0.3f, -1.63f, 0.26f)
                    curveToRelative(7.86f, -7.16f, 18.63f, -23.18f, 7.03f, -47.61f)
                    close()
                    moveTo(101.04f, 92.68f)
                    curveToRelative(-0.9f, 0.53f, -1.55f, 1.02f, -1.69f, 1.4f)
                    curveToRelative(-0.1f, 0.28f, 0.51f, 0.12f, 1.57f, -0.48f)
                    curveToRelative(0.05f, -0.32f, 0.1f, -0.63f, 0.12f, -0.93f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDE5C01), 0.74f to Color(0xFFFEFD00),
                        0.78f to Color(0xFFFEFE26), 0.84f to Color(0xFFFFFE54), 0.89f to
                        Color(0xFFFFFF76), 0.93f to Color(0xFFFFFF8B), 0.96f to Color(0xFFFFFF92),
                        start = Offset(93.73f,98.2f), end = Offset(93.5f,73.67f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(100.35f, 62.48f)
                    reflectiveCurveToRelative(8.02f, 22.84f, -17.62f, 44.26f)
                    curveToRelative(-1.51f, 1.26f, 10.41f, 0.72f, 11.45f, 0.25f)
                    curveToRelative(3.07f, -1.4f, 6.71f, -10.71f, 6.28f, -9.6f)
                    curveToRelative(-0.43f, 1.12f, 11.91f, -16.47f, -0.11f, -34.91f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFB9120D), 0.08f to Color(0xFFBB180D),
                        0.18f to Color(0xFFC0290C), 0.3f to Color(0xFFC8450A), 0.43f to
                        Color(0xFFD36C08), 0.57f to Color(0xFFE29E05), 0.71f to Color(0xFFF4DA02),
                        0.79f to Color(0xFFFEFD00), 0.81f to Color(0xFFFEFD07), 0.85f to
                        Color(0xFFFEFD1B), 0.88f to Color(0xFFFEFE3C), 0.93f to Color(0xFFFFFE69),
                        0.97f to Color(0xFFFFFFA3), 1.0f to Color(0xFFFFFFC7), start =
                        Offset(58.47f,118.06f), end = Offset(105.79f,89.78f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(111.57f, 76.97f)
                    reflectiveCurveToRelative(-4.84f, 29.63f, -38.31f, 32.01f)
                    curveToRelative(-13.1f, 0.94f, -31.92f, -2.13f, -30.25f, 2.87f)
                    curveToRelative(0.52f, 1.55f, 2.98f, 8.01f, 8.6f, 9.51f)
                    curveToRelative(15.21f, 4.06f, 55.69f, 2.73f, 59.96f, -44.39f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(55.34f,96.73f), end = Offset(102.92f,108.06f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(83.66f, 99.39f)
                    reflectiveCurveToRelative(-20.48f, 4.68f, -33.74f, -6.61f)
                    curveToRelative(-12.14f, -10.34f, -6.12f, -1.64f, -4.47f, 2.65f)
                    curveToRelative(1.69f, 4.4f, -7.82f, 1.04f, -9.25f, 0.33f)
                    curveToRelative(-1.42f, -0.7f, 22.53f, 14.33f, 47.47f, 3.63f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(39.94f,92.61f), end = Offset(93.1f,118.28f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(70.46f, 110.55f)
                    reflectiveCurveTo(46.03f, 105.75f, 38.3f, 89.2f)
                    curveToRelative(-6.61f, -14.14f, -4.86f, -3.76f, -5.16f, 0.96f)
                    curveToRelative(-0.31f, 4.86f, -7.16f, -1.78f, -8.08f, -2.93f)
                    lineToRelative(-0.05f, -0.04f)
                    curveToRelative(-0.14f, 0.09f, 12.6f, 20.05f, 45.44f, 23.37f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(22.7f,87.6f), end = Offset(58.25f,133.19f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(43.78f, 108.41f)
                    reflectiveCurveToRelative(-11.67f, -9.04f, -16.93f, -21.43f)
                    curveToRelative(-4.42f, -1.54f, -10.3f, -5.05f, -10.41f, -5.65f)
                    curveToRelative(1.87f, 9.63f, 11.7f, 20.87f, 27.34f, 27.08f)
                    close()
                }
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
