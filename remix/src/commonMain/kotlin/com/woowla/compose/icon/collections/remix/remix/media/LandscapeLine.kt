package com.woowla.compose.icon.collections.remix.remix.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MediaGroup

public val MediaGroup.LandscapeLine: ImageVector
    get() {
        if (_landscapeLine != null) {
            return _landscapeLine!!
        }
        _landscapeLine = Builder(name = "LandscapeLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.27f, 12.216f)
                lineTo(15.0f, 6.0f)
                lineTo(23.0f, 21.0f)
                horizontalLineTo(2.0f)
                lineTo(9.0f, 8.0f)
                lineTo(11.27f, 12.216f)
                close()
                moveTo(12.39f, 14.238f)
                lineTo(14.987f, 19.0f)
                horizontalLineTo(19.667f)
                lineTo(14.898f, 10.058f)
                lineTo(12.39f, 14.238f)
                close()
                moveTo(5.348f, 19.0f)
                horizontalLineTo(12.652f)
                lineTo(9.0f, 12.219f)
                lineTo(5.348f, 19.0f)
                close()
                moveTo(5.5f, 8.0f)
                curveTo(4.119f, 8.0f, 3.0f, 6.881f, 3.0f, 5.5f)
                curveTo(3.0f, 4.119f, 4.119f, 3.0f, 5.5f, 3.0f)
                curveTo(6.881f, 3.0f, 8.0f, 4.119f, 8.0f, 5.5f)
                curveTo(8.0f, 6.881f, 6.881f, 8.0f, 5.5f, 8.0f)
                close()
            }
        }
        .build()
        return _landscapeLine!!
    }

private var _landscapeLine: ImageVector? = null
