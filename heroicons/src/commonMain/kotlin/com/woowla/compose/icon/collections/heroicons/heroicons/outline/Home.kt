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

public val OutlineGroup.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.25f, 12.0f)
                lineTo(11.205f, 3.045f)
                curveTo(11.644f, 2.606f, 12.356f, 2.606f, 12.795f, 3.045f)
                lineTo(21.75f, 12.0f)
                moveTo(4.5f, 9.75f)
                verticalLineTo(19.875f)
                curveTo(4.5f, 20.496f, 5.004f, 21.0f, 5.625f, 21.0f)
                horizontalLineTo(9.75f)
                verticalLineTo(16.125f)
                curveTo(9.75f, 15.504f, 10.254f, 15.0f, 10.875f, 15.0f)
                horizontalLineTo(13.125f)
                curveTo(13.746f, 15.0f, 14.25f, 15.504f, 14.25f, 16.125f)
                verticalLineTo(21.0f)
                horizontalLineTo(18.375f)
                curveTo(18.996f, 21.0f, 19.5f, 20.496f, 19.5f, 19.875f)
                verticalLineTo(9.75f)
                moveTo(8.25f, 21.0f)
                horizontalLineTo(16.5f)
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
