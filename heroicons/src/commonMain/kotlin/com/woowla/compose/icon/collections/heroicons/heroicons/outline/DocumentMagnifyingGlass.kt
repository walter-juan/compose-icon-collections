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

public val OutlineGroup.DocumentMagnifyingGlass: ImageVector
    get() {
        if (_documentMagnifyingGlass != null) {
            return _documentMagnifyingGlass!!
        }
        _documentMagnifyingGlass = Builder(name = "DocumentMagnifyingGlass", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5f, 14.25f)
                verticalLineTo(11.625f)
                curveTo(19.5f, 9.761f, 17.989f, 8.25f, 16.125f, 8.25f)
                horizontalLineTo(14.625f)
                curveTo(14.004f, 8.25f, 13.5f, 7.746f, 13.5f, 7.125f)
                verticalLineTo(5.625f)
                curveTo(13.5f, 3.761f, 11.989f, 2.25f, 10.125f, 2.25f)
                horizontalLineTo(8.25f)
                moveTo(13.481f, 15.731f)
                lineTo(15.0f, 17.25f)
                moveTo(10.5f, 2.25f)
                horizontalLineTo(5.625f)
                curveTo(5.004f, 2.25f, 4.5f, 2.754f, 4.5f, 3.375f)
                verticalLineTo(19.875f)
                curveTo(4.5f, 20.496f, 5.004f, 21.0f, 5.625f, 21.0f)
                horizontalLineTo(18.375f)
                curveTo(18.996f, 21.0f, 19.5f, 20.496f, 19.5f, 19.875f)
                verticalLineTo(11.25f)
                curveTo(19.5f, 6.279f, 15.471f, 2.25f, 10.5f, 2.25f)
                close()
                moveTo(14.25f, 13.875f)
                curveTo(14.25f, 15.325f, 13.075f, 16.5f, 11.625f, 16.5f)
                curveTo(10.175f, 16.5f, 9.0f, 15.325f, 9.0f, 13.875f)
                curveTo(9.0f, 12.425f, 10.175f, 11.25f, 11.625f, 11.25f)
                curveTo(13.075f, 11.25f, 14.25f, 12.425f, 14.25f, 13.875f)
                close()
            }
        }
        .build()
        return _documentMagnifyingGlass!!
    }

private var _documentMagnifyingGlass: ImageVector? = null
