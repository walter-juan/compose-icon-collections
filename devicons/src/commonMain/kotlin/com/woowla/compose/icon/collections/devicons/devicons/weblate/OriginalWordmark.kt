package com.woowla.compose.icon.collections.devicons.devicons.weblate

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
import com.woowla.compose.icon.collections.devicons.devicons.WeblateGroup

public val WeblateGroup.OriginalWordmark: ImageVector
    get() {
        if (_originalWordmark != null) {
            return _originalWordmark!!
        }
        _originalWordmark = Builder(name = "OriginalWordmark", defaultWidth = 128.0.dp,
                defaultHeight = 128.0.dp, viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFF00D2E6), 1.0f to Color(0xFF2ECCAA), start =
                    Offset(0.76f,63.81f), end = Offset(22.46f,63.81f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(29.2f, 72.3f)
                curveToRelative(-0.7f, 0.0f, -1.3f, -0.1f, -1.9f, -0.4f)
                curveToRelative(-1.4f, -0.6f, -2.6f, -1.7f, -3.6f, -3.3f)
                curveToRelative(0.3f, -0.5f, 0.5f, -1.0f, 0.8f, -1.5f)
                curveToRelative(1.0f, -2.3f, 1.5f, -4.8f, 1.5f, -7.3f)
                verticalLineToRelative(-0.3f)
                curveToRelative(0.0f, -1.0f, -0.1f, -2.0f, -0.5f, -2.9f)
                curveToRelative(-0.4f, -1.1f, -1.0f, -2.1f, -2.0f, -2.5f)
                curveToRelative(-0.1f, -0.1f, -0.4f, -0.1f, -0.5f, -0.1f)
                curveToRelative(-1.2f, -2.3f, -1.3f, -4.5f, 0.0f, -6.6f)
                horizontalLineToRelative(0.1f)
                curveToRelative(1.5f, 0.0f, 3.0f, 0.5f, 4.3f, 1.3f)
                curveToRelative(3.5f, 2.2f, 5.2f, 6.5f, 5.2f, 10.7f)
                verticalLineToRelative(0.1f)
                curveToRelative(-0.1f, 4.5f, -1.1f, 9.0f, -3.4f, 12.8f)
                close()
                moveTo(21.5f, 79.3f)
                curveToRelative(-3.2f, 1.3f, -7.0f, 1.2f, -10.2f, -0.2f)
                curveToRelative(-3.7f, -1.7f, -6.5f, -5.1f, -8.3f, -8.8f)
                curveToRelative(-3.0f, -6.5f, -3.1f, -14.3f, -0.2f, -20.9f)
                curveToRelative(2.1f, 0.8f, 4.0f, -0.5f, 4.0f, -0.5f)
                reflectiveCurveToRelative(0.0f, 2.1f, 2.0f, 3.1f)
                curveToRelative(-2.0f, 4.8f, -2.0f, 10.6f, 0.1f, 15.3f)
                curveToRelative(1.0f, 2.3f, 2.5f, 4.4f, 4.6f, 5.6f)
                curveToRelative(0.8f, 0.4f, 1.6f, 0.7f, 2.4f, 0.8f)
                curveToRelative(1.6f, 2.3f, 3.5f, 4.2f, 5.6f, 5.6f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0x00000000), 0.51f to Color(0xFF000000), 1.0f
                    to Color(0x00000000), start = Offset(14.3f,75.18f), end =
                    Offset(27.54f,70.57f)), stroke = null, fillAlpha = 0.3f, strokeAlpha = 0.3f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(29.2f, 72.3f)
                curveToRelative(-0.7f, 0.0f, -1.3f, -0.1f, -1.9f, -0.4f)
                curveToRelative(-1.4f, -0.6f, -2.6f, -1.7f, -3.6f, -3.3f)
                curveToRelative(0.3f, -0.5f, 0.5f, -1.0f, 0.8f, -1.5f)
                curveToRelative(0.3f, -0.7f, 0.6f, -1.4f, 0.8f, -2.1f)
                curveToRelative(0.5f, -1.7f, 6.8f, 0.5f, 5.9f, 3.2f)
                curveToRelative(-0.6f, 1.4f, -1.2f, 2.8f, -2.0f, 4.1f)
                close()
                moveTo(21.5f, 79.3f)
                curveToRelative(-3.2f, 1.3f, -7.0f, 1.2f, -10.2f, -0.2f)
                curveToRelative(-3.7f, -1.7f, 0.1f, -7.5f, 2.2f, -6.3f)
                curveToRelative(0.8f, 0.4f, 1.6f, 0.7f, 2.4f, 0.8f)
                curveToRelative(1.6f, 2.4f, 3.5f, 4.3f, 5.6f, 5.7f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF1FA385), 1.0f to Color(0xFF2ECCAA), start =
                    Offset(45.19f,63.8f), end = Offset(23.52f,63.8f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.4f, 59.5f)
                verticalLineToRelative(-0.1f)
                curveToRelative(0.0f, -4.2f, 1.8f, -8.5f, 5.2f, -10.7f)
                curveToRelative(1.3f, -0.8f, 2.8f, -1.3f, 4.3f, -1.3f)
                horizontalLineToRelative(0.1f)
                verticalLineToRelative(6.6f)
                curveToRelative(-0.2f, 0.0f, -0.4f, 0.0f, -0.6f, 0.1f)
                curveToRelative(-1.0f, 0.4f, -1.6f, 1.5f, -2.0f, 2.5f)
                curveToRelative(-0.3f, 0.9f, -0.5f, 1.9f, -0.5f, 2.9f)
                verticalLineToRelative(0.3f)
                curveToRelative(0.0f, 2.5f, 0.5f, 5.0f, 1.5f, 7.3f)
                curveToRelative(1.1f, 2.6f, 2.8f, 5.0f, 5.3f, 6.0f)
                curveToRelative(1.9f, 0.8f, 4.0f, 0.6f, 5.7f, -0.3f)
                curveToRelative(2.1f, -1.2f, 3.6f, -3.3f, 4.6f, -5.6f)
                curveToRelative(2.1f, -4.7f, 2.1f, -10.4f, 0.1f, -15.3f)
                curveToRelative(2.0f, -1.0f, 2.0f, -3.1f, 2.0f, -3.1f)
                reflectiveCurveToRelative(1.9f, 1.4f, 4.0f, 0.5f)
                curveToRelative(2.8f, 6.6f, 2.7f, 14.4f, -0.2f, 20.9f)
                curveTo(41.2f, 74.0f, 38.4f, 77.3f, 34.7f, 79.0f)
                curveToRelative(-3.3f, 1.5f, -7.1f, 1.6f, -10.4f, 0.1f)
                curveToRelative(-3.0f, -1.2f, -5.4f, -3.5f, -7.1f, -6.2f)
                curveToRelative(-2.6f, -3.9f, -3.8f, -8.7f, -3.8f, -13.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.2f, 59.8f)
                horizontalLineToRelative(2.1f)
                lineToRelative(1.0f, 5.7f)
                lineToRelative(0.3f, 1.8f)
                lineToRelative(0.3f, 1.8f)
                horizontalLineToRelative(0.1f)
                curveToRelative(0.1f, -0.6f, 0.3f, -1.2f, 0.4f, -1.8f)
                curveToRelative(0.1f, -0.6f, 0.2f, -1.2f, 0.4f, -1.8f)
                lineToRelative(1.4f, -5.7f)
                lineTo(59.0f, 59.8f)
                lineToRelative(1.4f, 5.7f)
                curveToRelative(0.1f, 0.6f, 0.3f, 1.2f, 0.4f, 1.8f)
                reflectiveCurveToRelative(0.3f, 1.2f, 0.4f, 1.8f)
                lineTo(61.0f, 69.1f)
                lineToRelative(0.3f, -1.8f)
                lineToRelative(0.3f, -1.8f)
                lineToRelative(1.0f, -5.7f)
                horizontalLineToRelative(1.9f)
                lineToRelative(-2.2f, 11.3f)
                horizontalLineToRelative(-2.5f)
                lineToRelative(-1.4f, -6.0f)
                curveToRelative(-0.1f, -0.4f, -0.2f, -0.9f, -0.3f, -1.3f)
                curveToRelative(-0.1f, -0.4f, -0.2f, -0.9f, -0.2f, -1.3f)
                horizontalLineToRelative(-0.1f)
                curveToRelative(-0.1f, 0.4f, -0.2f, 0.9f, -0.3f, 1.3f)
                curveToRelative(-0.1f, 0.4f, -0.2f, 0.9f, -0.3f, 1.3f)
                lineToRelative(-1.4f, 6.0f)
                horizontalLineToRelative(-2.4f)
                lineToRelative(-2.2f, -11.3f)
                close()
                moveTo(67.5f, 59.8f)
                horizontalLineToRelative(6.8f)
                verticalLineToRelative(1.7f)
                horizontalLineToRelative(-4.8f)
                verticalLineToRelative(2.9f)
                horizontalLineToRelative(4.1f)
                verticalLineToRelative(1.7f)
                horizontalLineToRelative(-4.1f)
                verticalLineToRelative(3.3f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.7f)
                horizontalLineToRelative(-7.0f)
                lineTo(67.5f, 59.8f)
                close()
                moveTo(78.1f, 59.8f)
                horizontalLineToRelative(3.6f)
                curveToRelative(0.6f, 0.0f, 1.1f, 0.0f, 1.6f, 0.1f)
                reflectiveCurveToRelative(0.9f, 0.3f, 1.3f, 0.5f)
                reflectiveCurveToRelative(0.6f, 0.5f, 0.8f, 0.9f)
                curveToRelative(0.2f, 0.4f, 0.3f, 0.8f, 0.3f, 1.3f)
                reflectiveCurveToRelative(-0.1f, 1.0f, -0.4f, 1.5f)
                curveToRelative(-0.3f, 0.5f, -0.7f, 0.8f, -1.2f, 1.0f)
                verticalLineToRelative(0.1f)
                curveToRelative(0.6f, 0.1f, 1.1f, 0.4f, 1.6f, 0.9f)
                curveToRelative(0.4f, 0.4f, 0.6f, 1.0f, 0.6f, 1.8f)
                curveToRelative(0.0f, 0.6f, -0.1f, 1.1f, -0.3f, 1.5f)
                curveToRelative(-0.2f, 0.4f, -0.5f, 0.8f, -0.9f, 1.0f)
                curveToRelative(-0.4f, 0.3f, -0.8f, 0.5f, -1.4f, 0.6f)
                reflectiveCurveToRelative(-1.1f, 0.2f, -1.7f, 0.2f)
                horizontalLineToRelative(-3.9f)
                lineTo(78.1f, 59.8f)
                close()
                moveTo(81.6f, 64.5f)
                curveToRelative(0.8f, 0.0f, 1.4f, -0.1f, 1.7f, -0.4f)
                curveToRelative(0.4f, -0.3f, 0.5f, -0.7f, 0.5f, -1.2f)
                curveToRelative(0.0f, -0.6f, -0.2f, -0.9f, -0.6f, -1.2f)
                curveToRelative(-0.4f, -0.2f, -0.9f, -0.3f, -1.7f, -0.3f)
                lineTo(80.0f, 61.4f)
                verticalLineToRelative(3.1f)
                horizontalLineToRelative(1.6f)
                close()
                moveTo(81.8f, 69.6f)
                curveToRelative(0.8f, 0.0f, 1.5f, -0.2f, 1.9f, -0.5f)
                curveToRelative(0.5f, -0.3f, 0.7f, -0.8f, 0.7f, -1.4f)
                curveToRelative(0.0f, -0.6f, -0.2f, -1.0f, -0.7f, -1.3f)
                curveToRelative(-0.4f, -0.3f, -1.1f, -0.4f, -1.9f, -0.4f)
                horizontalLineToRelative(-1.7f)
                verticalLineToRelative(3.6f)
                horizontalLineToRelative(1.7f)
                close()
                moveTo(89.8f, 59.8f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(9.6f)
                horizontalLineToRelative(4.7f)
                verticalLineToRelative(1.7f)
                horizontalLineToRelative(-6.7f)
                lineTo(89.8f, 59.8f)
                close()
                moveTo(105.0f, 68.0f)
                horizontalLineToRelative(-3.8f)
                lineToRelative(-0.9f, 3.1f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(3.7f, -11.3f)
                horizontalLineToRelative(2.4f)
                lineToRelative(3.7f, 11.3f)
                lineTo(106.0f, 71.1f)
                lineToRelative(-1.0f, -3.1f)
                close()
                moveTo(104.6f, 66.5f)
                lineToRelative(-0.4f, -1.4f)
                curveToRelative(-0.2f, -0.6f, -0.4f, -1.2f, -0.5f, -1.9f)
                curveToRelative(-0.2f, -0.6f, -0.3f, -1.3f, -0.5f, -1.9f)
                horizontalLineToRelative(-0.1f)
                curveToRelative(-0.2f, 0.6f, -0.3f, 1.3f, -0.5f, 1.9f)
                curveToRelative(-0.2f, 0.6f, -0.3f, 1.2f, -0.5f, 1.8f)
                lineToRelative(-0.4f, 1.4f)
                horizontalLineToRelative(2.9f)
                close()
                moveTo(111.9f, 61.5f)
                horizontalLineToRelative(-3.3f)
                verticalLineToRelative(-1.7f)
                horizontalLineToRelative(8.6f)
                verticalLineToRelative(1.7f)
                horizontalLineToRelative(-3.3f)
                verticalLineToRelative(9.6f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-9.6f)
                close()
                moveTo(120.4f, 59.8f)
                horizontalLineToRelative(6.8f)
                verticalLineToRelative(1.7f)
                horizontalLineToRelative(-4.8f)
                verticalLineToRelative(2.9f)
                horizontalLineToRelative(4.1f)
                verticalLineToRelative(1.7f)
                horizontalLineToRelative(-4.1f)
                verticalLineToRelative(3.3f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.7f)
                horizontalLineToRelative(-7.0f)
                lineTo(120.4f, 59.8f)
                close()
            }
        }
        .build()
        return _originalWordmark!!
    }

private var _originalWordmark: ImageVector? = null
