package com.woowla.compose.icon.collections.boxicons.boxicons.regular

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
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxAlarmExclamation: ImageVector
    get() {
        if (_bxAlarmExclamation != null) {
            return _bxAlarmExclamation!!
        }
        _bxAlarmExclamation = Builder(name = "BxAlarmExclamation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveToRelative(4.879f, 0.0f, 9.0f, -4.121f, 9.0f, -9.0f)
                reflectiveCurveToRelative(-4.121f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveToRelative(-9.0f, 4.121f, -9.0f, 9.0f)
                reflectiveCurveToRelative(4.121f, 9.0f, 9.0f, 9.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(3.794f, 0.0f, 7.0f, 3.206f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.206f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.206f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.206f, -7.0f, 7.0f, -7.0f)
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _bxAlarmExclamation!!
    }

private var _bxAlarmExclamation: ImageVector? = null
