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

public val BrandsGroup.Chrome: ImageVector
    get() {
        if (_chrome != null) {
            return _chrome!!
        }
        _chrome = Builder(name = "Chrome", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 256.0f)
                curveToRelative(0.0f, -46.6f, 12.5f, -90.4f, 34.3f, -128.9f)
                lineTo(144.1f, 318.3f)
                curveToRelative(21.9f, 39.2f, 63.8f, 65.7f, 111.9f, 65.7f)
                curveToRelative(14.3f, 0.0f, 27.1f, -2.3f, 40.8f, -6.6f)
                lineTo(220.5f, 509.6f)
                curveTo(95.9f, 492.3f, 0.0f, 385.3f, 0.0f, 256.0f)
                close()
                moveTo(365.1f, 321.6f)
                curveToRelative(12.3f, -19.2f, 18.9f, -42.5f, 18.9f, -65.6f)
                curveToRelative(0.0f, -38.2f, -16.8f, -72.5f, -43.3f, -96.0f)
                lineToRelative(152.7f, 0.0f)
                curveToRelative(12.0f, 29.6f, 18.6f, 62.1f, 18.6f, 96.0f)
                curveToRelative(0.0f, 141.4f, -114.6f, 255.1f, -256.0f, 256.0f)
                lineTo(365.1f, 321.6f)
                close()
                moveTo(477.8f, 128.0f)
                lineTo(256.0f, 128.0f)
                curveToRelative(-62.9f, 0.0f, -113.7f, 44.1f, -125.5f, 102.7f)
                lineTo(54.2f, 98.5f)
                curveTo(101.0f, 38.5f, 174.0f, 0.0f, 256.0f, 0.0f)
                curveTo(350.8f, 0.0f, 433.5f, 51.5f, 477.8f, 128.0f)
                close()
                moveTo(344.0f, 256.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, -176.0f, 0.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 176.0f, 0.0f)
                close()
            }
        }
        .build()
        return _chrome!!
    }

private var _chrome: ImageVector? = null
