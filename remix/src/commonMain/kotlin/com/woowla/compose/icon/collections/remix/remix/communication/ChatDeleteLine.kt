package com.woowla.compose.icon.collections.remix.remix.communication

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.CommunicationGroup

public val CommunicationGroup.ChatDeleteLine: ImageVector
    get() {
        if (_chatDeleteLine != null) {
            return _chatDeleteLine!!
        }
        _chatDeleteLine = Builder(name = "ChatDeleteLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.455f, 19.0f)
                lineTo(2.0f, 22.5f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 18.552f, 21.552f, 19.0f, 21.0f, 19.0f)
                horizontalLineTo(6.455f)
                close()
                moveTo(4.0f, 18.385f)
                lineTo(5.763f, 17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.385f)
                close()
                moveTo(13.414f, 11.0f)
                lineTo(15.889f, 13.475f)
                lineTo(14.475f, 14.889f)
                lineTo(12.0f, 12.414f)
                lineTo(9.525f, 14.889f)
                lineTo(8.111f, 13.475f)
                lineTo(10.586f, 11.0f)
                lineTo(8.111f, 8.525f)
                lineTo(9.525f, 7.111f)
                lineTo(12.0f, 9.586f)
                lineTo(14.475f, 7.111f)
                lineTo(15.889f, 8.525f)
                lineTo(13.414f, 11.0f)
                close()
            }
        }
        .build()
        return _chatDeleteLine!!
    }

private var _chatDeleteLine: ImageVector? = null
