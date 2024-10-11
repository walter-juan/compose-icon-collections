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

public val DevelopmentGroup.Puzzle2Line: ImageVector
    get() {
        if (_puzzle2Line != null) {
            return _puzzle2Line!!
        }
        _puzzle2Line = Builder(name = "Puzzle2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                curveTo(7.0f, 2.791f, 8.791f, 1.0f, 11.0f, 1.0f)
                curveTo(13.209f, 1.0f, 15.0f, 2.791f, 15.0f, 5.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 5.0f, 21.0f, 5.448f, 21.0f, 6.0f)
                verticalLineTo(10.171f)
                curveTo(21.0f, 10.495f, 20.842f, 10.8f, 20.577f, 10.987f)
                curveTo(20.312f, 11.175f, 19.973f, 11.222f, 19.667f, 11.113f)
                curveTo(19.459f, 11.04f, 19.236f, 11.0f, 19.0f, 11.0f)
                curveTo(17.895f, 11.0f, 17.0f, 11.895f, 17.0f, 13.0f)
                curveTo(17.0f, 14.105f, 17.895f, 15.0f, 19.0f, 15.0f)
                curveTo(19.236f, 15.0f, 19.459f, 14.96f, 19.667f, 14.887f)
                curveTo(19.973f, 14.778f, 20.312f, 14.825f, 20.577f, 15.013f)
                curveTo(20.842f, 15.2f, 21.0f, 15.505f, 21.0f, 15.829f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.552f, 20.552f, 21.0f, 20.0f, 21.0f)
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
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                curveTo(16.791f, 17.0f, 15.0f, 15.209f, 15.0f, 13.0f)
                curveTo(15.0f, 10.791f, 16.791f, 9.0f, 19.0f, 9.0f)
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
        return _puzzle2Line!!
    }

private var _puzzle2Line: ImageVector? = null
