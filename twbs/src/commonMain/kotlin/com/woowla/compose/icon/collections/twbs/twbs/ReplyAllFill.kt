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

public val Twbs.ReplyAllFill: ImageVector
    get() {
        if (_replyAllFill != null) {
            return _replyAllFill!!
        }
        _replyAllFill = Builder(name = "ReplyAllFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.021f, 11.9f)
                lineTo(3.453f, 8.62f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, true, 0.0f, -1.238f)
                lineTo(8.021f, 4.1f)
                arcToRelative(0.716f, 0.716f, 0.0f, false, true, 1.079f, 0.619f)
                verticalLineTo(6.0f)
                curveToRelative(1.5f, 0.0f, 6.0f, 0.0f, 7.0f, 8.0f)
                curveToRelative(-2.5f, -4.5f, -7.0f, -4.0f, -7.0f, -4.0f)
                verticalLineToRelative(1.281f)
                curveToRelative(0.0f, 0.56f, -0.606f, 0.898f, -1.079f, 0.62f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.232f, 4.293f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.106f, 0.7f)
                lineTo(1.114f, 7.945f)
                lineToRelative(-0.042f, 0.028f)
                arcToRelative(0.147f, 0.147f, 0.0f, false, false, 0.0f, 0.252f)
                lineToRelative(0.042f, 0.028f)
                lineToRelative(4.012f, 2.954f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.593f, 0.805f)
                lineTo(0.539f, 9.073f)
                arcToRelative(1.147f, 1.147f, 0.0f, false, true, 0.0f, -1.946f)
                lineToRelative(3.994f, -2.94f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.699f, 0.106f)
            }
        }
        .build()
        return _replyAllFill!!
    }

private var _replyAllFill: ImageVector? = null
