package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.UsbPlugFill: ImageVector
    get() {
        if (_usbPlugFill != null) {
            return _usbPlugFill!!
        }
        _usbPlugFill = Builder(name = "UsbPlugFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(4.0f)
                lineTo(6.0f, 4.5f)
                close()
                moveTo(7.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                lineTo(8.0f, 1.0f)
                close()
                moveTo(9.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                lineTo(10.0f, 1.0f)
                close()
                moveTo(5.5f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(4.894f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.336f, 1.11f)
                lineToRelative(0.83f, 1.245f)
                curveToRelative(0.544f, 0.816f, 0.834f, 1.774f, 0.834f, 2.754f)
                curveToRelative(0.0f, 0.275f, 0.222f, 0.497f, 0.497f, 0.497f)
                horizontalLineToRelative(2.006f)
                arcToRelative(0.497f, 0.497f, 0.0f, false, false, 0.497f, -0.497f)
                curveToRelative(0.0f, -0.98f, 0.29f, -1.938f, 0.834f, -2.754f)
                lineToRelative(0.83f, -1.245f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.336f, -1.11f)
                lineTo(12.0f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
            }
        }
        .build()
        return _usbPlugFill!!
    }

private var _usbPlugFill: ImageVector? = null
