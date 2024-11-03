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

public val Twbs.PhoneVibrateFill: ImageVector
    get() {
        if (_phoneVibrateFill != null) {
            return _phoneVibrateFill!!
        }
        _phoneVibrateFill = Builder(name = "PhoneVibrateFill", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(6.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(9.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                moveTo(1.807f, 4.734f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.884f, -0.468f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 0.0f, 8.0f)
                curveToRelative(0.0f, 1.347f, 0.334f, 2.618f, 0.923f, 3.734f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.884f, -0.468f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 1.0f, 8.0f)
                curveToRelative(0.0f, -1.18f, 0.292f, -2.292f, 0.807f, -3.266f)
                moveToRelative(13.27f, -0.468f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.884f, 0.468f)
                curveTo(14.708f, 5.708f, 15.0f, 6.819f, 15.0f, 8.0f)
                curveToRelative(0.0f, 1.18f, -0.292f, 2.292f, -0.807f, 3.266f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.884f, 0.468f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 16.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.923f, -3.734f)
                moveTo(3.34f, 6.182f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.93f, -0.364f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 2.0f, 8.0f)
                curveToRelative(0.0f, 0.769f, 0.145f, 1.505f, 0.41f, 2.182f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.93f, -0.364f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 3.0f, 8.0f)
                curveToRelative(0.0f, -0.642f, 0.12f, -1.255f, 0.34f, -1.818f)
                moveToRelative(10.25f, -0.364f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.93f, 0.364f)
                curveToRelative(0.22f, 0.563f, 0.34f, 1.176f, 0.34f, 1.818f)
                reflectiveCurveToRelative(-0.12f, 1.255f, -0.34f, 1.818f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.93f, 0.364f)
                curveTo(13.856f, 9.505f, 14.0f, 8.769f, 14.0f, 8.0f)
                reflectiveCurveToRelative(-0.145f, -1.505f, -0.41f, -2.182f)
            }
        }
        .build()
        return _phoneVibrateFill!!
    }

private var _phoneVibrateFill: ImageVector? = null
