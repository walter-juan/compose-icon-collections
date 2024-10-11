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

public val DevelopmentGroup.Puzzle2Fill: ImageVector
    get() {
        if (_puzzle2Fill != null) {
            return _puzzle2Fill!!
        }
        _puzzle2Fill = Builder(name = "Puzzle2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                curveTo(8.0f, 2.343f, 9.343f, 1.0f, 11.0f, 1.0f)
                curveTo(12.657f, 1.0f, 14.0f, 2.343f, 14.0f, 4.0f)
                curveTo(14.0f, 4.351f, 13.94f, 4.687f, 13.829f, 5.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 5.0f, 21.0f, 5.448f, 21.0f, 6.0f)
                verticalLineTo(9.126f)
                curveTo(21.0f, 9.435f, 20.857f, 9.727f, 20.613f, 9.916f)
                curveTo(20.368f, 10.106f, 20.05f, 10.172f, 19.751f, 10.094f)
                curveTo(19.512f, 10.033f, 19.26f, 10.0f, 19.0f, 10.0f)
                curveTo(17.343f, 10.0f, 16.0f, 11.343f, 16.0f, 13.0f)
                curveTo(16.0f, 14.657f, 17.343f, 16.0f, 19.0f, 16.0f)
                curveTo(19.26f, 16.0f, 19.512f, 15.967f, 19.751f, 15.906f)
                curveTo(20.05f, 15.828f, 20.368f, 15.894f, 20.613f, 16.084f)
                curveTo(20.857f, 16.273f, 21.0f, 16.565f, 21.0f, 16.874f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.552f, 20.552f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 21.0f, 3.0f, 20.552f, 3.0f, 20.0f)
                verticalLineTo(6.0f)
                curveTo(3.0f, 5.448f, 3.448f, 5.0f, 4.0f, 5.0f)
                horizontalLineTo(8.171f)
                curveTo(8.06f, 4.687f, 8.0f, 4.351f, 8.0f, 4.0f)
                close()
            }
        }
        .build()
        return _puzzle2Fill!!
    }

private var _puzzle2Fill: ImageVector? = null
