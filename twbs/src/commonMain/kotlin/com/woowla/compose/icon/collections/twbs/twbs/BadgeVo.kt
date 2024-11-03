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

public val Twbs.BadgeVo: ImageVector
    get() {
        if (_badgeVo != null) {
            return _badgeVo!!
        }
        _badgeVo = Builder(name = "BadgeVo", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.508f, 11.0f)
                horizontalLineToRelative(1.429f)
                lineToRelative(1.99f, -5.999f)
                horizontalLineTo(6.61f)
                lineTo(5.277f, 9.708f)
                horizontalLineTo(5.22f)
                lineTo(3.875f, 5.001f)
                horizontalLineTo(2.5f)
                close()
                moveTo(13.5f, 8.39f)
                verticalLineToRelative(-0.77f)
                curveToRelative(0.0f, -1.696f, -0.962f, -2.733f, -2.566f, -2.733f)
                reflectiveCurveTo(8.363f, 5.916f, 8.363f, 7.621f)
                verticalLineToRelative(0.769f)
                curveToRelative(0.0f, 1.691f, 0.967f, 2.724f, 2.57f, 2.724f)
                curveToRelative(1.605f, 0.0f, 2.567f, -1.033f, 2.567f, -2.724f)
                moveToRelative(-1.204f, -0.778f)
                verticalLineToRelative(0.782f)
                curveToRelative(0.0f, 1.156f, -0.571f, 1.732f, -1.362f, 1.732f)
                curveToRelative(-0.796f, 0.0f, -1.363f, -0.576f, -1.363f, -1.732f)
                verticalLineToRelative(-0.782f)
                curveToRelative(0.0f, -1.156f, 0.567f, -1.736f, 1.363f, -1.736f)
                curveToRelative(0.79f, 0.0f, 1.362f, 0.58f, 1.362f, 1.736f)
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
        return _badgeVo!!
    }

private var _badgeVo: ImageVector? = null
