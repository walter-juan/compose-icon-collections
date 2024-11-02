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

public val OutlineGroup.ArrowUturnLeft: ImageVector
    get() {
        if (_arrowUturnLeft != null) {
            return _arrowUturnLeft!!
        }
        _arrowUturnLeft = Builder(name = "ArrowUturnLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 15.0f)
                lineTo(3.0f, 9.0f)
                moveTo(3.0f, 9.0f)
                lineTo(9.0f, 3.0f)
                moveTo(3.0f, 9.0f)
                horizontalLineTo(15.0f)
                curveTo(18.314f, 9.0f, 21.0f, 11.686f, 21.0f, 15.0f)
                curveTo(21.0f, 18.314f, 18.314f, 21.0f, 15.0f, 21.0f)
                horizontalLineTo(12.0f)
            }
        }
        .build()
        return _arrowUturnLeft!!
    }

private var _arrowUturnLeft: ImageVector? = null
