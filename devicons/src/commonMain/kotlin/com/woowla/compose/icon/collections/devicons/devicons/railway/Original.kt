package com.woowla.compose.icon.collections.devicons.devicons.railway

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.RailwayGroup

public val RailwayGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(63.93f, 0.0f)
                curveTo(39.99f, 0.0f, 19.16f, 13.14f, 8.16f, 32.58f)
                curveToRelative(8.6f, -0.02f, 25.34f, -0.03f, 25.34f, -0.03f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(-0.01f)
                curveToRelative(19.79f, 0.0f, 20.52f, 0.09f, 24.39f, 0.25f)
                lineToRelative(2.39f, 0.09f)
                curveToRelative(8.34f, 0.28f, 18.58f, 1.17f, 26.65f, 7.28f)
                curveToRelative(4.38f, 3.31f, 10.7f, 10.61f, 14.46f, 15.81f)
                curveToRelative(3.48f, 4.81f, 4.49f, 10.34f, 2.12f, 15.64f)
                curveToRelative(-2.18f, 4.87f, -6.87f, 7.78f, -12.55f, 7.78f)
                horizontalLineTo(2.09f)
                reflectiveCurveToRelative(0.53f, 2.24f, 1.32f, 4.72f)
                horizontalLineToRelative(121.33f)
                arcTo(63.8f, 63.8f, 0.0f, false, false, 128.0f, 64.03f)
                curveTo(128.0f, 28.67f, 99.32f, 0.0f, 63.93f, 0.0f)
                close()
                moveTo(33.49f, 38.97f)
                curveToRelative(-9.08f, 0.0f, -18.96f, 0.02f, -28.58f, 0.05f)
                curveToRelative(-1.25f, 3.36f, -2.44f, 6.62f, -3.03f, 9.27f)
                horizontalLineToRelative(49.82f)
                verticalLineToRelative(6.49f)
                horizontalLineTo(0.59f)
                arcTo(65.09f, 65.09f, 0.0f, false, false, 0.0f, 61.22f)
                horizontalLineToRelative(97.22f)
                curveToRelative(-0.34f, -0.66f, -0.8f, -1.26f, -1.26f, -1.85f)
                curveToRelative(-16.62f, -21.47f, -25.56f, -19.61f, -38.35f, -20.16f)
                curveToRelative(-4.26f, -0.18f, -7.16f, -0.25f, -24.13f, -0.25f)
                close()
                moveTo(0.05f, 67.71f)
                curveToRelative(0.1f, 1.73f, 0.26f, 3.44f, 0.5f, 5.12f)
                horizontalLineToRelative(90.42f)
                curveToRelative(4.03f, 0.0f, 6.29f, -2.29f, 7.02f, -5.12f)
                horizontalLineTo(0.05f)
                close()
                moveTo(5.63f, 90.54f)
                reflectiveCurveTo(20.62f, 127.35f, 63.93f, 128.0f)
                curveToRelative(25.89f, 0.0f, 48.13f, -15.38f, 58.24f, -37.46f)
                horizontalLineTo(5.63f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
