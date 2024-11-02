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

public val OutlineGroup.Calendar: ImageVector
    get() {
        if (_calendar != null) {
            return _calendar!!
        }
        _calendar = Builder(name = "Calendar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.75f, 3.0f)
                verticalLineTo(5.25f)
                moveTo(17.25f, 3.0f)
                verticalLineTo(5.25f)
                moveTo(3.0f, 18.75f)
                verticalLineTo(7.5f)
                curveTo(3.0f, 6.257f, 4.007f, 5.25f, 5.25f, 5.25f)
                horizontalLineTo(18.75f)
                curveTo(19.993f, 5.25f, 21.0f, 6.257f, 21.0f, 7.5f)
                verticalLineTo(18.75f)
                moveTo(3.0f, 18.75f)
                curveTo(3.0f, 19.993f, 4.007f, 21.0f, 5.25f, 21.0f)
                horizontalLineTo(18.75f)
                curveTo(19.993f, 21.0f, 21.0f, 19.993f, 21.0f, 18.75f)
                moveTo(3.0f, 18.75f)
                verticalLineTo(11.25f)
                curveTo(3.0f, 10.007f, 4.007f, 9.0f, 5.25f, 9.0f)
                horizontalLineTo(18.75f)
                curveTo(19.993f, 9.0f, 21.0f, 10.007f, 21.0f, 11.25f)
                verticalLineTo(18.75f)
            }
        }
        .build()
        return _calendar!!
    }

private var _calendar: ImageVector? = null
