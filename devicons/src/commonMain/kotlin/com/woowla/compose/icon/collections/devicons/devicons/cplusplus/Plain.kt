package com.woowla.compose.icon.collections.devicons.devicons.cplusplus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.CplusplusGroup

public val CplusplusGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF004482)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(63.44f, 0.0f)
                curveToRelative(-1.78f, 0.0f, -3.56f, 0.39f, -4.92f, 1.17f)
                lineTo(11.59f, 28.27f)
                curveTo(8.89f, 29.83f, 6.68f, 33.66f, 6.68f, 36.78f)
                verticalLineToRelative(54.2f)
                curveToRelative(0.0f, 1.56f, 0.55f, 3.3f, 1.44f, 4.84f)
                lineToRelative(-0.0f, 0.0f)
                curveToRelative(0.89f, 1.54f, 2.12f, 2.89f, 3.47f, 3.67f)
                lineToRelative(46.93f, 27.09f)
                curveToRelative(2.7f, 1.56f, 7.13f, 1.56f, 9.83f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(46.93f, -27.09f)
                curveToRelative(1.35f, -0.78f, 2.58f, -2.13f, 3.47f, -3.67f)
                curveToRelative(0.89f, -1.54f, 1.44f, -3.28f, 1.44f, -4.84f)
                lineTo(120.21f, 36.78f)
                curveToRelative(0.0f, -1.56f, -0.55f, -3.3f, -1.44f, -4.84f)
                verticalLineToRelative(-0.0f)
                curveToRelative(-0.89f, -1.54f, -2.12f, -2.89f, -3.47f, -3.67f)
                lineTo(68.36f, 1.17f)
                curveTo(67.01f, 0.39f, 65.23f, 0.0f, 63.44f, 0.0f)
                close()
                moveTo(63.44f, 26.03f)
                curveToRelative(13.47f, 0.0f, 26.02f, 7.25f, 32.77f, 18.91f)
                lineToRelative(-16.38f, 9.48f)
                curveToRelative(-3.37f, -5.84f, -9.66f, -9.47f, -16.39f, -9.47f)
                curveToRelative(-10.43f, 0.0f, -18.92f, 8.49f, -18.92f, 18.92f)
                reflectiveCurveTo(53.01f, 82.8f, 63.44f, 82.8f)
                curveToRelative(6.74f, 0.0f, 13.02f, -3.63f, 16.4f, -9.47f)
                lineToRelative(16.38f, 9.48f)
                curveToRelative(-6.75f, 11.66f, -19.31f, 18.91f, -32.77f, 18.91f)
                curveToRelative(-20.87f, 0.0f, -37.84f, -16.98f, -37.84f, -37.84f)
                reflectiveCurveToRelative(16.98f, -37.84f, 37.84f, -37.84f)
                verticalLineToRelative(-0.0f)
                close()
                moveTo(92.88f, 57.57f)
                horizontalLineToRelative(4.2f)
                verticalLineToRelative(4.21f)
                horizontalLineToRelative(4.2f)
                verticalLineToRelative(4.2f)
                horizontalLineToRelative(-4.2f)
                verticalLineToRelative(4.21f)
                horizontalLineToRelative(-4.2f)
                lineTo(92.88f, 65.98f)
                horizontalLineToRelative(-4.21f)
                verticalLineToRelative(-4.2f)
                horizontalLineToRelative(4.21f)
                lineTo(92.88f, 57.57f)
                close()
                moveTo(108.65f, 57.57f)
                horizontalLineToRelative(4.21f)
                verticalLineToRelative(4.21f)
                horizontalLineToRelative(4.2f)
                verticalLineToRelative(4.2f)
                horizontalLineToRelative(-4.2f)
                verticalLineToRelative(4.21f)
                horizontalLineToRelative(-4.21f)
                lineTo(108.65f, 65.98f)
                horizontalLineToRelative(-4.2f)
                verticalLineToRelative(-4.2f)
                horizontalLineToRelative(4.2f)
                lineTo(108.65f, 57.57f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
