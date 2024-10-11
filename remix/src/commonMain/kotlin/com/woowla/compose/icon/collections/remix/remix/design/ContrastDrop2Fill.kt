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

public val DesignGroup.ContrastDrop2Fill: ImageVector
    get() {
        if (_contrastDrop2Fill != null) {
            return _contrastDrop2Fill!!
        }
        _contrastDrop2Fill = Builder(name = "ContrastDrop2Fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.0f, 3.097f)
                lineTo(7.05f, 8.047f)
                curveTo(5.784f, 9.314f, 5.0f, 11.064f, 5.0f, 12.997f)
                horizontalLineTo(19.0f)
                curveTo(19.0f, 11.064f, 18.216f, 9.314f, 16.95f, 8.047f)
                lineTo(12.0f, 3.097f)
                close()
            }
        }
        .build()
        return _contrastDrop2Fill!!
    }

private var _contrastDrop2Fill: ImageVector? = null
