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

public val DevelopmentGroup.PuzzleFill: ImageVector
    get() {
        if (_puzzleFill != null) {
            return _puzzleFill!!
        }
        _puzzleFill = Builder(name = "PuzzleFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                curveTo(8.0f, 2.343f, 9.343f, 1.0f, 11.0f, 1.0f)
                curveTo(12.657f, 1.0f, 14.0f, 2.343f, 14.0f, 4.0f)
                curveTo(14.0f, 4.351f, 13.94f, 4.687f, 13.829f, 5.0f)
                horizontalLineTo(18.0f)
                curveTo(18.552f, 5.0f, 19.0f, 5.448f, 19.0f, 6.0f)
                verticalLineTo(10.171f)
                curveTo(19.313f, 10.06f, 19.649f, 10.0f, 20.0f, 10.0f)
                curveTo(21.657f, 10.0f, 23.0f, 11.343f, 23.0f, 13.0f)
                curveTo(23.0f, 14.657f, 21.657f, 16.0f, 20.0f, 16.0f)
                curveTo(19.649f, 16.0f, 19.313f, 15.94f, 19.0f, 15.829f)
                verticalLineTo(20.0f)
                curveTo(19.0f, 20.552f, 18.552f, 21.0f, 18.0f, 21.0f)
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
        return _puzzleFill!!
    }

private var _puzzleFill: ImageVector? = null
