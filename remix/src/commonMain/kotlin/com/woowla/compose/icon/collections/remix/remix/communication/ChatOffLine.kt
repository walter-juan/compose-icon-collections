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

public val CommunicationGroup.ChatOffLine: ImageVector
    get() {
        if (_chatOffLine != null) {
            return _chatOffLine!!
        }
        _chatOffLine = Builder(name = "ChatOffLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.808f, 1.393f)
                lineTo(22.607f, 21.192f)
                lineTo(21.192f, 22.607f)
                lineTo(17.585f, 18.999f)
                lineTo(6.455f, 19.0f)
                lineTo(2.0f, 22.5f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.831f, 2.042f, 3.671f, 2.116f, 3.531f)
                lineTo(1.394f, 2.808f)
                lineTo(2.808f, 1.393f)
                close()
                moveTo(4.0f, 5.413f)
                lineTo(4.0f, 18.385f)
                lineTo(5.763f, 17.0f)
                lineTo(15.585f, 16.999f)
                lineTo(4.0f, 5.413f)
                close()
                moveTo(21.0f, 3.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(17.785f)
                lineTo(20.0f, 15.785f)
                verticalLineTo(5.0f)
                lineTo(9.213f, 4.999f)
                lineTo(7.214f, 3.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _chatOffLine!!
    }

private var _chatOffLine: ImageVector? = null
