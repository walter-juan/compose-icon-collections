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

public val BusinessGroup.ReplyAllLine: ImageVector
    get() {
        if (_replyAllLine != null) {
            return _replyAllLine!!
        }
        _replyAllLine = Builder(name = "ReplyAllLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.5f)
                verticalLineTo(9.0f)
                curveTo(19.523f, 9.0f, 24.0f, 13.477f, 24.0f, 19.0f)
                curveTo(24.0f, 19.273f, 23.989f, 19.543f, 23.968f, 19.81f)
                curveTo(22.506f, 17.036f, 19.638f, 15.119f, 16.313f, 15.005f)
                lineTo(16.0f, 15.0f)
                horizontalLineTo(14.0f)
                lineTo(14.0f, 19.5f)
                lineTo(6.0f, 12.0f)
                lineTo(14.0f, 4.5f)
                close()
                moveTo(8.0f, 4.5f)
                verticalLineTo(7.237f)
                lineTo(2.92f, 12.0f)
                lineTo(7.999f, 16.761f)
                lineTo(8.0f, 19.5f)
                lineTo(0.0f, 12.0f)
                lineTo(8.0f, 4.5f)
                close()
                moveTo(12.0f, 9.116f)
                lineTo(8.924f, 12.0f)
                lineTo(12.0f, 14.883f)
                lineTo(12.0f, 13.0f)
                lineTo(16.034f, 13.0f)
                lineTo(16.381f, 13.007f)
                curveTo(17.666f, 13.05f, 18.905f, 13.316f, 20.057f, 13.773f)
                curveTo(18.59f, 12.075f, 16.42f, 11.0f, 14.0f, 11.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(9.116f)
                close()
            }
        }
        .build()
        return _replyAllLine!!
    }

private var _replyAllLine: ImageVector? = null
