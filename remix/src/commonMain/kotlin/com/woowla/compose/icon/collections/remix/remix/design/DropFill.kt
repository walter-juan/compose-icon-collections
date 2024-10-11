package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.DropFill: ImageVector
    get() {
        if (_dropFill != null) {
            return _dropFill!!
        }
        _dropFill = Builder(name = "DropFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.636f, 6.633f)
                lineTo(12.0f, 0.269f)
                lineTo(18.364f, 6.633f)
                curveTo(21.879f, 10.148f, 21.879f, 15.846f, 18.364f, 19.361f)
                curveTo(14.849f, 22.875f, 9.151f, 22.875f, 5.636f, 19.361f)
                curveTo(2.121f, 15.846f, 2.121f, 10.148f, 5.636f, 6.633f)
                horizontalLineTo(5.636f)
                close()
            }
        }
        .build()
        return _dropFill!!
    }

private var _dropFill: ImageVector? = null
