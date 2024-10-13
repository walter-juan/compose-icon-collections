package com.woowla.compose.icon.collections.devicons.devicons.grpc

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
import com.woowla.compose.icon.collections.devicons.devicons.GrpcGroup

public val GrpcGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFF00B5B2), 0.13f to Color(0xFF00B9B6), 0.28f
                    to Color(0xFF1CBCBA), 0.49f to Color(0xFF44C1BF), 0.65f to Color(0xFF57C4C3),
                    0.79f to Color(0xFF63C7C6), 0.9f to Color(0xFF6CC9C8), 1.0f to
                    Color(0xFF72CBCA), start = Offset(27.91f,52.0f), end = Offset(38.31f,51.51f)),
                    stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                    Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(33.09f, 41.59f)
                lineToRelative(-5.18f, 5.22f)
                lineTo(33.13f, 52.0f)
                lineToRelative(5.18f, -5.22f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF71CACA), 0.12f to Color(0xFF66C7C7), 0.24f
                    to Color(0xFF57C4C3), 0.4f to Color(0xFF34BEBD), 0.52f to Color(0xFF00BAB7),
                    0.59f to Color(0xFF00B6B3), 0.68f to Color(0xFF00B2AE), 1.0f to
                    Color(0xFF00B0AD), start = Offset(0.0f,46.93f), end = Offset(17.74f,48.76f)),
                    stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                    Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.84f, 38.03f)
                lineTo(0.0f, 46.94f)
                lineToRelative(8.94f, 8.84f)
                lineToRelative(8.8f, -8.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.79f, 41.52f)
                lineToRelative(-4.56f, 0.02f)
                lineToRelative(-5.35f, 5.39f)
                lineToRelative(5.39f, 5.35f)
                lineToRelative(4.56f, -0.02f)
                lineToRelative(-4.78f, -4.74f)
                lineToRelative(23.62f, -0.09f)
                lineToRelative(-2.07f, 2.08f)
                lineToRelative(2.28f, -0.01f)
                lineToRelative(2.68f, -2.7f)
                lineToRelative(-2.7f, -2.68f)
                lineToRelative(-2.28f, 0.01f)
                lineToRelative(2.09f, 2.07f)
                lineToRelative(-23.62f, 0.09f)
                close()
                moveTo(115.49f, 43.84f)
                curveToRelative(-2.52f, 0.0f, -4.85f, 0.45f, -7.0f, 1.34f)
                reflectiveCurveToRelative(-4.01f, 2.12f, -5.59f, 3.7f)
                curveToRelative(-1.58f, 1.58f, -2.81f, 3.45f, -3.7f, 5.61f)
                curveToRelative(-0.89f, 2.16f, -1.34f, 4.54f, -1.34f, 7.11f)
                curveToRelative(0.0f, 2.58f, 0.44f, 4.95f, 1.34f, 7.12f)
                curveToRelative(0.89f, 2.16f, 2.13f, 4.03f, 3.7f, 5.61f)
                curveToRelative(1.58f, 1.58f, 3.44f, 2.81f, 5.59f, 3.7f)
                curveToRelative(2.15f, 0.89f, 4.48f, 1.34f, 7.0f, 1.34f)
                curveToRelative(1.4f, 0.0f, 2.73f, -0.16f, 3.99f, -0.48f)
                arcToRelative(16.48f, 16.48f, 0.0f, false, false, 3.51f, -1.31f)
                arcToRelative(13.43f, 13.43f, 0.0f, false, false, 2.89f, -1.98f)
                arcTo(13.11f, 13.11f, 0.0f, false, false, 128.0f, 73.16f)
                lineToRelative(-2.82f, -2.01f)
                curveToRelative(-0.64f, 0.99f, -1.33f, 1.81f, -2.08f, 2.46f)
                arcToRelative(9.76f, 9.76f, 0.0f, false, true, -2.39f, 1.55f)
                curveToRelative(-0.84f, 0.38f, -1.7f, 0.65f, -2.58f, 0.81f)
                arcToRelative(14.76f, 14.76f, 0.0f, false, true, -2.65f, 0.24f)
                curveToRelative(-2.16f, 0.0f, -4.11f, -0.4f, -5.83f, -1.19f)
                curveToRelative(-1.72f, -0.8f, -3.17f, -1.86f, -4.37f, -3.2f)
                curveToRelative(-1.19f, -1.34f, -2.11f, -2.89f, -2.75f, -4.65f)
                arcToRelative(16.28f, 16.28f, 0.0f, false, true, -0.95f, -5.56f)
                curveToRelative(0.0f, -1.94f, 0.32f, -3.8f, 0.95f, -5.56f)
                curveToRelative(0.64f, -1.77f, 1.55f, -3.32f, 2.75f, -4.66f)
                curveToRelative(1.19f, -1.34f, 2.65f, -2.4f, 4.37f, -3.2f)
                curveToRelative(1.72f, -0.8f, 3.66f, -1.19f, 5.83f, -1.19f)
                curveToRelative(0.89f, 0.0f, 1.78f, 0.13f, 2.67f, 0.38f)
                curveToRelative(0.89f, 0.25f, 1.73f, 0.59f, 2.51f, 1.0f)
                curveToRelative(0.78f, 0.41f, 1.47f, 0.89f, 2.08f, 1.43f)
                curveToRelative(0.61f, 0.54f, 1.08f, 1.08f, 1.43f, 1.62f)
                lineToRelative(3.01f, -2.24f)
                curveToRelative(-1.5f, -1.91f, -3.29f, -3.28f, -5.39f, -4.11f)
                curveToRelative(-2.1f, -0.83f, -4.2f, -1.24f, -6.3f, -1.24f)
                close()
                moveTo(43.96f, 44.7f)
                lineTo(43.96f, 78.51f)
                horizontalLineToRelative(3.44f)
                lineTo(47.4f, 62.8f)
                horizontalLineToRelative(5.73f)
                lineToRelative(9.26f, 15.71f)
                horizontalLineToRelative(4.2f)
                lineToRelative(-9.74f, -16.04f)
                curveToRelative(2.8f, -0.25f, 4.94f, -1.19f, 6.42f, -2.79f)
                curveToRelative(1.48f, -1.61f, 2.22f, -3.59f, 2.22f, -5.94f)
                curveToRelative(0.0f, -3.02f, -1.0f, -5.28f, -2.98f, -6.78f)
                curveToRelative(-1.99f, -1.5f, -4.7f, -2.24f, -8.14f, -2.24f)
                close()
                moveTo(72.52f, 44.7f)
                lineTo(72.52f, 78.51f)
                horizontalLineToRelative(3.44f)
                lineTo(75.96f, 62.8f)
                horizontalLineToRelative(6.4f)
                curveToRelative(3.44f, 0.0f, 6.15f, -0.76f, 8.14f, -2.27f)
                curveToRelative(1.99f, -1.51f, 2.98f, -3.78f, 2.98f, -6.8f)
                reflectiveCurveToRelative(-0.99f, -5.28f, -2.98f, -6.78f)
                curveToRelative(-1.99f, -1.5f, -4.7f, -2.24f, -8.14f, -2.24f)
                close()
                moveTo(47.4f, 47.86f)
                horizontalLineToRelative(6.11f)
                curveToRelative(1.53f, 0.0f, 2.82f, 0.15f, 3.89f, 0.45f)
                curveToRelative(1.07f, 0.3f, 1.92f, 0.73f, 2.56f, 1.27f)
                curveToRelative(0.64f, 0.54f, 1.1f, 1.17f, 1.38f, 1.89f)
                curveToRelative(0.29f, 0.72f, 0.43f, 1.47f, 0.43f, 2.27f)
                curveToRelative(0.0f, 0.83f, -0.14f, 1.6f, -0.43f, 2.32f)
                arcToRelative(4.62f, 4.62f, 0.0f, false, true, -1.38f, 1.86f)
                curveToRelative(-0.64f, 0.52f, -1.49f, 0.95f, -2.56f, 1.27f)
                curveToRelative(-1.07f, 0.32f, -2.36f, 0.48f, -3.89f, 0.48f)
                horizontalLineToRelative(-6.11f)
                close()
                moveTo(75.96f, 47.86f)
                horizontalLineToRelative(5.54f)
                curveToRelative(1.53f, 0.0f, 2.82f, 0.15f, 3.89f, 0.45f)
                curveToRelative(1.07f, 0.3f, 1.92f, 0.73f, 2.56f, 1.27f)
                curveToRelative(0.64f, 0.54f, 1.1f, 1.17f, 1.38f, 1.89f)
                arcToRelative(6.05f, 6.05f, 0.0f, false, true, 0.43f, 2.27f)
                curveToRelative(0.0f, 0.83f, -0.14f, 1.6f, -0.43f, 2.32f)
                arcToRelative(4.62f, 4.62f, 0.0f, false, true, -1.38f, 1.86f)
                curveToRelative(-0.64f, 0.52f, -1.49f, 0.95f, -2.56f, 1.27f)
                curveToRelative(-1.07f, 0.32f, -2.36f, 0.48f, -3.89f, 0.48f)
                horizontalLineToRelative(-5.54f)
                close()
                moveTo(22.67f, 55.59f)
                curveToRelative(-1.65f, 0.0f, -3.18f, 0.29f, -4.56f, 0.88f)
                arcToRelative(10.66f, 10.66f, 0.0f, false, false, -3.58f, 2.46f)
                arcToRelative(11.66f, 11.66f, 0.0f, false, false, -2.36f, 3.67f)
                curveToRelative(-0.57f, 1.4f, -0.86f, 2.91f, -0.86f, 4.54f)
                curveToRelative(0.0f, 1.62f, 0.3f, 3.14f, 0.91f, 4.54f)
                arcToRelative(10.87f, 10.87f, 0.0f, false, false, 2.48f, 3.61f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, 3.7f, 2.36f)
                curveToRelative(1.42f, 0.57f, 2.94f, 0.86f, 4.56f, 0.86f)
                arcToRelative(11.49f, 11.49f, 0.0f, false, false, 4.63f, -0.95f)
                curveToRelative(1.46f, -0.64f, 2.7f, -1.72f, 3.72f, -3.25f)
                horizontalLineToRelative(0.09f)
                verticalLineToRelative(4.01f)
                curveToRelative(0.0f, 1.21f, -0.15f, 2.35f, -0.45f, 3.41f)
                arcToRelative(7.27f, 7.27f, 0.0f, false, true, -1.48f, 2.79f)
                curveToRelative(-0.69f, 0.8f, -1.58f, 1.42f, -2.7f, 1.89f)
                curveToRelative(-1.12f, 0.46f, -2.47f, 0.69f, -4.06f, 0.69f)
                curveToRelative(-1.81f, 0.0f, -3.46f, -0.37f, -4.94f, -1.12f)
                curveToRelative(-1.48f, -0.75f, -2.68f, -1.74f, -3.61f, -2.98f)
                lineToRelative(-2.34f, 2.48f)
                curveToRelative(1.43f, 1.53f, 3.03f, 2.66f, 4.78f, 3.39f)
                curveToRelative(1.75f, 0.73f, 3.74f, 1.1f, 5.97f, 1.1f)
                curveToRelative(2.51f, 0.0f, 4.55f, -0.38f, 6.11f, -1.14f)
                curveToRelative(1.56f, -0.76f, 2.78f, -1.72f, 3.65f, -2.87f)
                arcToRelative(9.55f, 9.55f, 0.0f, false, false, 1.77f, -3.77f)
                curveToRelative(0.3f, -1.37f, 0.45f, -2.66f, 0.45f, -3.87f)
                lineTo(34.56f, 56.16f)
                horizontalLineToRelative(-3.15f)
                verticalLineToRelative(3.72f)
                horizontalLineToRelative(-0.09f)
                curveToRelative(-0.64f, -0.86f, -1.32f, -1.57f, -2.05f, -2.13f)
                arcToRelative(10.46f, 10.46f, 0.0f, false, false, -2.22f, -1.31f)
                arcToRelative(10.06f, 10.06f, 0.0f, false, false, -2.24f, -0.67f)
                arcToRelative(12.75f, 12.75f, 0.0f, false, false, -2.12f, -0.19f)
                close()
                moveTo(23.05f, 58.46f)
                curveToRelative(1.3f, 0.0f, 2.48f, 0.23f, 3.53f, 0.69f)
                curveToRelative(1.05f, 0.46f, 1.94f, 1.08f, 2.67f, 1.86f)
                arcToRelative(7.97f, 7.97f, 0.0f, false, true, 1.67f, 2.72f)
                arcToRelative(9.51f, 9.51f, 0.0f, false, true, 0.57f, 3.32f)
                curveToRelative(0.03f, 1.3f, -0.17f, 2.48f, -0.6f, 3.53f)
                arcToRelative(7.61f, 7.61f, 0.0f, false, true, -1.84f, 2.7f)
                arcToRelative(8.66f, 8.66f, 0.0f, false, true, -2.74f, 1.74f)
                arcToRelative(8.72f, 8.72f, 0.0f, false, true, -3.27f, 0.62f)
                curveToRelative(-1.18f, 0.0f, -2.27f, -0.23f, -3.27f, -0.69f)
                arcToRelative(8.54f, 8.54f, 0.0f, false, true, -2.63f, -1.86f)
                arcToRelative(8.72f, 8.72f, 0.0f, false, true, -1.77f, -2.72f)
                arcToRelative(8.56f, 8.56f, 0.0f, false, true, -0.64f, -3.32f)
                curveToRelative(0.0f, -1.18f, 0.22f, -2.28f, 0.64f, -3.32f)
                arcToRelative(8.73f, 8.73f, 0.0f, false, true, 1.77f, -2.72f)
                arcToRelative(8.57f, 8.57f, 0.0f, false, true, 2.63f, -1.86f)
                curveToRelative(1.0f, -0.46f, 2.09f, -0.69f, 3.27f, -0.69f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
