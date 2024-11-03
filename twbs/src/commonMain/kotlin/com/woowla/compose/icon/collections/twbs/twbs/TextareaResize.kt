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

public val Twbs.TextareaResize: ImageVector
    get() {
        if (_textareaResize != null) {
            return _textareaResize!!
        }
        _textareaResize = Builder(name = "TextareaResize", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.0f)
                horizontalLineToRelative(11.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.0f, 4.5f)
                verticalLineToRelative(7.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-11.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 0.0f, 11.5f)
                close()
                moveTo(2.5f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.0f, 4.5f)
                verticalLineToRelative(7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 2.5f, 13.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 3.0f)
                close()
                moveTo(13.354f, 7.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.708f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, -0.708f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
                moveToRelative(0.0f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.708f)
                lineToRelative(-0.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, -0.708f)
                lineToRelative(0.5f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
            }
        }
        .build()
        return _textareaResize!!
    }

private var _textareaResize: ImageVector? = null
