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

public val DesignGroup.DropLine: ImageVector
    get() {
        if (_dropLine != null) {
            return _dropLine!!
        }
        _dropLine = Builder(name = "DropLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.097f)
                lineTo(7.05f, 8.047f)
                curveTo(4.317f, 10.781f, 4.317f, 15.213f, 7.05f, 17.947f)
                curveTo(9.784f, 20.68f, 14.216f, 20.68f, 16.95f, 17.947f)
                curveTo(19.683f, 15.213f, 19.683f, 10.781f, 16.95f, 8.047f)
                lineTo(12.0f, 3.097f)
                close()
                moveTo(12.0f, 0.269f)
                lineTo(18.364f, 6.633f)
                curveTo(21.879f, 10.148f, 21.879f, 15.846f, 18.364f, 19.361f)
                curveTo(14.849f, 22.875f, 9.151f, 22.875f, 5.636f, 19.361f)
                curveTo(2.121f, 15.846f, 2.121f, 10.148f, 5.636f, 6.633f)
                lineTo(12.0f, 0.269f)
                close()
            }
        }
        .build()
        return _dropLine!!
    }

private var _dropLine: ImageVector? = null
