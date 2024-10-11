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

public val DesignGroup.HammerLine: ImageVector
    get() {
        if (_hammerLine != null) {
            return _hammerLine!!
        }
        _hammerLine = Builder(name = "HammerLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                curveTo(20.552f, 2.0f, 21.0f, 2.448f, 21.0f, 3.0f)
                verticalLineTo(8.0f)
                curveTo(21.0f, 8.552f, 20.552f, 9.0f, 20.0f, 9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(22.0f)
                curveTo(15.0f, 22.552f, 14.552f, 23.0f, 14.0f, 23.0f)
                horizontalLineTo(10.0f)
                curveTo(9.448f, 23.0f, 9.0f, 22.552f, 9.0f, 22.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.5f)
                curveTo(2.948f, 9.0f, 2.5f, 8.552f, 2.5f, 8.0f)
                verticalLineTo(5.618f)
                curveTo(2.5f, 5.239f, 2.714f, 4.893f, 3.053f, 4.724f)
                lineTo(8.5f, 2.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(15.0f, 4.0f)
                horizontalLineTo(8.972f)
                lineTo(4.5f, 6.236f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(19.0f, 4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _hammerLine!!
    }

private var _hammerLine: ImageVector? = null
