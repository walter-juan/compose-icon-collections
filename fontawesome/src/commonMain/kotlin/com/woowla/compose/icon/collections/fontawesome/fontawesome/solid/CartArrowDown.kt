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

public val SolidGroup.CartArrowDown: ImageVector
    get() {
        if (_cartArrowDown != null) {
            return _cartArrowDown!!
        }
        _cartArrowDown = Builder(name = "CartArrowDown", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.0f)
                curveTo(0.0f, -5.3f, 10.7f, -16.0f, 24.0f, -16.0f)
                lineToRelative(45.3f, 0.0f)
                curveToRelative(27.1f, 0.0f, 50.3f, 19.4f, 55.1f, 46.0f)
                lineToRelative(0.4f, 2.0f)
                lineToRelative(187.2f, 0.0f)
                lineToRelative(0.0f, 102.1f)
                lineToRelative(-31.0f, -31.0f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(72.0f, 72.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(72.0f, -72.0f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(-24.6f, -9.4f, -33.9f, 0.0f)
                lineToRelative(-31.0f, 31.0f)
                lineToRelative(0.0f, -102.1f)
                lineToRelative(177.4f, 0.0f)
                curveToRelative(20.0f, 0.0f, 35.1f, 18.2f, 31.4f, 37.9f)
                lineTo(537.8f, 235.8f)
                curveToRelative(-5.7f, 30.3f, -32.1f, 52.2f, -62.9f, 52.2f)
                lineToRelative(-303.6f, 0.0f)
                lineToRelative(5.1f, 28.3f)
                curveToRelative(2.1f, 11.4f, 12.0f, 19.7f, 23.6f, 19.7f)
                lineTo(456.0f, 336.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-255.9f, 0.0f)
                curveToRelative(-34.8f, 0.0f, -64.6f, -24.9f, -70.8f, -59.1f)
                lineTo(77.2f, 38.6f)
                curveToRelative(-0.7f, -3.8f, -4.0f, -6.6f, -7.9f, -6.6f)
                lineTo(24.0f, 32.0f)
                curveTo(10.7f, 32.0f, 0.0f, 21.3f, 0.0f, 8.0f)
                close()
                moveTo(160.0f, 464.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                close()
                moveTo(384.0f, 464.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                close()
            }
        }
        .build()
        return _cartArrowDown!!
    }

private var _cartArrowDown: ImageVector? = null
