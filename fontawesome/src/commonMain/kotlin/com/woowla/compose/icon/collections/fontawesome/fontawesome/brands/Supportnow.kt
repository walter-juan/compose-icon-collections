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

public val BrandsGroup.Supportnow: ImageVector
    get() {
        if (_supportnow != null) {
            return _supportnow!!
        }
        _supportnow = Builder(name = "Supportnow", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 191.9f)
                lineToRelative(203.9f, -0.1f)
                curveToRelative(1.8f, -0.6f, 2.5f, -9.5f, 3.2f, -12.2f)
                curveToRelative(3.3f, -13.5f, 8.4f, -26.4f, 14.8f, -38.7f)
                lineToRelative(-160.2f, 0.0f)
                lineToRelative(0.0f, -48.2f)
                lineToRelative(234.5f, 0.0f)
                lineToRelative(0.0f, 39.0f)
                curveToRelative(-51.2f, 36.1f, -56.4f, 92.6f, -23.6f, 143.9f)
                curveToRelative(33.1f, 51.7f, 93.4f, 88.1f, 149.5f, 110.5f)
                curveToRelative(67.8f, -25.2f, 164.9f, -89.9f, 169.4f, -169.6f)
                curveToRelative(3.1f, -55.3f, -42.2f, -101.8f, -98.7f, -91.8f)
                curveToRelative(-41.5f, 7.4f, -62.1f, 46.7f, -54.8f, 86.4f)
                lineToRelative(-48.2f, 0.0f)
                curveToRelative(-7.3f, -56.6f, 22.8f, -112.6f, 78.4f, -130.3f)
                curveToRelative(78.7f, -25.1f, 159.5f, 28.0f, 170.4f, 108.8f)
                curveToRelative(15.2f, 112.3f, -95.5f, 199.9f, -188.1f, 237.8f)
                curveToRelative(-4.4f, 1.8f, -24.4f, 10.1f, -27.5f, 10.1f)
                lineToRelative(-280.3f, 0.0f)
                lineToRelative(0.0f, -48.2f)
                lineToRelative(178.5f, 0.0f)
                lineToRelative(-38.1f, -28.9f)
                lineToRelative(-23.2f, -22.1f)
                lineToRelative(-198.3f, 0.0f)
                lineToRelative(0.0f, -48.2f)
                lineToRelative(163.1f, 0.0f)
                curveToRelative(-7.1f, -11.6f, -12.3f, -24.3f, -16.1f, -37.4f)
                curveToRelative(-0.7f, -2.5f, -2.1f, -12.0f, -3.8f, -12.6f)
                lineToRelative(-204.9f, -0.1f)
                lineToRelative(0.0f, -48.2f)
                lineToRelative(0.0f, 0.0f)
                close()
            }
        }
        .build()
        return _supportnow!!
    }

private var _supportnow: ImageVector? = null
