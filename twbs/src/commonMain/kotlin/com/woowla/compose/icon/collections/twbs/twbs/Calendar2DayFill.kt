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

public val Twbs.Calendar2DayFill: ImageVector
    get() {
        if (_calendar2DayFill != null) {
            return _calendar2DayFill!!
        }
        _calendar2DayFill = Builder(name = "Calendar2DayFill", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(4.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                lineTo(12.0f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                lineTo(13.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(2.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(0.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(3.0f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                moveToRelative(9.954f, 3.0f)
                lineTo(2.545f, 3.0f)
                curveToRelative(-0.3f, 0.0f, -0.545f, 0.224f, -0.545f, 0.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.276f, 0.244f, 0.5f, 0.545f, 0.5f)
                horizontalLineToRelative(10.91f)
                curveToRelative(0.3f, 0.0f, 0.545f, -0.224f, 0.545f, -0.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.276f, -0.244f, -0.5f, -0.546f, -0.5f)
                moveToRelative(-2.24f, 4.855f)
                arcToRelative(0.428f, 0.428f, 0.0f, true, false, 0.0f, -0.855f)
                arcToRelative(0.426f, 0.426f, 0.0f, false, false, -0.429f, 0.43f)
                curveToRelative(0.0f, 0.238f, 0.192f, 0.425f, 0.43f, 0.425f)
                close()
                moveTo(11.551f, 8.418f)
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
        return _calendar2DayFill!!
    }

private var _calendar2DayFill: ImageVector? = null
