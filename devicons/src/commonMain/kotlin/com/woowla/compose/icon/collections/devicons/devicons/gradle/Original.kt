package com.woowla.compose.icon.collections.devicons.devicons.gradle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.GradleGroup

public val GradleGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF02303a)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(103.93f, 17.2f)
                arcToRelative(20.29f, 20.29f, 0.0f, false, false, -11.09f, 5.27f)
                arcToRelative(1.98f, 1.98f, 0.0f, false, false, -0.62f, 1.39f)
                arcToRelative(2.03f, 2.03f, 0.0f, false, false, 0.58f, 1.4f)
                lineToRelative(2.53f, 2.61f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, false, 2.53f, 0.18f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, true, 6.96f, -2.32f)
                arcToRelative(11.62f, 11.62f, 0.0f, false, true, 8.24f, 19.85f)
                curveToRelative(-16.11f, 16.11f, -37.62f, -29.02f, -86.42f, -5.8f)
                arcToRelative(6.64f, 6.64f, 0.0f, false, false, -2.96f, 9.29f)
                lineToRelative(8.36f, 14.48f)
                arcToRelative(6.64f, 6.64f, 0.0f, false, false, 8.97f, 2.47f)
                lineToRelative(0.2f, -0.11f)
                lineToRelative(-0.16f, 0.11f)
                lineToRelative(3.71f, -2.08f)
                arcToRelative(85.04f, 85.04f, 0.0f, false, false, 11.68f, -8.72f)
                arcToRelative(2.06f, 2.06f, 0.0f, false, true, 2.67f, 0.0f)
                arcToRelative(1.89f, 1.89f, 0.0f, false, true, 0.73f, 1.48f)
                arcToRelative(1.95f, 1.95f, 0.0f, false, true, -0.64f, 1.48f)
                arcToRelative(87.56f, 87.56f, 0.0f, false, true, -12.31f, 9.14f)
                horizontalLineToRelative(-0.12f)
                lineToRelative(-3.71f, 2.07f)
                arcToRelative(10.35f, 10.35f, 0.0f, false, true, -5.14f, 1.34f)
                arcToRelative(10.67f, 10.67f, 0.0f, false, true, -9.21f, -5.27f)
                lineToRelative(-7.91f, -13.67f)
                curveTo(5.61f, 62.5f, -3.61f, 83.18f, 1.35f, 109.42f)
                arcToRelative(1.95f, 1.95f, 0.0f, false, false, 1.89f, 1.57f)
                horizontalLineToRelative(9.02f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, false, 1.9f, -1.69f)
                arcToRelative(13.2f, 13.2f, 0.0f, false, true, 26.19f, 0.0f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, false, 1.92f, 1.69f)
                horizontalLineToRelative(8.79f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, false, 1.9f, -1.69f)
                arcToRelative(13.21f, 13.21f, 0.0f, false, true, 26.21f, 0.0f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, false, 1.9f, 1.69f)
                horizontalLineToRelative(8.67f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, false, 1.93f, -1.89f)
                curveToRelative(0.21f, -12.22f, 3.5f, -26.27f, 12.9f, -33.3f)
                curveToRelative(32.56f, -24.36f, 24.01f, -45.24f, 16.47f, -52.82f)
                arcToRelative(20.29f, 20.29f, 0.0f, false, false, -17.11f, -5.76f)
                close()
                moveTo(84.69f, 52.87f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 3.14f, 6.97f)
                verticalLineToRelative(-0.02f)
                lineToRelative(-6.21f, -3.12f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 3.07f, -3.83f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
