package com.woowla.compose.icon.collections.devicons.devicons.dynamodb

import androidx.compose.ui.geometry.Offset
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
import com.woowla.compose.icon.collections.devicons.devicons.DynamodbGroup

public val DynamodbGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFF2E27AD), 1.0f to Color(0xFF527FFF), start =
                    Offset(-26.5f,154.5f), end = Offset(154.5f,-26.5f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(128.0f)
                horizontalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.74f, 21.27f)
                curveToRelative(-14.06f, 0.0f, -29.01f, 4.16f, -29.01f, 11.95f)
                verticalLineToRelative(13.74f)
                arcToRelative(6.93f, 6.93f, 0.0f, false, false, 2.58f, 5.04f)
                arcToRelative(6.95f, 6.95f, 0.0f, false, false, -2.58f, 5.12f)
                verticalLineToRelative(13.65f)
                arcToRelative(6.93f, 6.93f, 0.0f, false, false, 2.58f, 5.12f)
                arcTo(6.95f, 6.95f, 0.0f, false, false, 27.73f, 81.0f)
                verticalLineToRelative(13.65f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, 0.0f, 0.36f)
                curveToRelative(0.46f, 7.49f, 15.14f, 11.52f, 29.01f, 11.52f)
                curveToRelative(13.88f, 0.0f, 28.55f, -4.03f, 29.01f, -11.55f)
                arcToRelative(1.28f, 1.28f, 0.0f, false, false, 0.0f, -0.36f)
                lineTo(85.76f, 80.96f)
                arcToRelative(6.83f, 6.83f, 0.0f, false, false, -2.58f, -5.12f)
                arcToRelative(6.93f, 6.93f, 0.0f, false, false, 2.58f, -5.12f)
                verticalLineToRelative(-1.64f)
                lineToRelative(-11.28f, 11.26f)
                arcToRelative(27.7f, 27.7f, 0.0f, false, false, 5.84f, -2.37f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, 2.03f, 3.07f)
                curveToRelative(0.0f, 3.12f, -6.62f, 6.52f, -16.45f, 7.9f)
                arcToRelative(72.07f, 72.07f, 0.0f, false, true, -9.15f, 0.65f)
                lineTo(55.04f, 89.6f)
                curveToRelative(-13.79f, -0.32f, -23.89f, -4.68f, -23.89f, -8.53f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, 2.03f, -3.07f)
                curveToRelative(5.36f, 2.99f, 14.04f, 4.76f, 23.57f, 4.76f)
                horizontalLineToRelative(0.19f)
                lineToRelative(0.95f, -3.41f)
                horizontalLineToRelative(-1.14f)
                curveToRelative(-9.39f, 0.0f, -18.09f, -1.86f, -22.71f, -4.8f)
                curveToRelative(-1.84f, -1.21f, -2.87f, -2.52f, -2.89f, -3.67f)
                verticalLineToRelative(-7.9f)
                curveToRelative(5.22f, 3.99f, 15.63f, 6.08f, 25.6f, 6.08f)
                curveToRelative(1.35f, 0.0f, 2.7f, 0.0f, 4.01f, -0.12f)
                lineToRelative(0.97f, -3.41f)
                curveToRelative(-1.71f, 0.12f, -3.29f, 0.17f, -4.98f, 0.17f)
                curveToRelative(-14.64f, 0.0f, -25.6f, -4.49f, -25.6f, -8.53f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, 2.03f, -3.07f)
                curveToRelative(4.71f, 2.64f, 11.94f, 4.3f, 20.15f, 4.68f)
                lineToRelative(0.09f, -3.41f)
                curveToRelative(-8.07f, -0.39f, -15.36f, -2.13f, -19.39f, -4.71f)
                curveToRelative(-1.83f, -1.18f, -2.85f, -2.51f, -2.89f, -3.67f)
                verticalLineToRelative(-7.88f)
                curveToRelative(5.22f, 3.99f, 15.63f, 6.08f, 25.6f, 6.08f)
                horizontalLineToRelative(0.38f)
                lineToRelative(1.81f, -3.41f)
                horizontalLineToRelative(-2.19f)
                curveToRelative(-14.64f, 0.0f, -25.6f, -4.49f, -25.6f, -8.53f)
                curveToRelative(0.0f, -4.05f, 10.96f, -8.53f, 25.6f, -8.53f)
                arcToRelative(61.44f, 61.44f, 0.0f, false, true, 14.64f, 1.71f)
                horizontalLineToRelative(9.37f)
                curveToRelative(-5.12f, -3.12f, -13.96f, -5.12f, -24.01f, -5.12f)
                close()
                moveTo(69.54f, 29.78f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, -1.52f, 0.94f)
                lineTo(57.79f, 51.2f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, 1.52f, 2.53f)
                horizontalLineToRelative(9.66f)
                lineToRelative(-9.59f, 31.93f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, 0.78f, 1.96f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, 0.85f, 0.24f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, 1.32f, -0.58f)
                lineToRelative(37.55f, -39.25f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, -1.23f, -2.88f)
                horizontalLineToRelative(-9.57f)
                lineToRelative(4.37f, -13.13f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, -1.71f, -2.23f)
                close()
                moveTo(70.5f, 33.21f)
                horizontalLineToRelative(18.77f)
                lineToRelative(-4.37f, 13.11f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, 1.71f, 2.25f)
                horizontalLineToRelative(7.95f)
                lineToRelative(-29.88f, 31.23f)
                lineToRelative(8.21f, -27.31f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, -0.27f, -1.5f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, -1.37f, -0.68f)
                horizontalLineToRelative(-9.18f)
                close()
                moveTo(36.26f, 44.83f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, -2.13f, 2.13f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, 2.13f, 2.13f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, 2.13f, -2.13f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, -2.13f, -2.13f)
                close()
                moveTo(36.26f, 68.73f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, -2.13f, 2.13f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, 2.13f, 2.13f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, 2.13f, -2.13f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, -2.13f, -2.13f)
                close()
                moveTo(31.15f, 86.84f)
                curveToRelative(5.22f, 3.96f, 15.63f, 6.04f, 25.6f, 6.04f)
                curveToRelative(9.97f, 0.0f, 20.38f, -2.08f, 25.6f, -6.04f)
                verticalLineToRelative(7.85f)
                curveToRelative(0.0f, 4.03f, -10.96f, 8.53f, -25.6f, 8.53f)
                curveToRelative(-14.64f, 0.0f, -25.6f, -4.45f, -25.6f, -8.53f)
                close()
                moveTo(36.26f, 92.62f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, -2.13f, 2.13f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, 2.13f, 2.13f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, 2.13f, -2.13f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, -2.13f, -2.13f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
