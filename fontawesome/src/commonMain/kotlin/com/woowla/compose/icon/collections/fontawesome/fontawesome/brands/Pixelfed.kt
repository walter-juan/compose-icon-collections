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

public val BrandsGroup.Pixelfed: ImageVector
    get() {
        if (_pixelfed != null) {
            return _pixelfed!!
        }
        _pixelfed = Builder(name = "Pixelfed", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 0.0f, 512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 0.0f, -512.0f)
                close()
                moveTo(235.7f, 311.9f)
                lineToRelative(47.0f, 0.0f)
                curveToRelative(44.2f, 0.0f, 80.1f, -34.9f, 80.1f, -78.0f)
                reflectiveCurveToRelative(-35.9f, -78.0f, -80.1f, -78.0f)
                lineToRelative(-67.8f, 0.0f)
                curveToRelative(-25.5f, 0.0f, -46.2f, 20.1f, -46.2f, 45.0f)
                lineToRelative(0.0f, 175.1f)
                lineToRelative(67.0f, -64.1f)
                close()
            }
        }
        .build()
        return _pixelfed!!
    }

private var _pixelfed: ImageVector? = null
