package com.woowla.compose.icon.collections.devicons.devicons.prolog

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
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
import com.woowla.compose.icon.collections.devicons.devicons.PrologGroup

public val PrologGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = radialGradient(0.0f to Color(0xFFFFFFFF), 0.18f to Color(0xFFFBFBFB), 0.36f
                    to Color(0xFFEFEFF0), 0.55f to Color(0xFFDADBDC), 0.74f to Color(0xFFBEBFC2),
                    0.82f to Color(0xFFAEB0B3), center = Offset(36.53f,46.15f), radius = 83.65f),
                    stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                    Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(107.04f, 111.36f)
                curveToRelative(26.16f, -23.77f, 28.09f, -64.25f, 4.32f, -90.41f)
                curveTo(87.59f, -5.2f, 47.11f, -7.14f, 20.96f, 16.64f)
                curveToRelative(-26.16f, 23.77f, -28.09f, 64.25f, -4.32f, 90.41f)
                curveToRelative(23.77f, 26.16f, 64.25f, 28.09f, 90.41f, 4.32f)
                close()
            }
            path(fill = radialGradient(0.0f to Color(0xFFFAFDFF), 0.08f to Color(0xFFEEF5FA), 0.22f
                    to Color(0xFFCFDFEC), 0.41f to Color(0xFF9DBBD5), 0.63f to Color(0xFF588AB5),
                    0.74f to Color(0xFF326FA4), 0.8f to Color(0xFF2B6698), 0.9f to
                    Color(0xFF174E78), 0.99f to Color(0xFF003152), center = Offset(15.98f,49.02f),
                    radius = 74.85f), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(81.8f, 20.16f)
                curveTo(73.67f, 13.14f, 63.3f, 9.35f, 52.62f, 9.52f)
                curveToRelative(-21.88f, 0.0f, -43.38f, 16.97f, -45.04f, 50.0f)
                curveToRelative(-1.79f, 35.48f, 21.32f, 58.51f, 53.87f, 58.51f)
                curveToRelative(48.18f, 0.0f, 74.84f, -44.49f, 45.01f, -92.74f)
                curveToRelative(20.97f, 48.22f, -2.37f, 78.6f, -32.48f, 78.6f)
                curveToRelative(-24.42f, 0.0f, -43.14f, -16.61f, -43.14f, -47.06f)
                curveToRelative(-0.02f, -43.94f, 32.49f, -46.99f, 50.96f, -36.66f)
                close()
            }
            path(fill = radialGradient(0.0f to Color(0xFFFFD540), 0.67f to Color(0xFFEC1C24), 0.99f
                    to Color(0xFF760000), center = Offset(42.55f,46.24f), radius = 74.25f), stroke =
                    null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(93.82f, 38.48f)
                curveToRelative(-1.31f, -4.27f, -2.89f, -12.68f, 2.84f, -17.55f)
                arcToRelative(16.44f, 16.44f, 0.0f, false, false, -9.64f, 0.84f)
                arcToRelative(16.74f, 16.74f, 0.0f, false, false, -7.56f, 6.13f)
                arcToRelative(40.46f, 40.46f, 0.0f, false, false, -16.76f, -3.61f)
                arcToRelative(40.46f, 40.46f, 0.0f, false, false, -16.75f, 3.66f)
                arcToRelative(16.74f, 16.74f, 0.0f, false, false, -7.56f, -6.17f)
                arcToRelative(16.44f, 16.44f, 0.0f, false, false, -9.66f, -0.86f)
                curveToRelative(5.86f, 5.0f, 4.07f, 13.66f, 2.75f, 17.83f)
                curveToRelative(-7.73f, 8.82f, -11.98f, 20.23f, -11.93f, 32.03f)
                curveToRelative(0.0f, 9.88f, 6.26f, 21.12f, 7.49f, 36.17f)
                lineToRelative(7.91f, -6.97f)
                arcToRelative(51.86f, 51.86f, 0.0f, false, false, 27.8f, 6.51f)
                arcToRelative(51.86f, 51.86f, 0.0f, false, false, 27.79f, -6.51f)
                lineToRelative(7.91f, 6.97f)
                curveToRelative(1.25f, -15.05f, 7.49f, -26.28f, 7.49f, -36.17f)
                curveToRelative(0.07f, -11.93f, -4.26f, -23.46f, -12.13f, -32.32f)
                close()
            }
            path(fill = radialGradient(0.0f to Color(0xFFDDDFE0), 0.17f to Color(0xFFD9DBDC), 0.35f
                    to Color(0xFFCDCFD0), 0.53f to Color(0xFFB8BABB), 0.71f to Color(0xFF9C9E9F),
                    0.89f to Color(0xFF78797B), 1.0f to Color(0xFF5E5F61), center =
                    Offset(48.17f,110.49f), radius = 9.84f), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.78f, 118.23f)
                arcToRelative(6.84f, 6.84f, 0.0f, false, true, 0.5f, -2.84f)
                arcToRelative(7.17f, 7.17f, 0.0f, false, true, 1.64f, -2.43f)
                arcToRelative(7.68f, 7.68f, 0.0f, false, true, 2.52f, -1.63f)
                arcToRelative(8.06f, 8.06f, 0.0f, false, true, 2.99f, -0.57f)
                curveToRelative(1.03f, 0.0f, 2.04f, 0.19f, 2.99f, 0.57f)
                arcToRelative(7.68f, 7.68f, 0.0f, false, true, 2.52f, 1.63f)
                arcToRelative(7.17f, 7.17f, 0.0f, false, true, 1.64f, 2.42f)
                arcToRelative(6.84f, 6.84f, 0.0f, false, true, 0.5f, 2.84f)
                verticalLineToRelative(0.24f)
                arcToRelative(9.69f, 9.69f, 0.0f, false, false, 2.54f, -5.19f)
                arcToRelative(9.43f, 9.43f, 0.0f, false, false, -0.92f, -5.65f)
                curveToRelative(-0.89f, -1.76f, -2.3f, -3.23f, -4.07f, -4.24f)
                arcToRelative(11.06f, 11.06f, 0.0f, false, false, -5.88f, -1.43f)
                curveToRelative(-2.06f, 0.08f, -4.06f, 0.72f, -5.74f, 1.86f)
                curveToRelative(-1.68f, 1.13f, -2.97f, 2.71f, -3.7f, 4.53f)
                arcToRelative(9.4f, 9.4f, 0.0f, false, false, -0.44f, 5.7f)
                curveToRelative(0.45f, 1.9f, 1.48f, 3.64f, 2.96f, 4.99f)
                arcToRelative(4.98f, 4.98f, 0.0f, false, true, -0.06f, -0.8f)
                close()
            }
            path(fill = radialGradient(0.0f to Color(0xFFDDDFE0), 0.17f to Color(0xFFD9DBDC), 0.35f
                    to Color(0xFFCDCFD0), 0.53f to Color(0xFFB8BABB), 0.71f to Color(0xFF9C9E9F),
                    0.89f to Color(0xFF78797B), 1.0f to Color(0xFF5E5F61), center =
                    Offset(77.32f,110.49f), radius = 9.84f), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(84.71f, 118.23f)
                arcToRelative(6.84f, 6.84f, 0.0f, false, false, -0.5f, -2.84f)
                arcToRelative(7.17f, 7.17f, 0.0f, false, false, -1.64f, -2.43f)
                arcToRelative(7.68f, 7.68f, 0.0f, false, false, -2.52f, -1.63f)
                arcToRelative(8.06f, 8.06f, 0.0f, false, false, -2.99f, -0.57f)
                arcToRelative(8.06f, 8.06f, 0.0f, false, false, -2.99f, 0.57f)
                arcToRelative(7.68f, 7.68f, 0.0f, false, false, -2.52f, 1.63f)
                arcToRelative(7.17f, 7.17f, 0.0f, false, false, -1.64f, 2.42f)
                arcToRelative(6.83f, 6.83f, 0.0f, false, false, -0.5f, 2.84f)
                verticalLineToRelative(0.24f)
                arcToRelative(9.69f, 9.69f, 0.0f, false, true, -2.54f, -5.19f)
                arcToRelative(9.43f, 9.43f, 0.0f, false, true, 0.92f, -5.65f)
                curveToRelative(0.89f, -1.76f, 2.3f, -3.23f, 4.07f, -4.24f)
                arcToRelative(11.06f, 11.06f, 0.0f, false, true, 5.88f, -1.43f)
                curveToRelative(2.06f, 0.08f, 4.06f, 0.72f, 5.74f, 1.86f)
                curveToRelative(1.68f, 1.13f, 2.97f, 2.71f, 3.7f, 4.53f)
                arcToRelative(9.4f, 9.4f, 0.0f, false, true, 0.45f, 5.7f)
                arcToRelative(9.8f, 9.8f, 0.0f, false, true, -2.96f, 4.99f)
                arcToRelative(6.84f, 6.84f, 0.0f, false, false, 0.06f, -0.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, fillAlpha = 0.53f, strokeAlpha
                    = 0.53f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(29.45f, 74.68f)
                curveToRelative(-0.6f, 3.03f, -4.41f, 3.99f, -4.41f, 3.99f)
                arcToRelative(6.18f, 6.18f, 0.0f, false, true, -2.57f, -5.35f)
                arcToRelative(13.32f, 13.32f, 0.0f, false, false, 2.01f, 8.15f)
                arcToRelative(13.31f, 13.31f, 0.0f, false, false, 4.97f, -6.79f)
                close()
                moveTo(37.01f, 76.22f)
                curveToRelative(-0.6f, 3.03f, -4.42f, 3.99f, -4.42f, 3.99f)
                arcToRelative(6.18f, 6.18f, 0.0f, false, true, -2.57f, -5.38f)
                arcToRelative(13.32f, 13.32f, 0.0f, false, false, 2.02f, 8.15f)
                arcToRelative(13.31f, 13.31f, 0.0f, false, false, 4.97f, -6.77f)
                close()
                moveTo(31.67f, 83.09f)
                curveToRelative(-0.6f, 3.03f, -4.41f, 3.99f, -4.41f, 3.99f)
                arcToRelative(6.18f, 6.18f, 0.0f, false, true, -2.56f, -5.38f)
                arcToRelative(13.32f, 13.32f, 0.0f, false, false, 2.02f, 8.15f)
                arcToRelative(13.3f, 13.3f, 0.0f, false, false, 4.95f, -6.77f)
                close()
                moveTo(39.25f, 84.61f)
                curveToRelative(-0.6f, 3.03f, -4.41f, 3.99f, -4.41f, 3.99f)
                arcToRelative(6.18f, 6.18f, 0.0f, false, true, -2.57f, -5.38f)
                arcToRelative(13.32f, 13.32f, 0.0f, false, false, 1.99f, 8.16f)
                arcToRelative(13.31f, 13.31f, 0.0f, false, false, 5.0f, -6.77f)
                close()
                moveTo(33.92f, 91.6f)
                curveToRelative(-0.6f, 3.03f, -4.42f, 3.99f, -4.42f, 3.99f)
                arcToRelative(6.18f, 6.18f, 0.0f, false, true, -2.57f, -5.38f)
                arcToRelative(13.32f, 13.32f, 0.0f, false, false, 2.02f, 8.15f)
                arcToRelative(13.3f, 13.3f, 0.0f, false, false, 4.97f, -6.77f)
                close()
                moveTo(44.54f, 77.73f)
                curveToRelative(-0.6f, 3.03f, -4.42f, 3.99f, -4.42f, 3.99f)
                arcToRelative(6.18f, 6.18f, 0.0f, false, true, -2.57f, -5.38f)
                arcToRelative(13.32f, 13.32f, 0.0f, false, false, 2.01f, 8.15f)
                arcToRelative(13.31f, 13.31f, 0.0f, false, false, 4.97f, -6.77f)
                close()
                moveTo(96.8f, 74.68f)
                curveToRelative(0.6f, 3.03f, 4.41f, 3.99f, 4.41f, 3.99f)
                arcToRelative(6.18f, 6.18f, 0.0f, false, false, 1.98f, -2.36f)
                arcToRelative(6.17f, 6.17f, 0.0f, false, false, 0.6f, -3.02f)
                arcToRelative(13.33f, 13.33f, 0.0f, false, true, -2.01f, 8.15f)
                arcToRelative(13.31f, 13.31f, 0.0f, false, true, -4.97f, -6.77f)
                close()
                moveTo(89.24f, 76.22f)
                curveToRelative(0.6f, 3.03f, 4.42f, 3.99f, 4.42f, 3.99f)
                arcToRelative(6.18f, 6.18f, 0.0f, false, false, 2.57f, -5.38f)
                arcToRelative(13.33f, 13.33f, 0.0f, false, true, -2.02f, 8.15f)
                arcToRelative(13.3f, 13.3f, 0.0f, false, true, -4.97f, -6.77f)
                close()
                moveTo(94.58f, 83.09f)
                curveToRelative(0.6f, 3.03f, 4.41f, 3.99f, 4.41f, 3.99f)
                arcToRelative(6.19f, 6.19f, 0.0f, false, false, 1.98f, -2.36f)
                arcToRelative(6.18f, 6.18f, 0.0f, false, false, 0.6f, -3.02f)
                arcToRelative(13.32f, 13.32f, 0.0f, false, true, -2.01f, 8.15f)
                arcToRelative(13.3f, 13.3f, 0.0f, false, true, -4.97f, -6.77f)
                close()
                moveTo(87.03f, 84.61f)
                curveToRelative(0.6f, 3.03f, 4.41f, 3.99f, 4.41f, 3.99f)
                arcToRelative(6.18f, 6.18f, 0.0f, false, false, 2.57f, -5.38f)
                arcToRelative(13.31f, 13.31f, 0.0f, false, true, -2.02f, 8.15f)
                arcToRelative(13.31f, 13.31f, 0.0f, false, true, -4.97f, -6.77f)
                close()
                moveTo(92.33f, 91.6f)
                curveToRelative(0.6f, 3.03f, 4.42f, 3.99f, 4.42f, 3.99f)
                arcToRelative(6.18f, 6.18f, 0.0f, false, false, 2.57f, -5.38f)
                arcToRelative(13.31f, 13.31f, 0.0f, false, true, -2.02f, 8.15f)
                arcToRelative(13.31f, 13.31f, 0.0f, false, true, -4.97f, -6.77f)
                close()
                moveTo(81.71f, 77.73f)
                curveToRelative(0.6f, 3.03f, 4.42f, 3.99f, 4.42f, 3.99f)
                arcToRelative(6.18f, 6.18f, 0.0f, false, false, 2.57f, -5.38f)
                arcToRelative(13.31f, 13.31f, 0.0f, false, true, -2.02f, 8.15f)
                arcToRelative(13.31f, 13.31f, 0.0f, false, true, -4.97f, -6.77f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(43.15f, 71.81f)
                curveToRelative(9.71f, 0.0f, 17.58f, -7.65f, 17.58f, -17.08f)
                curveToRelative(0.0f, -9.43f, -7.87f, -17.08f, -17.58f, -17.08f)
                curveToRelative(-9.71f, 0.0f, -17.58f, 7.65f, -17.58f, 17.08f)
                curveToRelative(0.0f, 9.43f, 7.87f, 17.08f, 17.58f, 17.08f)
                close()
            }
            path(fill = SolidColor(Color(0xFFbdbfc1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(47.67f, 64.77f)
                curveToRelative(4.99f, 0.0f, 9.04f, -3.6f, 9.04f, -8.04f)
                curveToRelative(0.0f, -4.44f, -4.05f, -8.04f, -9.04f, -8.04f)
                curveToRelative(-4.99f, 0.0f, -9.04f, 3.6f, -9.04f, 8.04f)
                curveToRelative(0.0f, 4.44f, 4.05f, 8.04f, 9.04f, 8.04f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(47.67f, 62.76f)
                curveToRelative(2.77f, 0.0f, 5.02f, -2.47f, 5.02f, -5.53f)
                curveToRelative(0.0f, -3.05f, -2.25f, -5.53f, -5.02f, -5.53f)
                reflectiveCurveToRelative(-5.02f, 2.47f, -5.02f, 5.53f)
                curveToRelative(0.0f, 3.05f, 2.25f, 5.53f, 5.02f, 5.53f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(45.16f, 56.74f)
                curveToRelative(0.83f, 0.0f, 1.51f, -0.9f, 1.51f, -2.01f)
                curveToRelative(0.0f, -1.11f, -0.68f, -2.01f, -1.51f, -2.01f)
                curveToRelative(-0.83f, 0.0f, -1.51f, 0.9f, -1.51f, 2.01f)
                curveToRelative(0.0f, 1.11f, 0.68f, 2.01f, 1.51f, 2.01f)
                close()
                moveTo(82.34f, 71.81f)
                curveToRelative(9.71f, 0.0f, 17.58f, -7.65f, 17.58f, -17.08f)
                curveToRelative(0.0f, -9.43f, -7.87f, -17.08f, -17.58f, -17.08f)
                reflectiveCurveToRelative(-17.58f, 7.65f, -17.58f, 17.08f)
                curveToRelative(0.0f, 9.43f, 7.87f, 17.08f, 17.58f, 17.08f)
                close()
            }
            path(fill = SolidColor(Color(0xFFbdbfc1)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(86.36f, 64.77f)
                curveToRelative(4.72f, 0.0f, 8.54f, -3.6f, 8.54f, -8.04f)
                curveToRelative(0.0f, -4.44f, -3.82f, -8.04f, -8.54f, -8.04f)
                curveToRelative(-4.72f, 0.0f, -8.54f, 3.6f, -8.54f, 8.04f)
                curveToRelative(0.0f, 4.44f, 3.82f, 8.04f, 8.54f, 8.04f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(86.86f, 62.76f)
                curveToRelative(3.33f, 0.0f, 6.03f, -2.47f, 6.03f, -5.53f)
                curveToRelative(0.0f, -3.05f, -2.7f, -5.53f, -6.03f, -5.53f)
                curveToRelative(-3.33f, 0.0f, -6.03f, 2.47f, -6.03f, 5.53f)
                curveToRelative(0.0f, 3.05f, 2.7f, 5.53f, 6.03f, 5.53f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(83.34f, 56.74f)
                curveToRelative(0.83f, 0.0f, 1.51f, -0.9f, 1.51f, -2.01f)
                curveToRelative(0.0f, -1.11f, -0.68f, -2.01f, -1.51f, -2.01f)
                curveToRelative(-0.83f, 0.0f, -1.51f, 0.9f, -1.51f, 2.01f)
                curveToRelative(0.0f, 1.11f, 0.68f, 2.01f, 1.51f, 2.01f)
                close()
            }
            path(fill = radialGradient(0.0f to Color(0xFFDDDFE0), 0.17f to Color(0xFFD9DBDC), 0.35f
                    to Color(0xFFCDCFD0), 0.53f to Color(0xFFB8BABB), 0.71f to Color(0xFF9C9E9F),
                    0.89f to Color(0xFF78797B), 1.0f to Color(0xFF5E5F61), center =
                    Offset(62.04f,67.22f), radius = 11.89f), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(63.25f, 88.89f)
                curveToRelative(0.0f, -6.28f, 9.55f, -15.19f, 9.55f, -21.75f)
                arcToRelative(9.63f, 9.63f, 0.0f, false, false, -2.87f, -6.65f)
                arcToRelative(9.51f, 9.51f, 0.0f, false, false, -6.68f, -2.74f)
                arcToRelative(9.52f, 9.52f, 0.0f, false, false, -6.68f, 2.74f)
                arcToRelative(9.63f, 9.63f, 0.0f, false, false, -2.87f, 6.65f)
                curveToRelative(0.0f, 6.56f, 9.54f, 15.47f, 9.54f, 21.75f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
