package com.woowla.compose.icon.collections.devicons.devicons.bamboo

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
import com.woowla.compose.icon.collections.devicons.devicons.BambooGroup

public val BambooGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF2684ff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.13f, 70.63f)
                horizontalLineToRelative(-20.0f)
                curveToRelative(-1.24f, 0.0f, -2.46f, 0.96f, -2.6f, 2.19f)
                curveToRelative(-1.1f, 7.95f, -7.95f, 14.11f, -16.16f, 14.11f)
                lineToRelative(5.34f, 24.66f)
                curveToRelative(19.45f, -2.6f, 34.65f, -18.49f, 36.02f, -38.22f)
                curveToRelative(0.14f, -1.5f, -1.1f, -2.74f, -2.6f, -2.74f)
                close()
                moveTo(104.13f, 70.63f)
                moveTo(69.75f, 69.95f)
                lineToRelative(28.77f, -24.66f)
                curveToRelative(1.23f, -1.1f, 1.23f, -2.88f, 0.0f, -3.97f)
                lineTo(69.75f, 16.66f)
                curveToRelative(-1.64f, -1.51f, -4.25f, -0.27f, -4.25f, 1.92f)
                verticalLineToRelative(49.31f)
                curveToRelative(-0.14f, 2.33f, 2.46f, 3.56f, 4.25f, 2.05f)
                close()
                moveTo(69.75f, 69.95f)
            }
            path(fill = linearGradient(0.0f to Color(0xFF0052CC), 1.0f to Color(0xFF2684FF), start =
                    Offset(44.87f,29.94f), end = Offset(44.87f,86.43f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.27f, 75.98f)
                curveTo(26.88f, 96.25f, 44.27f, 112.0f, 65.37f, 112.0f)
                lineTo(65.37f, 86.93f)
                curveToRelative(-9.04f, 0.0f, -16.44f, -7.26f, -16.44f, -16.3f)
                close()
                moveTo(24.27f, 75.98f)
            }
            path(fill = linearGradient(0.0f to Color(0xFF0052CC), 1.0f to Color(0xFF2684FF), start =
                    Offset(44.67f,29.94f), end = Offset(44.67f,86.43f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 70.22f)
                verticalLineToRelative(0.41f)
                horizontalLineToRelative(25.07f)
                curveToRelative(0.0f, -9.04f, 7.4f, -16.3f, 16.44f, -16.3f)
                lineTo(60.16f, 29.68f)
                curveTo(39.89f, 32.28f, 24.14f, 49.4f, 24.0f, 70.22f)
                close()
                moveTo(24.0f, 70.22f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
