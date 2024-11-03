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

public val Twbs.CurrencyBitcoin: ImageVector
    get() {
        if (_currencyBitcoin != null) {
            return _currencyBitcoin!!
        }
        _currencyBitcoin = Builder(name = "CurrencyBitcoin", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 13.0f)
                verticalLineToRelative(1.25f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(7.0f, 13.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(1.25f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(9.0f, 13.0f)
                horizontalLineToRelative(0.084f)
                curveToRelative(1.992f, 0.0f, 3.416f, -1.033f, 3.416f, -2.82f)
                curveToRelative(0.0f, -1.502f, -1.007f, -2.323f, -2.186f, -2.44f)
                verticalLineToRelative(-0.088f)
                curveToRelative(0.97f, -0.242f, 1.683f, -0.974f, 1.683f, -2.19f)
                curveTo(11.997f, 3.93f, 10.847f, 3.0f, 9.092f, 3.0f)
                lineTo(9.0f, 3.0f)
                lineTo(9.0f, 1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                lineTo(7.5f, 3.0f)
                horizontalLineToRelative(-0.573f)
                lineTo(6.927f, 1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                lineTo(5.75f, 1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                lineTo(5.5f, 3.0f)
                lineToRelative(-1.998f, 0.011f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(0.989f)
                curveToRelative(0.0f, 0.137f, 0.11f, 0.25f, 0.248f, 0.25f)
                lineToRelative(0.755f, -0.005f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.745f, 0.75f)
                verticalLineToRelative(5.505f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.75f)
                lineToRelative(-0.748f, 0.011f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                close()
                moveTo(6.927f, 4.487f)
                horizontalLineToRelative(1.719f)
                curveToRelative(0.906f, 0.0f, 1.438f, 0.498f, 1.438f, 1.312f)
                curveToRelative(0.0f, 0.871f, -0.575f, 1.362f, -1.877f, 1.362f)
                horizontalLineToRelative(-1.28f)
                close()
                moveTo(6.927f, 8.538f)
                horizontalLineToRelative(1.84f)
                curveToRelative(1.137f, 0.0f, 1.756f, 0.58f, 1.756f, 1.524f)
                curveToRelative(0.0f, 0.953f, -0.626f, 1.45f, -2.158f, 1.45f)
                lineTo(6.927f, 11.512f)
                close()
            }
        }
        .build()
        return _currencyBitcoin!!
    }

private var _currencyBitcoin: ImageVector? = null
