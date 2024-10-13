package com.woowla.compose.icon.collections.devicons.devicons.moodle

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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.MoodleGroup

public val MoodleGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = radialGradient(0.0f to Color(0xFFFAAF40), 0.04f to Color(0xFFF9A538), 0.11f
                    to Color(0xFFF89D31), 0.23f to Color(0xFFF89A2F), 0.53f to Color(0xFFF7922D),
                    1.0f to Color(0xFFF37B28), center = Offset(235.25f,76.66f), radius = 209.76f),
                    stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                    Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(106.26f, 105.75f)
                verticalLineTo(66.97f)
                curveToRelative(0.0f, -8.16f, -3.4f, -12.24f, -10.03f, -12.24f)
                curveToRelative(-6.63f, 0.0f, -10.03f, 4.08f, -10.03f, 12.24f)
                verticalLineToRelative(38.78f)
                horizontalLineTo(66.29f)
                verticalLineTo(66.97f)
                curveToRelative(0.0f, -8.16f, -3.23f, -12.24f, -9.86f, -12.24f)
                curveToRelative(-6.63f, 0.0f, -10.04f, 4.08f, -10.04f, 12.24f)
                verticalLineToRelative(38.78f)
                horizontalLineTo(26.67f)
                verticalLineTo(64.77f)
                curveToRelative(0.0f, -8.5f, 2.89f, -14.8f, 8.84f, -19.22f)
                curveToRelative(5.1f, -3.91f, 12.25f, -5.78f, 20.92f, -5.78f)
                curveToRelative(9.02f, 0.0f, 15.48f, 2.21f, 19.73f, 6.8f)
                curveToRelative(3.57f, -4.59f, 10.21f, -6.8f, 19.9f, -6.8f)
                curveToRelative(8.84f, 0.0f, 15.82f, 1.87f, 20.92f, 5.78f)
                curveToRelative(5.95f, 4.42f, 8.84f, 10.72f, 8.84f, 19.22f)
                verticalLineToRelative(41.15f)
                horizontalLineToRelative(-19.56f)
                verticalLineToRelative(-0.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF58595B)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.54f, 49.63f)
                lineToRelative(-2.04f, 10.21f)
                curveToRelative(18.71f, 6.29f, 36.4f, 0.17f, 45.75f, -16.16f)
                curveToRelative(-13.78f, -9.52f, -26.53f, 0.17f, -43.71f, 5.95f)
            }
            path(fill = linearGradient(0.0f to Color(0xFF929497), 0.12f to Color(0xFF757578), 0.28f
                    to Color(0xFF575658), 0.44f to Color(0xFF403E3F), 0.61f to Color(0xFF302D2E),
                    0.79f to Color(0xFF262223), 1.0f to Color(0xFF231F20), start =
                    Offset(26.67f,49.05f), end = Offset(71.33f,49.05f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(28.54f, 47.08f)
                curveToRelative(-0.68f, 3.91f, -1.19f, 7.65f, -1.87f, 11.56f)
                curveToRelative(17.86f, 6.13f, 35.38f, 0.85f, 44.73f, -15.14f)
                curveToRelative(-11.91f, -13.78f, -25.17f, -2.38f, -42.86f, 3.57f)
            }
            path(fill = linearGradient(0.0f to Color(0xFF231F20), 1.0f to Color(0x00231F20), start =
                    Offset(35.23f,34.15f), end = Offset(53.78f,60.63f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(49.8f, 51.67f)
                curveToRelative(-8.16f, -1.7f, -17.01f, 2.56f, -23.13f, 6.97f)
                curveToRelative(-3.91f, -28.57f, 13.78f, -27.89f, 36.9f, -20.75f)
                curveToRelative(-1.53f, 6.97f, -4.08f, 16.33f, -8.5f, 21.94f)
                curveToRelative(-0.17f, -3.74f, -1.87f, -6.29f, -5.27f, -8.17f)
            }
            path(fill = linearGradient(0.0f to Color(0xFF929497), 0.12f to Color(0xFF757578), 0.28f
                    to Color(0xFF575658), 0.44f to Color(0xFF403E3F), 0.61f to Color(0xFF302D2E),
                    0.79f to Color(0xFF262223), 1.0f to Color(0xFF231F20), start =
                    Offset(2.18f,34.9f), end = Offset(83.81f,34.9f)), stroke = null, strokeLineWidth
                    = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.18f, 47.08f)
                curveToRelative(29.93f, -18.03f, 46.77f, -21.43f, 81.63f, -25.0f)
                curveToRelative(-40.48f, 31.97f, -41.5f, 25.0f, -81.63f, 25.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF4A4A4C)),
                    strokeLineWidth = 0.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(83.81f, 22.25f)
                lineTo(51.67f, 45.54f)
            }
            path(fill = SolidColor(Color(0xFF231F20)), stroke = null, fillAlpha = 0.23f, strokeAlpha
                    = 0.23f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(45.54f, 34.66f)
                curveToRelative(0.34f, 3.74f, -0.51f, -3.57f, 0.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFA8ABAD)),
                    strokeLineWidth = 0.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.18f, 47.08f)
                lineToRelative(49.49f, -1.53f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFF16922)),
                    strokeLineWidth = 0.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(42.48f, 35.0f)
                curveTo(33.98f, 37.38f, 6.09f, 43.51f, 5.75f, 47.08f)
                curveToRelative(-0.85f, 6.63f, -0.17f, 17.18f, -0.17f, 17.18f)
            }
            path(fill = SolidColor(Color(0xFFF16922)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.13f, 89.6f)
                curveToRelative(-3.06f, -7.65f, -6.8f, -16.16f, -2.38f, -26.7f)
                curveTo(8.64f, 72.76f, 8.13f, 80.24f, 8.13f, 89.6f)
            }
            path(fill = SolidColor(Color(0xFF6D6E70)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.08f, 33.84f)
                curveToRelative(0.71f, -0.25f, 1.38f, -0.17f, 1.51f, 0.18f)
                curveToRelative(0.13f, 0.35f, -0.34f, 0.85f, -1.05f, 1.1f)
                curveToRelative(-0.71f, 0.26f, -1.38f, 0.17f, -1.51f, -0.18f)
                curveToRelative(-0.13f, -0.35f, 0.34f, -0.84f, 1.05f, -1.1f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
