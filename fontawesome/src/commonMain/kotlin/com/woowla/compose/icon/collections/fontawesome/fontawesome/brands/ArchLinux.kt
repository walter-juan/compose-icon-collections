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

public val BrandsGroup.ArchLinux: ImageVector
    get() {
        if (_archLinux != null) {
            return _archLinux!!
        }
        _archLinux = Builder(name = "ArchLinux", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.7f, -7.8f)
                curveToRelative(-24.1f, 59.0f, -38.6f, 97.7f, -65.4f, 155.0f)
                curveToRelative(16.4f, 17.4f, 36.6f, 37.6f, 69.4f, 60.5f)
                curveToRelative(-35.2f, -14.5f, -59.2f, -28.9f, -77.2f, -44.0f)
                curveToRelative(-34.3f, 71.6f, -88.1f, 173.5f, -197.2f, 369.4f)
                curveToRelative(85.7f, -49.5f, 152.2f, -80.0f, 214.1f, -91.6f)
                curveToRelative(-2.7f, -11.4f, -4.1f, -23.8f, -4.0f, -36.7f)
                lineToRelative(0.1f, -2.7f)
                curveToRelative(1.4f, -54.9f, 29.9f, -97.2f, 63.8f, -94.4f)
                reflectiveCurveToRelative(60.2f, 49.8f, 58.8f, 104.7f)
                curveToRelative(-0.3f, 10.3f, -1.4f, 20.2f, -3.4f, 29.4f)
                curveToRelative(61.2f, 12.0f, 127.0f, 42.4f, 211.6f, 91.2f)
                curveToRelative(-16.7f, -30.7f, -31.6f, -58.3f, -45.8f, -84.7f)
                curveToRelative(-22.4f, -17.4f, -45.7f, -39.9f, -93.3f, -64.4f)
                curveToRelative(32.7f, 8.5f, 56.3f, 18.3f, 74.5f, 29.3f)
                curveToRelative(-144.5f, -269.1f, -156.2f, -304.8f, -205.8f, -421.1f)
                close()
            }
        }
        .build()
        return _archLinux!!
    }

private var _archLinux: ImageVector? = null
