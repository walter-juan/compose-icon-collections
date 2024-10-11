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

public val DesignGroup.ContrastLine: ImageVector
    get() {
        if (_contrastLine != null) {
            return _contrastLine!!
        }
        _contrastLine = Builder(name = "ContrastLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.997f)
                curveTo(6.477f, 21.997f, 2.0f, 17.52f, 2.0f, 11.997f)
                curveTo(2.0f, 6.474f, 6.477f, 1.997f, 12.0f, 1.997f)
                curveTo(17.523f, 1.997f, 22.0f, 6.474f, 22.0f, 11.997f)
                curveTo(22.0f, 17.52f, 17.523f, 21.997f, 12.0f, 21.997f)
                close()
                moveTo(12.0f, 19.997f)
                curveTo(16.418f, 19.997f, 20.0f, 16.415f, 20.0f, 11.997f)
                curveTo(20.0f, 7.578f, 16.418f, 3.997f, 12.0f, 3.997f)
                curveTo(7.582f, 3.997f, 4.0f, 7.578f, 4.0f, 11.997f)
                curveTo(4.0f, 16.415f, 7.582f, 19.997f, 12.0f, 19.997f)
                close()
                moveTo(12.0f, 17.997f)
                verticalLineTo(5.997f)
                curveTo(15.314f, 5.997f, 18.0f, 8.683f, 18.0f, 11.997f)
                curveTo(18.0f, 15.31f, 15.314f, 17.997f, 12.0f, 17.997f)
                close()
            }
        }
        .build()
        return _contrastLine!!
    }

private var _contrastLine: ImageVector? = null
