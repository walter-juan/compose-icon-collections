package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.BluetoothB: ImageVector
    get() {
        if (_bluetoothB != null) {
            return _bluetoothB!!
        }
        _bluetoothB = Builder(name = "BluetoothB", defaultWidth = 256.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 256.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.9f, 260.0f)
                lineTo(257.5f, 156.7f)
                lineTo(111.6f, 0.0f)
                lineTo(111.6f, 206.3f)
                lineTo(25.4f, 120.2f)
                lineTo(-6.0f, 151.6f)
                lineTo(102.1f, 260.0f)
                lineTo(-6.0f, 368.4f)
                lineTo(25.4f, 399.8f)
                lineTo(111.6f, 313.7f)
                lineTo(114.3f, 512.0f)
                lineTo(262.8f, 363.4f)
                lineTo(164.9f, 260.0f)
                close()
                moveTo(205.8f, 157.0f)
                lineToRelative(-50.0f, 50.0f)
                lineToRelative(-0.3f, -100.3f)
                lineToRelative(50.3f, 50.3f)
                close()
                moveTo(155.8f, 313.0f)
                lineToRelative(50.0f, 50.0f)
                lineToRelative(-50.3f, 50.3f)
                lineToRelative(0.3f, -100.3f)
                close()
            }
        }
        .build()
        return _bluetoothB!!
    }

private var _bluetoothB: ImageVector? = null
