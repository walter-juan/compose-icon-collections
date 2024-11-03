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

public val Twbs.BadgeVr: ImageVector
    get() {
        if (_badgeVr != null) {
            return _badgeVr!!
        }
        _badgeVr = Builder(name = "BadgeVr", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.508f, 11.0f)
                horizontalLineToRelative(1.429f)
                lineToRelative(1.99f, -5.999f)
                lineTo(6.61f, 5.001f)
                lineTo(5.277f, 9.708f)
                lineTo(5.22f, 9.708f)
                lineTo(3.875f, 5.001f)
                lineTo(2.5f, 5.001f)
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
        }
        .build()
        return _badgeVr!!
    }

private var _badgeVr: ImageVector? = null
