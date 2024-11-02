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

public val OutlineGroup.ArrowRightOnRectangle: ImageVector
    get() {
        if (_arrowRightOnRectangle != null) {
            return _arrowRightOnRectangle!!
        }
        _arrowRightOnRectangle = Builder(name = "ArrowRightOnRectangle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.75f, 9.0f)
                verticalLineTo(5.25f)
                curveTo(15.75f, 4.007f, 14.743f, 3.0f, 13.5f, 3.0f)
                lineTo(7.5f, 3.0f)
                curveTo(6.257f, 3.0f, 5.25f, 4.007f, 5.25f, 5.25f)
                lineTo(5.25f, 18.75f)
                curveTo(5.25f, 19.993f, 6.257f, 21.0f, 7.5f, 21.0f)
                horizontalLineTo(13.5f)
                curveTo(14.743f, 21.0f, 15.75f, 19.993f, 15.75f, 18.75f)
                verticalLineTo(15.0f)
                moveTo(18.75f, 15.0f)
                lineTo(21.75f, 12.0f)
                moveTo(21.75f, 12.0f)
                lineTo(18.75f, 9.0f)
                moveTo(21.75f, 12.0f)
                lineTo(9.0f, 12.0f)
            }
        }
        .build()
        return _arrowRightOnRectangle!!
    }

private var _arrowRightOnRectangle: ImageVector? = null
