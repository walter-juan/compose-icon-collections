package com.woowla.compose.icon.collections.devicons.devicons.vsphere

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.VsphereGroup

public val VsphereGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF0091da)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.64f, 0.1f)
                reflectiveCurveTo(2.28f, 0.93f, 0.0f, 18.74f)
                verticalLineToRelative(89.37f)
                reflectiveCurveToRelative(1.14f, 17.92f, 19.78f, 19.78f)
                horizontalLineToRelative(36.35f)
                lineToRelative(5.49f, -5.49f)
                lineTo(20.4f, 122.41f)
                reflectiveCurveToRelative(-13.05f, -1.66f, -14.7f, -14.7f)
                verticalLineToRelative(-87.82f)
                reflectiveCurveTo(5.18f, 6.63f, 20.19f, 5.39f)
                horizontalLineToRelative(35.11f)
                lineTo(60.17f, 0.1f)
                lineTo(18.64f, 0.1f)
                close()
                moveTo(71.97f, 0.1f)
                lineTo(66.49f, 5.59f)
                lineTo(107.6f, 5.59f)
                reflectiveCurveToRelative(13.05f, 1.66f, 14.7f, 14.7f)
                verticalLineToRelative(87.82f)
                reflectiveCurveToRelative(0.52f, 13.26f, -14.5f, 14.5f)
                lineTo(72.8f, 122.62f)
                lineToRelative(-4.97f, 5.28f)
                horizontalLineToRelative(41.53f)
                reflectiveCurveToRelative(16.36f, -0.83f, 18.64f, -18.64f)
                lineTo(128.0f, 19.88f)
                reflectiveCurveTo(126.86f, 1.97f, 108.22f, 0.1f)
                lineTo(71.98f, 0.1f)
                close()
                moveTo(25.37f, 14.91f)
                curveToRelative(-3.52f, 0.1f, -10.25f, 2.49f, -10.25f, 10.36f)
                verticalLineToRelative(56.13f)
                curveToRelative(0.31f, 3.31f, 2.9f, 9.63f, 9.84f, 9.63f)
                horizontalLineToRelative(7.25f)
                verticalLineToRelative(-4.87f)
                horizontalLineToRelative(-7.35f)
                curveToRelative(-4.04f, 0.0f, -4.76f, -4.25f, -4.97f, -5.07f)
                lineTo(19.88f, 25.37f)
                curveToRelative(0.0f, -4.97f, 4.66f, -5.39f, 5.49f, -5.49f)
                lineToRelative(54.57f, 0.21f)
                curveToRelative(4.14f, 0.0f, 4.97f, 4.45f, 5.18f, 5.28f)
                verticalLineToRelative(5.7f)
                horizontalLineToRelative(4.97f)
                verticalLineToRelative(-6.11f)
                curveToRelative(-0.41f, -3.42f, -3.0f, -9.84f, -10.04f, -9.84f)
                lineToRelative(-54.68f, -0.21f)
                close()
                moveTo(47.53f, 36.25f)
                curveToRelative(-3.42f, 0.1f, -9.94f, 2.38f, -9.94f, 9.94f)
                verticalLineToRelative(56.13f)
                curveToRelative(0.31f, 3.21f, 2.69f, 9.22f, 9.42f, 9.22f)
                horizontalLineToRelative(54.37f)
                curveToRelative(0.62f, 0.0f, 4.66f, -0.1f, 7.56f, -3.0f)
                curveToRelative(1.97f, -1.86f, 2.9f, -4.45f, 2.9f, -7.56f)
                lineTo(111.84f, 45.88f)
                curveToRelative(-0.31f, -3.21f, -2.8f, -9.42f, -9.63f, -9.42f)
                lineToRelative(-54.58f, -0.21f)
                horizontalLineToRelative(-0.1f)
                close()
                moveTo(47.64f, 40.39f)
                lineTo(102.11f, 40.6f)
                curveToRelative(4.56f, 0.0f, 5.49f, 4.76f, 5.59f, 5.7f)
                verticalLineToRelative(54.78f)
                curveToRelative(0.0f, 1.97f, -0.52f, 3.52f, -1.55f, 4.56f)
                curveToRelative(-1.86f, 1.76f, -4.66f, 1.76f, -4.76f, 1.76f)
                horizontalLineToRelative(-54.37f)
                curveToRelative(-4.35f, 0.0f, -5.18f, -4.66f, -5.28f, -5.49f)
                lineTo(41.73f, 46.19f)
                curveToRelative(0.0f, -5.28f, 5.18f, -5.8f, 5.9f, -5.8f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
