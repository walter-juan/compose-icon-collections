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

public val OthersGroup.PlantLine: ImageVector
    get() {
        if (_plantLine != null) {
            return _plantLine!!
        }
        _plantLine = Builder(name = "PlantLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.998f, 2.0f)
                curveTo(8.687f, 2.0f, 11.022f, 3.517f, 12.195f, 5.741f)
                curveTo(13.372f, 4.083f, 15.309f, 3.0f, 17.498f, 3.0f)
                horizontalLineTo(20.998f)
                verticalLineTo(5.5f)
                curveTo(20.998f, 9.09f, 18.088f, 12.0f, 14.498f, 12.0f)
                horizontalLineTo(12.998f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.998f)
                verticalLineTo(20.0f)
                curveTo(17.998f, 21.105f, 17.103f, 22.0f, 15.998f, 22.0f)
                horizontalLineTo(7.998f)
                curveTo(6.893f, 22.0f, 5.998f, 21.105f, 5.998f, 20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.998f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.998f)
                curveTo(5.132f, 11.0f, 1.998f, 7.866f, 1.998f, 4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.998f)
                close()
                moveTo(15.998f, 15.0f)
                horizontalLineTo(7.998f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.998f)
                verticalLineTo(15.0f)
                close()
                moveTo(18.998f, 5.0f)
                horizontalLineTo(17.498f)
                curveTo(15.013f, 5.0f, 12.998f, 7.015f, 12.998f, 9.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.498f)
                curveTo(16.983f, 10.0f, 18.998f, 7.985f, 18.998f, 5.5f)
                verticalLineTo(5.0f)
                close()
                moveTo(5.998f, 4.0f)
                horizontalLineTo(3.998f)
                curveTo(3.998f, 6.761f, 6.237f, 9.0f, 8.998f, 9.0f)
                horizontalLineTo(10.998f)
                curveTo(10.998f, 6.239f, 8.759f, 4.0f, 5.998f, 4.0f)
                close()
            }
        }
        .build()
        return _plantLine!!
    }

private var _plantLine: ImageVector? = null
