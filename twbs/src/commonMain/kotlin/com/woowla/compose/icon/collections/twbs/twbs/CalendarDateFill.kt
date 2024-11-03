package com.woowla.compose.icon.collections.twbs.twbs

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
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.CalendarDateFill: ImageVector
    get() {
        if (_calendarDateFill != null) {
            return _calendarDateFill!!
        }
        _calendarDateFill = Builder(name = "CalendarDateFill", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
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
                moveTo(9.402f, 10.246f)
                curveToRelative(0.625f, 0.0f, 1.184f, -0.484f, 1.184f, -1.18f)
                curveToRelative(0.0f, -0.832f, -0.527f, -1.23f, -1.16f, -1.23f)
                curveToRelative(-0.586f, 0.0f, -1.168f, 0.387f, -1.168f, 1.21f)
                curveToRelative(0.0f, 0.817f, 0.543f, 1.2f, 1.144f, 1.2f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 14.0f)
                lineTo(16.0f, 5.0f)
                lineTo(0.0f, 5.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                moveToRelative(-6.664f, -1.21f)
                curveToRelative(-1.11f, 0.0f, -1.656f, -0.767f, -1.703f, -1.407f)
                horizontalLineToRelative(0.683f)
                curveToRelative(0.043f, 0.37f, 0.387f, 0.82f, 1.051f, 0.82f)
                curveToRelative(0.844f, 0.0f, 1.301f, -0.848f, 1.305f, -2.164f)
                horizontalLineToRelative(-0.027f)
                curveToRelative(-0.153f, 0.414f, -0.637f, 0.79f, -1.383f, 0.79f)
                curveToRelative(-0.852f, 0.0f, -1.676f, -0.61f, -1.676f, -1.77f)
                curveToRelative(0.0f, -1.137f, 0.871f, -1.809f, 1.797f, -1.809f)
                curveToRelative(1.172f, 0.0f, 1.953f, 0.734f, 1.953f, 2.668f)
                curveToRelative(0.0f, 1.805f, -0.742f, 2.871f, -2.0f, 2.871f)
                close()
                moveTo(6.446f, 7.355f)
                verticalLineToRelative(5.332f)
                lineTo(5.77f, 12.687f)
                lineTo(5.77f, 8.079f)
                horizontalLineToRelative(-0.012f)
                curveToRelative(-0.29f, 0.156f, -0.883f, 0.52f, -1.258f, 0.777f)
                lineTo(4.5f, 8.16f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, true, 1.313f, -0.805f)
                horizontalLineToRelative(0.632f)
                close()
            }
        }
        .build()
        return _calendarDateFill!!
    }

private var _calendarDateFill: ImageVector? = null
