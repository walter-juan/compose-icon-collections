package com.woowla.compose.icon.collections.devicons.devicons.bootstrap

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
import com.woowla.compose.icon.collections.devicons.devicons.BootstrapGroup

public val BootstrapGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFF9013FE), 1.0f to Color(0xFF6610F2), start =
                    Offset(19.8f,17.27f), end = Offset(129.71f,104.51f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.98f, 27.71f)
                curveToRelative(-0.24f, -6.82f, 5.07f, -13.1f, 12.25f, -13.1f)
                horizontalLineToRelative(73.54f)
                curveToRelative(7.18f, 0.0f, 12.49f, 6.28f, 12.25f, 13.1f)
                curveToRelative(-0.23f, 6.55f, 0.07f, 15.03f, 2.2f, 21.94f)
                curveToRelative(2.14f, 6.94f, 5.75f, 11.32f, 11.66f, 11.88f)
                verticalLineToRelative(6.39f)
                curveToRelative(-5.91f, 0.56f, -9.52f, 4.95f, -11.66f, 11.88f)
                curveToRelative(-2.13f, 6.91f, -2.43f, 15.39f, -2.2f, 21.94f)
                curveToRelative(0.24f, 6.82f, -5.07f, 13.1f, -12.25f, 13.1f)
                horizontalLineToRelative(-73.54f)
                curveToRelative(-7.18f, 0.0f, -12.49f, -6.28f, -12.25f, -13.1f)
                curveToRelative(0.23f, -6.55f, -0.07f, -15.03f, -2.2f, -21.94f)
                curveToRelative(-2.14f, -6.93f, -5.76f, -11.32f, -11.67f, -11.88f)
                verticalLineToRelative(-6.39f)
                curveToRelative(5.91f, -0.56f, 9.53f, -4.95f, 11.67f, -11.88f)
                curveToRelative(2.13f, -6.91f, 2.43f, -15.39f, 2.2f, -21.94f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF1E5FC), start =
                    Offset(49.03f,41.94f), end = Offset(73.6f,83.48f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(67.11f, 91.74f)
                curveToRelative(11.62f, 0.0f, 18.62f, -5.69f, 18.62f, -15.07f)
                curveToRelative(0.0f, -7.09f, -5.0f, -12.23f, -12.41f, -13.04f)
                lineToRelative(0.0f, -0.3f)
                curveToRelative(5.45f, -0.89f, 9.73f, -5.95f, 9.73f, -11.6f)
                curveToRelative(0.0f, -8.05f, -6.36f, -13.3f, -16.05f, -13.3f)
                lineToRelative(-21.8f, 0.0f)
                lineToRelative(0.0f, 53.31f)
                close()
                moveTo(53.67f, 45.19f)
                lineToRelative(11.28f, 0.0f)
                curveToRelative(6.13f, 0.0f, 9.61f, 2.73f, 9.61f, 7.68f)
                curveToRelative(0.0f, 5.28f, -4.05f, 8.24f, -11.39f, 8.24f)
                lineToRelative(-9.5f, 0.0f)
                close()
                moveTo(53.67f, 84.98f)
                lineToRelative(0.0f, -17.55f)
                lineToRelative(11.2f, 0.0f)
                curveToRelative(8.02f, 0.0f, 12.19f, 2.96f, 12.19f, 8.72f)
                curveToRelative(0.0f, 5.76f, -4.05f, 8.83f, -11.69f, 8.83f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
