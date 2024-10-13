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

public val IllustratorGroup.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = Builder(name = "Line", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFFAA625)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.0f, 1.0f)
                verticalLineToRelative(125.79f)
                curveToRelative(1.0f, 0.08f, 0.99f, 0.23f, 1.36f, 0.23f)
                curveToRelative(36.27f, 0.01f, 72.67f, 0.01f, 108.93f, 0.01f)
                curveToRelative(4.99f, 0.0f, 9.86f, 0.0f, 14.85f, -0.01f)
                curveToRelative(0.33f, -0.0f, 0.85f, -0.15f, 0.85f, -0.23f)
                lineTo(127.0f, 1.0f)
                lineTo(1.0f, 1.0f)
                close()
                moveTo(115.0f, 63.91f)
                verticalLineToRelative(48.55f)
                curveToRelative(0.0f, 1.69f, -0.25f, 1.53f, -1.88f, 1.53f)
                lineTo(15.77f, 114.0f)
                curveToRelative(-1.63f, 0.0f, -1.77f, 0.15f, -1.77f, -1.53f)
                lineTo(14.0f, 15.24f)
                curveToRelative(0.0f, -1.69f, 0.14f, -2.24f, 1.89f, -2.24f)
                horizontalLineToRelative(97.1f)
                curveToRelative(1.75f, 0.0f, 2.0f, 0.55f, 2.0f, 2.36f)
                verticalLineToRelative(48.55f)
                close()
                moveTo(64.41f, 40.37f)
                curveToRelative(-0.21f, -0.66f, -0.61f, -0.7f, -1.19f, -0.69f)
                curveToRelative(-3.11f, 0.02f, -6.23f, 0.07f, -9.34f, 0.0f)
                curveToRelative(-0.98f, -0.02f, -1.41f, 0.27f, -1.72f, 1.23f)
                curveToRelative(-4.39f, 13.78f, -8.82f, 27.56f, -13.23f, 41.34f)
                curveToRelative(-0.72f, 2.25f, -1.42f, 4.5f, -2.18f, 6.94f)
                curveToRelative(2.91f, 0.0f, 5.57f, -0.04f, 8.23f, 0.03f)
                curveToRelative(0.9f, 0.02f, 1.28f, -0.28f, 1.52f, -1.13f)
                curveToRelative(1.14f, -3.92f, 2.37f, -7.82f, 3.5f, -11.75f)
                curveToRelative(0.26f, -0.93f, 0.69f, -1.18f, 1.63f, -1.16f)
                curveToRelative(4.42f, 0.05f, 8.85f, 0.05f, 13.27f, 0.0f)
                curveToRelative(0.86f, -0.01f, 1.21f, 0.27f, 1.46f, 1.06f)
                curveToRelative(1.21f, 3.95f, 2.5f, 7.87f, 3.71f, 11.82f)
                curveToRelative(0.25f, 0.82f, 0.57f, 1.13f, 1.51f, 1.06f)
                arcToRelative(54.15f, 54.15f, 0.0f, false, true, 3.93f, -0.12f)
                horizontalLineToRelative(4.59f)
                lineToRelative(-0.02f, -0.33f)
                curveToRelative(-5.22f, -16.11f, -10.45f, -32.19f, -15.66f, -48.3f)
                close()
                moveTo(52.0f, 68.0f)
                curveToRelative(2.04f, -7.0f, 4.06f, -13.85f, 6.05f, -20.64f)
                curveTo(60.1f, 54.13f, 62.19f, 61.0f, 64.31f, 68.0f)
                lineTo(52.0f, 68.0f)
                close()
                moveTo(82.0f, 89.0f)
                horizontalLineToRelative(10.0f)
                lineTo(92.0f, 53.0f)
                lineTo(82.0f, 53.0f)
                verticalLineToRelative(36.0f)
                close()
                moveTo(87.07f, 38.56f)
                curveToRelative(-2.96f, 0.0f, -5.15f, 2.11f, -5.13f, 4.94f)
                curveToRelative(0.02f, 2.84f, 2.12f, 4.86f, 5.06f, 4.86f)
                curveToRelative(3.05f, 0.0f, 5.21f, -2.02f, 5.19f, -4.86f)
                curveToRelative(-0.02f, -2.91f, -2.13f, -4.95f, -5.11f, -4.94f)
                close()
            }
        }
        .build()
        return _line!!
    }

private var _line: ImageVector? = null
