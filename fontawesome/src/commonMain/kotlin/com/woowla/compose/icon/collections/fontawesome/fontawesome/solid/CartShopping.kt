package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.CartShopping: ImageVector
    get() {
        if (_cartShopping != null) {
            return _cartShopping!!
        }
        _cartShopping = Builder(name = "CartShopping", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, -16.0f)
                curveTo(10.7f, -16.0f, 0.0f, -5.3f, 0.0f, 8.0f)
                reflectiveCurveTo(10.7f, 32.0f, 24.0f, 32.0f)
                lineToRelative(45.3f, 0.0f)
                curveToRelative(3.9f, 0.0f, 7.2f, 2.8f, 7.9f, 6.6f)
                lineToRelative(52.1f, 286.3f)
                curveToRelative(6.2f, 34.2f, 36.0f, 59.1f, 70.8f, 59.1f)
                lineTo(456.0f, 384.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-255.9f, 0.0f)
                curveToRelative(-11.6f, 0.0f, -21.5f, -8.3f, -23.6f, -19.7f)
                lineToRelative(-5.1f, -28.3f)
                lineToRelative(303.6f, 0.0f)
                curveToRelative(30.8f, 0.0f, 57.2f, -21.9f, 62.9f, -52.2f)
                lineTo(568.9f, 69.9f)
                curveTo(572.6f, 50.2f, 557.5f, 32.0f, 537.4f, 32.0f)
                lineToRelative(-412.7f, 0.0f)
                lineToRelative(-0.4f, -2.0f)
                curveToRelative(-4.8f, -26.6f, -28.0f, -46.0f, -55.1f, -46.0f)
                lineTo(24.0f, -16.0f)
                close()
                moveTo(208.0f, 512.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, -96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, 96.0f)
                close()
                moveTo(432.0f, 512.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, -96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, 96.0f)
                close()
            }
        }
        .build()
        return _cartShopping!!
    }

private var _cartShopping: ImageVector? = null
