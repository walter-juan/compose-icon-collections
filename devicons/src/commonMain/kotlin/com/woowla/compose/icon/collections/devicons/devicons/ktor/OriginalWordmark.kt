package com.woowla.compose.icon.collections.devicons.devicons.ktor

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
import com.woowla.compose.icon.collections.devicons.devicons.KtorGroup

public val KtorGroup.OriginalWordmark: ImageVector
    get() {
        if (_originalWordmark != null) {
            return _originalWordmark!!
        }
        _originalWordmark = Builder(name = "OriginalWordmark", defaultWidth = 128.0.dp,
                defaultHeight = 128.0.dp, viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFF07C3F2), 1.0f to Color(0xFF6B57FF), start =
                    Offset(15.72f,49.77f), end = Offset(29.62f,63.67f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(36.57f, 56.91f)
                lineTo(22.85f, 43.2f)
                lineToRelative(-7.24f, 7.24f)
                lineToRelative(-6.47f, 6.47f)
                lineToRelative(13.71f, 13.72f)
                close()
                moveTo(36.57f, 56.91f)
            }
            path(fill = linearGradient(0.0f to Color(0xFFB74AF7), 0.49f to Color(0xFFFC801D), 1.0f
                    to Color(0xFFFC801D), start = Offset(30.04f,64.1f), end =
                    Offset(43.19f,77.24f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(22.85f, 70.63f)
                lineToRelative(6.83f, 6.83f)
                lineToRelative(6.88f, 6.89f)
                lineToRelative(13.72f, -13.72f)
                lineTo(36.57f, 56.91f)
                close()
                moveTo(22.85f, 70.63f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(36.57f, 56.91f)
                lineTo(22.85f, 56.91f)
                lineTo(22.85f, 70.63f)
                lineTo(36.57f, 70.63f)
                close()
                moveTo(75.76f, 54.65f)
                lineTo(70.82f, 54.65f)
                lineToRelative(-7.37f, 8.0f)
                verticalLineToRelative(-8.0f)
                lineTo(59.43f, 54.65f)
                verticalLineToRelative(18.29f)
                horizontalLineToRelative(4.02f)
                verticalLineToRelative(-5.59f)
                lineToRelative(2.12f, -2.19f)
                lineToRelative(5.67f, 7.78f)
                horizontalLineToRelative(4.83f)
                lineToRelative(-7.78f, -10.53f)
                close()
                moveTo(81.53f, 55.27f)
                lineTo(77.56f, 55.27f)
                verticalLineToRelative(3.58f)
                horizontalLineToRelative(-1.67f)
                verticalLineToRelative(3.39f)
                horizontalLineToRelative(1.67f)
                verticalLineToRelative(6.64f)
                curveToRelative(0.0f, 3.24f, 1.64f, 4.21f, 4.07f, 4.21f)
                arcToRelative(5.86f, 5.86f, 0.0f, false, false, 3.14f, -0.81f)
                verticalLineToRelative(-3.18f)
                arcToRelative(4.04f, 4.04f, 0.0f, false, true, -1.96f, 0.5f)
                curveToRelative(-0.89f, 0.0f, -1.28f, -0.44f, -1.28f, -1.36f)
                verticalLineToRelative(-5.98f)
                horizontalLineToRelative(3.29f)
                verticalLineToRelative(-3.39f)
                horizontalLineToRelative(-3.29f)
                close()
                moveTo(93.75f, 58.51f)
                curveToRelative(-4.36f, 0.0f, -7.6f, 3.27f, -7.6f, 7.29f)
                verticalLineToRelative(0.05f)
                curveToRelative(0.0f, 4.02f, 3.21f, 7.24f, 7.55f, 7.24f)
                curveToRelative(4.36f, 0.0f, 7.6f, -3.27f, 7.6f, -7.29f)
                verticalLineToRelative(-0.05f)
                curveToRelative(0.0f, -4.02f, -3.21f, -7.24f, -7.55f, -7.24f)
                close()
                moveTo(97.39f, 65.85f)
                curveToRelative(0.0f, 2.07f, -1.36f, 3.82f, -3.63f, 3.82f)
                curveToRelative(-2.19f, 0.0f, -3.68f, -1.8f, -3.68f, -3.87f)
                verticalLineToRelative(-0.05f)
                curveToRelative(0.0f, -2.07f, 1.36f, -3.82f, 3.63f, -3.82f)
                curveToRelative(2.19f, 0.0f, 3.68f, 1.8f, 3.68f, 3.87f)
                close()
                moveTo(107.4f, 61.75f)
                verticalLineToRelative(-2.82f)
                horizontalLineToRelative(-3.97f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(3.97f)
                verticalLineToRelative(-5.17f)
                curveToRelative(0.0f, -3.34f, 1.62f, -4.94f, 4.26f, -4.94f)
                horizontalLineToRelative(0.21f)
                verticalLineToRelative(-4.15f)
                curveToRelative(-2.35f, -0.11f, -3.66f, 1.15f, -4.47f, 3.08f)
                close()
                moveTo(107.4f, 61.75f)
            }
        }
        .build()
        return _originalWordmark!!
    }

private var _originalWordmark: ImageVector? = null
