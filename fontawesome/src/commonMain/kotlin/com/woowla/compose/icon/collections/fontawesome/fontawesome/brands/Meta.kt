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

public val BrandsGroup.Meta: ImageVector
    get() {
        if (_meta != null) {
            return _meta!!
        }
        _meta = Builder(name = "Meta", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(640.0f, 317.9f)
                curveToRelative(0.0f, 91.3f, -39.4f, 148.5f, -110.3f, 148.5f)
                curveToRelative(-62.6f, 0.0f, -95.8f, -34.6f, -156.9f, -136.6f)
                lineToRelative(-31.4f, -52.6f)
                curveToRelative(-8.3f, -12.5f, -14.5f, -24.2f, -21.2f, -35.0f)
                curveToRelative(-20.1f, 33.8f, -47.1f, 83.0f, -47.1f, 83.0f)
                curveToRelative(-67.0f, 116.6f, -104.6f, 141.2f, -156.9f, 141.2f)
                curveToRelative(-72.8f, 0.0f, -116.2f, -57.3f, -116.2f, -145.9f)
                curveToRelative(0.0f, -143.0f, 79.8f, -278.1f, 183.9f, -278.1f)
                curveToRelative(50.2f, 0.0f, 93.8f, 24.7f, 144.8f, 89.5f)
                curveToRelative(37.1f, -50.1f, 78.1f, -89.5f, 130.6f, -89.5f)
                curveToRelative(99.1f, 0.0f, 180.7f, 125.7f, 180.7f, 275.5f)
                close()
                moveTo(287.4f, 192.2f)
                curveToRelative(-42.9f, -62.1f, -70.9f, -80.5f, -104.4f, -80.5f)
                curveToRelative(-61.9f, 0.0f, -113.8f, 106.1f, -113.8f, 210.0f)
                curveToRelative(0.0f, 48.5f, 18.5f, 75.7f, 49.6f, 75.7f)
                curveToRelative(30.2f, 0.0f, 49.0f, -19.0f, 103.2f, -103.8f)
                curveToRelative(0.0f, 0.0f, 24.7f, -39.1f, 65.4f, -101.4f)
                close()
                moveTo(531.2f, 397.4f)
                curveToRelative(32.2f, 0.0f, 46.9f, -27.5f, 46.9f, -74.9f)
                curveToRelative(0.0f, -124.2f, -54.3f, -225.4f, -123.2f, -225.4f)
                curveToRelative(-33.2f, 0.0f, -61.1f, 25.9f, -94.9f, 78.0f)
                curveToRelative(9.4f, 13.8f, 19.1f, 29.0f, 29.3f, 45.4f)
                lineToRelative(37.5f, 62.4f)
                curveToRelative(58.7f, 94.1f, 73.5f, 114.5f, 104.4f, 114.5f)
                close()
            }
        }
        .build()
        return _meta!!
    }

private var _meta: ImageVector? = null
