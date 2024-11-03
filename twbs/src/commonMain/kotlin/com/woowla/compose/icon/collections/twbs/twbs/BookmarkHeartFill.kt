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

public val Twbs.BookmarkHeartFill: ImageVector
    get() {
        if (_bookmarkHeartFill != null) {
            return _bookmarkHeartFill!!
        }
        _bookmarkHeartFill = Builder(name = "BookmarkHeartFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 15.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.74f, 0.439f)
                lineTo(8.0f, 13.069f)
                lineToRelative(5.26f, 2.87f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 14.0f, 15.5f)
                verticalLineTo(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                close()
                moveTo(8.0f, 4.41f)
                curveToRelative(1.387f, -1.425f, 4.854f, 1.07f, 0.0f, 4.277f)
                curveTo(3.146f, 5.48f, 6.613f, 2.986f, 8.0f, 4.412f)
                close()
            }
        }
        .build()
        return _bookmarkHeartFill!!
    }

private var _bookmarkHeartFill: ImageVector? = null
