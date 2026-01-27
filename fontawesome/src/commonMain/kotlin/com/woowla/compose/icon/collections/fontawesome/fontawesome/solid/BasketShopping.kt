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

public val SolidGroup.BasketShopping: ImageVector
    get() {
        if (_basketShopping != null) {
            return _basketShopping!!
        }
        _basketShopping = Builder(name = "BasketShopping", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 0.0f)
                curveToRelative(6.6f, 0.0f, 12.9f, 2.7f, 17.4f, 7.5f)
                lineToRelative(144.0f, 152.0f)
                lineToRelative(0.5f, 0.5f)
                lineToRelative(78.1f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                curveToRelative(0.0f, 14.5f, -9.6f, 26.7f, -22.8f, 30.7f)
                lineTo(491.1f, 429.9f)
                curveToRelative(-6.5f, 29.3f, -32.5f, 50.1f, -62.5f, 50.1f)
                lineToRelative(-281.3f, 0.0f)
                curveToRelative(-30.0f, 0.0f, -56.0f, -20.8f, -62.5f, -50.1f)
                lineToRelative(-46.0f, -207.2f)
                curveToRelative(-13.2f, -3.9f, -22.8f, -16.2f, -22.8f, -30.7f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(78.1f, 0.0f)
                lineToRelative(0.5f, -0.5f)
                lineToRelative(144.0f, -152.0f)
                curveTo(275.1f, 2.7f, 281.4f, 0.0f, 288.0f, 0.0f)
                close()
                moveTo(288.0f, 58.9f)
                lineTo(192.2f, 160.0f)
                lineTo(383.8f, 160.0f)
                lineTo(288.0f, 58.9f)
                close()
                moveTo(208.0f, 264.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 112.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -112.0f)
                close()
                moveTo(288.0f, 240.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 112.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -112.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                close()
                moveTo(416.0f, 264.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 112.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -112.0f)
                close()
            }
        }
        .build()
        return _basketShopping!!
    }

private var _basketShopping: ImageVector? = null
