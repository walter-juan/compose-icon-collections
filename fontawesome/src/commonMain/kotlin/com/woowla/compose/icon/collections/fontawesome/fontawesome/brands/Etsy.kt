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

public val BrandsGroup.Etsy: ImageVector
    get() {
        if (_etsy != null) {
            return _etsy!!
        }
        _etsy = Builder(name = "Etsy", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 348.0f)
                curveToRelative(-1.8f, 10.7f, -13.8f, 110.0f, -15.5f, 132.0f)
                curveToRelative(-117.9f, -4.3f, -219.9f, -4.7f, -368.5f, 0.0f)
                lineToRelative(0.0f, -25.5f)
                curveToRelative(45.5f, -8.9f, 60.6f, -8.0f, 61.0f, -35.2f)
                curveToRelative(1.8f, -72.3f, 3.5f, -244.1f, 0.0f, -322.0f)
                curveToRelative(-1.0f, -28.5f, -12.1f, -26.8f, -61.0f, -36.0f)
                lineTo(0.0f, 35.8f)
                curveToRelative(73.9f, 2.4f, 255.9f, 8.6f, 363.0f, -3.8f)
                curveToRelative(-3.5f, 38.2f, -7.8f, 126.5f, -7.8f, 126.5f)
                lineToRelative(-23.2f, 0.0f)
                curveTo(320.9f, 115.7f, 313.2f, 68.0f, 277.3f, 68.0f)
                lineToRelative(-137.0f, 0.0f)
                curveToRelative(-10.2f, 0.0f, -10.7f, 3.5f, -10.7f, 9.8f)
                lineToRelative(0.0f, 163.8f)
                curveToRelative(58.0f, 0.5f, 88.5f, -2.5f, 88.5f, -2.5f)
                curveToRelative(29.8f, -1.0f, 27.6f, -8.5f, 40.7f, -65.3f)
                lineToRelative(25.8f, 0.0f)
                curveToRelative(-4.4f, 101.4f, -3.9f, 61.8f, -1.8f, 160.3f)
                lineTo(257.0f, 334.0f)
                curveToRelative(-9.2f, -40.1f, -9.1f, -61.0f, -39.5f, -61.5f)
                curveToRelative(0.0f, 0.0f, -21.5f, -2.0f, -88.0f, -2.0f)
                lineToRelative(0.0f, 139.0f)
                curveToRelative(0.0f, 26.0f, 14.3f, 38.3f, 44.3f, 38.3f)
                lineToRelative(89.3f, 0.0f)
                curveToRelative(63.6f, 0.0f, 66.6f, -25.0f, 98.7f, -99.8f)
                lineToRelative(22.2f, 0.0f)
                close()
            }
        }
        .build()
        return _etsy!!
    }

private var _etsy: ImageVector? = null
