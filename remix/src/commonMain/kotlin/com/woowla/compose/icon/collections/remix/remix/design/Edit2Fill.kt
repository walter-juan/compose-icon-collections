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

public val DesignGroup.Edit2Fill: ImageVector
    get() {
        if (_edit2Fill != null) {
            return _edit2Fill!!
        }
        _edit2Fill = Builder(name = "Edit2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.243f, 18.997f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.997f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.754f)
                lineTo(12.899f, 6.855f)
                lineTo(17.142f, 11.097f)
                lineTo(9.243f, 18.997f)
                close()
                moveTo(14.314f, 5.44f)
                lineTo(16.435f, 3.319f)
                curveTo(16.826f, 2.928f, 17.459f, 2.928f, 17.849f, 3.319f)
                lineTo(20.678f, 6.147f)
                curveTo(21.068f, 6.538f, 21.068f, 7.171f, 20.678f, 7.562f)
                lineTo(18.556f, 9.683f)
                lineTo(14.314f, 5.44f)
                close()
            }
        }
        .build()
        return _edit2Fill!!
    }

private var _edit2Fill: ImageVector? = null
