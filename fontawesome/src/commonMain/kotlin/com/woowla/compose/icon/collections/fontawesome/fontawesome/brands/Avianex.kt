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

public val BrandsGroup.Avianex: ImageVector
    get() {
        if (_avianex != null) {
            return _avianex!!
        }
        _avianex = Builder(name = "Avianex", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(453.2f, 32.0f)
                lineToRelative(-312.0f, 0.0f)
                curveTo(102.3f, 32.0f, 65.0f, 63.2f, 57.9f, 101.7f)
                lineTo(1.3f, 410.3f)
                curveTo(-5.8f, 448.8f, 20.0f, 480.0f, 59.0f, 480.0f)
                lineToRelative(312.0f, 0.0f)
                curveToRelative(38.9f, 0.0f, 76.2f, -31.2f, 83.3f, -69.7f)
                lineTo(511.0f, 101.8f)
                curveTo(518.0f, 63.2f, 492.2f, 32.0f, 453.2f, 32.0f)
                close()
                moveTo(395.0f, 379.3f)
                lineToRelative(-32.0f, 13.5f)
                lineToRelative(-115.4f, -110.0f)
                curveToRelative(-14.7f, 10.0f, -29.2f, 19.5f, -41.7f, 27.1f)
                lineToRelative(22.1f, 64.2f)
                lineToRelative(-17.9f, 12.7f)
                lineToRelative(-40.6f, -61.0f)
                lineToRelative(-52.4f, -48.1f)
                lineToRelative(15.7f, -15.4f)
                lineToRelative(58.0f, 31.1f)
                curveToRelative(9.3f, -10.5f, 20.8f, -22.6f, 32.8f, -34.9f)
                lineToRelative(-20.5f, -29.6f)
                lineToRelative(-68.8f, -99.8f)
                lineToRelative(18.8f, -28.9f)
                lineToRelative(8.9f, -4.8f)
                lineToRelative(103.1f, 112.4f)
                lineToRelative(4.9f, 4.5f)
                curveToRelative(19.4f, -18.8f, 33.8f, -32.4f, 33.8f, -32.4f)
                curveToRelative(7.7f, -6.5f, 21.5f, -2.9f, 30.7f, 7.9f)
                curveToRelative(9.0f, 10.5f, 10.6f, 24.7f, 2.7f, 31.3f)
                curveToRelative(-1.8f, 1.3f, -15.5f, 11.4f, -35.3f, 25.6f)
                lineToRelative(4.5f, 7.3f)
                lineToRelative(94.9f, 119.4f)
                lineToRelative(-6.3f, 7.9f)
                close()
            }
        }
        .build()
        return _avianex!!
    }

private var _avianex: ImageVector? = null
