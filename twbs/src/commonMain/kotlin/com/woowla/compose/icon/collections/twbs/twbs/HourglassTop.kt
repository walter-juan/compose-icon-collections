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

public val Twbs.HourglassTop: ImageVector
    get() {
        if (_hourglassTop != null) {
            return _hourglassTop!!
        }
        _hourglassTop = Builder(name = "HourglassTop", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 14.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -2.557f, -4.06f)
                curveToRelative(-0.29f, -0.139f, -0.443f, -0.377f, -0.443f, -0.59f)
                verticalLineToRelative(-0.7f)
                curveToRelative(0.0f, -0.213f, 0.154f, -0.451f, 0.443f, -0.59f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 12.5f, 3.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineToRelative(-11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 2.557f, 4.06f)
                curveToRelative(0.29f, 0.139f, 0.443f, 0.377f, 0.443f, 0.59f)
                verticalLineToRelative(0.7f)
                curveToRelative(0.0f, 0.213f, -0.154f, 0.451f, -0.443f, 0.59f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 3.5f, 13.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                moveToRelative(2.5f, -0.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 1.989f, -3.158f)
                curveToRelative(0.533f, -0.256f, 1.011f, -0.79f, 1.011f, -1.491f)
                verticalLineToRelative(-0.702f)
                reflectiveCurveToRelative(0.18f, 0.101f, 0.5f, 0.101f)
                reflectiveCurveToRelative(0.5f, -0.1f, 0.5f, -0.1f)
                verticalLineToRelative(0.7f)
                curveToRelative(0.0f, 0.701f, 0.478f, 1.236f, 1.011f, 1.492f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 11.5f, 13.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _hourglassTop!!
    }

private var _hourglassTop: ImageVector? = null
