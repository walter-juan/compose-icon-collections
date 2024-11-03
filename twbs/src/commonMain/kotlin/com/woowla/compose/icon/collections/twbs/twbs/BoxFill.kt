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

public val Twbs.BoxFill: ImageVector
    get() {
        if (_boxFill != null) {
            return _boxFill!!
        }
        _boxFill = Builder(name = "BoxFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.528f, 2.973f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.472f, 0.696f)
                verticalLineToRelative(8.662f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.472f, 0.696f)
                lineToRelative(-7.25f, 2.9f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.557f, 0.0f)
                lineToRelative(-7.25f, -2.9f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 0.0f, 12.331f)
                lineTo(0.0f, 3.669f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.471f, -0.696f)
                lineTo(7.443f, 0.184f)
                lineToRelative(0.004f, -0.001f)
                lineToRelative(0.274f, -0.11f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.558f, 0.0f)
                lineToRelative(0.274f, 0.11f)
                lineToRelative(0.004f, 0.001f)
                close()
                moveTo(14.154f, 3.5f)
                lineTo(8.0f, 5.962f)
                lineTo(1.846f, 3.5f)
                lineTo(1.0f, 3.839f)
                verticalLineToRelative(0.4f)
                lineToRelative(6.5f, 2.6f)
                verticalLineToRelative(7.922f)
                lineToRelative(0.5f, 0.2f)
                lineToRelative(0.5f, -0.2f)
                lineTo(8.5f, 6.84f)
                lineToRelative(6.5f, -2.6f)
                verticalLineToRelative(-0.4f)
                lineToRelative(-0.846f, -0.339f)
                close()
            }
        }
        .build()
        return _boxFill!!
    }

private var _boxFill: ImageVector? = null
