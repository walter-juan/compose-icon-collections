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

public val DesignGroup.HexagonFill: ImageVector
    get() {
        if (_hexagonFill != null) {
            return _hexagonFill!!
        }
        _hexagonFill = Builder(name = "HexagonFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 2.5f)
                lineTo(23.0f, 12.0f)
                lineTo(17.5f, 21.5f)
                horizontalLineTo(6.5f)
                lineTo(1.0f, 12.0f)
                lineTo(6.5f, 2.5f)
                horizontalLineTo(17.5f)
                close()
            }
        }
        .build()
        return _hexagonFill!!
    }

private var _hexagonFill: ImageVector? = null
