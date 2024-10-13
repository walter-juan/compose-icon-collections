package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsAlarmOff: ImageVector
    get() {
        if (_bxsAlarmOff != null) {
            return _bxsAlarmOff!!
        }
        _bxsAlarmOff = Builder(name = "BxsAlarmOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.292f, 6.708f)
                lineToRelative(-3.01f, -3.0f)
                lineToRelative(1.412f, -1.417f)
                lineToRelative(3.01f, 3.0f)
                close()
                moveTo(21.707f, 20.293f)
                lineTo(19.42f, 18.005f)
                curveTo(20.409f, 16.563f, 21.0f, 14.837f, 21.0f, 13.0f)
                curveToRelative(0.0f, -4.878f, -4.121f, -9.0f, -9.0f, -9.0f)
                curveToRelative(-1.838f, 0.0f, -3.563f, 0.59f, -5.006f, 1.581f)
                lineTo(5.91f, 4.496f)
                lineToRelative(0.788f, -0.79f)
                lineToRelative(-1.416f, -1.412f)
                lineToRelative(-0.786f, 0.788f)
                lineToRelative(-0.789f, -0.789f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(18.0f, 18.0f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(17.0f, 14.0f)
                horizontalLineToRelative(-1.586f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(17.0f, 12.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(11.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.586f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(11.0f, 8.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(1.658f, 0.0f, 3.224f, -0.485f, 4.574f, -1.305f)
                lineTo(4.305f, 8.426f)
                arcTo(8.794f, 8.794f, 0.0f, false, false, 3.0f, 13.0f)
                curveToRelative(0.0f, 4.878f, 4.122f, 9.0f, 9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _bxsAlarmOff!!
    }

private var _bxsAlarmOff: ImageVector? = null
