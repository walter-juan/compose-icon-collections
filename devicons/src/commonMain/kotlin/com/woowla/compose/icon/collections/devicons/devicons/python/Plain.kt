package com.woowla.compose.icon.collections.devicons.devicons.python

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.PythonGroup

public val PythonGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFFFD845)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(49.33f, 62.0f)
                horizontalLineToRelative(29.16f)
                curveTo(86.61f, 62.0f, 93.0f, 55.13f, 93.0f, 46.98f)
                lineTo(93.0f, 19.18f)
                curveToRelative(0.0f, -7.91f, -6.63f, -13.86f, -14.56f, -15.18f)
                curveToRelative(-5.01f, -0.83f, -10.19f, -1.22f, -15.19f, -1.19f)
                curveToRelative(-4.99f, 0.02f, -9.61f, 0.45f, -13.81f, 1.19f)
                curveTo(37.1f, 6.19f, 35.0f, 10.76f, 35.0f, 19.18f)
                lineTo(35.0f, 30.0f)
                horizontalLineToRelative(29.0f)
                verticalLineToRelative(4.0f)
                lineTo(23.78f, 34.0f)
                curveToRelative(-8.48f, 0.0f, -15.91f, 5.11f, -18.24f, 14.81f)
                curveToRelative(-2.68f, 11.12f, -2.8f, 17.92f, 0.0f, 29.53f)
                curveTo(7.61f, 86.98f, 12.57f, 93.0f, 21.05f, 93.0f)
                lineTo(31.0f, 93.0f)
                lineTo(31.0f, 79.95f)
                curveTo(31.0f, 70.32f, 39.43f, 62.0f, 49.33f, 62.0f)
                close()
                moveTo(47.49f, 22.89f)
                curveToRelative(-3.03f, 0.0f, -5.48f, -2.48f, -5.48f, -5.55f)
                curveToRelative(0.0f, -3.08f, 2.45f, -5.58f, 5.48f, -5.58f)
                curveToRelative(3.02f, 0.0f, 5.48f, 2.5f, 5.48f, 5.58f)
                curveToRelative(-0.0f, 3.07f, -2.46f, 5.55f, -5.48f, 5.55f)
                close()
                moveTo(122.28f, 48.81f)
                curveTo(120.18f, 40.36f, 116.18f, 34.0f, 107.68f, 34.0f)
                lineTo(97.0f, 34.0f)
                verticalLineToRelative(12.98f)
                curveTo(97.0f, 57.03f, 88.21f, 65.0f, 78.49f, 65.0f)
                lineTo(49.33f, 65.0f)
                curveTo(41.34f, 65.0f, 35.0f, 72.33f, 35.0f, 80.33f)
                verticalLineToRelative(27.8f)
                curveToRelative(0.0f, 7.91f, 6.74f, 12.56f, 14.46f, 14.83f)
                curveToRelative(9.24f, 2.72f, 17.99f, 3.21f, 29.05f, 0.0f)
                curveTo(85.86f, 120.83f, 93.0f, 116.55f, 93.0f, 108.13f)
                lineTo(93.0f, 97.0f)
                lineTo(64.0f, 97.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(43.68f)
                curveToRelative(8.48f, 0.0f, 11.65f, -5.78f, 14.6f, -14.66f)
                curveToRelative(3.05f, -9.15f, 2.92f, -17.8f, 0.0f, -29.53f)
                close()
                moveTo(80.33f, 104.42f)
                curveToRelative(3.03f, 0.0f, 5.48f, 2.48f, 5.48f, 5.55f)
                curveToRelative(0.0f, 3.08f, -2.45f, 5.58f, -5.48f, 5.58f)
                curveToRelative(-3.02f, 0.0f, -5.48f, -2.5f, -5.48f, -5.58f)
                curveToRelative(0.0f, -3.07f, 2.46f, -5.55f, 5.48f, -5.55f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
