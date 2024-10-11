package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.BlenderLine: ImageVector
    get() {
        if (_blenderLine != null) {
            return _blenderLine!!
        }
        _blenderLine = Builder(name = "BlenderLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.122f, 2.217f)
                curveTo(12.69f, 1.874f, 12.061f, 1.945f, 11.717f, 2.378f)
                curveTo(11.373f, 2.81f, 11.446f, 3.439f, 11.878f, 3.783f)
                lineTo(15.297f, 6.5f)
                horizontalLineTo(4.5f)
                curveTo(3.948f, 6.5f, 3.5f, 6.948f, 3.5f, 7.5f)
                curveTo(3.5f, 8.052f, 3.948f, 8.5f, 4.5f, 8.5f)
                horizontalLineTo(9.972f)
                lineTo(0.878f, 15.717f)
                curveTo(0.446f, 16.06f, 0.373f, 16.689f, 0.717f, 17.122f)
                curveTo(1.06f, 17.554f, 1.689f, 17.627f, 2.122f, 17.283f)
                lineTo(7.545f, 12.98f)
                curveTo(7.515f, 13.232f, 7.5f, 13.489f, 7.5f, 13.75f)
                curveTo(7.5f, 17.858f, 11.191f, 21.0f, 15.5f, 21.0f)
                curveTo(19.809f, 21.0f, 23.5f, 17.858f, 23.5f, 13.75f)
                curveTo(23.5f, 11.503f, 22.376f, 9.523f, 20.665f, 8.211f)
                lineTo(13.122f, 2.217f)
                close()
                moveTo(11.565f, 9.789f)
                curveTo(12.611f, 8.992f, 13.983f, 8.5f, 15.5f, 8.5f)
                curveTo(17.02f, 8.5f, 18.395f, 8.994f, 19.442f, 9.795f)
                curveTo(20.726f, 10.776f, 21.5f, 12.198f, 21.5f, 13.75f)
                curveTo(21.5f, 16.546f, 18.923f, 19.0f, 15.5f, 19.0f)
                curveTo(12.077f, 19.0f, 9.5f, 16.546f, 9.5f, 13.75f)
                curveTo(9.5f, 12.27f, 10.204f, 10.908f, 11.382f, 9.934f)
                lineTo(11.565f, 9.789f)
                close()
                moveTo(14.478f, 14.092f)
                curveTo(14.201f, 13.831f, 14.079f, 13.526f, 14.097f, 13.21f)
                curveTo(14.129f, 12.645f, 14.72f, 12.0f, 15.595f, 12.0f)
                curveTo(16.468f, 12.0f, 17.06f, 12.644f, 17.093f, 13.209f)
                curveTo(17.111f, 13.539f, 16.985f, 13.842f, 16.715f, 14.096f)
                curveTo(16.43f, 14.365f, 16.018f, 14.536f, 15.595f, 14.536f)
                curveTo(15.182f, 14.536f, 14.769f, 14.366f, 14.478f, 14.092f)
                close()
                moveTo(15.595f, 10.0f)
                curveTo(13.849f, 10.0f, 12.201f, 11.295f, 12.1f, 13.099f)
                curveTo(11.992f, 15.045f, 13.725f, 16.536f, 15.595f, 16.536f)
                curveTo(17.471f, 16.536f, 19.197f, 15.059f, 19.09f, 13.098f)
                curveTo(18.988f, 11.294f, 17.341f, 10.0f, 15.595f, 10.0f)
                close()
            }
        }
        .build()
        return _blenderLine!!
    }

private var _blenderLine: ImageVector? = null
