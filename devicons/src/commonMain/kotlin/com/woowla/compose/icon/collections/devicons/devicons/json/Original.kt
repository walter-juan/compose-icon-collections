package com.woowla.compose.icon.collections.devicons.devicons.json

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.JsonGroup

public val JsonGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFF000000), 1.0f to Color(0xFFFFFFFF), start =
                    Offset(19.25f,21.46f), end = Offset(106.61f,108.82f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(63.9f, 94.3f)
                curveToRelative(27.43f, 37.4f, 54.28f, -10.44f, 54.24f, -39.21f)
                curveToRelative(-0.05f, -34.01f, -34.52f, -53.02f, -54.26f, -53.02f)
                curveTo(32.18f, 2.08f, 2.0f, 28.27f, 2.0f, 64.11f)
                curveTo(2.0f, 103.94f, 36.6f, 126.0f, 63.87f, 126.0f)
                curveToRelative(-6.17f, -0.89f, -26.74f, -5.3f, -27.02f, -52.67f)
                curveToRelative(-0.19f, -32.04f, 10.45f, -44.85f, 26.97f, -39.21f)
                curveToRelative(0.37f, 0.14f, 18.22f, 7.18f, 18.22f, 30.19f)
                curveToRelative(0.0f, 22.91f, -18.16f, 30.0f, -18.16f, 30.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF000000), 1.0f to Color(0xFFFFFFFF), start =
                    Offset(110.56f,104.86f), end = Offset(23.2f,17.51f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(63.86f, 34.09f)
                curveTo(45.74f, 27.84f, 23.53f, 42.78f, 23.53f, 72.7f)
                curveTo(23.53f, 121.57f, 59.74f, 126.0f, 64.13f, 126.0f)
                curveTo(95.82f, 126.0f, 126.0f, 99.81f, 126.0f, 63.97f)
                curveTo(126.0f, 24.14f, 91.4f, 2.08f, 64.13f, 2.08f)
                curveToRelative(7.55f, -1.05f, 40.72f, 8.18f, 40.72f, 53.5f)
                curveToRelative(0.0f, 29.56f, -24.76f, 45.65f, -40.87f, 38.78f)
                curveToRelative(-0.37f, -0.14f, -18.22f, -7.18f, -18.22f, -30.19f)
                curveToRelative(0.0f, -22.91f, 18.11f, -30.08f, 18.11f, -30.08f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
