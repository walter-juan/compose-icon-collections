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

public val OutlineGroup.BuildingOffice2: ImageVector
    get() {
        if (_buildingOffice2 != null) {
            return _buildingOffice2!!
        }
        _buildingOffice2 = Builder(name = "BuildingOffice2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.25f, 21.0f)
                horizontalLineTo(21.75f)
                moveTo(3.75f, 3.0f)
                verticalLineTo(21.0f)
                moveTo(14.25f, 3.0f)
                verticalLineTo(21.0f)
                moveTo(20.25f, 7.5f)
                verticalLineTo(21.0f)
                moveTo(6.75f, 6.75f)
                horizontalLineTo(7.5f)
                moveTo(6.75f, 9.75f)
                horizontalLineTo(7.5f)
                moveTo(6.75f, 12.75f)
                horizontalLineTo(7.5f)
                moveTo(10.5f, 6.75f)
                horizontalLineTo(11.25f)
                moveTo(10.5f, 9.75f)
                horizontalLineTo(11.25f)
                moveTo(10.5f, 12.75f)
                horizontalLineTo(11.25f)
                moveTo(6.75f, 21.0f)
                verticalLineTo(17.625f)
                curveTo(6.75f, 17.004f, 7.254f, 16.5f, 7.875f, 16.5f)
                horizontalLineTo(10.125f)
                curveTo(10.746f, 16.5f, 11.25f, 17.004f, 11.25f, 17.625f)
                verticalLineTo(21.0f)
                moveTo(3.0f, 3.0f)
                horizontalLineTo(15.0f)
                moveTo(14.25f, 7.5f)
                horizontalLineTo(21.0f)
                moveTo(17.25f, 11.25f)
                horizontalLineTo(17.257f)
                verticalLineTo(11.257f)
                horizontalLineTo(17.25f)
                verticalLineTo(11.25f)
                close()
                moveTo(17.25f, 14.25f)
                horizontalLineTo(17.257f)
                verticalLineTo(14.257f)
                horizontalLineTo(17.25f)
                verticalLineTo(14.25f)
                close()
                moveTo(17.25f, 17.25f)
                horizontalLineTo(17.257f)
                verticalLineTo(17.257f)
                horizontalLineTo(17.25f)
                verticalLineTo(17.25f)
                close()
            }
        }
        .build()
        return _buildingOffice2!!
    }

private var _buildingOffice2: ImageVector? = null
