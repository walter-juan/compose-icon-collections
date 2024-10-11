package com.woowla.compose.icon.collections.remix.remix.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.EditorGroup

public val EditorGroup.Hand: ImageVector
    get() {
        if (_hand != null) {
            return _hand!!
        }
        _hand = Builder(name = "Hand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 2.0f)
                curveTo(12.224f, 2.0f, 12.0f, 2.224f, 12.0f, 2.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.5f)
                curveTo(10.0f, 4.224f, 9.776f, 4.0f, 9.5f, 4.0f)
                curveTo(9.224f, 4.0f, 9.0f, 4.224f, 9.0f, 4.5f)
                verticalLineTo(14.0f)
                curveTo(8.647f, 14.0f, 7.0f, 14.0f, 7.0f, 14.0f)
                curveTo(6.619f, 12.379f, 5.642f, 11.441f, 4.595f, 11.322f)
                curveTo(4.879f, 12.066f, 5.361f, 13.259f, 6.166f, 15.099f)
                curveTo(7.025f, 17.062f, 7.891f, 18.522f, 9.004f, 19.499f)
                curveTo(10.078f, 20.442f, 11.459f, 21.0f, 13.5f, 21.0f)
                curveTo(16.538f, 21.0f, 19.0f, 18.538f, 19.0f, 15.5f)
                verticalLineTo(7.0f)
                curveTo(19.0f, 6.724f, 18.776f, 6.5f, 18.5f, 6.5f)
                curveTo(18.224f, 6.5f, 18.0f, 6.724f, 18.0f, 7.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(4.0f)
                curveTo(16.0f, 3.724f, 15.776f, 3.5f, 15.5f, 3.5f)
                curveTo(15.224f, 3.5f, 15.0f, 3.724f, 15.0f, 4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(2.5f)
                curveTo(13.0f, 2.224f, 12.776f, 2.0f, 12.5f, 2.0f)
                close()
                moveTo(21.0f, 15.5f)
                curveTo(21.0f, 19.642f, 17.642f, 23.0f, 13.5f, 23.0f)
                curveTo(11.042f, 23.0f, 9.172f, 22.308f, 7.684f, 21.001f)
                curveTo(6.234f, 19.728f, 5.225f, 17.938f, 4.334f, 15.901f)
                curveTo(3.404f, 13.775f, 2.89f, 12.48f, 2.61f, 11.724f)
                curveTo(2.253f, 10.76f, 2.746f, 9.412f, 4.086f, 9.318f)
                curveTo(5.241f, 9.238f, 6.221f, 9.612f, 7.0f, 10.259f)
                verticalLineTo(4.5f)
                curveTo(7.0f, 3.119f, 8.119f, 2.0f, 9.5f, 2.0f)
                curveTo(9.685f, 2.0f, 9.866f, 2.02f, 10.039f, 2.058f)
                curveTo(10.248f, 0.888f, 11.27f, 0.0f, 12.5f, 0.0f)
                curveTo(13.56f, 0.0f, 14.466f, 0.66f, 14.83f, 1.591f)
                curveTo(15.043f, 1.532f, 15.268f, 1.5f, 15.5f, 1.5f)
                curveTo(16.881f, 1.5f, 18.0f, 2.619f, 18.0f, 4.0f)
                verticalLineTo(4.55f)
                curveTo(18.162f, 4.517f, 18.329f, 4.5f, 18.5f, 4.5f)
                curveTo(19.881f, 4.5f, 21.0f, 5.619f, 21.0f, 7.0f)
                verticalLineTo(15.5f)
                close()
            }
        }
        .build()
        return _hand!!
    }

private var _hand: ImageVector? = null
