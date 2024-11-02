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

public val OutlineGroup.Backspace: ImageVector
    get() {
        if (_backspace != null) {
            return _backspace!!
        }
        _backspace = Builder(name = "Backspace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 9.75f)
                lineTo(14.25f, 12.0f)
                moveTo(14.25f, 12.0f)
                lineTo(16.5f, 14.25f)
                moveTo(14.25f, 12.0f)
                lineTo(16.5f, 9.75f)
                moveTo(14.25f, 12.0f)
                lineTo(12.0f, 14.25f)
                moveTo(9.421f, 19.17f)
                lineTo(3.046f, 12.795f)
                curveTo(2.606f, 12.356f, 2.606f, 11.644f, 3.046f, 11.205f)
                lineTo(9.421f, 4.83f)
                curveTo(9.631f, 4.619f, 9.918f, 4.5f, 10.216f, 4.5f)
                lineTo(19.5f, 4.5f)
                curveTo(20.743f, 4.5f, 21.75f, 5.507f, 21.75f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(21.75f, 18.493f, 20.743f, 19.5f, 19.5f, 19.5f)
                horizontalLineTo(10.216f)
                curveTo(9.918f, 19.5f, 9.631f, 19.382f, 9.421f, 19.17f)
                close()
            }
        }
        .build()
        return _backspace!!
    }

private var _backspace: ImageVector? = null
