package com.woowla.compose.icon.collections.devicons.devicons.numpy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.NumpyGroup

public val NumpyGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF4dabcf)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.11f, 0.0f)
                lineTo(43.6f, 10.24f)
                lineToRelative(21.37f, 10.77f)
                lineTo(84.85f, 10.4f)
                lineTo(64.11f, 0.0f)
                close()
                moveTo(33.63f, 15.22f)
                lineTo(10.15f, 26.93f)
                lineTo(32.12f, 37.96f)
                lineTo(55.01f, 26.01f)
                lineTo(33.63f, 15.22f)
                close()
                moveTo(94.77f, 15.38f)
                lineTo(74.73f, 25.94f)
                lineTo(97.2f, 37.27f)
                lineToRelative(20.61f, -10.34f)
                lineToRelative(-23.04f, -11.55f)
                close()
                moveTo(64.82f, 30.96f)
                lineTo(41.98f, 42.91f)
                lineToRelative(22.0f, 11.04f)
                lineToRelative(23.26f, -11.68f)
                lineTo(64.82f, 30.96f)
                close()
                moveTo(4.11f, 33.32f)
                verticalLineToRelative(64.98f)
                lineToRelative(15.04f, 8.06f)
                verticalLineToRelative(-33.98f)
                reflectiveCurveToRelative(20.48f, 39.35f, 20.69f, 39.78f)
                curveToRelative(0.21f, 0.43f, 2.26f, 4.57f, 4.46f, 6.03f)
                curveToRelative(2.92f, 1.94f, 15.46f, 9.48f, 15.46f, 9.48f)
                lineToRelative(0.01f, -65.95f)
                lineToRelative(-16.92f, -8.51f)
                verticalLineToRelative(36.77f)
                reflectiveCurveToRelative(-20.7f, -44.03f, -22.61f, -47.99f)
                curveToRelative(-0.25f, -0.51f, -1.26f, -1.07f, -1.52f, -1.21f)
                curveToRelative(-3.73f, -1.95f, -14.6f, -7.45f, -14.6f, -7.45f)
                close()
                moveTo(123.88f, 34.25f)
                lineTo(102.41f, 44.92f)
                lineTo(102.43f, 72.99f)
                lineTo(123.88f, 62.09f)
                lineTo(123.88f, 34.25f)
                close()
                moveTo(93.7f, 49.26f)
                lineTo(68.64f, 61.72f)
                lineTo(68.64f, 89.74f)
                lineToRelative(25.09f, -12.47f)
                lineToRelative(-0.03f, -28.01f)
                close()
                moveTo(123.88f, 72.02f)
                lineTo(102.44f, 82.85f)
                lineTo(102.45f, 111.12f)
                lineTo(123.88f, 100.43f)
                verticalLineToRelative(-28.41f)
                close()
                moveTo(93.74f, 87.15f)
                lineTo(68.64f, 99.7f)
                lineTo(68.64f, 128.0f)
                lineToRelative(25.12f, -12.54f)
                lineToRelative(-0.02f, -28.31f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
