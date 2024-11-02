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

public val OutlineGroup.BuildingLibrary: ImageVector
    get() {
        if (_buildingLibrary != null) {
            return _buildingLibrary!!
        }
        _buildingLibrary = Builder(name = "BuildingLibrary", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 21.0f)
                verticalLineTo(12.75f)
                moveTo(15.75f, 21.0f)
                verticalLineTo(12.75f)
                moveTo(8.25f, 21.0f)
                verticalLineTo(12.75f)
                moveTo(3.0f, 9.0f)
                lineTo(12.0f, 3.0f)
                lineTo(21.0f, 9.0f)
                moveTo(19.5f, 21.0f)
                verticalLineTo(10.333f)
                curveTo(17.056f, 9.949f, 14.551f, 9.75f, 12.0f, 9.75f)
                curveTo(9.449f, 9.75f, 6.944f, 9.949f, 4.5f, 10.333f)
                verticalLineTo(21.0f)
                moveTo(3.0f, 21.0f)
                horizontalLineTo(21.0f)
                moveTo(12.0f, 6.75f)
                horizontalLineTo(12.007f)
                verticalLineTo(6.758f)
                horizontalLineTo(12.0f)
                verticalLineTo(6.75f)
                close()
            }
        }
        .build()
        return _buildingLibrary!!
    }

private var _buildingLibrary: ImageVector? = null
