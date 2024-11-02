package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Trophy: ImageVector
    get() {
        if (_trophy != null) {
            return _trophy!!
        }
        _trophy = Builder(name = "Trophy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.166f, 2.621f)
                verticalLineTo(3.479f)
                curveTo(4.131f, 3.627f, 3.107f, 3.808f, 2.095f, 4.022f)
                curveTo(1.701f, 4.105f, 1.444f, 4.484f, 1.511f, 4.881f)
                curveTo(2.021f, 7.905f, 4.54f, 10.245f, 7.649f, 10.481f)
                curveTo(8.435f, 11.122f, 9.369f, 11.591f, 10.392f, 11.827f)
                curveTo(10.293f, 12.995f, 9.896f, 14.078f, 9.279f, 15.0f)
                horizontalLineTo(8.541f)
                curveTo(7.505f, 15.0f, 6.666f, 15.84f, 6.666f, 16.875f)
                verticalLineTo(19.5f)
                horizontalLineTo(5.916f)
                curveTo(4.673f, 19.5f, 3.666f, 20.507f, 3.666f, 21.75f)
                curveTo(3.666f, 22.164f, 4.002f, 22.5f, 4.416f, 22.5f)
                horizontalLineTo(19.416f)
                curveTo(19.83f, 22.5f, 20.166f, 22.164f, 20.166f, 21.75f)
                curveTo(20.166f, 20.507f, 19.158f, 19.5f, 17.916f, 19.5f)
                horizontalLineTo(17.166f)
                verticalLineTo(16.875f)
                curveTo(17.166f, 15.84f, 16.326f, 15.0f, 15.291f, 15.0f)
                horizontalLineTo(14.552f)
                curveTo(13.935f, 14.078f, 13.539f, 12.995f, 13.44f, 11.827f)
                curveTo(14.463f, 11.591f, 15.397f, 11.122f, 16.183f, 10.481f)
                curveTo(19.292f, 10.245f, 21.811f, 7.905f, 22.322f, 4.881f)
                curveTo(22.389f, 4.484f, 22.131f, 4.105f, 21.737f, 4.022f)
                curveTo(20.725f, 3.808f, 19.701f, 3.627f, 18.666f, 3.479f)
                verticalLineTo(2.621f)
                curveTo(18.666f, 2.243f, 18.384f, 1.924f, 18.009f, 1.877f)
                curveTo(16.013f, 1.628f, 13.979f, 1.5f, 11.916f, 1.5f)
                curveTo(9.853f, 1.5f, 7.82f, 1.628f, 5.823f, 1.877f)
                curveTo(5.448f, 1.924f, 5.166f, 2.243f, 5.166f, 2.621f)
                close()
                moveTo(5.166f, 5.25f)
                curveTo(5.166f, 6.446f, 5.478f, 7.57f, 6.023f, 8.544f)
                curveTo(4.666f, 7.937f, 3.614f, 6.77f, 3.16f, 5.337f)
                curveTo(3.824f, 5.208f, 4.493f, 5.094f, 5.166f, 4.994f)
                verticalLineTo(5.25f)
                close()
                moveTo(18.666f, 5.25f)
                verticalLineTo(4.994f)
                curveTo(19.34f, 5.094f, 20.009f, 5.208f, 20.672f, 5.337f)
                curveTo(20.219f, 6.77f, 19.166f, 7.937f, 17.809f, 8.544f)
                curveTo(18.355f, 7.57f, 18.666f, 6.446f, 18.666f, 5.25f)
                close()
            }
        }
        .build()
        return _trophy!!
    }

private var _trophy: ImageVector? = null
