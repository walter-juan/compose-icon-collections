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

public val Twbs.UsbSymbol: ImageVector
    get() {
        if (_usbSymbol != null) {
            return _usbSymbol!!
        }
        _usbSymbol = Builder(name = "UsbSymbol", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.792f, 0.312f)
                lineToRelative(-1.533f, 2.3f)
                arcTo(0.25f, 0.25f, 0.0f, false, false, 6.467f, 3.0f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(7.319f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.515f, -0.298f)
                lineTo(5.909f, 9.56f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 8.18f)
                verticalLineToRelative(-0.266f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.0f, 0.0f)
                verticalLineToRelative(0.266f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 1.515f, 2.298f)
                lineToRelative(1.076f, 0.461f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.888f, 1.129f)
                arcToRelative(2.001f, 2.001f, 0.0f, true, false, 1.021f, -0.006f)
                verticalLineToRelative(-0.902f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.756f, -1.303f)
                lineToRelative(1.484f, -0.848f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 11.995f, 7.0f)
                horizontalLineToRelative(0.755f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(0.741f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.747f, 1.142f)
                lineTo(8.76f, 8.99f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.26f, 0.17f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(1.033f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.208f, -0.389f)
                lineTo(8.208f, 0.312f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.416f, 0.0f)
            }
        }
        .build()
        return _usbSymbol!!
    }

private var _usbSymbol: ImageVector? = null
