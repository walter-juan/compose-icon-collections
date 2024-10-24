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

public val SystemGroup.StarOffFill: ImageVector
    get() {
        if (_starOffFill != null) {
            return _starOffFill!!
        }
        _starOffFill = Builder(name = "StarOffFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.413f, 8.792f)
                lineTo(18.021f, 13.778f)
                lineTo(9.71f, 5.467f)
                lineTo(12.001f, 0.5f)
                lineTo(15.386f, 7.84f)
                lineTo(23.413f, 8.792f)
                close()
                moveTo(18.622f, 20.036f)
                lineTo(21.193f, 22.607f)
                lineTo(22.607f, 21.192f)
                lineTo(2.808f, 1.393f)
                lineTo(1.394f, 2.808f)
                lineTo(6.658f, 8.072f)
                lineTo(0.588f, 8.792f)
                lineTo(6.522f, 14.28f)
                lineTo(4.947f, 22.208f)
                lineTo(12.001f, 18.26f)
                lineTo(19.054f, 22.208f)
                lineTo(18.622f, 20.036f)
                close()
            }
        }
        .build()
        return _starOffFill!!
    }

private var _starOffFill: ImageVector? = null
