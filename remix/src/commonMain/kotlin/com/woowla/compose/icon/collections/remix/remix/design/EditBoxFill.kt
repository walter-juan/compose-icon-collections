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

public val DesignGroup.EditBoxFill: ImageVector
    get() {
        if (_editBoxFill != null) {
            return _editBoxFill!!
        }
        _editBoxFill = Builder(name = "EditBoxFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.757f, 2.997f)
                lineTo(9.291f, 10.463f)
                lineTo(9.299f, 14.71f)
                lineTo(13.537f, 14.702f)
                lineTo(21.0f, 7.239f)
                verticalLineTo(19.997f)
                curveTo(21.0f, 20.549f, 20.552f, 20.997f, 20.0f, 20.997f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 20.997f, 3.0f, 20.549f, 3.0f, 19.997f)
                verticalLineTo(3.997f)
                curveTo(3.0f, 3.444f, 3.448f, 2.997f, 4.0f, 2.997f)
                horizontalLineTo(16.757f)
                close()
                moveTo(20.485f, 2.097f)
                lineTo(21.899f, 3.511f)
                lineTo(12.707f, 12.704f)
                lineTo(11.295f, 12.706f)
                lineTo(11.293f, 11.29f)
                lineTo(20.485f, 2.097f)
                close()
            }
        }
        .build()
        return _editBoxFill!!
    }

private var _editBoxFill: ImageVector? = null
