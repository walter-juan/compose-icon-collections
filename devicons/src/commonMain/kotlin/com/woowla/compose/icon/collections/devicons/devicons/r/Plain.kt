package com.woowla.compose.icon.collections.devicons.devicons.r

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.RGroup

public val RGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF1f65b7)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 14.65f)
                verticalLineToRelative(0.0f)
                curveToRelative(-35.35f, 0.0f, -64.0f, 19.19f, -64.0f, 42.86f)
                curveToRelative(0.0f, 20.76f, 22.05f, 38.08f, 51.32f, 42.02f)
                verticalLineToRelative(-12.83f)
                curveToRelative(-15.55f, -4.89f, -26.17f, -14.69f, -26.17f, -25.99f)
                curveToRelative(0.0f, -16.18f, 21.78f, -29.3f, 48.65f, -29.3f)
                curveToRelative(26.87f, 0.0f, 46.69f, 8.97f, 46.69f, 29.3f)
                curveToRelative(0.0f, 10.49f, -5.27f, 17.95f, -14.06f, 22.72f)
                curveToRelative(1.2f, 0.91f, 2.22f, 2.07f, 2.9f, 3.42f)
                lineToRelative(0.39f, 0.65f)
                curveTo(121.02f, 79.77f, 128.0f, 69.19f, 128.0f, 57.51f)
                curveToRelative(0.0f, -23.67f, -28.65f, -42.86f, -64.0f, -42.86f)
                close()
                moveTo(52.74f, 41.26f)
                verticalLineToRelative(72.08f)
                lineToRelative(21.83f, -0.01f)
                lineToRelative(-0.0f, -28.22f)
                horizontalLineToRelative(5.86f)
                curveToRelative(1.2f, 0.0f, 1.72f, 0.35f, 2.93f, 1.33f)
                curveToRelative(1.45f, 1.18f, 3.82f, 5.24f, 3.82f, 5.24f)
                lineToRelative(11.54f, 21.67f)
                lineToRelative(24.67f, -0.01f)
                lineToRelative(-15.27f, -25.74f)
                arcToRelative(8.39f, 8.39f, 0.0f, false, false, -1.42f, -2.04f)
                curveToRelative(-0.97f, -1.04f, -2.33f, -1.82f, -3.11f, -2.22f)
                curveToRelative(-2.25f, -1.14f, -6.12f, -2.31f, -6.12f, -2.31f)
                curveToRelative(0.0f, 0.0f, 19.08f, -1.42f, 19.08f, -20.41f)
                curveToRelative(0.0f, -19.0f, -19.97f, -19.36f, -19.97f, -19.36f)
                lineTo(52.74f, 41.26f)
                close()
                moveTo(74.75f, 56.89f)
                lineTo(87.97f, 56.9f)
                reflectiveCurveToRelative(6.12f, -0.33f, 6.12f, 6.01f)
                curveToRelative(0.0f, 6.22f, -6.12f, 6.23f, -6.12f, 6.23f)
                lineToRelative(-13.22f, 0.0f)
                lineToRelative(0.01f, -12.26f)
                close()
                moveTo(84.1f, 89.53f)
                curveToRelative(-2.61f, 0.26f, -5.32f, 0.41f, -8.11f, 0.46f)
                lineToRelative(0.0f, 9.63f)
                arcToRelative(88.36f, 88.36f, 0.0f, false, false, 12.47f, -2.49f)
                lineToRelative(-0.5f, -0.94f)
                curveToRelative(-0.68f, -1.27f, -1.35f, -2.54f, -2.03f, -3.81f)
                arcToRelative(41.01f, 41.01f, 0.0f, false, false, -1.83f, -2.85f)
                verticalLineToRelative(-0.0f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
