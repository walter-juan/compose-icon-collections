package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Highlighter: ImageVector
    get() {
        if (_highlighter != null) {
            return _highlighter!!
        }
        _highlighter = Builder(name = "Highlighter", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.096f, 0.644f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.791f, 0.036f)
                lineToRelative(1.433f, 1.433f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.035f, 2.791f)
                lineToRelative(-0.413f, 0.435f)
                lineToRelative(-8.07f, 8.995f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.372f, 0.166f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.234f, -0.058f)
                lineToRelative(-0.412f, 0.412f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 15.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.354f, -0.854f)
                lineToRelative(1.412f, -1.412f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 1.5f, 12.5f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.166f, -0.372f)
                lineToRelative(8.995f, -8.07f)
                close()
                moveTo(10.981f, 2.114f)
                lineTo(2.727f, 9.52f)
                lineToRelative(3.753f, 3.753f)
                lineToRelative(7.406f, -8.254f)
                close()
                moveTo(14.566f, 4.284f)
                lineTo(14.63f, 4.216f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.017f, -1.396f)
                lineTo(13.18f, 1.387f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.396f, -0.018f)
                lineToRelative(-0.068f, 0.065f)
                close()
                moveTo(5.293f, 13.5f)
                lineTo(2.5f, 10.707f)
                verticalLineToRelative(1.586f)
                lineTo(3.707f, 13.5f)
                close()
            }
        }
        .build()
        return _highlighter!!
    }

private var _highlighter: ImageVector? = null
