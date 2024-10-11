package com.woowla.compose.icon.collections.remix.remix.development

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DevelopmentGroup

public val DevelopmentGroup.PuzzleLine: ImageVector
    get() {
        if (_puzzleLine != null) {
            return _puzzleLine!!
        }
        _puzzleLine = Builder(name = "PuzzleLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                curveTo(7.0f, 2.791f, 8.791f, 1.0f, 11.0f, 1.0f)
                curveTo(13.209f, 1.0f, 15.0f, 2.791f, 15.0f, 5.0f)
                horizontalLineTo(18.0f)
                curveTo(18.552f, 5.0f, 19.0f, 5.448f, 19.0f, 6.0f)
                verticalLineTo(9.0f)
                curveTo(21.209f, 9.0f, 23.0f, 10.791f, 23.0f, 13.0f)
                curveTo(23.0f, 15.209f, 21.209f, 17.0f, 19.0f, 17.0f)
                verticalLineTo(20.0f)
                curveTo(19.0f, 20.552f, 18.552f, 21.0f, 18.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 21.0f, 3.0f, 20.552f, 3.0f, 20.0f)
                verticalLineTo(6.0f)
                curveTo(3.0f, 5.448f, 3.448f, 5.0f, 4.0f, 5.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(11.0f, 3.0f)
                curveTo(9.895f, 3.0f, 9.0f, 3.895f, 9.0f, 5.0f)
                curveTo(9.0f, 5.236f, 9.04f, 5.46f, 9.114f, 5.667f)
                curveTo(9.222f, 5.973f, 9.175f, 6.312f, 8.987f, 6.577f)
                curveTo(8.8f, 6.842f, 8.495f, 7.0f, 8.171f, 7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.829f)
                curveTo(17.0f, 15.505f, 17.158f, 15.2f, 17.423f, 15.013f)
                curveTo(17.688f, 14.825f, 18.027f, 14.778f, 18.333f, 14.887f)
                curveTo(18.541f, 14.96f, 18.764f, 15.0f, 19.0f, 15.0f)
                curveTo(20.105f, 15.0f, 21.0f, 14.105f, 21.0f, 13.0f)
                curveTo(21.0f, 11.895f, 20.105f, 11.0f, 19.0f, 11.0f)
                curveTo(18.764f, 11.0f, 18.541f, 11.04f, 18.333f, 11.113f)
                curveTo(18.027f, 11.222f, 17.688f, 11.175f, 17.423f, 10.987f)
                curveTo(17.158f, 10.8f, 17.0f, 10.495f, 17.0f, 10.171f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.829f)
                curveTo(13.505f, 7.0f, 13.2f, 6.842f, 13.013f, 6.577f)
                curveTo(12.825f, 6.312f, 12.778f, 5.973f, 12.887f, 5.667f)
                curveTo(12.96f, 5.46f, 13.0f, 5.236f, 13.0f, 5.0f)
                curveTo(13.0f, 3.895f, 12.105f, 3.0f, 11.0f, 3.0f)
                close()
            }
        }
        .build()
        return _puzzleLine!!
    }

private var _puzzleLine: ImageVector? = null
