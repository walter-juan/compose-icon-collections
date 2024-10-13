package com.woowla.compose.icon.collections.devicons.devicons.r

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
import com.woowla.compose.icon.collections.devicons.devicons.RGroup

public val RGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFFCBCED0), 1.0f to Color(0xFF84838B), start =
                    Offset(0.0f,14.64f), end = Offset(128.0f,100.37f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(64.0f, 100.38f)
                curveToRelative(-35.35f, 0.0f, -64.0f, -19.19f, -64.0f, -42.86f)
                curveToRelative(0.0f, -23.67f, 28.65f, -42.86f, 64.0f, -42.86f)
                reflectiveCurveToRelative(64.0f, 19.19f, 64.0f, 42.86f)
                curveToRelative(0.0f, 23.67f, -28.65f, 42.86f, -64.0f, 42.86f)
                close()
                moveTo(73.8f, 31.41f)
                curveToRelative(-26.87f, 0.0f, -48.65f, 13.12f, -48.65f, 29.3f)
                curveToRelative(0.0f, 16.18f, 21.78f, 29.3f, 48.65f, 29.3f)
                reflectiveCurveToRelative(46.69f, -8.97f, 46.69f, -29.3f)
                curveToRelative(0.0f, -20.33f, -19.83f, -29.3f, -46.69f, -29.3f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF276DC3), 1.0f to Color(0xFF165CAA), start =
                    Offset(52.74f,41.26f), end = Offset(123.38f,113.35f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(97.47f, 81.03f)
                reflectiveCurveToRelative(3.87f, 1.17f, 6.12f, 2.31f)
                curveToRelative(0.78f, 0.4f, 2.13f, 1.18f, 3.11f, 2.22f)
                arcToRelative(8.39f, 8.39f, 0.0f, false, true, 1.42f, 2.04f)
                lineToRelative(15.27f, 25.74f)
                lineToRelative(-24.67f, 0.01f)
                lineToRelative(-11.54f, -21.67f)
                reflectiveCurveToRelative(-2.36f, -4.06f, -3.82f, -5.24f)
                curveToRelative(-1.21f, -0.98f, -1.73f, -1.33f, -2.93f, -1.33f)
                horizontalLineToRelative(-5.86f)
                lineToRelative(0.0f, 28.22f)
                lineToRelative(-21.83f, 0.01f)
                lineTo(52.74f, 41.26f)
                horizontalLineToRelative(43.84f)
                reflectiveCurveToRelative(19.97f, 0.36f, 19.97f, 19.36f)
                curveToRelative(0.0f, 19.0f, -19.08f, 20.41f, -19.08f, 20.41f)
                close()
                moveTo(87.97f, 56.9f)
                lineTo(74.75f, 56.89f)
                lineTo(74.75f, 69.14f)
                lineTo(87.97f, 69.14f)
                reflectiveCurveToRelative(6.12f, -0.02f, 6.12f, -6.24f)
                curveToRelative(0.0f, -6.34f, -6.12f, -6.01f, -6.12f, -6.01f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
