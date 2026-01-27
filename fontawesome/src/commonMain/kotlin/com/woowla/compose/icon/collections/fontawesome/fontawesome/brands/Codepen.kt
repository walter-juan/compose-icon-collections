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

public val BrandsGroup.Codepen: ImageVector
    get() {
        if (_codepen != null) {
            return _codepen!!
        }
        _codepen = Builder(name = "Codepen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(502.3f, 159.7f)
                lineToRelative(-234.0f, -156.0f)
                curveToRelative(-8.0f, -4.9f, -16.5f, -5.0f, -24.6f, 0.0f)
                lineToRelative(-234.0f, 156.0f)
                curveToRelative(-6.0f, 4.0f, -9.7f, 11.1f, -9.7f, 18.3f)
                lineTo(0.0f, 334.0f)
                curveToRelative(0.0f, 7.1f, 3.7f, 14.3f, 9.7f, 18.3f)
                lineToRelative(234.0f, 156.0f)
                curveToRelative(8.0f, 4.9f, 16.5f, 5.0f, 24.6f, 0.0f)
                lineToRelative(234.0f, -156.0f)
                curveToRelative(6.0f, -4.0f, 9.7f, -11.1f, 9.7f, -18.3f)
                lineToRelative(0.0f, -156.0f)
                curveToRelative(0.0f, -7.1f, -3.7f, -14.3f, -9.7f, -18.3f)
                close()
                moveTo(278.0f, 63.1f)
                lineToRelative(172.3f, 114.9f)
                lineToRelative(-76.9f, 51.4f)
                lineToRelative(-95.4f, -63.7f)
                lineToRelative(0.0f, -102.6f)
                close()
                moveTo(234.0f, 63.1f)
                lineTo(234.0f, 165.7f)
                lineTo(138.6f, 229.4f)
                lineTo(61.7f, 178.0f)
                lineTo(234.0f, 63.1f)
                close()
                moveTo(44.0f, 219.1f)
                lineTo(99.1f, 256.0f)
                lineTo(44.0f, 292.8f)
                lineTo(44.0f, 219.1f)
                close()
                moveTo(234.0f, 448.8f)
                lineTo(61.7f, 334.0f)
                lineTo(138.6f, 282.6f)
                lineTo(234.0f, 346.3f)
                lineTo(234.0f, 448.8f)
                close()
                moveTo(256.0f, 308.0f)
                lineToRelative(-77.7f, -52.0f)
                lineToRelative(77.7f, -52.0f)
                lineToRelative(77.7f, 52.0f)
                lineToRelative(-77.7f, 52.0f)
                close()
                moveTo(278.0f, 448.9f)
                lineToRelative(0.0f, -102.6f)
                lineToRelative(95.4f, -63.7f)
                lineToRelative(76.9f, 51.4f)
                lineToRelative(-172.3f, 114.9f)
                close()
                moveTo(468.0f, 292.9f)
                lineToRelative(-55.1f, -36.9f)
                lineToRelative(55.1f, -36.9f)
                lineToRelative(0.0f, 73.7f)
                close()
            }
        }
        .build()
        return _codepen!!
    }

private var _codepen: ImageVector? = null
