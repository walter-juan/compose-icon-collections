package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.CalendarDayFill: ImageVector
    get() {
        if (_calendarDayFill != null) {
            return _calendarDayFill!!
        }
        _calendarDayFill = Builder(name = "CalendarDayFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                lineTo(3.0f, 1.0f)
                lineTo(2.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(16.0f)
                lineTo(16.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(13.0f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                lineTo(12.0f, 1.0f)
                lineTo(4.0f, 1.0f)
                close()
                moveTo(16.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(2.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(0.0f, 5.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(11.215f, 7.855f)
                arcToRelative(0.428f, 0.428f, 0.0f, true, false, 0.0f, -0.855f)
                arcToRelative(0.426f, 0.426f, 0.0f, false, false, -0.43f, 0.43f)
                curveToRelative(0.0f, 0.238f, 0.192f, 0.425f, 0.43f, 0.425f)
                moveToRelative(0.336f, 0.563f)
                horizontalLineToRelative(-0.672f)
                verticalLineToRelative(4.105f)
                horizontalLineToRelative(0.672f)
                close()
                moveTo(4.684f, 12.523f)
                verticalLineToRelative(-2.3f)
                horizontalLineToRelative(2.261f)
                verticalLineToRelative(-0.61f)
                lineTo(4.684f, 9.613f)
                lineTo(4.684f, 7.801f)
                horizontalLineToRelative(2.464f)
                verticalLineToRelative(-0.61f)
                lineTo(4.0f, 7.191f)
                verticalLineToRelative(5.332f)
                close()
                moveTo(7.98f, 12.523f)
                horizontalLineToRelative(0.676f)
                lineTo(8.656f, 9.98f)
                curveToRelative(0.0f, -0.554f, 0.227f, -1.007f, 0.953f, -1.007f)
                curveToRelative(0.125f, 0.0f, 0.258f, 0.004f, 0.329f, 0.015f)
                verticalLineToRelative(-0.613f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.254f, -0.02f)
                curveToRelative(-0.582f, 0.0f, -0.891f, 0.32f, -1.012f, 0.567f)
                horizontalLineToRelative(-0.02f)
                verticalLineToRelative(-0.504f)
                lineTo(7.98f, 8.418f)
                close()
            }
        }
        .build()
        return _calendarDayFill!!
    }

private var _calendarDayFill: ImageVector? = null
