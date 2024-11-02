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

public val OutlineGroup.ArrowLeftStartOnRectangle: ImageVector
    get() {
        if (_arrowLeftStartOnRectangle != null) {
            return _arrowLeftStartOnRectangle!!
        }
        _arrowLeftStartOnRectangle = Builder(name = "ArrowLeftStartOnRectangle", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.25f, 9.0f)
                verticalLineTo(5.25f)
                curveTo(8.25f, 4.007f, 9.257f, 3.0f, 10.5f, 3.0f)
                horizontalLineTo(16.5f)
                curveTo(17.743f, 3.0f, 18.75f, 4.007f, 18.75f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(18.75f, 19.993f, 17.743f, 21.0f, 16.5f, 21.0f)
                horizontalLineTo(10.5f)
                curveTo(9.257f, 21.0f, 8.25f, 19.993f, 8.25f, 18.75f)
                verticalLineTo(15.0f)
                moveTo(5.25f, 15.0f)
                lineTo(2.25f, 12.0f)
                moveTo(2.25f, 12.0f)
                lineTo(5.25f, 9.0f)
                moveTo(2.25f, 12.0f)
                lineTo(15.0f, 12.0f)
            }
        }
        .build()
        return _arrowLeftStartOnRectangle!!
    }

private var _arrowLeftStartOnRectangle: ImageVector? = null
