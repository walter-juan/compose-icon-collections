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

public val OutlineGroup.ViewColumns: ImageVector
    get() {
        if (_viewColumns != null) {
            return _viewColumns!!
        }
        _viewColumns = Builder(name = "ViewColumns", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 4.5f)
                verticalLineTo(19.5f)
                moveTo(15.0f, 4.5f)
                verticalLineTo(19.5f)
                moveTo(4.125f, 19.5f)
                horizontalLineTo(19.875f)
                curveTo(20.496f, 19.5f, 21.0f, 18.996f, 21.0f, 18.375f)
                verticalLineTo(5.625f)
                curveTo(21.0f, 5.004f, 20.496f, 4.5f, 19.875f, 4.5f)
                horizontalLineTo(4.125f)
                curveTo(3.504f, 4.5f, 3.0f, 5.004f, 3.0f, 5.625f)
                verticalLineTo(18.375f)
                curveTo(3.0f, 18.996f, 3.504f, 19.5f, 4.125f, 19.5f)
                close()
            }
        }
        .build()
        return _viewColumns!!
    }

private var _viewColumns: ImageVector? = null
