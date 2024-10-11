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

public val DesignGroup.PentagonFill: ImageVector
    get() {
        if (_pentagonFill != null) {
            return _pentagonFill!!
        }
        _pentagonFill = Builder(name = "PentagonFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.7f)
                lineTo(22.747f, 8.508f)
                lineTo(18.642f, 21.142f)
                horizontalLineTo(5.358f)
                lineTo(1.253f, 8.508f)
                lineTo(12.0f, 0.7f)
                close()
            }
        }
        .build()
        return _pentagonFill!!
    }

private var _pentagonFill: ImageVector? = null
