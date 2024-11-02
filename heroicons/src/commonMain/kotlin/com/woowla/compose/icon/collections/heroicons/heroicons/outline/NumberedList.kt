package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.NumberedList: ImageVector
    get() {
        if (_numberedList != null) {
            return _numberedList!!
        }
        _numberedList = Builder(name = "NumberedList", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.242f, 5.992f)
                horizontalLineTo(20.242f)
                moveTo(8.241f, 11.995f)
                horizontalLineTo(20.241f)
                moveTo(8.242f, 17.994f)
                horizontalLineTo(20.242f)
                moveTo(4.116f, 7.495f)
                verticalLineTo(3.745f)
                horizontalLineTo(2.991f)
                moveTo(4.116f, 7.495f)
                horizontalLineTo(2.991f)
                moveTo(4.116f, 7.495f)
                horizontalLineTo(5.241f)
                moveTo(3.321f, 10.071f)
                curveTo(3.761f, 9.632f, 4.473f, 9.632f, 4.912f, 10.071f)
                curveTo(5.352f, 10.511f, 5.352f, 11.223f, 4.912f, 11.663f)
                lineTo(3.083f, 13.492f)
                lineTo(5.242f, 13.493f)
                moveTo(2.991f, 15.745f)
                horizontalLineTo(4.116f)
                curveTo(4.737f, 15.745f, 5.241f, 16.248f, 5.241f, 16.87f)
                curveTo(5.241f, 17.491f, 4.737f, 17.995f, 4.116f, 17.995f)
                horizontalLineTo(3.741f)
                moveTo(3.741f, 17.993f)
                horizontalLineTo(4.116f)
                curveTo(4.737f, 17.993f, 5.241f, 18.497f, 5.241f, 19.118f)
                curveTo(5.241f, 19.739f, 4.737f, 20.243f, 4.116f, 20.243f)
                horizontalLineTo(2.991f)
            }
        }
        .build()
        return _numberedList!!
    }

private var _numberedList: ImageVector? = null
