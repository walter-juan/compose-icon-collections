package com.woowla.compose.icon.collections.devicons.devicons.eclipse

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.EclipseGroup

public val EclipseGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF2c2255)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(60.03f, 5.26f)
                curveTo(27.47f, 5.27f, 1.07f, 31.58f, 1.07f, 64.04f)
                curveToRelative(0.0f, 32.47f, 26.4f, 58.78f, 58.97f, 58.78f)
                curveToRelative(0.73f, 0.0f, 1.45f, -0.03f, 2.17f, -0.05f)
                curveToRelative(-29.03f, -4.34f, -51.33f, -29.02f, -51.33f, -58.73f)
                curveToRelative(0.0f, -29.7f, 22.31f, -54.38f, 51.33f, -58.72f)
                curveToRelative(-0.72f, -0.03f, -1.45f, -0.06f, -2.17f, -0.06f)
                close()
                moveTo(70.44f, 7.73f)
                curveToRelative(-15.53f, 0.0f, -28.81f, 5.49f, -39.85f, 16.45f)
                curveToRelative(-6.93f, 6.98f, -11.67f, 14.85f, -14.22f, 23.63f)
                lineTo(124.5f, 47.81f)
                curveToRelative(-2.57f, -8.77f, -7.34f, -16.65f, -14.31f, -23.62f)
                curveToRelative(-8.75f, -8.75f, -18.96f, -14.0f, -30.62f, -15.77f)
                arcToRelative(60.98f, 60.98f, 0.0f, false, false, -9.13f, -0.68f)
                close()
                moveTo(14.95f, 54.11f)
                arcToRelative(58.89f, 58.89f, 0.0f, false, false, -0.73f, 6.78f)
                horizontalLineToRelative(112.44f)
                arcToRelative(58.74f, 58.74f, 0.0f, false, false, -0.74f, -6.78f)
                close()
                moveTo(14.22f, 67.19f)
                curveToRelative(0.11f, 2.27f, 0.36f, 4.54f, 0.73f, 6.78f)
                lineTo(125.93f, 73.97f)
                curveToRelative(0.38f, -2.24f, 0.62f, -4.51f, 0.74f, -6.78f)
                close()
                moveTo(16.38f, 80.27f)
                curveToRelative(2.55f, 8.75f, 7.28f, 16.58f, 14.21f, 23.51f)
                curveToRelative(11.05f, 11.05f, 24.33f, 16.56f, 39.85f, 16.56f)
                curveToRelative(3.11f, 0.0f, 6.11f, -0.23f, 9.04f, -0.67f)
                curveToRelative(11.7f, -1.77f, 21.94f, -7.05f, 30.72f, -15.89f)
                curveToRelative(6.97f, -6.93f, 11.74f, -14.77f, 14.31f, -23.52f)
                close()
                moveTo(16.38f, 80.27f)
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
