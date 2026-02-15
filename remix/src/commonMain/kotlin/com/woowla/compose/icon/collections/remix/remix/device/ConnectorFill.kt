package com.woowla.compose.icon.collections.remix.remix.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DeviceGroup

public val DeviceGroup.ConnectorFill: ImageVector
    get() {
        if (_connectorFill != null) {
            return _connectorFill!!
        }
        _connectorFill = Builder(name = "ConnectorFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 17.0f)
                curveTo(21.0f, 19.209f, 19.209f, 21.0f, 17.0f, 21.0f)
                curveTo(14.791f, 21.0f, 13.0f, 19.209f, 13.0f, 17.0f)
                curveTo(13.0f, 14.791f, 14.791f, 13.0f, 17.0f, 13.0f)
                curveTo(19.209f, 13.0f, 21.0f, 14.791f, 21.0f, 17.0f)
                close()
                moveTo(11.0f, 7.0f)
                curveTo(11.0f, 9.209f, 9.209f, 11.0f, 7.0f, 11.0f)
                curveTo(4.791f, 11.0f, 3.0f, 9.209f, 3.0f, 7.0f)
                curveTo(3.0f, 4.791f, 4.791f, 3.0f, 7.0f, 3.0f)
                curveTo(9.209f, 3.0f, 11.0f, 4.791f, 11.0f, 7.0f)
                close()
                moveTo(21.0f, 7.0f)
                curveTo(21.0f, 9.209f, 19.209f, 11.0f, 17.0f, 11.0f)
                curveTo(16.258f, 11.0f, 15.563f, 10.797f, 14.968f, 10.445f)
                lineTo(10.445f, 14.968f)
                curveTo(10.797f, 15.563f, 11.0f, 16.258f, 11.0f, 17.0f)
                curveTo(11.0f, 19.209f, 9.209f, 21.0f, 7.0f, 21.0f)
                curveTo(4.791f, 21.0f, 3.0f, 19.209f, 3.0f, 17.0f)
                curveTo(3.0f, 14.791f, 4.791f, 13.0f, 7.0f, 13.0f)
                curveTo(7.741f, 13.0f, 8.436f, 13.202f, 9.031f, 13.554f)
                lineTo(13.554f, 9.031f)
                curveTo(13.202f, 8.436f, 13.0f, 7.741f, 13.0f, 7.0f)
                curveTo(13.0f, 4.791f, 14.791f, 3.0f, 17.0f, 3.0f)
                curveTo(19.209f, 3.0f, 21.0f, 4.791f, 21.0f, 7.0f)
                close()
            }
        }
        .build()
        return _connectorFill!!
    }

private var _connectorFill: ImageVector? = null
