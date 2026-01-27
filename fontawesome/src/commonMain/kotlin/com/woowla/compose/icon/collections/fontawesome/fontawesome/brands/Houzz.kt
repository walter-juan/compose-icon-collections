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

public val BrandsGroup.Houzz: ImageVector
    get() {
        if (_houzz != null) {
            return _houzz!!
        }
        _houzz = Builder(name = "Houzz", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(276.0f, 330.7f)
                lineToRelative(-104.6f, 0.0f)
                lineToRelative(0.0f, 149.3f)
                lineToRelative(-154.3f, 0.0f)
                lineToRelative(0.0f, -448.0f)
                lineToRelative(109.5f, 0.0f)
                lineToRelative(0.0f, 104.5f)
                lineToRelative(305.1f, 85.6f)
                lineToRelative(0.0f, 257.9f)
                lineToRelative(-155.7f, 0.0f)
                lineToRelative(0.0f, -149.3f)
                close()
            }
        }
        .build()
        return _houzz!!
    }

private var _houzz: ImageVector? = null
