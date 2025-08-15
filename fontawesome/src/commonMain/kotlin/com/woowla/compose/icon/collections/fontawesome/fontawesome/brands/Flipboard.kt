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

public val BrandsGroup.Flipboard: ImageVector
    get() {
        if (_flipboard != null) {
            return _flipboard!!
        }
        _flipboard = Builder(name = "Flipboard", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 32.0f)
                lineToRelative(0.0f, 448.0f)
                lineToRelative(448.0f, 0.0f)
                lineToRelative(0.0f, -448.0f)
                lineToRelative(-448.0f, 0.0f)
                close()
                moveTo(358.4f, 211.2f)
                lineToRelative(-89.6f, 0.0f)
                lineToRelative(0.0f, 89.6f)
                lineToRelative(-89.6f, 0.0f)
                lineToRelative(0.0f, 89.6f)
                lineToRelative(-89.6f, 0.0f)
                lineToRelative(0.0f, -268.8f)
                lineToRelative(268.8f, 0.0f)
                lineToRelative(0.0f, 89.6f)
                close()
            }
        }
        .build()
        return _flipboard!!
    }

private var _flipboard: ImageVector? = null
