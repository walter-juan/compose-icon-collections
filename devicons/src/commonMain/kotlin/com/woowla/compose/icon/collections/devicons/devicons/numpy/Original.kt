package com.woowla.compose.icon.collections.devicons.devicons.numpy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.NumpyGroup

public val NumpyGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF4DABCF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(55.01f, 26.01f)
                lineToRelative(-21.38f, -10.79f)
                lineTo(10.15f, 26.93f)
                lineToRelative(21.97f, 11.03f)
                close()
                moveTo(64.82f, 30.96f)
                lineTo(87.24f, 42.28f)
                lineTo(63.98f, 53.96f)
                lineToRelative(-22.0f, -11.04f)
                close()
                moveTo(94.77f, 15.38f)
                lineTo(117.81f, 26.93f)
                lineTo(97.2f, 37.27f)
                lineTo(74.74f, 25.94f)
                close()
                moveTo(84.85f, 10.4f)
                lineTo(64.11f, 0.0f)
                lineTo(43.6f, 10.24f)
                lineTo(64.97f, 21.01f)
                close()
                moveTo(68.64f, 99.7f)
                lineTo(68.64f, 128.0f)
                lineToRelative(25.12f, -12.54f)
                lineToRelative(-0.02f, -28.31f)
                close()
                moveTo(93.73f, 77.27f)
                lineToRelative(-0.03f, -28.01f)
                lineToRelative(-25.06f, 12.46f)
                lineTo(68.64f, 89.74f)
                close()
                moveTo(123.88f, 72.02f)
                verticalLineToRelative(28.41f)
                lineToRelative(-21.43f, 10.69f)
                lineToRelative(-0.02f, -28.28f)
                close()
                moveTo(123.88f, 62.09f)
                lineTo(123.88f, 34.25f)
                lineToRelative(-21.47f, 10.67f)
                lineToRelative(0.02f, 28.07f)
                close()
            }
            path(fill = SolidColor(Color(0xFF4c75cf)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(59.77f, 61.72f)
                lineToRelative(-16.92f, -8.51f)
                verticalLineTo(89.97f)
                reflectiveCurveToRelative(-20.7f, -44.03f, -22.61f, -47.99f)
                curveToRelative(-0.25f, -0.51f, -1.26f, -1.07f, -1.52f, -1.21f)
                curveToRelative(-3.73f, -1.95f, -14.6f, -7.45f, -14.6f, -7.45f)
                verticalLineToRelative(64.98f)
                lineToRelative(15.04f, 8.06f)
                verticalLineTo(72.38f)
                reflectiveCurveToRelative(20.48f, 39.35f, 20.69f, 39.78f)
                curveToRelative(0.21f, 0.43f, 2.26f, 4.57f, 4.46f, 6.03f)
                curveToRelative(2.92f, 1.94f, 15.46f, 9.48f, 15.46f, 9.48f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
