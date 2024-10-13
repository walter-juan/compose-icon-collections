package com.woowla.compose.icon.collections.devicons.devicons.jiraalign

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
import com.woowla.compose.icon.collections.devicons.devicons.JiraalignGroup

public val JiraalignGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.15f to Color(0xFF0052CC), 0.5f to Color(0xFF0E64DE), 1.0f
                    to Color(0xFF2684FF), start = Offset(53.69f,95.39f), end =
                    Offset(63.71f,44.28f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.56f, 0.0f)
                curveToRelative(0.0f, 24.1f, 19.49f, 43.76f, 43.38f, 43.76f)
                horizontalLineToRelative(40.14f)
                verticalLineToRelative(40.72f)
                horizontalLineToRelative(43.37f)
                lineTo(127.44f, 7.25f)
                curveToRelative(0.0f, -3.75f, -3.01f, -7.02f, -6.72f, -7.02f)
                close()
                moveTo(0.56f, 0.0f)
            }
            path(fill = linearGradient(0.15f to Color(0xFF0052CC), 0.5f to Color(0xFF0E64DE), 1.0f
                    to Color(0xFF2684FF), start = Offset(74.18f,32.7f), end = Offset(64.16f,83.8f)),
                    stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                    Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(127.21f, 128.0f)
                curveToRelative(0.0f, -24.1f, -19.48f, -43.52f, -43.38f, -43.52f)
                lineTo(43.93f, 84.48f)
                verticalLineToRelative(-40.72f)
                lineTo(0.56f, 43.76f)
                verticalLineToRelative(77.22f)
                curveToRelative(0.0f, 3.74f, 3.02f, 7.02f, 6.72f, 7.02f)
                close()
                moveTo(127.21f, 128.0f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
