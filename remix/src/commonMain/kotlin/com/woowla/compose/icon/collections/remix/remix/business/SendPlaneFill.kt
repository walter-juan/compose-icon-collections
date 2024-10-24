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

public val BusinessGroup.SendPlaneFill: ImageVector
    get() {
        if (_sendPlaneFill != null) {
            return _sendPlaneFill!!
        }
        _sendPlaneFill = Builder(name = "SendPlaneFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.946f, 9.315f)
                curveTo(1.424f, 9.141f, 1.419f, 8.86f, 1.957f, 8.681f)
                lineTo(21.043f, 2.319f)
                curveTo(21.572f, 2.143f, 21.875f, 2.439f, 21.726f, 2.957f)
                lineTo(16.273f, 22.043f)
                curveTo(16.122f, 22.572f, 15.818f, 22.59f, 15.594f, 22.088f)
                lineTo(12.0f, 14.0f)
                lineTo(18.0f, 6.0f)
                lineTo(10.0f, 12.0f)
                lineTo(1.946f, 9.315f)
                close()
            }
        }
        .build()
        return _sendPlaneFill!!
    }

private var _sendPlaneFill: ImageVector? = null
