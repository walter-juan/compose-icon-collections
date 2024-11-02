package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Freecad: ImageVector
    get() {
        if (_freecad != null) {
            return _freecad!!
        }
        _freecad = Builder(name = "Freecad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(5.6f)
                verticalLineToRelative(-9.6f)
                horizontalLineToRelative(4.8f)
                lineTo(10.4f, 8.8f)
                lineTo(5.6f, 8.8f)
                lineTo(5.6f, 5.6f)
                horizontalLineToRelative(8.0f)
                lineTo(13.6f, 0.0f)
                close()
                moveTo(15.552f, 6.4f)
                lineTo(13.914f, 6.486f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.363f, 0.295f)
                lineToRelative(-0.702f, 2.576f)
                lineToRelative(-0.714f, 0.342f)
                lineTo(10.9f, 9.16f)
                verticalLineToRelative(5.74f)
                lineTo(6.404f, 14.9f)
                lineToRelative(0.092f, 1.59f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.293f, 0.363f)
                lineToRelative(2.576f, 0.7f)
                lineToRelative(0.344f, 0.714f)
                lineToRelative(-1.076f, 2.437f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.097f, 0.46f)
                lineToRelative(1.225f, 1.1f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.467f, 0.052f)
                lineToRelative(2.312f, -1.329f)
                lineToRelative(0.752f, 0.268f)
                lineToRelative(0.967f, 2.488f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.394f, 0.256f)
                lineToRelative(1.65f, -0.092f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.366f, -0.297f)
                lineToRelative(0.691f, -2.578f)
                lineToRelative(0.713f, -0.341f)
                lineToRelative(2.446f, 1.08f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.46f, -0.1f)
                lineToRelative(1.102f, -1.225f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.049f, -0.466f)
                lineToRelative(-1.328f, -2.315f)
                lineToRelative(0.261f, -0.751f)
                lineToRelative(2.487f, -0.967f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.256f, -0.393f)
                lineToRelative(-0.084f, -1.648f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.295f, -0.365f)
                lineToRelative(-2.578f, -0.692f)
                lineToRelative(-0.344f, -0.714f)
                lineToRelative(1.072f, -2.45f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.1f, -0.459f)
                lineToRelative(-1.224f, -1.101f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.467f, -0.049f)
                lineToRelative(-2.314f, 1.326f)
                lineToRelative(-0.744f, -0.258f)
                lineToRelative(-0.975f, -2.49f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.395f, -0.253f)
                close()
                moveTo(17.801f, 15.201f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, -2.6f, 2.6f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, -2.6f, -2.6f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, 2.6f, -2.6f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, 2.6f, 2.6f)
            }
        }
        .build()
        return _freecad!!
    }

private var _freecad: ImageVector? = null
