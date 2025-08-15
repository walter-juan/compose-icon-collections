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

public val BrandsGroup.NfcSymbol: ImageVector
    get() {
        if (_nfcSymbol != null) {
            return _nfcSymbol!!
        }
        _nfcSymbol = Builder(name = "NfcSymbol", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(360.9f, 32.4f)
                curveToRelative(7.7f, -1.3f, 15.7f, 0.5f, 21.2f, 5.0f)
                curveToRelative(84.1f, 58.7f, 129.9f, 136.3f, 129.9f, 217.7f)
                curveToRelative(0.0f, 83.1f, -45.8f, 160.8f, -129.9f, 219.5f)
                curveToRelative(-4.8f, 4.0f, -11.7f, 5.9f, -18.6f, 5.3f)
                curveToRelative(-7.0f, -0.6f, -13.5f, -3.6f, -18.4f, -8.5f)
                lineTo(161.7f, 288.7f)
                curveToRelative(-5.6f, -5.5f, -8.7f, -13.0f, -9.6f, -20.9f)
                curveToRelative(0.0f, -7.8f, 4.0f, -15.3f, 9.5f, -20.9f)
                curveToRelative(5.6f, -5.5f, 13.1f, -8.7f, 20.9f, -8.7f)
                curveToRelative(7.9f, 0.0f, 15.4f, 3.1f, 20.9f, 8.6f)
                lineTo(368.5f, 411.2f)
                curveToRelative(54.6f, -44.7f, 84.3f, -99.2f, 84.3f, -156.1f)
                curveToRelative(0.0f, -61.6f, -36.9f, -122.2f, -103.9f, -169.3f)
                curveToRelative(-6.4f, -4.5f, -10.8f, -11.4f, -12.1f, -19.1f)
                curveToRelative(-1.4f, -7.7f, 0.4f, -15.7f, 5.0f, -22.1f)
                curveToRelative(4.5f, -6.4f, 11.4f, -10.8f, 19.1f, -12.1f)
                close()
                moveTo(154.9f, 479.6f)
                curveToRelative(-7.7f, 1.3f, -15.6f, -0.5f, -22.1f, -5.0f)
                curveToRelative(-83.1f, -58.7f, -129.0f, -136.4f, -129.0f, -219.5f)
                curveToRelative(0.0f, -81.4f, 45.8f, -159.0f, 129.0f, -217.7f)
                curveToRelative(5.7f, -4.0f, 12.6f, -5.9f, 19.6f, -5.3f)
                curveToRelative(6.9f, 0.6f, 13.4f, 3.6f, 18.3f, 8.5f)
                lineTo(354.1f, 223.3f)
                curveToRelative(5.6f, 5.5f, 8.7f, 13.0f, 8.7f, 20.9f)
                curveToRelative(0.1f, 6.9f, -3.0f, 15.3f, -8.6f, 20.9f)
                curveToRelative(-5.5f, 5.5f, -13.0f, 8.7f, -20.9f, 8.7f)
                curveToRelative(-7.8f, 0.0f, -16.2f, -3.1f, -20.9f, -8.6f)
                lineTo(147.3f, 100.7f)
                curveToRelative(-54.6f, 45.2f, -84.3f, 99.2f, -84.3f, 154.4f)
                curveToRelative(0.0f, 63.4f, 36.9f, 124.0f, 103.1f, 171.1f)
                curveToRelative(7.3f, 4.6f, 11.6f, 11.4f, 13.0f, 19.2f)
                curveToRelative(1.3f, 7.7f, -0.5f, 15.7f, -5.0f, 22.1f)
                reflectiveCurveToRelative(-11.4f, 10.7f, -19.2f, 12.1f)
                close()
            }
        }
        .build()
        return _nfcSymbol!!
    }

private var _nfcSymbol: ImageVector? = null
