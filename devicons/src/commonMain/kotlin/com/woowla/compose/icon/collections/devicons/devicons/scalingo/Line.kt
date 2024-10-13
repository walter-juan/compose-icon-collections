package com.woowla.compose.icon.collections.devicons.devicons.scalingo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.ScalingoGroup

public val ScalingoGroup.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = Builder(name = "Line", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF173aee)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(67.71f, 0.0f)
                curveToRelative(-5.65f, 0.02f, -11.17f, 2.93f, -14.15f, 8.05f)
                lineTo(25.08f, 56.94f)
                curveToRelative(-4.34f, 7.45f, -1.63f, 16.8f, 6.02f, 20.82f)
                curveToRelative(7.66f, 4.02f, 17.37f, 1.24f, 21.71f, -6.21f)
                lineTo(81.28f, 22.66f)
                curveToRelative(4.34f, -7.45f, 1.63f, -16.8f, -6.02f, -20.82f)
                arcTo(16.13f, 16.13f, 0.0f, false, false, 67.7f, 0.0f)
                close()
                moveTo(67.71f, 0.99f)
                arcTo(15.13f, 15.13f, 0.0f, false, true, 74.8f, 2.72f)
                curveToRelative(7.18f, 3.77f, 9.69f, 12.45f, 5.63f, 19.44f)
                lineTo(51.96f, 71.05f)
                curveToRelative(-4.07f, 6.99f, -13.21f, 9.6f, -20.39f, 5.83f)
                curveToRelative(-7.18f, -3.77f, -9.69f, -12.45f, -5.63f, -19.44f)
                lineToRelative(28.47f, -48.89f)
                curveToRelative(2.8f, -4.81f, 7.99f, -7.55f, 13.3f, -7.56f)
                close()
                moveTo(89.34f, 48.39f)
                curveToRelative(-5.65f, 0.02f, -11.17f, 2.93f, -14.15f, 8.05f)
                lineToRelative(-28.47f, 48.89f)
                curveToRelative(-4.34f, 7.46f, -1.63f, 16.8f, 6.02f, 20.82f)
                curveToRelative(7.66f, 4.02f, 17.37f, 1.24f, 21.71f, -6.21f)
                lineToRelative(28.47f, -48.89f)
                curveToRelative(4.34f, -7.45f, 1.63f, -16.8f, -6.02f, -20.82f)
                arcToRelative(16.12f, 16.12f, 0.0f, false, false, -7.55f, -1.84f)
                close()
                moveTo(89.35f, 49.39f)
                arcToRelative(15.12f, 15.12f, 0.0f, false, true, 7.09f, 1.73f)
                curveToRelative(7.18f, 3.77f, 9.69f, 12.45f, 5.63f, 19.44f)
                lineToRelative(-28.47f, 48.89f)
                curveToRelative(-4.07f, 6.99f, -13.21f, 9.6f, -20.39f, 5.83f)
                curveToRelative(-7.18f, -3.77f, -9.7f, -12.45f, -5.63f, -19.44f)
                lineToRelative(28.47f, -48.89f)
                curveToRelative(2.8f, -4.81f, 7.99f, -7.55f, 13.3f, -7.56f)
                close()
            }
        }
        .build()
        return _line!!
    }

private var _line: ImageVector? = null
