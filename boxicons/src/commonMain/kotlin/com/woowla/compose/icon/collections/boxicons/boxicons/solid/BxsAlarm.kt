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

public val SolidGroup.BxsAlarm: ImageVector
    get() {
        if (_bxsAlarm != null) {
            return _bxsAlarm!!
        }
        _bxsAlarm = Builder(name = "BxsAlarm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(-4.878f, 0.0f, -9.0f, 4.122f, -9.0f, 9.0f)
                reflectiveCurveToRelative(4.122f, 9.0f, 9.0f, 9.0f)
                curveToRelative(4.879f, 0.0f, 9.0f, -4.122f, 9.0f, -9.0f)
                reflectiveCurveToRelative(-4.121f, -9.0f, -9.0f, -9.0f)
                close()
                moveTo(17.0f, 14.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(11.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(20.292f, 6.708f)
                lineTo(17.282f, 3.708f)
                lineTo(18.694f, 2.291f)
                lineTo(21.704f, 5.291f)
                close()
                moveTo(5.282f, 2.294f)
                lineTo(6.7f, 3.706f)
                lineToRelative(-2.99f, 3.0f)
                lineToRelative(-1.417f, -1.413f)
                close()
            }
        }
        .build()
        return _bxsAlarm!!
    }

private var _bxsAlarm: ImageVector? = null
