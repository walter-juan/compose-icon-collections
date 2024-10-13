package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxAlarmOff: ImageVector
    get() {
        if (_bxAlarmOff != null) {
            return _bxAlarmOff!!
        }
        _bxAlarmOff = Builder(name = "BxAlarmOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.292f, 6.708f)
                lineToRelative(-3.01f, -3.0f)
                lineToRelative(1.412f, -1.417f)
                lineToRelative(3.01f, 3.0f)
                close()
                moveTo(21.707f, 20.293f)
                lineTo(19.42f, 18.006f)
                curveTo(20.409f, 16.563f, 21.0f, 14.838f, 21.0f, 13.0f)
                curveToRelative(0.0f, -4.879f, -4.121f, -9.0f, -9.0f, -9.0f)
                curveToRelative(-1.838f, 0.0f, -3.563f, 0.591f, -5.006f, 1.58f)
                lineTo(5.91f, 4.496f)
                lineToRelative(0.788f, -0.79f)
                lineToRelative(-1.416f, -1.412f)
                lineToRelative(-0.786f, 0.788f)
                lineToRelative(-0.789f, -0.789f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(18.0f, 18.0f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(3.794f, 0.0f, 7.0f, 3.206f, 7.0f, 7.0f)
                curveToRelative(0.0f, 1.292f, -0.387f, 2.507f, -1.027f, 3.559f)
                lineTo(15.414f, 14.0f)
                lineTo(17.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.586f)
                lineTo(13.0f, 11.586f)
                lineTo(13.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.586f)
                lineTo(8.441f, 7.027f)
                curveTo(9.493f, 6.387f, 10.708f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(4.305f, 8.426f)
                arcTo(8.792f, 8.792f, 0.0f, false, false, 3.0f, 13.0f)
                curveToRelative(0.0f, 4.879f, 4.121f, 9.0f, 9.0f, 9.0f)
                arcToRelative(8.792f, 8.792f, 0.0f, false, false, 4.574f, -1.305f)
                lineToRelative(-1.461f, -1.461f)
                arcTo(6.801f, 6.801f, 0.0f, false, true, 12.0f, 20.0f)
                curveToRelative(-3.794f, 0.0f, -7.0f, -3.206f, -7.0f, -7.0f)
                curveToRelative(0.0f, -1.111f, 0.281f, -2.169f, 0.766f, -3.113f)
                lineTo(4.305f, 8.426f)
                close()
            }
        }
        .build()
        return _bxAlarmOff!!
    }

private var _bxAlarmOff: ImageVector? = null
