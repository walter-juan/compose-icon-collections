package com.woowla.compose.icon.collections.devicons.devicons.opera

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.OperaGroup

public val OperaGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFFFF1B2D), 0.61f to Color(0xFFFF1B2D), 1.0f
                    to Color(0xFFA70014), start = Offset(53.33f,2.1f), end =
                    Offset(53.33f,126.14f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(64.0f, 0.01f)
                curveTo(28.65f, 0.01f, 0.0f, 28.66f, 0.0f, 64.01f)
                curveToRelative(0.0f, 34.32f, 27.02f, 62.33f, 60.95f, 63.92f)
                curveToRelative(1.01f, 0.05f, 2.03f, 0.07f, 3.05f, 0.07f)
                arcToRelative(63.77f, 63.77f, 0.0f, false, false, 42.65f, -16.28f)
                curveToRelative(-7.5f, 4.97f, -16.27f, 7.84f, -25.65f, 7.84f)
                curveToRelative(-15.24f, 0.0f, -28.89f, -7.56f, -38.07f, -19.48f)
                curveToRelative(-7.08f, -8.35f, -11.66f, -20.7f, -11.97f, -34.56f)
                lineTo(30.96f, 62.5f)
                curveToRelative(0.31f, -13.86f, 4.89f, -26.21f, 11.97f, -34.56f)
                curveTo(52.11f, 16.02f, 65.76f, 8.46f, 81.0f, 8.46f)
                curveToRelative(9.38f, 0.0f, 18.15f, 2.86f, 25.65f, 7.84f)
                curveTo(95.38f, 6.22f, 80.53f, 0.07f, 64.24f, 0.01f)
                horizontalLineToRelative(-0.24f)
                close()
                moveTo(64.0f, 0.01f)
            }
            path(fill = linearGradient(0.0f to Color(0xFF9C0000), 0.7f to Color(0xFFFF4B4B), start =
                    Offset(85.46f,9.41f), end = Offset(85.46f,119.12f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(42.93f, 27.94f)
                curveToRelative(5.87f, -6.93f, 13.46f, -11.12f, 21.74f, -11.12f)
                curveToRelative(18.63f, 0.0f, 33.73f, 21.13f, 33.73f, 47.18f)
                reflectiveCurveToRelative(-15.1f, 47.18f, -33.73f, 47.18f)
                curveToRelative(-8.28f, 0.0f, -15.87f, -4.18f, -21.74f, -11.11f)
                curveToRelative(9.18f, 11.93f, 22.83f, 19.48f, 38.07f, 19.48f)
                curveToRelative(9.38f, 0.0f, 18.15f, -2.86f, 25.65f, -7.84f)
                curveToRelative(13.1f, -11.72f, 21.35f, -28.75f, 21.35f, -47.72f)
                reflectiveCurveToRelative(-8.25f, -35.99f, -21.34f, -47.71f)
                curveToRelative(-7.5f, -4.98f, -16.27f, -7.84f, -25.65f, -7.84f)
                curveToRelative(-15.24f, 0.0f, -28.89f, 7.56f, -38.07f, 19.48f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
