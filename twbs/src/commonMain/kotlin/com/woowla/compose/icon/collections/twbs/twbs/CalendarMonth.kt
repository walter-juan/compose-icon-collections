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

public val Twbs.CalendarMonth: ImageVector
    get() {
        if (_calendarMonth != null) {
            return _calendarMonth!!
        }
        _calendarMonth = Builder(name = "CalendarMonth", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.56f, 11.332f)
                lineTo(3.1f, 9.73f)
                horizontalLineToRelative(1.984f)
                lineToRelative(0.54f, 1.602f)
                horizontalLineToRelative(0.718f)
                lineTo(4.444f, 6.0f)
                horizontalLineToRelative(-0.696f)
                lineTo(1.85f, 11.332f)
                close()
                moveTo(4.104f, 6.805f)
                lineTo(4.9f, 9.18f)
                lineTo(3.284f, 9.18f)
                lineToRelative(0.8f, -2.375f)
                close()
                moveTo(9.85f, 7.227f)
                horizontalLineToRelative(-0.676f)
                lineTo(9.174f, 9.77f)
                curveToRelative(0.0f, 0.652f, -0.414f, 1.023f, -1.004f, 1.023f)
                curveToRelative(-0.539f, 0.0f, -0.98f, -0.246f, -0.98f, -1.012f)
                lineTo(7.19f, 7.227f)
                horizontalLineToRelative(-0.676f)
                verticalLineToRelative(2.746f)
                curveToRelative(0.0f, 0.941f, 0.606f, 1.425f, 1.453f, 1.425f)
                curveToRelative(0.656f, 0.0f, 1.043f, -0.28f, 1.188f, -0.605f)
                horizontalLineToRelative(0.027f)
                verticalLineToRelative(0.539f)
                horizontalLineToRelative(0.668f)
                close()
                moveTo(12.108f, 12.273f)
                curveToRelative(-0.563f, 0.0f, -0.91f, -0.304f, -0.985f, -0.636f)
                horizontalLineToRelative(-0.687f)
                curveToRelative(0.094f, 0.683f, 0.625f, 1.199f, 1.668f, 1.199f)
                curveToRelative(0.93f, 0.0f, 1.746f, -0.527f, 1.746f, -1.578f)
                lineTo(13.85f, 7.227f)
                horizontalLineToRelative(-0.649f)
                verticalLineToRelative(0.578f)
                horizontalLineToRelative(-0.019f)
                curveToRelative(-0.191f, -0.348f, -0.637f, -0.64f, -1.195f, -0.64f)
                curveToRelative(-0.965f, 0.0f, -1.64f, 0.679f, -1.64f, 1.886f)
                verticalLineToRelative(0.34f)
                curveToRelative(0.0f, 1.23f, 0.683f, 1.902f, 1.64f, 1.902f)
                curveToRelative(0.558f, 0.0f, 1.008f, -0.293f, 1.172f, -0.648f)
                horizontalLineToRelative(0.02f)
                verticalLineToRelative(0.605f)
                curveToRelative(0.0f, 0.645f, -0.423f, 1.023f, -1.071f, 1.023f)
                moveToRelative(0.008f, -4.53f)
                curveToRelative(0.648f, 0.0f, 1.062f, 0.527f, 1.062f, 1.359f)
                verticalLineToRelative(0.253f)
                curveToRelative(0.0f, 0.848f, -0.39f, 1.364f, -1.062f, 1.364f)
                curveToRelative(-0.692f, 0.0f, -1.098f, -0.512f, -1.098f, -1.364f)
                verticalLineToRelative(-0.253f)
                curveToRelative(0.0f, -0.868f, 0.406f, -1.36f, 1.098f, -1.36f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                moveTo(1.0f, 4.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _calendarMonth!!
    }

private var _calendarMonth: ImageVector? = null
