package com.woowla.compose.icon.collections.devicons.devicons.confluence

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
import com.woowla.compose.icon.collections.devicons.devicons.ConfluenceGroup

public val ConfluenceGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFF0052CC), 0.92f to Color(0xFF2380FB), 1.0f
                    to Color(0xFF2684FF), start = Offset(121.55f,133.16f), end =
                    Offset(41.56f,87.23f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.66f, 96.3f)
                arcToRelative(332.06f, 332.06f, 0.0f, false, false, -4.06f, 6.58f)
                curveToRelative(-1.16f, 1.93f, -0.58f, 4.45f, 1.35f, 5.61f)
                lineToRelative(26.48f, 16.25f)
                curveToRelative(1.93f, 1.16f, 4.44f, 0.58f, 5.6f, -1.36f)
                arcToRelative(185.8f, 185.8f, 0.0f, false, true, 3.87f, -6.58f)
                curveToRelative(10.44f, -17.21f, 21.07f, -15.28f, 40.01f, -6.19f)
                lineToRelative(26.29f, 12.37f)
                curveToRelative(2.12f, 0.97f, 4.45f, 0.0f, 5.41f, -1.93f)
                lineToRelative(12.57f, -28.43f)
                curveToRelative(0.96f, -1.94f, 0.0f, -4.45f, -1.94f, -5.42f)
                curveToRelative(-5.6f, -2.52f, -16.62f, -7.74f, -26.28f, -12.57f)
                curveToRelative(-35.76f, -17.22f, -66.11f, -16.06f, -89.31f, 21.66f)
                close()
                moveTo(4.66f, 96.3f)
            }
            path(fill = linearGradient(0.0f to Color(0xFF0052CC), 0.92f to Color(0xFF2380FB), 1.0f
                    to Color(0xFF2684FF), start = Offset(6.45f,-5.21f), end =
                    Offset(86.44f,40.73f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(123.34f, 31.7f)
                arcToRelative(332.06f, 332.06f, 0.0f, false, false, 4.06f, -6.58f)
                curveToRelative(1.16f, -1.93f, 0.58f, -4.45f, -1.36f, -5.61f)
                lineTo(99.57f, 3.26f)
                curveToRelative(-1.93f, -1.16f, -4.44f, -0.58f, -5.6f, 1.36f)
                arcToRelative(178.07f, 178.07f, 0.0f, false, true, -3.87f, 6.58f)
                curveToRelative(-10.44f, 17.21f, -21.07f, 15.28f, -40.01f, 6.19f)
                lineTo(23.79f, 5.01f)
                curveToRelative(-2.12f, -0.97f, -4.44f, 0.0f, -5.41f, 1.93f)
                lineTo(5.82f, 35.37f)
                curveToRelative(-0.97f, 1.94f, 0.0f, 4.45f, 1.93f, 5.42f)
                curveToRelative(5.6f, 2.52f, 16.62f, 7.74f, 26.28f, 12.57f)
                curveToRelative(35.77f, 17.03f, 66.11f, 16.06f, 89.31f, -21.66f)
                close()
                moveTo(123.34f, 31.7f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
