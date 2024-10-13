package com.woowla.compose.icon.collections.devicons.devicons.carbon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.CarbonGroup

public val CarbonGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.32f, 127.09f)
                curveToRelative(-13.83f, -2.64f, -24.86f, -8.4f, -34.44f, -17.97f)
                curveTo(-1.91f, 88.33f, -5.88f, 56.88f, 9.07f, 31.31f)
                curveTo(17.55f, 16.81f, 31.72f, 6.37f, 49.05f, 1.84f)
                curveToRelative(8.14f, -2.13f, 21.77f, -2.13f, 29.91f, 0.0f)
                curveToRelative(14.19f, 3.71f, 25.9f, 11.07f, 34.39f, 21.59f)
                curveToRelative(6.46f, 8.02f, 10.14f, 15.37f, 12.82f, 25.63f)
                curveToRelative(2.13f, 8.14f, 2.13f, 21.77f, 0.0f, 29.91f)
                curveToRelative(-6.28f, 24.0f, -23.27f, 41.02f, -47.13f, 47.18f)
                curveToRelative(-6.63f, 1.72f, -19.29f, 2.19f, -25.72f, 0.96f)
                close()
                moveTo(75.51f, 102.14f)
                curveToRelative(4.64f, -1.89f, 8.1f, -4.88f, 11.23f, -9.69f)
                curveToRelative(2.13f, -3.29f, 4.14f, -8.91f, 4.14f, -11.6f)
                curveToRelative(0.0f, -1.41f, -0.22f, -1.48f, -4.49f, -1.48f)
                curveToRelative(-5.0f, 0.0f, -4.97f, -0.02f, -6.38f, 5.57f)
                curveToRelative(-0.92f, 3.66f, -4.2f, 7.77f, -7.68f, 9.63f)
                curveToRelative(-2.49f, 1.33f, -3.58f, 1.51f, -8.05f, 1.33f)
                curveToRelative(-4.32f, -0.17f, -5.59f, -0.49f, -7.75f, -1.91f)
                curveToRelative(-3.11f, -2.06f, -6.29f, -6.69f, -7.61f, -11.07f)
                curveToRelative(-2.38f, -7.95f, -2.66f, -26.22f, -0.54f, -35.53f)
                curveToRelative(2.18f, -9.57f, 8.4f, -15.36f, 16.5f, -15.37f)
                curveToRelative(7.85f, -0.01f, 13.49f, 4.97f, 15.75f, 13.92f)
                lineToRelative(0.69f, 2.72f)
                horizontalLineToRelative(9.73f)
                lineToRelative(-0.41f, -3.0f)
                curveToRelative(-0.23f, -1.65f, -1.32f, -4.96f, -2.42f, -7.36f)
                curveToRelative(-6.05f, -13.14f, -21.76f, -18.17f, -35.55f, -11.39f)
                curveToRelative(-6.38f, 3.14f, -11.19f, 9.6f, -14.06f, 18.9f)
                curveToRelative(-1.73f, 5.61f, -1.73f, 30.81f, 0.0f, 36.41f)
                curveToRelative(2.62f, 8.5f, 7.4f, 15.4f, 12.89f, 18.61f)
                curveToRelative(6.65f, 3.9f, 16.37f, 4.43f, 24.01f, 1.32f)
                close()
                moveTo(75.51f, 102.14f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
