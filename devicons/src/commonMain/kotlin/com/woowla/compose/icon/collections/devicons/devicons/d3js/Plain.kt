package com.woowla.compose.icon.collections.devicons.devicons.d3js

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
import com.woowla.compose.icon.collections.devicons.devicons.D3jsGroup

public val D3jsGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFFF9A03C), 1.0f to Color(0xFFF7974E), start =
                    Offset(85.24f,97.6f), end = Offset(91.05f,-49.52f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(118.16f, 63.97f)
                curveToRelative(5.22f, -6.26f, 8.37f, -14.22f, 8.37f, -22.98f)
                curveTo(126.53f, 21.1f, 110.35f, 5.0f, 90.46f, 5.0f)
                horizontalLineTo(47.99f)
                curveToRelative(10.38f, 7.0f, 18.97f, 16.0f, 24.82f, 26.0f)
                horizontalLineToRelative(17.66f)
                curveToRelative(5.55f, 0.0f, 10.06f, 4.45f, 10.06f, 10.0f)
                reflectiveCurveToRelative(-4.51f, 10.0f, -10.06f, 10.0f)
                horizontalLineTo(80.05f)
                curveToRelative(0.82f, 5.0f, 1.26f, 8.62f, 1.26f, 13.1f)
                curveToRelative(0.0f, 4.41f, -0.43f, 8.9f, -1.22f, 12.9f)
                horizontalLineToRelative(10.38f)
                curveToRelative(5.55f, 0.0f, 10.06f, 4.95f, 10.06f, 10.5f)
                reflectiveCurveTo(96.01f, 98.0f, 90.46f, 98.0f)
                horizontalLineTo(72.92f)
                curveToRelative(-1.32f, 2.0f, -2.79f, 4.74f, -4.38f, 6.98f)
                curveTo(63.14f, 112.59f, 56.25f, 119.0f, 48.29f, 124.0f)
                horizontalLineToRelative(42.17f)
                curveToRelative(19.33f, 0.0f, 35.16f, -15.75f, 36.02f, -34.88f)
                curveToRelative(-0.02f, 0.31f, -0.04f, 0.39f, -0.07f, 0.7f)
                curveToRelative(0.06f, -0.85f, 0.11f, -1.81f, 0.11f, -2.68f)
                curveToRelative(-0.0f, -8.77f, -3.15f, -16.92f, -8.37f, -23.18f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFF9A03C), 1.0f to Color(0xFFF7974E), start =
                    Offset(33.63f,97.71f), end = Offset(39.38f,-47.92f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(61.03f, 97.54f)
                lineToRelative(0.0f, -0.18f)
                curveToRelative(0.07f, -0.1f, 0.14f, -0.29f, 0.21f, -0.39f)
                curveToRelative(0.08f, -0.12f, 0.15f, -0.28f, 0.23f, -0.39f)
                curveToRelative(0.0f, -0.0f, 0.0f, -0.03f, 0.0f, -0.03f)
                curveToRelative(6.14f, -9.33f, 9.73f, -20.41f, 9.73f, -32.39f)
                curveTo(71.2f, 31.5f, 44.62f, 5.0f, 11.96f, 5.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(26.0f)
                horizontalLineToRelative(10.96f)
                curveToRelative(18.32f, 0.0f, 33.23f, 14.82f, 33.23f, 33.14f)
                curveToRelative(0.0f, 4.98f, -1.11f, 9.68f, -3.09f, 13.92f)
                curveToRelative(-0.01f, 0.01f, -0.01f, 0.36f, -0.02f, 0.37f)
                curveTo(36.79f, 89.78f, 25.28f, 98.0f, 11.96f, 98.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(26.0f)
                horizontalLineToRelative(10.96f)
                curveToRelative(20.4f, 0.0f, 38.41f, -10.72f, 49.07f, -26.46f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
