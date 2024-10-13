package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlFlickr: ImageVector
    get() {
        if (_bxlFlickr != null) {
            return _bxlFlickr!!
        }
        _bxlFlickr = Builder(name = "BxlFlickr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.157f, 12.0f)
                arcToRelative(4.573f, 4.573f, 0.0f, true, true, -9.147f, 0.0f)
                arcToRelative(4.573f, 4.573f, 0.0f, false, true, 9.147f, 0.0f)
                close()
                moveTo(21.99f, 12.0f)
                arcToRelative(4.573f, 4.573f, 0.0f, true, true, -9.147f, 0.0f)
                arcToRelative(4.573f, 4.573f, 0.0f, false, true, 9.147f, 0.0f)
                close()
            }
        }
        .build()
        return _bxlFlickr!!
    }

private var _bxlFlickr: ImageVector? = null
