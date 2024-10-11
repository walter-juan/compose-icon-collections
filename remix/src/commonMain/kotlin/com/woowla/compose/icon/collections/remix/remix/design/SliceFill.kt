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

public val DesignGroup.SliceFill: ImageVector
    get() {
        if (_sliceFill != null) {
            return _sliceFill!!
        }
        _sliceFill = Builder(name = "SliceFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.768f, 12.229f)
                lineTo(15.889f, 14.35f)
                curveTo(11.293f, 18.946f, 5.636f, 20.361f, 2.101f, 19.653f)
                lineTo(17.657f, 4.097f)
                lineTo(19.778f, 6.218f)
                lineTo(13.768f, 12.229f)
                close()
            }
        }
        .build()
        return _sliceFill!!
    }

private var _sliceFill: ImageVector? = null
