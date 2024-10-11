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

public val DesignGroup.OctagonLine: ImageVector
    get() {
        if (_octagonLine != null) {
            return _octagonLine!!
        }
        _octagonLine = Builder(name = "OctagonLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.936f, 2.501f)
                lineTo(21.501f, 8.066f)
                verticalLineTo(15.936f)
                lineTo(15.936f, 21.501f)
                horizontalLineTo(8.066f)
                lineTo(2.501f, 15.936f)
                verticalLineTo(8.066f)
                lineTo(8.066f, 2.501f)
                horizontalLineTo(15.936f)
                close()
                moveTo(15.108f, 4.501f)
                horizontalLineTo(8.894f)
                lineTo(4.501f, 8.894f)
                verticalLineTo(15.108f)
                lineTo(8.894f, 19.501f)
                horizontalLineTo(15.108f)
                lineTo(19.501f, 15.108f)
                verticalLineTo(8.894f)
                lineTo(15.108f, 4.501f)
                close()
            }
        }
        .build()
        return _octagonLine!!
    }

private var _octagonLine: ImageVector? = null
