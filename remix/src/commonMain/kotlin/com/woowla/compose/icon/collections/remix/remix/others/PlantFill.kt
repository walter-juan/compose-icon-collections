package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.PlantFill: ImageVector
    get() {
        if (_plantFill != null) {
            return _plantFill!!
        }
        _plantFill = Builder(name = "PlantFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.998f, 3.0f)
                verticalLineTo(5.0f)
                curveTo(20.998f, 8.866f, 17.864f, 12.0f, 13.998f, 12.0f)
                horizontalLineTo(12.998f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.998f)
                verticalLineTo(20.0f)
                curveTo(17.998f, 21.105f, 17.103f, 22.0f, 15.998f, 22.0f)
                horizontalLineTo(7.998f)
                curveTo(6.893f, 22.0f, 5.998f, 21.105f, 5.998f, 20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.998f)
                verticalLineTo(10.0f)
                curveTo(10.998f, 6.134f, 14.132f, 3.0f, 17.998f, 3.0f)
                horizontalLineTo(20.998f)
                close()
                moveTo(5.498f, 2.0f)
                curveTo(8.027f, 2.0f, 10.263f, 3.251f, 11.622f, 5.169f)
                curveTo(10.603f, 6.511f, 9.998f, 8.185f, 9.998f, 10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.498f)
                curveTo(5.356f, 11.0f, 1.998f, 7.642f, 1.998f, 3.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.498f)
                close()
            }
        }
        .build()
        return _plantFill!!
    }

private var _plantFill: ImageVector? = null
