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

public val Twbs.BarChartLine: ImageVector
    get() {
        if (_barChartLine != null) {
            return _barChartLine!!
        }
        _barChartLine = Builder(name = "BarChartLine", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(0.5f, 15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                lineTo(1.0f, 14.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                lineTo(6.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(12.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                lineTo(14.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(9.0f, 14.0f)
                lineTo(9.0f, 7.0f)
                lineTo(7.0f, 7.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(4.0f, 14.0f)
                verticalLineToRelative(-3.0f)
                lineTo(2.0f, 11.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _barChartLine!!
    }

private var _barChartLine: ImageVector? = null
