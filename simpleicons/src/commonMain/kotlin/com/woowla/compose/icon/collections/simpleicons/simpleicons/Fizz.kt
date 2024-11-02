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

public val Simpleicons.Fizz: ImageVector
    get() {
        if (_fizz != null) {
            return _fizz!!
        }
        _fizz = Builder(name = "Fizz", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.822f, 17.813f)
                horizontalLineToRelative(3.274f)
                verticalLineToRelative(-7.228f)
                lineTo(5.822f, 10.585f)
                close()
                moveTo(10.12f, 10.585f)
                verticalLineToRelative(2.841f)
                horizontalLineToRelative(2.107f)
                lineToRelative(-2.243f, 4.387f)
                horizontalLineToRelative(6.779f)
                verticalLineToRelative(-2.824f)
                horizontalLineToRelative(-2.24f)
                lineToRelative(2.24f, -4.399f)
                horizontalLineToRelative(-6.644f)
                verticalLineToRelative(-0.005f)
                close()
                moveTo(24.0f, 10.585f)
                horizontalLineToRelative(-6.762f)
                verticalLineToRelative(2.841f)
                horizontalLineToRelative(2.241f)
                lineToRelative(-2.24f, 4.387f)
                horizontalLineToRelative(6.633f)
                verticalLineToRelative(-2.824f)
                lineTo(21.76f, 14.989f)
                close()
                moveTo(6.633f, 6.966f)
                lineToRelative(-1.23f, 2.736f)
                arcToRelative(1.587f, 1.587f, 0.0f, false, false, -0.955f, -0.324f)
                curveToRelative(-0.56f, 0.0f, -1.012f, 0.363f, -1.012f, 1.125f)
                verticalLineToRelative(0.038f)
                lineTo(5.13f, 10.541f)
                verticalLineToRelative(2.858f)
                lineTo(3.43f, 13.399f)
                verticalLineToRelative(4.414f)
                lineTo(0.0f, 17.813f)
                verticalLineToRelative(-7.804f)
                curveToRelative(0.0f, -2.292f, 1.737f, -3.822f, 3.895f, -3.822f)
                curveToRelative(1.056f, 0.0f, 2.023f, 0.351f, 2.738f, 0.779f)
                close()
            }
        }
        .build()
        return _fizz!!
    }

private var _fizz: ImageVector? = null
