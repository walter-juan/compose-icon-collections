package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.StarHalfFill: ImageVector
    get() {
        if (_starHalfFill != null) {
            return _starHalfFill!!
        }
        _starHalfFill = Builder(name = "StarHalfFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 15.968f)
                lineTo(16.247f, 18.345f)
                lineTo(15.299f, 13.572f)
                lineTo(18.872f, 10.267f)
                lineTo(14.039f, 9.694f)
                lineTo(12.001f, 5.275f)
                verticalLineTo(15.968f)
                close()
                moveTo(12.001f, 18.26f)
                lineTo(4.947f, 22.208f)
                lineTo(6.522f, 14.28f)
                lineTo(0.588f, 8.792f)
                lineTo(8.615f, 7.84f)
                lineTo(12.001f, 0.5f)
                lineTo(15.386f, 7.84f)
                lineTo(23.413f, 8.792f)
                lineTo(17.479f, 14.28f)
                lineTo(19.054f, 22.208f)
                lineTo(12.001f, 18.26f)
                close()
            }
        }
        .build()
        return _starHalfFill!!
    }

private var _starHalfFill: ImageVector? = null
