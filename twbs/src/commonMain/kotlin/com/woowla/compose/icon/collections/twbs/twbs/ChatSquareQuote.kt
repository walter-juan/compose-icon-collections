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

public val Twbs.ChatSquareQuote: ImageVector
    get() {
        if (_chatSquareQuote != null) {
            return _chatSquareQuote!!
        }
        _chatSquareQuote = Builder(name = "ChatSquareQuote", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.6f, 0.8f)
                lineTo(8.0f, 14.333f)
                lineTo(6.1f, 11.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.6f, -0.8f)
                horizontalLineTo(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.8f, 0.4f)
                lineToRelative(1.9f, 2.533f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.6f, 0.0f)
                lineToRelative(1.9f, -2.533f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.8f, -0.4f)
                horizontalLineTo(14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.066f, 4.76f)
                arcTo(1.665f, 1.665f, 0.0f, false, false, 4.0f, 5.668f)
                arcToRelative(1.667f, 1.667f, 0.0f, false, false, 2.561f, 1.406f)
                curveToRelative(-0.131f, 0.389f, -0.375f, 0.804f, -0.777f, 1.22f)
                arcToRelative(0.417f, 0.417f, 0.0f, true, false, 0.6f, 0.58f)
                curveToRelative(1.486f, -1.54f, 1.293f, -3.214f, 0.682f, -4.112f)
                close()
                moveTo(11.066f, 4.76f)
                arcTo(1.665f, 1.665f, 0.0f, false, false, 8.0f, 5.668f)
                arcToRelative(1.667f, 1.667f, 0.0f, false, false, 2.561f, 1.406f)
                curveToRelative(-0.131f, 0.389f, -0.375f, 0.804f, -0.777f, 1.22f)
                arcToRelative(0.417f, 0.417f, 0.0f, true, false, 0.6f, 0.58f)
                curveToRelative(1.486f, -1.54f, 1.293f, -3.214f, 0.682f, -4.112f)
                close()
            }
        }
        .build()
        return _chatSquareQuote!!
    }

private var _chatSquareQuote: ImageVector? = null
