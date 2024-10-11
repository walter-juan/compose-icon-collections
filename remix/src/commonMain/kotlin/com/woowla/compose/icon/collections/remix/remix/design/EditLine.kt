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

public val DesignGroup.EditLine: ImageVector
    get() {
        if (_editLine != null) {
            return _editLine!!
        }
        _editLine = Builder(name = "EditLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.414f, 15.89f)
                lineTo(16.556f, 5.748f)
                lineTo(15.142f, 4.334f)
                lineTo(5.0f, 14.476f)
                verticalLineTo(15.89f)
                horizontalLineTo(6.414f)
                close()
                moveTo(7.243f, 17.89f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.647f)
                lineTo(14.435f, 2.212f)
                curveTo(14.826f, 1.822f, 15.459f, 1.822f, 15.849f, 2.212f)
                lineTo(18.678f, 5.041f)
                curveTo(19.068f, 5.431f, 19.068f, 6.064f, 18.678f, 6.455f)
                lineTo(7.243f, 17.89f)
                close()
                moveTo(3.0f, 19.89f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.89f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.89f)
                close()
            }
        }
        .build()
        return _editLine!!
    }

private var _editLine: ImageVector? = null
