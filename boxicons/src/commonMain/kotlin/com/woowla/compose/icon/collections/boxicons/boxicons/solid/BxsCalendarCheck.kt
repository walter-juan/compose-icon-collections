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

public val SolidGroup.BxsCalendarCheck: ImageVector
    get() {
        if (_bxsCalendarCheck != null) {
            return _bxsCalendarCheck!!
        }
        _bxsCalendarCheck = Builder(name = "BxsCalendarCheck", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 22.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(21.0f, 6.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(17.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 4.0f)
                lineTo(9.0f, 2.0f)
                lineTo(7.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(11.0f, 18.414f)
                lineTo(7.293f, 14.707f)
                lineTo(8.707f, 13.293f)
                lineTo(11.0f, 15.586f)
                lineToRelative(4.293f, -4.293f)
                lineToRelative(1.414f, 1.414f)
                lineTo(11.0f, 18.414f)
                close()
                moveTo(5.0f, 7.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 9.0f)
                lineTo(5.0f, 7.0f)
                close()
            }
        }
        .build()
        return _bxsCalendarCheck!!
    }

private var _bxsCalendarCheck: ImageVector? = null
