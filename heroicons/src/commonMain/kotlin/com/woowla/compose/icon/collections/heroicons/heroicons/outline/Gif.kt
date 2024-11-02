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

public val OutlineGroup.Gif: ImageVector
    get() {
        if (_gif != null) {
            return _gif!!
        }
        _gif = Builder(name = "Gif", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.75f, 8.25f)
                verticalLineTo(15.75f)
                moveTo(18.75f, 8.25f)
                horizontalLineTo(15.75f)
                verticalLineTo(12.0f)
                moveTo(15.75f, 12.0f)
                verticalLineTo(15.75f)
                moveTo(15.75f, 12.0f)
                horizontalLineTo(18.0f)
                moveTo(9.75f, 9.348f)
                curveTo(8.721f, 7.884f, 7.052f, 7.884f, 6.022f, 9.348f)
                curveTo(4.993f, 10.813f, 4.993f, 13.187f, 6.022f, 14.652f)
                curveTo(7.052f, 16.116f, 8.721f, 16.116f, 9.75f, 14.652f)
                verticalLineTo(12.0f)
                horizontalLineTo(8.25f)
                moveTo(4.5f, 19.5f)
                horizontalLineTo(19.5f)
                curveTo(20.743f, 19.5f, 21.75f, 18.493f, 21.75f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(21.75f, 5.507f, 20.743f, 4.5f, 19.5f, 4.5f)
                horizontalLineTo(4.5f)
                curveTo(3.257f, 4.5f, 2.25f, 5.507f, 2.25f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(2.25f, 18.493f, 3.257f, 19.5f, 4.5f, 19.5f)
                close()
            }
        }
        .build()
        return _gif!!
    }

private var _gif: ImageVector? = null
