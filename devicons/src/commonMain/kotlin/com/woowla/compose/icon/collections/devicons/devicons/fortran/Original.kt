package com.woowla.compose.icon.collections.devicons.devicons.fortran

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.FortranGroup

public val FortranGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF734c94)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.97f, 0.0f)
                curveTo(13.25f, 0.0f, 0.0f, 11.0f, 0.0f, 18.66f)
                verticalLineToRelative(90.45f)
                curveToRelative(0.0f, 5.69f, 11.21f, 18.9f, 18.78f, 18.9f)
                lineToRelative(90.55f, -0.03f)
                curveToRelative(6.74f, -0.0f, 18.69f, -9.68f, 18.69f, -18.6f)
                lineTo(128.02f, 18.84f)
                curveToRelative(0.0f, -6.08f, -10.61f, -18.83f, -18.43f, -18.83f)
                lineTo(18.97f, 0.0f)
                close()
                moveTo(17.57f, 13.66f)
                horizontalLineToRelative(93.37f)
                verticalLineToRelative(41.71f)
                lineToRelative(-10.99f, -0.16f)
                curveToRelative(-0.1f, -0.1f, -0.4f, -3.05f, -0.61f, -5.76f)
                curveTo(98.19f, 36.7f, 95.33f, 29.36f, 89.81f, 26.5f)
                curveToRelative(-2.91f, -1.5f, -7.46f, -1.95f, -22.02f, -1.95f)
                lineToRelative(-13.57f, 0.0f)
                verticalLineToRelative(31.27f)
                horizontalLineToRelative(2.41f)
                curveToRelative(4.07f, -0.05f, 9.23f, -1.0f, 10.94f, -2.06f)
                curveToRelative(2.21f, -1.36f, 4.07f, -5.27f, 4.72f, -9.99f)
                curveToRelative(0.49f, -3.44f, 0.87f, -6.02f, 0.87f, -6.02f)
                horizontalLineToRelative(10.68f)
                verticalLineToRelative(49.69f)
                lineTo(72.79f, 87.45f)
                verticalLineToRelative(-1.96f)
                curveToRelative(0.0f, -3.21f, -1.51f, -10.69f, -2.56f, -12.95f)
                curveToRelative(-1.66f, -3.46f, -4.46f, -4.67f, -12.45f, -5.42f)
                lineToRelative(-3.66f, -0.35f)
                lineToRelative(0.2f, 16.11f)
                curveToRelative(0.15f, 15.31f, 0.25f, 16.16f, 1.2f, 17.47f)
                curveToRelative(1.21f, 1.61f, 2.51f, 1.91f, 10.49f, 2.51f)
                lineToRelative(5.36f, 0.26f)
                lineToRelative(-0.04f, 10.94f)
                lineTo(17.57f, 114.05f)
                verticalLineToRelative(-10.94f)
                lineToRelative(4.92f, -0.3f)
                curveToRelative(9.99f, -0.65f, 9.89f, -0.6f, 10.39f, -8.43f)
                curveToRelative(0.45f, -7.43f, -0.12f, -65.6f, -0.45f, -66.76f)
                curveToRelative(-0.55f, -1.92f, -2.62f, -3.03f, -8.79f, -3.02f)
                lineToRelative(-6.07f, -0.04f)
                lineTo(17.57f, 13.66f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
