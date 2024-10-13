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

public val SolidGroup.BxsCalendarX: ImageVector
    get() {
        if (_bxsCalendarX != null) {
            return _bxsCalendarX!!
        }
        _bxsCalendarX = Builder(name = "BxsCalendarX", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(15.707f, 17.293f)
                lineTo(14.293f, 18.707f)
                lineTo(12.0f, 16.414f)
                lineToRelative(-2.293f, 2.293f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(10.586f, 15.0f)
                lineToRelative(-2.293f, -2.293f)
                lineToRelative(1.414f, -1.414f)
                lineTo(12.0f, 13.586f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(1.414f, 1.414f)
                lineTo(13.414f, 15.0f)
                lineToRelative(2.293f, 2.293f)
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
        return _bxsCalendarX!!
    }

private var _bxsCalendarX: ImageVector? = null
