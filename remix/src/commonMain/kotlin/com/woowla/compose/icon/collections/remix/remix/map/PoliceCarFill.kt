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

public val MapGroup.PoliceCarFill: ImageVector
    get() {
        if (_policeCarFill != null) {
            return _policeCarFill!!
        }
        _policeCarFill = Builder(name = "PoliceCarFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                horizontalLineTo(2.429f)
                lineTo(4.481f, 6.212f)
                curveTo(4.796f, 5.477f, 5.519f, 5.0f, 6.319f, 5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.681f)
                curveTo(18.481f, 5.0f, 19.204f, 5.477f, 19.52f, 6.212f)
                lineTo(21.571f, 11.0f)
                horizontalLineTo(23.5f)
                curveTo(23.776f, 11.0f, 24.0f, 11.224f, 24.0f, 11.5f)
                verticalLineTo(12.219f)
                curveTo(24.0f, 12.678f, 23.688f, 13.078f, 23.243f, 13.189f)
                lineTo(22.0f, 13.5f)
                close()
                moveTo(4.0f, 15.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 17.552f, 4.448f, 18.0f, 5.0f, 18.0f)
                horizontalLineTo(8.245f)
                curveTo(8.327f, 18.0f, 8.408f, 17.98f, 8.481f, 17.941f)
                curveTo(8.724f, 17.811f, 8.816f, 17.508f, 8.686f, 17.264f)
                lineTo(8.686f, 17.264f)
                curveTo(7.879f, 15.755f, 6.317f, 15.0f, 4.0f, 15.0f)
                close()
                moveTo(20.0f, 15.0f)
                curveTo(17.683f, 15.0f, 16.121f, 15.755f, 15.314f, 17.264f)
                lineTo(15.314f, 17.264f)
                curveTo(15.184f, 17.508f, 15.276f, 17.811f, 15.519f, 17.941f)
                curveTo(15.592f, 17.98f, 15.673f, 18.0f, 15.755f, 18.0f)
                horizontalLineTo(19.0f)
                curveTo(19.552f, 18.0f, 20.0f, 17.552f, 20.0f, 17.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(6.0f, 7.0f)
                lineTo(4.549f, 10.629f)
                curveTo(4.501f, 10.747f, 4.477f, 10.873f, 4.477f, 11.0f)
                curveTo(4.477f, 11.552f, 4.925f, 12.0f, 5.477f, 12.0f)
                horizontalLineTo(18.523f)
                curveTo(18.65f, 12.0f, 18.776f, 11.976f, 18.894f, 11.929f)
                curveTo(19.407f, 11.723f, 19.657f, 11.141f, 19.451f, 10.629f)
                lineTo(18.0f, 7.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _policeCarFill!!
    }

private var _policeCarFill: ImageVector? = null
