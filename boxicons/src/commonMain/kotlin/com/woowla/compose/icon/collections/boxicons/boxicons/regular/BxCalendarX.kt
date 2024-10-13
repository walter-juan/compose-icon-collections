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

public val RegularGroup.BxCalendarX: ImageVector
    get() {
        if (_bxCalendarX != null) {
            return _bxCalendarX!!
        }
        _bxCalendarX = Builder(name = "BxCalendarX", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.293f, 16.293f)
                lineToRelative(1.414f, 1.414f)
                lineTo(12.0f, 15.414f)
                lineToRelative(2.293f, 2.293f)
                lineToRelative(1.414f, -1.414f)
                lineTo(13.414f, 14.0f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(12.0f, 12.586f)
                lineToRelative(-2.293f, -2.293f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(10.586f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 4.0f)
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
                horizontalLineToRelative(14.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(21.0f, 6.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(19.002f, 20.0f)
                lineTo(5.0f, 20.0f)
                lineTo(5.0f, 8.0f)
                horizontalLineToRelative(14.0f)
                lineToRelative(0.002f, 12.0f)
                close()
            }
        }
        .build()
        return _bxCalendarX!!
    }

private var _bxCalendarX: ImageVector? = null
