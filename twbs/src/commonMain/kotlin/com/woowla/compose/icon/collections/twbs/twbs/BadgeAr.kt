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

public val Twbs.BadgeAr: ImageVector
    get() {
        if (_badgeAr != null) {
            return _badgeAr!!
        }
        _badgeAr = Builder(name = "BadgeAr", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.794f, 11.0f)
                lineToRelative(0.47f, -1.542f)
                lineTo(6.27f, 9.458f)
                lineTo(6.739f, 11.0f)
                lineTo(8.0f, 11.0f)
                lineTo(5.996f, 5.001f)
                lineTo(4.607f, 5.001f)
                lineTo(2.595f, 11.0f)
                close()
                moveTo(5.297f, 6.148f)
                lineTo(6.031f, 8.574f)
                horizontalLineToRelative(-1.52f)
                lineToRelative(0.734f, -2.426f)
                close()
                moveTo(10.895f, 5.001f)
                lineTo(8.5f, 5.001f)
                lineTo(8.5f, 11.0f)
                horizontalLineToRelative(1.173f)
                lineTo(9.673f, 8.763f)
                horizontalLineToRelative(1.064f)
                lineTo(11.787f, 11.0f)
                horizontalLineToRelative(1.327f)
                lineTo(11.91f, 8.583f)
                curveTo(12.455f, 8.373f, 13.0f, 7.779f, 13.0f, 6.9f)
                curveToRelative(0.0f, -1.147f, -0.773f, -1.9f, -2.105f, -1.9f)
                close()
                moveTo(9.673f, 7.871f)
                lineTo(9.673f, 5.933f)
                horizontalLineToRelative(1.05f)
                curveToRelative(0.63f, 0.0f, 1.05f, 0.347f, 1.05f, 0.989f)
                curveToRelative(0.0f, 0.633f, -0.408f, 0.95f, -1.067f, 0.95f)
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
        return _badgeAr!!
    }

private var _badgeAr: ImageVector? = null
