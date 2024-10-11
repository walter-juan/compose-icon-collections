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

public val ArrowsGroup.ExpandDiagonalS2Fill: ImageVector
    get() {
        if (_expandDiagonalS2Fill != null) {
            return _expandDiagonalS2Fill!!
        }
        _expandDiagonalS2Fill = Builder(name = "ExpandDiagonalS2Fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 12.5f)
                lineTo(8.043f, 9.457f)
                lineTo(14.543f, 15.957f)
                lineTo(11.5f, 19.0f)
                horizontalLineTo(19.0f)
                lineTo(19.0f, 11.5f)
                lineTo(15.957f, 14.543f)
                lineTo(9.457f, 8.043f)
                lineTo(12.5f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _expandDiagonalS2Fill!!
    }

private var _expandDiagonalS2Fill: ImageVector? = null
