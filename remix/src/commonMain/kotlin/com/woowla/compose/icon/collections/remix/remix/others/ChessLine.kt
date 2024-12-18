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

public val OthersGroup.ChessLine: ImageVector
    get() {
        if (_chessLine != null) {
            return _chessLine!!
        }
        _chessLine = Builder(name = "ChessLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 0.287f)
                curveTo(14.809f, 0.573f, 14.141f, 0.903f, 13.5f, 1.275f)
                curveTo(8.419f, 4.214f, 5.0f, 9.708f, 5.0f, 16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.808f)
                curveTo(17.658f, 15.316f, 17.413f, 14.701f, 17.049f, 14.15f)
                curveTo(16.482f, 13.292f, 15.627f, 12.588f, 14.39f, 12.019f)
                curveTo(14.259f, 11.959f, 14.127f, 11.902f, 13.995f, 11.847f)
                curveTo(13.88f, 11.8f, 13.848f, 11.652f, 13.936f, 11.565f)
                curveTo(13.99f, 11.51f, 14.057f, 11.512f, 14.127f, 11.526f)
                lineTo(15.88f, 11.876f)
                lineTo(18.293f, 12.359f)
                curveTo(18.715f, 12.443f, 19.144f, 12.248f, 19.358f, 11.874f)
                lineTo(20.653f, 9.608f)
                curveTo(20.861f, 9.243f, 20.819f, 8.787f, 20.548f, 8.466f)
                lineTo(15.5f, 2.5f)
                verticalLineTo(0.287f)
                close()
                moveTo(17.0f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(7.0f, 16.0f)
                curveTo(7.0f, 10.779f, 9.668f, 6.178f, 13.719f, 3.491f)
                lineTo(18.569f, 9.223f)
                lineTo(17.979f, 10.256f)
                lineTo(14.482f, 9.557f)
                curveTo(13.77f, 9.415f, 13.035f, 9.637f, 12.522f, 10.15f)
                curveTo(11.389f, 11.283f, 11.846f, 13.127f, 13.234f, 13.697f)
                curveTo(14.481f, 14.21f, 15.094f, 14.779f, 15.436f, 15.339f)
                curveTo(15.553f, 15.532f, 15.654f, 15.75f, 15.738f, 16.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(14.0f, 8.0f)
                curveTo(14.552f, 8.0f, 15.0f, 7.552f, 15.0f, 7.0f)
                curveTo(15.0f, 6.448f, 14.552f, 6.0f, 14.0f, 6.0f)
                curveTo(13.448f, 6.0f, 13.0f, 6.448f, 13.0f, 7.0f)
                curveTo(13.0f, 7.552f, 13.448f, 8.0f, 14.0f, 8.0f)
                close()
            }
        }
        .build()
        return _chessLine!!
    }

private var _chessLine: ImageVector? = null
