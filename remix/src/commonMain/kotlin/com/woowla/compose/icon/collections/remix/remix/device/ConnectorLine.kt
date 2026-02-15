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

public val DeviceGroup.ConnectorLine: ImageVector
    get() {
        if (_connectorLine != null) {
            return _connectorLine!!
        }
        _connectorLine = Builder(name = "ConnectorLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 17.0f)
                curveTo(9.0f, 16.447f, 8.777f, 15.949f, 8.414f, 15.586f)
                curveTo(8.051f, 15.223f, 7.553f, 15.0f, 7.0f, 15.0f)
                curveTo(5.895f, 15.0f, 5.0f, 15.895f, 5.0f, 17.0f)
                curveTo(5.0f, 18.105f, 5.895f, 19.0f, 7.0f, 19.0f)
                curveTo(8.105f, 19.0f, 9.0f, 18.105f, 9.0f, 17.0f)
                close()
                moveTo(19.0f, 17.0f)
                curveTo(19.0f, 15.895f, 18.105f, 15.0f, 17.0f, 15.0f)
                curveTo(15.895f, 15.0f, 15.0f, 15.895f, 15.0f, 17.0f)
                curveTo(15.0f, 18.105f, 15.895f, 19.0f, 17.0f, 19.0f)
                curveTo(18.105f, 19.0f, 19.0f, 18.105f, 19.0f, 17.0f)
                close()
                moveTo(9.0f, 7.0f)
                curveTo(9.0f, 5.895f, 8.105f, 5.0f, 7.0f, 5.0f)
                curveTo(5.895f, 5.0f, 5.0f, 5.895f, 5.0f, 7.0f)
                curveTo(5.0f, 8.105f, 5.895f, 9.0f, 7.0f, 9.0f)
                curveTo(8.105f, 9.0f, 9.0f, 8.105f, 9.0f, 7.0f)
                close()
                moveTo(19.0f, 7.0f)
                curveTo(19.0f, 5.895f, 18.105f, 5.0f, 17.0f, 5.0f)
                curveTo(15.895f, 5.0f, 15.0f, 5.895f, 15.0f, 7.0f)
                curveTo(15.0f, 7.553f, 15.223f, 8.051f, 15.586f, 8.414f)
                curveTo(15.949f, 8.777f, 16.447f, 9.0f, 17.0f, 9.0f)
                curveTo(18.105f, 9.0f, 19.0f, 8.105f, 19.0f, 7.0f)
                close()
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
        return _connectorLine!!
    }

private var _connectorLine: ImageVector? = null
