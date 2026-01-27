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

public val BrandsGroup.Figma: ImageVector
    get() {
        if (_figma != null) {
            return _figma!!
        }
        _figma = Builder(name = "Figma", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 95.8f)
                curveTo(14.0f, 42.9f, 56.9f, 0.0f, 109.8f, 0.0f)
                lineTo(274.2f, 0.0f)
                curveToRelative(52.9f, 0.0f, 95.8f, 42.9f, 95.8f, 95.8f)
                curveToRelative(0.0f, 33.5f, -17.2f, 63.0f, -43.2f, 80.1f)
                curveToRelative(26.0f, 17.1f, 43.2f, 46.6f, 43.2f, 80.1f)
                curveToRelative(0.0f, 52.9f, -42.9f, 95.8f, -95.8f, 95.8f)
                lineToRelative(-2.1f, 0.0f)
                curveToRelative(-24.8f, 0.0f, -47.4f, -9.4f, -64.4f, -24.9f)
                lineToRelative(0.0f, 88.3f)
                curveToRelative(0.0f, 53.6f, -44.0f, 96.8f, -97.4f, 96.8f)
                curveToRelative(-52.8f, 0.0f, -96.3f, -42.8f, -96.3f, -95.8f)
                curveToRelative(0.0f, -33.5f, 17.2f, -63.0f, 43.2f, -80.1f)
                curveToRelative(-26.0f, -17.1f, -43.2f, -46.6f, -43.2f, -80.1f)
                reflectiveCurveToRelative(17.2f, -63.0f, 43.2f, -80.1f)
                curveTo(31.2f, 158.8f, 14.0f, 129.3f, 14.0f, 95.8f)
                close()
                moveTo(176.3f, 191.6f)
                lineToRelative(-66.5f, 0.0f)
                curveToRelative(-35.6f, 0.0f, -64.4f, 28.8f, -64.4f, 64.4f)
                curveToRelative(0.0f, 35.4f, 28.6f, 64.2f, 64.0f, 64.4f)
                lineToRelative(66.9f, 0.0f)
                lineToRelative(0.0f, -128.8f)
                close()
                moveTo(207.7f, 256.0f)
                curveToRelative(0.0f, 35.6f, 28.8f, 64.4f, 64.4f, 64.4f)
                lineToRelative(2.1f, 0.0f)
                curveToRelative(35.6f, 0.0f, 64.4f, -28.8f, 64.4f, -64.4f)
                reflectiveCurveToRelative(-28.8f, -64.4f, -64.4f, -64.4f)
                lineToRelative(-2.1f, 0.0f)
                curveToRelative(-35.6f, 0.0f, -64.4f, 28.8f, -64.4f, 64.4f)
                close()
                moveTo(109.8f, 351.8f)
                lineToRelative(-0.4f, 0.0f)
                curveToRelative(-35.4f, 0.2f, -64.0f, 29.0f, -64.0f, 64.4f)
                reflectiveCurveToRelative(29.2f, 64.4f, 64.9f, 64.4f)
                curveToRelative(36.3f, 0.0f, 66.0f, -29.4f, 66.0f, -65.5f)
                lineToRelative(0.0f, -63.4f)
                lineToRelative(-66.5f, 0.0f)
                close()
                moveTo(109.8f, 31.4f)
                curveToRelative(-35.6f, 0.0f, -64.4f, 28.8f, -64.4f, 64.4f)
                reflectiveCurveToRelative(28.8f, 64.4f, 64.4f, 64.4f)
                lineToRelative(66.5f, 0.0f)
                lineToRelative(0.0f, -128.8f)
                lineToRelative(-66.5f, 0.0f)
                close()
                moveTo(207.7f, 160.2f)
                lineToRelative(66.5f, 0.0f)
                curveToRelative(35.6f, 0.0f, 64.4f, -28.8f, 64.4f, -64.4f)
                reflectiveCurveToRelative(-28.8f, -64.4f, -64.4f, -64.4f)
                lineToRelative(-66.5f, 0.0f)
                lineToRelative(0.0f, 128.8f)
                close()
            }
        }
        .build()
        return _figma!!
    }

private var _figma: ImageVector? = null
