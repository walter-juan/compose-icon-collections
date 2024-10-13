package com.woowla.compose.icon.collections.devicons.devicons.nodejs

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
import com.woowla.compose.icon.collections.devicons.devicons.NodejsGroup

public val NodejsGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFF3F873F), 0.33f to Color(0xFF3F8B3D), 0.64f
                    to Color(0xFF3E9638), 0.93f to Color(0xFF3DA92E), 1.0f to Color(0xFF3DAE2B),
                    start = Offset(84.23f,22.37f), end = Offset(38.73f,114.61f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(66.96f, 0.82f)
                arcToRelative(6.07f, 6.07f, 0.0f, false, false, -6.03f, 0.0f)
                lineTo(11.1f, 29.76f)
                curveToRelative(-1.89f, 1.07f, -2.96f, 3.1f, -2.96f, 5.24f)
                verticalLineToRelative(57.99f)
                curveToRelative(0.0f, 2.14f, 1.18f, 4.17f, 2.96f, 5.24f)
                lineToRelative(49.82f, 28.93f)
                arcToRelative(6.07f, 6.07f, 0.0f, false, false, 6.04f, 0.0f)
                lineToRelative(49.82f, -28.93f)
                curveToRelative(1.89f, -1.07f, 2.96f, -3.1f, 2.96f, -5.24f)
                verticalLineTo(35.0f)
                curveToRelative(0.0f, -2.14f, -1.18f, -4.17f, -2.96f, -5.24f)
                close()
            }
            path(fill = linearGradient(0.14f to Color(0xFF3F873F), 0.4f to Color(0xFF52A044), 0.71f
                    to Color(0xFF64B749), 0.91f to Color(0xFF6ABF4B), start = Offset(56.37f,70.77f),
                    end = Offset(183.32f,-22.45f)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.9f, 29.76f)
                lineTo(66.84f, 0.82f)
                arcTo(8.16f, 8.16f, 0.0f, false, false, 65.3f, 0.23f)
                lineTo(9.21f, 96.8f)
                arcToRelative(6.25f, 6.25f, 0.0f, false, false, 1.66f, 1.43f)
                lineToRelative(50.06f, 28.93f)
                curveToRelative(1.42f, 0.83f, 3.08f, 1.07f, 4.61f, 0.6f)
                lineToRelative(52.66f, -96.93f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, -1.3f, -1.07f)
                close()
            }
            path(fill = linearGradient(0.09f to Color(0xFF6ABF4B), 0.29f to Color(0xFF64B749), 0.6f
                    to Color(0xFF52A044), 0.86f to Color(0xFF3F873F), start = Offset(6.32f,63.97f),
                    end = Offset(121.6f,63.97f)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.9f, 98.22f)
                curveToRelative(1.42f, -0.83f, 2.48f, -2.26f, 2.96f, -3.81f)
                lineTo(65.07f, 0.11f)
                curveToRelative(-1.42f, -0.24f, -2.96f, -0.12f, -4.26f, 0.71f)
                lineTo(11.1f, 29.64f)
                lineToRelative(53.61f, 98.36f)
                curveToRelative(0.71f, -0.12f, 1.54f, -0.36f, 2.25f, -0.71f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
