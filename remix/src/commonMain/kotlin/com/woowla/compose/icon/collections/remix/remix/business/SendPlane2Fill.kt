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

public val BusinessGroup.SendPlane2Fill: ImageVector
    get() {
        if (_sendPlane2Fill != null) {
            return _sendPlane2Fill!!
        }
        _sendPlane2Fill = Builder(name = "SendPlane2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(1.846f)
                curveTo(3.0f, 1.569f, 3.224f, 1.346f, 3.5f, 1.346f)
                curveTo(3.584f, 1.346f, 3.667f, 1.367f, 3.741f, 1.407f)
                lineTo(22.203f, 11.562f)
                curveTo(22.445f, 11.695f, 22.534f, 11.999f, 22.401f, 12.241f)
                curveTo(22.355f, 12.324f, 22.287f, 12.392f, 22.203f, 12.438f)
                lineTo(3.741f, 22.592f)
                curveTo(3.499f, 22.726f, 3.195f, 22.637f, 3.062f, 22.395f)
                curveTo(3.021f, 22.321f, 3.0f, 22.239f, 3.0f, 22.154f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _sendPlane2Fill!!
    }

private var _sendPlane2Fill: ImageVector? = null
