package com.woowla.compose.icon.collections.devicons.devicons.weblate

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.WeblateGroup

public val WeblateGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFF00D2E6), 1.0f to Color(0xFF2ECCAA), start =
                    Offset(-0.0f,64.0f), end = Offset(62.54f,64.0f)), stroke = null, strokeLineWidth
                    = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(82.0f, 88.5f)
                curveToRelative(-1.9f, 0.0f, -3.7f, -0.4f, -5.5f, -1.2f)
                curveToRelative(-4.0f, -1.7f, -7.4f, -5.0f, -10.3f, -9.4f)
                curveToRelative(0.8f, -1.4f, 1.5f, -2.9f, 2.2f, -4.4f)
                curveToRelative(2.8f, -6.6f, 4.2f, -13.9f, 4.3f, -21.1f)
                verticalLineToRelative(-0.8f)
                curveToRelative(0.0f, -2.8f, -0.4f, -5.7f, -1.4f, -8.3f)
                curveToRelative(-1.1f, -3.1f, -2.9f, -6.1f, -5.7f, -7.3f)
                curveToRelative(-0.5f, -0.2f, -1.1f, -0.3f, -1.6f, -0.3f)
                curveToRelative(-3.6f, -6.7f, -3.7f, -13.0f, 0.0f, -19.1f)
                horizontalLineToRelative(0.2f)
                curveToRelative(4.3f, 0.0f, 8.6f, 1.4f, 12.3f, 3.7f)
                curveToRelative(10.0f, 6.4f, 15.0f, 18.7f, 15.1f, 30.9f)
                verticalLineToRelative(0.4f)
                horizontalLineToRelative(0.1f)
                curveToRelative(-0.1f, 12.9f, -3.2f, 26.0f, -9.7f, 36.9f)
                close()
                moveTo(59.8f, 108.7f)
                curveToRelative(-9.3f, 3.8f, -20.2f, 3.6f, -29.4f, -0.7f)
                curveToRelative(-10.6f, -4.9f, -18.8f, -14.6f, -23.8f, -25.5f)
                curveToRelative(-8.6f, -18.8f, -8.8f, -41.2f, -0.6f, -60.2f)
                curveToRelative(6.1f, 2.4f, 11.5f, -1.4f, 11.5f, -1.4f)
                reflectiveCurveToRelative(0.0f, 6.0f, 5.8f, 9.0f)
                curveToRelative(-5.9f, 13.9f, -5.8f, 30.5f, 0.2f, 44.1f)
                curveToRelative(2.9f, 6.5f, 7.3f, 12.6f, 13.3f, 16.1f)
                curveToRelative(2.2f, 1.2f, 4.6f, 2.0f, 7.0f, 2.3f)
                curveToRelative(4.3f, 6.6f, 9.8f, 12.3f, 16.0f, 16.3f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0x00000000), 0.51f to Color(0xFF000000), 1.0f
                    to Color(0x00000000), start = Offset(39.0f,96.74f), end =
                    Offset(77.17f,83.45f)), stroke = null, fillAlpha = 0.3f, strokeAlpha = 0.3f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(82.0f, 88.5f)
                curveToRelative(-1.9f, 0.0f, -3.7f, -0.4f, -5.5f, -1.2f)
                curveToRelative(-4.0f, -1.7f, -7.4f, -5.0f, -10.3f, -9.4f)
                curveToRelative(0.8f, -1.4f, 1.5f, -2.9f, 2.2f, -4.4f)
                curveToRelative(0.9f, -2.0f, 1.6f, -4.0f, 2.2f, -6.1f)
                curveTo(72.0f, 62.6f, 90.2f, 68.7f, 87.5f, 76.7f)
                curveTo(86.0f, 80.8f, 84.2f, 84.8f, 82.0f, 88.5f)
                close()
                moveTo(59.8f, 108.7f)
                curveToRelative(-9.3f, 3.8f, -20.2f, 3.6f, -29.4f, -0.7f)
                curveToRelative(-10.6f, -4.9f, 0.3f, -21.5f, 6.4f, -18.1f)
                curveToRelative(2.2f, 1.2f, 4.5f, 2.0f, 7.0f, 2.3f)
                curveToRelative(4.3f, 6.8f, 9.8f, 12.5f, 16.0f, 16.5f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF1FA385), 1.0f to Color(0xFF2ECCAA), start =
                    Offset(128.0f,64.0f), end = Offset(65.57f,64.0f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(36.4f, 51.7f)
                verticalLineToRelative(-0.4f)
                curveToRelative(0.1f, -12.2f, 5.1f, -24.6f, 15.1f, -30.9f)
                curveToRelative(3.7f, -2.3f, 8.0f, -3.7f, 12.3f, -3.7f)
                horizontalLineToRelative(0.2f)
                verticalLineToRelative(19.1f)
                curveToRelative(-0.5f, 0.0f, -1.1f, 0.1f, -1.6f, 0.3f)
                curveToRelative(-2.8f, 1.2f, -4.6f, 4.3f, -5.7f, 7.3f)
                curveToRelative(-1.0f, 2.7f, -1.4f, 5.5f, -1.4f, 8.3f)
                verticalLineToRelative(0.8f)
                curveToRelative(0.1f, 7.2f, 1.4f, 14.4f, 4.3f, 21.0f)
                curveTo(62.7f, 81.0f, 67.8f, 87.8f, 75.0f, 90.9f)
                curveToRelative(5.4f, 2.4f, 11.4f, 1.8f, 16.3f, -1.0f)
                curveToRelative(6.1f, -3.4f, 10.5f, -9.5f, 13.3f, -16.1f)
                curveToRelative(6.0f, -13.6f, 6.1f, -30.1f, 0.2f, -44.1f)
                curveToRelative(5.8f, -3.0f, 5.8f, -9.0f, 5.8f, -9.0f)
                reflectiveCurveToRelative(5.4f, 3.9f, 11.5f, 1.4f)
                curveToRelative(8.1f, 19.0f, 7.9f, 41.5f, -0.6f, 60.2f)
                curveToRelative(-5.0f, 11.0f, -13.1f, 20.6f, -23.8f, 25.5f)
                curveToRelative(-9.5f, 4.4f, -20.6f, 4.5f, -30.1f, 0.4f)
                curveTo(59.0f, 104.7f, 52.0f, 98.0f, 47.0f, 90.2f)
                curveToRelative(-7.2f, -11.3f, -10.6f, -25.0f, -10.6f, -38.5f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
