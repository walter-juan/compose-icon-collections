package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.ReplyFill: ImageVector
    get() {
        if (_replyFill != null) {
            return _replyFill!!
        }
        _replyFill = Builder(name = "ReplyFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 20.0f)
                lineTo(1.0f, 12.0f)
                lineTo(11.0f, 4.0f)
                verticalLineTo(9.0f)
                curveTo(16.523f, 9.0f, 21.0f, 13.477f, 21.0f, 19.0f)
                curveTo(21.0f, 19.273f, 20.989f, 19.543f, 20.968f, 19.811f)
                curveTo(19.461f, 16.95f, 16.458f, 15.0f, 13.0f, 15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _replyFill!!
    }

private var _replyFill: ImageVector? = null
