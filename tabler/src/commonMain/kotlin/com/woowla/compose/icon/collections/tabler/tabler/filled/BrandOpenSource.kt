package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.BrandOpenSource: ImageVector
    get() {
        if (_brandOpenSource != null) {
            return _brandOpenSource!!
        }
        _brandOpenSource = Builder(name = "BrandOpenSource", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.283f, 2.004f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 3.736f, 19.155f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.332f, -0.551f)
                lineToRelative(-2.193f, -5.602f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.456f, -1.245f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -1.9f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.457f, 1.244f)
                lineToRelative(-2.193f, 5.603f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.332f, 0.552f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 4.018f, -19.16f)
                close()
            }
        }
        .build()
        return _brandOpenSource!!
    }

private var _brandOpenSource: ImageVector? = null
