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

public val BrandsGroup.Hashnode: ImageVector
    get() {
        if (_hashnode != null) {
            return _hashnode!!
        }
        _hashnode = Builder(name = "Hashnode", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(35.7f, 171.1f)
                curveToRelative(-46.9f, 46.0f, -46.9f, 122.9f, 0.0f, 169.8f)
                lineTo(171.6f, 476.8f)
                curveToRelative(46.0f, 46.9f, 122.9f, 46.9f, 169.8f, 0.0f)
                lineTo(477.3f, 340.9f)
                curveToRelative(46.9f, -46.9f, 46.9f, -123.8f, 0.0f, -169.8f)
                lineTo(341.4f, 35.2f)
                curveToRelative(-46.9f, -46.9f, -123.8f, -46.9f, -169.8f, 0.0f)
                lineTo(35.7f, 171.1f)
                close()
                moveTo(196.0f, 196.5f)
                arcToRelative(84.5f, 84.5f, 0.0f, true, true, 120.0f, 119.0f)
                arcToRelative(84.5f, 84.5f, 0.0f, true, true, -120.0f, -119.0f)
                close()
            }
        }
        .build()
        return _hashnode!!
    }

private var _hashnode: ImageVector? = null
