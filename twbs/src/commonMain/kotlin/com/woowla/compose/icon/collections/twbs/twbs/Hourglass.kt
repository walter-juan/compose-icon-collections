package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Hourglass: ImageVector
    get() {
        if (_hourglass != null) {
            return _hourglass!!
        }
        _hourglass = Builder(name = "Hourglass", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -2.557f, 4.06f)
                curveToRelative(-0.29f, 0.139f, -0.443f, 0.377f, -0.443f, 0.59f)
                verticalLineToRelative(0.7f)
                curveToRelative(0.0f, 0.213f, 0.154f, 0.451f, 0.443f, 0.59f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 12.5f, 13.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 2.557f, -4.06f)
                curveToRelative(0.29f, -0.139f, 0.443f, -0.377f, 0.443f, -0.59f)
                verticalLineToRelative(-0.7f)
                curveToRelative(0.0f, -0.213f, -0.154f, -0.451f, -0.443f, -0.59f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 3.5f, 3.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                moveToRelative(2.5f, 0.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.989f, 3.158f)
                curveToRelative(0.533f, 0.256f, 1.011f, 0.791f, 1.011f, 1.491f)
                verticalLineToRelative(0.702f)
                curveToRelative(0.0f, 0.7f, -0.478f, 1.235f, -1.011f, 1.491f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 4.5f, 13.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.989f, -3.158f)
                curveTo(8.978f, 9.586f, 8.5f, 9.052f, 8.5f, 8.351f)
                verticalLineToRelative(-0.702f)
                curveToRelative(0.0f, -0.7f, 0.478f, -1.235f, 1.011f, -1.491f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 11.5f, 3.0f)
                verticalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
