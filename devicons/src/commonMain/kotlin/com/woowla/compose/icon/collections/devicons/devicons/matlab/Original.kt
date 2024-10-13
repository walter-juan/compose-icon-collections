package com.woowla.compose.icon.collections.devicons.devicons.matlab

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
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
import com.woowla.compose.icon.collections.devicons.devicons.MatlabGroup

public val MatlabGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 70.2f)
                lineToRelative(31.88f, -12.88f)
                arcToRelative(82.62f, 82.62f, 0.0f, false, true, 10.88f, -11.8f)
                curveToRelative(2.64f, -1.4f, 7.6f, -0.64f, 16.68f, -11.92f)
                curveToRelative(8.8f, -11.0f, 11.6f, -20.4f, 15.72f, -20.4f)
                curveToRelative(6.52f, 0.0f, 11.32f, 14.08f, 18.6f, 35.4f)
                arcTo(461.75f, 461.75f, 0.0f, false, false, 120.0f, 96.48f)
                curveToRelative(-7.6f, -7.08f, -14.08f, -14.72f, -21.48f, -14.52f)
                curveToRelative(-6.88f, 0.16f, -14.52f, 8.32f, -22.88f, 18.8f)
                curveTo(69.0f, 109.16f, 60.2f, 114.92f, 56.76f, 114.8f)
                curveToRelative(0.0f, 0.0f, -8.88f, -25.12f, -16.32f, -29.2f)
                arcToRelative(10.56f, 10.56f, 0.0f, false, false, -9.56f, 0.8f)
                lineTo(8.0f, 70.16f)
                close()
                moveTo(8.0f, 70.2f)
            }
            path(fill = linearGradient(0.0f to Color(0xFF551122), 0.23f to Color(0xFF552233), 0.36f
                    to Color(0xFF553344), 0.51f to Color(0xFF664455), 0.66f to Color(0xFF556688),
                    0.84f to Color(0xFF2299DD), start = Offset(67.21f,61.48f), end =
                    Offset(60.05f,38.36f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(79.2f, 16.08f)
                curveToRelative(-2.68f, 3.6f, -5.92f, 10.2f, -11.76f, 17.52f)
                curveToRelative(-9.08f, 11.28f, -14.0f, 10.52f, -16.68f, 11.92f)
                arcToRelative(78.67f, 78.67f, 0.0f, false, false, -10.88f, 11.8f)
                lineToRelative(13.2f, 9.64f)
                curveTo(64.28f, 51.68f, 70.28f, 35.12f, 74.96f, 24.4f)
                arcToRelative(54.65f, 54.65f, 0.0f, false, true, 4.24f, -8.32f)
                close()
                moveTo(79.2f, 16.08f)
            }
            path(fill = linearGradient(0.08f to Color(0xFFCC3333), 0.19f to Color(0xFFDE5239), 0.31f
                    to Color(0xFFF06E3E), 0.42f to Color(0xFFFA8042), 0.5f to Color(0xFFFE8643),
                    0.58f to Color(0xFFFA7F42), 0.7f to Color(0xFFEF6C3E), 0.83f to
                    Color(0xFFDC4C37), 0.92f to Color(0xFFCF3633), start = Offset(118.84f,75.93f),
                    end = Offset(46.84f,58.25f)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(83.2f, 13.2f)
                curveToRelative(-8.72f, 0.0f, -14.68f, 45.92f, -46.88f, 71.56f)
                curveToRelative(9.04f, -1.48f, 16.88f, 20.96f, 20.48f, 30.04f)
                curveToRelative(16.0f, -2.72f, 28.8f, -33.32f, 41.72f, -32.84f)
                curveToRelative(7.4f, 0.28f, 13.88f, 7.44f, 21.48f, 14.52f)
                curveTo(102.64f, 60.0f, 94.52f, 13.2f, 83.2f, 13.2f)
                close()
                moveTo(83.2f, 13.2f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
