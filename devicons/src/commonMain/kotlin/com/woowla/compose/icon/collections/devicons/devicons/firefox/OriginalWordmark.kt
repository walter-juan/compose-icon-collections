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

public val FirefoxGroup.OriginalWordmark: ImageVector
    get() {
        if (_originalWordmark != null) {
            return _originalWordmark!!
        }
        _originalWordmark = Builder(name = "OriginalWordmark", defaultWidth = 128.0.dp,
                defaultHeight = 128.0.dp, viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF110070)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.94f, 50.32f)
                arcToRelative(48.92f, 48.96f, 0.0f, true, false, 97.85f, 0.0f)
                arcToRelative(48.92f, 48.96f, 0.0f, true, false, -97.85f, 0.0f)
                close()
            }
            path(fill = radialGradient(0.0f to Color(0xFF67C5D5), 0.16f to Color(0xFF66C2D3), 0.28f
                    to Color(0xFF62B9CE), 0.39f to Color(0xFF5CA8C6), 0.48f to Color(0xFF5392BA),
                    0.58f to Color(0xFF4874AA), 0.67f to Color(0xFF3A5097), 0.75f to
                    Color(0xFF2A2781), 0.81f to Color(0xFF1B006D), 1.0f to Color(0xFF596AAD), center
                    = Offset(64.53f,7.32f), radius = 85.93f), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.86f, 50.32f)
                arcToRelative(48.0f, 48.03f, 0.0f, true, false, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.03f, 0.0f, true, false, -96.0f, 0.0f)
                close()
            }
            path(fill = radialGradient(0.0f to Color(0xFF0F80BC), 0.34f to Color(0xFF0A5F9E), 1.0f
                    to Color(0xFF00145A), center = Offset(64.52f,13.05f), radius = 43.07f), stroke =
                    null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(56.98f, 75.11f)
                curveToRelative(-0.06f, -0.26f, -0.71f, -1.02f, -1.2f, -1.19f)
                curveToRelative(-0.49f, -0.17f, -0.98f, 0.73f, -1.3f, -0.76f)
                curveToRelative(-1.04f, 0.6f, -1.49f, -0.17f, -1.49f, -0.17f)
                reflectiveCurveToRelative(-1.13f, 0.07f, -1.34f, 1.44f)
                curveToRelative(-0.54f, 0.63f, -1.91f, 2.94f, -1.18f, 0.54f)
                curveToRelative(0.73f, -2.41f, -0.77f, -0.19f, -0.92f, 1.02f)
                curveToRelative(-0.26f, 0.54f, -0.7f, 0.59f, -0.43f, -1.83f)
                curveToRelative(-0.97f, -0.33f, -1.46f, -2.58f, -0.93f, -2.62f)
                curveToRelative(-0.62f, -0.86f, -0.13f, -2.17f, 0.38f, -2.1f)
                curveToRelative(0.51f, 0.07f, 1.39f, -1.12f, 1.37f, -1.4f)
                curveToRelative(-0.03f, -0.27f, 0.4f, -0.08f, 0.37f, -1.93f)
                curveToRelative(-0.03f, -1.85f, 0.7f, -2.31f, 0.76f, -0.76f)
                curveToRelative(0.06f, 1.54f, 0.98f, -0.5f, 0.89f, -1.29f)
                curveToRelative(-0.1f, -0.78f, 0.09f, -2.55f, 0.65f, -1.5f)
                curveToRelative(-0.65f, -2.59f, -0.14f, -2.69f, 0.25f, -0.97f)
                curveToRelative(0.98f, 0.08f, 1.02f, 0.6f, 1.02f, 0.6f)
                curveToRelative(1.09f, -0.27f, 1.61f, 0.55f, 1.7f, 1.01f)
                curveToRelative(1.01f, -1.19f, 2.03f, 0.09f, 2.03f, 0.09f)
                reflectiveCurveToRelative(0.7f, -0.23f, 0.37f, 0.99f)
                curveToRelative(-0.34f, 1.22f, 1.46f, 0.56f, 1.03f, -0.32f)
                curveToRelative(0.88f, -0.45f, 2.2f, 0.91f, 2.61f, 1.84f)
                curveToRelative(0.41f, 0.93f, -0.71f, 2.24f, 0.17f, 2.56f)
                curveToRelative(0.88f, 0.32f, 0.5f, 1.85f, 0.5f, 1.85f)
                reflectiveCurveToRelative(1.84f, 1.02f, 0.56f, 1.9f)
                lineToRelative(-0.44f, 1.04f)
                reflectiveCurveToRelative(0.83f, 0.93f, 1.12f, 0.38f)
                curveToRelative(0.28f, -0.55f, 0.38f, 0.56f, 0.38f, 0.56f)
                curveToRelative(-0.11f, -0.2f, 0.2f, 1.15f, 1.35f, 1.43f)
                curveToRelative(1.15f, 0.28f, 1.88f, 2.1f, 0.6f, 2.13f)
                curveToRelative(-1.27f, 0.02f, -1.37f, -0.01f, -1.72f, 0.73f)
                curveToRelative(-0.34f, 0.74f, -1.97f, 0.77f, -2.81f, -0.19f)
                curveToRelative(-0.9f, 0.3f, -2.49f, -0.09f, -2.02f, -0.81f)
                curveToRelative(-0.77f, 0.45f, -1.5f, -0.76f, -0.9f, -1.3f)
                curveToRelative(0.61f, -0.54f, -0.34f, -1.24f, -0.66f, -0.46f)
                curveToRelative(-0.31f, 0.77f, -1.98f, 1.15f, -1.87f, -0.16f)
                curveToRelative(0.04f, -0.39f, 0.92f, -0.62f, 0.94f, -0.29f)
                curveToRelative(0.16f, 0.38f, 0.23f, -0.03f, 0.16f, -0.08f)
                close()
            }
            path(fill = radialGradient(0.0f to Color(0xFF0F80BC), 0.34f to Color(0xFF0A5F9E), 1.0f
                    to Color(0xFF00145A), center = Offset(64.52f,13.06f), radius = 43.06f), stroke =
                    null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(96.67f, 37.57f)
                curveToRelative(0.25f, 0.25f, 0.76f, 0.2f, 1.03f, 0.12f)
                curveToRelative(0.28f, -0.08f, 0.24f, -0.28f, 0.48f, -0.36f)
                curveToRelative(0.24f, -0.08f, 1.15f, 0.36f, 0.91f, 1.31f)
                curveToRelative(-0.56f, 0.08f, -0.76f, 0.75f, -0.76f, 0.75f)
                reflectiveCurveToRelative(-0.56f, 0.24f, -0.84f, 0.12f)
                curveToRelative(-0.28f, -0.12f, -0.28f, -0.08f, -0.68f, -0.04f)
                curveToRelative(-0.4f, 0.04f, -1.36f, -0.51f, -0.32f, -0.51f)
                reflectiveCurveToRelative(-0.12f, -0.48f, -0.56f, -0.48f)
                curveToRelative(-0.44f, 0.0f, -0.08f, -0.44f, 0.44f, -0.32f)
                curveToRelative(-0.36f, -0.6f, -0.16f, -1.03f, 0.28f, -0.6f)
                close()
            }
            path(fill = radialGradient(0.0f to Color(0xFF0F80BC), 0.34f to Color(0xFF0A5F9E), 1.0f
                    to Color(0xFF00145A), center = Offset(64.52f,13.04f), radius = 43.08f), stroke =
                    null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(93.08f, 39.72f)
                curveToRelative(-0.28f, 0.28f, 0.04f, 1.11f, 0.4f, 1.07f)
                curveToRelative(0.36f, -0.04f, 0.92f, -0.2f, 0.92f, -0.2f)
                reflectiveCurveToRelative(0.28f, 0.55f, 0.0f, 0.71f)
                curveToRelative(-0.28f, 0.16f, -1.09f, 0.09f, -0.04f, 0.47f)
                curveToRelative(1.08f, 0.4f, 1.35f, 0.28f, 1.43f, 0.08f)
                curveToRelative(0.08f, -0.2f, 0.44f, -0.87f, 0.64f, -0.83f)
                curveToRelative(0.16f, -0.35f, -0.56f, -0.67f, -0.16f, -0.91f)
                curveToRelative(0.4f, -0.24f, 0.08f, -1.11f, 0.08f, -1.11f)
                reflectiveCurveToRelative(-0.56f, 0.04f, -0.8f, 0.44f)
                curveToRelative(-0.24f, 0.4f, -0.56f, -0.04f, -0.8f, -0.04f)
                curveToRelative(-0.04f, 0.24f, -0.2f, 0.43f, -0.2f, 0.43f)
                lineToRelative(-0.16f, -0.36f)
                curveToRelative(-0.0f, -0.0f, -1.12f, -0.04f, -1.32f, 0.24f)
                close()
            }
            path(fill = radialGradient(0.0f to Color(0xFF0F80BC), 0.26f to Color(0xFF0B629B), 0.84f
                    to Color(0xFF031747), 1.0f to Color(0xFF00022F), center = Offset(65.22f,17.13f),
                    radius = 47.31f), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(85.64f, 40.38f)
                curveToRelative(-0.04f, -0.1f, 0.32f, -0.51f, 0.22f, 0.02f)
                curveToRelative(-0.22f, 0.38f, 0.87f, 0.72f, 1.18f, 0.3f)
                curveToRelative(1.02f, -1.4f, -0.96f, -2.08f, -1.83f, -1.43f)
                curveToRelative(-0.87f, 0.66f, -1.35f, -0.75f, -0.35f, -0.95f)
                curveToRelative(1.0f, -0.2f, 1.08f, -2.0f, -0.02f, -2.01f)
                curveToRelative(0.97f, -0.48f, -0.37f, -1.91f, -1.48f, -2.16f)
                curveToRelative(-0.18f, -1.54f, -1.81f, -2.52f, -2.66f, -1.96f)
                curveToRelative(-0.86f, 0.56f, -0.94f, 0.46f, -2.2f, -0.31f)
                curveToRelative(-1.26f, -0.76f, -1.87f, 1.59f, -0.94f, 2.62f)
                curveToRelative(0.93f, 1.03f, 0.26f, 2.7f, 0.29f, 2.42f)
                curveToRelative(0.0f, 0.0f, -0.35f, 0.63f, -0.33f, 0.87f)
                curveToRelative(-1.07f, 0.36f, -1.38f, -1.14f, -2.04f, -1.47f)
                curveToRelative(-0.48f, 0.63f, -1.26f, 0.96f, -1.26f, 0.96f)
                lineToRelative(0.06f, -1.28f)
                reflectiveCurveToRelative(-3.31f, -1.8f, -4.33f, -1.3f)
                curveToRelative(-1.25f, 0.39f, -1.55f, 3.29f, -0.41f, 3.72f)
                curveToRelative(1.14f, 0.43f, -1.43f, 1.5f, 1.15f, 4.22f)
                curveToRelative(2.65f, 2.79f, 3.67f, 2.87f, 4.21f, 2.42f)
                arcToRelative(8.14f, 8.14f, 0.0f, false, true, 0.65f, -0.48f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 0.13f, 0.31f)
                curveToRelative(0.66f, 1.0f, -1.54f, 1.78f, -1.85f, 3.21f)
                curveToRelative(-0.31f, 1.44f, -0.02f, 4.13f, 1.28f, 4.22f)
                curveToRelative(0.25f, -1.43f, 2.7f, -0.93f, 1.36f, 0.37f)
                curveToRelative(-1.36f, 1.32f, -0.4f, 1.55f, -0.4f, 1.55f)
                reflectiveCurveToRelative(0.06f, 2.48f, 2.14f, 1.68f)
                curveToRelative(-0.06f, 0.14f, -0.11f, 0.32f, -0.14f, 0.52f)
                curveToRelative(-0.58f, -0.12f, -2.0f, -0.29f, -2.34f, 0.69f)
                curveToRelative(-0.44f, 1.25f, -2.29f, -0.42f, -3.58f, 0.14f)
                curveToRelative(-1.29f, 0.56f, -3.17f, 2.38f, -2.54f, 3.66f)
                curveToRelative(1.22f, -0.58f, 2.15f, 2.02f, 0.45f, 1.49f)
                curveToRelative(-1.71f, -0.54f, -1.38f, 0.48f, -1.38f, 0.48f)
                reflectiveCurveToRelative(-1.78f, 1.4f, -0.11f, 2.89f)
                curveToRelative(-0.64f, 0.1f, -1.77f, 0.81f, -1.39f, 2.37f)
                curveToRelative(0.0f, 0.0f, -0.73f, 0.03f, -0.83f, 1.42f)
                curveToRelative(-2.38f, 0.48f, -2.23f, 1.22f, 1.35f, 0.41f)
                curveToRelative(-1.45f, 0.75f, 1.01f, 1.1f, 2.1f, 1.0f)
                curveToRelative(1.09f, -0.1f, 3.95f, 1.31f, 1.8f, 1.33f)
                curveToRelative(-2.15f, 0.01f, -1.51f, 1.07f, 1.07f, 1.12f)
                curveToRelative(2.58f, 0.05f, 2.31f, 0.65f, 2.69f, 0.63f)
                curveToRelative(0.38f, -0.03f, 2.05f, 1.29f, 1.96f, 2.01f)
                curveToRelative(-0.09f, 0.73f, 1.74f, 1.49f, 2.94f, 0.65f)
                curveToRelative(0.06f, 0.76f, 3.2f, 0.17f, 3.67f, -1.2f)
                curveToRelative(3.4f, 0.52f, 3.33f, -0.12f, 2.57f, -0.52f)
                curveToRelative(-1.71f, -0.26f, -4.83f, -2.53f, -1.44f, -1.36f)
                curveToRelative(3.38f, 1.16f, 0.12f, -0.92f, -0.77f, -1.71f)
                curveToRelative(-1.94f, -0.38f, -2.04f, -1.99f, -2.04f, -1.99f)
                reflectiveCurveToRelative(1.07f, -0.61f, 0.23f, -2.13f)
                curveToRelative(2.09f, -0.39f, 0.83f, -1.13f, 1.06f, -1.83f)
                curveToRelative(0.23f, -0.7f, 1.3f, -1.6f, 1.66f, -1.67f)
                curveToRelative(0.07f, -0.09f, 0.64f, 0.02f, 0.11f, 0.23f)
                curveToRelative(-0.46f, 0.0f, -0.13f, 1.29f, 0.41f, 1.36f)
                curveToRelative(1.85f, 0.22f, 1.31f, -2.19f, 0.22f, -2.67f)
                curveToRelative(-1.09f, -0.49f, -0.11f, -1.82f, 0.65f, -0.92f)
                curveToRelative(0.76f, 0.89f, 2.47f, -0.11f, 1.83f, -1.24f)
                curveToRelative(1.02f, 0.7f, 1.56f, -1.58f, 1.13f, -2.88f)
                curveToRelative(1.36f, -1.18f, 1.31f, -3.53f, 0.26f, -4.05f)
                curveToRelative(-0.52f, -0.26f, -0.77f, -0.43f, -0.89f, -0.75f)
                curveToRelative(0.62f, -0.29f, 1.45f, -0.51f, 1.78f, -0.22f)
                curveToRelative(0.53f, 0.48f, 2.0f, -0.84f, 1.91f, -2.38f)
                curveToRelative(0.62f, 0.34f, 1.61f, -2.8f, 0.77f, -3.9f)
                curveToRelative(1.92f, -2.68f, 1.4f, -2.92f, 0.76f, -2.48f)
                curveToRelative(-0.96f, 1.34f, -4.13f, 2.94f, -1.68f, 0.57f)
                curveToRelative(2.38f, -2.3f, -0.63f, -0.56f, -1.64f, -0.18f)
                curveToRelative(-1.19f, 1.49f, -2.45f, 0.77f, -2.45f, 0.77f)
                reflectiveCurveToRelative(0.05f, -1.22f, -1.48f, -1.25f)
                curveToRelative(0.71f, -1.96f, -0.43f, -1.25f, -0.83f, -1.78f)
                curveToRelative(-0.4f, -0.53f, -0.54f, -1.84f, -0.42f, -2.17f)
                close()
            }
            path(fill = radialGradient(0.0f to Color(0xFF0F80BC), 0.34f to Color(0xFF0A5F9E), 1.0f
                    to Color(0xFF00145A), center = Offset(64.52f,13.05f), radius = 43.07f), stroke =
                    null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(60.77f, 20.77f)
                curveToRelative(-0.3f, 0.78f, 0.97f, 2.04f, 1.61f, 1.63f)
                curveToRelative(0.64f, -0.41f, 1.55f, -1.22f, 1.55f, -1.22f)
                reflectiveCurveToRelative(0.97f, 0.78f, 0.58f, 1.34f)
                curveToRelative(-0.4f, 0.55f, -1.97f, 1.18f, 0.31f, 0.93f)
                curveToRelative(2.34f, -0.26f, 2.76f, -0.74f, 2.75f, -1.18f)
                curveToRelative(-0.01f, -0.44f, 0.12f, -2.04f, 0.52f, -2.15f)
                curveToRelative(0.01f, -0.82f, -1.59f, -0.74f, -1.03f, -1.56f)
                curveToRelative(0.55f, -0.81f, -0.75f, -2.15f, -0.75f, -2.15f)
                reflectiveCurveToRelative(-1.01f, 0.59f, -1.14f, 1.56f)
                curveToRelative(-0.13f, 0.96f, -1.08f, 0.44f, -1.52f, 0.67f)
                curveToRelative(0.12f, 0.48f, -0.02f, 1.0f, -0.02f, 1.0f)
                lineToRelative(-0.59f, -0.52f)
                curveToRelative(0.0f, -0.0f, -2.12f, 0.96f, -2.27f, 1.67f)
                close()
            }
            path(fill = radialGradient(0.0f to Color(0xFF0F80BC), 0.34f to Color(0xFF0A5F9E), 1.0f
                    to Color(0xFF00145A), center = Offset(64.52f,13.05f), radius = 43.07f), stroke =
                    null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(64.57f, 61.53f)
                curveToRelative(-0.28f, 0.28f, 0.04f, 1.11f, 0.4f, 1.07f)
                curveToRelative(0.36f, -0.04f, 0.92f, -0.2f, 0.92f, -0.2f)
                reflectiveCurveToRelative(0.28f, 0.55f, 0.0f, 0.71f)
                curveToRelative(-0.28f, 0.16f, -1.09f, 0.09f, -0.04f, 0.47f)
                curveToRelative(1.07f, 0.4f, 1.35f, 0.28f, 1.43f, 0.08f)
                curveToRelative(0.08f, -0.2f, 0.44f, -0.87f, 0.64f, -0.83f)
                curveToRelative(0.16f, -0.35f, -0.56f, -0.67f, -0.16f, -0.91f)
                curveToRelative(0.4f, -0.24f, 0.08f, -1.11f, 0.08f, -1.11f)
                reflectiveCurveToRelative(-0.56f, 0.04f, -0.8f, 0.44f)
                reflectiveCurveToRelative(-0.56f, -0.04f, -0.8f, -0.04f)
                curveToRelative(-0.04f, 0.24f, -0.2f, 0.44f, -0.2f, 0.44f)
                lineToRelative(-0.16f, -0.36f)
                reflectiveCurveToRelative(-1.12f, -0.04f, -1.31f, 0.24f)
                close()
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFF0F80BC), 0.34f to Color(0xFF0A5F9E),
                        1.0f to Color(0xFF00145A), start = Offset(74.26f,15.04f), end =
                        Offset(88.17f,16.23f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
                        = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(64.94f, 2.19f)
                    curveToRelative(-0.75f, 0.17f, 0.51f, 2.89f, 0.51f, 2.89f)
                    reflectiveCurveToRelative(-0.05f, 1.83f, 0.26f, 1.92f)
                    curveToRelative(0.31f, 0.09f, 2.35f, 0.6f, 3.42f, 1.93f)
                    curveToRelative(1.07f, 1.33f, 0.51f, 2.03f, -0.38f, 1.65f)
                    curveToRelative(-0.89f, -0.38f, -0.66f, 0.79f, -0.66f, 0.79f)
                    reflectiveCurveToRelative(2.7f, 0.88f, 0.66f, 0.82f)
                    curveToRelative(-2.04f, -0.05f, 1.37f, 1.44f, 1.15f, 1.59f)
                    curveToRelative(-0.22f, 0.16f, -0.35f, 1.01f, -0.35f, 1.01f)
                    reflectiveCurveToRelative(-1.8f, 0.15f, -0.28f, 0.79f)
                    curveToRelative(5.16f, 2.17f, -0.55f, 1.59f, -0.55f, 1.59f)
                    lineToRelative(-0.73f, 0.9f)
                    lineToRelative(1.44f, 1.81f)
                    lineToRelative(1.11f, 0.79f)
                    reflectiveCurveToRelative(2.34f, -0.78f, 3.06f, -0.9f)
                    curveToRelative(0.73f, -0.12f, 2.57f, -1.5f, 2.57f, -1.5f)
                    reflectiveCurveToRelative(0.55f, 0.4f, 0.14f, -0.41f)
                    curveToRelative(-0.41f, -0.81f, 1.52f, -0.45f, 2.0f, 0.15f)
                    lineToRelative(3.41f, 1.54f)
                    curveToRelative(0.04f, 0.12f, 0.12f, 0.22f, 0.24f, 0.31f)
                    curveToRelative(0.66f, 0.47f, -0.6f, 1.27f, -0.47f, 2.11f)
                    curveToRelative(0.13f, 0.84f, 0.9f, 2.23f, 1.75f, 2.08f)
                    curveToRelative(-0.15f, -0.8f, 1.53f, -0.9f, 0.94f, -0.01f)
                    curveToRelative(-0.58f, 0.89f, 0.06f, 0.87f, 0.06f, 0.87f)
                    reflectiveCurveToRelative(0.54f, 1.25f, 1.68f, 0.56f)
                    curveToRelative(-0.05f, 0.38f, 0.19f, 1.15f, 1.16f, 1.2f)
                    curveToRelative(0.0f, 0.0f, -0.1f, 0.42f, 0.7f, 0.71f)
                    curveToRelative(-0.11f, 1.43f, 0.35f, 1.48f, 0.46f, -0.7f)
                    curveToRelative(0.2f, 0.95f, 0.82f, -0.39f, 0.94f, -1.03f)
                    curveToRelative(0.13f, -0.65f, 1.45f, -2.06f, 1.09f, -0.81f)
                    curveToRelative(-0.35f, 1.24f, 3.9f, 1.7f, 4.38f, 0.21f)
                    curveToRelative(0.48f, -1.5f, 2.17f, -2.28f, 2.22f, -2.5f)
                    curveToRelative(0.05f, -0.23f, -3.78f, -0.59f, -3.36f, -0.41f)
                    curveToRelative(0.42f, 0.18f, 1.21f, -0.78f, 0.92f, -1.64f)
                    curveToRelative(0.47f, 0.1f, 0.68f, -1.9f, -0.07f, -2.41f)
                    curveToRelative(0.94f, -1.98f, 0.54f, -2.05f, 0.15f, -1.65f)
                    curveToRelative(-0.47f, 0.99f, -2.41f, 2.49f, -1.09f, 0.65f)
                    curveToRelative(1.33f, -1.87f, -0.54f, -0.23f, -1.19f, 0.17f)
                    curveToRelative(-0.57f, 1.11f, -1.57f, 0.89f, -1.57f, 0.89f)
                    reflectiveCurveToRelative(-0.18f, -0.75f, -1.25f, -0.5f)
                    curveToRelative(0.13f, -1.33f, -0.54f, -0.69f, -0.92f, -0.95f)
                    curveToRelative(-0.23f, -0.16f, -0.46f, -0.52f, -0.6f, -0.82f)
                    curveToRelative(0.92f, 0.37f, 2.15f, 0.77f, 1.94f, 0.09f)
                    curveToRelative(-0.14f, -0.45f, 1.74f, 0.53f, 1.81f, 0.33f)
                    lineToRelative(2.35f, -0.33f)
                    lineToRelative(2.28f, -1.44f)
                    curveTo(81.7f, 1.5f, 64.94f, 2.19f, 64.94f, 2.19f)
                    close()
                }
            }
            group {
                path(fill = linearGradient(0.0f to Color(0xFF0F80BC), 0.34f to Color(0xFF0A5F9E),
                        1.0f to Color(0xFF00145A), start = Offset(43.03f,17.15f), end =
                        Offset(35.35f,28.43f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
                        = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(43.25f, 6.39f)
                    curveToRelative(-8.72f, 3.91f, -15.3f, 11.98f, -15.3f, 11.98f)
                    reflectiveCurveToRelative(0.77f, 1.77f, 1.04f, 1.64f)
                    curveToRelative(0.27f, -0.13f, -1.95f, 4.64f, -0.32f, 4.91f)
                    curveToRelative(1.64f, 0.27f, 6.35f, -2.95f, 5.47f, -2.65f)
                    curveToRelative(-0.87f, 0.29f, 0.49f, -1.74f, 0.49f, -1.74f)
                    reflectiveCurveToRelative(2.45f, -1.09f, 1.0f, 0.17f)
                    curveToRelative(-1.44f, 1.25f, 1.91f, 0.15f, 1.86f, 0.41f)
                    curveToRelative(-0.05f, 0.26f, 0.43f, 0.94f, 0.43f, 0.94f)
                    reflectiveCurveToRelative(-1.15f, 1.23f, 0.34f, 0.74f)
                    curveToRelative(5.09f, -1.71f, 0.67f, 1.47f, 0.67f, 1.47f)
                    lineToRelative(0.09f, 1.08f)
                    lineToRelative(2.2f, 0.38f)
                    lineToRelative(1.3f, -0.12f)
                    reflectiveCurveToRelative(1.14f, -2.01f, 1.58f, -2.55f)
                    curveToRelative(0.44f, -0.55f, 0.85f, -2.71f, 0.85f, -2.71f)
                    reflectiveCurveToRelative(0.66f, -0.07f, -0.17f, -0.39f)
                    curveToRelative(-0.84f, -0.32f, 0.8f, -1.31f, 1.55f, -1.18f)
                    lineToRelative(3.55f, -1.1f)
                    arcToRelative(0.67f, 0.67f, 0.0f, false, false, 0.39f, 0.07f)
                    curveToRelative(0.81f, -0.09f, 0.4f, 1.32f, 1.07f, 1.85f)
                    curveToRelative(0.66f, 0.53f, 2.17f, 1.04f, 2.71f, 0.39f)
                    curveToRelative(-0.65f, -0.49f, 0.56f, -1.66f, 0.71f, -0.62f)
                    curveToRelative(0.15f, 1.03f, 0.63f, 0.6f, 0.63f, 0.6f)
                    reflectiveCurveToRelative(1.27f, -2.19f, 1.68f, -3.44f)
                    curveToRelative(0.22f, 0.31f, 2.3f, -2.73f, 1.67f, -4.18f)
                    curveToRelative(-0.64f, -1.47f, 0.4f, -2.85f, 0.28f, -3.06f)
                    curveToRelative(-0.12f, -0.21f, -0.74f, 0.44f, -0.28f, 0.28f)
                    curveToRelative(0.46f, -0.16f, -1.31f, 0.64f, -1.54f, -1.7f)
                    curveToRelative(-0.24f, -2.38f, -0.58f, 0.2f, -0.81f, 0.96f)
                    curveToRelative(0.31f, 1.24f, 3.54f, -5.02f, 3.54f, -5.02f)
                    lineToRelative(4.16f, -1.7f)
                    curveToRelative(-0.0f, 0.0f, -9.47f, -0.79f, -20.82f, 4.31f)
                    close()
                }
                path(fill = linearGradient(0.01f to Color(0x00000000), 0.65f to Color(0x33C4E0E3),
                        0.82f to Color(0xFFC4E0E3), 0.85f to Color(0xFFCDE5E8), 0.94f to
                        Color(0xFFE8F4F7), 1.0f to Color(0xFFF2FAFC), start = Offset(62.95f,29.85f),
                        end = Offset(62.95f,11.17f)), stroke = null, fillAlpha = 0.5f, strokeAlpha =
                        0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(37.54f, 20.55f)
                    arcToRelative(25.42f, 16.47f, 0.0f, true, false, 50.83f, 0.0f)
                    arcToRelative(25.42f, 16.47f, 0.0f, true, false, -50.83f, 0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDF731B), 0.55f to Color(0xFFDF731B),
                        0.7f to Color(0xFFEC8811), 0.86f to Color(0xFFF4950B), 1.0f to
                        Color(0xFFF79A09), start = Offset(64.46f,47.79f), end =
                        Offset(75.99f,41.01f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
                        = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(114.63f, 36.89f)
                    lineToRelative(-1.18f, 7.55f)
                    reflectiveCurveToRelative(-1.68f, -13.97f, -3.74f, -19.19f)
                    curveToRelative(-3.16f, -8.0f, -4.56f, -7.94f, -4.57f, -7.93f)
                    curveToRelative(2.12f, 5.38f, 1.73f, 8.26f, 1.73f, 8.26f)
                    reflectiveCurveToRelative(-3.75f, -10.21f, -13.66f, -13.46f)
                    curveTo(81.48f, 8.27f, 75.5f, 9.66f, 75.54f, 9.71f)
                    curveToRelative(0.05f, 0.05f, 12.13f, 2.11f, 14.27f, 5.06f)
                    curveToRelative(0.0f, 0.0f, -5.13f, 0.0f, -10.24f, 1.47f)
                    curveToRelative(-0.23f, 0.07f, 18.79f, 2.38f, 22.68f, 21.39f)
                    curveToRelative(0.0f, 0.0f, -2.09f, -4.35f, -4.66f, -5.09f)
                    curveToRelative(1.7f, 5.16f, 1.26f, 14.95f, -0.35f, 19.82f)
                    curveToRelative(-0.21f, 0.63f, -0.42f, -2.71f, -3.6f, -4.14f)
                    curveToRelative(1.02f, 7.3f, -0.06f, 18.89f, -5.13f, 22.08f)
                    curveToRelative(-0.4f, 0.25f, 3.18f, -11.44f, 0.72f, -6.92f)
                    curveToRelative(-14.67f, 22.5f, -32.12f, 9.1f, -39.2f, 4.33f)
                    curveToRelative(5.68f, 1.39f, 11.71f, 0.39f, 15.21f, -2.0f)
                    curveToRelative(3.53f, -2.41f, 5.61f, -4.17f, 7.48f, -3.76f)
                    curveToRelative(1.87f, 0.42f, 3.12f, -1.46f, 1.66f, -3.13f)
                    curveToRelative(-1.46f, -1.67f, -4.99f, -3.96f, -9.77f, -2.71f)
                    curveToRelative(-3.37f, 0.88f, -7.55f, 4.61f, -13.93f, 0.83f)
                    curveToRelative(-5.44f, -3.22f, -5.4f, -5.84f, -5.4f, -7.51f)
                    curveToRelative(0.0f, -1.67f, 1.48f, -4.2f, 4.19f, -3.79f)
                    curveToRelative(2.42f, 0.38f, 1.14f, -1.05f, 3.75f, 0.0f)
                    curveToRelative(0.71f, 0.28f, -0.07f, -3.4f, -1.08f, -5.77f)
                    curveToRelative(1.94f, -4.06f, 8.25f, -5.26f, 8.72f, -5.62f)
                    curveToRelative(0.85f, -0.64f, 0.38f, -0.97f, 0.68f, -1.94f)
                    curveToRelative(0.27f, -0.9f, 0.45f, -3.35f, -6.61f, -2.67f)
                    curveToRelative(-3.25f, 0.31f, -5.31f, -3.9f, -5.99f, -4.92f)
                    curveToRelative(0.22f, -1.3f, 0.57f, -2.49f, 1.05f, -3.58f)
                    curveToRelative(0.48f, -0.99f, 1.01f, -1.9f, 1.54f, -2.59f)
                    lineToRelative(0.44f, -0.58f)
                    curveToRelative(1.05f, -1.23f, 2.34f, -2.28f, 3.89f, -3.15f)
                    curveToRelative(0.81f, -0.46f, -9.04f, -0.03f, -13.48f, 5.75f)
                    curveToRelative(-1.19f, 0.16f, -2.82f, -0.19f, -4.65f, -0.19f)
                    curveToRelative(-2.29f, 0.0f, -4.09f, 0.25f, -5.75f, 0.67f)
                    curveToRelative(-0.27f, 0.07f, -0.7f, 0.03f, -1.22f, -0.09f)
                    curveToRelative(-1.46f, -1.52f, -5.6f, -5.16f, -5.79f, -10.1f)
                    curveToRelative(0.0f, 0.0f, -6.02f, 4.63f, -5.12f, 17.24f)
                    curveToRelative(-0.08f, 6.98f, -2.14f, 4.98f, -3.2f, 8.77f)
                    curveToRelative(-0.49f, 1.79f, 0.74f, 3.15f, 0.74f, 3.2f)
                    curveToRelative(-0.0f, 0.03f, 1.48f, -1.6f, 1.48f, -1.6f)
                    reflectiveCurveToRelative(-9.34f, 16.17f, 2.72f, 36.82f)
                    curveToRelative(10.39f, 17.8f, 27.83f, 25.67f, 45.93f, 24.14f)
                    arcToRelative(56.15f, 56.15f, 0.0f, false, false, 9.54f, -1.45f)
                    curveToRelative(42.16f, -10.19f, 37.58f, -61.1f, 37.58f, -61.1f)
                    close()
                }
                path(fill = linearGradient(0.01f to Color(0xFF941403), 0.9f to Color(0xFFE85C0A),
                        start = Offset(45.79f,31.84f), end = Offset(54.74f,32.61f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(48.78f, 24.13f)
                    reflectiveCurveToRelative(1.82f, 4.98f, 5.91f, 4.96f)
                    curveToRelative(7.8f, -0.03f, 7.95f, 0.08f, 8.0f, 1.02f)
                    curveToRelative(0.16f, 2.89f, -1.27f, 3.83f, -1.82f, 4.24f)
                    curveToRelative(-0.55f, 0.41f, -7.97f, 4.71f, -8.24f, 5.95f)
                    curveToRelative(-0.27f, 1.23f, -8.57f, -11.71f, -8.57f, -11.71f)
                    lineToRelative(4.72f, -4.47f)
                    close()
                }
                path(fill = linearGradient(0.01f to Color(0xFF941403), 0.14f to Color(0xFFA32104),
                        0.5f to Color(0xFFC84107), 0.79f to Color(0xFFDF5509), 0.97f to
                        Color(0xFFE85C0A), start = Offset(31.45f,29.36f), end =
                        Offset(63.77f,33.4f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
                        = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(52.94f, 29.5f)
                    reflectiveCurveToRelative(2.53f, 3.23f, 0.62f, 4.53f)
                    curveToRelative(-2.34f, 1.58f, 3.31f, 1.92f, 5.36f, 0.78f)
                    curveToRelative(2.05f, -1.15f, 3.3f, -2.84f, 3.37f, -3.09f)
                    curveToRelative(0.07f, -0.25f, 0.75f, -2.52f, -3.53f, -1.73f)
                    curveToRelative(-2.7f, 0.5f, -3.69f, 0.62f, -5.82f, -0.49f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFF2C8A9), 1.0f to Color(0xFFFFFFCC),
                        start = Offset(51.48f,37.91f), end = Offset(54.05f,36.77f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(60.88f, 34.36f)
                    curveToRelative(0.41f, -0.31f, 1.33f, -0.94f, 1.68f, -2.48f)
                    curveToRelative(-0.26f, 0.1f, -0.28f, -0.19f, -0.58f, -0.06f)
                    curveToRelative(-5.74f, 5.98f, -5.95f, 1.82f, -9.08f, 2.65f)
                    curveToRelative(-2.85f, 0.78f, -3.49f, 1.85f, -3.61f, 1.94f)
                    lineToRelative(0.13f, 0.18f)
                    curveToRelative(0.82f, 0.42f, 1.61f, 1.75f, 2.2f, 2.94f)
                    curveToRelative(0.58f, 0.69f, 0.97f, 1.03f, 1.02f, 0.78f)
                    curveToRelative(0.27f, -1.23f, 7.7f, -5.54f, 8.24f, -5.95f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFB30000), 1.0f to Color(0xFFDF731B),
                        start = Offset(43.26f,69.46f), end = Offset(86.61f,71.24f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(18.04f, 39.11f)
                    curveToRelative(-1.17f, 2.46f, -8.68f, 15.15f, 3.58f, 36.28f)
                    curveToRelative(12.0f, 20.68f, 32.76f, 27.44f, 53.97f, 22.85f)
                    curveToRelative(6.05f, -1.31f, 13.03f, -6.05f, 17.48f, -9.52f)
                    curveToRelative(-2.86f, -7.21f, -1.17f, -6.94f, -2.7f, -5.99f)
                    curveToRelative(-17.08f, 10.57f, -30.66f, 0.14f, -41.16f, -1.19f)
                    curveToRelative(-38.66f, -4.9f, -31.02f, -42.51f, -31.02f, -42.51f)
                    lineToRelative(-0.14f, 0.08f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF941403), 1.0f to Color(0xFFDF731B),
                        start = Offset(53.57f,62.73f), end = Offset(76.18f,70.8f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(50.23f, 68.1f)
                    curveToRelative(3.64f, 1.09f, 11.59f, 0.15f, 15.01f, -2.39f)
                    curveToRelative(2.3f, -1.71f, 4.04f, -3.0f, 5.5f, -3.54f)
                    curveToRelative(-2.58f, -1.75f, -2.63f, 0.73f, -8.06f, 1.99f)
                    curveToRelative(-11.32f, 2.63f, -16.82f, -3.05f, -16.82f, -3.05f)
                    curveToRelative(0.8f, 4.49f, 3.61f, 6.67f, 4.87f, 7.45f)
                    arcToRelative(7.09f, 7.09f, 0.0f, false, true, -0.5f, -0.47f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFB30000), 1.0f to Color(0xFFDE5C01),
                        start = Offset(15.25f,70.38f), end = Offset(37.26f,71.46f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(37.95f, 88.59f)
                    reflectiveCurveTo(28.53f, 77.96f, 25.9f, 66.05f)
                    curveToRelative(-3.88f, -3.66f, -6.63f, -6.76f, -8.46f, -9.0f)
                    curveToRelative(1.06f, 8.47f, 5.38f, 21.63f, 20.51f, 31.54f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(25.11f,64.21f), end = Offset(32.6f,102.51f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(30.09f, 78.94f)
                    reflectiveCurveToRelative(-6.5f, -9.26f, -4.07f, -17.12f)
                    curveToRelative(2.19f, -7.07f, -0.47f, -2.86f, -2.01f, -1.35f)
                    curveToRelative(-1.56f, 1.53f, -2.37f, -4.5f, -2.33f, -5.2f)
                    lineToRelative(-0.0f, -0.02f)
                    curveToRelative(-0.1f, -0.02f, -3.1f, 14.45f, 8.4f, 23.69f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(22.09f,51.49f), end = Offset(20.22f,92.96f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(20.46f, 70.87f)
                    reflectiveCurveToRelative(-1.48f, -18.79f, 3.2f, -21.44f)
                    curveToRelative(7.44f, -4.22f, 0.62f, -3.23f, -1.54f, -2.06f)
                    curveToRelative(-2.18f, 1.18f, -1.98f, -6.6f, -1.67f, -7.33f)
                    curveToRelative(0.3f, -0.73f, -7.68f, 7.35f, 0.0f, 30.84f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFA40000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(53.01f, 15.58f)
                    reflectiveCurveToRelative(-5.89f, 5.98f, -5.85f, 6.01f)
                    curveToRelative(0.04f, 0.02f, 0.17f, 7.68f, 0.36f, 9.85f)
                    curveToRelative(0.7f, 0.83f, 2.9f, 6.26f, 1.22f, 5.05f)
                    curveToRelative(-1.72f, -1.23f, -0.48f, -1.25f, -0.33f, -0.63f)
                    verticalLineToRelative(0.03f)
                    curveToRelative(-0.12f, 0.05f, -4.28f, -9.01f, 4.59f, -20.31f)
                    close()
                }
                path(fill = linearGradient(0.01f to Color(0xFF941403), 0.47f to Color(0xFFE85C0A),
                        1.0f to Color(0xFFF9BD5F), start = Offset(26.42f,26.8f), end =
                        Offset(21.92f,15.25f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
                        = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(24.99f, 10.97f)
                    reflectiveCurveToRelative(-6.26f, 4.8f, -5.07f, 17.98f)
                    curveToRelative(4.85f, -4.35f, 11.7f, -7.6f, 11.7f, -7.6f)
                    curveToRelative(-1.15f, -0.73f, -6.43f, -4.95f, -6.64f, -10.38f)
                    close()
                }
                path(fill = linearGradient(0.2f to Color(0xFFDE7210), 0.84f to Color(0xFFF9BD5F),
                        1.0f to Color(0xFFFFFCCF), start = Offset(45.68f,29.44f), end =
                        Offset(56.47f,15.26f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
                        = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(40.42f, 25.38f)
                    lineToRelative(9.4f, 11.7f)
                    curveToRelative(-2.71f, -11.49f, -0.63f, -18.38f, 6.05f, -22.14f)
                    curveToRelative(0.99f, -0.56f, -13.95f, 0.2f, -15.46f, 10.44f)
                    close()
                }
                path(fill = linearGradient(0.02f to Color(0xFF941403), 0.5f to Color(0xFFE35100),
                        1.0f to Color(0xFFDF731B), start = Offset(39.98f,48.81f), end =
                        Offset(50.92f,70.69f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
                        = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(33.8f, 54.27f)
                    curveToRelative(1.6f, -10.1f, 15.67f, -8.62f, 15.67f, -8.62f)
                    curveToRelative(-0.63f, 0.47f, -3.04f, 0.75f, -3.73f, 2.67f)
                    curveToRelative(-2.28f, 6.36f, -0.1f, 20.27f, 14.08f, 26.1f)
                    curveToRelative(1.5f, 0.62f, -28.39f, -5.22f, -26.02f, -20.15f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFEEA272), 0.19f to Color(0xFFEFA777),
                        0.41f to Color(0xFFF2B585), 0.64f to Color(0xFFF6CD9C), 0.89f to
                        Color(0xFFFCEEBB), 1.0f to Color(0xFFFFFFCC), start = Offset(56.5f,35.39f),
                        end = Offset(59.23f,37.87f)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(62.49f, 32.15f)
                    curveToRelative(-0.07f, -0.01f, -0.13f, -0.01f, -0.16f, 0.03f)
                    curveToRelative(-0.17f, 0.23f, -0.84f, 1.02f, -2.43f, 2.32f)
                    curveToRelative(-2.95f, 2.4f, -4.2f, 1.79f, -6.4f, 2.29f)
                    curveToRelative(-1.0f, 0.22f, -1.95f, 0.9f, -2.6f, 1.44f)
                    curveToRelative(0.26f, 0.42f, 0.5f, 0.87f, 0.72f, 1.3f)
                    curveToRelative(0.58f, 0.69f, 0.97f, 1.03f, 1.02f, 0.78f)
                    curveToRelative(0.27f, -1.23f, 7.7f, -5.53f, 8.24f, -5.95f)
                    curveToRelative(0.39f, -0.29f, 1.21f, -0.87f, 1.6f, -2.21f)
                    close()
                }
                path(fill = linearGradient(0.2f to Color(0xFFDF731B), 0.84f to Color(0xFFF9BD5F),
                        1.0f to Color(0xFFFFFCCF), start = Offset(40.56f,41.24f), end =
                        Offset(53.12f,54.04f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
                        = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(53.42f, 47.43f)
                    curveToRelative(0.08f, -2.13f, -0.07f, -7.32f, -2.29f, -9.57f)
                    curveToRelative(-1.7f, -1.72f, -2.09f, -3.69f, -2.32f, -5.94f)
                    curveToRelative(-18.44f, 6.89f, -21.07f, 15.89f, -19.23f, 15.6f)
                    curveToRelative(14.75f, -2.34f, 18.89f, -2.62f, 23.84f, -0.09f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(22.49f,35.19f), end = Offset(10.54f,80.7f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(14.11f, 60.05f)
                    reflectiveCurveToRelative(1.28f, -16.65f, 9.61f, -22.74f)
                    curveToRelative(6.54f, -4.79f, 1.46f, -3.05f, -1.06f, -2.85f)
                    curveToRelative(-2.66f, 0.21f, -4.09f, 1.83f, -3.57f, 1.24f)
                    lineToRelative(0.03f, -0.05f)
                    curveToRelative(-0.09f, -0.1f, -6.25f, 5.07f, -5.01f, 24.4f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF2C06E),
                        start = Offset(23.74f,31.2f), end = Offset(10.45f,62.86f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(13.23f, 47.26f)
                    reflectiveCurveTo(17.69f, 33.08f, 26.72f, 33.2f)
                    curveToRelative(5.99f, 0.08f, 1.24f, -5.06f, -0.57f, -5.84f)
                    curveToRelative(-1.89f, -0.81f, -2.34f, -0.78f, -2.78f, -0.39f)
                    curveToRelative(-0.66f, 0.59f, -6.6f, 0.36f, -10.14f, 20.28f)
                    close()
                }
                path(fill = linearGradient(0.01f to Color(0xFFFFFAEE), 0.28f to Color(0xFFF5F89B),
                        0.31f to Color(0xFFF3ED91), 0.47f to Color(0xFFECC267), 0.62f to
                        Color(0xFFE6A046), 0.76f to Color(0xFFE2872E), 0.89f to Color(0xFFE07820),
                        1.0f to Color(0xFFDF731B), start = Offset(78.02f,57.3f), end =
                        Offset(61.12f,60.53f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
                        = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(74.11f, 61.13f)
                    curveToRelative(0.68f, -0.67f, 0.21f, -3.22f, -4.06f, -4.77f)
                    curveToRelative(-3.87f, -1.4f, -9.91f, 2.17f, -11.7f, 2.87f)
                    curveToRelative(0.0f, 0.0f, 6.84f, -1.28f, 9.41f, -0.86f)
                    curveToRelative(3.48f, 0.58f, 4.7f, 4.37f, 6.36f, 2.75f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF2C06E),
                        start = Offset(23.78f,34.4f), end = Offset(18.83f,73.41f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(19.82f, 56.46f)
                    reflectiveCurveToRelative(-0.74f, -13.94f, 5.5f, -19.89f)
                    curveToRelative(4.9f, -4.68f, 0.88f, -2.68f, -1.19f, -2.25f)
                    curveToRelative(-2.18f, 0.46f, -3.19f, 1.96f, -2.82f, 1.41f)
                    lineToRelative(0.01f, -0.04f)
                    curveToRelative(-0.09f, -0.08f, -4.63f, 4.88f, -1.5f, 20.76f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF2C06E),
                        start = Offset(24.65f,31.08f), end = Offset(10.41f,67.73f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(15.01f, 52.03f)
                    reflectiveCurveToRelative(2.64f, -13.7f, 10.14f, -17.98f)
                    curveToRelative(5.89f, -3.36f, 1.5f, -2.39f, -0.61f, -2.47f)
                    curveToRelative(-2.23f, -0.08f, -3.56f, 1.13f, -3.08f, 0.69f)
                    lineToRelative(0.03f, -0.04f)
                    curveToRelative(-0.06f, -0.09f, -5.67f, 3.62f, -6.47f, 19.79f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF2C072),
                        start = Offset(23.84f,49.08f), end = Offset(24.6f,68.81f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(23.91f, 57.66f)
                    reflectiveCurveToRelative(-1.44f, -8.31f, 1.67f, -12.4f)
                    curveToRelative(2.48f, -3.26f, 0.3f, -1.67f, -0.85f, -1.2f)
                    curveToRelative(-1.2f, 0.49f, -1.66f, 1.46f, -1.49f, 1.1f)
                    curveToRelative(0.16f, -0.35f, -5.35f, 3.92f, 0.68f, 12.49f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF2C072),
                        start = Offset(25.49f,41.25f), end = Offset(26.24f,60.97f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(25.56f, 49.83f)
                    reflectiveCurveToRelative(-1.44f, -8.31f, 1.67f, -12.4f)
                    curveToRelative(2.48f, -3.26f, 0.3f, -1.67f, -0.85f, -1.2f)
                    curveToRelative(-1.2f, 0.49f, -1.66f, 1.46f, -1.49f, 1.1f)
                    curveToRelative(0.16f, -0.35f, -5.35f, 3.92f, 0.68f, 12.49f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFEED8A5),
                        start = Offset(21.45f,32.58f), end = Offset(16.66f,41.52f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(16.84f, 38.47f)
                    reflectiveCurveToRelative(3.37f, -6.91f, 7.85f, -8.27f)
                    curveToRelative(3.58f, -1.08f, 1.11f, -1.07f, 0.01f, -1.34f)
                    curveToRelative(-1.15f, -0.28f, -2.0f, 0.19f, -1.69f, 0.02f)
                    curveToRelative(0.3f, -0.17f, -6.04f, 0.04f, -6.17f, 9.59f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFEED8A5),
                        start = Offset(20.96f,38.05f), end = Offset(16.18f,46.99f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(16.36f, 43.94f)
                    reflectiveCurveToRelative(3.37f, -6.91f, 7.85f, -8.27f)
                    curveToRelative(3.58f, -1.08f, 1.11f, -1.07f, 0.01f, -1.34f)
                    curveToRelative(-1.15f, -0.28f, -2.0f, 0.19f, -1.69f, 0.02f)
                    curveToRelative(0.3f, -0.17f, -6.05f, 0.04f, -6.17f, 9.59f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF2C072),
                        start = Offset(26.39f,34.25f), end = Offset(21.76f,45.75f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(18.81f, 42.43f)
                    reflectiveCurveToRelative(5.94f, -12.18f, 13.85f, -14.58f)
                    curveToRelative(6.31f, -1.91f, 1.96f, -1.89f, 0.02f, -2.36f)
                    curveToRelative(-2.03f, -0.49f, -3.54f, 0.34f, -2.99f, 0.03f)
                    curveToRelative(0.54f, -0.3f, -10.66f, 0.07f, -10.88f, 16.91f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF2C072),
                        start = Offset(28.15f,28.66f), end = Offset(17.2f,45.08f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(22.87f, 35.87f)
                    reflectiveCurveToRelative(3.7f, -7.58f, 8.61f, -9.07f)
                    curveToRelative(3.92f, -1.19f, 1.22f, -1.17f, 0.01f, -1.47f)
                    curveToRelative(-1.26f, -0.31f, -2.2f, 0.21f, -1.86f, 0.02f)
                    curveToRelative(0.33f, -0.19f, -6.63f, 0.04f, -6.77f, 10.52f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF2C072),
                        start = Offset(28.89f,31.98f), end = Offset(18.91f,46.94f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(24.07f, 38.54f)
                    reflectiveCurveToRelative(3.37f, -6.91f, 7.85f, -8.26f)
                    curveToRelative(3.58f, -1.09f, 1.11f, -1.07f, 0.01f, -1.34f)
                    curveToRelative(-1.15f, -0.28f, -2.01f, 0.19f, -1.69f, 0.02f)
                    curveToRelative(0.3f, -0.17f, -6.05f, 0.04f, -6.17f, 9.58f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF8B8B89), 1.0f to Color(0xFF120500),
                        start = Offset(61.0f,29.64f), end = Offset(61.79f,31.05f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(62.7f, 30.12f)
                    curveToRelative(-0.04f, -0.72f, -0.15f, -0.95f, -3.59f, -1.01f)
                    arcToRelative(8.38f, 8.38f, 0.0f, false, true, 1.83f, 1.15f)
                    curveToRelative(0.99f, 0.81f, 1.15f, 1.72f, 1.25f, 2.65f)
                    curveToRelative(0.34f, -0.64f, 0.58f, -1.52f, 0.51f, -2.79f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(29.89f,24.86f), end = Offset(29.89f,20.53f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(42.46f, 20.5f)
                    lineToRelative(-2.99f, 4.81f)
                    reflectiveCurveToRelative(-11.95f, -1.88f, -22.08f, 7.93f)
                    curveToRelative(-0.84f, 0.81f, 6.63f, -17.33f, 25.07f, -12.74f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(30.14f,29.68f), end = Offset(39.61f,19.47f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(31.73f, 29.11f)
                    reflectiveCurveToRelative(3.18f, -5.91f, 7.32f, -7.7f)
                    curveToRelative(-2.13f, 0.07f, -6.93f, 1.74f, -7.32f, 7.7f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFEED8A5),
                        start = Offset(24.08f,28.99f), end = Offset(19.29f,37.93f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(19.47f, 34.88f)
                    reflectiveCurveToRelative(3.37f, -6.91f, 7.85f, -8.27f)
                    curveToRelative(3.58f, -1.09f, 1.11f, -1.07f, 0.01f, -1.34f)
                    curveToRelative(-1.15f, -0.28f, -2.0f, 0.19f, -1.69f, 0.02f)
                    curveToRelative(0.3f, -0.17f, -6.05f, 0.04f, -6.17f, 9.59f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(24.83f,30.45f), end = Offset(34.7f,21.09f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(26.53f, 30.01f)
                    reflectiveCurveToRelative(3.48f, -5.57f, 7.61f, -7.05f)
                    curveToRelative(-2.08f, -0.07f, -6.86f, 1.26f, -7.61f, 7.05f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(22.29f,19.29f), end = Offset(32.75f,21.7f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(32.49f, 20.5f)
                    reflectiveCurveToRelative(-2.62f, 1.15f, -7.25f, -0.78f)
                    lineToRelative(4.12f, 2.07f)
                    lineToRelative(3.12f, -1.3f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(17.05f,20.42f), end = Offset(32.05f,22.47f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(31.23f, 21.24f)
                    reflectiveCurveToRelative(-3.49f, 1.35f, -10.22f, -0.66f)
                    lineToRelative(5.75f, 2.29f)
                    curveToRelative(0.71f, -0.66f, 4.47f, -1.63f, 4.47f, -1.63f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(24.4f,18.95f), end = Offset(34.01f,21.16f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(33.78f, 20.13f)
                    reflectiveCurveToRelative(-2.32f, 0.71f, -6.6f, -0.95f)
                    lineToRelative(4.12f, 2.07f)
                    curveToRelative(0.44f, -0.39f, 2.48f, -1.12f, 2.48f, -1.12f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(23.83f,23.58f), end = Offset(15.02f,22.67f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(26.55f, 22.8f)
                    reflectiveCurveToRelative(-1.72f, 1.43f, -6.14f, 1.49f)
                    lineToRelative(3.82f, 0.13f)
                    lineToRelative(2.32f, -1.61f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(20.3f,31.05f), end = Offset(33.89f,18.16f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(22.35f, 30.12f)
                    reflectiveCurveToRelative(5.9f, -7.68f, 10.76f, -9.42f)
                    curveToRelative(-2.45f, -0.08f, -9.87f, 2.63f, -10.76f, 9.42f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDE5C01), 0.74f to Color(0xFFFEFD00),
                        0.78f to Color(0xFFFEFE26), 0.84f to Color(0xFFFFFE54), 0.89f to
                        Color(0xFFFFFF76), 0.93f to Color(0xFFFFFF8B), 0.96f to Color(0xFFFFFF92),
                        start = Offset(84.13f,98.14f), end = Offset(107.98f,61.34f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(113.7f, 43.22f)
                    reflectiveCurveToRelative(0.63f, 14.25f, -19.17f, 34.06f)
                    curveToRelative(-2.2f, 2.2f, -14.15f, 13.4f, -13.73f, 16.75f)
                    curveToRelative(0.15f, 1.19f, 31.35f, -4.79f, 32.9f, -50.81f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFF79A09), 0.74f to Color(0xFFFEFD00),
                        0.78f to Color(0xFFFEFE26), 0.84f to Color(0xFFFFFE54), 0.89f to
                        Color(0xFFFFFF76), 0.93f to Color(0xFFFFFF8B), 0.96f to Color(0xFFFFFF92),
                        start = Offset(98.0f,20.11f), end = Offset(82.38f,13.25f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(75.31f, 9.69f)
                    curveToRelative(23.85f, 1.83f, 28.47f, 18.98f, 28.47f, 17.93f)
                    curveToRelative(0.06f, -16.67f, -22.63f, -17.94f, -28.47f, -17.93f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDE5C01), 0.74f to Color(0xFFFEFD00),
                        0.78f to Color(0xFFFEFE26), 0.84f to Color(0xFFFFFE54), 0.89f to
                        Color(0xFFFFFF76), 0.93f to Color(0xFFFFFF8B), 0.96f to Color(0xFFFFFF92),
                        start = Offset(108.49f,35.77f), end = Offset(86.62f,15.47f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(82.57f, 16.21f)
                    reflectiveCurveToRelative(16.53f, 3.38f, 21.2f, 20.91f)
                    curveToRelative(0.62f, 2.32f, -1.99f, -14.24f, -1.19f, -12.67f)
                    curveToRelative(0.81f, 1.58f, -6.65f, -7.71f, -20.01f, -8.24f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFF79A09), 0.74f to Color(0xFFFEFD00),
                        0.78f to Color(0xFFFEFE26), 0.84f to Color(0xFFFFFE54), 0.89f to
                        Color(0xFFFFFF76), 0.93f to Color(0xFFFFFF8B), 0.96f to Color(0xFFFFFF92),
                        start = Offset(101.93f,34.63f), end = Offset(92.51f,25.42f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(89.18f, 15.78f)
                    reflectiveCurveToRelative(14.93f, 3.11f, 15.08f, 26.81f)
                    curveToRelative(0.1f, 16.77f, 2.59f, 6.3f, 5.05f, 2.53f)
                    curveToRelative(2.13f, -3.26f, 0.67f, -7.22f, 0.62f, -7.21f)
                    curveToRelative(-0.01f, 0.0f, -1.08f, -3.09f, -0.36f, -1.78f)
                    curveToRelative(0.03f, 0.06f, -1.0f, -0.85f, -1.0f, -0.85f)
                    curveToRelative(0.17f, -0.02f, -0.58f, -17.03f, -19.41f, -19.49f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFF79A09), 0.74f to Color(0xFFFEFD00),
                        0.78f to Color(0xFFFEFE26), 0.84f to Color(0xFFFFFE54), 0.89f to
                        Color(0xFFFFFF76), 0.93f to Color(0xFFFFFF8B), 0.96f to Color(0xFFFFFF92),
                        start = Offset(104.82f,47.4f), end = Offset(109.98f,29.67f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(106.0f, 18.99f)
                    reflectiveCurveToRelative(5.36f, 13.97f, -0.32f, 20.92f)
                    curveToRelative(-1.86f, 2.27f, -2.06f, 13.88f, 0.2f, 12.82f)
                    curveToRelative(2.27f, -1.07f, 1.78f, 6.17f, 1.48f, 6.99f)
                    lineToRelative(-0.0f, 0.03f)
                    curveToRelative(0.15f, 0.09f, 11.21f, -17.86f, -1.36f, -40.75f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFF79A09), 0.74f to Color(0xFFFEFD00),
                        0.78f to Color(0xFFFEFE26), 0.84f to Color(0xFFFFFE54), 0.89f to
                        Color(0xFFFFFF76), 0.93f to Color(0xFFFFFF8B), 0.96f to Color(0xFFFFFF92),
                        start = Offset(101.13f,51.5f), end = Offset(100.39f,38.04f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(98.54f, 33.7f)
                    reflectiveCurveToRelative(3.38f, 9.89f, -0.16f, 16.95f)
                    lineToRelative(2.67f, 5.97f)
                    curveToRelative(1.96f, -4.82f, 4.46f, -15.01f, -2.52f, -22.93f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFF79A09), 0.74f to Color(0xFFFEFD00),
                        0.78f to Color(0xFFFEFE26), 0.84f to Color(0xFFFFFE54), 0.89f to
                        Color(0xFFFFFF76), 0.93f to Color(0xFFFFFF8B), 0.96f to Color(0xFFFFFF92),
                        start = Offset(98.16f,63.23f), end = Offset(106.12f,44.32f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(104.48f, 32.52f)
                    reflectiveCurveToRelative(2.34f, 15.69f, -6.09f, 29.85f)
                    curveToRelative(0.13f, 3.28f, -0.44f, 6.24f, -1.23f, 8.69f)
                    curveToRelative(0.37f, 0.48f, 0.86f, 0.81f, 1.51f, 0.87f)
                    curveToRelative(-0.29f, 0.26f, -0.57f, 0.51f, -0.85f, 0.75f)
                    curveToRelative(-0.51f, 0.22f, -1.02f, 0.46f, -1.53f, 0.7f)
                    lineToRelative(-0.32f, 0.73f)
                    arcToRelative(26.73f, 26.73f, 0.0f, false, false, 1.85f, -1.43f)
                    curveToRelative(1.72f, -0.76f, 3.27f, -1.35f, 3.27f, -1.35f)
                    lineToRelative(-1.08f, 0.39f)
                    curveToRelative(-0.51f, 0.19f, -0.96f, 0.25f, -1.35f, 0.21f)
                    curveToRelative(6.51f, -5.93f, 15.42f, -19.19f, 5.82f, -39.41f)
                    close()
                    moveTo(94.66f, 74.23f)
                    curveToRelative(-0.74f, 0.44f, -1.29f, 0.85f, -1.4f, 1.16f)
                    curveToRelative(-0.09f, 0.23f, 0.42f, 0.1f, 1.3f, -0.4f)
                    curveToRelative(0.05f, -0.26f, 0.08f, -0.52f, 0.1f, -0.77f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFDE5C01), 0.74f to Color(0xFFFEFD00),
                        0.78f to Color(0xFFFEFE26), 0.84f to Color(0xFFFFFE54), 0.89f to
                        Color(0xFFFFFF76), 0.93f to Color(0xFFFFFF8B), 0.96f to Color(0xFFFFFF92),
                        start = Offset(88.62f,78.86f), end = Offset(88.43f,58.56f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(94.09f, 49.24f)
                    reflectiveCurveToRelative(6.64f, 18.91f, -14.59f, 36.64f)
                    curveToRelative(-1.25f, 1.05f, 8.62f, 0.6f, 9.48f, 0.21f)
                    curveToRelative(2.54f, -1.16f, 5.55f, -8.87f, 5.2f, -7.95f)
                    curveToRelative(-0.35f, 0.92f, 9.86f, -13.63f, -0.09f, -28.9f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFB9120D), 0.08f to Color(0xFFBB180D),
                        0.18f to Color(0xFFC0290C), 0.3f to Color(0xFFC8450A), 0.43f to
                        Color(0xFFD36C08), 0.57f to Color(0xFFE29E05), 0.71f to Color(0xFFF4DA02),
                        0.79f to Color(0xFFFEFD00), 0.81f to Color(0xFFFEFD07), 0.85f to
                        Color(0xFFFEFD1B), 0.88f to Color(0xFFFEFE3C), 0.93f to Color(0xFFFFFE69),
                        0.97f to Color(0xFFFFFFA3), 1.0f to Color(0xFFFFFFC7), start =
                        Offset(59.42f,95.24f), end = Offset(98.59f,71.83f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(103.38f, 61.23f)
                    reflectiveCurveTo(99.37f, 85.76f, 71.67f, 87.73f)
                    curveToRelative(-10.85f, 0.77f, -26.42f, -1.77f, -25.05f, 2.37f)
                    curveToRelative(0.43f, 1.28f, 2.47f, 6.63f, 7.12f, 7.87f)
                    curveToRelative(12.59f, 3.36f, 46.1f, 2.26f, 49.64f, -36.74f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(56.82f,77.56f), end = Offset(96.21f,86.95f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(80.27f, 79.79f)
                    reflectiveCurveToRelative(-16.95f, 3.87f, -27.93f, -5.48f)
                    curveToRelative(-10.05f, -8.56f, -5.06f, -1.36f, -3.7f, 2.2f)
                    curveToRelative(1.4f, 3.64f, -6.48f, 0.86f, -7.66f, 0.27f)
                    curveToRelative(-1.18f, -0.58f, 18.65f, 11.86f, 39.29f, 3.01f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(44.03f,74.24f), end = Offset(88.03f,95.5f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(69.35f, 89.03f)
                    reflectiveCurveToRelative(-20.22f, -3.97f, -26.62f, -17.68f)
                    curveToRelative(-5.47f, -11.71f, -4.02f, -3.12f, -4.27f, 0.79f)
                    curveToRelative(-0.26f, 4.02f, -5.93f, -1.47f, -6.69f, -2.43f)
                    lineToRelative(-0.04f, -0.04f)
                    curveToRelative(-0.11f, 0.08f, 10.43f, 16.6f, 37.62f, 19.34f)
                    close()
                }
                path(fill = linearGradient(0.06f to Color(0xFFDE7210), 1.0f to Color(0xFFF6C08F),
                        start = Offset(29.84f,70.03f), end = Offset(59.26f,107.77f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(47.26f, 87.26f)
                    reflectiveCurveToRelative(-9.66f, -7.48f, -14.01f, -17.74f)
                    curveToRelative(-3.66f, -1.27f, -8.52f, -4.18f, -8.62f, -4.68f)
                    curveToRelative(1.55f, 7.97f, 9.69f, 17.28f, 22.63f, 22.41f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF383838)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.69f, 111.18f)
                    verticalLineToRelative(4.91f)
                    horizontalLineToRelative(5.39f)
                    verticalLineToRelative(3.12f)
                    horizontalLineToRelative(-5.39f)
                    verticalLineToRelative(7.34f)
                    horizontalLineToRelative(-4.38f)
                    verticalLineToRelative(-18.49f)
                    lineTo(35.33f, 108.06f)
                    lineToRelative(-0.45f, 3.12f)
                    horizontalLineToRelative(-6.19f)
                    close()
                    moveTo(41.9f, 105.59f)
                    curveToRelative(0.47f, 0.45f, 0.71f, 1.03f, 0.71f, 1.72f)
                    reflectiveCurveToRelative(-0.24f, 1.27f, -0.71f, 1.72f)
                    curveToRelative(-0.47f, 0.45f, -1.07f, 0.68f, -1.8f, 0.68f)
                    curveToRelative(-0.73f, 0.0f, -1.33f, -0.23f, -1.79f, -0.68f)
                    curveToRelative(-0.46f, -0.45f, -0.69f, -1.03f, -0.69f, -1.72f)
                    reflectiveCurveToRelative(0.23f, -1.27f, 0.69f, -1.72f)
                    curveToRelative(0.46f, -0.45f, 1.06f, -0.68f, 1.79f, -0.68f)
                    curveToRelative(0.73f, 0.0f, 1.33f, 0.23f, 1.8f, 0.68f)
                    close()
                    moveTo(38.02f, 126.55f)
                    verticalLineToRelative(-14.17f)
                    horizontalLineToRelative(4.22f)
                    verticalLineToRelative(14.17f)
                    horizontalLineToRelative(-4.22f)
                    close()
                    moveTo(54.64f, 112.17f)
                    lineToRelative(-0.67f, 4.08f)
                    curveToRelative(-0.53f, -0.13f, -0.96f, -0.19f, -1.28f, -0.19f)
                    curveToRelative(-0.84f, 0.0f, -1.47f, 0.29f, -1.91f, 0.87f)
                    curveToRelative(-0.44f, 0.58f, -0.78f, 1.45f, -1.03f, 2.6f)
                    verticalLineToRelative(7.02f)
                    horizontalLineToRelative(-4.22f)
                    lineTo(45.55f, 112.38f)
                    horizontalLineToRelative(3.68f)
                    lineToRelative(0.35f, 2.75f)
                    curveToRelative(0.32f, -0.98f, 0.8f, -1.75f, 1.45f, -2.31f)
                    curveToRelative(0.65f, -0.56f, 1.38f, -0.84f, 2.2f, -0.84f)
                    curveToRelative(0.51f, -0.0f, 0.99f, 0.06f, 1.41f, 0.19f)
                    close()
                    moveTo(68.25f, 120.7f)
                    horizontalLineToRelative(-8.78f)
                    curveToRelative(0.14f, 1.19f, 0.48f, 2.03f, 1.01f, 2.51f)
                    reflectiveCurveToRelative(1.27f, 0.72f, 2.21f, 0.72f)
                    curveToRelative(0.57f, 0.0f, 1.12f, -0.1f, 1.65f, -0.31f)
                    reflectiveCurveToRelative(1.11f, -0.52f, 1.73f, -0.95f)
                    lineToRelative(1.73f, 2.35f)
                    curveToRelative(-1.65f, 1.32f, -3.49f, 1.97f, -5.52f, 1.97f)
                    curveToRelative(-2.29f, 0.0f, -4.05f, -0.68f, -5.28f, -2.03f)
                    curveToRelative(-1.23f, -1.35f, -1.84f, -3.17f, -1.84f, -5.44f)
                    curveToRelative(0.0f, -1.44f, 0.26f, -2.73f, 0.77f, -3.88f)
                    curveToRelative(0.51f, -1.15f, 1.27f, -2.05f, 2.27f, -2.72f)
                    curveToRelative(1.0f, -0.67f, 2.19f, -1.0f, 3.58f, -1.0f)
                    curveToRelative(2.05f, 0.0f, 3.65f, 0.64f, 4.8f, 1.92f)
                    curveToRelative(1.16f, 1.28f, 1.73f, 3.06f, 1.73f, 5.34f)
                    curveToRelative(0.0f, 0.59f, -0.03f, 1.09f, -0.08f, 1.52f)
                    close()
                    moveTo(64.19f, 117.98f)
                    curveToRelative(-0.04f, -2.17f, -0.8f, -3.26f, -2.29f, -3.26f)
                    curveToRelative(-0.73f, 0.0f, -1.29f, 0.27f, -1.69f, 0.8f)
                    curveToRelative(-0.4f, 0.53f, -0.65f, 1.41f, -0.73f, 2.64f)
                    horizontalLineToRelative(4.72f)
                    verticalLineToRelative(-0.19f)
                    close()
                    moveTo(75.93f, 109.85f)
                    curveToRelative(-0.27f, 0.28f, -0.4f, 0.77f, -0.4f, 1.44f)
                    verticalLineToRelative(1.09f)
                    horizontalLineToRelative(3.33f)
                    lineToRelative(-0.45f, 2.94f)
                    horizontalLineToRelative(-2.88f)
                    verticalLineToRelative(11.23f)
                    horizontalLineToRelative(-4.22f)
                    verticalLineToRelative(-11.23f)
                    horizontalLineToRelative(-2.13f)
                    verticalLineToRelative(-2.94f)
                    horizontalLineToRelative(2.13f)
                    verticalLineToRelative(-1.25f)
                    curveToRelative(0.0f, -1.42f, 0.47f, -2.58f, 1.4f, -3.48f)
                    curveToRelative(0.93f, -0.9f, 2.27f, -1.35f, 4.01f, -1.35f)
                    curveToRelative(1.4f, 0.0f, 2.69f, 0.3f, 3.87f, 0.91f)
                    lineToRelative(-1.15f, 2.75f)
                    arcToRelative(4.91f, 4.91f, 0.0f, false, false, -2.21f, -0.53f)
                    curveToRelative(-0.61f, 0.0f, -1.04f, 0.14f, -1.31f, 0.43f)
                    close()
                    moveTo(91.22f, 113.91f)
                    curveToRelative(1.23f, 1.33f, 1.84f, 3.18f, 1.84f, 5.56f)
                    curveToRelative(0.0f, 1.51f, -0.28f, 2.83f, -0.84f, 3.96f)
                    curveToRelative(-0.56f, 1.13f, -1.36f, 2.01f, -2.4f, 2.63f)
                    curveToRelative(-1.04f, 0.62f, -2.27f, 0.93f, -3.69f, 0.93f)
                    curveToRelative(-2.15f, 0.0f, -3.85f, -0.66f, -5.08f, -1.99f)
                    curveToRelative(-1.24f, -1.32f, -1.85f, -3.18f, -1.85f, -5.56f)
                    curveToRelative(0.0f, -1.51f, 0.28f, -2.83f, 0.84f, -3.96f)
                    curveToRelative(0.56f, -1.13f, 1.36f, -2.01f, 2.4f, -2.63f)
                    curveToRelative(1.04f, -0.62f, 2.27f, -0.93f, 3.69f, -0.93f)
                    curveToRelative(2.17f, 0.0f, 3.87f, 0.66f, 5.1f, 1.99f)
                    close()
                    moveTo(84.2f, 116.1f)
                    curveToRelative(-0.43f, 0.72f, -0.64f, 1.84f, -0.64f, 3.35f)
                    curveToRelative(0.0f, 1.55f, 0.21f, 2.68f, 0.63f, 3.39f)
                    curveToRelative(0.42f, 0.71f, 1.06f, 1.07f, 1.93f, 1.07f)
                    curveToRelative(0.85f, 0.0f, 1.49f, -0.36f, 1.92f, -1.08f)
                    curveToRelative(0.43f, -0.72f, 0.64f, -1.84f, 0.64f, -3.35f)
                    curveToRelative(0.0f, -1.55f, -0.21f, -2.68f, -0.63f, -3.39f)
                    curveToRelative(-0.42f, -0.71f, -1.06f, -1.07f, -1.93f, -1.07f)
                    curveToRelative(-0.85f, 0.0f, -1.5f, 0.36f, -1.92f, 1.08f)
                    close()
                    moveTo(102.53f, 126.55f)
                    lineToRelative(-2.45f, -5.31f)
                    lineToRelative(-2.4f, 5.31f)
                    horizontalLineToRelative(-4.59f)
                    lineToRelative(4.56f, -7.44f)
                    lineToRelative(-4.11f, -6.72f)
                    horizontalLineToRelative(4.72f)
                    lineToRelative(1.97f, 4.54f)
                    lineToRelative(1.89f, -4.54f)
                    horizontalLineToRelative(4.48f)
                    lineToRelative(-3.87f, 6.59f)
                    lineToRelative(4.56f, 7.58f)
                    horizontalLineToRelative(-4.78f)
                    close()
                }
            }
        }
        .build()
        return _originalWordmark!!
    }

private var _originalWordmark: ImageVector? = null
