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

public val BrandsGroup.Pandora: ImageVector
    get() {
        if (_pandora != null) {
            return _pandora!!
        }
        _pandora = Builder(name = "Pandora", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.3f, 32.0f)
                lineTo(0.0f, 32.0f)
                lineTo(0.0f, 480.0f)
                lineTo(120.2f, 480.0f)
                curveToRelative(11.2f, 0.0f, 20.3f, -9.1f, 20.3f, -20.3f)
                lineToRelative(0.0f, -86.1f)
                lineToRelative(30.1f, 0.0f)
                curveToRelative(147.1f, 0.0f, 207.3f, -82.9f, 207.3f, -179.9f)
                curveToRelative(0.0f, -119.7f, -90.9f, -161.8f, -176.5f, -161.8f)
                close()
            }
        }
        .build()
        return _pandora!!
    }

private var _pandora: ImageVector? = null
