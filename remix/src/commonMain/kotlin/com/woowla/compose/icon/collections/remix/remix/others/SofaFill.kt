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

public val OthersGroup.SofaFill: ImageVector
    get() {
        if (_sofaFill != null) {
            return _sofaFill!!
        }
        _sofaFill = Builder(name = "SofaFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                horizontalLineTo(9.0f)
                curveTo(6.02f, 3.0f, 3.548f, 5.172f, 3.08f, 8.019f)
                curveTo(3.218f, 8.007f, 3.358f, 8.0f, 3.5f, 8.0f)
                curveTo(5.985f, 8.0f, 8.0f, 10.015f, 8.0f, 12.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.5f)
                curveTo(16.0f, 10.015f, 18.015f, 8.0f, 20.5f, 8.0f)
                curveTo(20.642f, 8.0f, 20.782f, 8.007f, 20.92f, 8.019f)
                curveTo(20.452f, 5.172f, 17.98f, 3.0f, 15.0f, 3.0f)
                close()
                moveTo(21.0f, 10.05f)
                curveTo(20.838f, 10.017f, 20.671f, 10.0f, 20.5f, 10.0f)
                curveTo(19.119f, 10.0f, 18.0f, 11.119f, 18.0f, 12.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.5f)
                curveTo(6.0f, 11.119f, 4.881f, 10.0f, 3.5f, 10.0f)
                curveTo(3.329f, 10.0f, 3.162f, 10.017f, 3.0f, 10.05f)
                curveTo(1.859f, 10.282f, 1.0f, 11.29f, 1.0f, 12.5f)
                curveTo(1.0f, 13.089f, 1.182f, 13.539f, 1.39f, 14.055f)
                curveTo(1.671f, 14.75f, 2.0f, 15.566f, 2.0f, 17.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.552f, 2.447f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(12.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 21.0f, 22.0f, 20.552f, 22.0f, 20.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 15.566f, 22.329f, 14.75f, 22.61f, 14.055f)
                curveTo(22.818f, 13.539f, 23.0f, 13.089f, 23.0f, 12.5f)
                curveTo(23.0f, 11.29f, 22.141f, 10.282f, 21.0f, 10.05f)
                close()
            }
        }
        .build()
        return _sofaFill!!
    }

private var _sofaFill: ImageVector? = null
