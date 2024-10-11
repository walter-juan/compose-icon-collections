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

public val DesignGroup.ShapesFill: ImageVector
    get() {
        if (_shapesFill != null) {
            return _shapesFill!!
        }
        _shapesFill = Builder(name = "ShapesFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                lineTo(18.0f, 11.0f)
                horizontalLineTo(6.0f)
                lineTo(12.0f, 1.0f)
                close()
                moveTo(13.0f, 13.5f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.5f)
                close()
                moveTo(6.75f, 22.0f)
                curveTo(9.373f, 22.0f, 11.5f, 19.873f, 11.5f, 17.25f)
                curveTo(11.5f, 14.627f, 9.373f, 12.5f, 6.75f, 12.5f)
                curveTo(4.127f, 12.5f, 2.0f, 14.627f, 2.0f, 17.25f)
                curveTo(2.0f, 19.873f, 4.127f, 22.0f, 6.75f, 22.0f)
                close()
            }
        }
        .build()
        return _shapesFill!!
    }

private var _shapesFill: ImageVector? = null
