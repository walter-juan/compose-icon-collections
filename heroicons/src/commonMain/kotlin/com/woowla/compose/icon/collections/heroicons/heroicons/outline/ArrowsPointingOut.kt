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

public val OutlineGroup.ArrowsPointingOut: ImageVector
    get() {
        if (_arrowsPointingOut != null) {
            return _arrowsPointingOut!!
        }
        _arrowsPointingOut = Builder(name = "ArrowsPointingOut", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.75f, 3.75f)
                verticalLineTo(8.25f)
                moveTo(3.75f, 3.75f)
                horizontalLineTo(8.25f)
                moveTo(3.75f, 3.75f)
                lineTo(9.0f, 9.0f)
                moveTo(3.75f, 20.25f)
                verticalLineTo(15.75f)
                moveTo(3.75f, 20.25f)
                horizontalLineTo(8.25f)
                moveTo(3.75f, 20.25f)
                lineTo(9.0f, 15.0f)
                moveTo(20.25f, 3.75f)
                lineTo(15.75f, 3.75f)
                moveTo(20.25f, 3.75f)
                verticalLineTo(8.25f)
                moveTo(20.25f, 3.75f)
                lineTo(15.0f, 9.0f)
                moveTo(20.25f, 20.25f)
                horizontalLineTo(15.75f)
                moveTo(20.25f, 20.25f)
                verticalLineTo(15.75f)
                moveTo(20.25f, 20.25f)
                lineTo(15.0f, 15.0f)
            }
        }
        .build()
        return _arrowsPointingOut!!
    }

private var _arrowsPointingOut: ImageVector? = null
