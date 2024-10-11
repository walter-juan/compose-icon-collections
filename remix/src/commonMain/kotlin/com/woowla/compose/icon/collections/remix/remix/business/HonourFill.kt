package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.HonourFill: ImageVector
    get() {
        if (_honourFill != null) {
            return _honourFill!!
        }
        _honourFill = Builder(name = "HonourFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                verticalLineTo(18.722f)
                curveTo(21.0f, 18.919f, 20.883f, 19.099f, 20.702f, 19.179f)
                lineTo(12.0f, 23.031f)
                lineTo(3.298f, 19.179f)
                curveTo(3.117f, 19.099f, 3.0f, 18.919f, 3.0f, 18.722f)
                verticalLineTo(4.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(8.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(8.0f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _honourFill!!
    }

private var _honourFill: ImageVector? = null
