package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.PoliceCarLine: ImageVector
    get() {
        if (_policeCarLine != null) {
            return _policeCarLine!!
        }
        _policeCarLine = Builder(name = "PoliceCarLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(5.618f, 11.0f)
                horizontalLineTo(18.382f)
                curveTo(18.537f, 11.0f, 18.69f, 10.964f, 18.829f, 10.894f)
                curveTo(19.323f, 10.647f, 19.523f, 10.047f, 19.276f, 9.553f)
                lineTo(18.0f, 7.0f)
                horizontalLineTo(6.0f)
                lineTo(4.724f, 9.553f)
                curveTo(4.654f, 9.692f, 4.618f, 9.845f, 4.618f, 10.0f)
                curveTo(4.618f, 10.552f, 5.066f, 11.0f, 5.618f, 11.0f)
                close()
                moveTo(22.0f, 13.5f)
                verticalLineTo(21.0f)
                curveTo(22.0f, 21.552f, 21.552f, 22.0f, 21.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(19.448f, 22.0f, 19.0f, 21.552f, 19.0f, 21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.0f)
                curveTo(5.0f, 21.552f, 4.552f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 22.0f, 2.0f, 21.552f, 2.0f, 21.0f)
                verticalLineTo(13.5f)
                lineTo(0.757f, 13.189f)
                curveTo(0.312f, 13.078f, 0.0f, 12.678f, 0.0f, 12.219f)
                verticalLineTo(11.5f)
                curveTo(0.0f, 11.224f, 0.224f, 11.0f, 0.5f, 11.0f)
                horizontalLineTo(2.0f)
                lineTo(4.447f, 6.106f)
                curveTo(4.786f, 5.428f, 5.479f, 5.0f, 6.236f, 5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.764f)
                curveTo(18.521f, 5.0f, 19.214f, 5.428f, 19.553f, 6.106f)
                lineTo(22.0f, 11.0f)
                horizontalLineTo(23.5f)
                curveTo(23.776f, 11.0f, 24.0f, 11.224f, 24.0f, 11.5f)
                verticalLineTo(12.219f)
                curveTo(24.0f, 12.678f, 23.688f, 13.078f, 23.243f, 13.189f)
                lineTo(22.0f, 13.5f)
                close()
                moveTo(5.0f, 14.0f)
                curveTo(7.317f, 14.0f, 8.879f, 14.755f, 9.686f, 16.264f)
                lineTo(9.686f, 16.264f)
                curveTo(9.816f, 16.508f, 9.724f, 16.811f, 9.481f, 16.941f)
                curveTo(9.408f, 16.98f, 9.327f, 17.0f, 9.245f, 17.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 17.0f, 5.0f, 16.552f, 5.0f, 16.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(19.0f, 14.0f)
                verticalLineTo(16.0f)
                curveTo(19.0f, 16.552f, 18.552f, 17.0f, 18.0f, 17.0f)
                horizontalLineTo(14.755f)
                curveTo(14.673f, 17.0f, 14.592f, 16.98f, 14.519f, 16.941f)
                curveTo(14.276f, 16.811f, 14.184f, 16.508f, 14.314f, 16.264f)
                lineTo(14.314f, 16.264f)
                curveTo(15.121f, 14.755f, 16.683f, 14.0f, 19.0f, 14.0f)
                close()
            }
        }
        .build()
        return _policeCarLine!!
    }

private var _policeCarLine: ImageVector? = null
