package com.woowla.compose.icon.collections.devicons.devicons.gitpod

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.GitpodGroup

public val GitpodGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFFFFB45B), 1.0f to Color(0xFFFF8A00), start =
                    Offset(96.34f,19.78f), end = Offset(30.34f,112.87f)), stroke =
                    SolidColor(Color(0x00000000)), strokeLineWidth = 0.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(76.05f, 6.92f)
                curveToRelative(3.8f, 6.01f, 1.49f, 13.66f, -5.16f, 17.09f)
                lineTo(29.52f, 45.36f)
                curveToRelative(-1.1f, 0.57f, -1.77f, 1.61f, -1.77f, 2.75f)
                verticalLineToRelative(33.51f)
                curveToRelative(0.0f, 1.14f, 0.67f, 2.19f, 1.77f, 2.75f)
                lineToRelative(32.73f, 16.89f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, false, 3.51f, 0.0f)
                lineTo(98.48f, 84.36f)
                curveToRelative(1.1f, -0.56f, 1.77f, -1.61f, 1.77f, -2.75f)
                lineTo(100.25f, 60.78f)
                lineTo(70.82f, 75.77f)
                curveToRelative(-6.67f, 3.4f, -15.13f, 1.27f, -18.9f, -4.75f)
                curveToRelative(-3.77f, -6.02f, -1.41f, -13.66f, 5.27f, -17.07f)
                lineToRelative(42.11f, -21.45f)
                curveTo(112.13f, 25.96f, 128.0f, 34.33f, 128.0f, 47.63f)
                verticalLineToRelative(36.53f)
                curveToRelative(0.0f, 8.56f, -5.08f, 16.45f, -13.31f, 20.7f)
                lineTo(77.1f, 124.25f)
                curveToRelative(-8.12f, 4.19f, -18.09f, 4.19f, -26.2f, 0.0f)
                lineToRelative(-37.59f, -19.4f)
                curveTo(5.08f, 100.61f, 0.0f, 92.71f, 0.0f, 84.16f)
                verticalLineToRelative(-38.59f)
                curveToRelative(0.0f, -8.55f, 5.08f, -16.46f, 13.31f, -20.7f)
                lineTo(57.12f, 2.26f)
                curveToRelative(6.65f, -3.43f, 15.13f, -1.34f, 18.93f, 4.66f)
                close()
                moveTo(76.05f, 6.92f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
