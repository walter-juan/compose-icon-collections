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

public val DesignGroup.EditFill: ImageVector
    get() {
        if (_editFill != null) {
            return _editFill!!
        }
        _editFill = Builder(name = "EditFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.243f, 17.997f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.754f)
                lineTo(14.435f, 2.319f)
                curveTo(14.826f, 1.928f, 15.459f, 1.928f, 15.849f, 2.319f)
                lineTo(18.678f, 5.147f)
                curveTo(19.068f, 5.538f, 19.068f, 6.171f, 18.678f, 6.562f)
                lineTo(7.243f, 17.997f)
                close()
                moveTo(3.0f, 19.997f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.997f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.997f)
                close()
            }
        }
        .build()
        return _editFill!!
    }

private var _editFill: ImageVector? = null
