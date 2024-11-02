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

public val OutlineGroup.ArrowDownTray: ImageVector
    get() {
        if (_arrowDownTray != null) {
            return _arrowDownTray!!
        }
        _arrowDownTray = Builder(name = "ArrowDownTray", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 16.5f)
                verticalLineTo(18.75f)
                curveTo(3.0f, 19.993f, 4.007f, 21.0f, 5.25f, 21.0f)
                horizontalLineTo(18.75f)
                curveTo(19.993f, 21.0f, 21.0f, 19.993f, 21.0f, 18.75f)
                verticalLineTo(16.5f)
                moveTo(16.5f, 12.0f)
                lineTo(12.0f, 16.5f)
                moveTo(12.0f, 16.5f)
                lineTo(7.5f, 12.0f)
                moveTo(12.0f, 16.5f)
                verticalLineTo(3.0f)
            }
        }
        .build()
        return _arrowDownTray!!
    }

private var _arrowDownTray: ImageVector? = null
