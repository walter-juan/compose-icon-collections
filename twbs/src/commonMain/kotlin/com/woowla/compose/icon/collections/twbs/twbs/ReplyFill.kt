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

public val Twbs.ReplyFill: ImageVector
    get() {
        if (_replyFill != null) {
            return _replyFill!!
        }
        _replyFill = Builder(name = "ReplyFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.921f, 11.9f)
                lineTo(1.353f, 8.62f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, true, 0.0f, -1.238f)
                lineTo(5.921f, 4.1f)
                arcTo(0.716f, 0.716f, 0.0f, false, true, 7.0f, 4.719f)
                verticalLineTo(6.0f)
                curveToRelative(1.5f, 0.0f, 6.0f, 0.0f, 7.0f, 8.0f)
                curveToRelative(-2.5f, -4.5f, -7.0f, -4.0f, -7.0f, -4.0f)
                verticalLineToRelative(1.281f)
                curveToRelative(0.0f, 0.56f, -0.606f, 0.898f, -1.079f, 0.62f)
                close()
            }
        }
        .build()
        return _replyFill!!
    }

private var _replyFill: ImageVector? = null
