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

public val BusinessGroup.SendPlaneLine: ImageVector
    get() {
        if (_sendPlaneLine != null) {
            return _sendPlaneLine!!
        }
        _sendPlaneLine = Builder(name = "SendPlaneLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.727f, 2.957f)
                lineTo(16.273f, 22.043f)
                curveTo(16.122f, 22.572f, 15.798f, 22.596f, 15.556f, 22.113f)
                lineTo(11.0f, 13.0f)
                lineTo(1.923f, 9.369f)
                curveTo(1.413f, 9.165f, 1.42f, 8.86f, 1.957f, 8.681f)
                lineTo(21.043f, 2.319f)
                curveTo(21.572f, 2.143f, 21.875f, 2.439f, 21.727f, 2.957f)
                close()
                moveTo(19.035f, 5.096f)
                lineTo(6.812f, 9.171f)
                lineTo(12.449f, 11.425f)
                lineTo(15.49f, 17.507f)
                lineTo(19.035f, 5.096f)
                close()
            }
        }
        .build()
        return _sendPlaneLine!!
    }

private var _sendPlaneLine: ImageVector? = null
