package com.woowla.compose.icon.collections.devicons.devicons.illustrator

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.IllustratorGroup

public val IllustratorGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFFAA625)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(47.96f, 69.0f)
                horizontalLineToRelative(15.37f)
                curveToRelative(-2.65f, -9.0f, -5.25f, -17.32f, -7.82f, -25.78f)
                curveTo(53.02f, 51.71f, 50.5f, 60.0f, 47.96f, 69.0f)
                close()
                moveTo(124.11f, 1.0f)
                lineTo(2.87f, 1.0f)
                curveTo(0.69f, 1.0f, 1.0f, 1.48f, 1.0f, 3.59f)
                verticalLineToRelative(121.39f)
                curveTo(1.0f, 127.09f, 0.69f, 127.0f, 2.72f, 127.0f)
                horizontalLineToRelative(121.55f)
                curveToRelative(2.03f, 0.0f, 2.73f, 0.09f, 2.73f, -2.02f)
                lineTo(127.0f, 3.74f)
                curveTo(127.0f, 1.48f, 126.3f, 1.0f, 124.11f, 1.0f)
                close()
                moveTo(77.3f, 96.0f)
                curveToRelative(-1.64f, 0.0f, -3.28f, -0.13f, -4.91f, -0.02f)
                curveToRelative(-1.17f, 0.09f, -1.57f, -0.41f, -1.88f, -1.43f)
                curveToRelative(-1.51f, -4.93f, -3.12f, -9.86f, -4.64f, -14.79f)
                curveToRelative(-0.31f, -0.99f, -0.74f, -1.35f, -1.82f, -1.34f)
                curveToRelative(-5.52f, 0.06f, -11.05f, 0.06f, -16.57f, -0.01f)
                curveToRelative(-1.16f, -0.01f, -1.7f, 0.3f, -2.03f, 1.45f)
                curveToRelative(-1.41f, 4.9f, -2.94f, 9.77f, -4.36f, 14.67f)
                curveToRelative(-0.31f, 1.06f, -0.78f, 1.43f, -1.9f, 1.4f)
                curveToRelative(-3.32f, -0.08f, -6.64f, -0.03f, -10.27f, -0.03f)
                curveToRelative(0.96f, -3.05f, 1.83f, -5.86f, 2.73f, -8.66f)
                curveToRelative(5.51f, -17.2f, 11.05f, -34.4f, 16.52f, -51.61f)
                curveToRelative(0.38f, -1.2f, 0.91f, -1.57f, 2.14f, -1.54f)
                curveToRelative(3.89f, 0.09f, 7.78f, 0.02f, 11.66f, 0.0f)
                curveToRelative(0.73f, -0.0f, 1.22f, 0.04f, 1.49f, 0.86f)
                curveToRelative(6.51f, 20.12f, 13.03f, 40.36f, 19.56f, 60.47f)
                curveToRelative(0.03f, 0.09f, 0.01f, 0.57f, 0.03f, 0.57f)
                horizontalLineToRelative(-5.74f)
                close()
                moveTo(98.0f, 96.0f)
                lineTo(86.0f, 96.0f)
                lineTo(86.0f, 51.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(45.0f)
                close()
                moveTo(91.65f, 44.93f)
                curveToRelative(-3.66f, -0.0f, -6.29f, -2.53f, -6.31f, -6.07f)
                curveToRelative(-0.02f, -3.53f, 2.71f, -6.16f, 6.41f, -6.16f)
                curveToRelative(3.73f, -0.0f, 6.36f, 2.54f, 6.38f, 6.17f)
                curveToRelative(0.03f, 3.55f, -2.67f, 6.07f, -6.48f, 6.06f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
