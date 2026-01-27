package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Textual: ImageVector
    get() {
        if (_textual != null) {
            return _textual!!
        }
        _textual = Builder(name = "Textual", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.746f, 2.731f)
                lineTo(24.0f, 2.731f)
                lineToRelative(-1.722f, 3.873f)
                lineToRelative(-3.143f, 1.768f)
                lineTo(17.0f, 8.372f)
                lineToRelative(-5.182f, 10.552f)
                lineToRelative(-3.128f, 2.345f)
                lineTo(5.283f, 21.269f)
                lineToRelative(0.747f, -11.216f)
                lineTo(1.67f, 10.053f)
                lineTo(0.0f, 6.296f)
                lineToRelative(2.511f, -1.884f)
                horizontalLineToRelative(8.246f)
                close()
                moveTo(2.709f, 5.006f)
                lineToRelative(-1.45f, 1.088f)
                horizontalLineToRelative(8.952f)
                lineToRelative(0.249f, -1.088f)
                close()
                moveTo(0.825f, 6.69f)
                lineToRelative(1.23f, 2.77f)
                horizontalLineToRelative(4.611f)
                lineToRelative(-0.747f, 11.215f)
                horizontalLineToRelative(0.941f)
                lineTo(10.074f, 6.69f)
                close()
                moveTo(8.392f, 20.675f)
                lineTo(13.624f, 7.778f)
                horizontalLineToRelative(5.24f)
                lineToRelative(1.23f, -2.77f)
                lineTo(11.07f, 5.008f)
                lineTo(7.469f, 20.675f)
                close()
                moveTo(22.412f, 3.325f)
                horizontalLineToRelative(-8.508f)
                lineToRelative(-1.935f, 1.087f)
                horizontalLineToRelative(8.505f)
                close()
            }
        }
        .build()
        return _textual!!
    }

private var _textual: ImageVector? = null
