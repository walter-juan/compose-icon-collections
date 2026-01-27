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

public val BrandsGroup.Elementor: ImageVector
    get() {
        if (_elementor != null) {
            return _elementor!!
        }
        _elementor = Builder(name = "Elementor", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.5f, 256.0f)
                curveToRelative(0.0f, 141.0f, 113.6f, 255.0f, 254.6f, 255.0f)
                curveToRelative(142.0f, 0.0f, 256.0f, -114.0f, 256.0f, -255.0f)
                curveToRelative(0.0f, -140.0f, -114.0f, -253.9f, -256.0f, -253.9f)
                curveToRelative(-141.0f, 0.0f, -254.6f, 113.9f, -254.6f, 253.9f)
                close()
                moveTo(192.1f, 150.0f)
                lineToRelative(0.0f, 213.0f)
                lineToRelative(-43.0f, 0.0f)
                lineToRelative(0.0f, -213.0f)
                lineToRelative(43.0f, 0.0f)
                close()
                moveTo(234.1f, 150.0f)
                lineToRelative(128.0f, 0.0f)
                lineToRelative(0.0f, 43.0f)
                lineToRelative(-128.0f, 0.0f)
                lineToRelative(0.0f, -43.0f)
                close()
                moveTo(362.1f, 235.0f)
                lineToRelative(0.0f, 43.0f)
                lineToRelative(-128.0f, 0.0f)
                lineToRelative(0.0f, -43.0f)
                lineToRelative(128.0f, 0.0f)
                close()
                moveTo(234.1f, 320.0f)
                lineToRelative(128.0f, 0.0f)
                lineToRelative(0.0f, 43.0f)
                lineToRelative(-128.0f, 0.0f)
                lineToRelative(0.0f, -43.0f)
                close()
            }
        }
        .build()
        return _elementor!!
    }

private var _elementor: ImageVector? = null
