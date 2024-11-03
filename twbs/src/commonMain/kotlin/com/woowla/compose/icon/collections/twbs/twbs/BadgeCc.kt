package com.woowla.compose.icon.collections.twbs.twbs

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
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.BadgeCc: ImageVector
    get() {
        if (_badgeCc != null) {
            return _badgeCc!!
        }
        _badgeCc = Builder(name = "BadgeCc", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.708f, 7.755f)
                curveToRelative(0.0f, -1.111f, 0.488f, -1.753f, 1.319f, -1.753f)
                curveToRelative(0.681f, 0.0f, 1.138f, 0.47f, 1.186f, 1.107f)
                lineTo(7.36f, 7.109f)
                lineTo(7.36f, 7.0f)
                curveToRelative(-0.052f, -1.186f, -1.024f, -2.0f, -2.342f, -2.0f)
                curveTo(3.414f, 5.0f, 2.5f, 6.05f, 2.5f, 7.751f)
                verticalLineToRelative(0.747f)
                curveToRelative(0.0f, 1.7f, 0.905f, 2.73f, 2.518f, 2.73f)
                curveToRelative(1.314f, 0.0f, 2.285f, -0.792f, 2.342f, -1.939f)
                verticalLineToRelative(-0.114f)
                lineTo(6.213f, 9.175f)
                curveToRelative(-0.048f, 0.615f, -0.496f, 1.05f, -1.186f, 1.05f)
                curveToRelative(-0.84f, 0.0f, -1.319f, -0.62f, -1.319f, -1.727f)
                close()
                moveTo(9.848f, 7.755f)
                curveToRelative(0.0f, -1.111f, 0.488f, -1.753f, 1.318f, -1.753f)
                curveToRelative(0.682f, 0.0f, 1.139f, 0.47f, 1.187f, 1.107f)
                lineTo(13.5f, 7.109f)
                lineTo(13.5f, 7.0f)
                curveToRelative(-0.053f, -1.186f, -1.024f, -2.0f, -2.342f, -2.0f)
                curveTo(9.554f, 5.0f, 8.64f, 6.05f, 8.64f, 7.751f)
                verticalLineToRelative(0.747f)
                curveToRelative(0.0f, 1.7f, 0.905f, 2.73f, 2.518f, 2.73f)
                curveToRelative(1.314f, 0.0f, 2.285f, -0.792f, 2.342f, -1.939f)
                verticalLineToRelative(-0.114f)
                horizontalLineToRelative(-1.147f)
                curveToRelative(-0.048f, 0.615f, -0.497f, 1.05f, -1.187f, 1.05f)
                curveToRelative(-0.839f, 0.0f, -1.318f, -0.62f, -1.318f, -1.727f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _badgeCc!!
    }

private var _badgeCc: ImageVector? = null
