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

public val BrandsGroup.Gratipay: ImageVector
    get() {
        if (_gratipay != null) {
            return _gratipay!!
        }
        _gratipay = Builder(name = "Gratipay", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, -512.0f)
                close()
                moveTo(374.3f, 233.7f)
                lineTo(257.7f, 391.3f)
                lineTo(141.3f, 233.7f)
                curveToRelative(-9.0f, -12.3f, -19.7f, -52.0f, 14.0f, -74.3f)
                curveToRelative(29.0f, -18.7f, 56.4f, -4.3f, 70.7f, 12.3f)
                curveToRelative(16.4f, 18.5f, 48.1f, 17.4f, 63.7f, 0.0f)
                curveToRelative(14.3f, -16.6f, 41.7f, -31.0f, 70.3f, -12.3f)
                curveToRelative(34.0f, 22.3f, 23.3f, 61.9f, 14.2f, 74.3f)
                close()
            }
        }
        .build()
        return _gratipay!!
    }

private var _gratipay: ImageVector? = null
