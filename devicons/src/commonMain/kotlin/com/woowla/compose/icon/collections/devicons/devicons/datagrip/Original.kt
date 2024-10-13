package com.woowla.compose.icon.collections.devicons.devicons.datagrip

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
import com.woowla.compose.icon.collections.devicons.devicons.DatagripGroup

public val DatagripGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.16f to Color(0xFF21D789), 0.54f to Color(0xFF419FBC), 1.0f
                    to Color(0xFF6B57FF), start = Offset(112.54f,49.72f), end =
                    Offset(115.9f,79.52f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(115.06f, 23.68f)
                lineToRelative(7.46f, 47.91f)
                lineToRelative(-13.79f, 8.02f)
                close()
                moveTo(115.06f, 23.68f)
            }
            path(fill = linearGradient(0.0f to Color(0xFF6B57FF), 0.95f to Color(0xFF21D789), start
                    = Offset(81.43f,36.87f), end = Offset(90.12f,14.74f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(115.06f, 23.68f)
                lineTo(73.16f, 5.48f)
                lineToRelative(-11.69f, 9.7f)
                close()
                moveTo(115.06f, 23.68f)
            }
            path(fill = linearGradient(0.0f to Color(0xFF6B57FF), 0.02f to Color(0xFF685CFB), 0.28f
                    to Color(0xFF4A91CA), 0.51f to Color(0xFF34B7A7), 0.69f to Color(0xFF26CE91),
                    0.8f to Color(0xFF21D789), start = Offset(33.55f,64.63f), end =
                    Offset(41.9f,101.27f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(84.57f, 122.52f)
                lineTo(19.56f, 70.72f)
                lineTo(6.5f, 109.98f)
                close()
                moveTo(84.57f, 122.52f)
            }
            path(fill = linearGradient(0.08f to Color(0xFF21D789), 0.89f to Color(0xFF6B57FF), start
                    = Offset(12.66f,64.04f), end = Offset(115.1f,120.85f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(93.62f, 89.78f)
                lineTo(5.48f, 59.5f)
                lineToRelative(79.08f, 63.02f)
                close()
                moveTo(93.62f, 89.78f)
            }
            path(fill = linearGradient(0.31f to Color(0xFF21D789), 0.49f to Color(0xFF59A3B2), 0.77f
                    to Color(0xFFB74AF7), 1.0f to Color(0xFFFF45ED), start = Offset(13.31f,50.38f),
                    end = Offset(116.38f,50.57f)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.48f, 6.32f)
                lineTo(5.48f, 59.5f)
                lineToRelative(101.56f, 34.9f)
                lineToRelative(8.01f, -70.73f)
                close()
                moveTo(5.48f, 6.32f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.43f, 27.28f)
                horizontalLineToRelative(73.14f)
                verticalLineToRelative(73.14f)
                lineTo(27.43f, 100.43f)
                close()
                moveTo(27.43f, 27.28f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(34.85f, 36.79f)
                horizontalLineToRelative(11.81f)
                curveToRelative(9.51f, 0.0f, 16.09f, 6.53f, 16.09f, 15.06f)
                verticalLineToRelative(0.08f)
                curveToRelative(0.0f, 8.53f, -6.59f, 15.14f, -16.09f, 15.14f)
                lineTo(34.85f, 67.07f)
                close()
                moveTo(41.51f, 42.8f)
                verticalLineToRelative(18.29f)
                horizontalLineToRelative(5.16f)
                arcToRelative(8.63f, 8.63f, 0.0f, false, false, 9.12f, -9.04f)
                verticalLineToRelative(-0.11f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, false, -9.12f, -9.13f)
                close()
                moveTo(63.94f, 52.02f)
                verticalLineToRelative(-0.09f)
                arcToRelative(15.55f, 15.55f, 0.0f, false, true, 15.85f, -15.66f)
                arcToRelative(16.61f, 16.61f, 0.0f, false, true, 11.9f, 4.16f)
                lineToRelative(-4.19f, 5.06f)
                arcToRelative(11.19f, 11.19f, 0.0f, false, false, -7.91f, -3.07f)
                curveToRelative(-4.88f, 0.0f, -8.7f, 4.29f, -8.7f, 9.44f)
                verticalLineToRelative(0.08f)
                curveToRelative(0.0f, 5.53f, 3.82f, 9.61f, 9.18f, 9.61f)
                arcToRelative(10.65f, 10.65f, 0.0f, false, false, 6.29f, -1.81f)
                verticalLineToRelative(-4.34f)
                lineTo(79.64f, 55.39f)
                verticalLineToRelative(-5.75f)
                horizontalLineToRelative(13.15f)
                verticalLineToRelative(13.15f)
                arcToRelative(19.63f, 19.63f, 0.0f, false, true, -12.93f, 4.8f)
                curveToRelative(-9.43f, 0.0f, -15.92f, -6.64f, -15.92f, -15.58f)
                close()
                moveTo(34.16f, 86.7f)
                horizontalLineToRelative(27.43f)
                verticalLineToRelative(4.57f)
                horizontalLineToRelative(-27.43f)
                close()
                moveTo(34.16f, 86.7f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
