package com.woowla.compose.icon.collections.devicons.devicons.kdeneon

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.woowla.compose.icon.collections.devicons.devicons.KdeneonGroup

public val KdeneonGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFF1ABC9C), 1.0f to Color(0xFF2980B9), start =
                    Offset(66.67f,0.0f), end = Offset(66.67f,128.0f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(128.0f, 64.0f)
                curveToRelative(0.0f, 35.35f, -28.65f, 64.0f, -64.0f, 64.0f)
                reflectiveCurveTo(0.0f, 99.35f, 0.0f, 64.0f)
                reflectiveCurveTo(28.65f, 0.0f, 64.0f, 0.0f)
                reflectiveCurveToRelative(64.0f, 28.65f, 64.0f, 64.0f)
                close()
                moveTo(128.0f, 64.0f)
            }
            path(fill = linearGradient(0.0f to Color(0xFF000000), 1.0f to Color(0x00000000), start =
                    Offset(64.0f,64.0f), end = Offset(122.23f,122.23f)), stroke = null, fillAlpha =
                    0.2f, strokeAlpha = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(73.32f, 54.68f)
                lineTo(54.68f, 73.32f)
                lineToRelative(44.27f, 44.27f)
                arcToRelative(63.97f, 63.97f, 0.0f, false, false, 18.61f, -18.66f)
                close()
                moveTo(73.32f, 54.68f)
            }
            path(fill = linearGradient(0.0f to Color(0xFF000000), 1.0f to Color(0x00000000), start =
                    Offset(64.0f,63.99f), end = Offset(122.23f,122.22f)), stroke = null, fillAlpha =
                    0.2f, strokeAlpha = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(90.2f, 37.8f)
                lineToRelative(-1.18f, 1.18f)
                arcTo(35.42f, 35.42f, 0.0f, false, true, 99.41f, 64.0f)
                curveToRelative(0.0f, 19.56f, -15.85f, 35.41f, -35.41f, 35.41f)
                arcToRelative(35.42f, 35.42f, 0.0f, false, true, -25.03f, -10.38f)
                lineToRelative(-1.18f, 1.18f)
                lineToRelative(36.89f, 36.89f)
                curveToRelative(26.83f, -4.57f, 47.84f, -25.62f, 52.36f, -52.46f)
                close()
                moveTo(90.2f, 37.8f)
            }
            path(fill = linearGradient(0.0f to Color(0xFF000000), 1.0f to Color(0x00000000), start =
                    Offset(64.01f,63.98f), end = Offset(122.24f,122.21f)), stroke = null, fillAlpha
                    = 0.2f, strokeAlpha = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(103.6f, 24.39f)
                verticalLineToRelative(0.01f)
                lineToRelative(-3.08f, 3.08f)
                arcTo(51.65f, 51.65f, 0.0f, false, true, 115.68f, 64.0f)
                curveToRelative(0.0f, 28.54f, -23.14f, 51.68f, -51.68f, 51.68f)
                arcToRelative(51.67f, 51.67f, 0.0f, false, true, -36.52f, -15.16f)
                lineToRelative(-3.08f, 3.08f)
                lineToRelative(21.83f, 21.84f)
                arcTo(64.06f, 64.06f, 0.0f, false, false, 64.0f, 128.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, -28.65f, 64.0f, -64.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, -2.54f, -17.75f)
                close()
                moveTo(103.6f, 24.39f)
            }
            path(fill = SolidColor(Color(0xFFfcfcfc)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 8.0f)
                arcToRelative(4.61f, 4.61f, 0.0f, false, false, -4.5f, 3.61f)
                arcToRelative(52.7f, 52.7f, 0.0f, false, false, -29.39f, 12.2f)
                arcToRelative(4.62f, 4.62f, 0.0f, false, false, -2.35f, -0.65f)
                arcToRelative(4.61f, 4.61f, 0.0f, false, false, -4.61f, 4.61f)
                curveToRelative(0.0f, 0.83f, 0.23f, 1.64f, 0.65f, 2.35f)
                arcToRelative(52.72f, 52.72f, 0.0f, false, false, -12.22f, 29.4f)
                arcTo(4.61f, 4.61f, 0.0f, false, false, 8.0f, 64.0f)
                arcToRelative(4.61f, 4.61f, 0.0f, false, false, 3.61f, 4.5f)
                arcToRelative(52.7f, 52.7f, 0.0f, false, false, 12.2f, 29.39f)
                arcToRelative(4.62f, 4.62f, 0.0f, false, false, -0.65f, 2.35f)
                arcToRelative(4.61f, 4.61f, 0.0f, false, false, 4.61f, 4.61f)
                arcToRelative(4.64f, 4.64f, 0.0f, false, false, 2.34f, -0.64f)
                arcToRelative(52.74f, 52.74f, 0.0f, false, false, 29.41f, 12.22f)
                arcTo(4.61f, 4.61f, 0.0f, false, false, 64.0f, 120.0f)
                curveToRelative(2.16f, 0.0f, 4.03f, -1.5f, 4.5f, -3.61f)
                arcToRelative(52.72f, 52.72f, 0.0f, false, false, 29.43f, -12.17f)
                curveToRelative(0.7f, 0.41f, 1.5f, 0.63f, 2.31f, 0.63f)
                arcToRelative(4.61f, 4.61f, 0.0f, false, false, 4.61f, -4.61f)
                arcToRelative(4.65f, 4.65f, 0.0f, false, false, -0.65f, -2.35f)
                arcToRelative(52.71f, 52.71f, 0.0f, false, false, 12.27f, -29.41f)
                arcTo(4.62f, 4.62f, 0.0f, false, false, 120.0f, 64.0f)
                curveToRelative(0.0f, -2.16f, -1.5f, -4.03f, -3.61f, -4.5f)
                arcToRelative(52.71f, 52.71f, 0.0f, false, false, -12.18f, -29.42f)
                arcToRelative(4.61f, 4.61f, 0.0f, false, false, 0.63f, -2.32f)
                arcToRelative(4.61f, 4.61f, 0.0f, false, false, -4.61f, -4.61f)
                arcToRelative(4.65f, 4.65f, 0.0f, false, false, -2.35f, 0.65f)
                arcTo(52.71f, 52.71f, 0.0f, false, false, 68.48f, 11.53f)
                arcTo(4.61f, 4.61f, 0.0f, false, false, 64.0f, 8.0f)
                close()
                moveTo(64.0f, 9.98f)
                arcToRelative(2.64f, 2.64f, 0.0f, true, true, -2.64f, 2.64f)
                arcTo(2.64f, 2.64f, 0.0f, false, true, 64.0f, 9.98f)
                close()
                moveTo(59.66f, 14.16f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, 8.65f, 0.06f)
                arcToRelative(50.06f, 50.06f, 0.0f, false, true, 27.79f, 11.51f)
                arcToRelative(4.61f, 4.61f, 0.0f, false, false, 6.17f, 6.16f)
                arcToRelative(50.06f, 50.06f, 0.0f, false, true, 11.52f, 27.78f)
                arcToRelative(4.61f, 4.61f, 0.0f, false, false, -0.02f, 8.64f)
                arcToRelative(50.03f, 50.03f, 0.0f, false, true, -11.51f, 27.78f)
                arcToRelative(4.61f, 4.61f, 0.0f, false, false, -6.16f, 6.17f)
                arcToRelative(50.08f, 50.08f, 0.0f, false, true, -27.77f, 11.53f)
                arcTo(4.61f, 4.61f, 0.0f, false, false, 64.0f, 110.78f)
                arcToRelative(4.61f, 4.61f, 0.0f, false, false, -4.31f, 2.99f)
                arcToRelative(50.1f, 50.1f, 0.0f, false, true, -27.8f, -11.47f)
                arcToRelative(4.61f, 4.61f, 0.0f, false, false, -6.15f, -6.21f)
                arcToRelative(50.08f, 50.08f, 0.0f, false, true, -11.57f, -27.76f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, 0.07f, -8.65f)
                arcToRelative(50.08f, 50.08f, 0.0f, false, true, 11.47f, -27.81f)
                arcToRelative(4.61f, 4.61f, 0.0f, false, false, 6.2f, -6.15f)
                arcToRelative(50.04f, 50.04f, 0.0f, false, true, 27.76f, -11.57f)
                close()
                moveTo(64.0f, 23.81f)
                arcToRelative(4.61f, 4.61f, 0.0f, false, false, -4.5f, 3.64f)
                curveTo(41.03f, 29.72f, 27.14f, 45.4f, 27.11f, 64.0f)
                curveToRelative(0.03f, 18.61f, 13.92f, 34.29f, 32.39f, 36.56f)
                arcToRelative(4.61f, 4.61f, 0.0f, false, false, 9.0f, -0.02f)
                curveToRelative(18.47f, -2.27f, 32.35f, -17.94f, 32.39f, -36.55f)
                curveToRelative(-0.03f, -18.61f, -13.92f, -34.29f, -32.39f, -36.56f)
                arcToRelative(4.61f, 4.61f, 0.0f, false, false, -4.5f, -3.63f)
                close()
                moveTo(27.77f, 25.13f)
                arcToRelative(2.63f, 2.63f, 0.0f, true, true, -0.0f, 5.27f)
                arcToRelative(2.63f, 2.63f, 0.0f, false, true, 0.0f, -5.27f)
                close()
                moveTo(100.23f, 25.13f)
                arcToRelative(2.64f, 2.64f, 0.0f, true, true, 0.0f, 5.27f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, true, -0.0f, -5.27f)
                close()
                moveTo(64.0f, 25.79f)
                arcToRelative(2.63f, 2.63f, 0.0f, true, true, 0.0f, 5.27f)
                arcToRelative(2.64f, 2.64f, 0.0f, true, true, 0.0f, -5.27f)
                close()
                moveTo(59.69f, 30.07f)
                arcTo(4.62f, 4.62f, 0.0f, false, false, 64.0f, 33.04f)
                arcToRelative(4.62f, 4.62f, 0.0f, false, false, 4.3f, -2.96f)
                curveTo(85.4f, 32.24f, 98.23f, 46.77f, 98.26f, 64.0f)
                curveToRelative(-0.03f, 17.23f, -12.85f, 31.77f, -29.95f, 33.93f)
                arcTo(4.62f, 4.62f, 0.0f, false, false, 64.0f, 94.96f)
                arcToRelative(4.62f, 4.62f, 0.0f, false, false, -4.3f, 2.96f)
                curveTo(42.6f, 95.76f, 29.77f, 81.23f, 29.74f, 64.0f)
                curveToRelative(0.03f, -17.23f, 12.85f, -31.77f, 29.95f, -33.93f)
                close()
                moveTo(64.0f, 50.82f)
                curveToRelative(-7.28f, 0.0f, -13.18f, 5.9f, -13.18f, 13.18f)
                reflectiveCurveTo(56.72f, 77.18f, 64.0f, 77.18f)
                reflectiveCurveTo(77.18f, 71.28f, 77.18f, 64.0f)
                reflectiveCurveTo(71.28f, 50.82f, 64.0f, 50.82f)
                close()
                moveTo(12.61f, 61.36f)
                arcTo(2.63f, 2.63f, 0.0f, false, true, 15.25f, 64.0f)
                arcToRelative(2.63f, 2.63f, 0.0f, true, true, -5.27f, 0.0f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, true, 2.64f, -2.64f)
                close()
                moveTo(115.39f, 61.36f)
                arcTo(2.64f, 2.64f, 0.0f, false, true, 118.02f, 64.0f)
                arcToRelative(2.64f, 2.64f, 0.0f, true, true, -2.64f, -2.64f)
                close()
                moveTo(64.0f, 96.94f)
                arcToRelative(2.64f, 2.64f, 0.0f, true, true, -2.64f, 2.64f)
                arcTo(2.64f, 2.64f, 0.0f, false, true, 64.0f, 96.94f)
                close()
                moveTo(27.77f, 97.6f)
                arcToRelative(2.63f, 2.63f, 0.0f, true, true, -0.0f, 5.27f)
                arcToRelative(2.63f, 2.63f, 0.0f, false, true, 0.0f, -5.27f)
                close()
                moveTo(100.23f, 97.6f)
                arcToRelative(2.63f, 2.63f, 0.0f, true, true, 0.0f, 5.27f)
                arcToRelative(2.63f, 2.63f, 0.0f, false, true, -0.0f, -5.27f)
                close()
                moveTo(64.0f, 112.75f)
                arcToRelative(2.63f, 2.63f, 0.0f, true, true, 0.0f, 5.27f)
                arcToRelative(2.64f, 2.64f, 0.0f, true, true, 0.0f, -5.27f)
                close()
                moveTo(64.0f, 112.75f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
