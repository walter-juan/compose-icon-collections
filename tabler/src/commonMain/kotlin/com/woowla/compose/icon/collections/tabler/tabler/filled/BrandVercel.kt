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

public val FilledGroup.BrandVercel: ImageVector
    get() {
        if (_brandVercel != null) {
            return _brandVercel!!
        }
        _brandVercel = Builder(name = "BrandVercel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.143f, 3.486f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.714f, 0.0f)
                lineToRelative(9.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.857f, 1.514f)
                horizontalLineToRelative(-18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.857f, -1.514f)
                close()
            }
        }
        .build()
        return _brandVercel!!
    }

private var _brandVercel: ImageVector? = null
