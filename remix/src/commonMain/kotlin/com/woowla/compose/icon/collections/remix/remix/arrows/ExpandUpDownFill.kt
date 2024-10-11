package com.woowla.compose.icon.collections.remix.remix.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.ArrowsGroup

public val ArrowsGroup.ExpandUpDownFill: ImageVector
    get() {
        if (_expandUpDownFill != null) {
            return _expandUpDownFill!!
        }
        _expandUpDownFill = Builder(name = "ExpandUpDownFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 9.0f)
                lineTo(12.0f, 3.0f)
                lineTo(6.0f, 9.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(18.0f, 15.0f)
                lineTo(12.0f, 21.0f)
                lineTo(6.0f, 15.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _expandUpDownFill!!
    }

private var _expandUpDownFill: ImageVector? = null
