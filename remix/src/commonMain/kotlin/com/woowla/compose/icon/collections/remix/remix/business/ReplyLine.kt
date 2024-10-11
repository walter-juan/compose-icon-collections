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

public val BusinessGroup.ReplyLine: ImageVector
    get() {
        if (_replyLine != null) {
            return _replyLine!!
        }
        _replyLine = Builder(name = "ReplyLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 20.0f)
                lineTo(1.0f, 12.0f)
                lineTo(11.0f, 4.0f)
                verticalLineTo(9.0f)
                curveTo(16.523f, 9.0f, 21.0f, 13.477f, 21.0f, 19.0f)
                curveTo(21.0f, 19.273f, 20.989f, 19.543f, 20.968f, 19.81f)
                curveTo(19.506f, 17.036f, 16.638f, 15.119f, 13.313f, 15.005f)
                lineTo(13.0f, 15.0f)
                horizontalLineTo(11.0f)
                lineTo(11.0f, 20.0f)
                close()
                moveTo(9.0f, 13.0f)
                horizontalLineTo(11.0f)
                lineTo(13.034f, 13.0f)
                lineTo(13.381f, 13.007f)
                curveTo(14.666f, 13.05f, 15.905f, 13.316f, 17.057f, 13.773f)
                curveTo(15.59f, 12.075f, 13.42f, 11.0f, 11.0f, 11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.161f)
                lineTo(4.202f, 12.0f)
                lineTo(9.0f, 15.839f)
                lineTo(9.0f, 13.0f)
                close()
            }
        }
        .build()
        return _replyLine!!
    }

private var _replyLine: ImageVector? = null
