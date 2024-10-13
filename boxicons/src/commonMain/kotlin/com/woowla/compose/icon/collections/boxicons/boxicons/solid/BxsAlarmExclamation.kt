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

public val SolidGroup.BxsAlarmExclamation: ImageVector
    get() {
        if (_bxsAlarmExclamation != null) {
            return _bxsAlarmExclamation!!
        }
        _bxsAlarmExclamation = Builder(name = "BxsAlarmExclamation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.284f, 3.707f)
                lineToRelative(1.412f, -1.416f)
                lineToRelative(3.01f, 3.0f)
                lineToRelative(-1.413f, 1.417f)
                close()
                moveTo(6.698f, 3.707f)
                lineTo(3.708f, 6.706f)
                lineTo(2.29f, 5.294f)
                lineToRelative(2.99f, -3.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(-4.879f, 0.0f, -9.0f, 4.121f, -9.0f, 9.0f)
                reflectiveCurveToRelative(4.121f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.121f, 9.0f, -9.0f)
                reflectiveCurveToRelative(-4.121f, -9.0f, -9.0f, -9.0f)
                close()
                moveTo(13.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _bxsAlarmExclamation!!
    }

private var _bxsAlarmExclamation: ImageVector? = null
