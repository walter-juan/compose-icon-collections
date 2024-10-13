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

public val SolidGroup.BxsAlarmAdd: ImageVector
    get() {
        if (_bxsAlarmAdd != null) {
            return _bxsAlarmAdd!!
        }
        _bxsAlarmAdd = Builder(name = "BxsAlarmAdd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(-4.879f, 0.0f, -9.0f, 4.121f, -9.0f, 9.0f)
                reflectiveCurveToRelative(4.121f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.121f, 9.0f, -9.0f)
                reflectiveCurveToRelative(-4.121f, -9.0f, -9.0f, -9.0f)
                close()
                moveTo(16.0f, 14.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                lineTo(8.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(11.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(17.284f, 3.707f)
                lineTo(18.696f, 2.291f)
                lineTo(21.706f, 5.291f)
                lineTo(20.293f, 6.708f)
                close()
                moveTo(5.282f, 2.294f)
                lineTo(6.7f, 3.706f)
                lineToRelative(-2.99f, 3.0f)
                lineToRelative(-1.417f, -1.413f)
                close()
            }
        }
        .build()
        return _bxsAlarmAdd!!
    }

private var _bxsAlarmAdd: ImageVector? = null
