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

public val OutlineGroup.Calculator: ImageVector
    get() {
        if (_calculator != null) {
            return _calculator!!
        }
        _calculator = Builder(name = "Calculator", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.75f, 15.75f)
                verticalLineTo(18.0f)
                moveTo(8.25f, 11.25f)
                horizontalLineTo(8.257f)
                verticalLineTo(11.257f)
                horizontalLineTo(8.25f)
                verticalLineTo(11.25f)
                close()
                moveTo(8.25f, 13.5f)
                horizontalLineTo(8.257f)
                verticalLineTo(13.507f)
                horizontalLineTo(8.25f)
                verticalLineTo(13.5f)
                close()
                moveTo(8.25f, 15.75f)
                horizontalLineTo(8.257f)
                verticalLineTo(15.757f)
                horizontalLineTo(8.25f)
                verticalLineTo(15.75f)
                close()
                moveTo(8.25f, 18.0f)
                horizontalLineTo(8.257f)
                verticalLineTo(18.007f)
                horizontalLineTo(8.25f)
                verticalLineTo(18.0f)
                close()
                moveTo(10.748f, 11.25f)
                horizontalLineTo(10.755f)
                verticalLineTo(11.257f)
                horizontalLineTo(10.748f)
                verticalLineTo(11.25f)
                close()
                moveTo(10.748f, 13.5f)
                horizontalLineTo(10.755f)
                verticalLineTo(13.507f)
                horizontalLineTo(10.748f)
                verticalLineTo(13.5f)
                close()
                moveTo(10.748f, 15.75f)
                horizontalLineTo(10.755f)
                verticalLineTo(15.757f)
                horizontalLineTo(10.748f)
                verticalLineTo(15.75f)
                close()
                moveTo(10.748f, 18.0f)
                horizontalLineTo(10.755f)
                verticalLineTo(18.007f)
                horizontalLineTo(10.748f)
                verticalLineTo(18.0f)
                close()
                moveTo(13.252f, 11.25f)
                horizontalLineTo(13.26f)
                verticalLineTo(11.257f)
                horizontalLineTo(13.252f)
                verticalLineTo(11.25f)
                close()
                moveTo(13.252f, 13.5f)
                horizontalLineTo(13.26f)
                verticalLineTo(13.507f)
                horizontalLineTo(13.252f)
                verticalLineTo(13.5f)
                close()
                moveTo(13.252f, 15.75f)
                horizontalLineTo(13.26f)
                verticalLineTo(15.757f)
                horizontalLineTo(13.252f)
                verticalLineTo(15.75f)
                close()
                moveTo(13.252f, 18.0f)
                horizontalLineTo(13.26f)
                verticalLineTo(18.007f)
                horizontalLineTo(13.252f)
                verticalLineTo(18.0f)
                close()
                moveTo(15.75f, 11.25f)
                horizontalLineTo(15.757f)
                verticalLineTo(11.257f)
                horizontalLineTo(15.75f)
                verticalLineTo(11.25f)
                close()
                moveTo(15.75f, 13.5f)
                horizontalLineTo(15.757f)
                verticalLineTo(13.507f)
                horizontalLineTo(15.75f)
                verticalLineTo(13.5f)
                close()
                moveTo(8.25f, 6.0f)
                horizontalLineTo(15.75f)
                verticalLineTo(8.25f)
                horizontalLineTo(8.25f)
                verticalLineTo(6.0f)
                close()
                moveTo(12.0f, 2.25f)
                curveTo(10.108f, 2.25f, 8.242f, 2.359f, 6.407f, 2.572f)
                curveTo(5.306f, 2.7f, 4.5f, 3.649f, 4.5f, 4.757f)
                verticalLineTo(19.5f)
                curveTo(4.5f, 20.743f, 5.507f, 21.75f, 6.75f, 21.75f)
                horizontalLineTo(17.25f)
                curveTo(18.493f, 21.75f, 19.5f, 20.743f, 19.5f, 19.5f)
                verticalLineTo(4.757f)
                curveTo(19.5f, 3.649f, 18.694f, 2.7f, 17.593f, 2.572f)
                curveTo(15.758f, 2.359f, 13.892f, 2.25f, 12.0f, 2.25f)
                close()
            }
        }
        .build()
        return _calculator!!
    }

private var _calculator: ImageVector? = null
