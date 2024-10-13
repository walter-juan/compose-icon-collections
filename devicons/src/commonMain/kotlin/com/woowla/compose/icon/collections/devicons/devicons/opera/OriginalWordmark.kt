package com.woowla.compose.icon.collections.devicons.devicons.opera

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
import com.woowla.compose.icon.collections.devicons.devicons.OperaGroup

public val OperaGroup.OriginalWordmark: ImageVector
    get() {
        if (_originalWordmark != null) {
            return _originalWordmark!!
        }
        _originalWordmark = Builder(name = "OriginalWordmark", defaultWidth = 128.0.dp,
                defaultHeight = 128.0.dp, viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFFFF1B2D), 0.61f to Color(0xFFFF1B2D), 1.0f
                    to Color(0xFFA70014), start = Offset(19.51f,42.81f), end =
                    Offset(19.51f,85.86f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.41f, 42.09f)
                curveTo(10.48f, 42.09f, 0.0f, 52.03f, 0.0f, 64.3f)
                curveToRelative(0.0f, 11.91f, 9.88f, 21.63f, 22.3f, 22.18f)
                curveToRelative(0.37f, 0.02f, 0.74f, 0.03f, 1.11f, 0.03f)
                curveToRelative(6.0f, 0.0f, 11.46f, -2.14f, 15.6f, -5.65f)
                arcToRelative(17.54f, 17.54f, 0.0f, false, true, -9.38f, 2.72f)
                curveToRelative(-5.58f, 0.0f, -10.57f, -2.63f, -13.93f, -6.77f)
                curveToRelative(-2.59f, -2.9f, -4.27f, -7.18f, -4.38f, -11.99f)
                lineTo(11.32f, 63.77f)
                curveToRelative(0.12f, -4.81f, 1.79f, -9.09f, 4.38f, -11.99f)
                curveToRelative(3.36f, -4.14f, 8.35f, -6.76f, 13.93f, -6.76f)
                curveToRelative(3.43f, 0.0f, 6.64f, 0.99f, 9.38f, 2.71f)
                curveTo(34.89f, 44.24f, 29.46f, 42.11f, 23.5f, 42.09f)
                horizontalLineToRelative(-0.09f)
                close()
                moveTo(23.41f, 42.09f)
            }
            path(fill = linearGradient(0.0f to Color(0xFF9C0000), 0.7f to Color(0xFFFF4B4B), start =
                    Offset(31.26f,45.35f), end = Offset(31.26f,83.42f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.71f, 51.78f)
                curveToRelative(2.15f, -2.41f, 4.92f, -3.86f, 7.95f, -3.86f)
                curveTo(30.48f, 47.92f, 36.0f, 55.25f, 36.0f, 64.3f)
                curveToRelative(0.0f, 9.04f, -5.53f, 16.37f, -12.34f, 16.37f)
                curveToRelative(-3.03f, 0.0f, -5.8f, -1.45f, -7.95f, -3.86f)
                curveToRelative(3.36f, 4.14f, 8.35f, 6.76f, 13.93f, 6.76f)
                arcToRelative(17.53f, 17.53f, 0.0f, false, false, 9.38f, -2.72f)
                curveToRelative(4.79f, -4.07f, 7.81f, -9.97f, 7.81f, -16.56f)
                reflectiveCurveToRelative(-3.02f, -12.49f, -7.81f, -16.56f)
                arcToRelative(17.52f, 17.52f, 0.0f, false, false, -9.38f, -2.72f)
                curveToRelative(-5.57f, 0.0f, -10.57f, 2.62f, -13.93f, 6.76f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(83.08f, 73.5f)
                curveToRelative(-2.95f, 0.0f, -5.36f, -2.51f, -5.36f, -5.59f)
                reflectiveCurveToRelative(2.4f, -5.59f, 5.36f, -5.59f)
                reflectiveCurveToRelative(5.35f, 2.51f, 5.35f, 5.59f)
                reflectiveCurveToRelative(-2.4f, 5.59f, -5.35f, 5.59f)
                moveToRelative(0.0f, -12.72f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -5.07f, 2.39f)
                verticalLineToRelative(-2.07f)
                lineTo(76.36f, 61.11f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(1.65f)
                verticalLineToRelative(-6.46f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, false, 5.07f, 2.4f)
                curveToRelative(3.85f, 0.0f, 6.98f, -3.2f, 6.98f, -7.13f)
                reflectiveCurveToRelative(-3.13f, -7.13f, -6.98f, -7.13f)
                moveTo(64.69f, 73.93f)
                curveToRelative(-4.65f, 0.0f, -8.43f, -3.79f, -8.43f, -8.45f)
                reflectiveCurveToRelative(3.78f, -8.45f, 8.43f, -8.45f)
                reflectiveCurveToRelative(8.43f, 3.79f, 8.43f, 8.45f)
                reflectiveCurveToRelative(-3.78f, 8.45f, -8.43f, 8.45f)
                moveToRelative(0.0f, -18.4f)
                curveToRelative(-5.52f, 0.0f, -10.0f, 4.46f, -10.0f, 9.95f)
                reflectiveCurveToRelative(4.49f, 9.95f, 10.0f, 9.95f)
                reflectiveCurveToRelative(10.0f, -4.47f, 10.0f, -9.95f)
                reflectiveCurveToRelative(-4.49f, -9.95f, -10.0f, -9.95f)
                moveToRelative(48.47f, 5.31f)
                arcToRelative(3.89f, 3.89f, 0.0f, false, false, -1.61f, 0.41f)
                curveToRelative(-1.05f, 0.54f, -1.78f, 1.35f, -2.25f, 2.39f)
                lineToRelative(-0.04f, 0.08f)
                lineToRelative(-0.02f, -2.52f)
                horizontalLineToRelative(-1.65f)
                verticalLineToRelative(13.48f)
                horizontalLineToRelative(1.66f)
                verticalLineToRelative(-7.07f)
                curveToRelative(0.0f, -1.0f, 0.16f, -1.8f, 0.51f, -2.59f)
                curveToRelative(0.32f, -0.73f, 0.76f, -1.38f, 1.4f, -1.89f)
                arcToRelative(3.21f, 3.21f, 0.0f, false, true, 2.59f, -0.73f)
                lineToRelative(0.48f, 0.09f)
                curveToRelative(0.09f, -0.45f, 0.32f, -1.02f, 0.41f, -1.47f)
                arcToRelative(5.35f, 5.35f, 0.0f, false, false, -1.48f, -0.18f)
                moveToRelative(-14.64f, 1.51f)
                curveToRelative(2.92f, 0.0f, 4.96f, 1.87f, 5.3f, 4.72f)
                lineTo(93.25f, 67.07f)
                curveToRelative(0.4f, -2.67f, 2.61f, -4.72f, 5.28f, -4.72f)
                moveToRelative(0.0f, -1.54f)
                curveToRelative(-3.85f, 0.0f, -6.98f, 3.2f, -6.98f, 7.13f)
                reflectiveCurveToRelative(3.13f, 7.13f, 6.98f, 7.13f)
                curveToRelative(2.76f, 0.0f, 5.14f, -1.63f, 6.28f, -4.0f)
                lineToRelative(-1.42f, -0.79f)
                curveToRelative(-0.85f, 1.92f, -2.71f, 3.25f, -4.86f, 3.25f)
                curveToRelative(-2.79f, 0.0f, -5.08f, -2.24f, -5.33f, -5.08f)
                horizontalLineToRelative(12.3f)
                lineToRelative(0.02f, -0.5f)
                curveToRelative(0.0f, -4.2f, -2.88f, -7.13f, -6.99f, -7.13f)
                moveToRelative(22.75f, 12.69f)
                curveToRelative(-2.95f, 0.0f, -5.36f, -2.51f, -5.36f, -5.59f)
                reflectiveCurveToRelative(2.4f, -5.59f, 5.36f, -5.59f)
                reflectiveCurveToRelative(5.36f, 2.51f, 5.36f, 5.59f)
                reflectiveCurveToRelative(-2.4f, 5.59f, -5.36f, 5.59f)
                moveToRelative(5.07f, -12.39f)
                verticalLineToRelative(2.07f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -5.07f, -2.39f)
                curveToRelative(-3.85f, 0.0f, -6.98f, 3.2f, -6.98f, 7.13f)
                reflectiveCurveToRelative(3.13f, 7.13f, 6.98f, 7.13f)
                arcToRelative(6.49f, 6.49f, 0.0f, false, false, 5.07f, -2.4f)
                verticalLineToRelative(2.03f)
                lineTo(128.0f, 74.68f)
                verticalLineToRelative(-13.57f)
                close()
                moveTo(126.35f, 61.11f)
            }
        }
        .build()
        return _originalWordmark!!
    }

private var _originalWordmark: ImageVector? = null
