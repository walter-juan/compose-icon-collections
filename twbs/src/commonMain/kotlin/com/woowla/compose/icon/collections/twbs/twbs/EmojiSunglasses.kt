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

public val Twbs.EmojiSunglasses: ImageVector
    get() {
        if (_emojiSunglasses != null) {
            return _emojiSunglasses!!
        }
        _emojiSunglasses = Builder(name = "EmojiSunglasses", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.968f, 9.75f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.866f, 0.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 8.0f, 12.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 3.898f, -2.25f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.866f, -0.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 8.0f, 11.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.032f, -1.75f)
                moveTo(7.0f, 5.116f)
                verticalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(3.28f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.97f, 1.243f)
                lineToRelative(0.311f, 1.242f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.561f, 8.0f)
                horizontalLineTo(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.994f, -1.839f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 8.0f, 6.0f)
                curveToRelative(0.393f, 0.0f, 0.74f, 0.064f, 1.006f, 0.161f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 8.0f)
                horizontalLineToRelative(0.438f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.94f, -1.515f)
                lineToRelative(0.311f, -1.242f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.72f, 4.0f)
                horizontalLineTo(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(0.116f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 8.0f, 5.0f)
                curveToRelative(-0.35f, 0.0f, -0.69f, 0.04f, -1.0f, 0.116f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveToRelative(-1.0f, 0.0f)
                arcTo(7.0f, 7.0f, 0.0f, true, false, 1.0f, 8.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 14.0f, 0.0f)
            }
        }
        .build()
        return _emojiSunglasses!!
    }

private var _emojiSunglasses: ImageVector? = null
