package com.woowla.compose.icon.collections.devicons.devicons.poetry

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Brush.Companion.radialGradient
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
import com.woowla.compose.icon.collections.devicons.devicons.PoetryGroup

public val PoetryGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = radialGradient(0.0f to Color(0xFF6877EC), 0.6f to Color(0xFF5362CF), 1.0f to
                    Color(0xFF4352B9), center = Offset(8415.79f,16924.42f), radius = 14525.8f),
                    stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                    Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(40.07f, 124.8f)
                arcToRelative(121.72f, 121.72f, 0.0f, false, false, 62.24f, -33.37f)
                lineTo(16.22f, 5.33f)
                verticalLineToRelative(95.61f)
                close()
                moveTo(40.07f, 124.8f)
            }
            path(fill = radialGradient(0.0f to Color(0xFF00D5FF), 0.38f to Color(0xFF00B8EB), 1.0f
                    to Color(0xFF0080C5), center = Offset(1745.09f,180.4f), radius = 15225.16f),
                    stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                    Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.22f, 100.94f)
                curveToRelative(52.81f, 0.0f, 95.61f, -42.8f, 95.61f, -95.61f)
                horizontalLineToRelative(-95.61f)
                close()
                moveTo(16.22f, 100.94f)
            }
            path(fill = linearGradient(0.0f to Color(0xFF294CA7), 0.48f to Color(0xFF96A7D4), 0.84f
                    to Color(0xFFE1E6F3), 1.0f to Color(0xFFFFFFFF), start = Offset(20.16f,19.69f),
                    end = Offset(63.35f,114.71f)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.22f, 100.94f)
                lineToRelative(3.68f, 3.68f)
                curveToRelative(25.93f, -0.95f, 49.36f, -11.88f, 66.56f, -29.06f)
                lineToRelative(-2.62f, -2.62f)
                arcToRelative(95.29f, 95.29f, 0.0f, false, true, -67.62f, 28.0f)
                close()
                moveTo(16.22f, 100.94f)
            }
            path(fill = linearGradient(0.0f to Color(0xFF6877EC), 0.29f to Color(0xFF97A1F2), 0.77f
                    to Color(0xFFE2E4FB), 1.0f to Color(0xFFFFFFFF), start =
                    Offset(-44.58f,-25.45f), end = Offset(100.42f,144.4f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(40.07f, 124.8f)
                arcToRelative(121.72f, 121.72f, 0.0f, false, false, 62.24f, -33.37f)
                lineTo(16.22f, 5.33f)
                verticalLineToRelative(95.61f)
                close()
                moveTo(40.07f, 124.8f)
            }
            path(fill = linearGradient(0.0f to Color(0xFF8397CC), 0.15f to Color(0xFF97A8D4), 0.73f
                    to Color(0xFFE2E6F3), 1.0f to Color(0xFFFFFFFF), start =
                    Offset(-28.05f,-55.66f), end = Offset(100.23f,97.2f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(102.31f, 91.43f)
                lineTo(16.22f, 5.33f)
                lineToRelative(78.27f, 93.25f)
                arcToRelative(122.17f, 122.17f, 0.0f, false, false, 7.83f, -7.15f)
                close()
                moveTo(102.31f, 91.43f)
            }
            path(fill = radialGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFF000000), center
                    = Offset(4139.84f,-138.93f), radius = 6385.56f), stroke = null, strokeLineWidth
                    = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.22f, 5.33f)
                lineToRelative(67.61f, 67.61f)
                arcToRelative(98.72f, 98.72f, 0.0f, false, false, 1.78f, -1.84f)
                close()
                moveTo(16.22f, 5.33f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
