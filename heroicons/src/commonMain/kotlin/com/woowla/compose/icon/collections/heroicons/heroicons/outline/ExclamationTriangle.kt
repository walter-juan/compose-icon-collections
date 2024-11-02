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

public val OutlineGroup.ExclamationTriangle: ImageVector
    get() {
        if (_exclamationTriangle != null) {
            return _exclamationTriangle!!
        }
        _exclamationTriangle = Builder(name = "ExclamationTriangle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                verticalLineTo(12.75f)
                moveTo(2.697f, 16.126f)
                curveTo(1.831f, 17.626f, 2.914f, 19.5f, 4.645f, 19.5f)
                horizontalLineTo(19.354f)
                curveTo(21.086f, 19.5f, 22.168f, 17.626f, 21.303f, 16.126f)
                lineTo(13.949f, 3.378f)
                curveTo(13.083f, 1.877f, 10.917f, 1.877f, 10.051f, 3.378f)
                lineTo(2.697f, 16.126f)
                close()
                moveTo(12.0f, 15.75f)
                horizontalLineTo(12.007f)
                verticalLineTo(15.758f)
                horizontalLineTo(12.0f)
                verticalLineTo(15.75f)
                close()
            }
        }
        .build()
        return _exclamationTriangle!!
    }

private var _exclamationTriangle: ImageVector? = null
