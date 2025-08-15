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

public val BrandsGroup.Uber: ImageVector
    get() {
        if (_uber != null) {
            return _uber!!
        }
        _uber = Builder(name = "Uber", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(414.1f, 32.0f)
                lineTo(33.9f, 32.0f)
                curveTo(15.2f, 32.0f, 0.0f, 47.2f, 0.0f, 65.9f)
                lineTo(0.0f, 446.0f)
                curveToRelative(0.0f, 18.8f, 15.2f, 34.0f, 33.9f, 34.0f)
                lineTo(414.0f, 480.0f)
                curveToRelative(18.7f, 0.0f, 33.9f, -15.2f, 33.9f, -33.9f)
                lineToRelative(0.0f, -380.2f)
                curveTo(448.0f, 47.2f, 432.8f, 32.0f, 414.1f, 32.0f)
                close()
                moveTo(237.6f, 391.1f)
                curveTo(163.0f, 398.6f, 96.4f, 344.2f, 88.9f, 269.6f)
                lineToRelative(94.4f, 0.0f)
                lineToRelative(0.0f, 20.4f)
                curveToRelative(0.0f, 3.7f, 3.0f, 6.8f, 6.8f, 6.8f)
                lineToRelative(67.9f, 0.0f)
                curveToRelative(3.7f, 0.0f, 6.8f, -3.0f, 6.8f, -6.8f)
                lineToRelative(0.0f, -67.9f)
                curveToRelative(0.0f, -3.7f, -3.0f, -6.8f, -6.8f, -6.8f)
                lineToRelative(-67.9f, 0.0f)
                curveToRelative(-3.7f, 0.0f, -6.8f, 3.0f, -6.8f, 6.8f)
                lineToRelative(0.0f, 20.4f)
                lineToRelative(-94.4f, 0.0f)
                curveToRelative(7.0f, -69.4f, 65.4f, -122.2f, 135.1f, -122.2f)
                reflectiveCurveToRelative(128.1f, 52.8f, 135.1f, 122.2f)
                curveToRelative(7.5f, 74.5f, -46.9f, 141.1f, -121.5f, 148.6f)
                close()
            }
        }
        .build()
        return _uber!!
    }

private var _uber: ImageVector? = null
