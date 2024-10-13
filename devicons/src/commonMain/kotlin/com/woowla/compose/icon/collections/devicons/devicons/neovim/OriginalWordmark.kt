package com.woowla.compose.icon.collections.devicons.devicons.neovim

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.NeovimGroup

public val NeovimGroup.OriginalWordmark: ImageVector
    get() {
        if (_originalWordmark != null) {
            return _originalWordmark!!
        }
        _originalWordmark = Builder(name = "OriginalWordmark", defaultWidth = 128.0.dp,
                defaultHeight = 128.0.dp, viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xCC16B0ED), 1.0f to Color(0xD40F59B2), start =
                    Offset(3.91f,45.58f), end = Offset(3.91f,82.41f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(-0.0f, 53.5f)
                lineTo(7.83f, 45.58f)
                lineToRelative(0.0f, 36.83f)
                lineToRelative(-7.83f, -7.83f)
                close()
                moveTo(-0.0f, 53.5f)
            }
            path(fill = linearGradient(0.0f to Color(0xFF7DB643), 1.0f to Color(0xFF367533), start =
                    Offset(26.31f,45.58f), end = Offset(26.31f,82.41f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(30.25f, 53.57f)
                lineTo(22.31f, 45.58f)
                lineToRelative(0.16f, 36.83f)
                lineToRelative(7.83f, -7.83f)
                close()
                moveTo(30.25f, 53.57f)
            }
            path(fill = linearGradient(0.0f to Color(0xCC88C649), 1.0f to Color(0xD6439240), start =
                    Offset(15.15f,45.58f), end = Offset(15.15f,82.42f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveToRelative(7.82f, 45.58f)
                lineToRelative(20.35f, 31.13f)
                lineToRelative(-5.7f, 5.71f)
                lineTo(2.12f, 51.36f)
                close()
                moveTo(7.82f, 45.58f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.129412f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveToRelative(7.83f, 60.02f)
                lineToRelative(-0.01f, 1.23f)
                lineToRelative(-6.28f, -9.3f)
                lineToRelative(0.58f, -0.59f)
                close()
                moveTo(7.83f, 60.02f)
            }
            path(fill = SolidColor(Color(0xFF424242)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(39.14f, 72.17f)
                lineTo(39.14f, 56.62f)
                horizontalLineToRelative(0.8f)
                curveToRelative(0.27f, 0.0f, 0.42f, 0.13f, 0.47f, 0.39f)
                lineToRelative(0.14f, 2.34f)
                arcToRelative(8.69f, 8.69f, 0.0f, false, true, 2.46f, -2.16f)
                curveToRelative(0.93f, -0.55f, 1.98f, -0.82f, 3.13f, -0.82f)
                curveToRelative(0.85f, 0.0f, 1.59f, 0.14f, 2.24f, 0.41f)
                curveToRelative(0.64f, 0.27f, 1.18f, 0.66f, 1.6f, 1.17f)
                curveToRelative(0.42f, 0.51f, 0.75f, 1.13f, 0.96f, 1.84f)
                curveToRelative(0.22f, 0.72f, 0.33f, 1.53f, 0.33f, 2.44f)
                verticalLineToRelative(9.94f)
                horizontalLineToRelative(-1.48f)
                verticalLineToRelative(-9.94f)
                curveToRelative(0.0f, -1.46f, -0.33f, -2.6f, -0.99f, -3.43f)
                curveToRelative(-0.66f, -0.83f, -1.67f, -1.24f, -3.04f, -1.24f)
                arcToRelative(5.36f, 5.36f, 0.0f, false, false, -2.82f, 0.79f)
                curveToRelative(-0.87f, 0.53f, -1.64f, 1.25f, -2.33f, 2.16f)
                verticalLineToRelative(11.66f)
                close()
                moveTo(60.55f, 56.37f)
                curveToRelative(0.88f, 0.0f, 1.69f, 0.15f, 2.44f, 0.45f)
                curveToRelative(0.75f, 0.3f, 1.4f, 0.74f, 1.95f, 1.32f)
                curveToRelative(0.55f, 0.58f, 0.98f, 1.29f, 1.29f, 2.13f)
                curveToRelative(0.31f, 0.84f, 0.46f, 1.81f, 0.46f, 2.9f)
                curveToRelative(0.0f, 0.23f, -0.03f, 0.38f, -0.1f, 0.47f)
                curveToRelative(-0.07f, 0.08f, -0.17f, 0.12f, -0.32f, 0.12f)
                lineTo(55.01f, 63.76f)
                verticalLineToRelative(0.3f)
                curveToRelative(0.0f, 1.16f, 0.13f, 2.19f, 0.41f, 3.07f)
                curveToRelative(0.27f, 0.89f, 0.65f, 1.63f, 1.16f, 2.22f)
                arcToRelative(4.82f, 4.82f, 0.0f, false, false, 1.82f, 1.35f)
                curveToRelative(0.71f, 0.3f, 1.5f, 0.45f, 2.38f, 0.45f)
                curveToRelative(0.79f, 0.0f, 1.46f, -0.09f, 2.04f, -0.25f)
                arcToRelative(7.82f, 7.82f, 0.0f, false, false, 1.45f, -0.58f)
                curveToRelative(0.39f, -0.22f, 0.7f, -0.41f, 0.93f, -0.58f)
                curveToRelative(0.23f, -0.17f, 0.4f, -0.25f, 0.5f, -0.25f)
                arcToRelative(0.36f, 0.36f, 0.0f, false, true, 0.31f, 0.16f)
                lineToRelative(0.41f, 0.5f)
                curveToRelative(-0.25f, 0.31f, -0.58f, 0.6f, -1.0f, 0.88f)
                arcToRelative(7.1f, 7.1f, 0.0f, false, true, -1.38f, 0.69f)
                curveToRelative(-0.51f, 0.19f, -1.05f, 0.34f, -1.63f, 0.46f)
                arcToRelative(9.09f, 9.09f, 0.0f, false, true, -1.75f, 0.17f)
                curveToRelative(-1.07f, 0.0f, -2.04f, -0.19f, -2.91f, -0.56f)
                arcToRelative(6.19f, 6.19f, 0.0f, false, true, -2.26f, -1.61f)
                curveToRelative(-0.63f, -0.71f, -1.11f, -1.57f, -1.46f, -2.6f)
                curveToRelative(-0.34f, -1.02f, -0.51f, -2.2f, -0.51f, -3.52f)
                curveToRelative(0.0f, -1.11f, 0.16f, -2.14f, 0.48f, -3.08f)
                curveToRelative(0.32f, -0.94f, 0.78f, -1.75f, 1.38f, -2.43f)
                arcToRelative(6.31f, 6.31f, 0.0f, false, true, 2.21f, -1.6f)
                curveToRelative(0.87f, -0.38f, 1.86f, -0.58f, 2.97f, -0.58f)
                close()
                moveTo(60.65f, 57.41f)
                curveToRelative(-0.81f, 0.0f, -1.54f, 0.12f, -2.18f, 0.36f)
                arcToRelative(4.84f, 4.84f, 0.0f, false, false, -1.67f, 1.05f)
                arcToRelative(5.36f, 5.36f, 0.0f, false, false, -1.14f, 1.64f)
                arcToRelative(7.28f, 7.28f, 0.0f, false, false, -0.58f, 2.15f)
                horizontalLineToRelative(10.39f)
                curveToRelative(0.0f, -0.81f, -0.11f, -1.54f, -0.35f, -2.18f)
                arcToRelative(4.59f, 4.59f, 0.0f, false, false, -0.98f, -1.64f)
                arcToRelative(4.32f, 4.32f, 0.0f, false, false, -1.52f, -1.03f)
                curveToRelative(-0.59f, -0.24f, -1.24f, -0.36f, -1.97f, -0.36f)
                close()
                moveTo(75.26f, 56.37f)
                curveToRelative(1.13f, 0.0f, 2.15f, 0.19f, 3.04f, 0.57f)
                arcToRelative(6.15f, 6.15f, 0.0f, false, true, 2.26f, 1.61f)
                curveToRelative(0.61f, 0.7f, 1.08f, 1.54f, 1.4f, 2.52f)
                curveToRelative(0.32f, 0.99f, 0.48f, 2.08f, 0.48f, 3.3f)
                curveToRelative(0.0f, 1.22f, -0.16f, 2.31f, -0.48f, 3.29f)
                curveToRelative(-0.32f, 0.98f, -0.79f, 1.81f, -1.4f, 2.51f)
                arcToRelative(6.09f, 6.09f, 0.0f, false, true, -2.26f, 1.61f)
                curveToRelative(-0.89f, 0.38f, -1.9f, 0.56f, -3.03f, 0.56f)
                curveToRelative(-1.13f, 0.0f, -2.14f, -0.19f, -3.03f, -0.56f)
                arcToRelative(6.15f, 6.15f, 0.0f, false, true, -2.27f, -1.61f)
                curveToRelative(-0.62f, -0.7f, -1.09f, -1.53f, -1.41f, -2.51f)
                curveToRelative(-0.32f, -0.98f, -0.48f, -2.08f, -0.48f, -3.29f)
                curveToRelative(0.0f, -1.22f, 0.16f, -2.31f, 0.48f, -3.3f)
                curveToRelative(0.32f, -0.98f, 0.79f, -1.82f, 1.41f, -2.52f)
                arcToRelative(6.22f, 6.22f, 0.0f, false, true, 2.27f, -1.61f)
                curveToRelative(0.89f, -0.38f, 1.9f, -0.57f, 3.03f, -0.57f)
                close()
                moveTo(75.18f, 71.3f)
                curveToRelative(0.93f, 0.0f, 1.73f, -0.16f, 2.42f, -0.48f)
                arcToRelative(4.57f, 4.57f, 0.0f, false, false, 1.73f, -1.37f)
                curveToRelative(0.46f, -0.6f, 0.81f, -1.31f, 1.03f, -2.16f)
                curveToRelative(0.23f, -0.84f, 0.34f, -1.79f, 0.34f, -2.83f)
                curveToRelative(0.0f, -1.04f, -0.12f, -1.98f, -0.34f, -2.82f)
                curveToRelative(-0.23f, -0.85f, -0.57f, -1.57f, -1.03f, -2.18f)
                arcToRelative(4.65f, 4.65f, 0.0f, false, false, -1.73f, -1.39f)
                curveToRelative(-0.69f, -0.32f, -1.5f, -0.49f, -2.42f, -0.49f)
                curveToRelative(-0.92f, 0.0f, -1.73f, 0.17f, -2.42f, 0.49f)
                arcToRelative(4.67f, 4.67f, 0.0f, false, false, -1.73f, 1.39f)
                curveToRelative(-0.46f, 0.6f, -0.81f, 1.33f, -1.04f, 2.18f)
                curveToRelative(-0.23f, 0.85f, -0.35f, 1.79f, -0.35f, 2.82f)
                curveToRelative(0.0f, 1.04f, 0.12f, 1.99f, 0.35f, 2.83f)
                curveToRelative(0.23f, 0.84f, 0.58f, 1.56f, 1.04f, 2.16f)
                arcToRelative(4.59f, 4.59f, 0.0f, false, false, 1.73f, 1.37f)
                curveToRelative(0.69f, 0.32f, 1.5f, 0.48f, 2.42f, 0.48f)
                close()
                moveTo(91.72f, 71.82f)
                horizontalLineToRelative(-3.47f)
                lineToRelative(-6.32f, -15.97f)
                horizontalLineToRelative(3.18f)
                curveToRelative(0.28f, 0.0f, 0.51f, 0.07f, 0.71f, 0.2f)
                curveToRelative(0.19f, 0.14f, 0.32f, 0.31f, 0.4f, 0.51f)
                lineToRelative(3.07f, 8.53f)
                curveToRelative(0.18f, 0.5f, 0.32f, 0.99f, 0.44f, 1.46f)
                curveToRelative(0.12f, 0.48f, 0.22f, 0.96f, 0.32f, 1.43f)
                curveToRelative(0.09f, -0.47f, 0.2f, -0.95f, 0.32f, -1.43f)
                curveToRelative(0.12f, -0.47f, 0.27f, -0.96f, 0.46f, -1.46f)
                lineToRelative(3.15f, -8.53f)
                curveToRelative(0.07f, -0.21f, 0.2f, -0.38f, 0.39f, -0.51f)
                curveToRelative(0.18f, -0.13f, 0.41f, -0.2f, 0.67f, -0.2f)
                horizontalLineToRelative(3.02f)
                close()
                moveTo(98.9f, 56.02f)
                horizontalLineToRelative(3.98f)
                verticalLineToRelative(15.97f)
                horizontalLineToRelative(-3.98f)
                close()
                moveTo(105.48f, 71.99f)
                lineTo(105.48f, 55.93f)
                horizontalLineToRelative(2.36f)
                curveToRelative(0.5f, 0.0f, 0.83f, 0.24f, 0.99f, 0.71f)
                lineToRelative(0.25f, 1.19f)
                curveToRelative(0.28f, -0.31f, 0.58f, -0.6f, 0.88f, -0.86f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 2.11f, -1.12f)
                curveToRelative(0.4f, -0.11f, 0.84f, -0.17f, 1.32f, -0.17f)
                curveToRelative(1.01f, 0.0f, 1.84f, 0.28f, 2.49f, 0.82f)
                curveToRelative(0.65f, 0.55f, 1.14f, 1.27f, 1.46f, 2.18f)
                curveToRelative(0.25f, -0.53f, 0.56f, -0.99f, 0.94f, -1.37f)
                curveToRelative(0.37f, -0.38f, 0.78f, -0.69f, 1.23f, -0.93f)
                arcToRelative(5.81f, 5.81f, 0.0f, false, true, 1.43f, -0.53f)
                arcToRelative(6.91f, 6.91f, 0.0f, false, true, 1.52f, -0.17f)
                curveToRelative(0.89f, 0.0f, 1.67f, 0.14f, 2.36f, 0.41f)
                arcToRelative(4.51f, 4.51f, 0.0f, false, true, 1.73f, 1.19f)
                curveToRelative(0.47f, 0.52f, 0.83f, 1.16f, 1.07f, 1.91f)
                curveToRelative(0.24f, 0.75f, 0.37f, 1.61f, 0.37f, 2.59f)
                verticalLineToRelative(10.23f)
                horizontalLineToRelative(-3.86f)
                lineTo(124.14f, 61.77f)
                curveToRelative(0.0f, -1.02f, -0.23f, -1.8f, -0.67f, -2.31f)
                curveToRelative(-0.45f, -0.52f, -1.1f, -0.78f, -1.97f, -0.78f)
                curveToRelative(-0.4f, 0.0f, -0.76f, 0.07f, -1.1f, 0.2f)
                arcToRelative(2.67f, 2.67f, 0.0f, false, false, -0.89f, 0.59f)
                arcToRelative(2.67f, 2.67f, 0.0f, false, false, -0.6f, 0.96f)
                curveToRelative(-0.15f, 0.39f, -0.22f, 0.83f, -0.22f, 1.33f)
                verticalLineToRelative(10.23f)
                horizontalLineToRelative(-3.88f)
                lineTo(114.81f, 61.77f)
                curveToRelative(0.0f, -1.07f, -0.22f, -1.86f, -0.65f, -2.35f)
                curveToRelative(-0.43f, -0.49f, -1.07f, -0.74f, -1.91f, -0.74f)
                curveToRelative(-0.55f, 0.0f, -1.07f, 0.14f, -1.56f, 0.42f)
                arcToRelative(5.23f, 5.23f, 0.0f, false, false, -1.35f, 1.13f)
                verticalLineToRelative(11.76f)
                close()
                moveTo(98.9f, 50.64f)
                horizontalLineToRelative(3.98f)
                verticalLineToRelative(3.3f)
                horizontalLineToRelative(-3.98f)
                close()
                moveTo(98.9f, 50.64f)
            }
        }
        .build()
        return _originalWordmark!!
    }

private var _originalWordmark: ImageVector? = null
