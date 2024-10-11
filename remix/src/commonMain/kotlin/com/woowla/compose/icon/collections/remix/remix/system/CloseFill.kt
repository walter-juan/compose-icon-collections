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

public val SystemGroup.CloseFill: ImageVector
    get() {
        if (_closeFill != null) {
            return _closeFill!!
        }
        _closeFill = Builder(name = "CloseFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.587f)
                lineTo(16.949f, 5.637f)
                lineTo(18.364f, 7.051f)
                lineTo(13.414f, 12.001f)
                lineTo(18.364f, 16.95f)
                lineTo(16.949f, 18.365f)
                lineTo(12.0f, 13.415f)
                lineTo(7.05f, 18.365f)
                lineTo(5.636f, 16.95f)
                lineTo(10.585f, 12.001f)
                lineTo(5.636f, 7.051f)
                lineTo(7.05f, 5.637f)
                lineTo(12.0f, 10.587f)
                close()
            }
        }
        .build()
        return _closeFill!!
    }

private var _closeFill: ImageVector? = null
