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

public val Twbs.PhoneVibrate: ImageVector
    get() {
        if (_phoneVibrate != null) {
            return _phoneVibrate!!
        }
        _phoneVibrate = Builder(name = "PhoneVibrate", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(6.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                moveTo(1.599f, 4.058f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.208f, 0.676f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 1.0f, 8.0f)
                curveToRelative(0.0f, 1.18f, 0.292f, 2.292f, 0.807f, 3.266f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.884f, 0.468f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 0.0f, 8.0f)
                curveToRelative(0.0f, -1.347f, 0.334f, -2.619f, 0.923f, -3.734f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.676f, -0.208f)
                moveToRelative(12.802f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.676f, 0.208f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 16.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.923f, 3.734f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.884f, -0.468f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 15.0f, 8.0f)
                curveToRelative(0.0f, -1.18f, -0.292f, -2.292f, -0.807f, -3.266f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.208f, -0.676f)
                moveTo(3.057f, 5.534f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.284f, 0.648f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 3.0f, 8.0f)
                curveToRelative(0.0f, 0.642f, 0.12f, 1.255f, 0.34f, 1.818f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.93f, 0.364f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 2.0f, 8.0f)
                curveToRelative(0.0f, -0.769f, 0.145f, -1.505f, 0.41f, -2.182f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.647f, -0.284f)
                moveToRelative(9.886f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.648f, 0.284f)
                curveTo(13.855f, 6.495f, 14.0f, 7.231f, 14.0f, 8.0f)
                reflectiveCurveToRelative(-0.145f, 1.505f, -0.41f, 2.182f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.93f, -0.364f)
                curveTo(12.88f, 9.255f, 13.0f, 8.642f, 13.0f, 8.0f)
                reflectiveCurveToRelative(-0.12f, -1.255f, -0.34f, -1.818f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.283f, -0.648f)
            }
        }
        .build()
        return _phoneVibrate!!
    }

private var _phoneVibrate: ImageVector? = null
