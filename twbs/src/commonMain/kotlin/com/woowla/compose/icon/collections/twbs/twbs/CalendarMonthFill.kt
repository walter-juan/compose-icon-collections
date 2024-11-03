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

public val Twbs.CalendarMonthFill: ImageVector
    get() {
        if (_calendarMonthFill != null) {
            return _calendarMonthFill!!
        }
        _calendarMonthFill = Builder(name = "CalendarMonthFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
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
                moveTo(4.104f, 7.805f)
                lineTo(4.9f, 10.18f)
                lineTo(3.284f, 10.18f)
                lineToRelative(0.8f, -2.375f)
                close()
                moveTo(13.178f, 10.102f)
                curveToRelative(0.0f, -0.832f, -0.414f, -1.36f, -1.062f, -1.36f)
                curveToRelative(-0.692f, 0.0f, -1.098f, 0.492f, -1.098f, 1.36f)
                verticalLineToRelative(0.253f)
                curveToRelative(0.0f, 0.852f, 0.406f, 1.364f, 1.098f, 1.364f)
                curveToRelative(0.671f, 0.0f, 1.062f, -0.516f, 1.062f, -1.364f)
                close()
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
                moveTo(2.56f, 12.332f)
                horizontalLineToRelative(-0.71f)
                lineTo(3.748f, 7.0f)
                horizontalLineToRelative(0.696f)
                lineToRelative(1.898f, 5.332f)
                horizontalLineToRelative(-0.719f)
                lineToRelative(-0.539f, -1.602f)
                lineTo(3.1f, 10.73f)
                close()
                moveTo(9.85f, 8.227f)
                verticalLineToRelative(4.105f)
                horizontalLineToRelative(-0.668f)
                verticalLineToRelative(-0.539f)
                horizontalLineToRelative(-0.027f)
                curveToRelative(-0.145f, 0.324f, -0.532f, 0.605f, -1.188f, 0.605f)
                curveToRelative(-0.847f, 0.0f, -1.453f, -0.484f, -1.453f, -1.425f)
                lineTo(6.514f, 8.227f)
                horizontalLineToRelative(0.676f)
                verticalLineToRelative(2.554f)
                curveToRelative(0.0f, 0.766f, 0.441f, 1.012f, 0.98f, 1.012f)
                curveToRelative(0.59f, 0.0f, 1.004f, -0.371f, 1.004f, -1.023f)
                lineTo(9.174f, 8.227f)
                close()
                moveTo(11.123f, 12.637f)
                curveToRelative(0.075f, 0.332f, 0.422f, 0.636f, 0.985f, 0.636f)
                curveToRelative(0.648f, 0.0f, 1.07f, -0.378f, 1.07f, -1.023f)
                verticalLineToRelative(-0.605f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.163f, 0.355f, -0.613f, 0.648f, -1.171f, 0.648f)
                curveToRelative(-0.957f, 0.0f, -1.64f, -0.672f, -1.64f, -1.902f)
                verticalLineToRelative(-0.34f)
                curveToRelative(0.0f, -1.207f, 0.675f, -1.887f, 1.64f, -1.887f)
                curveToRelative(0.558f, 0.0f, 1.004f, 0.293f, 1.195f, 0.64f)
                horizontalLineToRelative(0.02f)
                verticalLineToRelative(-0.577f)
                horizontalLineToRelative(0.648f)
                verticalLineToRelative(4.03f)
                curveToRelative(0.0f, 1.052f, -0.816f, 1.579f, -1.746f, 1.579f)
                curveToRelative(-1.043f, 0.0f, -1.574f, -0.516f, -1.668f, -1.2f)
                close()
            }
        }
        .build()
        return _calendarMonthFill!!
    }

private var _calendarMonthFill: ImageVector? = null
