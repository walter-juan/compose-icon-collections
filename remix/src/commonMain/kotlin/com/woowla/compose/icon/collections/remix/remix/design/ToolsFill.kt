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

public val DesignGroup.ToolsFill: ImageVector
    get() {
        if (_toolsFill != null) {
            return _toolsFill!!
        }
        _toolsFill = Builder(name = "ToolsFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.329f, 3.272f)
                curveTo(6.563f, 2.833f, 7.992f, 3.107f, 8.979f, 4.094f)
                curveTo(9.967f, 5.082f, 10.241f, 6.512f, 9.802f, 7.745f)
                lineTo(20.646f, 18.59f)
                lineTo(18.525f, 20.712f)
                lineTo(7.679f, 9.867f)
                curveTo(6.446f, 10.306f, 5.016f, 10.031f, 4.03f, 9.044f)
                curveTo(3.042f, 8.057f, 2.768f, 6.627f, 3.207f, 5.393f)
                lineTo(5.444f, 7.63f)
                curveTo(6.03f, 8.216f, 6.979f, 8.216f, 7.565f, 7.63f)
                curveTo(8.151f, 7.044f, 8.151f, 6.094f, 7.565f, 5.509f)
                lineTo(5.329f, 3.272f)
                close()
                moveTo(15.697f, 5.155f)
                lineTo(18.879f, 3.387f)
                lineTo(20.293f, 4.802f)
                lineTo(18.525f, 7.984f)
                lineTo(16.757f, 8.337f)
                lineTo(14.636f, 10.458f)
                lineTo(13.222f, 9.044f)
                lineTo(15.343f, 6.923f)
                lineTo(15.697f, 5.155f)
                close()
                moveTo(8.626f, 12.933f)
                lineTo(10.747f, 15.055f)
                lineTo(5.797f, 20.004f)
                curveTo(5.212f, 20.59f, 4.262f, 20.59f, 3.676f, 20.004f)
                curveTo(3.125f, 19.453f, 3.092f, 18.579f, 3.579f, 17.99f)
                lineTo(3.676f, 17.883f)
                lineTo(8.626f, 12.933f)
                close()
            }
        }
        .build()
        return _toolsFill!!
    }

private var _toolsFill: ImageVector? = null
