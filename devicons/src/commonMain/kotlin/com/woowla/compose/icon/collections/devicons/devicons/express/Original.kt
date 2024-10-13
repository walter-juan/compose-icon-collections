package com.woowla.compose.icon.collections.devicons.devicons.express

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.ExpressGroup

public val ExpressGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(126.67f, 98.44f)
                curveToRelative(-4.56f, 1.16f, -7.38f, 0.05f, -9.91f, -3.75f)
                curveToRelative(-5.68f, -8.51f, -11.95f, -16.63f, -18.0f, -24.9f)
                curveToRelative(-0.78f, -1.07f, -1.59f, -2.12f, -2.6f, -3.45f)
                curveTo(89.0f, 76.0f, 81.85f, 85.2f, 75.14f, 94.77f)
                curveToRelative(-2.4f, 3.42f, -4.92f, 4.91f, -9.4f, 3.7f)
                lineToRelative(26.92f, -36.13f)
                lineTo(67.6f, 29.71f)
                curveToRelative(4.31f, -0.84f, 7.29f, -0.41f, 9.93f, 3.45f)
                curveToRelative(5.83f, 8.52f, 12.26f, 16.63f, 18.67f, 25.21f)
                curveToRelative(6.45f, -8.55f, 12.8f, -16.67f, 18.8f, -25.11f)
                curveToRelative(2.41f, -3.42f, 5.0f, -4.72f, 9.33f, -3.46f)
                curveToRelative(-3.28f, 4.35f, -6.49f, 8.63f, -9.72f, 12.88f)
                curveToRelative(-4.36f, 5.73f, -8.64f, 11.53f, -13.16f, 17.14f)
                curveToRelative(-1.61f, 2.0f, -1.35f, 3.3f, 0.09f, 5.19f)
                curveTo(109.9f, 76.0f, 118.16f, 87.1f, 126.67f, 98.44f)
                close()
                moveTo(1.33f, 61.74f)
                curveToRelative(0.72f, -3.61f, 1.2f, -7.29f, 2.2f, -10.83f)
                curveToRelative(6.0f, -21.43f, 30.6f, -30.34f, 47.5f, -17.06f)
                curveTo(60.93f, 41.64f, 63.39f, 52.62f, 62.9f, 65.0f)
                lineTo(7.1f, 65.0f)
                curveToRelative(-0.84f, 22.21f, 15.15f, 35.62f, 35.53f, 28.78f)
                curveToRelative(7.15f, -2.4f, 11.36f, -8.0f, 13.47f, -15.0f)
                curveToRelative(1.07f, -3.51f, 2.84f, -4.06f, 6.14f, -3.06f)
                curveToRelative(-1.69f, 8.76f, -5.52f, 16.08f, -13.52f, 20.66f)
                curveToRelative(-12.0f, 6.86f, -29.13f, 4.64f, -38.14f, -4.89f)
                curveTo(5.26f, 85.89f, 3.0f, 78.92f, 2.0f, 71.39f)
                curveToRelative(-0.15f, -1.2f, -0.46f, -2.38f, -0.7f, -3.57f)
                quadToRelative(0.03f, -3.04f, 0.03f, -6.08f)
                close()
                moveTo(7.2f, 60.25f)
                horizontalLineToRelative(50.43f)
                curveToRelative(-0.33f, -16.06f, -10.33f, -27.47f, -24.0f, -27.57f)
                curveToRelative(-15.0f, -0.12f, -25.78f, 11.02f, -26.43f, 27.57f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
