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

public val Twbs.UsbPlug: ImageVector
    get() {
        if (_usbPlug != null) {
            return _usbPlug!!
        }
        _usbPlug = Builder(name = "UsbPlug", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
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
                moveTo(6.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(4.394f)
                curveToRelative(0.0f, 0.494f, 0.146f, 0.976f, 0.42f, 1.387f)
                lineToRelative(1.038f, 1.558f)
                curveToRelative(0.354f, 0.53f, 0.542f, 1.152f, 0.542f, 1.789f)
                curveToRelative(0.0f, 0.481f, 0.39f, 0.872f, 0.872f, 0.872f)
                horizontalLineToRelative(1.256f)
                curveToRelative(0.481f, 0.0f, 0.872f, -0.39f, 0.872f, -0.872f)
                curveToRelative(0.0f, -0.637f, 0.188f, -1.26f, 0.541f, -1.789f)
                lineToRelative(1.04f, -1.558f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 10.394f)
                lineTo(12.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(6.0f, 6.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(4.394f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.252f, 0.832f)
                lineTo(9.71f, 12.784f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 9.002f, 15.0f)
                lineTo(7.998f, 15.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -0.707f, -2.216f)
                lineToRelative(-1.04f, -1.558f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 10.394f)
                close()
            }
        }
        .build()
        return _usbPlug!!
    }

private var _usbPlug: ImageVector? = null
