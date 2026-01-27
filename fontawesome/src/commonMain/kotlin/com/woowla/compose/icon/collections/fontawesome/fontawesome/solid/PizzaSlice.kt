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

public val SolidGroup.PizzaSlice: ImageVector
    get() {
        if (_pizzaSlice != null) {
            return _pizzaSlice!!
        }
        _pizzaSlice = Builder(name = "PizzaSlice", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(169.7f, 0.9f)
                curveToRelative(-22.8f, -1.6f, -41.9f, 14.0f, -47.5f, 34.7f)
                lineTo(112.5f, 72.0f)
                curveTo(293.3f, 72.3f, 439.7f, 218.7f, 440.0f, 399.5f)
                lineToRelative(36.4f, -9.7f)
                curveToRelative(20.8f, -5.5f, 36.3f, -24.7f, 34.7f, -47.5f)
                curveToRelative(-12.6f, -182.8f, -158.6f, -328.8f, -341.4f, -341.4f)
                close()
                moveTo(391.7f, 412.4f)
                curveToRelative(0.2f, -4.1f, 0.3f, -8.2f, 0.3f, -12.4f)
                curveToRelative(0.0f, -154.6f, -125.4f, -280.0f, -280.0f, -280.0f)
                curveToRelative(-4.1f, 0.0f, -8.3f, 0.1f, -12.4f, 0.3f)
                lineTo(0.5f, 491.9f)
                curveToRelative(-1.5f, 5.5f, 0.1f, 11.4f, 4.1f, 15.4f)
                reflectiveCurveToRelative(9.9f, 5.6f, 15.4f, 4.1f)
                lineToRelative(371.6f, -99.1f)
                close()
                moveTo(176.0f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(240.0f, 336.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(96.0f, 384.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _pizzaSlice!!
    }

private var _pizzaSlice: ImageVector? = null
